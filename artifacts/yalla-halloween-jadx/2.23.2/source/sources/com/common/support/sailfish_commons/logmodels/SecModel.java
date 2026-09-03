package com.common.support.sailfish_commons.logmodels;

import androidx.annotation.Keep;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\bi\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0097\u0001\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001a\u0010>\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001a\u0010D\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001a\u0010G\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR\u001a\u0010J\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\u001a\u0010M\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\u001a\u0010P\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR\u001a\u0010S\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001a\u0010V\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\u001a\u0010Y\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010\u000eR\u001a\u0010\\\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0006\"\u0004\b^\u0010\bR\u001a\u0010_\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0006\"\u0004\ba\u0010\bR\u001a\u0010b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0006\"\u0004\bd\u0010\bR\u001a\u0010e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\f\"\u0004\bg\u0010\u000eR\u001a\u0010h\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\f\"\u0004\bj\u0010\u000eR\u001a\u0010k\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0006\"\u0004\bm\u0010\bR\u001a\u0010n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0006\"\u0004\bp\u0010\bR\u001a\u0010q\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\f\"\u0004\bx\u0010\u000eR\u001a\u0010y\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0006\"\u0004\b{\u0010\bR\u001a\u0010|\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\f\"\u0004\b~\u0010\u000eR\u001c\u0010\u007f\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\f\"\u0005\b\u0081\u0001\u0010\u000eR\u001d\u0010\u0082\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0006\"\u0005\b\u0084\u0001\u0010\bR\u001d\u0010\u0085\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\f\"\u0005\b\u0087\u0001\u0010\u000eR\u001d\u0010\u0088\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\f\"\u0005\b\u008a\u0001\u0010\u000eR\u001d\u0010\u008b\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0006\"\u0005\b\u008d\u0001\u0010\bR\u001d\u0010\u008e\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\f\"\u0005\b\u0090\u0001\u0010\u000eR\u001d\u0010\u0091\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u0006\"\u0005\b\u0093\u0001\u0010\bR\u001d\u0010\u0094\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u0006\"\u0005\b\u0096\u0001\u0010\b¨\u0006\u0098\u0001"}, d2 = {"Lcom/common/support/sailfish_commons/logmodels/SecModel;", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", "()V", "accessibilityS", "", "getAccessibilityS", "()Z", "setAccessibilityS", "(Z)V", "acsPackages", "", "getAcsPackages", "()Ljava/lang/String;", "setAcsPackages", "(Ljava/lang/String;)V", "antiBypassJailbreak", "getAntiBypassJailbreak", "setAntiBypassJailbreak", "appInstallS", "getAppInstallS", "setAppInstallS", "appVirtual", "getAppVirtual", "setAppVirtual", "appVirtualPkg", "getAppVirtualPkg", "setAppVirtualPkg", "attachPort", "", "", "getAttachPort", "()Ljava/util/List;", "setAttachPort", "(Ljava/util/List;)V", "bootId", "getBootId", "setBootId", "certMD5", "getCertMD5", "setCertMD5", "debug", "getDebug", "setDebug", DeviceRequestsHelper.DEVICE_INFO_DEVICE, "getDevice", "setDevice", "doneAtTime", "", "getDoneAtTime", "()J", "emulator", "getEmulator", "setEmulator", "fileIntegrity", "getFileIntegrity", "setFileIntegrity", "fishHook", "getFishHook", "setFishHook", "frida", "getFrida", "setFrida", "hasFlash", "getHasFlash", "setHasFlash", "hasSim", "getHasSim", "setHasSim", "iden", "getIden", "setIden", "injection", "getInjection", "setInjection", "inlineHook", "getInlineHook", "setInlineHook", "language", "getLanguage", "setLanguage", "lightSensor", "getLightSensor", "setLightSensor", "magisk", "getMagisk", "setMagisk", "msHookFun", "getMsHookFun", "setMsHookFun", "networkType", "getNetworkType", "setNetworkType", "ptrace", "getPtrace", "setPtrace", "reSignature", "getReSignature", "setReSignature", "reserveTool", "getReserveTool", "setReserveTool", "reserveToolName", "getReserveToolName", "setReserveToolName", "riskFile", "getRiskFile", "setRiskFile", "root", "getRoot", "setRoot", "runtimeHook", "getRuntimeHook", "setRuntimeHook", "sensor", "getSensor", "()I", "setSensor", "(I)V", "smid", "getSmid", "setSmid", "substrate", "getSubstrate", "setSubstrate", "time", "getTime", "setTime", RemoteConfigConstants$RequestFieldKey.TIME_ZONE, "getTimeZone", "setTimeZone", "usb", "getUsb", "setUsb", "userId", "getUserId", "setUserId", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "setVersion", "vpn", "getVpn", "setVpn", "wifiProxy", "getWifiProxy", "setWifiProxy", "xposed", "getXposed", "setXposed", "zygisk", "getZygisk", "setZygisk", "toString", "sailfish-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SecModel extends BaseModel {
    private boolean accessibilityS;
    private boolean antiBypassJailbreak;
    private boolean appVirtual;

    @Nullable
    private List<Integer> attachPort;
    private boolean debug;
    private boolean emulator;
    private boolean fileIntegrity;
    private boolean fishHook;
    private boolean frida;
    private boolean hasSim;
    private boolean injection;
    private boolean inlineHook;
    private boolean lightSensor;
    private boolean magisk;
    private boolean msHookFun;
    private boolean ptrace;
    private boolean reSignature;
    private boolean reserveTool;
    private boolean root;
    private boolean runtimeHook;
    private int sensor;
    private boolean substrate;
    private boolean usb;
    private boolean vpn;
    private boolean xposed;
    private boolean zygisk;

    @NotNull
    private String iden = "";

    @NotNull
    private String time = "";

    @NotNull
    private String userId = "";

    @NotNull
    private String version = "";

    @NotNull
    private String device = "";

    @NotNull
    private String appInstallS = "";

    @NotNull
    private String wifiProxy = "";
    private boolean hasFlash = true;

    @NotNull
    private String language = "";

    @NotNull
    private String networkType = "";

    @NotNull
    private String timeZone = "";

    @NotNull
    private String appVirtualPkg = "";

    @NotNull
    private String reserveToolName = "";

    @NotNull
    private String certMD5 = "";
    private final long doneAtTime = System.currentTimeMillis();

    @NotNull
    private String riskFile = "";

    @NotNull
    private String acsPackages = "";

    @NotNull
    private String bootId = "";

    @NotNull
    private String smid = "";

    public final boolean getAccessibilityS() {
        return this.accessibilityS;
    }

    @NotNull
    public final String getAcsPackages() {
        return this.acsPackages;
    }

    public final boolean getAntiBypassJailbreak() {
        return this.antiBypassJailbreak;
    }

    @NotNull
    public final String getAppInstallS() {
        return this.appInstallS;
    }

    public final boolean getAppVirtual() {
        return this.appVirtual;
    }

    @NotNull
    public final String getAppVirtualPkg() {
        return this.appVirtualPkg;
    }

    @Nullable
    public final List<Integer> getAttachPort() {
        return this.attachPort;
    }

    @NotNull
    public final String getBootId() {
        return this.bootId;
    }

    @NotNull
    public final String getCertMD5() {
        return this.certMD5;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    @NotNull
    public final String getDevice() {
        return this.device;
    }

    public final long getDoneAtTime() {
        return this.doneAtTime;
    }

    public final boolean getEmulator() {
        return this.emulator;
    }

    public final boolean getFileIntegrity() {
        return this.fileIntegrity;
    }

    public final boolean getFishHook() {
        return this.fishHook;
    }

    public final boolean getFrida() {
        return this.frida;
    }

    public final boolean getHasFlash() {
        return this.hasFlash;
    }

    public final boolean getHasSim() {
        return this.hasSim;
    }

    @NotNull
    public final String getIden() {
        return this.iden;
    }

    public final boolean getInjection() {
        return this.injection;
    }

    public final boolean getInlineHook() {
        return this.inlineHook;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    public final boolean getLightSensor() {
        return this.lightSensor;
    }

    public final boolean getMagisk() {
        return this.magisk;
    }

    public final boolean getMsHookFun() {
        return this.msHookFun;
    }

    @NotNull
    public final String getNetworkType() {
        return this.networkType;
    }

    public final boolean getPtrace() {
        return this.ptrace;
    }

    public final boolean getReSignature() {
        return this.reSignature;
    }

    public final boolean getReserveTool() {
        return this.reserveTool;
    }

    @NotNull
    public final String getReserveToolName() {
        return this.reserveToolName;
    }

    @NotNull
    public final String getRiskFile() {
        return this.riskFile;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final boolean getRuntimeHook() {
        return this.runtimeHook;
    }

    public final int getSensor() {
        return this.sensor;
    }

    @NotNull
    public final String getSmid() {
        return this.smid;
    }

    public final boolean getSubstrate() {
        return this.substrate;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final boolean getUsb() {
        return this.usb;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final boolean getVpn() {
        return this.vpn;
    }

    @NotNull
    public final String getWifiProxy() {
        return this.wifiProxy;
    }

    public final boolean getXposed() {
        return this.xposed;
    }

    public final boolean getZygisk() {
        return this.zygisk;
    }

    public final void setAccessibilityS(boolean z) {
        this.accessibilityS = z;
    }

    public final void setAcsPackages(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.acsPackages = str;
    }

    public final void setAntiBypassJailbreak(boolean z) {
        this.antiBypassJailbreak = z;
    }

    public final void setAppInstallS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appInstallS = str;
    }

    public final void setAppVirtual(boolean z) {
        this.appVirtual = z;
    }

    public final void setAppVirtualPkg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVirtualPkg = str;
    }

    public final void setAttachPort(@Nullable List<Integer> list) {
        this.attachPort = list;
    }

    public final void setBootId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bootId = str;
    }

    public final void setCertMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.certMD5 = str;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setDevice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device = str;
    }

    public final void setEmulator(boolean z) {
        this.emulator = z;
    }

    public final void setFileIntegrity(boolean z) {
        this.fileIntegrity = z;
    }

    public final void setFishHook(boolean z) {
        this.fishHook = z;
    }

    public final void setFrida(boolean z) {
        this.frida = z;
    }

    public final void setHasFlash(boolean z) {
        this.hasFlash = z;
    }

    public final void setHasSim(boolean z) {
        this.hasSim = z;
    }

    public final void setIden(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iden = str;
    }

    public final void setInjection(boolean z) {
        this.injection = z;
    }

    public final void setInlineHook(boolean z) {
        this.inlineHook = z;
    }

    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final void setLightSensor(boolean z) {
        this.lightSensor = z;
    }

    public final void setMagisk(boolean z) {
        this.magisk = z;
    }

    public final void setMsHookFun(boolean z) {
        this.msHookFun = z;
    }

    public final void setNetworkType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkType = str;
    }

    public final void setPtrace(boolean z) {
        this.ptrace = z;
    }

    public final void setReSignature(boolean z) {
        this.reSignature = z;
    }

    public final void setReserveTool(boolean z) {
        this.reserveTool = z;
    }

    public final void setReserveToolName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserveToolName = str;
    }

    public final void setRiskFile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.riskFile = str;
    }

    public final void setRoot(boolean z) {
        this.root = z;
    }

    public final void setRuntimeHook(boolean z) {
        this.runtimeHook = z;
    }

    public final void setSensor(int i) {
        this.sensor = i;
    }

    public final void setSmid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.smid = str;
    }

    public final void setSubstrate(boolean z) {
        this.substrate = z;
    }

    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    public final void setTimeZone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeZone = str;
    }

    public final void setUsb(boolean z) {
        this.usb = z;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    public final void setVpn(boolean z) {
        this.vpn = z;
    }

    public final void setWifiProxy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiProxy = str;
    }

    public final void setXposed(boolean z) {
        this.xposed = z;
    }

    public final void setZygisk(boolean z) {
        this.zygisk = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SecModel(iden='");
        sb.append(this.iden);
        sb.append("', time='");
        sb.append(this.time);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', version='");
        sb.append(this.version);
        sb.append("', device='");
        sb.append(this.device);
        sb.append("', debug=");
        sb.append(this.debug);
        sb.append(", emulator=");
        sb.append(this.emulator);
        sb.append(", fishHook=");
        sb.append(this.fishHook);
        sb.append(", fileIntegrity=");
        sb.append(this.fileIntegrity);
        sb.append(", reserveTool=");
        sb.append(this.reserveTool);
        sb.append(", runtimeHook=");
        sb.append(this.runtimeHook);
        sb.append(", msHookFun=");
        sb.append(this.msHookFun);
        sb.append(", appInstallS='");
        sb.append(this.appInstallS);
        sb.append("', root=");
        sb.append(this.root);
        sb.append(", vpn=");
        sb.append(this.vpn);
        sb.append(", injection=");
        sb.append(this.injection);
        sb.append(", xposed=");
        sb.append(this.xposed);
        sb.append(", frida=");
        sb.append(this.frida);
        sb.append(", substrate=");
        sb.append(this.substrate);
        sb.append(", wifiProxy='");
        sb.append(this.wifiProxy);
        sb.append("', ptrace=");
        sb.append(this.ptrace);
        sb.append(", appVirtual=");
        sb.append(this.appVirtual);
        sb.append(", sensor=");
        sb.append(this.sensor);
        sb.append(", hasFlash=");
        sb.append(this.hasFlash);
        sb.append(", attachPort=");
        sb.append(this.attachPort);
        sb.append(", usb=");
        sb.append(this.usb);
        sb.append(", lightSensor=");
        sb.append(this.lightSensor);
        sb.append(", accessibilityS=");
        sb.append(this.accessibilityS);
        sb.append(", language='");
        sb.append(this.language);
        sb.append("', networkType='");
        sb.append(this.networkType);
        sb.append("', timeZone='");
        sb.append(this.timeZone);
        sb.append("', appVirtualPkg='");
        sb.append(this.appVirtualPkg);
        sb.append("', hasSim=");
        sb.append(this.hasSim);
        sb.append(", reserveToolName='");
        sb.append(this.reserveToolName);
        sb.append("', magisk=");
        sb.append(this.magisk);
        sb.append(", inlineHook=");
        sb.append(this.inlineHook);
        sb.append(", zygisk=");
        sb.append(this.zygisk);
        sb.append(", certMD5='");
        sb.append(this.certMD5);
        sb.append("', antiBypassJailbreak=");
        sb.append(this.antiBypassJailbreak);
        sb.append(", reSignature=");
        sb.append(this.reSignature);
        sb.append(", doneAtTime=");
        sb.append(this.doneAtTime);
        sb.append(", riskFile='");
        sb.append(this.riskFile);
        sb.append("', acsPackages='");
        sb.append(this.acsPackages);
        sb.append("', bootId='");
        sb.append(this.bootId);
        sb.append("', smid='");
        return o0oOO.OooO0O0(sb, this.smid, "')");
    }
}
