package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/BadgeRankDataModel;", "", "()V", "copperNum", "", "getCopperNum", "()I", "setCopperNum", "(I)V", "diamondNum", "getDiamondNum", "setDiamondNum", "goldNum", "getGoldNum", "setGoldNum", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "medal", "getMedal", "setMedal", "nickName", "getNickName", "setNickName", "num", "getNum", "setNum", "sex", "getSex", "setSex", "silverNum", "getSilverNum", "setSilverNum", "sumStars", "getSumStars", "setSumStars", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BadgeRankDataModel {
    public static final int $stable = 8;
    private int copperNum;
    private int diamondNum;
    private int goldNum;
    private int num;
    private int sex;
    private int silverNum;

    @SerializedName("sumstars")
    private int sumStars;

    @SerializedName("userid")
    private long userId;

    @SerializedName("imageurl")
    @NotNull
    private String imageUrl = "";

    @SerializedName("nickname")
    @NotNull
    private String nickName = "";

    @NotNull
    private String medal = "";

    public final int getCopperNum() {
        return this.copperNum;
    }

    public final int getDiamondNum() {
        return this.diamondNum;
    }

    public final int getGoldNum() {
        return this.goldNum;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getMedal() {
        return this.medal;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getSex() {
        return this.sex;
    }

    public final int getSilverNum() {
        return this.silverNum;
    }

    public final int getSumStars() {
        return this.sumStars;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setCopperNum(int i) {
        this.copperNum = i;
    }

    public final void setDiamondNum(int i) {
        this.diamondNum = i;
    }

    public final void setGoldNum(int i) {
        this.goldNum = i;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setMedal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medal = str;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setSilverNum(int i) {
        this.silverNum = i;
    }

    public final void setSumStars(int i) {
        this.sumStars = i;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
