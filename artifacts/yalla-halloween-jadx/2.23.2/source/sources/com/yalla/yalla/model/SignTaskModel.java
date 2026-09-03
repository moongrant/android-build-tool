package com.yalla.yalla.model;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O0Oo.OooOOO0;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019¨\u0006B"}, d2 = {"Lcom/yalla/yalla/model/SignTaskModel;", "", "takeId", "", "icon", "name", "subtitle", "getcrystal", "", "state", "typeName", "num", "maxNum", "rewardCoin", "rewardType", "isOneTime", "rewardMultiple", "(IIIILjava/lang/String;IIIIIIII)V", "getGetcrystal", "()Ljava/lang/String;", "setGetcrystal", "(Ljava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "setOneTime", "getMaxNum", "setMaxNum", "getName", "setName", "getNum", "setNum", "getRewardCoin", "setRewardCoin", "getRewardMultiple", "setRewardMultiple", "getRewardType", "setRewardType", "getState", "setState", "getSubtitle", "setSubtitle", "getTakeId", "setTakeId", "getTypeName", "setTypeName", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SignTaskModel {
    public static final int $stable = 8;

    @NotNull
    private String getcrystal;
    private int icon;

    @SerializedName("isonetime")
    private int isOneTime;
    private int maxNum;
    private int name;
    private int num;
    private int rewardCoin;
    private int rewardMultiple;
    private int rewardType;
    private int state;
    private int subtitle;

    @SerializedName("takeid")
    private int takeId;
    private int typeName;

    public SignTaskModel() {
        this(0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTakeId() {
        return this.takeId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRewardCoin() {
        return this.rewardCoin;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getIsOneTime() {
        return this.isOneTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getRewardMultiple() {
        return this.rewardMultiple;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGetcrystal() {
        return this.getcrystal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTypeName() {
        return this.typeName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxNum() {
        return this.maxNum;
    }

    @NotNull
    public final SignTaskModel copy(int takeId, int icon, int name, int subtitle, @NotNull String getcrystal, int state, int typeName, int num, int maxNum, int rewardCoin, int rewardType, int isOneTime, int rewardMultiple) {
        Intrinsics.checkNotNullParameter(getcrystal, "getcrystal");
        return new SignTaskModel(takeId, icon, name, subtitle, getcrystal, state, typeName, num, maxNum, rewardCoin, rewardType, isOneTime, rewardMultiple);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignTaskModel)) {
            return false;
        }
        SignTaskModel signTaskModel = (SignTaskModel) other;
        return this.takeId == signTaskModel.takeId && this.icon == signTaskModel.icon && this.name == signTaskModel.name && this.subtitle == signTaskModel.subtitle && Intrinsics.areEqual(this.getcrystal, signTaskModel.getcrystal) && this.state == signTaskModel.state && this.typeName == signTaskModel.typeName && this.num == signTaskModel.num && this.maxNum == signTaskModel.maxNum && this.rewardCoin == signTaskModel.rewardCoin && this.rewardType == signTaskModel.rewardType && this.isOneTime == signTaskModel.isOneTime && this.rewardMultiple == signTaskModel.rewardMultiple;
    }

    @NotNull
    public final String getGetcrystal() {
        return this.getcrystal;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getMaxNum() {
        return this.maxNum;
    }

    public final int getName() {
        return this.name;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getRewardCoin() {
        return this.rewardCoin;
    }

    public final int getRewardMultiple() {
        return this.rewardMultiple;
    }

    public final int getRewardType() {
        return this.rewardType;
    }

    public final int getState() {
        return this.state;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getTakeId() {
        return this.takeId;
    }

    public final int getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return ((((((((((((((OooO0O0.OooO00o(this.getcrystal, ((((((this.takeId * 31) + this.icon) * 31) + this.name) * 31) + this.subtitle) * 31, 31) + this.state) * 31) + this.typeName) * 31) + this.num) * 31) + this.maxNum) * 31) + this.rewardCoin) * 31) + this.rewardType) * 31) + this.isOneTime) * 31) + this.rewardMultiple;
    }

    public final int isOneTime() {
        return this.isOneTime;
    }

    public final void setGetcrystal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.getcrystal = str;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setMaxNum(int i) {
        this.maxNum = i;
    }

    public final void setName(int i) {
        this.name = i;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setOneTime(int i) {
        this.isOneTime = i;
    }

    public final void setRewardCoin(int i) {
        this.rewardCoin = i;
    }

    public final void setRewardMultiple(int i) {
        this.rewardMultiple = i;
    }

    public final void setRewardType(int i) {
        this.rewardType = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSubtitle(int i) {
        this.subtitle = i;
    }

    public final void setTakeId(int i) {
        this.takeId = i;
    }

    public final void setTypeName(int i) {
        this.typeName = i;
    }

    @NotNull
    public String toString() {
        int i = this.takeId;
        int i2 = this.icon;
        int i3 = this.name;
        int i4 = this.subtitle;
        String str = this.getcrystal;
        int i5 = this.state;
        int i6 = this.typeName;
        int i7 = this.num;
        int i8 = this.maxNum;
        int i9 = this.rewardCoin;
        int i10 = this.rewardType;
        int i11 = this.isOneTime;
        int i12 = this.rewardMultiple;
        StringBuilder sbOooO00o = o00000.OooO00o("SignTaskModel(takeId=", i, ", icon=", i2, ", name=");
        OooOOO0.OooO00o(sbOooO00o, i3, ", subtitle=", i4, ", getcrystal=");
        sbOooO00o.append(str);
        sbOooO00o.append(", state=");
        sbOooO00o.append(i5);
        sbOooO00o.append(", typeName=");
        OooOOO0.OooO00o(sbOooO00o, i6, ", num=", i7, ", maxNum=");
        OooOOO0.OooO00o(sbOooO00o, i8, ", rewardCoin=", i9, ", rewardType=");
        OooOOO0.OooO00o(sbOooO00o, i10, ", isOneTime=", i11, ", rewardMultiple=");
        return OooOO0.OooO00o(sbOooO00o, i12, ")");
    }

    public SignTaskModel(int i, int i2, int i3, int i4, @NotNull String getcrystal, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(getcrystal, "getcrystal");
        this.takeId = i;
        this.icon = i2;
        this.name = i3;
        this.subtitle = i4;
        this.getcrystal = getcrystal;
        this.state = i5;
        this.typeName = i6;
        this.num = i7;
        this.maxNum = i8;
        this.rewardCoin = i9;
        this.rewardType = i10;
        this.isOneTime = i11;
        this.rewardMultiple = i12;
    }

    public /* synthetic */ SignTaskModel(int i, int i2, int i3, int i4, String str, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? 0 : i3, (i13 & 8) != 0 ? 0 : i4, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? 0 : i5, (i13 & 64) != 0 ? 0 : i6, (i13 & 128) != 0 ? -1 : i7, (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i8, (i13 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0 : i9, (i13 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i10, (i13 & 2048) != 0 ? 0 : i11, (i13 & 4096) == 0 ? i12 : 0);
    }
}
