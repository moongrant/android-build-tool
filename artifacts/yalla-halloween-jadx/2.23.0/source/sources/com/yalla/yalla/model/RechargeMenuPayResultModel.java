package com.yalla.yalla.model;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\b¨\u00061"}, d2 = {"Lcom/yalla/yalla/model/RechargeMenuPayResultModel;", "", "()V", "accountFlag", "", "getAccountFlag", "()I", "setAccountFlag", "(I)V", "errorCode", "getErrorCode", "setErrorCode", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "isAcknowledged", "", "()Z", "setAcknowledged", "(Z)V", "isSubscription", "setSubscription", "isSuccess", "setSuccess", "orderid", "getOrderid", "setOrderid", "purchaseState", "getPurchaseState", "setPurchaseState", "purchasetoken", "getPurchasetoken", "setPurchasetoken", "sku", "getSku", "setSku", "subscriptionId", "getSubscriptionId", "setSubscriptionId", "subscriptionOrderId", "getSubscriptionOrderId", "setSubscriptionOrderId", "type", "getType", "setType", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RechargeMenuPayResultModel {
    public static final int $stable = 8;
    private int accountFlag;
    private boolean isAcknowledged;
    private boolean isSubscription;
    private boolean isSuccess;
    private int purchaseState;
    private int type;

    @NotNull
    private String errorMessage = "";
    private int errorCode = -103;

    @NotNull
    private String orderid = "";

    @NotNull
    private String purchasetoken = "";

    @NotNull
    private String sku = "";

    @NotNull
    private String subscriptionId = "";

    @NotNull
    private String subscriptionOrderId = "";

    public final int getAccountFlag() {
        return this.accountFlag;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getOrderid() {
        return this.orderid;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    @NotNull
    public final String getPurchasetoken() {
        return this.purchasetoken;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @NotNull
    public final String getSubscriptionOrderId() {
        return this.subscriptionOrderId;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isAcknowledged, reason: from getter */
    public final boolean getIsAcknowledged() {
        return this.isAcknowledged;
    }

    /* JADX INFO: renamed from: isSubscription, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setAccountFlag(int i) {
        this.accountFlag = i;
    }

    public final void setAcknowledged(boolean z) {
        this.isAcknowledged = z;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setOrderid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderid = str;
    }

    public final void setPurchaseState(int i) {
        this.purchaseState = i;
    }

    public final void setPurchasetoken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchasetoken = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setSubscription(boolean z) {
        this.isSubscription = z;
    }

    public final void setSubscriptionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriptionId = str;
    }

    public final void setSubscriptionOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriptionOrderId = str;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        int i = this.type;
        boolean z = this.isSuccess;
        String str = this.errorMessage;
        int i2 = this.errorCode;
        String str2 = this.orderid;
        String str3 = this.purchasetoken;
        int i3 = this.purchaseState;
        boolean z2 = this.isAcknowledged;
        int i4 = this.accountFlag;
        String str4 = this.sku;
        boolean z3 = this.isSubscription;
        String str5 = this.subscriptionId;
        String str6 = this.subscriptionOrderId;
        StringBuilder sb = new StringBuilder("RechargeMenuPayResultModel(type=");
        sb.append(i);
        sb.append(", isSuccess=");
        sb.append(z);
        sb.append(", errorMessage='");
        sb.append(str);
        sb.append("', errorCode=");
        sb.append(i2);
        sb.append(", orderid='");
        OooO0O0.OooO00o(sb, str2, "', purchasetoken='", str3, "', purchaseState=");
        sb.append(i3);
        sb.append(", isAcknowledged=");
        sb.append(z2);
        sb.append(", accountFlag=");
        sb.append(i4);
        sb.append(", sku='");
        sb.append(str4);
        sb.append("', isSubscription=");
        sb.append(z3);
        sb.append(", subscriptionId='");
        sb.append(str5);
        sb.append("', subscriptionOrderId='");
        return o0O00o0.OooO0O0(sb, str6, "')");
    }
}
