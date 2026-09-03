package com.common.support.apmwrapper.model;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import com.umeng.analytics.pro.ak;
import com.umeng.umcrash.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\bL\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001e\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u001e\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001e\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001e\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001e\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001e\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001e\u00101\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001e\u00104\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001e\u00107\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001e\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001e\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001e\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001e\u0010C\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\u001e\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001e\u0010Q\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\u001e\u0010T\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\u001e\u0010W\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001e\u0010Z\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u000eR\u001e\u0010]\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\b¨\u0006`"}, d2 = {"Lcom/common/support/apmwrapper/model/SecModel;", "", "()V", "accessibilityS", "", "getAccessibilityS", "()Z", "setAccessibilityS", "(Z)V", "appInstallS", "", "getAppInstallS", "()Ljava/lang/String;", "setAppInstallS", "(Ljava/lang/String;)V", "appVirtual", "getAppVirtual", "setAppVirtual", "attachPort", "", "", "getAttachPort", "()Ljava/util/List;", "setAttachPort", "(Ljava/util/List;)V", "cFlash", "getCFlash", "setCFlash", BuildConfig.BUILD_TYPE, "getDebug", "setDebug", DeviceRequestsHelper.DEVICE_INFO_DEVICE, "getDevice", "setDevice", "emulator", "getEmulator", "setEmulator", "fileIntegrity", "getFileIntegrity", "setFileIntegrity", "fishHook", "getFishHook", "setFishHook", "frida", "getFrida", "setFrida", "injection", "getInjection", "setInjection", "lightSensor", "getLightSensor", "setLightSensor", "msHookFun", "getMsHookFun", "setMsHookFun", "ptrace", "getPtrace", "setPtrace", "reserveTool", "getReserveTool", "setReserveTool", "root", "getRoot", "setRoot", "runtimeHook", "getRuntimeHook", "setRuntimeHook", ak.ac, "getSensor", "()I", "setSensor", "(I)V", "substrate", "getSubstrate", "setSubstrate", "time", "getTime", "setTime", "usb", "getUsb", "setUsb", "userId", "getUserId", "setUserId", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "setVersion", "vpn", "getVpn", "setVpn", "wifiProxy", "getWifiProxy", "setWifiProxy", "xposed", "getXposed", "setXposed", "ApmWrapper_release"}, k = 1, mv = {1, 4, 0})
public final class SecModel {

    @SerializedName("AccessibilityS")
    private boolean accessibilityS;

    @SerializedName("AppVirtual")
    private boolean appVirtual;

    @SerializedName("AttachPort")
    @Nullable
    private List<Integer> attachPort;

    @SerializedName("Debug")
    private boolean debug;

    @SerializedName("Emulator")
    private boolean emulator;

    @SerializedName("FileIntegrity")
    private boolean fileIntegrity;

    @SerializedName("FishHook")
    private boolean fishHook;

    @SerializedName("Frida")
    private boolean frida;

    @SerializedName("Injection")
    private boolean injection;

    @SerializedName("LightSensor")
    private boolean lightSensor;

    @SerializedName("MSHookFun")
    private boolean msHookFun;

    @SerializedName("Ptrace")
    private boolean ptrace;

    @SerializedName("ReserveTool")
    private boolean reserveTool;

    @SerializedName("Root")
    private boolean root;

    @SerializedName("RuntimeHook")
    private boolean runtimeHook;

    @SerializedName("Sensor")
    private int sensor;

    @SerializedName("Substrate")
    private boolean substrate;

    @SerializedName("USB")
    private boolean usb;

    @SerializedName("VPN")
    private boolean vpn;

    @SerializedName("Xposed")
    private boolean xposed;

    @SerializedName("Time")
    @NotNull
    private String time = "";

    @SerializedName("UserID")
    @NotNull
    private String userId = "";

    @SerializedName("Version")
    @NotNull
    private String version = "";

    @SerializedName("Device")
    @NotNull
    private String device = "";

    @SerializedName("AppInstallS")
    @NotNull
    private String appInstallS = "";

    @SerializedName("WifiProxy")
    @NotNull
    private String wifiProxy = "";

    @SerializedName("CFlash")
    private boolean cFlash = true;

    public final boolean getAccessibilityS() {
        return this.accessibilityS;
    }

    @NotNull
    public final String getAppInstallS() {
        return this.appInstallS;
    }

    public final boolean getAppVirtual() {
        return this.appVirtual;
    }

    @Nullable
    public final List<Integer> getAttachPort() {
        return this.attachPort;
    }

    public final boolean getCFlash() {
        return this.cFlash;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    @NotNull
    public final String getDevice() {
        return this.device;
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

    public final boolean getInjection() {
        return this.injection;
    }

    public final boolean getLightSensor() {
        return this.lightSensor;
    }

    public final boolean getMsHookFun() {
        return this.msHookFun;
    }

    public final boolean getPtrace() {
        return this.ptrace;
    }

    public final boolean getReserveTool() {
        return this.reserveTool;
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

    public final boolean getSubstrate() {
        return this.substrate;
    }

    @NotNull
    public final String getTime() {
        return this.time;
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

    public final void setAccessibilityS(boolean z) {
        this.accessibilityS = z;
    }

    public final void setAppInstallS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appInstallS = str;
    }

    public final void setAppVirtual(boolean z) {
        this.appVirtual = z;
    }

    public final void setAttachPort(@Nullable List<Integer> list) {
        this.attachPort = list;
    }

    public final void setCFlash(boolean z) {
        this.cFlash = z;
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

    public final void setInjection(boolean z) {
        this.injection = z;
    }

    public final void setLightSensor(boolean z) {
        this.lightSensor = z;
    }

    public final void setMsHookFun(boolean z) {
        this.msHookFun = z;
    }

    public final void setPtrace(boolean z) {
        this.ptrace = z;
    }

    public final void setReserveTool(boolean z) {
        this.reserveTool = z;
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

    public final void setSubstrate(boolean z) {
        this.substrate = z;
    }

    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
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
}
