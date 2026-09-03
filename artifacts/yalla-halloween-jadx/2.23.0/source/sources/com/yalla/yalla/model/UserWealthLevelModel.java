package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001e\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014¨\u0006%"}, d2 = {"Lcom/yalla/yalla/model/UserWealthLevelModel;", "", "()V", "currWealthBadgeImg", "", "getCurrWealthBadgeImg", "()Ljava/lang/String;", "setCurrWealthBadgeImg", "(Ljava/lang/String;)V", "currWealthBadgeLevel", "", "getCurrWealthBadgeLevel", "()I", "setCurrWealthBadgeLevel", "(I)V", "currWealthExperience", "", "getCurrWealthExperience", "()J", "setCurrWealthExperience", "(J)V", "currWealthLevel", "getCurrWealthLevel", "setCurrWealthLevel", "isShowWealthLevel", "", "()Z", "setShowWealthLevel", "(Z)V", "isWealthFullLevel", "setWealthFullLevel", "nextWealthLevelExperience", "getNextWealthLevelExperience", "setNextWealthLevelExperience", "thisWealthLevelExperience", "getThisWealthLevelExperience", "setThisWealthLevelExperience", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserWealthLevelModel {
    public static final int $stable = 8;

    @SerializedName(alternate = {"CurrBadgeImg"}, value = "currBadgeImg")
    @NotNull
    private String currWealthBadgeImg = "";

    @SerializedName(alternate = {"CurrBadgeLv"}, value = "currBadgeLv")
    private int currWealthBadgeLevel;

    @SerializedName(alternate = {"CurrExperience"}, value = "currExperience")
    private long currWealthExperience;

    @SerializedName(alternate = {"CurrWealthLv"}, value = "currWealthLv")
    private int currWealthLevel;

    @SerializedName(alternate = {"ShowWealthLevel"}, value = "showWealthLevel")
    private boolean isShowWealthLevel;

    @SerializedName(alternate = {"IsFullLevel"}, value = "isFullLevel")
    private boolean isWealthFullLevel;

    @SerializedName(alternate = {"NextLvExperience"}, value = "nextLvExperience")
    private long nextWealthLevelExperience;

    @SerializedName(alternate = {"ThisLvExperience"}, value = "thisLvExperience")
    private long thisWealthLevelExperience;

    @NotNull
    public final String getCurrWealthBadgeImg() {
        return this.currWealthBadgeImg;
    }

    public final int getCurrWealthBadgeLevel() {
        return this.currWealthBadgeLevel;
    }

    public final long getCurrWealthExperience() {
        return this.currWealthExperience;
    }

    public final int getCurrWealthLevel() {
        return this.currWealthLevel;
    }

    public final long getNextWealthLevelExperience() {
        return this.nextWealthLevelExperience;
    }

    public final long getThisWealthLevelExperience() {
        return this.thisWealthLevelExperience;
    }

    /* JADX INFO: renamed from: isShowWealthLevel, reason: from getter */
    public final boolean getIsShowWealthLevel() {
        return this.isShowWealthLevel;
    }

    /* JADX INFO: renamed from: isWealthFullLevel, reason: from getter */
    public final boolean getIsWealthFullLevel() {
        return this.isWealthFullLevel;
    }

    public final void setCurrWealthBadgeImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currWealthBadgeImg = str;
    }

    public final void setCurrWealthBadgeLevel(int i) {
        this.currWealthBadgeLevel = i;
    }

    public final void setCurrWealthExperience(long j) {
        this.currWealthExperience = j;
    }

    public final void setCurrWealthLevel(int i) {
        this.currWealthLevel = i;
    }

    public final void setNextWealthLevelExperience(long j) {
        this.nextWealthLevelExperience = j;
    }

    public final void setShowWealthLevel(boolean z) {
        this.isShowWealthLevel = z;
    }

    public final void setThisWealthLevelExperience(long j) {
        this.thisWealthLevelExperience = j;
    }

    public final void setWealthFullLevel(boolean z) {
        this.isWealthFullLevel = z;
    }
}
