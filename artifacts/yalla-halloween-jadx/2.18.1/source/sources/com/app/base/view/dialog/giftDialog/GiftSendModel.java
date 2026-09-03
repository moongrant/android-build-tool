package com.app.base.view.dialog.giftDialog;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class GiftSendModel extends AbsJavaBean {
    private int giftId;
    private String giftUrl;
    private int number;
    private long toId;

    public GiftSendModel(long j, int i, int i2) {
        this.toId = j;
        this.giftId = i;
        this.number = i2;
    }

    public int getGiftId() {
        return this.giftId;
    }

    public String getGiftUrl() {
        return this.giftUrl;
    }

    public int getNumber() {
        return this.number;
    }

    public long getToId() {
        return this.toId;
    }

    public GiftSendModel(long j, int i, int i2, String str) {
        this.toId = j;
        this.giftId = i;
        this.number = i2;
        this.giftUrl = str;
    }
}
