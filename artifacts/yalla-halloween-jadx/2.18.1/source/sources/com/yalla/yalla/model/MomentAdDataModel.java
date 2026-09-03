package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/MomentAdDataModel;", "Ljava/io/Serializable;", "()V", "adButtonName", "", "getAdButtonName", "()Ljava/lang/String;", "setAdButtonName", "(Ljava/lang/String;)V", "adDescription", "getAdDescription", "setAdDescription", "adDescription2", "getAdDescription2", "setAdDescription2", "adHeadUrl", "getAdHeadUrl", "setAdHeadUrl", "adId", "", "getAdId", "()J", "setAdId", "(J)V", "adImage", "getAdImage", "setAdImage", "adTitle", "getAdTitle", "setAdTitle", "adUrl", "getAdUrl", "setAdUrl", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentAdDataModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName(alternate = {"adId"}, value = "adid")
    private long adId;

    @SerializedName("adHeadurl")
    @NotNull
    private String adHeadUrl = "";

    @NotNull
    private String adTitle = "";

    @NotNull
    private String adImage = "";

    @NotNull
    private String adDescription = "";

    @NotNull
    private String adDescription2 = "";

    @NotNull
    private String adButtonName = "";

    @NotNull
    private String adUrl = "";

    @NotNull
    public final String getAdButtonName() {
        return this.adButtonName;
    }

    @NotNull
    public final String getAdDescription() {
        return this.adDescription;
    }

    @NotNull
    public final String getAdDescription2() {
        return this.adDescription2;
    }

    @NotNull
    public final String getAdHeadUrl() {
        return this.adHeadUrl;
    }

    public final long getAdId() {
        return this.adId;
    }

    @NotNull
    public final String getAdImage() {
        return this.adImage;
    }

    @NotNull
    public final String getAdTitle() {
        return this.adTitle;
    }

    @NotNull
    public final String getAdUrl() {
        return this.adUrl;
    }

    public final void setAdButtonName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adButtonName = str;
    }

    public final void setAdDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adDescription = str;
    }

    public final void setAdDescription2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adDescription2 = str;
    }

    public final void setAdHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adHeadUrl = str;
    }

    public final void setAdId(long j) {
        this.adId = j;
    }

    public final void setAdImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adImage = str;
    }

    public final void setAdTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adTitle = str;
    }

    public final void setAdUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adUrl = str;
    }
}
