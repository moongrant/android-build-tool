package com.yalla.yalla.model.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010 \u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR \u0010&\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR \u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\"\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R\u001e\u00104\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001e\u00107\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u000bR \u0010:\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\bA\u0010\u0014\"\u0004\bB\u0010\u0016R\"\u0010C\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\bD\u0010\u0014\"\u0004\bE\u0010\u0016R&\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00058F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010R \u0010J\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\t\"\u0004\bL\u0010\u000bR\u001e\u0010M\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001a\"\u0004\bO\u0010\u001cR \u0010P\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\t\"\u0004\bR\u0010\u000bR\"\u0010S\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\bT\u0010\u0014\"\u0004\bU\u0010\u0016R\"\u0010V\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\bW\u0010\u0014\"\u0004\bX\u0010\u0016¨\u0006Y"}, d2 = {"Lcom/yalla/yalla/model/user/UserMyOutFitModel;", "", "()V", "_isSelected", "Landroidx/compose/runtime/MutableState;", "", "backgroundUrl", "", "getBackgroundUrl", "()Ljava/lang/String;", "setBackgroundUrl", "(Ljava/lang/String;)V", "canBuy", "getCanBuy", "()Z", "setCanBuy", "(Z)V", "canBuyUserType", "", "getCanBuyUserType", "()Ljava/lang/Integer;", "setCanBuyUserType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dayNum", "getDayNum", "()I", "setDayNum", "(I)V", "exclusiveVip", "getExclusiveVip", "setExclusiveVip", "flagType", "getFlagType", "setFlagType", "frozenDay", "getFrozenDay", "setFrozenDay", "getTime", "getGetTime", "setGetTime", "h5Url", "getH5Url", "setH5Url", "isHave", "()Ljava/lang/Boolean;", "setHave", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "obtainLevel", "getObtainLevel", "setObtainLevel", "obtainType", "getObtainType", "setObtainType", "picUrl", "getPicUrl", "setPicUrl", "preConfig", "Lcom/yalla/yalla/model/user/PreConfig;", "getPreConfig", "()Lcom/yalla/yalla/model/user/PreConfig;", "setPreConfig", "(Lcom/yalla/yalla/model/user/PreConfig;)V", "price", "getPrice", "setPrice", "promotionPrice", "getPromotionPrice", "setPromotionPrice", AppMeasurementSdk.ConditionalUserProperty.VALUE, "selected", "getSelected", "setSelected", "shopDesc", "getShopDesc", "setShopDesc", "shopId", "getShopId", "setShopId", "shopName", "getShopName", "setShopName", "timeLong", "getTimeLong", "setTimeLong", "waresId", "getWaresId", "setWaresId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class UserMyOutFitModel {
    public static final int $stable = 8;

    @SerializedName("backgroundUrl")
    @Nullable
    private String backgroundUrl;

    @SerializedName("canBuy")
    private boolean canBuy;

    @SerializedName("canBuyUserType")
    @Nullable
    private Integer canBuyUserType;

    @SerializedName("dayNum")
    private int dayNum;

    @SerializedName("exclusiveVip")
    @Nullable
    private Integer exclusiveVip;

    @SerializedName("flagType")
    @Nullable
    private Integer flagType;

    @SerializedName("frozenDay")
    private int frozenDay;

    @SerializedName("getTime")
    @Nullable
    private String getTime;

    @SerializedName("h5Url")
    @Nullable
    private String h5Url;

    @SerializedName("isHave")
    @Nullable
    private Boolean isHave;

    @SerializedName("obtainLevel")
    @Nullable
    private Integer obtainLevel;

    @SerializedName("obtainType")
    private int obtainType;

    @SerializedName("preConfig")
    @Nullable
    private PreConfig preConfig;

    @SerializedName("price")
    @Nullable
    private Integer price;

    @SerializedName("promotionPrice")
    @Nullable
    private Integer promotionPrice;

    @SerializedName("selected")
    private boolean selected;

    @SerializedName("shopDesc")
    @Nullable
    private String shopDesc;

    @SerializedName("shopId")
    private int shopId;

    @SerializedName("shopName")
    @Nullable
    private String shopName;

    @SerializedName("timeLong")
    @Nullable
    private Integer timeLong;

    @SerializedName("waresId")
    @Nullable
    private Integer waresId;

    @SerializedName("picUrl")
    @NotNull
    private String picUrl = "";

    @NotNull
    private transient MutableState<Boolean> _isSelected = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Nullable
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final boolean getCanBuy() {
        return this.canBuy;
    }

    @Nullable
    public final Integer getCanBuyUserType() {
        return this.canBuyUserType;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    @Nullable
    public final Integer getExclusiveVip() {
        return this.exclusiveVip;
    }

    @Nullable
    public final Integer getFlagType() {
        return this.flagType;
    }

    public final int getFrozenDay() {
        return this.frozenDay;
    }

    @Nullable
    public final String getGetTime() {
        return this.getTime;
    }

    @Nullable
    public final String getH5Url() {
        return this.h5Url;
    }

    @Nullable
    public final Integer getObtainLevel() {
        return this.obtainLevel;
    }

    public final int getObtainType() {
        return this.obtainType;
    }

    @NotNull
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final PreConfig getPreConfig() {
        return this.preConfig;
    }

    @Nullable
    public final Integer getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getPromotionPrice() {
        return this.promotionPrice;
    }

    public final boolean getSelected() {
        if (this.selected != this._isSelected.getValue().booleanValue()) {
            this._isSelected.setValue(Boolean.valueOf(this.selected));
        }
        return this._isSelected.getValue().booleanValue();
    }

    @Nullable
    public final String getShopDesc() {
        return this.shopDesc;
    }

    public final int getShopId() {
        return this.shopId;
    }

    @Nullable
    public final String getShopName() {
        return this.shopName;
    }

    @Nullable
    public final Integer getTimeLong() {
        return this.timeLong;
    }

    @Nullable
    public final Integer getWaresId() {
        return this.waresId;
    }

    @Nullable
    /* JADX INFO: renamed from: isHave, reason: from getter */
    public final Boolean getIsHave() {
        return this.isHave;
    }

    public final void setBackgroundUrl(@Nullable String str) {
        this.backgroundUrl = str;
    }

    public final void setCanBuy(boolean z) {
        this.canBuy = z;
    }

    public final void setCanBuyUserType(@Nullable Integer num) {
        this.canBuyUserType = num;
    }

    public final void setDayNum(int i) {
        this.dayNum = i;
    }

    public final void setExclusiveVip(@Nullable Integer num) {
        this.exclusiveVip = num;
    }

    public final void setFlagType(@Nullable Integer num) {
        this.flagType = num;
    }

    public final void setFrozenDay(int i) {
        this.frozenDay = i;
    }

    public final void setGetTime(@Nullable String str) {
        this.getTime = str;
    }

    public final void setH5Url(@Nullable String str) {
        this.h5Url = str;
    }

    public final void setHave(@Nullable Boolean bool) {
        this.isHave = bool;
    }

    public final void setObtainLevel(@Nullable Integer num) {
        this.obtainLevel = num;
    }

    public final void setObtainType(int i) {
        this.obtainType = i;
    }

    public final void setPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picUrl = str;
    }

    public final void setPreConfig(@Nullable PreConfig preConfig) {
        this.preConfig = preConfig;
    }

    public final void setPrice(@Nullable Integer num) {
        this.price = num;
    }

    public final void setPromotionPrice(@Nullable Integer num) {
        this.promotionPrice = num;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
        this._isSelected.setValue(Boolean.valueOf(z));
    }

    public final void setShopDesc(@Nullable String str) {
        this.shopDesc = str;
    }

    public final void setShopId(int i) {
        this.shopId = i;
    }

    public final void setShopName(@Nullable String str) {
        this.shopName = str;
    }

    public final void setTimeLong(@Nullable Integer num) {
        this.timeLong = num;
    }

    public final void setWaresId(@Nullable Integer num) {
        this.waresId = num;
    }
}
