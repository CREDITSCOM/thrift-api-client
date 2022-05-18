package com.credits.client.node.pojo;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

@Value
public class ExtraFeeData implements Serializable {
    String comment;
    BigDecimal amount;
    TransactionIdData transactionId;
}
