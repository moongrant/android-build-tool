package com.common.support.sailfish_commons.logmodels;

import androidx.annotation.Keep;
import androidx.compose.animation.o000oOoO;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010C\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR.\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\"\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R.\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001a\u00101\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR.\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R.\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001a\u0010:\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\b¨\u0006D"}, d2 = {"Lcom/common/support/sailfish_commons/logmodels/NetModel;", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", "()V", UserDataStore.COUNTRY, "", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", DeviceRequestsHelper.DEVICE_INFO_DEVICE, "getDevice", "setDevice", "dns", "", "getDns", "()Ljava/util/List;", "setDns", "(Ljava/util/List;)V", "doneAtTime", "", "getDoneAtTime", "()J", "download", "getDownload", "setDownload", "endTime", "getEndTime", "setEndTime", "icmpPing", "", "getIcmpPing", "()Ljava/util/Map;", "setIcmpPing", "(Ljava/util/Map;)V", "iden", "getIden", "setIden", "network", "getNetwork", "setNetwork", "operator", "getOperator", "setOperator", "publicIp", "getPublicIp", "setPublicIp", "resolution", "getResolution", "setResolution", "startTime", "getStartTime", "setStartTime", "tcpPing", "getTcpPing", "setTcpPing", "traceRoute", "getTraceRoute", "setTraceRoute", "upload", "getUpload", "setUpload", "userId", "getUserId", "setUserId", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "setVersion", "toString", "sailfish-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetModel extends BaseModel {

    @Nullable
    private List<String> dns;

    @Nullable
    private Map<String, ? extends List<String>> icmpPing;

    @Nullable
    private List<String> operator;

    @Nullable
    private List<String> publicIp;

    @Nullable
    private Map<String, ? extends List<String>> resolution;

    @Nullable
    private Map<String, ? extends List<String>> tcpPing;

    @Nullable
    private Map<String, ? extends List<String>> traceRoute;

    @NotNull
    private String iden = "";

    @NotNull
    private String startTime = "";

    @NotNull
    private String endTime = "";

    @NotNull
    private String userId = "";

    @NotNull
    private String device = "";

    @NotNull
    private String version = "";

    @NotNull
    private String country = "";

    @NotNull
    private String network = "";

    @NotNull
    private String upload = "";

    @NotNull
    private String download = "";
    private final long doneAtTime = System.currentTimeMillis();

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

    public final long getDoneAtTime() {
        return this.doneAtTime;
    }

    @NotNull
    public final String getDownload() {
        return this.download;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Map<String, List<String>> getIcmpPing() {
        return this.icmpPing;
    }

    @NotNull
    public final String getIden() {
        return this.iden;
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
    public final String getUpload() {
        return this.upload;
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

    public final void setDownload(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.download = str;
    }

    public final void setEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endTime = str;
    }

    public final void setIcmpPing(@Nullable Map<String, ? extends List<String>> map) {
        this.icmpPing = map;
    }

    public final void setIden(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iden = str;
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

    public final void setUpload(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.upload = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NetModel(iden='");
        sb.append(this.iden);
        sb.append("', startTime='");
        sb.append(this.startTime);
        sb.append("', endTime='");
        sb.append(this.endTime);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', device='");
        sb.append(this.device);
        sb.append("', version='");
        sb.append(this.version);
        sb.append("', country='");
        sb.append(this.country);
        sb.append("', network='");
        sb.append(this.network);
        sb.append("', operator=");
        sb.append(this.operator);
        sb.append(", publicIp=");
        sb.append(this.publicIp);
        sb.append(", dns=");
        sb.append(this.dns);
        sb.append(", upload='");
        sb.append(this.upload);
        sb.append("', download='");
        sb.append(this.download);
        sb.append("', resolution=");
        sb.append(this.resolution);
        sb.append(",  icmpPing=");
        sb.append(this.icmpPing);
        sb.append(", tcpPing=");
        sb.append(this.tcpPing);
        sb.append(", traceRoute=");
        sb.append(this.traceRoute);
        sb.append(", doneAtTime=");
        return o000oOoO.OooO00o(sb, this.doneAtTime, ')');
    }
}
