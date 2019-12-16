package com.credits.client.node.util;

import com.credits.client.node.pojo.WalletData;
import com.credits.client.node.pojo.*;
import com.credits.client.node.thrift.generated.*;
import com.credits.general.thrift.generated.Amount;
import com.credits.general.util.GeneralConverter;
import com.credits.general.util.exception.ConverterException;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static com.credits.client.node.pojo.SmartContractInvocationData.SMART_CONTRACT_INVOCATION_VERSION;
import static com.credits.general.util.GeneralConverter.*;
import static com.credits.general.util.GeneralPojoConverter.createApiResponseData;
import static com.credits.general.util.Utils.rethrowUnchecked;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;


public class NodePojoConverter {


    public static Double amountToDouble(Amount amount) {

        int integralPart = amount.getIntegral();
        double fractionPart = amount.getFraction() / 1000000000000000000D;
        return (double) integralPart + fractionPart;
    }

    public static Amount doubleToAmount(Double value) throws ConverterException {
        if (value == null) {
            throw new ConverterException("value is null");
        }
        String valueAsString = String.format(Locale.ROOT, "%.18f", value);
        String[] valueDelimited = valueAsString.split("\\.");
        int integral = Integer.parseInt(valueDelimited[0]);
        long fraction = Long.parseLong(valueDelimited[1]);
        return new Amount(integral, fraction);
    }


    public static TransactionData createTransactionData(SealedTransaction sealedTransaction) {

        TransactionId blockTransactionId = sealedTransaction.getId();
        Transaction transaction = sealedTransaction.getTrxn();

        TransactionData data = new TransactionData();
        long innerId = transaction.getId();
        data.setBlockNumber(blockTransactionId.getPoolSeq());
        data.setIndexIntoBlock(blockTransactionId.getIndex());
        data.setAmount(amountToBigDecimal(transaction.getAmount()));
        data.setInnerId(innerId);
        data.setSource(transaction.getSource());
        data.setTarget(transaction.getTarget());
        data.setCommentBytes(transaction.getUserFields());
        if (transaction.getSmartContract() != null) {
            data.setMethod(transaction.getSmartContract().getMethod());
            data.setParams(transaction.getSmartContract().getParams());
        }
        if (transaction.getSmartInfo() != null) {
            data.setSmartInfo(createSmartTransInfoData(transaction.getSmartInfo()));
        }
        data.setType(createTransactionTypeData(transaction.getType()));
        data.setMaxFee(transaction.getFee().commission);
        data.setUsedContracts(transaction.getUsedContracts());
        data.setTimeCreation(transaction.getTimeCreation());
        final var transactionExtraFee = transaction.getExtraFee();
        if(transactionExtraFee != null) {
            final var extraFeeDataList = transactionExtraFee.stream().map(NodePojoConverter::toExtraFeeData).collect(toList());
            data.setExtraFeeDataList(extraFeeDataList);
        }
        return data;
    }

    public static ExtraFeeData toExtraFeeData(ExtraFee extraFee) {
        final var comment = extraFee.getComment();
        final var amount = amountToBigDecimal(extraFee.getSum());
        final var transactionId = toTransactionIdData(extraFee.getTransactionId());
        return new ExtraFeeData(comment, amount, transactionId);
    }

    public static TransactionData createTransactionData(Transaction transaction) {
        TransactionData data = new TransactionData();
        Long innerId = transaction.getId();
        if (transaction.getAmount() == null) {
            data.setAmount(BigDecimal.ZERO);
        } else {
            data.setAmount(amountToBigDecimal(transaction.getAmount()));
        }
        data.setInnerId(innerId);
        data.setSource(transaction.getSource());
        data.setTarget(transaction.getTarget());
        data.setCommentBytes(transaction.getUserFields());
        data.setType(TransactionTypeData.TT_Normal);
        data.setUsedContracts(transaction.getUsedContracts());
        return data;
    }

    public static WalletData walletToWalletData(com.credits.client.node.thrift.generated.WalletData walletData) {

        return new WalletData(walletData.getWalletId(), amountToBigDecimal(walletData.getBalance()),
                              walletData.getLastTransactionId());
    }

    public static PoolData poolToPoolData(Pool pool) {

        PoolData data = new PoolData();

        data.setTransactionsCount(pool.getTransactionsCount());
        data.setHash(pool.getHash());
        data.setPrevHash(pool.getPrevHash());
        data.setTime(pool.getTime());
        data.setPoolNumber(pool.getPoolNumber());
        return data;
    }

    public static SmartContract smartContractDataToSmartContract(SmartContractData smartContractData) {

        SmartContract smartContract = new SmartContract();
        smartContract.setAddress(smartContractData.getAddress());
        smartContract.setDeployer(smartContractData.getDeployer());
        smartContract.setSmartContractDeploy(smartContractDeployDataToSmartContractDeploy(
                smartContractData.getSmartContractDeployData()));
        return smartContract;
    }

    public static SmartContractDeploy smartContractDeployDataToSmartContractDeploy(SmartContractDeployData data) {

        SmartContractDeploy thriftStruct = new SmartContractDeploy();
        thriftStruct.setSourceCode(data.getSourceCode());
        thriftStruct.setByteCodeObjects(byteCodeObjectsDataToByteCodeObjects(data.getByteCodeObjectDataList()));
        thriftStruct.setHashState("");
        thriftStruct.setTokenStandard(data.getTokenStandardId());
        return thriftStruct;
    }

    public static SmartContractData toSmartContractData(SmartContract smartContract) {

        return new SmartContractData(smartContract.getAddress(),
                                     smartContract.getDeployer(),
                                     createSmartContractDeployData(smartContract.getSmartContractDeploy()),
                                     smartContract.getObjectState(),
                                     smartContract.getTransactionsCount(),
                                     smartContract.getCreateTime());
    }

    public static SmartContractDeployData createSmartContractDeployData(SmartContractDeploy thriftStruct) {
        return new SmartContractDeployData(thriftStruct.getSourceCode(),
                                           byteCodeObjectsToByteCodeObjectsData(thriftStruct.getByteCodeObjects()),
                                           thriftStruct.getTokenStandard());
    }

    public static SmartTransInfoData createSmartTransInfoData(SmartTransInfo thriftStruct) {

        if (thriftStruct.isSetV_smartDeploy()) {
            SmartDeployTransInfo child = thriftStruct.getV_smartDeploy();
            return createSmartDeployTransInfoData(child);
        } else if (thriftStruct.isSetV_smartExecution()) {
            SmartExecutionTransInfo child = thriftStruct.getV_smartExecution();
            return createSmartExecutionTransInfoData(child);
        } else if (thriftStruct.isSetV_smartState()) {
            SmartStateTransInfo child = thriftStruct.getV_smartState();
            return createSmartStateTransInfoData(child);
        } else if (thriftStruct.isSetV_tokenDeploy()) {
            TokenDeployTransInfo child = thriftStruct.getV_tokenDeploy();
            return createTokenDeployTransInfoData(child);
        } else if (thriftStruct.isSetV_tokenTransfer()) {
            TokenTransferTransInfo child = thriftStruct.getV_tokenTransfer();
            return createTokenTransferTransInfoData(child);
        } else {
            throw new ConverterException(String.format("Unsupported value: %s", thriftStruct.toString()));
        }
    }

    public static SmartDeployTransInfoData createSmartDeployTransInfoData(SmartDeployTransInfo thriftStruct) {
        TransactionIdData transactionIdData = null;
        if (thriftStruct.getStateTransaction() != null) {
            transactionIdData = createTransactionIdData(thriftStruct.getStateTransaction());
        }
        return new SmartDeployTransInfoData(createSmartOperationStateData(thriftStruct.getState()), transactionIdData);
    }

    public static SmartExecutionTransInfoData createSmartExecutionTransInfoData(SmartExecutionTransInfo thriftStruct) {
        TransactionIdData stateTransaction = null;
        if (thriftStruct.getStateTransaction() != null) {
            stateTransaction = createTransactionIdData(thriftStruct.getStateTransaction());
        }


        return new SmartExecutionTransInfoData(thriftStruct.getMethod(),
                                               thriftStruct.getParams(),
                                               createSmartOperationStateData(thriftStruct.getState()),
                                               stateTransaction);
    }

    public static SmartStateTransInfoData createSmartStateTransInfoData(SmartStateTransInfo thriftStruct) {
        return new SmartStateTransInfoData(thriftStruct.isSuccess(), amountToBigDecimal(thriftStruct.getExecutionFee()),
                                           thriftStruct.getReturnValue(),
                                           createTransactionIdData(thriftStruct.getStartTransaction()));
    }

    public static TokenDeployTransInfoData createTokenDeployTransInfoData(TokenDeployTransInfo thriftStruct) {
        return new TokenDeployTransInfoData(thriftStruct.getName(), thriftStruct.getCode(), thriftStruct.getTokenStandard());
    }

    public static TokenTransferTransInfoData createTokenTransferTransInfoData(TokenTransferTransInfo thriftStruct) {
        return new TokenTransferTransInfoData(thriftStruct.getCode(), thriftStruct.getSender(),
                                              thriftStruct.getReceiver(), thriftStruct.getAmount());
    }

    public static TransactionIdData createTransactionIdData(TransactionId thriftStruct) {
        return new TransactionIdData(thriftStruct.getPoolSeq(), thriftStruct.getIndex());
    }

    public static SmartOperationStateData createSmartOperationStateData(SmartOperationState thriftStruct) {
        switch (thriftStruct) {
            case SOS_Failed:
                return SmartOperationStateData.SOS_Failed;
            case SOS_Pending:
                return SmartOperationStateData.SOS_Pending;
            case SOS_Success:
                return SmartOperationStateData.SOS_Success;
            default:
                throw new ConverterException(String.format("Unsupported value: %s", thriftStruct.getValue()));
        }
    }

    public static SmartContractInvocation toSmartContractInvocation(SmartContractDeployData deployData, List<String> usedContracts) {
        final var usedContractsByteBuffer = toByteBufferUsedContracts(usedContracts);
        final var smartContractDeploy = smartContractDeployDataToSmartContractDeploy(deployData);
        return new SmartContractInvocation("",
                                           Collections.emptyList(),
                                           usedContractsByteBuffer,
                                           false,
                                           SMART_CONTRACT_INVOCATION_VERSION)
                .setSmartContractDeploy(smartContractDeploy);
    }

    public static SmartContractInvocation toSmartContractInvocation(SmartContractInvocationData invocationData) {
        final List<ByteBuffer> usedContracts = toByteBufferUsedContracts(invocationData.getUsedContracts());

        return new SmartContractInvocation(invocationData.getMethod(),
                                           invocationData.getParams(),
                                           usedContracts,
                                           invocationData.isForgetNewState(),
                                           SMART_CONTRACT_INVOCATION_VERSION);
    }

    public static List<ByteBuffer> toByteBufferUsedContracts(List<String> usedContracts) {
        return usedContracts
                .stream()
                .map(GeneralConverter::decodeFromBASE58)
                .map(ByteBuffer::wrap)
                .collect(toList());
    }

    public static SmartContractInvocationData createSmartContractInvocationData(SmartContractInvocation thriftStruct) {

        final var stringListUsedContracts = thriftStruct.getUsedContracts()
                .stream()
                .map(ByteBuffer::array)
                .map(GeneralConverter::encodeToBASE58)
                .collect(toList());

        return new SmartContractInvocationData(thriftStruct.getMethod(),
                                               thriftStruct.getParams(),
                                               stringListUsedContracts,
                                               thriftStruct.forgetNewState);
    }

    public static Transaction smartContractTransactionFlowDataToTransaction(SmartContractTransactionFlowData scTransaction) {
        Transaction transaction = new Transaction();
        transaction.id = scTransaction.getInnerId();
        transaction.source = ByteBuffer.wrap(scTransaction.getSource());
        transaction.target = ByteBuffer.wrap(scTransaction.getTarget());
        transaction.amount = null;
        transaction.balance = null;
        transaction.currency = (byte) 1;
        transaction.signature = ByteBuffer.wrap(scTransaction.getSignature());
        transaction.fee = new AmountCommission(scTransaction.getOfferedMaxFee16Bits());
        SmartContractInvocation smartContractInvocation =
                toSmartContractInvocation(scTransaction.getSmartContractData());
        transaction.setSmartContract(smartContractInvocation);
        transaction.setSmartContractIsSet(true);
        return transaction;
    }

    public static SmartContractTransactionData createSmartContractTransactionData(SealedTransaction thriftStruct) {
        TransactionData transactionData = createTransactionData(thriftStruct);
        return new SmartContractTransactionData(transactionData,
                                                thriftStruct.getTrxn().getSmartContract() == null
                                                ? null
                                                : createSmartContractInvocationData(thriftStruct.getTrxn().getSmartContract()));
    }

    public static TransactionFlowResultData toTransactionFlowResultData(TransactionFlowResult result,
                                                                        byte[] source,
                                                                        byte[] target) {
        return new TransactionFlowResultData(createApiResponseData(result.getStatus()), result.getRoundNum(), source,
                                             target,
                                             result.getSmart_contract_result());
    }

    public static Transaction toTransaction(TransactionFlowData transactionData) {
        Transaction transaction = new Transaction();
        transaction.id = transactionData.getInnerId();
        transaction.source = ByteBuffer.wrap(transactionData.getSource());
        transaction.target = ByteBuffer.wrap(transactionData.getTarget());
        transaction.amount = bigDecimalToAmount(transactionData.getAmount());
        transaction.fee = new AmountCommission(transactionData.getOfferedMaxFee16Bits());
        transaction.userFields = getUserFields(transactionData);
        transaction.signature = transactionData.getSignature() != null ? ByteBuffer.wrap(transactionData.getSignature()) : null;
        return transaction;
    }

    private static final byte UF_TYPE_INTEGER = 1;
    private static final byte UF_TYPE_STRING = 2;

    private static ByteBuffer getUserFields(TransactionFlowData transactionData) {
        final var isCommentExist = transactionData.getCommentBytes() != null;
        final var isDelegateOptionsExist = transactionData.getDelegationOptions() != 0;
        final var ufBytes = new ByteArrayOutputStream();

        rethrowUnchecked(() -> {
            if (isDelegateOptionsExist) {
                final var markByte = 0;
                final var amountUserFields = isCommentExist ? 2 : 1;
                final var ufNumber = 5;
                final var ufType = UF_TYPE_INTEGER;
                final var ufValue = ((long) transactionData.getDelegationOptions());

                ufBytes.write(toByteArrayLittleEndian(markByte, Integer.BYTES));
                ufBytes.write(toByteArrayLittleEndian(amountUserFields, Integer.BYTES));
                ufBytes.write(toByteArrayLittleEndian(ufNumber, Integer.BYTES));
                ufBytes.write(toByteArrayLittleEndian(ufType, Byte.BYTES));
                ufBytes.write(toByteArrayLittleEndian(ufValue, Long.BYTES));

                if (isCommentExist) {
                    final var ufNumber2 = 6;
                    final var ufType2 = UF_TYPE_STRING;
                    final var ufStringLength = transactionData.getCommentBytes().length;
                    final var ufValue2 = transactionData.getCommentBytes();

                    ufBytes.write(toByteArrayLittleEndian(ufNumber2, Integer.BYTES));
                    ufBytes.write(toByteArrayLittleEndian(ufType2, Byte.BYTES));
                    ufBytes.write(toByteArrayLittleEndian(ufStringLength, Integer.BYTES));
                    ufBytes.write(ufValue2);
                }
            } else {
                if (isCommentExist) {
                    ufBytes.write(transactionData.getCommentBytes());
                }
            }
        });

        return ByteBuffer.wrap(ufBytes.toByteArray());
    }

    public static Transaction toTransaction(TransactionFlowData transactionData, SmartContractInvocation smartContractInvocation) {
        final var transaction = toTransaction(transactionData);
        transaction.setSmartContract(smartContractInvocation);
        transaction.setSmartContractIsSet(true);
        return transaction;
    }

    public static TransactionId transactionIdDataToTransactionId(TransactionIdData transactionIdData) {
        TransactionId transactionId = new TransactionId();
        transactionId.setPoolSeq(transactionIdData.getPoolSequence());
        transactionId.setIndex(transactionIdData.getIndex());
        return transactionId;
    }

    public static TransactionIdData toTransactionIdData(TransactionId transactionId) {
        final var index = transactionId.getIndex();
        final var poolSeq = transactionId.getPoolSeq();
        return new TransactionIdData(poolSeq, index);
    }

    public static long getShortTransactionId(long wideTransactionId) {
        long maskForZeroingFirstTwoBit = 0x3FFFFFFFFFFFL;
        return wideTransactionId & maskForZeroingFirstTwoBit;
    }

    public static TransactionState transactionStateDataToTransactionState(TransactionStateData transactionStateData) {
        if (transactionStateData.equals(TransactionStateData.INVALID)) {
            return TransactionState.INVALID;
        }
        if (transactionStateData.equals(TransactionStateData.VALID)) {
            return TransactionState.VALID;
        }
        if (transactionStateData.equals(TransactionStateData.INPROGRESS)) {
            return TransactionState.INPROGRESS;
        }
        throw new ConverterException(String.format("Unsupported value: %s", transactionStateData.getValue()));
    }

    public static TransactionStateData transactionStateToTransactionStateData(TransactionState transactionState) {
        if (transactionState.equals(TransactionState.INVALID)) {
            return TransactionStateData.INVALID;
        }
        if (transactionState.equals(TransactionState.VALID)) {
            return TransactionStateData.VALID;
        }
        if (transactionState.equals(TransactionState.INPROGRESS)) {
            return TransactionStateData.INPROGRESS;
        }
        throw new ConverterException(String.format("Unsupported value: %s", transactionState.getValue()));
    }

    public static TransactionType createTransactionType(TransactionTypeData data) {
        if (data.equals(TransactionTypeData.TT_Normal)) {
            return TransactionType.TT_Normal;
        }
        if (data.equals(TransactionTypeData.TT_SmartDeploy)) {
            return TransactionType.TT_SmartDeploy;
        }
        if (data.equals(TransactionTypeData.TT_SmartExecute)) {
            return TransactionType.TT_SmartExecute;
        }
        if (data.equals(TransactionTypeData.TT_SmartState)) {
            return TransactionType.TT_SmartState;
        }
        throw new ConverterException(String.format("Unsupported value: %s", data.getValue()));
    }

    public static TransactionTypeData createTransactionTypeData(TransactionType thriftStruct) {
        if (thriftStruct.equals(TransactionType.TT_Normal)) {
            return TransactionTypeData.TT_Normal;
        }
        if (thriftStruct.equals(TransactionType.TT_SmartDeploy)) {
            return TransactionTypeData.TT_SmartDeploy;
        }
        if (thriftStruct.equals(TransactionType.TT_SmartExecute)) {
            return TransactionTypeData.TT_SmartExecute;
        }
        if (thriftStruct.equals(TransactionType.TT_SmartState)) {
            return TransactionTypeData.TT_SmartState;
        }
        throw new ConverterException(String.format("Unsupported value: %s", thriftStruct.getValue()));
    }

    public static TransactionsStateGetResultData createTransactionsStateGetResultData(
            TransactionsStateGetResult result) {
        return new TransactionsStateGetResultData(createApiResponseData(result.getStatus()), result.getStates()
                .entrySet()
                .stream()
                .collect(toMap(e -> e.getKey(), e -> transactionStateToTransactionStateData(e.getValue()))),
                                                  result.getRoundNum());
    }
}
