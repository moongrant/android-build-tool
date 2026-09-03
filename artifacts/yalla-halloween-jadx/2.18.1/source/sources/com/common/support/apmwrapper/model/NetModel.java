package com.common.support.apmwrapper.model;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R&\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R2\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR2\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R2\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\b¨\u0006:"}, d2 = {"Lcom/common/support/apmwrapper/model/NetModel;", "", "()V", "country", "", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", DeviceRequestsHelper.DEVICE_INFO_DEVICE, "getDevice", "setDevice", "dns", "", "getDns", "()Ljava/util/List;", "setDns", "(Ljava/util/List;)V", "endTime", "getEndTime", "setEndTime", "network", "getNetwork", "setNetwork", "operator", "getOperator", "setOperator", "publicIp", "getPublicIp", "setPublicIp", ak.z, "", "getResolution", "()Ljava/util/Map;", "setResolution", "(Ljava/util/Map;)V", "speedTest", "Lcom/common/support/apmwrapper/model/NetModel$NetSpeedModel;", "getSpeedTest", "()Lcom/common/support/apmwrapper/model/NetModel$NetSpeedModel;", "setSpeedTest", "(Lcom/common/support/apmwrapper/model/NetModel$NetSpeedModel;)V", AnalyticsConfig.RTD_START_TIME, "getStartTime", "setStartTime", "tcpPing", "getTcpPing", "setTcpPing", "traceRoute", "getTraceRoute", "setTraceRoute", "userId", "getUserId", "setUserId", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "setVersion", "NetSpeedModel", "ApmWrapper_release"}, k = 1, mv = {1, 4, 0})
public final class NetModel {

    @SerializedName("DNS")
    @Nullable
    private List<String> dns;

    @SerializedName("Operator")
    @Nullable
    private List<String> operator;

    @SerializedName("PublicIp")
    @Nullable
    private List<String> publicIp;

    @SerializedName("Resolution")
    @Nullable
    private Map<String, ? extends List<String>> resolution;

    @SerializedName("SpeedTest")
    @Nullable
    private NetSpeedModel speedTest;

    @SerializedName("TCPPing")
    @Nullable
    private Map<String, ? extends List<String>> tcpPing;

    @SerializedName("Traceroute")
    @Nullable
    private Map<String, ? extends List<String>> traceRoute;

    @SerializedName("StartTime")
    @NotNull
    private String startTime = "";

    @SerializedName("EndTime")
    @NotNull
    private String endTime = "";

    @SerializedName("UserID")
    @NotNull
    private String userId = "";

    @SerializedName("Device")
    @NotNull
    private String device = "";

    @SerializedName("Version")
    @NotNull
    private String version = "";

    @SerializedName("Country")
    @NotNull
    private String country = "";

    @SerializedName("Network")
    @NotNull
    private String network = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/common/support/apmwrapper/model/NetModel$NetSpeedModel;", "", "()V", "download", "", "getDownload", "()Ljava/lang/String;", "setDownload", "(Ljava/lang/String;)V", "upload", "getUpload", "setUpload", "ApmWrapper_release"}, k = 1, mv = {1, 4, 0})
    public static final class NetSpeedModel {

        @SerializedName("Upload")
        @NotNull
        private String upload = "";

        @SerializedName("Download")
        @NotNull
        private String download = "";

        @NotNull
        public final String getDownload() {
            return this.download;
        }

        @NotNull
        public final String getUpload() {
            return this.upload;
        }

        public final void setDownload(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.download = str;
        }

        public final void setUpload(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.upload = str;
        }
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDevice() {
        return this.device;
    }

    @Nullable
    public final List<String> getDns() {
        return this.dns;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final List<String> getOperator() {
        return this.operator;
    }

    @Nullable
    public final List<String> getPublicIp() {
        return this.publicIp;
    }

    @Nullable
    public final Map<String, List<String>> getResolution() {
        return this.resolution;
    }

    @Nullable
    public final NetSpeedModel getSpeedTest() {
        return this.speedTest;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Map<String, List<String>> getTcpPing() {
        return this.tcpPing;
    }

    @Nullable
    public final Map<String, List<String>> getTraceRoute() {
        return this.traceRoute;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setDevice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device = str;
    }

    public final void setDns(@Nullable List<String> list) {
        this.dns = list;
    }

    public final void setEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endTime = str;
    }

    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.network = str;
    }

    public final void setOperator(@Nullable List<String> list) {
        this.operator = list;
    }

    public final void setPublicIp(@Nullable List<String> list) {
        this.publicIp = list;
    }

    public final void setResolution(@Nullable Map<String, ? extends List<String>> map) {
        this.resolution = map;
    }

    public final void setSpeedTest(@Nullable NetSpeedModel netSpeedModel) {
        this.speedTest = netSpeedModel;
    }

    public final void setStartTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startTime = str;
    }

    public final void setTcpPing(@Nullable Map<String, ? extends List<String>> map) {
        this.tcpPing = map;
    }

    public final void setTraceRoute(@Nullable Map<String, ? extends List<String>> map) {
        this.traceRoute = map;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
