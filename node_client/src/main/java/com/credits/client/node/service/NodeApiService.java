package com.credits.client.node.service;


import com.credits.client.node.exception.NodeClientException;
import com.credits.client.node.pojo.*;
import com.credits.general.pojo.ByteCodeObjectData;

import java.math.BigDecimal;
import java.security.PrivateKey;
import java.util.List;

public interface NodeApiService {

    BigDecimal getBalance(String address) throws NodeClientException;

    List<String> getSmartContractAddressList(String address) throws NodeClientException;

    TransactionData getTransaction(TransactionIdData transactionIdData) throws NodeClientException;

    TransactionListByAddressData getTransactionList(String address, long offset, long limit) throws NodeClientException;

    SyncStateInfoData getSyncStateInfo() throws NodeClientException;

    PoolData getPoolInfo(long poolSequence, long index) throws NodeClientException;

    List<PoolData> getPoolList(Long offset, Long limit) throws NodeClientException;

    SmartContractData getSmartContract(String address) throws NodeClientException;

    SmartContractListByAddressData getSmartContractList(String address) throws NodeClientException;

    WalletData getWalletData(String address) throws NodeClientException;

    int getWalletId(String address) throws NodeClientException;

    long getWalletTransactionsCount(String address) throws NodeClientException;

    List<TransactionData> getTransactionsListFromPool(long poolNumber, long offset, long limit) throws NodeClientException;

    ModifiedInnerIdSenderReceiver modifyInnerIdSenderReceiver(long innerId, String sender, String receiver);

    TransactionFlowResultData invokeContractGetterMethod(String initiator,
                                                         String contractAddress,
                                                         String method,
                                                         List<?> params,
                                                         List<String> usedContracts) throws NodeClientException;

    TransactionFlowResultData submitDeployTransaction(long innerId,
                                                      String initiator,
                                                      String contractAddress,
                                                      String sourceCode,
                                                      List<ByteCodeObjectData> byteCodeObjects,
                                                      int tokenStandardId,
                                                      float fee,
                                                      List<String> usedContracts,
                                                      PrivateKey privateKey) throws NodeClientException;

    TransactionFlowResultData submitInvokeTransaction(long innerId,
                                                      String initiator,
                                                      String contractAddress,
                                                      String method,
                                                      List<?> params,
                                                      float fee,
                                                      List<String> usedContracts,
                                                      PrivateKey privateKey) throws NodeClientException;

    TransactionFlowResultData submitTransferTransaction(long innerId,
                                                        String sender,
                                                        String receiver,
                                                        BigDecimal amount,
                                                        float fee,
                                                        List<String> usedContracts,
                                                        byte[] userData,
                                                        PrivateKey privateKey) throws NodeClientException;

    TransactionFlowResultData submitTransferTransaction(long innerId,
                                                        String sender,
                                                        String receiver,
                                                        BigDecimal amount,
                                                        float fee,
                                                        List<String> usedContracts,
                                                        byte[] userData,
                                                        int delegationOptions,
                                                        PrivateKey privateKey) throws NodeClientException;

    TransactionFlowData signAndGetTransactionFlowData(long innerId,
                                                      String sender,
                                                      String receiver,
                                                      BigDecimal amount,
                                                      float fee,
                                                      List<String> usedContracts,
                                                      byte[] userData,
                                                      int delegationOptions,
                                                      PrivateKey privateKey) throws NodeClientException;

    TransactionFlowResultData justSubmitTransferTransaction(TransactionFlowData transactionData) throws NodeClientException;
}
