package com.credits.client.node.pojo;

import lombok.Value;

@Value
public class SyncStateInfoData {
    long blockchainCurrentBlockNumber;
    long nodeCurrentBlockNumber;
}
