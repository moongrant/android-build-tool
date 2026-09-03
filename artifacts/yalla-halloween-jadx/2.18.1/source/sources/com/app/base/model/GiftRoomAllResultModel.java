package com.app.base.model;

import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GiftRoomAllResultModel {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public int f11867code;
    public long coin;
    public long crystal;
    public RoomUserInfoModel from;

    @SerializedName(alternate = {"giftisaudio"}, value = "giftsaudio")
    public boolean giftIsAudio;

    @SerializedName("gifturl")
    public String giftUrl;

    @SerializedName("giftmedia")
    public String giftVideoUrl;
    public int giftid;
    public long luckyflag;
    public ArrayList<LuckyInstancesModel> luckyinstances;
    public long luckymoney;
    public long luckymultiple;
    public long luckynum;
    public int successnum;

    @SerializedName("type")
    public int type;

    @SerializedName(alternate = {"gifttype"}, value = "giftusertype")
    public int giftUserType = 0;
    public String uuid = "";
}
