package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p069o0000ooO.o0OO00O;
import p082o000OoOo.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u0019\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018¨\u0006>"}, d2 = {"Lcom/yalla/yalla/model/SignTaskModel;", "", "takeId", "", "icon", "name", "getcrystal", "", "state", "typeName", "num", "maxNum", "rewardCoin", "rewardType", "isOneTime", "rewardMultiple", "(IIILjava/lang/String;IIIIIIII)V", "getGetcrystal", "()Ljava/lang/String;", "setGetcrystal", "(Ljava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "setOneTime", "getMaxNum", "setMaxNum", "getName", "setName", "getNum", "setNum", "getRewardCoin", "setRewardCoin", "getRewardMultiple", "setRewardMultiple", "getRewardType", "setRewardType", "getState", "setState", "getTakeId", "setTakeId", "getTypeName", "setTypeName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @SerializedName("takeid")
    private int takeId;
    private int typeName;

    public SignTaskModel() {
        this(0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTakeId() {
        return this.takeId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIsOneTime() {
        return this.isOneTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
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

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGetcrystal() {
        return this.getcrystal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTypeName() {
        return this.typeName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxNum() {
        return this.maxNum;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getRewardCoin() {
        return this.rewardCoin;
    }

    @NotNull
    public final SignTaskModel copy(int takeId, int icon, int name, @NotNull String getcrystal, int state, int typeName, int num, int maxNum, int rewardCoin, int rewardType, int isOneTime, int rewardMultiple) {
        Intrinsics.checkNotNullParameter(getcrystal, "getcrystal");
        return new SignTaskModel(takeId, icon, name, getcrystal, state, typeName, num, maxNum, rewardCoin, rewardType, isOneTime, rewardMultiple);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignTaskModel)) {
            return false;
        }
        SignTaskModel signTaskModel = (SignTaskModel) other;
        return this.takeId == signTaskModel.takeId && this.icon == signTaskModel.icon && this.name == signTaskModel.name && Intrinsics.areEqual(this.getcrystal, signTaskModel.getcrystal) && this.state == signTaskModel.state && this.typeName == signTaskModel.typeName && this.num == signTaskModel.num && this.maxNum == signTaskModel.maxNum && this.rewardCoin == signTaskModel.rewardCoin && this.rewardType == signTaskModel.rewardType && this.isOneTime == signTaskModel.isOneTime && this.rewardMultiple == signTaskModel.rewardMultiple;
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

    public final int getTakeId() {
        return this.takeId;
    }

    public final int getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return ((((((((((((((o0OO00O.OooO00o(this.getcrystal, ((((this.takeId * 31) + this.icon) * 31) + this.name) * 31, 31) + this.state) * 31) + this.typeName) * 31) + this.num) * 31) + this.maxNum) * 31) + this.rewardCoin) * 31) + this.rewardType) * 31) + this.isOneTime) * 31) + this.rewardMultiple;
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
        String str = this.getcrystal;
        int i4 = this.state;
        int i5 = this.typeName;
        int i6 = this.num;
        int i7 = this.maxNum;
        int i8 = this.rewardCoin;
        int i9 = this.rewardType;
        int i10 = this.isOneTime;
        int i11 = this.rewardMultiple;
        StringBuilder sbOooO00o = o00000.OooO00o("SignTaskModel(takeId=", i, ", icon=", i2, ", name=");
        sbOooO00o.append(i3);
        sbOooO00o.append(", getcrystal=");
        sbOooO00o.append(str);
        sbOooO00o.append(", state=");
        OooOOO0.OooO00o(sbOooO00o, i4, ", typeName=", i5, ", num=");
        OooOOO0.OooO00o(sbOooO00o, i6, ", maxNum=", i7, ", rewardCoin=");
        OooOOO0.OooO00o(sbOooO00o, i8, ", rewardType=", i9, ", isOneTime=");
        sbOooO00o.append(i10);
        sbOooO00o.append(", rewardMultiple=");
        sbOooO00o.append(i11);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public SignTaskModel(int i, int i2, int i3, @NotNull String getcrystal, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(getcrystal, "getcrystal");
        this.takeId = i;
        this.icon = i2;
        this.name = i3;
        this.getcrystal = getcrystal;
        this.state = i4;
        this.typeName = i5;
        this.num = i6;
        this.maxNum = i7;
        this.rewardCoin = i8;
        this.rewardType = i9;
        this.isOneTime = i10;
        this.rewardMultiple = i11;
    }

    public /* synthetic */ SignTaskModel(int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? 0 : i2, (i12 & 4) != 0 ? 0 : i3, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? 0 : i4, (i12 & 32) != 0 ? 0 : i5, (i12 & 64) != 0 ? -1 : i6, (i12 & 128) != 0 ? 0 : i7, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i8, (i12 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0 : i9, (i12 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i10, (i12 & 2048) == 0 ? i11 : 0);
    }
}
