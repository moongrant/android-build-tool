package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R\u001e\u00109\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\b¨\u0006?"}, d2 = {"Lcom/yalla/yalla/model/TopRankData;", "", "()V", "barLevel", "", "getBarLevel", "()Ljava/lang/String;", "setBarLevel", "(Ljava/lang/String;)V", "currBadgeImg", "getCurrBadgeImg", "setCurrBadgeImg", "currBadgeLv", "", "getCurrBadgeLv", "()I", "setCurrBadgeLv", "(I)V", "currWealLv", "getCurrWealLv", "setCurrWealLv", "headFrameUrl", "getHeadFrameUrl", "setHeadFrameUrl", "id", "getId", "setId", "imageUrl", "getImageUrl", "setImageUrl", "kaVIPLv", "getKaVIPLv", "setKaVIPLv", "level", "getLevel", "setLevel", "name", "getName", "setName", "num", "getNum", "setNum", "number", "getNumber", "setNumber", "roomServerIp", "getRoomServerIp", "setRoomServerIp", "sex", "getSex", "setSex", "type", "getType", "setType", "vip", "getVip", "setVip", "vipLevel", "getVipLevel", "setVipLevel", "websocketaddr", "getWebsocketaddr", "setWebsocketaddr", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopRankData {
    public static final int $stable = 8;
    private int currBadgeLv;
    private int currWealLv;
    private int kaVIPLv;
    private int num;

    @SerializedName(alternate = {"nIsVIP"}, value = "isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;

    @NotNull
    private String id = "";

    @SerializedName("roomserverip")
    @NotNull
    private String roomServerIp = "";

    @SerializedName("imageurl")
    @NotNull
    private String imageUrl = "";

    @NotNull
    private String name = "";

    @NotNull
    private String level = "";

    @NotNull
    private String sex = "";

    @NotNull
    private String number = "";

    @SerializedName("barlevel")
    @NotNull
    private String barLevel = "";

    @NotNull
    private String type = "";

    @SerializedName("headframeurl")
    @NotNull
    private String headFrameUrl = "";

    @NotNull
    private String websocketaddr = "";

    @NotNull
    private String currBadgeImg = "";

    @NotNull
    public final String getBarLevel() {
        return this.barLevel;
    }

    @NotNull
    public final String getCurrBadgeImg() {
        return this.currBadgeImg;
    }

    public final int getCurrBadgeLv() {
        return this.currBadgeLv;
    }

    public final int getCurrWealLv() {
        return this.currWealLv;
    }

    @NotNull
    public final String getHeadFrameUrl() {
        return this.headFrameUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getKaVIPLv() {
        return this.kaVIPLv;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNum() {
        return this.num;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    public final String getRoomServerIp() {
        return this.roomServerIp;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getVip() {
        return this.vip;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    public final String getWebsocketaddr() {
        return this.websocketaddr;
    }

    public final void setBarLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barLevel = str;
    }

    public final void setCurrBadgeImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currBadgeImg = str;
    }

    public final void setCurrBadgeLv(int i) {
        this.currBadgeLv = i;
    }

    public final void setCurrWealLv(int i) {
        this.currWealLv = i;
    }

    public final void setHeadFrameUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headFrameUrl = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setKaVIPLv(int i) {
        this.kaVIPLv = i;
    }

    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.number = str;
    }

    public final void setRoomServerIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomServerIp = str;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setVip(int i) {
        this.vip = i;
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
    }

    public final void setWebsocketaddr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.websocketaddr = str;
    }
}
