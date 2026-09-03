package com.yalla.yalla.ui.view.pop.memberFee;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class MemberFeeModel extends AbsJavaBean {
    private String content;
    private int fee;
    private int max;
    private int min;

    public MemberFeeModel(String str, int i, int i2, int i3) {
        this.content = str;
        this.fee = i;
        this.min = i2;
        this.max = i3;
    }

    public String getContent() {
        return this.content;
    }

    public int getFee() {
        return this.fee;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public MemberFeeModel setFee(int i) {
        this.fee = i;
        return this;
    }
}
