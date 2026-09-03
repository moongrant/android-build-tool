package com.yalla.yalla.model;

import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class PostUserModel extends AbsJavaBean {
    private String headurl;
    public int kaVIPLv;
    private String nickname;
    private int role;
    private int sex;
    private long userid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName("nVIPLv")
    private int vipLevel;
    public int wealthLevel = 0;
    public String wealthBadgeImage = "";

    public String getHeadurl() {
        return this.headurl;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getRole() {
        return this.role;
    }

    public int getSex() {
        return this.sex;
    }

    public long getUserid() {
        return this.userid;
    }

    public int getVip() {
        return this.vip;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public void setHeadurl(String str) {
        this.headurl = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRole(int i) {
        this.role = i;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public void setUserid(long j) {
        this.userid = j;
    }

    public void setVip(int i) {
        this.vip = i;
    }

    public void setVipLevel(int i) {
        this.vipLevel = i;
    }
}
