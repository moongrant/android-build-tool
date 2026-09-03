package com.yalla.yalla.model.vip;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/vip/VipShopRecordModel;", "", "cTime", "", "pointVal", "typeDesc", "", "(JJLjava/lang/String;)V", "getCTime", "()J", "getPointVal", "getTypeDesc", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VipShopRecordModel {
    public static final int $stable = 0;

    @SerializedName("cTime")
    private final long cTime;

    @SerializedName("pointVal")
    private final long pointVal;

    @SerializedName("typeDesc")
    @NotNull
    private final String typeDesc;

    public VipShopRecordModel() {
        this(0L, 0L, null, 7, null);
    }

    public static /* synthetic */ VipShopRecordModel copy$default(VipShopRecordModel vipShopRecordModel, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vipShopRecordModel.cTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = vipShopRecordModel.pointVal;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = vipShopRecordModel.typeDesc;
        }
        return vipShopRecordModel.copy(j3, j4, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCTime() {
        return this.cTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPointVal() {
        return this.pointVal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTypeDesc() {
        return this.typeDesc;
    }

    @NotNull
    public final VipShopRecordModel copy(long cTime, long pointVal, @NotNull String typeDesc) {
        Intrinsics.checkNotNullParameter(typeDesc, "typeDesc");
        return new VipShopRecordModel(cTime, pointVal, typeDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipShopRecordModel)) {
            return false;
        }
        VipShopRecordModel vipShopRecordModel = (VipShopRecordModel) other;
        return this.cTime == vipShopRecordModel.cTime && this.pointVal == vipShopRecordModel.pointVal && Intrinsics.areEqual(this.typeDesc, vipShopRecordModel.typeDesc);
    }

    public final long getCTime() {
        return this.cTime;
    }

    public final long getPointVal() {
        return this.pointVal;
    }

    @NotNull
    public final String getTypeDesc() {
        return this.typeDesc;
    }

    public int hashCode() {
        long j = this.cTime;
        long j2 = this.pointVal;
        return this.typeDesc.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    @NotNull
    public String toString() {
        long j = this.cTime;
        long j2 = this.pointVal;
        String str = this.typeDesc;
        StringBuilder sbOooO00o = o00O0000.OooO00o("VipShopRecordModel(cTime=", j, ", pointVal=");
        sbOooO00o.append(j2);
        sbOooO00o.append(", typeDesc=");
        sbOooO00o.append(str);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public VipShopRecordModel(long j, long j2, @NotNull String typeDesc) {
        Intrinsics.checkNotNullParameter(typeDesc, "typeDesc");
        this.cTime = j;
        this.pointVal = j2;
        this.typeDesc = typeDesc;
    }

    public /* synthetic */ VipShopRecordModel(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? "" : str);
    }
}
