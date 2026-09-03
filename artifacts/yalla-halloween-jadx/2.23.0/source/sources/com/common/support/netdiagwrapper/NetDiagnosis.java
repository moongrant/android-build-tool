package com.common.support.netdiagwrapper;

import android.content.Context;
import com.common.support.apm.Sailfish;
import com.common.support.netdiagnosis.DNSKt;
import com.common.support.netdiagnosis.IPKt;
import com.common.support.netdiagnosis.PingKt;
import com.common.support.netdiagnosis.TcpPingKt;
import com.common.support.netdiagnosis.TraceRouteKt;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 /2\u00020\u0001:\u0003./0B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0000J$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J\u001c\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J:\u0010\u001d\u001a \u0012\u0004\u0012\u00020\u0017\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0006\u0012\u0004\u0012\u00020\u001f0\u001e0\u00122\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J.\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u00122\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J.\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u00122\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J.\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u00122\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J\u001c\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J\u0006\u0010$\u001a\u00020\u0000J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010&\u001a\u00020'H\u0002J\u0014\u0010\r\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010(\u001a\u00020\u0000J\u001c\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u0000H\u0002J\u0016\u0010*\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001e\u0010\u000f\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/common/support/netdiagwrapper/NetDiagnosis;", "", "()V", "context", "Landroid/content/Context;", "hostResolution", "", "Lcom/common/support/netdiagwrapper/Address;", "items", "", "", "job", "Lkotlinx/coroutines/Job;", "ping", "tcpPing", "traceRoute", "traceRouteMaxHops", "calculateTotalProgress", "", "cancel", "", "dns", "doDns", "", "callback", "Lcom/common/support/netdiagwrapper/NetDiagnosis$Callback;", "progress", "Lcom/common/support/netdiagwrapper/NetDiagnosis$Progress;", "doDownStreamSpeedTest", "doHostResolution", "Lkotlin/Pair;", "", "doPing", "doTcpPing", "doTraceRoute", "doUpStreamSpeedTest", "downStreamSpeed", "addresses", "isRunning", "", "publicIp", "requestPublicIp", "start", "startInner", "maxHops", "upStreamSpeed", "Callback", "Companion", "Progress", "com.common.support.netdiagnosis-wrapper"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetDiagnosis {
    public static final int DNS = 6;
    public static final int DOWN_STREAM_SPEED = 7;
    public static final int HOST_RESOLUTION = 3;
    public static final int PING = 1;
    public static final int PUBLIC_IP = 5;
    public static final int TCP_PING = 2;
    public static final int TRACE_ROUTE = 4;
    public static final int UP_STREAM_SPEED = 8;

    @Nullable
    private Context context;

    @Nullable
    private List<Address> hostResolution;

    @NotNull
    private Map<Integer, Integer> items = new LinkedHashMap();

    @Nullable
    private Job job;

    @Nullable
    private List<Address> ping;

    @Nullable
    private List<Address> tcpPing;

    @Nullable
    private List<Address> traceRoute;
    private int traceRouteMaxHops;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/common/support/netdiagwrapper/NetDiagnosis$Callback;", "", "onProgress", "", "progress", "", "item", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "onResult", ReportItem.QualityKeyResult, "Lcom/common/support/netdiagwrapper/NetDiagnosisResult;", "com.common.support.netdiagnosis-wrapper"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Callback {
        void onProgress(int progress, int item, @NotNull String message);

        void onResult(@NotNull NetDiagnosisResult result);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/common/support/netdiagwrapper/NetDiagnosis$Progress;", "", "total", "", "current", "(Lcom/common/support/netdiagwrapper/NetDiagnosis;II)V", "getCurrent", "()I", "setCurrent", "(I)V", "percentage", "com.common.support.netdiagnosis-wrapper"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class Progress {
        private int current;
        private final int total;

        public Progress(int i, int i2) {
            this.total = i;
            this.current = i2;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final int percentage() {
            return MathKt.roundToInt((this.current / this.total) * 100);
        }

        public final void setCurrent(int i) {
            this.current = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateTotalProgress(Map<Integer, Integer> items) {
        return CollectionsKt.sumOfInt(items.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> doDns(Callback callback, Progress progress) {
        Context context = this.context;
        List<String> list = context != null ? CollectionsKt.toList(DNSKt.dns(context)) : null;
        progress.setCurrent(progress.getCurrent() + 1);
        callback.onProgress(progress.percentage(), 6, "");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String doDownStreamSpeedTest(Callback callback, Progress progress) {
        Context context = this.context;
        if (context != null) {
            float fDownloadSpeed = Sailfish.INSTANCE.netDiagService(context).downloadSpeed();
            progress.setCurrent(progress.getCurrent() + 1);
            callback.onProgress(progress.percentage(), 7, "");
            String str = (fDownloadSpeed > 0.0f ? Float.valueOf(fDownloadSpeed / 1024.0f) : -1) + " KB/s";
            if (str != null) {
                return str;
            }
        }
        return "-1 KB/s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Pair<List<String>, Long>> doHostResolution(Callback callback, Progress progress) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Address> list = this.hostResolution;
        if (list != null) {
            for (Address address : list) {
                if (!isRunning()) {
                    throw new CancellationException();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                linkedHashMap.put(address.getHost(), new Pair(DNSKt.hostResolution$default(address.getHost(), null, 2, null), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                progress.setCurrent(progress.getCurrent() + 1);
                callback.onProgress(progress.percentage(), 3, address.getHost());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<String>> doPing(Callback callback, Progress progress) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Address> list = this.ping;
        if (list != null) {
            for (Address address : list) {
                if (!isRunning()) {
                    throw new CancellationException();
                }
                linkedHashMap.put(address.getHost(), StringsKt__StringsKt.split$default(PingKt.ping$default(address.getHost(), 0, 2, null), new String[]{"\n"}, false, 0, 6, (Object) null));
                progress.setCurrent(progress.getCurrent() + 1);
                callback.onProgress(progress.percentage(), 1, address.getHost());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<String>> doTcpPing(Callback callback, Progress progress) {
        List listEmptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Address> list = this.tcpPing;
        if (list != null) {
            for (Address address : list) {
                if (!isRunning()) {
                    throw new CancellationException();
                }
                String host = address.getHost();
                try {
                    listEmptyList = StringsKt__StringsKt.split$default(TcpPingKt.tcpPing(address.getHost(), address.getPort()), new String[]{"\n"}, false, 0, 6, (Object) null);
                } catch (Throwable unused) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                linkedHashMap.put(host, listEmptyList);
                progress.setCurrent(progress.getCurrent() + 1);
                callback.onProgress(progress.percentage(), 2, address.getHost() + ':' + address.getPort());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<String>> doTraceRoute(Callback callback, Progress progress) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Address> list = this.traceRoute;
        if (list != null) {
            for (Address address : list) {
                if (!isRunning()) {
                    throw new CancellationException();
                }
                linkedHashMap.put(address.getHost(), StringsKt__StringsKt.split$default(TraceRouteKt.traceRoute$default(address.getHost(), this.traceRouteMaxHops, 0, false, 12, null), new String[]{"\n"}, false, 0, 6, (Object) null));
                progress.setCurrent(progress.getCurrent() + 1);
                callback.onProgress(progress.percentage(), 4, address.getHost());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String doUpStreamSpeedTest(Callback callback, Progress progress) {
        Context context = this.context;
        if (context != null) {
            float fUploadSpeed = Sailfish.INSTANCE.netDiagService(context).uploadSpeed();
            progress.setCurrent(progress.getCurrent() + 1);
            callback.onProgress(progress.percentage(), 7, "");
            String str = (fUploadSpeed > 0.0f ? Float.valueOf(fUploadSpeed / 1024.0f) : -1) + " KB/s";
            if (str != null) {
                return str;
            }
        }
        return "-1 KB/s";
    }

    private final boolean isRunning() {
        Job job = this.job;
        return job != null && job.isActive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String requestPublicIp(Callback callback, Progress progress) {
        Context context;
        String strDevicePublicIpAddress$default = IPKt.devicePublicIpAddress$default(false, null, 3, null);
        if (StringsKt.isBlank(strDevicePublicIpAddress$default) && ((context = this.context) == null || (strDevicePublicIpAddress$default = Sailfish.INSTANCE.netDiagService(context).publicIpAddress()) == null)) {
            strDevicePublicIpAddress$default = "";
        }
        progress.setCurrent(progress.getCurrent() + 1);
        callback.onProgress(progress.percentage(), 5, "");
        return strDevicePublicIpAddress$default;
    }

    private final void startInner(Context context, Callback callback) {
        Job jobLaunch = BuildersKt.launch(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), CoroutineStart.LAZY, new NetDiagnosis$startInner$job$1(context, this, callback, null));
        jobLaunch.start();
        this.job = jobLaunch;
    }

    public static /* synthetic */ NetDiagnosis traceRoute$default(NetDiagnosis netDiagnosis, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 15;
        }
        return netDiagnosis.traceRoute(list, i);
    }

    public final void cancel() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @NotNull
    public final NetDiagnosis dns() {
        this.items.put(6, 1);
        return this;
    }

    @NotNull
    public final NetDiagnosis downStreamSpeed() {
        this.items.put(7, 1);
        return this;
    }

    @NotNull
    public final NetDiagnosis hostResolution(@NotNull List<Address> addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.items.put(3, Integer.valueOf(addresses.size()));
        this.hostResolution = addresses;
        return this;
    }

    @NotNull
    public final NetDiagnosis ping(@NotNull List<Address> addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.items.put(1, Integer.valueOf(addresses.size()));
        this.ping = addresses;
        return this;
    }

    @NotNull
    public final NetDiagnosis publicIp() {
        this.items.put(5, 1);
        return this;
    }

    public final void start(@NotNull Context context, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Job job = this.job;
        boolean z = false;
        if (job != null && job.isActive()) {
            z = true;
        }
        if (z) {
            return;
        }
        this.context = context.getApplicationContext();
        startInner(context, callback);
    }

    @NotNull
    public final NetDiagnosis tcpPing(@NotNull List<Address> addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.items.put(2, Integer.valueOf(addresses.size()));
        this.tcpPing = addresses;
        return this;
    }

    @NotNull
    public final NetDiagnosis traceRoute(@NotNull List<Address> addresses, int maxHops) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.items.put(4, Integer.valueOf(addresses.size()));
        this.traceRoute = addresses;
        this.traceRouteMaxHops = maxHops;
        return this;
    }

    @NotNull
    public final NetDiagnosis upStreamSpeed() {
        this.items.put(8, 1);
        return this;
    }
}
