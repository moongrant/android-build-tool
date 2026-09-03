package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/CustomPrices;", "", "()V", "discountPrice", "", "getDiscountPrice", "()I", "setDiscountPrice", "(I)V", "originalPrice", "getOriginalPrice", "setOriginalPrice", "renewPrice", "getRenewPrice", "setRenewPrice", "themeType", "getThemeType", "setThemeType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomPrices {
    public static final int $stable = 8;
    private int discountPrice;
    private int originalPrice;
    private int renewPrice;
    private int themeType;

    public final int getDiscountPrice() {
        return this.discountPrice;
    }

    public final int getOriginalPrice() {
        return this.originalPrice;
    }

    public final int getRenewPrice() {
        return this.renewPrice;
    }

    public final int getThemeType() {
        return this.themeType;
    }

    public final void setDiscountPrice(int i) {
        this.discountPrice = i;
    }

    public final void setOriginalPrice(int i) {
        this.originalPrice = i;
    }

    public final void setRenewPrice(int i) {
        this.renewPrice = i;
    }

    public final void setThemeType(int i) {
        this.themeType = i;
    }
}
