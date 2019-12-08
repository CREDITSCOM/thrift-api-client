package com.credits.client.node.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


@NoArgsConstructor
public class TransactionFlowData extends TransactionData implements Serializable {
    private static final long serialVersionUID = 4544650022718657166L;
    protected Short offeredMaxFee16Bits;
    protected byte[] smartContractBytes;
    protected byte[] signature;
    @Getter
    protected int delegationOptions;

    public TransactionFlowData(long innerId,
                               byte[] source,
                               byte[] target,
                               BigDecimal amount,
                               short offeredMaxFee16Bits,
                               byte[] smartContractBytes,
                               byte[] commentBytes,
                               List<ByteBuffer> usedContracts) {
        super();
        this.setInnerId(innerId);
        this.setSource(source);
        this.setTarget(target);
        this.setAmount(amount);
        this.setOfferedMaxFee16Bits(offeredMaxFee16Bits);
        this.setSmartContractBytes(smartContractBytes);
        this.setCommentBytes(commentBytes);
        this.setUsedContracts(usedContracts);
    }

    public TransactionFlowData(long innerId,
                               byte[] source,
                               byte[] target,
                               BigDecimal amount,
                               short offeredMaxFee16Bits,
                               byte[] smartContractBytes,
                               byte[] commentBytes,
                               List<ByteBuffer> usedContracts,
                               byte[] signature) {
        this(innerId, source, target, amount, offeredMaxFee16Bits, smartContractBytes, commentBytes, usedContracts);
        this.setUsedContracts(usedContracts);
        this.setSignature(signature);
    }


    public TransactionFlowData(TransactionFlowData transaction) {
        this(transaction.innerId, transaction.source, transaction.target, transaction.amount, transaction.offeredMaxFee16Bits,
             transaction.smartContractBytes, transaction.commentBytes, transaction.getUsedContracts(),
             transaction.signature);
        delegationOptions = transaction.getDelegationOptions();
    }

    public TransactionFlowData(long innerId,
                               byte[] source,
                               byte[] target,
                               BigDecimal amount,
                               short fee,
                               byte[] userData,
                               List<ByteBuffer> usedContracts) {
        this(innerId, source, target, amount, fee, userData, 0, usedContracts);
    }

    public TransactionFlowData(long innerId,
                               byte[] source,
                               byte[] target,
                               BigDecimal amount,
                               short fee,
                               byte[] userData,
                               int delegationOptions,
                               List<ByteBuffer> usedContracts) {
        this(innerId, source, target, amount, fee, null, userData, usedContracts);
        this.delegationOptions = delegationOptions;
    }

    public Short getOfferedMaxFee16Bits() {
        return offeredMaxFee16Bits;
    }

    public void setOfferedMaxFee16Bits(Short offeredMaxFee16Bits) {
        this.offeredMaxFee16Bits = offeredMaxFee16Bits;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransactionFlowData)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TransactionFlowData that = (TransactionFlowData) o;
        return Objects.equals(offeredMaxFee16Bits, that.offeredMaxFee16Bits) && Arrays.equals(signature, that.signature);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(super.hashCode(), offeredMaxFee16Bits);
        result = 31 * result + Arrays.hashCode(signature);
        return result;
    }

    public byte[] getSmartContractBytes() {
        return smartContractBytes;
    }

    public void setSmartContractBytes(byte[] smartContractBytes) {
        this.smartContractBytes = smartContractBytes;
    }


    @Override
    public String toString() {
        return "TransactionFlowData{" + ", id=" + innerId +
                ", source=" + Arrays.toString(source) +
                ", target=" + Arrays.toString(target) +
                ", amount=" + amount +
                "offeredMaxFee16Bits=" + offeredMaxFee16Bits +
                ", signature=" + Arrays.toString(signature) +
                '}';
    }
}