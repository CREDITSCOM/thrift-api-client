package com.credits.client.node.pojo;

import com.credits.general.thrift.generated.Variant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.List;


@Data
@NoArgsConstructor
public class TransactionData implements Serializable {
    private static final long serialVersionUID = 4706098158612315169L;
    protected long innerId;
    protected long blockNumber;
    protected int indexIntoBlock;
    protected byte[] source;
    protected byte[] target;
    protected BigDecimal amount;
    protected final byte currency = (byte) 1;
    protected byte[] commentBytes;
    protected String method;
    protected List<Variant> params;
    protected TransactionTypeData type;
    protected SmartTransInfoData smartInfo;
    protected List<ByteBuffer> usedContracts;
    protected long timeCreation;
    protected List<ExtraFeeData> extraFeeDataList;

    public TransactionData(long innerId, byte[] source, byte[] target, BigDecimal amount, TransactionTypeData type) {
        this.innerId = innerId;
        this.source = source;
        this.target = target;
        this.amount = amount;
        this.type = type;
    }
}
