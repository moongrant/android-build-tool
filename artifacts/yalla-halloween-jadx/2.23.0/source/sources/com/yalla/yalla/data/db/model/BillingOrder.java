package com.yalla.yalla.data.db.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.facebook.AccessToken;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006\""}, d2 = {"Lcom/yalla/yalla/data/db/model/BillingOrder;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "orderId", "", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "orderStatus", "getOrderStatus", "setOrderStatus", "orderType", "getOrderType", "setOrderType", "purchaseId", "getPurchaseId", "setPurchaseId", "purchaseToken", "getPurchaseToken", "setPurchaseToken", "sku", "getSku", "setSku", "userId", "getUserId", "setUserId", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingOrder {
    public static final int ORDER_STATUS_NOTIFICATION_BACKEND_SUCCESS = 1;
    public static final int ORDER_STATUS_PAY_SUCCESS = 0;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private int id;

    @ColumnInfo(name = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)
    private int orderStatus;
    public static final int $stable = 8;

    @ColumnInfo(name = AccessToken.USER_ID_KEY)
    @NotNull
    private String userId = "";

    @ColumnInfo(name = "order_id")
    @NotNull
    private String orderId = "";

    @ColumnInfo(name = "purchase_id")
    @NotNull
    private String purchaseId = "";

    @ColumnInfo(name = "type")
    @NotNull
    private String orderType = "";

    @NotNull
    private String sku = "";

    @ColumnInfo(name = "purchase_token")
    @NotNull
    private String purchaseToken = "";

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    public final String getPurchaseId() {
        return this.purchaseId;
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
    public final String getUserId() {
        return this.userId;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setOrderStatus(int i) {
        this.orderStatus = i;
    }

    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderType = str;
    }

    public final void setPurchaseId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseId = str;
    }

    public final void setPurchaseToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseToken = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }
}
