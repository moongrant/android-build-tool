package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010\u0017¨\u0006B"}, d2 = {"Lcom/yalla/yalla/model/RechargeMenuType;", "", "()V", "amount", "", "getAmount", "()D", "setAmount", "(D)V", "coin", "", "getCoin", "()I", "setCoin", "(I)V", "diamonds", "getDiamonds", "setDiamonds", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "logo", "getLogo", "setLogo", "name", "getName", "setName", "payurl", "getPayurl", "setPayurl", "pmId", "getPmId", "setPmId", "pm_id", "getPm_id", "setPm_id", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "getProductDetails", "()Lcom/android/billingclient/api/ProductDetails;", "setProductDetails", "(Lcom/android/billingclient/api/ProductDetails;)V", "shoplist", "", "getShoplist", "()Ljava/util/List;", "setShoplist", "(Ljava/util/List;)V", "sku", "getSku", "setSku", "skuDetails", "Lcom/android/billingclient/api/SkuDetails;", "getSkuDetails", "()Lcom/android/billingclient/api/SkuDetails;", "setSkuDetails", "(Lcom/android/billingclient/api/SkuDetails;)V", "type", "getType", "setType", "unit", "getUnit", "setUnit", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RechargeMenuType {
    public static final int $stable = 8;
    private double amount;
    private int coin;
    private int diamonds;

    @Nullable
    private ProductDetails productDetails;

    @Nullable
    private SkuDetails skuDetails;
    private int type;

    @NotNull
    private String id = "";

    @NotNull
    private String pm_id = "";

    @NotNull
    private String name = "";

    @NotNull
    private String logo = "";

    @NotNull
    private String payurl = "";

    @NotNull
    private List<RechargeMenuType> shoplist = new ArrayList();

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
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPayurl() {
        return this.payurl;
    }

    @NotNull
    public final String getPmId() {
        return this.pmId;
    }

    @NotNull
    public final String getPm_id() {
        return this.pm_id;
    }

    @Nullable
    public final ProductDetails getProductDetails() {
        return this.productDetails;
    }

    @NotNull
    public final List<RechargeMenuType> getShoplist() {
        return this.shoplist;
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

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logo = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPayurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payurl = str;
    }

    public final void setPmId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pmId = str;
    }

    public final void setPm_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pm_id = str;
    }

    public final void setProductDetails(@Nullable ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public final void setShoplist(@NotNull List<RechargeMenuType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shoplist = list;
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
