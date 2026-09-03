package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\bi\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0095\u0001\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001e\u00109\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00100\"\u0004\b;\u00102R\u001e\u0010<\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014R\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR \u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\u001e\u0010M\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0012\"\u0004\bO\u0010\u0014R\u001a\u0010P\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR\u001a\u0010S\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001e\u0010V\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\u001e\u0010Y\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0012\"\u0004\b[\u0010\u0014R\u001e\u0010\\\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0012\"\u0004\b^\u0010\u0014R\u001e\u0010_\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0006\"\u0004\ba\u0010\bR\u001e\u0010b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0006\"\u0004\bd\u0010\bR\u001e\u0010e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0006\"\u0004\bg\u0010\bR\u001e\u0010h\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0006\"\u0004\bj\u0010\bR\u001e\u0010k\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0012\"\u0004\bm\u0010\u0014R\u001e\u0010n\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0012\"\u0004\bp\u0010\u0014R\u001e\u0010q\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u00100\"\u0004\bs\u00102R\u001e\u0010t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0006\"\u0004\bv\u0010\bR\u001e\u0010w\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u0006\"\u0004\by\u0010\bR\u001e\u0010z\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u0012\"\u0004\b|\u0010\u0014R\u001e\u0010}\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u0006\"\u0004\b\u007f\u0010\bR!\u0010\u0080\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u0006\"\u0005\b\u0082\u0001\u0010\bR!\u0010\u0083\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u0006\"\u0005\b\u0085\u0001\u0010\bR\u001d\u0010\u0086\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u0006\"\u0005\b\u0088\u0001\u0010\bR!\u0010\u0089\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u0006\"\u0005\b\u008b\u0001\u0010\bR!\u0010\u008c\u0001\u001a\u00020.8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u00100\"\u0005\b\u008e\u0001\u00102R!\u0010\u008f\u0001\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u0012\"\u0005\b\u0091\u0001\u0010\u0014R!\u0010\u0092\u0001\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u0012\"\u0005\b\u0094\u0001\u0010\u0014¨\u0006\u0097\u0001"}, d2 = {"Lcom/yalla/yalla/model/SystemMessageData;", "", "()V", "awardCount", "", "getAwardCount", "()Ljava/lang/String;", "setAwardCount", "(Ljava/lang/String;)V", "awardId", "getAwardId", "setAwardId", "awardImage", "getAwardImage", "setAwardImage", "awardtype", "", "getAwardtype", "()I", "setAwardtype", "(I)V", "badgeImage", "getBadgeImage", "setBadgeImage", "badgeLevel", "getBadgeLevel", "setBadgeLevel", "buyType", "getBuyType", "setBuyType", "cause", "getCause", "setCause", "coin", "getCoin", "setCoin", "dayNum", "getDayNum", "setDayNum", "dyid", "getDyid", "setDyid", "dyurl", "getDyurl", "setDyurl", "eventId", "", "getEventId", "()J", "setEventId", "(J)V", "eventName", "getEventName", "setEventName", "eventReason", "getEventReason", "setEventReason", "eventStartTime", "getEventStartTime", "setEventStartTime", "eventTime", "getEventTime", "setEventTime", "expirationTime", "getExpirationTime", "setExpirationTime", "headFrameUrl", "getHeadFrameUrl", "setHeadFrameUrl", "headurl", "getHeadurl", "setHeadurl", "imageurl", "getImageurl", "setImageurl", "isPraise", "setPraise", "kaVipLevel", "getKaVipLevel", "setKaVipLevel", "language", "getLanguage", "setLanguage", "level", "getLevel", "setLevel", "medalId", "getMedalId", "setMedalId", "messageType", "getMessageType", "setMessageType", "nVIPLv", "getNVIPLv", "setNVIPLv", "nickname", "getNickname", "setNickname", "propCount", "getPropCount", "setPropCount", "propId", "getPropId", "setPropId", "propImage", "getPropImage", "setPropImage", "reasonType", "getReasonType", "setReasonType", "rewardCoin", "getRewardCoin", "setRewardCoin", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomName", "getRoomName", "setRoomName", "sex", "getSex", "setSex", "shopid", "getShopid", "setShopid", "shopurl", "getShopurl", "setShopurl", "toprank", "getToprank", "setToprank", "toptype", "getToptype", "setToptype", "type", "getType", "setType", "upCrystal", "getUpCrystal", "setUpCrystal", "userId", "getUserId", "setUserId", "vipLevel", "getVipLevel", "setVipLevel", "wealthLevel", "getWealthLevel", "setWealthLevel", "toString", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SystemMessageData {
    public static final int CUSTOM_THEME_DELETE = 4;
    public static final int CUSTOM_THEME_FAILED = 2;
    public static final int CUSTOM_THEME_SUCCESSFUL = 1;
    private int awardtype;

    @SerializedName("badgelv")
    private int badgeLevel;

    @SerializedName("buytype")
    private int buyType;
    private int cause;

    @SerializedName("daynum")
    private int dayNum;

    @SerializedName("id")
    private long eventId;

    @SerializedName("startTime")
    private long eventStartTime;

    @SerializedName("minute")
    private int eventTime;

    @SerializedName("headframeUrl")
    @Nullable
    private String headFrameUrl;

    @SerializedName("kaviplevel")
    private int kaVipLevel;

    @SerializedName("messagetype")
    private int messageType;

    @SerializedName("nVIPLv")
    private int nVIPLv;

    @SerializedName("reason_type")
    private int reasonType;

    @SerializedName("rewardcoin")
    private int rewardCoin;

    @SerializedName(ContributionFragment.ARG_1)
    private long roomId;

    @SerializedName("shopid")
    private int shopid;

    @SerializedName("touserid")
    private long userId;

    @SerializedName("viplevel")
    private int vipLevel;

    @SerializedName("wealthlv")
    private int wealthLevel;
    public static final int $stable = 8;

    @SerializedName("shopurl")
    @NotNull
    private String shopurl = "";

    @NotNull
    private String imageurl = "";

    @SerializedName("medalid")
    @NotNull
    private String medalId = "";

    @NotNull
    private String type = "";

    @NotNull
    private String level = "";

    @NotNull
    private String coin = "";

    @SerializedName("upcrystal")
    @NotNull
    private String upCrystal = "";

    @NotNull
    private String language = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @SerializedName("ExpirationTime")
    @NotNull
    private String expirationTime = "";

    @SerializedName(alternate = {"name"}, value = "eventName")
    @NotNull
    private String eventName = "";

    @SerializedName("reason")
    @NotNull
    private String eventReason = "";

    @SerializedName("roomName")
    @NotNull
    private String roomName = "";

    @SerializedName("sex")
    @NotNull
    private String sex = "";

    @SerializedName("ispraise")
    @NotNull
    private String isPraise = "";

    @SerializedName("dyid")
    @NotNull
    private String dyid = "";

    @SerializedName("headurl")
    @NotNull
    private String headurl = "";

    @SerializedName("nickname")
    @NotNull
    private String nickname = "";

    @SerializedName("dyurl")
    @NotNull
    private String dyurl = "";

    @SerializedName("toprank")
    @NotNull
    private String toprank = "";

    @SerializedName("toptype")
    @NotNull
    private String toptype = "";

    @SerializedName("awardcount")
    @NotNull
    private String awardCount = "";

    @SerializedName(alternate = {"propNum"}, value = "propCount")
    @NotNull
    private String propCount = "";

    @SerializedName("propId")
    @NotNull
    private String propId = "";

    @SerializedName("propImage")
    @NotNull
    private String propImage = "";

    @SerializedName("awardId")
    @NotNull
    private String awardId = "";

    @SerializedName("awardimage")
    @NotNull
    private String awardImage = "";

    @SerializedName("badgeimg")
    @NotNull
    private String badgeImage = "";

    @NotNull
    public final String getAwardCount() {
        return this.awardCount;
    }

    @NotNull
    public final String getAwardId() {
        return this.awardId;
    }

    @NotNull
    public final String getAwardImage() {
        return this.awardImage;
    }

    public final int getAwardtype() {
        return this.awardtype;
    }

    @NotNull
    public final String getBadgeImage() {
        return this.badgeImage;
    }

    public final int getBadgeLevel() {
        return this.badgeLevel;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final int getCause() {
        return this.cause;
    }

    @NotNull
    public final String getCoin() {
        return this.coin;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    @NotNull
    public final String getDyid() {
        return this.dyid;
    }

    @NotNull
    public final String getDyurl() {
        return this.dyurl;
    }

    public final long getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final String getEventReason() {
        return this.eventReason;
    }

    public final long getEventStartTime() {
        return this.eventStartTime;
    }

    public final int getEventTime() {
        return this.eventTime;
    }

    @NotNull
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final String getHeadFrameUrl() {
        return this.headFrameUrl;
    }

    @NotNull
    public final String getHeadurl() {
        return this.headurl;
    }

    @NotNull
    public final String getImageurl() {
        return this.imageurl;
    }

    public final int getKaVipLevel() {
        return this.kaVipLevel;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMedalId() {
        return this.medalId;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final int getNVIPLv() {
        return this.nVIPLv;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getPropCount() {
        return this.propCount;
    }

    @NotNull
    public final String getPropId() {
        return this.propId;
    }

    @NotNull
    public final String getPropImage() {
        return this.propImage;
    }

    public final int getReasonType() {
        return this.reasonType;
    }

    public final int getRewardCoin() {
        return this.rewardCoin;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    public final int getShopid() {
        return this.shopid;
    }

    @NotNull
    public final String getShopurl() {
        return this.shopurl;
    }

    @NotNull
    public final String getToprank() {
        return this.toprank;
    }

    @NotNull
    public final String getToptype() {
        return this.toptype;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUpCrystal() {
        return this.upCrystal;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    public final int getWealthLevel() {
        return this.wealthLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: isPraise, reason: from getter */
    public final String getIsPraise() {
        return this.isPraise;
    }

    public final void setAwardCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.awardCount = str;
    }

    public final void setAwardId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.awardId = str;
    }

    public final void setAwardImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.awardImage = str;
    }

    public final void setAwardtype(int i) {
        this.awardtype = i;
    }

    public final void setBadgeImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.badgeImage = str;
    }

    public final void setBadgeLevel(int i) {
        this.badgeLevel = i;
    }

    public final void setBuyType(int i) {
        this.buyType = i;
    }

    public final void setCause(int i) {
        this.cause = i;
    }

    public final void setCoin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coin = str;
    }

    public final void setDayNum(int i) {
        this.dayNum = i;
    }

    public final void setDyid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dyid = str;
    }

    public final void setDyurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dyurl = str;
    }

    public final void setEventId(long j) {
        this.eventId = j;
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setEventReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventReason = str;
    }

    public final void setEventStartTime(long j) {
        this.eventStartTime = j;
    }

    public final void setEventTime(int i) {
        this.eventTime = i;
    }

    public final void setExpirationTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expirationTime = str;
    }

    public final void setHeadFrameUrl(@Nullable String str) {
        this.headFrameUrl = str;
    }

    public final void setHeadurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headurl = str;
    }

    public final void setImageurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageurl = str;
    }

    public final void setKaVipLevel(int i) {
        this.kaVipLevel = i;
    }

    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    public final void setMedalId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalId = str;
    }

    public final void setMessageType(int i) {
        this.messageType = i;
    }

    public final void setNVIPLv(int i) {
        this.nVIPLv = i;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final void setPraise(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isPraise = str;
    }

    public final void setPropCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.propCount = str;
    }

    public final void setPropId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.propId = str;
    }

    public final void setPropImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.propImage = str;
    }

    public final void setReasonType(int i) {
        this.reasonType = i;
    }

    public final void setRewardCoin(int i) {
        this.rewardCoin = i;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setShopid(int i) {
        this.shopid = i;
    }

    public final void setShopurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopurl = str;
    }

    public final void setToprank(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toprank = str;
    }

    public final void setToptype(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toptype = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setUpCrystal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.upCrystal = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
    }

    public final void setWealthLevel(int i) {
        this.wealthLevel = i;
    }

    @NotNull
    public String toString() {
        return OooO.OooO00o(this);
    }
}
