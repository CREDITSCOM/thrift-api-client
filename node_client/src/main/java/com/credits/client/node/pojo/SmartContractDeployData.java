package com.credits.client.node.pojo;

import com.credits.general.pojo.ByteCodeObjectData;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


public class SmartContractDeployData implements Serializable {

    private static final long serialVersionUID = -6187425771734674520L;
    private final String sourceCode;
    private final List<ByteCodeObjectData> byteCodeObjectDataList;
    private final String hashState; //unused
    private final int tokenStandardId;

    public SmartContractDeployData(String sourceCode, List<ByteCodeObjectData> byteCodeObjectDataList,  int tokenStandardId) {
        this.sourceCode = sourceCode;
        this.byteCodeObjectDataList = byteCodeObjectDataList;
        this.tokenStandardId = tokenStandardId;
        this.hashState="";
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public List<ByteCodeObjectData> getByteCodeObjects() {
        return byteCodeObjectDataList;
    }

    public String getHashState() {
        return hashState;
    }

    public int getTokenStandardId() {
        return tokenStandardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartContractDeployData that = (SmartContractDeployData) o;
        return tokenStandardId == that.tokenStandardId &&
                Objects.equals(sourceCode, that.sourceCode) &&
                Objects.equals(byteCodeObjectDataList, that.byteCodeObjectDataList) &&
                Objects.equals(hashState, that.hashState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCode, byteCodeObjectDataList, hashState, tokenStandardId);
    }

    @Override
    public String toString() {
        return "SmartContractDeployData{" +
                "sourceCode='" + sourceCode + '\'' +
                ", byteCodeObjectDataList=" + byteCodeObjectDataList +
                ", hashState='" + hashState + '\'' +
                ", tokenStandardId=" + tokenStandardId +
                '}';
    }
}
