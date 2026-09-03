package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class GiftSendAllModel extends AbsJavaBean {
    private int giftid;
    private int number;
    private int totalnumber;

    public GiftSendAllModel(int i, int i2, int i3) {
        this.giftid = i;
        this.number = i2;
        this.totalnumber = i3;
    }

    public int getGiftId() {
        return this.giftid;
    }

    public int getNumber() {
        return this.number;
    }

    public int getTotalnumber() {
        return this.totalnumber;
    }
}
