package com.credits.client.node.service;

import com.credits.client.node.exception.NodeClientException;
import com.credits.client.node.pojo.WalletData;
import com.credits.client.node.pojo.*;
import com.credits.client.node.thrift.generated.*;
import com.credits.client.node.util.NodePojoConverter;
import com.credits.general.pojo.ByteCodeObjectData;
import com.credits.general.thrift.generated.Amount;
import com.credits.general.util.Callback;
import com.credits.general.util.Function;
import com.credits.general.util.GeneralConverter;
import com.credits.general.util.exception.ConverterException;
import com.credits.general.util.variant.VariantConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

import static com.credits.client.node.pojo.SmartContractInvocationData.SMART_CONTRACT_INVOCATION_VERSION;
import static com.credits.client.node.util.NodeClientUtils.*;
import static com.credits.client.node.util.NodePojoConverter.*;
import static com.credits.client.node.util.SignUtils.signTransaction;
import static com.credits.general.util.Callback.handleCallback;
import static com.credits.general.util.GeneralConverter.*;
import static com.credits.general.util.Utils.calculateActualFee;
import static com.credits.general.util.Utils.threadPool;
import static java.math.BigDecimal.ZERO;
import static java.util.stream.Collectors.toList;

public class NodeApiServiceImpl implements NodeApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeApiServiceImpl.class);
    private static AtomicReference<NodeApiServiceImpl> instance = new AtomicReference<>();
    public final NodeThriftApiClient nodeClient;

    private NodeApiServiceImpl(String host, int port) {
        nodeClient = NodeThriftApiClient.getInstance(host, port);
    }

    public static NodeApiServiceImpl getInstance(String host, int port) {
        NodeApiServiceImpl localInstance = NodeApiServiceImpl.instance.get();
        if (localInstance == null) {
            synchronized (NodeApiServiceImpl.class) {
                localInstance = NodeApiServiceImpl.instance.get();
                if (localInstance == null) {
                    localInstance = new NodeApiServiceImpl(host, port);
                    NodeApiServiceImpl.instance.set(localInstance);
                }
            }
        }
        return localInstance;
    }

    @Override
    public BigDecimal getBalance(String address) throws NodeClientException, ConverterException {
        LOGGER.info(String.format("WalletBalanceGet(%s) ---> ", address));
        WalletBalanceGetResult result = nodeClient.getBalance(decodeFromBASE58(address));
        processApiResponse(result.getStatus());
        Amount amount = result.getBalance();
        BigDecimal balance = amountToBigDecimal(amount);
        LOGGER.info(String.format("WalletBalanceGet: <--- balance = %s", balance));
        return balance;
    }

    @Override
    public SyncStateInfoData getSyncStateInfo() throws NodeClientException, ConverterException {
        LOGGER.info("SyncStateGet ---> ");
        SyncStateResult result = nodeClient.getSync();
        processApiResponse(result.getStatus());
        final var currentBlock = result.getCurrRound();
        final var lastBlock = result.getLastBlock();
        final var syncStateInfoData = new SyncStateInfoData(currentBlock, lastBlock);
        LOGGER.debug("SyncStateGet: <-- {}", syncStateInfoData);
        return syncStateInfoData;
    }

    @Override
    public TransactionListByAddressData getTransactionList(String address, long offset, long limit)
    throws NodeClientException, ConverterException {
        LOGGER.info("getTransactionsAndAmount: ---> address = {}, offset = {}, limit = {}", address, offset, limit);
        final var result = nodeClient.getTransactions(decodeFromBASE58(address), offset, limit);
        processApiResponse(result.getStatus());
        final var amountTransactions = result.total_trxns_count;
        final var transactionDataList = new ArrayList<TransactionData>();
        for (SealedTransaction sealedTransaction : result.getTransactions()) {
            transactionDataList.add(createTransactionData(sealedTransaction));
        }
        LOGGER.info("getTransactionsAndAmount: <--- address = {}, receivedTransactionsCount = {} amountTotalTransactions = {}",
                    address,
                    transactionDataList.size(), amountTransactions);
        return new TransactionListByAddressData(amountTransactions, transactionDataList);
    }


    @Override
    public TransactionData getTransaction(TransactionIdData transactionIdData) throws NodeClientException {
        LOGGER.info(String.format("getTransaction: ---> transIndex = %s", transactionIdData.getIndex()));
        TransactionGetResult result = nodeClient.getTransaction(transactionIdData);
        processApiResponse(result.getStatus());
        LOGGER.info(String.format("getTransaction: <--- transIndex = %s", transactionIdData.getIndex()));
        return createTransactionData(result.getTransaction());
    }

    @Override
    public PoolData getPoolInfo(long poolSequence, long index) throws NodeClientException {
        LOGGER.info(String.format("getPoolInfo: ---> index = %d", index));

        PoolInfoGetResult result = nodeClient.getPoolInfo(poolSequence, index);
        processApiResponse(result.getStatus());

        if (!result.isIsFound()) {
            throw new NodeClientException(
                    String.format("Pool by sequence %s and index %s is not found", poolSequence, index));
        }
        PoolData poolData = poolToPoolData(result.getPool());
        LOGGER.info(String.format("getPoolInfo: <--- index = %d", index));
        return poolData;
    }

    @Override
    public List<PoolData> getPoolList(Long offset, Long limit) throws NodeClientException {
        LOGGER.info(String.format("getPoolList: ---> offset = %d,limit=%d", offset, limit));
        PoolListGetResult result = nodeClient.getPoolList(offset, limit);
        processApiResponse(result.getStatus());
        List<PoolData> poolDataList = new ArrayList<>();
        for (Pool pool : result.getPools()) {
            poolDataList.add(poolToPoolData(pool));
        }
        LOGGER.info(String.format("getPoolList: <--- poolListSize = %d", poolDataList.size()));
        return poolDataList;
    }

    @Override
    public TransactionFlowResultData submitDeployTransaction(long innerId,
                                                             String initiator,
                                                             String contractAddress,
                                                             String sourceCode,
                                                             List<ByteCodeObjectData> byteCodeObjects,
                                                             int tokenStandardId,
                                                             float fee,
                                                             List<String> usedContracts,
                                                             PrivateKey privateKey) {
        final var decodedSender = decodeFromBASE58(initiator);
        final var decodedReceiver = decodeFromBASE58(contractAddress);
        final var decodedUsedContracts = toByteBufferUsedContracts(usedContracts);
        final var shortFee = calculateActualFee((double) fee).getRight();
        final var deployData = new SmartContractDeployData(sourceCode, byteCodeObjects, tokenStandardId);
        final var smartContractDeploy = toSmartContractInvocation(deployData, usedContracts);
        final var serializedContract = serializeThriftStructure(smartContractDeploy);
        final var transactionData = new TransactionFlowData(innerId,
                                                            decodedSender,
                                                            decodedReceiver,
                                                            ZERO,
                                                            shortFee,
                                                            serializedContract,
                                                            decodedUsedContracts); //todo decodedContracts created twice
        signTransaction(transactionData, privateKey);

        final var transaction = toTransaction(transactionData, smartContractDeploy);
        return callTransactionFlow(transaction);
    }

    @Override
    public TransactionFlowResultData submitInvokeTransaction(long innerId,
                                                             String initiator,
                                                             String contractAddress,
                                                             String method,
                                                             List<?> params,
                                                             float fee,
                                                             List<String> usedContracts,
                                                             PrivateKey privateKey) {
        final var decodedSender = decodeFromBASE58(initiator);
        final var decodedReceiver = decodeFromBASE58(contractAddress);
        final var decodedUsedContracts = toByteBufferUsedContracts(usedContracts);
        final var shortFee = calculateActualFee((double) fee).getRight();
        final var variantParams = params.stream().map(VariantConverter::toVariant).collect(toList());
        final var contractInvocationData = new SmartContractInvocationData(method, variantParams, usedContracts, false);
        final var contractInvocation = toSmartContractInvocation(contractInvocationData);
        final var serializedContract = serializeByThrift(contractInvocation);
        final var transactionData = new TransactionFlowData(innerId,
                                                            decodedSender,
                                                            decodedReceiver,
                                                            ZERO,
                                                            shortFee,
                                                            serializedContract,
                                                            decodedUsedContracts);
        signTransaction(transactionData, privateKey);

        final var transaction = toTransaction(transactionData, contractInvocation);
        return callTransactionFlow(transaction);
    }


    @Override
    public TransactionFlowResultData invokeContractGetterMethod(String initiator,
                                                                String contractAddress,
                                                                String method,
                                                                List<?> params,
                                                                List<String> usedContracts) throws NodeClientException {
        final var decodedSender = decodeFromBASE58(initiator);
        final var decodedReceiver = decodeFromBASE58(contractAddress);
        final var decodedUsedContracts = toByteBufferUsedContracts(usedContracts);
        final var variantParams = params.stream().map(VariantConverter::toVariant).collect(toList());
        final var contract = new SmartContractInvocation(method, variantParams, decodedUsedContracts, true, SMART_CONTRACT_INVOCATION_VERSION);
        final var serializedContract = serializeThriftStructure(contract);
        final var transactionData = new TransactionFlowData(0,
                                                            decodedSender,
                                                            decodedReceiver,
                                                            ZERO,
                                                            (short) 17510, //0.01
                                                            serializedContract,
                                                            decodedUsedContracts);
        final var transaction = toTransaction(transactionData, contract);
        return callTransactionFlow(transaction);
    }

    @Override
    public TransactionFlowResultData submitTransferTransaction(long innerId,
                                                               String sender,
                                                               String receiver,
                                                               BigDecimal amount,
                                                               float fee,
                                                               List<String> usedContracts,
                                                               byte[] userData,
                                                               PrivateKey privateKey) {
        return submitTransferTransaction(innerId, sender, receiver, amount, fee, usedContracts, userData, 0, privateKey);
    }

    @Override
    public TransactionFlowResultData submitTransferTransaction(long innerId,
                                                               String sender,
                                                               String receiver,
                                                               BigDecimal amount,
                                                               float fee,
                                                               List<String> usedContracts,
                                                               byte[] userData,
                                                               int delegationOptions,
                                                               PrivateKey privateKey) throws NodeClientException {
        final var decodedSender = decodeFromBASE58(sender);
        final var decodedReceiver = decodeFromBASE58(receiver);
        final var decodedUsedContracts = toByteBufferUsedContracts(usedContracts);
        final var shortFee = calculateActualFee((double) fee).getRight();
        final var transactionData = new TransactionFlowData(innerId,
                                                            decodedSender,
                                                            decodedReceiver,
                                                            amount,
                                                            shortFee,
                                                            userData,
                                                            decodedUsedContracts);
        signTransaction(transactionData, privateKey);

        final var transaction = toTransaction(transactionData);
        return callTransactionFlow(transaction);

    }

    private TransactionFlowResultData callTransactionFlow(Transaction transaction) {
        final var result = nodeClient.transactionFlow(transaction);
        processApiResponse(result.getStatus());
        return toTransactionFlowResultData(result, transaction.getSource(), transaction.getTarget());
    }


    @Override
    public SmartContractData getSmartContract(String address) throws NodeClientException, ConverterException {
        LOGGER.info(String.format("---> address = %s", address));
        final var result = nodeClient.getSmartContract(decodeFromBASE58(address));
        logApiResponse(result.getStatus());
        processApiResponse(result.getStatus());
        SmartContract smartContract = result.getSmartContract();
        SmartContractData smartContractData = toSmartContractData(smartContract);
        LOGGER.info(String.format("<--- smart executor hashState = %s", smartContractData.getSmartContractDeployData().hashCode()));
        return smartContractData;
    }

    @Override
    public SmartContractListByAddressData getSmartContractList(String address) throws NodeClientException, ConverterException {
        LOGGER.info(String.format("---> wallet address = %s", address));
        final var result = nodeClient.getSmartContracts(decodeFromBASE58(address));
        logApiResponse(result.getStatus());
        processApiResponse(result.getStatus());
        LOGGER.info("<--- smart contracts size = {}", result.getSmartContractsList().size());

        final var totalSmartContracts = result.getCount();
        final var smartContractList = result.getSmartContractsList()
                .stream()
                .map(NodePojoConverter::toSmartContractData)
                .collect(toList());
        return new SmartContractListByAddressData(totalSmartContracts, smartContractList);
    }

    @Override
    public List<String> getSmartContractAddressList(String address) throws NodeClientException, ConverterException {
        SmartContractAddressesListGetResult result = nodeClient.getSmartContractAddresses(decodeFromBASE58(address));
        logApiResponse(result.getStatus());
        processApiResponse(result.getStatus());
        return result.getAddressesList()
                .stream()
                .map(ByteBuffer::array)
                .map(GeneralConverter::encodeToBASE58)
                .collect(toList());
    }

    @Override
    public WalletData getWalletData(String address) throws NodeClientException, ConverterException {
        LOGGER.debug("--->  WalletDataGet {}", address);
        WalletDataGetResult result = nodeClient.getWalletData(decodeFromBASE58(address));
        processApiResponse(result.getStatus());
        LOGGER.debug("<---  WalletDataGet = {}", result);
        return walletToWalletData(result.getWalletData());
    }

    @Override
    public int getWalletId(String address) throws NodeClientException, ConverterException {
        LOGGER.debug("--->  get wallet id for address {}", address);
        final var result = nodeClient.getWalletId(decodeFromBASE58(address));
        processApiResponse(result.getStatus());
        LOGGER.debug("<---  get wallet id for address {} = {}", address, result.getWalletId());
        return result.getWalletId();
    }

    @Override
    public long getWalletTransactionsCount(String address) throws NodeClientException, ConverterException {
        WalletTransactionsCountGetResult result = nodeClient.getWalletTransactionsCount(decodeFromBASE58(address));
        processApiResponse(result.getStatus());
        return result.getLastTransactionInnerId();
    }

    @Override
    public List<TransactionData> getTransactionsListFromPool(long poolNumber,
                                                             long offset,
                                                             long limit) throws NodeClientException, ConverterException {
        final var response = nodeClient.getTransactionsFromPool(poolNumber, offset, limit);
        processApiResponse(response.getStatus());
        return response.getTransactions().stream().map(NodePojoConverter::createTransactionData).collect(toList());
    }

    @Override
    public ModifiedInnerIdSenderReceiver modifyInnerIdSenderReceiver(long innerId, String sender, String receiver) {
        var senderIndexExistsBit = 0L;
        var receiverIndexExistBit = 0L;

        if(sender != null) {
            final var senderAddressId = getWalletId(sender);
            if (senderAddressId != 0) {
                sender = encodeToBASE58(toByteArrayLittleEndian(senderAddressId, 4));
                senderIndexExistsBit = 1L << 47;
            }
        }

        if(receiver != null) {
            final var receiverAddressId = getWalletId(receiver);
            if (receiverAddressId != 0) {
                receiver = encodeToBASE58(toByteArrayLittleEndian(receiverAddressId, 4));
                receiverIndexExistBit = 1L << 46;
            }
        }

        final var newInnerId = (innerId & (-1 >> 18)) | senderIndexExistsBit | receiverIndexExistBit;

        return new ModifiedInnerIdSenderReceiver(newInnerId, sender, receiver);
    }


    public static <R> void async(Function<R> apiCall, Callback<R> callback) {
        CompletableFuture.supplyAsync(apiCall::apply, threadPool).whenComplete(handleCallback(callback));
    }

    public static <R> CompletableFuture<R> async(Function<R> apiCall) {
        return CompletableFuture.supplyAsync(apiCall::apply, threadPool);
    }
}
