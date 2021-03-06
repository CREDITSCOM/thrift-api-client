package com.credits.client.node.pojo;

import java.io.Serializable;

public class SmartContractTransactionData extends TransactionData implements Serializable {

    private static final long serialVersionUID = 3059305168442443311L;

    protected SmartContractInvocationData smartContractData;

    public SmartContractTransactionData(TransactionData transactionData, SmartContractInvocationData smartContractData) {
        super(transactionData.getId(), transactionData.getSource(), transactionData.getTarget(), transactionData.getAmount(), transactionData.getType());
        this.setSmartInfo(transactionData.getSmartInfo());
        this.setBlockId(transactionData.getBlockId());
        this.setMethod(transactionData.getMethod());
        this.setParams(transactionData.getParams());
        this.setUsedContracts(transactionData.getUsedContracts());
        this.smartContractData = smartContractData;
    }

    public SmartContractInvocationData getSmartContractData() {
        return smartContractData;
    }

    public void setSmartContractData(SmartContractInvocationData smartContractData) {
        this.smartContractData = smartContractData;
    }
}
