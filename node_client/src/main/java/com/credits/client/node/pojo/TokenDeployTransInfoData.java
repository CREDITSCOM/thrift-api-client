package com.credits.client.node.pojo;

import java.util.Objects;

public class TokenDeployTransInfoData extends SmartTransInfoData {
    public String name;
    public String code;

    public long tokenStandard;

    public TokenDeployTransInfoData(String name, String code, long tokenStandard) {
        this.name = name;
        this.code = code;
        this.tokenStandard = tokenStandard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getTokenStandard() {
        return tokenStandard;
    }

    public void setTokenStandard(long tokenStandard) {
        this.tokenStandard = tokenStandard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenDeployTransInfoData that = (TokenDeployTransInfoData) o;
        return tokenStandard == that.tokenStandard &&
                Objects.equals(name, that.name) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, tokenStandard);
    }

    @Override
    public String toString() {
        return "TokenDeployTransInfoData{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", tokenStandard=" + tokenStandard +
                '}';
    }
}
