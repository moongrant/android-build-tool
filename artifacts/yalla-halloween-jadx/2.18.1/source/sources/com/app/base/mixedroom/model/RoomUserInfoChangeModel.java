package com.app.base.mixedroom.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class RoomUserInfoChangeModel extends RoomCommonModel {
    private int HeadWearExpired;
    public String carimg;
    public String carsvga;
    public int kaVipLv;
    public int kaVipState;
    private Long prettyid;
    private Long priority;
    public int showKAVIP;
    public int showPremiumFirst;
    private long uid;
    private Long vehicle;
    public int vehicleid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private Long viplevel;

    public String getCarImg() {
        return this.carimg;
    }

    public String getCarSvga() {
        return this.carsvga;
    }

    public int getHeadWearExpired() {
        return this.HeadWearExpired;
    }

    public Long getPrettyid() {
        return this.prettyid;
    }

    public Long getPriority() {
        return this.priority;
    }

    public long getUid() {
        return this.uid;
    }

    public Long getVehicle() {
        return this.vehicle;
    }

    public int getVehicleId() {
        return this.vehicleid;
    }

    public int getVip() {
        return this.vip;
    }

    public Long getViplevel() {
        return this.viplevel;
    }
}
