package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.facebook.AccessToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"order_id"})}, tableName = "PayOrderTable")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010B\u001a\u00020%H\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001e\u0010\"\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\u001e\u0010-\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001e\u00100\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001e\u00103\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u001e\u00106\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001e\u00109\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0013\"\u0004\b;\u0010\u0015R\u001e\u0010<\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010\u0015R\u001e\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000f¨\u0006C"}, d2 = {"Lcom/yalla/yalla/common/db/table/PayOrder;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/Double;", "setAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "createTime", "", "getCreateTime", "()J", "setCreateTime", "(J)V", "errorCode", "", "getErrorCode", "()I", "setErrorCode", "(I)V", "huaWeiAccountFlag", "getHuaWeiAccountFlag", "setHuaWeiAccountFlag", "isAcknowledged", "", "()Z", "setAcknowledged", "(Z)V", "isConsume", "setConsume", "isNewOrder", "setNewOrder", "isSubscription", "setSubscription", "orderId", "", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "purchaseState", "getPurchaseState", "setPurchaseState", "purchaseToken", "getPurchaseToken", "setPurchaseToken", "sku", "getSku", "setSku", "subscriptionId", "getSubscriptionId", "setSubscriptionId", "subscriptionOrderId", "getSubscriptionOrderId", "setSubscriptionOrderId", "subscriptionState", "getSubscriptionState", "setSubscriptionState", "type", "getType", "setType", "userId", "getUserId", "setUserId", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PayOrder {
    public static final int $stable = 8;

    @ColumnInfo(name = "amount")
    @Nullable
    private Double amount;

    @ColumnInfo(name = "createTime")
    private long createTime;

    @Ignore
    private int errorCode;

    @ColumnInfo(name = "huaWeiAccountFlag")
    private int huaWeiAccountFlag;

    @ColumnInfo(name = "isAcknowledged")
    private boolean isAcknowledged;

    @ColumnInfo(name = "isConsume")
    private boolean isConsume;

    @Ignore
    private boolean isNewOrder;

    @ColumnInfo(name = "isSubscription")
    private boolean isSubscription;

    @ColumnInfo(name = "purchaseState")
    private int purchaseState;

    @ColumnInfo(name = "subscriptionState")
    private int subscriptionState;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = AccessToken.USER_ID_KEY)
    private long userId;

    @PrimaryKey
    @ColumnInfo(name = "order_id")
    @NotNull
    private String orderId = "";

    @ColumnInfo(name = "sku")
    @NotNull
    private String sku = "";

    @ColumnInfo(name = "purchase_token")
    @NotNull
    private String purchaseToken = "";

    @ColumnInfo(name = "subscriptionId")
    @NotNull
    private String subscriptionId = "";

    @ColumnInfo(name = "subscriptionOrderId")
    @NotNull
    private String subscriptionOrderId = "";

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getHuaWeiAccountFlag() {
        return this.huaWeiAccountFlag;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
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

    public final int getSubscriptionState() {
        return this.subscriptionState;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isAcknowledged, reason: from getter */
    public final boolean getIsAcknowledged() {
        return this.isAcknowledged;
    }

    /* JADX INFO: renamed from: isConsume, reason: from getter */
    public final boolean getIsConsume() {
        return this.isConsume;
    }

    /* JADX INFO: renamed from: isNewOrder, reason: from getter */
    public final boolean getIsNewOrder() {
        return this.isNewOrder;
    }

    /* JADX INFO: renamed from: isSubscription, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    public final void setAcknowledged(boolean z) {
        this.isAcknowledged = z;
    }

    public final void setAmount(@Nullable Double d) {
        this.amount = d;
    }

    public final void setConsume(boolean z) {
        this.isConsume = z;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setHuaWeiAccountFlag(int i) {
        this.huaWeiAccountFlag = i;
    }

    public final void setNewOrder(boolean z) {
        this.isNewOrder = z;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPurchaseState(int i) {
        this.purchaseState = i;
    }

    public final void setPurchaseToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseToken = str;
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

    public final void setSubscriptionState(int i) {
        this.subscriptionState = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PayOrder(userId=");
        sbOooO0o0.append(this.userId);
        sbOooO0o0.append(", orderId='");
        sbOooO0o0.append(this.orderId);
        sbOooO0o0.append("', sku='");
        sbOooO0o0.append(this.sku);
        sbOooO0o0.append("', amount=");
        sbOooO0o0.append(this.amount);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", purchaseToken='");
        sbOooO0o0.append(this.purchaseToken);
        sbOooO0o0.append("', huaWeiAccountFlag=");
        sbOooO0o0.append(this.huaWeiAccountFlag);
        sbOooO0o0.append(", isConsume=");
        sbOooO0o0.append(this.isConsume);
        sbOooO0o0.append(", purchaseState=");
        sbOooO0o0.append(this.purchaseState);
        sbOooO0o0.append(", isAcknowledged=");
        sbOooO0o0.append(this.isAcknowledged);
        sbOooO0o0.append(", isSubscription=");
        sbOooO0o0.append(this.isSubscription);
        sbOooO0o0.append(", subscriptionState=");
        sbOooO0o0.append(this.subscriptionState);
        sbOooO0o0.append(", subscriptionId='");
        sbOooO0o0.append(this.subscriptionId);
        sbOooO0o0.append("', subscriptionOrderId='");
        sbOooO0o0.append(this.subscriptionOrderId);
        sbOooO0o0.append("', createTime=");
        sbOooO0o0.append(this.createTime);
        sbOooO0o0.append(", isNewOrder=");
        sbOooO0o0.append(this.isNewOrder);
        sbOooO0o0.append(", errorCode=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.errorCode, ')');
    }
}
