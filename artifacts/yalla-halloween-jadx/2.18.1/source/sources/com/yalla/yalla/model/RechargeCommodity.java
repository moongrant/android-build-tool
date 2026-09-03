package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017¨\u0006'"}, d2 = {"Lcom/yalla/yalla/model/RechargeCommodity;", "", "()V", "amount", "", "getAmount", "()D", "setAmount", "(D)V", "coin", "", "getCoin", "()I", "setCoin", "(I)V", "diamonds", "getDiamonds", "setDiamonds", "pmId", "", "getPmId", "()Ljava/lang/String;", "setPmId", "(Ljava/lang/String;)V", "sku", "getSku", "setSku", "skuDetails", "Lcom/android/billingclient/api/SkuDetails;", "getSkuDetails", "()Lcom/android/billingclient/api/SkuDetails;", "setSkuDetails", "(Lcom/android/billingclient/api/SkuDetails;)V", "type", "getType", "setType", "unit", "getUnit", "setUnit", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RechargeCommodity {
    public static final int $stable = 8;
    private double amount;
    private int coin;
    private int diamonds;

    @Nullable
    private SkuDetails skuDetails;
    private int type;

    @NotNull
    private String sku = "";

    @NotNull
    private String unit = "USD";

    @NotNull
    private String pmId = "";

    public final double getAmount() {
        return this.amount;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final int getDiamonds() {
        return this.diamonds;
    }

    @NotNull
    public final String getPmId() {
        return this.pmId;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @Nullable
    public final SkuDetails getSkuDetails() {
        return this.skuDetails;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setCoin(int i) {
        this.coin = i;
    }

    public final void setDiamonds(int i) {
        this.diamonds = i;
    }

    public final void setPmId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pmId = str;
    }

    public final void setSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setSkuDetails(@Nullable SkuDetails skuDetails) {
        this.skuDetails = skuDetails;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unit = str;
    }
}
