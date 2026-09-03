package com.app.base.model;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class PrivacySetModel extends AbsJavaBean {
    private int isWaterMark;
    private int isverify;
    private int seeinroom;
    private int seepost;
    private int seeroom;

    public int getIsWaterMark() {
        return this.isWaterMark;
    }

    public int getIsverify() {
        return this.isverify;
    }

    public int getSeeinroom() {
        return this.seeinroom;
    }

    public int getSeepost() {
        return this.seepost;
    }

    public int getSeeroom() {
        return this.seeroom;
    }

    public void setIsWaterMark(int i) {
        this.isWaterMark = i;
    }

    public void setIsverify(int i) {
        this.isverify = i;
    }

    public void setSeeinroom(int i) {
        this.seeinroom = i;
    }

    public void setSeepost(int i) {
        this.seepost = i;
    }

    public void setSeeroom(int i) {
        this.seeroom = i;
    }
}
