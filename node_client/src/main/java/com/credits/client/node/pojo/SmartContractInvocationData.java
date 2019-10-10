package com.credits.client.node.pojo;

import lombok.Value;

import java.io.Serializable;
import java.util.List;


@Value
public class SmartContractInvocationData implements Serializable {
    public static final short SMART_CONTRACT_INVOCATION_VERSION = 1;
    private static final long serialVersionUID = 2778511097985386077L;
    private String method;
    private List<?> params;
    private List<String> usedContracts;
    private boolean forgetNewState;
}
