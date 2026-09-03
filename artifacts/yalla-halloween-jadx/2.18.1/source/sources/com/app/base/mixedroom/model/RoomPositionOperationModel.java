package com.app.base.mixedroom.model;

/* JADX INFO: loaded from: classes.dex */
public class RoomPositionOperationModel extends RoomCommonModel {
    private int dues;
    public String headphoto;
    private long leftcoin;
    private String nickname;
    private int result;
    private int userid;

    public int getDues() {
        return this.dues;
    }

    public long getLeftcoin() {
        return this.leftcoin;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getResult() {
        return this.result;
    }

    public int getUserid() {
        return this.userid;
    }

    public void setDues(int i) {
        this.dues = i;
    }

    public void setLeftcoin(long j) {
        this.leftcoin = j;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setUserid(int i) {
        this.userid = i;
    }
}
