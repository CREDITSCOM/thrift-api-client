package com.credits.client.node.pojo;

import lombok.Value;

@Value
public class ModifiedInnerIdSenderReceiver {
    private long transactionInnerId;
    private String modifiedSenderAddress;
    private String modifiedReceiverAddress;
}
