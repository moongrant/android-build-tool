package com.yalla.yalla.model;

/* JADX INFO: loaded from: classes4.dex */
public class BecomeMmemberModel {
    public String headphoto;
    private String nickname;
    private int result;
    private long userid;

    public String getNickname() {
        return this.nickname;
    }

    public int getResult() {
        return this.result;
    }

    public long getUserid() {
        return this.userid;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setUserid(long j) {
        this.userid = j;
    }
}
