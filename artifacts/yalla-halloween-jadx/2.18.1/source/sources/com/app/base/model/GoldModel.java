package com.app.base.model;

/* JADX INFO: loaded from: classes.dex */
public class GoldModel extends CommonModel {
    private String amount;
    private String tradedate;
    private long tradetimesp;
    private String type;

    public String getAmount() {
        return this.amount;
    }

    public String getTradedate() {
        return this.tradedate;
    }

    public long getTradetimesp() {
        return this.tradetimesp;
    }

    public String getType() {
        return this.type;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setTradedate(String str) {
        this.tradedate = str;
    }

    public void setTradetimesp(long j) {
        this.tradetimesp = j;
    }

    public void setType(String str) {
        this.type = str;
    }
}
