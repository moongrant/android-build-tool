package com.yalla.yalla.model;

import com.app.base.bean.AbsJavaBean;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class MomentGift extends AbsJavaBean {
    private String headUrl;

    @SerializedName("nIsVIP")
    private int isVip;
    public int kaVIPLv;
    private String nickname;
    private int propId;
    private String propImage;
    private int propNum;
    private int sex;
    private long userId;

    @SerializedName("nVIPLv")
    private int vipLevel;

    public String getHeadUrl() {
        return this.headUrl;
    }

    public int getIsVip() {
        return this.isVip;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getPropId() {
        return this.propId;
    }

    public String getPropImage() {
        return this.propImage;
    }

    public int getPropNum() {
        return this.propNum;
    }

    public int getSex() {
        return this.sex;
    }

    public long getUserId() {
        return this.userId;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public void setHeadUrl(String str) {
        this.headUrl = str;
    }

    public void setIsVip(int i) {
        this.isVip = i;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPropId(int i) {
        this.propId = i;
    }

    public void setPropImage(String str) {
        this.propImage = str;
    }

    public void setPropNum(int i) {
        this.propNum = i;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    public void setVipLevel(int i) {
        this.vipLevel = i;
    }
}
