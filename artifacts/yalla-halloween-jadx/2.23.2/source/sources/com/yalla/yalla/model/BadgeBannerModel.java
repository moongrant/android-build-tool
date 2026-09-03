package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/BadgeBannerModel;", "", "()V", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "medalId", "", "getMedalId", "()I", "setMedalId", "(I)V", "nickName", "getNickName", "setNickName", "num", "getNum", "setNum", "sex", "getSex", "setSex", "starsLevel", "getStarsLevel", "setStarsLevel", "type", "getType", "setType", "userid", "", "getUserid", "()J", "setUserid", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BadgeBannerModel {
    public static final int $stable = 8;

    @SerializedName("medalid")
    private int medalId;
    private int num;
    private int sex;
    private int starsLevel;
    private int type;
    private long userid;

    @SerializedName("imageurl")
    @NotNull
    private String imageUrl = "";

    @NotNull
    private String nickName = "";

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getMedalId() {
        return this.medalId;
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

    public final int getStarsLevel() {
        return this.starsLevel;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserid() {
        return this.userid;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setMedalId(int i) {
        this.medalId = i;
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

    public final void setStarsLevel(int i) {
        this.starsLevel = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserid(long j) {
        this.userid = j;
    }
}
