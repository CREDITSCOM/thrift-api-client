package com.credits.client.node.pojo;

import java.io.Serializable;


public class TransactionIdData implements Serializable {

    private static final long serialVersionUID = -4240471143007475693L;
    public long poolHash;
    public int index;

    public TransactionIdData() {
    }

    public TransactionIdData(long poolSequence, int index) {
        this.poolHash = poolSequence;
        this.index = index;
    }

    public long getPoolSequence() {
        return poolHash;
    }

    public void setPoolHash(long poolHash) {
        this.poolHash = poolHash;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
