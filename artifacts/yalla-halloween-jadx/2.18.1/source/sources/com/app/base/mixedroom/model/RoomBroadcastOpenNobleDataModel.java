package com.app.base.mixedroom.model;

import com.app.base.bean.AbsJavaBean;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class RoomBroadcastOpenNobleDataModel extends AbsJavaBean {
    private int action;
    private String nickname;
    private int type;
    private String userid;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int viplevel;

    public int getAction() {
        return this.action;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getType() {
        return this.type;
    }

    public String getUserid() {
        return this.userid;
    }

    public int getViplevel() {
        return this.viplevel;
    }

    public RoomBroadcastOpenNobleDataModel initTestData(int i) {
        this.action = i;
        this.nickname = "";
        this.viplevel = 0;
        return this;
    }
}
