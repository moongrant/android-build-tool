package com.yalla.yalla.mixedroom.model;

/* JADX INFO: loaded from: classes4.dex */
public class RoomNationalModel extends RoomCommonModel {
    private long expire;
    private String reason;

    public long getExpire() {
        return this.expire;
    }

    public String getReason() {
        return this.reason;
    }

    public void setExpire(long j) {
        this.expire = j;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
