package com.yalla.yalla.model;

import androidx.compose.animation.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/VipCreateOrderResultModel;", "", "orderId", "", "aToken", "isVIP", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAToken", "()Ljava/lang/String;", "()Z", "getOrderId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VipCreateOrderResultModel {
    public static final int $stable = 0;

    @NotNull
    private final String aToken;
    private final boolean isVIP;

    @SerializedName("orderid")
    @NotNull
    private final String orderId;

    public VipCreateOrderResultModel() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ VipCreateOrderResultModel copy$default(VipCreateOrderResultModel vipCreateOrderResultModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipCreateOrderResultModel.orderId;
        }
        if ((i & 2) != 0) {
            str2 = vipCreateOrderResultModel.aToken;
        }
        if ((i & 4) != 0) {
            z = vipCreateOrderResultModel.isVIP;
        }
        return vipCreateOrderResultModel.copy(str, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAToken() {
        return this.aToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVIP() {
        return this.isVIP;
    }

    @NotNull
    public final VipCreateOrderResultModel copy(@NotNull String orderId, @NotNull String aToken, boolean isVIP) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(aToken, "aToken");
        return new VipCreateOrderResultModel(orderId, aToken, isVIP);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipCreateOrderResultModel)) {
            return false;
        }
        VipCreateOrderResultModel vipCreateOrderResultModel = (VipCreateOrderResultModel) other;
        return Intrinsics.areEqual(this.orderId, vipCreateOrderResultModel.orderId) && Intrinsics.areEqual(this.aToken, vipCreateOrderResultModel.aToken) && this.isVIP == vipCreateOrderResultModel.isVIP;
    }

    @NotNull
    public final String getAToken() {
        return this.aToken;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iOooO00o = OooO0O0.OooO00o(this.aToken, this.orderId.hashCode() * 31, 31);
        boolean z = this.isVIP;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iOooO00o + r1;
    }

    public final boolean isVIP() {
        return this.isVIP;
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.aToken;
        boolean z = this.isVIP;
        StringBuilder sbOooO00o = OooO0OO.OooO00o("VipCreateOrderResultModel(orderId=", str, ", aToken=", str2, ", isVIP=");
        sbOooO00o.append(z);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public VipCreateOrderResultModel(@NotNull String orderId, @NotNull String aToken, boolean z) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(aToken, "aToken");
        this.orderId = orderId;
        this.aToken = aToken;
        this.isVIP = z;
    }

    public /* synthetic */ VipCreateOrderResultModel(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
