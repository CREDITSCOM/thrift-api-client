package com.credits.client.node.pojo;


import lombok.Value;

@Value
public class CompiledSmartContract {
    public final String address;
    public final String sourcecode;
    public final Class<?> contractClass;
}
