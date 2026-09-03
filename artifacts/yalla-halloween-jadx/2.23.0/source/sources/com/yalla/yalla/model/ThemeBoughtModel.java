package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/ThemeBoughtModel;", "", "()V", "balance", "", "getBalance", "()J", "dayNum", "getDayNum", "payType", "", "getPayType", "()I", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeBoughtModel {
    public static final int $stable = 0;
    private final long balance;

    @SerializedName("daynum")
    private final long dayNum;

    @SerializedName("paytype")
    private final int payType;

    public final long getBalance() {
        return this.balance;
    }

    public final long getDayNum() {
        return this.dayNum;
    }

    public final int getPayType() {
        return this.payType;
    }
}
