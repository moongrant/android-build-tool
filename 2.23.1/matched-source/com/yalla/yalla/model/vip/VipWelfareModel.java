package com.yalla.yalla.model.vip;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.OooO00o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.user.PreConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010:\u001a\u00020\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010\u000bR\u001e\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000bR \u0010.\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\"\u00101\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00107\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u000b¨\u0006<"}, d2 = {"Lcom/yalla/yalla/model/vip/VipWelfareModel;", "", "()V", "_isEnable", "Landroidx/compose/runtime/MutableState;", "", "exchangeLevel", "", "getExchangeLevel", "()I", "setExchangeLevel", "(I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isEnable", "()Z", "setEnable", "(Z)V", "isLimitNum", "setLimitNum", "limitDay", "", "getLimitDay", "()J", "setLimitDay", "(J)V", "outFitConfig", "", "getOutFitConfig", "()Ljava/lang/String;", "setOutFitConfig", "(Ljava/lang/String;)V", "picUrl", "getPicUrl", "setPicUrl", "preConfig", "Lcom/yalla/yalla/model/user/PreConfig;", "getPreConfig", "()Lcom/yalla/yalla/model/user/PreConfig;", "setPreConfig", "(Lcom/yalla/yalla/model/user/PreConfig;)V", "price", "getPrice", "setPrice", "shopId", "getShopId", "setShopId", "shopName", "getShopName", "setShopName", "shopType", "getShopType", "()Ljava/lang/Integer;", "setShopType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "timeLong", "getTimeLong", "setTimeLong", "parsePreConfig", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VipWelfareModel {
    public static final int ChatBox = 8;
    public static final int EntryEffect = 9;
    public static final int GIFT = 1000;
    public static final int HeadCard = 5;
    public static final int ProfileCard = 10;
    public static final int RoomTheme = 6;
    public static final int Vehicles = 7;

    @SerializedName("preConfig")
    @Nullable
    private String outFitConfig;

    @Nullable
    private transient PreConfig preConfig;

    @SerializedName("price")
    private int price;

    @SerializedName("id")
    private int shopId;

    @SerializedName("shopName")
    @Nullable
    private String shopName;

    @SerializedName("shopType")
    @Nullable
    private Integer shopType;
    public static final int $stable = 8;

    @SerializedName("timeLong")
    private int timeLong = -1;

    @SerializedName("exchangeLevel")
    private int exchangeLevel = -1;

    @SerializedName("isLimitNum")
    private boolean isLimitNum = true;

    @SerializedName("isEnable")
    private boolean isEnable = true;

    @NotNull
    private transient MutableState<Boolean> _isEnable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @SerializedName("limitDay")
    private long limitDay = -1;

    @SerializedName("picUrl")
    @NotNull
    private String picUrl = "";

    public final int getExchangeLevel() {
        return this.exchangeLevel;
    }

    public final long getLimitDay() {
        return this.limitDay;
    }

    @Nullable
    public final String getOutFitConfig() {
        return this.outFitConfig;
    }

    @NotNull
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final PreConfig getPreConfig() {
        return this.preConfig;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getShopId() {
        return this.shopId;
    }

    @Nullable
    public final String getShopName() {
        return this.shopName;
    }

    @Nullable
    public final Integer getShopType() {
        return this.shopType;
    }

    public final int getTimeLong() {
        return this.timeLong;
    }

    public final boolean isEnable() {
        if (this.isEnable != this._isEnable.getValue().booleanValue()) {
            this._isEnable.setValue(Boolean.valueOf(this.isEnable));
        }
        return this._isEnable.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: isLimitNum, reason: from getter */
    public final boolean getIsLimitNum() {
        return this.isLimitNum;
    }

    @NotNull
    public final VipWelfareModel parsePreConfig() {
        String str = this.outFitConfig;
        if (!(str == null || StringsKt.isBlank(str))) {
            Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f13217OooO00o;
            String str2 = this.outFitConfig;
            Intrinsics.checkNotNull(str2);
            this.preConfig = (PreConfig) OooO00o.OooO0OO(PreConfig.class, str2);
        }
        return this;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
        this._isEnable.setValue(Boolean.valueOf(z));
    }

    public final void setExchangeLevel(int i) {
        this.exchangeLevel = i;
    }

    public final void setLimitDay(long j) {
        this.limitDay = j;
    }

    public final void setLimitNum(boolean z) {
        this.isLimitNum = z;
    }

    public final void setOutFitConfig(@Nullable String str) {
        this.outFitConfig = str;
    }

    public final void setPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picUrl = str;
    }

    public final void setPreConfig(@Nullable PreConfig preConfig) {
        this.preConfig = preConfig;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setShopId(int i) {
        this.shopId = i;
    }

    public final void setShopName(@Nullable String str) {
        this.shopName = str;
    }

    public final void setShopType(@Nullable Integer num) {
        this.shopType = num;
    }

    public final void setTimeLong(int i) {
        this.timeLong = i;
    }
}
