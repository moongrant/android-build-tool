package com.common.support.netdiagwrapper;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.foundation.layout.OooO0O0;
import com.common.support.sailfish_commons.logmodels.NetModel;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007J\b\u00100\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u0007H\u0002J&\u00102\u001a\u0002032\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R:\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u000e\u0010!\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R.\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001c\u0010(\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010¨\u00064"}, d2 = {"Lcom/common/support/netdiagwrapper/NetDiagnosisResult;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dns", "", "", "getDns", "()Ljava/util/List;", "setDns", "(Ljava/util/List;)V", "downStreamSpeed", "getDownStreamSpeed", "()Ljava/lang/String;", "setDownStreamSpeed", "(Ljava/lang/String;)V", "hostResolution", "", "Lkotlin/Pair;", "", "getHostResolution", "()Ljava/util/Map;", "setHostResolution", "(Ljava/util/Map;)V", "operatorName", "phoneAndOs", "ping", "getPing", "setPing", "publicIp", "getPublicIp", "setPublicIp", "startTime", "tcpPing", "getTcpPing", "setTcpPing", "traceRoute", "getTraceRoute", "setTraceRoute", "upStreamSpeed", "getUpStreamSpeed", "setUpStreamSpeed", "dump", "userId", UserDataStore.COUNTRY, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "networkType", "formattedTime", "phoneModel", "toNetModel", "Lcom/common/support/sailfish_commons/logmodels/NetModel;", "com.common.support.netdiagnosis-wrapper"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetDiagnosisResult {

    @Nullable
    private List<String> dns;

    @Nullable
    private String downStreamSpeed;

    @Nullable
    private Map<String, ? extends Pair<? extends List<String>, Long>> hostResolution;

    @NotNull
    private final String operatorName;

    @NotNull
    private final String phoneAndOs;

    @Nullable
    private Map<String, ? extends List<String>> ping;

    @Nullable
    private String publicIp;

    @NotNull
    private final String startTime;

    @Nullable
    private Map<String, ? extends List<String>> tcpPing;

    @Nullable
    private Map<String, ? extends List<String>> traceRoute;

    @Nullable
    private String upStreamSpeed;

    public NetDiagnosisResult(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.startTime = formattedTime();
        this.phoneAndOs = phoneModel();
        this.operatorName = operatorName(context);
    }

    private final String formattedTime() {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"yyyy-M…e.ENGLISH).format(Date())");
        return str;
    }

    private final String operatorName(Context context) {
        Object systemService = context.getSystemService("phone");
        String networkOperatorName = null;
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            Intrinsics.checkNotNullExpressionValue(networkOperator, "networkOperator");
            networkOperatorName = StringsKt.isBlank(networkOperator) ^ true ? telephonyManager.getNetworkOperatorName() : telephonyManager.getSimOperatorName();
        }
        return networkOperatorName == null ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : networkOperatorName;
    }

    private final String phoneModel() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.BRAND);
        sb.append(' ');
        sb.append(Build.MODEL);
        sb.append(" (Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" | SDK ");
        return OooO0O0.OooO00o(sb, Build.VERSION.SDK_INT, ')');
    }

    @NotNull
    public final String dump(@NotNull String userId, @NotNull String country, @NotNull String version, @NotNull String networkType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        StringBuilder sb = new StringBuilder("Test Time: ");
        OooO0OO.OooO0O0.OooO00o(sb, this.startTime, "\nUser ID: ", userId, "\nDevice Name (System Version): ");
        OooO0OO.OooO0O0.OooO00o(sb, this.phoneAndOs, "\nApplication Version: ", version, "\n");
        boolean z = true;
        if (!StringsKt.isBlank(country)) {
            sb.append("Country: ");
            sb.append(country);
            sb.append("\n");
        }
        sb.append("Network Type: ");
        sb.append(networkType);
        sb.append("\nNetwork Operator: ");
        sb.append(this.operatorName);
        sb.append("\nPublic IP Address: ");
        sb.append(this.publicIp);
        sb.append("\n");
        List<String> list = this.dns;
        if (list != null && (list.isEmpty() ^ true)) {
            sb.append("Local DNS: ");
            List<String> list2 = this.dns;
            Intrinsics.checkNotNull(list2);
            sb.append(CollectionsKt___CollectionsKt.joinToString$default(list2, " / ", null, null, 0, null, null, 62, null));
            sb.append("\n");
        }
        Map<String, ? extends Pair<? extends List<String>, Long>> map = this.hostResolution;
        if (!(map == null || map.isEmpty())) {
            Map<String, ? extends Pair<? extends List<String>, Long>> map2 = this.hostResolution;
            Intrinsics.checkNotNull(map2);
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry<String, ? extends Pair<? extends List<String>, Long>> entry : map2.entrySet()) {
                String key = entry.getKey();
                List<String> first = entry.getValue().getFirst();
                Intrinsics.checkNotNull(first, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List<String> list3 = first;
                arrayList.add(CollectionsKt___CollectionsKt.joinToString$default(list3, ",", OooOOOO.OooO00o(key, " :: {"), "}", 0, null, null, 56, null) + '(' + entry.getValue().getSecond().longValue() + "ms)");
            }
            sb.append("Domain list resolution:\n");
            sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null));
            sb.append("\n\n");
        }
        Map<String, ? extends List<String>> map3 = this.ping;
        if (!(map3 == null || map3.isEmpty())) {
            Map<String, ? extends List<String>> map4 = this.ping;
            Intrinsics.checkNotNull(map4);
            sb.append("Domain list ping:\n");
            for (Map.Entry<String, ? extends List<String>> entry2 : map4.entrySet()) {
                sb.append("start ping: " + entry2.getKey() + "...\n");
                sb.append(CollectionsKt___CollectionsKt.joinToString$default(entry2.getValue(), "\n", null, null, 0, null, null, 62, null));
                sb.append("\n");
            }
        }
        Map<String, ? extends List<String>> map5 = this.tcpPing;
        if (!(map5 == null || map5.isEmpty())) {
            Map<String, ? extends List<String>> map6 = this.tcpPing;
            Intrinsics.checkNotNull(map6);
            sb.append("Domain list tcp ping:\n");
            for (Map.Entry<String, ? extends List<String>> entry3 : map6.entrySet()) {
                sb.append("start tcp ping: " + entry3.getKey() + "...\n");
                sb.append(CollectionsKt___CollectionsKt.joinToString$default(entry3.getValue(), "\n", null, null, 0, null, null, 62, null));
                sb.append("\n");
            }
        }
        Map<String, ? extends List<String>> map7 = this.traceRoute;
        if (map7 != null && !map7.isEmpty()) {
            z = false;
        }
        if (!z) {
            Map<String, ? extends List<String>> map8 = this.traceRoute;
            Intrinsics.checkNotNull(map8);
            sb.append("Domain list trace route:\n");
            for (Map.Entry<String, ? extends List<String>> entry4 : map8.entrySet()) {
                sb.append("start trace route: " + entry4.getKey() + "...\n");
                sb.append(CollectionsKt___CollectionsKt.joinToString$default(entry4.getValue(), "\n", null, null, 0, null, null, 62, null));
                sb.append("\n");
            }
        }
        sb.append("Start testing download speed...\n");
        sb.append(this.downStreamSpeed);
        sb.append("\nStart testing upload speed...\n");
        sb.append(this.upStreamSpeed);
        sb.append("\nEnd all test!");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @Nullable
    public final List<String> getDns() {
        return this.dns;
    }

    @Nullable
    public final String getDownStreamSpeed() {
        return this.downStreamSpeed;
    }

    @Nullable
    public final Map<String, Pair<List<String>, Long>> getHostResolution() {
        return this.hostResolution;
    }

    @Nullable
    public final Map<String, List<String>> getPing() {
        return this.ping;
    }

    @Nullable
    public final String getPublicIp() {
        return this.publicIp;
    }

    @Nullable
    public final Map<String, List<String>> getTcpPing() {
        return this.tcpPing;
    }

    @Nullable
    public final Map<String, List<String>> getTraceRoute() {
        return this.traceRoute;
    }

    @Nullable
    public final String getUpStreamSpeed() {
        return this.upStreamSpeed;
    }

    public final void setDns(@Nullable List<String> list) {
        this.dns = list;
    }

    public final void setDownStreamSpeed(@Nullable String str) {
        this.downStreamSpeed = str;
    }

    public final void setHostResolution(@Nullable Map<String, ? extends Pair<? extends List<String>, Long>> map) {
        this.hostResolution = map;
    }

    public final void setPing(@Nullable Map<String, ? extends List<String>> map) {
        this.ping = map;
    }

    public final void setPublicIp(@Nullable String str) {
        this.publicIp = str;
    }

    public final void setTcpPing(@Nullable Map<String, ? extends List<String>> map) {
        this.tcpPing = map;
    }

    public final void setTraceRoute(@Nullable Map<String, ? extends List<String>> map) {
        this.traceRoute = map;
    }

    public final void setUpStreamSpeed(@Nullable String str) {
        this.upStreamSpeed = str;
    }

    @NotNull
    public final NetModel toNetModel(@NotNull String userId, @NotNull String country, @NotNull String version, @NotNull String networkType) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        NetModel netModel = new NetModel();
        netModel.setIden(userId);
        netModel.setUserId(userId);
        netModel.setCountry(country);
        netModel.setVersion(version);
        netModel.setNetwork(networkType);
        netModel.setStartTime(this.startTime);
        netModel.setEndTime(formattedTime());
        netModel.setDevice(this.phoneAndOs);
        netModel.setOperator(CollectionsKt.listOf(this.operatorName));
        netModel.setDns(this.dns);
        Map<String, ? extends Pair<? extends List<String>, Long>> map = this.hostResolution;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), (List) ((Pair) entry.getValue()).getFirst());
            }
        } else {
            linkedHashMap = null;
        }
        netModel.setResolution(linkedHashMap);
        String str = this.publicIp;
        String str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        if (str == null) {
            str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        netModel.setPublicIp(CollectionsKt.listOf(str));
        netModel.setTcpPing(this.tcpPing);
        netModel.setTraceRoute(this.traceRoute);
        String str3 = this.downStreamSpeed;
        if (str3 == null) {
            str3 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        netModel.setDownload(str3);
        String str4 = this.upStreamSpeed;
        if (str4 != null) {
            str2 = str4;
        }
        netModel.setUpload(str2);
        return netModel;
    }
}
