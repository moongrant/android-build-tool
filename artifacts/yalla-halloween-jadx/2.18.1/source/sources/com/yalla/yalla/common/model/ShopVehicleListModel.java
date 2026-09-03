package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00109\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\u001a\u00106\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0010\"\u0004\b8\u0010\u0012¨\u0006;"}, d2 = {"Lcom/yalla/yalla/common/model/ShopVehicleListModel;", "", "()V", "dayNum", "", "getDayNum", "()J", "setDayNum", "(J)V", "isFreeze", "", "()Z", "setFreeze", "(Z)V", "isHave", "", "()I", "setHave", "(I)V", "isSelected", "setSelected", "limitNum", "getLimitNum", "setLimitNum", "nVehicleTagType", "getNVehicleTagType", "setNVehicleTagType", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "pic", "getPic", "setPic", "picDynamic", "getPicDynamic", "setPicDynamic", "price", "getPrice", "setPrice", "promotionPrice", "getPromotionPrice", "setPromotionPrice", "shopId", "getShopId", "setShopId", "timeLong", "getTimeLong", "setTimeLong", "vehicleTag", "getVehicleTag", "setVehicleTag", "vehicleTagType", "getVehicleTagType", "setVehicleTagType", "getPrices", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShopVehicleListModel {
    public static final int IsHave_No = 0;
    public static final int IsHave_Yes = 1;
    public static final long TimeLong_Permanent = -1;
    public static final int VehicleTagType_Activity_Buy = 10;
    public static final int VehicleTagType_Activity_NotBuy = 11;
    public static final int VehicleTagType_Default = 0;
    public static final int VehicleTagType_Vip300 = 300;
    public static final int VehicleTagType_Vip400 = 400;
    public static final int VehicleTagType_Vip500 = 500;

    @SerializedName("daynum")
    private long dayNum;
    private boolean isFreeze;

    @SerializedName("ishave")
    private int isHave;
    private boolean isSelected;

    @SerializedName("limitnum")
    private long limitNum;
    private int nVehicleTagType;
    private long price;

    @SerializedName("promotionprice")
    private long promotionPrice;

    @SerializedName("shopid")
    private long shopId;

    @SerializedName("timelong")
    private long timeLong;
    private int vehicleTagType;
    public static final int $stable = 8;

    @NotNull
    private String name = "";

    @NotNull
    private String pic = "";

    @NotNull
    private String picDynamic = "";

    @NotNull
    private String vehicleTag = "";

    public final long getDayNum() {
        return this.dayNum;
    }

    public final long getLimitNum() {
        return this.limitNum;
    }

    public final int getNVehicleTagType() {
        return this.nVehicleTagType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    @NotNull
    public final String getPicDynamic() {
        return this.picDynamic;
    }

    public final long getPrice() {
        return this.price;
    }

    public final long getPrices() {
        long j = this.price;
        long j2 = this.promotionPrice;
        return (j <= j2 || j2 <= 0) ? j : j2;
    }

    public final long getPromotionPrice() {
        return this.promotionPrice;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public final long getTimeLong() {
        return this.timeLong;
    }

    @NotNull
    public final String getVehicleTag() {
        return this.vehicleTag;
    }

    public final int getVehicleTagType() {
        return this.vehicleTagType;
    }

    /* JADX INFO: renamed from: isFreeze, reason: from getter */
    public final boolean getIsFreeze() {
        return this.isFreeze;
    }

    /* JADX INFO: renamed from: isHave, reason: from getter */
    public final int getIsHave() {
        return this.isHave;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setDayNum(long j) {
        this.dayNum = j;
    }

    public final void setFreeze(boolean z) {
        this.isFreeze = z;
    }

    public final void setHave(int i) {
        this.isHave = i;
    }

    public final void setLimitNum(long j) {
        this.limitNum = j;
    }

    public final void setNVehicleTagType(int i) {
        this.nVehicleTagType = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setPicDynamic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picDynamic = str;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setPromotionPrice(long j) {
        this.promotionPrice = j;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShopId(long j) {
        this.shopId = j;
    }

    public final void setTimeLong(long j) {
        this.timeLong = j;
    }

    public final void setVehicleTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vehicleTag = str;
    }

    public final void setVehicleTagType(int i) {
        this.vehicleTagType = i;
    }
}
