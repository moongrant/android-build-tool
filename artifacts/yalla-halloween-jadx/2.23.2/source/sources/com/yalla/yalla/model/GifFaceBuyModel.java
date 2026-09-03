package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.gift.ThemeConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/GifFaceBuyModel;", "", "()V", "catalogId", "", "getCatalogId", "()J", "dayNum", "", "getDayNum", "()I", "expireTime", "getExpireTime", "themeConfig", "Lcom/yalla/yalla/model/gift/ThemeConfig;", "getThemeConfig", "()Lcom/yalla/yalla/model/gift/ThemeConfig;", "userBalance", "getUserBalance", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GifFaceBuyModel {
    public static final int $stable = 8;

    @SerializedName("catalogId")
    private final long catalogId;

    @SerializedName("dayNum")
    private final int dayNum;

    @SerializedName("expireTime")
    private final long expireTime;

    @SerializedName("themeConfig")
    @Nullable
    private final ThemeConfig themeConfig;

    @SerializedName("userBalance")
    private final long userBalance;

    public final long getCatalogId() {
        return this.catalogId;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final ThemeConfig getThemeConfig() {
        return this.themeConfig;
    }

    public final long getUserBalance() {
        return this.userBalance;
    }
}
