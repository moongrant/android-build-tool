package com.yalla.yalla.model.share;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/share/RoomThemeGiveInfo;", "", "()V", "dynamicUrl", "", "getDynamicUrl", "()Ljava/lang/String;", "setDynamicUrl", "(Ljava/lang/String;)V", "giveCount", "", "getGiveCount", "()I", "setGiveCount", "(I)V", "picUrl", "getPicUrl", "setPicUrl", "price", "getPrice", "setPrice", "shopId", "", "getShopId", "()J", "setShopId", "(J)V", "targetId", "getTargetId", "setTargetId", "themeName", "getThemeName", "setThemeName", "timeLong", "getTimeLong", "setTimeLong", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomThemeGiveInfo {
    public static final int $stable = 8;
    private int giveCount;
    private int price;
    private long shopId;

    @SerializedName("toUserId")
    private long targetId;
    private int timeLong;

    @NotNull
    private String themeName = "";

    @NotNull
    private String picUrl = "";

    @NotNull
    private String dynamicUrl = "";

    @NotNull
    public final String getDynamicUrl() {
        return this.dynamicUrl;
    }

    public final int getGiveCount() {
        return this.giveCount;
    }

    @NotNull
    public final String getPicUrl() {
        return this.picUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public final long getTargetId() {
        return this.targetId;
    }

    @NotNull
    public final String getThemeName() {
        return this.themeName;
    }

    public final int getTimeLong() {
        return this.timeLong;
    }

    public final void setDynamicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dynamicUrl = str;
    }

    public final void setGiveCount(int i) {
        this.giveCount = i;
    }

    public final void setPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picUrl = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setShopId(long j) {
        this.shopId = j;
    }

    public final void setTargetId(long j) {
        this.targetId = j;
    }

    public final void setThemeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.themeName = str;
    }

    public final void setTimeLong(int i) {
        this.timeLong = i;
    }
}
