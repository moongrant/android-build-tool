package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/GiveThemeModel;", "Ljava/io/Serializable;", "()V", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "shopId", "", "getShopId", "()J", "setShopId", "(J)V", "themeName", "getThemeName", "setThemeName", "videoUrl", "getVideoUrl", "setVideoUrl", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiveThemeModel implements Serializable {
    public static final int $stable = 8;
    private long shopId;

    @NotNull
    private String themeName = "";

    @NotNull
    private String imageUrl = "";

    @NotNull
    private String videoUrl = "";

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getShopId() {
        return this.shopId;
    }

    @NotNull
    public final String getThemeName() {
        return this.themeName;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setShopId(long j) {
        this.shopId = j;
    }

    public final void setThemeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.themeName = str;
    }

    public final void setVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoUrl = str;
    }
}
