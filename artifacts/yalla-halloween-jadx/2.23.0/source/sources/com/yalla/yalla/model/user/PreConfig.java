package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/user/PreConfig;", "", "()V", "avatarBorder", "", "getAvatarBorder", "()Ljava/lang/String;", "setAvatarBorder", "(Ljava/lang/String;)V", "backgroundEffectsUrl", "getBackgroundEffectsUrl", "setBackgroundEffectsUrl", "backgroundRTLUrl", "getBackgroundRTLUrl", "setBackgroundRTLUrl", "backgroundUrl", "getBackgroundUrl", "setBackgroundUrl", "effectsUrl", "getEffectsUrl", "setEffectsUrl", "maskUrl", "getMaskUrl", "setMaskUrl", "roomBackgroundRTLUrl", "getRoomBackgroundRTLUrl", "setRoomBackgroundRTLUrl", "roomBackgroundUrl", "getRoomBackgroundUrl", "setRoomBackgroundUrl", "textColor", "getTextColor", "setTextColor", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreConfig {
    public static final int $stable = 8;

    @SerializedName("avatarBorder")
    @Nullable
    private String avatarBorder;

    @SerializedName("backgroundEffectsUrl")
    @Nullable
    private String backgroundEffectsUrl;

    @SerializedName("backgroundRTLUrl")
    @Nullable
    private String backgroundRTLUrl;

    @SerializedName("backgroundUrl")
    @Nullable
    private String backgroundUrl;

    @SerializedName("effectsUrl")
    @Nullable
    private String effectsUrl;

    @SerializedName("maskUrl")
    @Nullable
    private String maskUrl;

    @SerializedName("roomBackgroundRTLUrl")
    @Nullable
    private String roomBackgroundRTLUrl;

    @SerializedName("roomBackgroundUrl")
    @Nullable
    private String roomBackgroundUrl;

    @SerializedName("textColor")
    @Nullable
    private String textColor;

    @Nullable
    public final String getAvatarBorder() {
        return this.avatarBorder;
    }

    @Nullable
    public final String getBackgroundEffectsUrl() {
        return this.backgroundEffectsUrl;
    }

    @Nullable
    public final String getBackgroundRTLUrl() {
        return this.backgroundRTLUrl;
    }

    @Nullable
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @Nullable
    public final String getEffectsUrl() {
        return this.effectsUrl;
    }

    @Nullable
    public final String getMaskUrl() {
        return this.maskUrl;
    }

    @Nullable
    public final String getRoomBackgroundRTLUrl() {
        return this.roomBackgroundRTLUrl;
    }

    @Nullable
    public final String getRoomBackgroundUrl() {
        return this.roomBackgroundUrl;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    public final void setAvatarBorder(@Nullable String str) {
        this.avatarBorder = str;
    }

    public final void setBackgroundEffectsUrl(@Nullable String str) {
        this.backgroundEffectsUrl = str;
    }

    public final void setBackgroundRTLUrl(@Nullable String str) {
        this.backgroundRTLUrl = str;
    }

    public final void setBackgroundUrl(@Nullable String str) {
        this.backgroundUrl = str;
    }

    public final void setEffectsUrl(@Nullable String str) {
        this.effectsUrl = str;
    }

    public final void setMaskUrl(@Nullable String str) {
        this.maskUrl = str;
    }

    public final void setRoomBackgroundRTLUrl(@Nullable String str) {
        this.roomBackgroundRTLUrl = str;
    }

    public final void setRoomBackgroundUrl(@Nullable String str) {
        this.roomBackgroundUrl = str;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }
}
