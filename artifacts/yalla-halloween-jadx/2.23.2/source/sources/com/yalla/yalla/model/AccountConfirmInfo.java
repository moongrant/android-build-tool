package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/model/AccountConfirmInfo;", "Ljava/io/Serializable;", "()V", "coinNum", "", "getCoinNum", "()J", "setCoinNum", "(J)V", "crystalNum", "getCrystalNum", "setCrystalNum", "fansNum", "", "getFansNum", "()I", "setFansNum", "(I)V", "friendsNum", "getFriendsNum", "setFriendsNum", "medalNum", "getMedalNum", "setMedalNum", "userLevel", "getUserLevel", "setUserLevel", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccountConfirmInfo implements Serializable {
    public static final int $stable = 8;
    private long coinNum;
    private long crystalNum;
    private int fansNum;
    private int friendsNum;
    private int medalNum;
    private int userLevel;

    public final long getCoinNum() {
        return this.coinNum;
    }

    public final long getCrystalNum() {
        return this.crystalNum;
    }

    public final int getFansNum() {
        return this.fansNum;
    }

    public final int getFriendsNum() {
        return this.friendsNum;
    }

    public final int getMedalNum() {
        return this.medalNum;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public final void setCoinNum(long j) {
        this.coinNum = j;
    }

    public final void setCrystalNum(long j) {
        this.crystalNum = j;
    }

    public final void setFansNum(int i) {
        this.fansNum = i;
    }

    public final void setFriendsNum(int i) {
        this.friendsNum = i;
    }

    public final void setMedalNum(int i) {
        this.medalNum = i;
    }

    public final void setUserLevel(int i) {
        this.userLevel = i;
    }
}
