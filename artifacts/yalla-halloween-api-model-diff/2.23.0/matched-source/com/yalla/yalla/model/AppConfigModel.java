package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001a\u0010*\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001a\u00109\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001e\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\b¨\u0006E"}, d2 = {"Lcom/yalla/yalla/model/AppConfigModel;", "", "()V", "bf", "", "getBf", "()Ljava/lang/String;", "setBf", "(Ljava/lang/String;)V", "currentCountryCode", "getCurrentCountryCode", "setCurrentCountryCode", "domainName", "getDomainName", "setDomainName", "firstRecharge", "", "getFirstRecharge", "()I", "setFirstRecharge", "(I)V", "imKeyPair", "getImKeyPair", "setImKeyPair", "isGet", "", "()Z", "setGet", "(Z)V", "isIns", "setIns", "isWc", "setWc", "phoneCodeType", "getPhoneCodeType", "setPhoneCodeType", "phoneWaCodeCountry", "getPhoneWaCodeCountry", "setPhoneWaCodeCountry", "redemptionCodeIsOpenCDK", "getRedemptionCodeIsOpenCDK", "setRedemptionCodeIsOpenCDK", "socketSwitch", "getSocketSwitch", "setSocketSwitch", "str", "getStr", "setStr", "time", "", "getTime", "()J", "setTime", "(J)V", "upt", "getUpt", "setUpt", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "setVersion", "yallaChatOfficeUrl", "getYallaChatOfficeUrl", "setYallaChatOfficeUrl", "yallaChatUrl", "getYallaChatUrl", "setYallaChatUrl", "yallachatTreeUrl", "getYallachatTreeUrl", "setYallachatTreeUrl", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppConfigModel {
    public static final int $stable = 8;
    private int firstRecharge;
    private boolean isGet;
    private boolean isIns;
    private boolean isWc;

    @SerializedName("isOpenCDK")
    private boolean redemptionCodeIsOpenCDK;
    private int socketSwitch;
    private long time;
    private boolean upt;
    private int version = 2;

    @NotNull
    private String domainName = "";

    @NotNull
    private String bf = "";

    @NotNull
    private String str = "";

    @SerializedName("messageStr")
    @NotNull
    private String imKeyPair = "";
    private int phoneCodeType = 1;

    @NotNull
    private String phoneWaCodeCountry = "";

    @NotNull
    private String yallaChatUrl = "";

    @NotNull
    private String yallachatTreeUrl = "";

    @SerializedName("yallaChatOfficUrl")
    @NotNull
    private String yallaChatOfficeUrl = "";

    @SerializedName("currCountryCode")
    @NotNull
    private String currentCountryCode = "";

    @NotNull
    public final String getBf() {
        return this.bf;
    }

    @NotNull
    public final String getCurrentCountryCode() {
        return this.currentCountryCode;
    }

    @NotNull
    public final String getDomainName() {
        return this.domainName;
    }

    public final int getFirstRecharge() {
        return this.firstRecharge;
    }

    @NotNull
    public final String getImKeyPair() {
        return this.imKeyPair;
    }

    public final int getPhoneCodeType() {
        return this.phoneCodeType;
    }

    @NotNull
    public final String getPhoneWaCodeCountry() {
        return this.phoneWaCodeCountry;
    }

    public final boolean getRedemptionCodeIsOpenCDK() {
        return this.redemptionCodeIsOpenCDK;
    }

    public final int getSocketSwitch() {
        return this.socketSwitch;
    }

    @NotNull
    public final String getStr() {
        return this.str;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean getUpt() {
        return this.upt;
    }

    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final String getYallaChatOfficeUrl() {
        return this.yallaChatOfficeUrl;
    }

    @NotNull
    public final String getYallaChatUrl() {
        return this.yallaChatUrl;
    }

    @NotNull
    public final String getYallachatTreeUrl() {
        return this.yallachatTreeUrl;
    }

    /* JADX INFO: renamed from: isGet, reason: from getter */
    public final boolean getIsGet() {
        return this.isGet;
    }

    /* JADX INFO: renamed from: isIns, reason: from getter */
    public final boolean getIsIns() {
        return this.isIns;
    }

    /* JADX INFO: renamed from: isWc, reason: from getter */
    public final boolean getIsWc() {
        return this.isWc;
    }

    public final void setBf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bf = str;
    }

    public final void setCurrentCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentCountryCode = str;
    }

    public final void setDomainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domainName = str;
    }

    public final void setFirstRecharge(int i) {
        this.firstRecharge = i;
    }

    public final void setGet(boolean z) {
        this.isGet = z;
    }

    public final void setImKeyPair(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imKeyPair = str;
    }

    public final void setIns(boolean z) {
        this.isIns = z;
    }

    public final void setPhoneCodeType(int i) {
        this.phoneCodeType = i;
    }

    public final void setPhoneWaCodeCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneWaCodeCountry = str;
    }

    public final void setRedemptionCodeIsOpenCDK(boolean z) {
        this.redemptionCodeIsOpenCDK = z;
    }

    public final void setSocketSwitch(int i) {
        this.socketSwitch = i;
    }

    public final void setStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.str = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUpt(boolean z) {
        this.upt = z;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setWc(boolean z) {
        this.isWc = z;
    }

    public final void setYallaChatOfficeUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.yallaChatOfficeUrl = str;
    }

    public final void setYallaChatUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.yallaChatUrl = str;
    }

    public final void setYallachatTreeUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.yallachatTreeUrl = str;
    }
}
