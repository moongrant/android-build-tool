package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001a\u00106\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001a\u00109\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR(\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/yalla/yalla/model/JSInfoModel;", "", "()V", "appVersionCode", "", "getAppVersionCode", "()I", "setAppVersionCode", "(I)V", "appVersionName", "", "getAppVersionName", "()Ljava/lang/String;", "setAppVersionName", "(Ljava/lang/String;)V", "chatToken", "getChatToken", "setChatToken", "kaVipLevel", "getKaVipLevel", "setKaVipLevel", "netType", "getNetType", "setNetType", "networkOperatorName", "getNetworkOperatorName", "setNetworkOperatorName", "phoneBrand", "getPhoneBrand", "setPhoneBrand", "phoneModel", "getPhoneModel", "setPhoneModel", "recentRoomID", "", "getRecentRoomID", "()J", "setRecentRoomID", "(J)V", "region", "getRegion", "setRegion", "roomID", "getRoomID", "setRoomID", "systemVersionCode", "getSystemVersionCode", "setSystemVersionCode", "systemVersionName", "getSystemVersionName", "setSystemVersionName", "token", "getToken", "setToken", "userId", "getUserId", "setUserId", "userIdx", "getUserIdx", "setUserIdx", "userLevel", "getUserLevel", "setUserLevel", "userToken", "getUserToken", "setUserToken", "vipLevel", "getVipLevel", "setVipLevel", "zeus", "", "getZeus", "()Ljava/util/Map;", "setZeus", "(Ljava/util/Map;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JSInfoModel {
    public static final int $stable = 8;
    private int appVersionCode;
    private int kaVipLevel;
    private long recentRoomID;
    private int region;
    private long roomID;
    private long userId;
    private int userLevel;
    private int vipLevel;

    @Nullable
    private Map<String, String> zeus;

    @NotNull
    private String userIdx = "";

    @NotNull
    private String token = "";

    @NotNull
    private String userToken = "";

    @NotNull
    private String chatToken = "";

    @NotNull
    private String appVersionName = "";

    @NotNull
    private String phoneBrand = "";

    @NotNull
    private String phoneModel = "";

    @NotNull
    private String systemVersionCode = "";

    @NotNull
    private String systemVersionName = "";

    @NotNull
    private String netType = "";

    @NotNull
    private String networkOperatorName = "";

    public final int getAppVersionCode() {
        return this.appVersionCode;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    @NotNull
    public final String getChatToken() {
        return this.chatToken;
    }

    public final int getKaVipLevel() {
        return this.kaVipLevel;
    }

    @NotNull
    public final String getNetType() {
        return this.netType;
    }

    @NotNull
    public final String getNetworkOperatorName() {
        return this.networkOperatorName;
    }

    @NotNull
    public final String getPhoneBrand() {
        return this.phoneBrand;
    }

    @NotNull
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    public final long getRecentRoomID() {
        return this.recentRoomID;
    }

    public final int getRegion() {
        return this.region;
    }

    public final long getRoomID() {
        return this.roomID;
    }

    @NotNull
    public final String getSystemVersionCode() {
        return this.systemVersionCode;
    }

    @NotNull
    public final String getSystemVersionName() {
        return this.systemVersionName;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserIdx() {
        return this.userIdx;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    @NotNull
    public final String getUserToken() {
        return this.userToken;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    @Nullable
    public final Map<String, String> getZeus() {
        return this.zeus;
    }

    public final void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public final void setAppVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersionName = str;
    }

    public final void setChatToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chatToken = str;
    }

    public final void setKaVipLevel(int i) {
        this.kaVipLevel = i;
    }

    public final void setNetType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.netType = str;
    }

    public final void setNetworkOperatorName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkOperatorName = str;
    }

    public final void setPhoneBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneBrand = str;
    }

    public final void setPhoneModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneModel = str;
    }

    public final void setRecentRoomID(long j) {
        this.recentRoomID = j;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setRoomID(long j) {
        this.roomID = j;
    }

    public final void setSystemVersionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.systemVersionCode = str;
    }

    public final void setSystemVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.systemVersionName = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserIdx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userIdx = str;
    }

    public final void setUserLevel(int i) {
        this.userLevel = i;
    }

    public final void setUserToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userToken = str;
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
    }

    public final void setZeus(@Nullable Map<String, String> map) {
        this.zeus = map;
    }
}
