package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/common/model/RechargeMenuConfirmOrderModel;", "", "()V", "accountFlag", "", "getAccountFlag", "()I", "setAccountFlag", "(I)V", "orderId", "", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "purchaseToken", "getPurchaseToken", "setPurchaseToken", "sku", "getSku", "setSku", "type", "getType", "setType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RechargeMenuConfirmOrderModel {
    public static final int $stable = 8;
    private int accountFlag;

    @NotNull
    private String orderId = "";

    @NotNull
    private String purchaseToken = "";

    @NotNull
    private String sku = "";
    private int type;

    public final int getAccountFlag() {
        return this.accountFlag;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAccountFlag(int i) {
        this.accountFlag = i;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPurchaseToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseToken = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
