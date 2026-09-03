package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.fragment.ContributionFragment;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\bL\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010c\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001e\u0010$\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R \u0010-\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001a\u00109\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001e\u0010<\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014R\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001e\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR\u001e\u0010N\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014R\u001e\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001e\u0010T\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0012\"\u0004\bV\u0010\u0014R\u001a\u0010W\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0012\"\u0004\bY\u0010\u0014R\u001e\u0010Z\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0012\"\u0004\b\\\u0010\u0014R\u001e\u0010]\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u001b\"\u0004\b_\u0010\u001dR\u001e\u0010`\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\b¨\u0006e"}, d2 = {"Lcom/yalla/yalla/model/SystemMessageData;", "", "()V", "awardtype", "", "getAwardtype", "()I", "setAwardtype", "(I)V", "buyType", "getBuyType", "setBuyType", "cause", "getCause", "setCause", "coin", "", "getCoin", "()Ljava/lang/String;", "setCoin", "(Ljava/lang/String;)V", "dayNum", "getDayNum", "setDayNum", "eventId", "", "getEventId", "()J", "setEventId", "(J)V", "eventName", "getEventName", "setEventName", "eventReason", "getEventReason", "setEventReason", "eventStartTime", "getEventStartTime", "setEventStartTime", "eventTime", "getEventTime", "setEventTime", "expirationTime", "getExpirationTime", "setExpirationTime", "headFrameUrl", "getHeadFrameUrl", "setHeadFrameUrl", "imageurl", "getImageurl", "setImageurl", "kaVipLevel", "getKaVipLevel", "setKaVipLevel", ak.N, "getLanguage", "setLanguage", "level", "getLevel", "setLevel", "medalId", "getMedalId", "setMedalId", "messageType", "getMessageType", "setMessageType", "nVIPLv", "getNVIPLv", "setNVIPLv", "reasonType", "getReasonType", "setReasonType", "rewardCoin", "getRewardCoin", "setRewardCoin", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomName", "getRoomName", "setRoomName", "shopid", "getShopid", "setShopid", "shopurl", "getShopurl", "setShopurl", "type", "getType", "setType", "upCrystal", "getUpCrystal", "setUpCrystal", "userId", "getUserId", "setUserId", "vipLevel", "getVipLevel", "setVipLevel", "toString", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SystemMessageData {
    public static final int CUSTOM_THEME_DELETE = 4;
    public static final int CUSTOM_THEME_FAILED = 2;
    public static final int CUSTOM_THEME_SUCCESSFUL = 1;
    private int awardtype;

    @SerializedName("buytype")
    private int buyType;
    private int cause;

    @SerializedName("daynum")
    private int dayNum;

    @SerializedName("id")
    private long eventId;

    @SerializedName(AnalyticsConfig.RTD_START_TIME)
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

    public final int getAwardtype() {
        return this.awardtype;
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

    public final int getShopid() {
        return this.shopid;
    }

    @NotNull
    public final String getShopurl() {
        return this.shopurl;
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

    public final void setAwardtype(int i) {
        this.awardtype = i;
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

    public final void setShopid(int i) {
        this.shopid = i;
    }

    public final void setShopurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopurl = str;
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

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SystemMessageData(awardtype=");
        sbOooO0o0.append(this.awardtype);
        sbOooO0o0.append(", imageurl='");
        sbOooO0o0.append(this.imageurl);
        sbOooO0o0.append("', medalId='");
        sbOooO0o0.append(this.medalId);
        sbOooO0o0.append("', type='");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append("', level='");
        sbOooO0o0.append(this.level);
        sbOooO0o0.append("', coin='");
        sbOooO0o0.append(this.coin);
        sbOooO0o0.append("', upCrystal='");
        sbOooO0o0.append(this.upCrystal);
        sbOooO0o0.append("', language='");
        sbOooO0o0.append(this.language);
        sbOooO0o0.append("', vipLevel=");
        sbOooO0o0.append(this.vipLevel);
        sbOooO0o0.append(", nVIPLv=");
        sbOooO0o0.append(this.nVIPLv);
        sbOooO0o0.append(", expirationTime='");
        sbOooO0o0.append(this.expirationTime);
        sbOooO0o0.append("', headFrameUrl=");
        sbOooO0o0.append(this.headFrameUrl);
        sbOooO0o0.append(", buyType=");
        sbOooO0o0.append(this.buyType);
        sbOooO0o0.append(", kaVipLevel=");
        sbOooO0o0.append(this.kaVipLevel);
        sbOooO0o0.append(", userId=");
        sbOooO0o0.append(this.userId);
        sbOooO0o0.append(", dayNum=");
        sbOooO0o0.append(this.dayNum);
        sbOooO0o0.append(", eventName='");
        sbOooO0o0.append(this.eventName);
        sbOooO0o0.append("', eventTime=");
        sbOooO0o0.append(this.eventTime);
        sbOooO0o0.append(", eventStartTime=");
        sbOooO0o0.append(this.eventStartTime);
        sbOooO0o0.append(", eventReason='");
        sbOooO0o0.append(this.eventReason);
        sbOooO0o0.append("', eventRoomId=");
        sbOooO0o0.append(this.roomId);
        sbOooO0o0.append(", cause=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.cause, ')');
    }
}
