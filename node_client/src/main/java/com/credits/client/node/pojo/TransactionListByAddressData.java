package com.credits.client.node.pojo;

import lombok.Value;

import java.util.List;


@Value
public class TransactionListByAddressData {
    int amountTotalTransactions;
    List<TransactionData> transactionsList;
}
