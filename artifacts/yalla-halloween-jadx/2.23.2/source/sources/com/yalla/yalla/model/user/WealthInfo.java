package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/user/WealthInfo;", "Ljava/io/Serializable;", "()V", "badgeRoundedImg", "", "getBadgeRoundedImg", "()Ljava/lang/String;", "setBadgeRoundedImg", "(Ljava/lang/String;)V", "profileCardImg", "getProfileCardImg", "setProfileCardImg", "wealthBadgeLevel", "", "getWealthBadgeLevel", "()I", "setWealthBadgeLevel", "(I)V", "wealthBadgeUrl", "getWealthBadgeUrl", "setWealthBadgeUrl", "wealthLevel", "getWealthLevel", "setWealthLevel", "wealthShow", "", "getWealthShow", "()Z", "setWealthShow", "(Z)V", "wealthValue", "", "getWealthValue", "()J", "setWealthValue", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WealthInfo implements Serializable {
    public static final int $stable = 8;
    private int wealthBadgeLevel;
    private int wealthLevel;
    private boolean wealthShow;
    private long wealthValue;

    @NotNull
    private String wealthBadgeUrl = "";

    @NotNull
    private String profileCardImg = "";

    @NotNull
    private String badgeRoundedImg = "";

    @NotNull
    public final String getBadgeRoundedImg() {
        return this.badgeRoundedImg;
    }

    @NotNull
    public final String getProfileCardImg() {
        return this.profileCardImg;
    }

    public final int getWealthBadgeLevel() {
        return this.wealthBadgeLevel;
    }

    @NotNull
    public final String getWealthBadgeUrl() {
        return this.wealthBadgeUrl;
    }

    public final int getWealthLevel() {
        return this.wealthLevel;
    }

    public final boolean getWealthShow() {
        return this.wealthShow;
    }

    public final long getWealthValue() {
        return this.wealthValue;
    }

    public final void setBadgeRoundedImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.badgeRoundedImg = str;
    }

    public final void setProfileCardImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.profileCardImg = str;
    }

    public final void setWealthBadgeLevel(int i) {
        this.wealthBadgeLevel = i;
    }

    public final void setWealthBadgeUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthBadgeUrl = str;
    }

    public final void setWealthLevel(int i) {
        this.wealthLevel = i;
    }

    public final void setWealthShow(boolean z) {
        this.wealthShow = z;
    }

    public final void setWealthValue(long j) {
        this.wealthValue = j;
    }
}
