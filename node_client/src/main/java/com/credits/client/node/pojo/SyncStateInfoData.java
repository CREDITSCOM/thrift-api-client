package com.credits.client.node.pojo;

import lombok.Value;

@Value
public class SyncStateInfoData {
    long currentBlock;
    long lastBlock;
}
