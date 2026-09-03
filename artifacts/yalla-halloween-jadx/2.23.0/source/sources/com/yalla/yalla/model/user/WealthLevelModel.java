package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/user/WealthLevelModel;", "Ljava/io/Serializable;", "()V", "badgeRoundedImg", "", "getBadgeRoundedImg", "()Ljava/lang/String;", "setBadgeRoundedImg", "(Ljava/lang/String;)V", "currBadgeImg", "getCurrBadgeImg", "setCurrBadgeImg", "currWealthLv", "", "getCurrWealthLv", "()I", "setCurrWealthLv", "(I)V", "mainCardImg", "getMainCardImg", "setMainCardImg", "mainTextColour", "getMainTextColour", "setMainTextColour", "profileCardImg", "getProfileCardImg", "setProfileCardImg", "showWealthLevel", "", "getShowWealthLevel", "()Z", "setShowWealthLevel", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WealthLevelModel implements Serializable {
    public static final int $stable = 8;
    private int currWealthLv;
    private boolean showWealthLevel;

    @NotNull
    private String currBadgeImg = "";

    @NotNull
    private String mainCardImg = "";

    @NotNull
    private String mainTextColour = "";

    @NotNull
    private String profileCardImg = "";

    @NotNull
    private String badgeRoundedImg = "";

    @NotNull
    public final String getBadgeRoundedImg() {
        return this.badgeRoundedImg;
    }

    @NotNull
    public final String getCurrBadgeImg() {
        return this.currBadgeImg;
    }

    public final int getCurrWealthLv() {
        return this.currWealthLv;
    }

    @NotNull
    public final String getMainCardImg() {
        return this.mainCardImg;
    }

    @NotNull
    public final String getMainTextColour() {
        return this.mainTextColour;
    }

    @NotNull
    public final String getProfileCardImg() {
        return this.profileCardImg;
    }

    public final boolean getShowWealthLevel() {
        return this.showWealthLevel;
    }

    public final void setBadgeRoundedImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.badgeRoundedImg = str;
    }

    public final void setCurrBadgeImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currBadgeImg = str;
    }

    public final void setCurrWealthLv(int i) {
        this.currWealthLv = i;
    }

    public final void setMainCardImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainCardImg = str;
    }

    public final void setMainTextColour(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainTextColour = str;
    }

    public final void setProfileCardImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.profileCardImg = str;
    }

    public final void setShowWealthLevel(boolean z) {
        this.showWealthLevel = z;
    }
}
