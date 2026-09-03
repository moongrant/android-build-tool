package com.yalla.yalla.common.manager.googlepay;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/GooglePaySkuDetail;", "", "sku", "", "detail", "Lcom/android/billingclient/api/SkuDetails;", "(Ljava/lang/String;Lcom/android/billingclient/api/SkuDetails;)V", "amount", "", "getAmount", "()D", "setAmount", "(D)V", "getDetail", "()Lcom/android/billingclient/api/SkuDetails;", "getSku", "()Ljava/lang/String;", "unit", "getUnit", "setUnit", "(Ljava/lang/String;)V", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GooglePaySkuDetail {
    public static final int $stable = 8;
    private double amount;

    @Nullable
    private final SkuDetails detail;

    @NotNull
    private final String sku;

    @NotNull
    private String unit;

    public GooglePaySkuDetail(@NotNull String sku, @Nullable SkuDetails skuDetails) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.detail = skuDetails;
        this.unit = "USD";
    }

    public final double getAmount() {
        return this.amount;
    }

    @Nullable
    public final SkuDetails getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unit = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("GooglePaySkuDetail(sku='");
        sbOooO0o0.append(this.sku);
        sbOooO0o0.append("', detail=");
        sbOooO0o0.append(this.detail);
        sbOooO0o0.append(", amount=");
        sbOooO0o0.append(this.amount);
        sbOooO0o0.append(", unit='");
        return OooO.OooO00o(sbOooO0o0, this.unit, "')");
    }

    public /* synthetic */ GooglePaySkuDetail(String str, SkuDetails skuDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : skuDetails);
    }
}
