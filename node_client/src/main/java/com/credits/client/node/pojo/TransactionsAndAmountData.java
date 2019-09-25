package com.credits.client.node.pojo;

import lombok.Value;

import java.util.List;


@Value
public class TransactionsAndAmountData {
    int amountTotalTransactions;
    List<TransactionData> transactionsList;
}
