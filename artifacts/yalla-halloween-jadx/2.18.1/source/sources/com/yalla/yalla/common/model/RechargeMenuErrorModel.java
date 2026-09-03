package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/common/model/RechargeMenuErrorModel;", "", ViewHierarchyConstants.TAG_KEY, "", "errorCode", "", "createTime", "", "(Ljava/lang/String;IJ)V", "getCreateTime", "()J", "getErrorCode", "()I", "orderId", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "sku", "getSku", "setSku", "getTag", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RechargeMenuErrorModel {
    public static final int $stable = 8;
    private final long createTime;
    private final int errorCode;

    @NotNull
    private String orderId;

    @NotNull
    private String sku;

    @NotNull
    private final String tag;

    public RechargeMenuErrorModel(@NotNull String tag, int i, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.errorCode = i;
        this.createTime = j;
        this.orderId = "";
        this.sku = "";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{tag='");
        sbOooO0o0.append(this.tag);
        sbOooO0o0.append("', createTime=");
        sbOooO0o0.append(this.createTime);
        sbOooO0o0.append(", orderId='");
        sbOooO0o0.append(this.orderId);
        sbOooO0o0.append("', sku='");
        sbOooO0o0.append(this.sku);
        sbOooO0o0.append("', errorCode='");
        return o0ooOOo.OooO00o(sbOooO0o0, this.errorCode, "'}");
    }

    public /* synthetic */ RechargeMenuErrorModel(String str, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? System.currentTimeMillis() : j);
    }
}
