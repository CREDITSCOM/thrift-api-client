package com.credits.client.node.pojo;

import lombok.Value;

import java.util.List;

@Value
public class SmartContractListByAddressData {
    private final int amountSmartContracts;
    private final List<SmartContractData> smartContractDataList;
}
