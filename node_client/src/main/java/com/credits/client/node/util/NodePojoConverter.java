package com.credits.client.node.util;

import com.credits.client.node.pojo.WalletData;
import com.credits.client.node.pojo.*;
import com.credits.client.node.thrift.generated.*;
import com.credits.general.thrift.generated.Amount;
import com.credits.general.util.GeneralConverter;
import com.credits.general.util.exception.ConverterException;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.stream.Collectors;

import static com.credits.client.node.pojo.SmartContractInvocationData.SMART_CONTRACT_INVOCATION_VERSION;
import static com.credits.general.util.GeneralConverter.amountToBigDecimal;
import static com.credits.general.util.GeneralConverter.bigDecimalToAmount;
import static com.credits.general.util.GeneralPojoConverter.createApiResponseData;


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
        Long innerId = transaction.getId();
        data.setBlockId(blockTransactionId.getPoolSeq() + "." + blockTransactionId.getIndex());
        data.setAmount(amountToBigDecimal(transaction.getAmount()));
        data.setCurrency(transaction.getCurrency());
        data.setId(innerId);
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
        data.setUsedContracts(transaction.getUsedContracts());
        return data;
    }

    public static TransactionData createTransactionData(Transaction transaction) {
        TransactionData data = new TransactionData();
        Long innerId = transaction.getId();
        if (transaction.getAmount() == null) {
            data.setAmount(BigDecimal.ZERO);
        } else {
            data.setAmount(amountToBigDecimal(transaction.getAmount()));
        }
        data.setCurrency(transaction.getCurrency());
        data.setId(innerId);
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
        thriftStruct.setByteCodeObjects(
            GeneralConverter.byteCodeObjectsDataToByteCodeObjects(data.getByteCodeObjects()));
        thriftStruct.setHashState(data.getHashState());
        thriftStruct.setTokenStandard(data.getTokenStandardId());
        return thriftStruct;
    }

    public static SmartContractData smartContractToSmartContractData(SmartContract smartContract) {

        return new SmartContractData(smartContract.getAddress(), smartContract.getDeployer(),
            createSmartContractDeployData(smartContract.getSmartContractDeploy()),
            smartContract.getObjectState(), smartContract.getTransactionsCount());
    }

    public static SmartContractDeployData createSmartContractDeployData(SmartContractDeploy thriftStruct) {
        return new SmartContractDeployData(thriftStruct.getSourceCode(),
            GeneralConverter.byteCodeObjectsToByteCodeObjectsData(thriftStruct.getByteCodeObjects()), thriftStruct.getTokenStandard());
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
        if(thriftStruct.getStateTransaction()!=null) {
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

    public static SmartContractInvocation createSmartContractInvocation(
        SmartContractInvocationData smartContractInvocationData) {

        final var thriftStruct = new SmartContractInvocation(smartContractInvocationData.getMethod(),
                                                             smartContractInvocationData.getParams(),
                                                             smartContractInvocationData.getUsedContracts(),
                                                             smartContractInvocationData.isForgetNewState(),
                                                             SMART_CONTRACT_INVOCATION_VERSION);
        SmartContractDeployData smartContractDeployData = smartContractInvocationData.getSmartContractDeployData();
        if (smartContractDeployData != null) {
            thriftStruct.setSmartContractDeploy(smartContractDeployDataToSmartContractDeploy(smartContractDeployData));
        }

        return thriftStruct;
    }

    public static SmartContractInvocationData createSmartContractInvocationData(SmartContractInvocation thriftStruct) {

        return new SmartContractInvocationData(createSmartContractDeployData(thriftStruct.getSmartContractDeploy()),
            thriftStruct.getMethod(),
            thriftStruct.getParams(),
            thriftStruct.getUsedContracts(), thriftStruct.forgetNewState);
    }

    public static Transaction smartContractTransactionFlowDataToTransaction(
        SmartContractTransactionFlowData scTransaction) {

        Transaction transaction = new Transaction();
        transaction.id = scTransaction.getId();
        transaction.source = ByteBuffer.wrap(scTransaction.getSource());
        transaction.target = ByteBuffer.wrap(scTransaction.getTarget());
        transaction.amount = null;
        transaction.balance = null;
        transaction.currency = (byte) 1;
        transaction.signature = ByteBuffer.wrap(scTransaction.getSignature());
        transaction.fee = new AmountCommission(scTransaction.getOfferedMaxFee16Bits());
        SmartContractInvocation smartContractInvocation =
            createSmartContractInvocation(scTransaction.getSmartContractData());
        transaction.setSmartContract(smartContractInvocation);
        transaction.setSmartContractIsSet(true);
        return transaction;
    }

    public static SmartContractTransactionData createSmartContractTransactionData(SealedTransaction thriftStruct) {
        TransactionData transactionData = createTransactionData(thriftStruct);
        return new SmartContractTransactionData(transactionData,
            thriftStruct.getTrxn().getSmartContract() == null ? null
                : createSmartContractInvocationData(thriftStruct.getTrxn().getSmartContract()));
    }

    public static TransactionFlowResultData transactionFlowResultToTransactionFlowResultData(
        TransactionFlowResult result, byte[] source, byte[] target) {
        return new TransactionFlowResultData(createApiResponseData(result.getStatus()), result.getRoundNum(), source,
            target,
            result.getSmart_contract_result());
    }

    public static Transaction transactionFlowDataToTransaction(TransactionFlowData transactionData) {
        Transaction transaction = new Transaction();
        transaction.id = transactionData.getId();
        transaction.source = ByteBuffer.wrap(transactionData.getSource());
        transaction.target = ByteBuffer.wrap(transactionData.getTarget());
        transaction.amount = bigDecimalToAmount(transactionData.getAmount());
        transaction.fee = new AmountCommission(transactionData.getOfferedMaxFee16Bits());
        if (transactionData.getCommentBytes() != null) {
            transaction.userFields = ByteBuffer.wrap(transactionData.getCommentBytes());
        }
        if (transactionData.getSignature() != null) {
            transaction.signature = ByteBuffer.wrap(transactionData.getSignature());
        }
        return transaction;
    }

    public static TransactionId transactionIdDataToTransactionId(TransactionIdData transactionIdData) {
        TransactionId transactionId = new TransactionId();
        transactionId.setPoolSeq(transactionIdData.getPoolSequence());
        transactionId.setIndex(transactionIdData.getIndex());
        return transactionId;
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
            .collect(Collectors.toMap(e -> e.getKey(), e -> transactionStateToTransactionStateData(e.getValue()))),
            result.getRoundNum());
    }
}
