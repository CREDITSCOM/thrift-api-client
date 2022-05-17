package com.credits.client.node.pojo;

import java.io.Serializable;


public class TransactionIdData implements Serializable {

    private static final long serialVersionUID = -4240471143007475693L;
    public long poolSequence;
    public int index;

    public TransactionIdData() {
    }

    public TransactionIdData(long poolSequence, int index) {
        this.poolSequence = poolSequence;
        this.index = index;
    }

    public long getPoolSequence() {
        return poolSequence;
    }

    public void setPoolHash(long poolSequence) {
        this.poolSequence = poolSequence;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
