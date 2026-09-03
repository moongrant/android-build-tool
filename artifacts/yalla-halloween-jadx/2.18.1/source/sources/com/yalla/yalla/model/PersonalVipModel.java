package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000e¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/PersonalVipModel;", "", "()V", "currentExperience", "", "getCurrentExperience", "()I", "setCurrentExperience", "(I)V", "doPopUp", "", "getDoPopUp", "()Z", "setDoPopUp", "(Z)V", "expireTimeStamp", "", "getExpireTimeStamp", "()J", "setExpireTimeStamp", "(J)V", "frozenTimeStamp", "getFrozenTimeStamp", "setFrozenTimeStamp", "kaVIPLv", "getKaVIPLv", "setKaVIPLv", "kaVIPState", "getKaVIPState", "setKaVIPState", "leftDayNum", "getLeftDayNum", "setLeftDayNum", "leftExperience", "getLeftExperience", "setLeftExperience", "showKAVIP", "getShowKAVIP", "setShowKAVIP", "showPremiumFirst", "getShowPremiumFirst", "setShowPremiumFirst", "stealthVisit", "getStealthVisit", "setStealthVisit", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PersonalVipModel {
    public static final int $stable = 8;

    @SerializedName("currExpe")
    private int currentExperience;
    private boolean doPopUp;
    private long expireTimeStamp;
    private long frozenTimeStamp;
    private int kaVIPLv;
    private int kaVIPState;
    private int leftDayNum;

    @SerializedName("leftExpe")
    private int leftExperience;
    private boolean showKAVIP;
    private boolean showPremiumFirst;
    private boolean stealthVisit;

    public final int getCurrentExperience() {
        return this.currentExperience;
    }

    public final boolean getDoPopUp() {
        return this.doPopUp;
    }

    public final long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    public final long getFrozenTimeStamp() {
        return this.frozenTimeStamp;
    }

    public final int getKaVIPLv() {
        return this.kaVIPLv;
    }

    public final int getKaVIPState() {
        return this.kaVIPState;
    }

    public final int getLeftDayNum() {
        return this.leftDayNum;
    }

    public final int getLeftExperience() {
        return this.leftExperience;
    }

    public final boolean getShowKAVIP() {
        return this.showKAVIP;
    }

    public final boolean getShowPremiumFirst() {
        return this.showPremiumFirst;
    }

    public final boolean getStealthVisit() {
        return this.stealthVisit;
    }

    public final void setCurrentExperience(int i) {
        this.currentExperience = i;
    }

    public final void setDoPopUp(boolean z) {
        this.doPopUp = z;
    }

    public final void setExpireTimeStamp(long j) {
        this.expireTimeStamp = j;
    }

    public final void setFrozenTimeStamp(long j) {
        this.frozenTimeStamp = j;
    }

    public final void setKaVIPLv(int i) {
        this.kaVIPLv = i;
    }

    public final void setKaVIPState(int i) {
        this.kaVIPState = i;
    }

    public final void setLeftDayNum(int i) {
        this.leftDayNum = i;
    }

    public final void setLeftExperience(int i) {
        this.leftExperience = i;
    }

    public final void setShowKAVIP(boolean z) {
        this.showKAVIP = z;
    }

    public final void setShowPremiumFirst(boolean z) {
        this.showPremiumFirst = z;
    }

    public final void setStealthVisit(boolean z) {
        this.stealthVisit = z;
    }
}
