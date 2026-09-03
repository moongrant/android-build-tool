package com.yalla.yalla.model.vip;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/vip/VipShopExchangeModel;", "", "()V", "expiringPoint", "", "getExpiringPoint", "()J", "isEnable", "", "()Z", "setEnable", "(Z)V", "pointBalance", "getPointBalance", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VipShopExchangeModel {
    public static final int $stable = 8;

    @SerializedName("expiringPoint")
    private final long expiringPoint;

    @SerializedName("isEnable")
    private boolean isEnable;

    @SerializedName("pointBalance")
    private final long pointBalance;

    public final long getExpiringPoint() {
        return this.expiringPoint;
    }

    public final long getPointBalance() {
        return this.pointBalance;
    }

    /* JADX INFO: renamed from: isEnable, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }
}
