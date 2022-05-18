package com.credits.client.node.pojo;

import com.credits.general.pojo.ByteCodeObjectData;
import lombok.Value;

import java.io.Serializable;
import java.util.List;


@Value
public class SmartContractDeployData implements Serializable {
    private static final long serialVersionUID = 2107384364962814401L;
    private final String sourceCode;
    private final List<ByteCodeObjectData> byteCodeObjectDataList;
    private final int tokenStandardId;
}
