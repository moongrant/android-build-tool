package p317o0O0oOo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.compose.compiler.plugins.kotlin.inference.OooO00o;
import com.android.billingclient.api.o0000Ooo;
import com.facebook.OooOO0O;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.o0OO0;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p233o00oOoOO.o0O000Oo;
import p233o00oOoOO.o0O00O0o;
import p233o00oOoOO.o0OoO00O;
import p233o00oOoOO.o0OoOoOo;
import p238o00oOooo.o0OO0O0;
import p302o0O0o0O.OooO0o;
import p303o0O0o0OO.o0000O0O;
import p310o0O0oO0.o000OOo0;
import p310o0O0oO0.o00O0OOO;
import p314o0O0oOO0.Oooo0;
import p314o0O0oOO0.o000oOoO;
import p314o0O0oOO0.o00O0O;
import p314o0O0oOO0.o00Oo0;
import p314o0O0oOO0.o0OoOo0;
import p628o0ooO.o0Oo0oo;
import p677oo0oOOo.OooOO0;
import p679oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final p312o0O0oO0o.oo0o0Oo f41907OooOo0 = p312o0O0oO0o.oo0o0Oo.OooO0Oo();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final o0OO00O f41908OooOo0O = new o0OO00O();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0000O0O f41909OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentHashMap f41910OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0Oo0oo f41913OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public FirebasePerformance f41914OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o<o0O00O0o> f41915OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00Ooo f41916OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000OOo0 f41918OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Context f41919OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public o00oO0o f41920OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public oo0o0Oo f41921OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f41922OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ApplicationInfo.OooO0O0 f41923OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String f41924OooOOoo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConcurrentLinkedQueue<oo000o> f41912OooO0o0 = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f41911OooO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f41925OooOo00 = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ThreadPoolExecutor f41917OooOO0o = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    public o0OO00O() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f41910OooO0Oo = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String OooO00o(OooOO0 oooOO1) {
        if (oooOO1.hasTraceMetric()) {
            TraceMetric traceMetric = oooOO1.getTraceMetric();
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", traceMetric.getName(), new DecimalFormat("#.####").format(traceMetric.getDurationUs() / 1000.0d));
        }
        if (oooOO1.hasNetworkRequestMetric()) {
            NetworkRequestMetric networkRequestMetric = oooOO1.getNetworkRequestMetric();
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN", new DecimalFormat("#.####").format((networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L) / 1000.0d));
        }
        if (!oooOO1.hasGaugeMetric()) {
            return "log";
        }
        GaugeMetric gaugeMetric = oooOO1.getGaugeMetric();
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    public final void OooO0O0(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f41921OooOOOo.OooO0O0(Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f41921OooOOOo.OooO0O0(Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    public final void OooO0OO(final TraceMetric traceMetric, final ApplicationProcessState applicationProcessState) {
        final int i = 1;
        this.f41917OooOO0o.execute(new Runnable() { // from class: androidx.media3.session.o00
            @Override // java.lang.Runnable
            public final void run() {
                SessionCommand next;
                int i2 = i;
                Object obj = applicationProcessState;
                Object obj2 = traceMetric;
                Object obj3 = this;
                switch (i2) {
                    case 0:
                        Oooo0 oooo0 = (Oooo0) obj2;
                        String str = (String) obj;
                        ((o0O0ooO) obj3).getClass();
                        oooo0.Ooooo00();
                        if (oooo0.OooO0OO()) {
                            oooo0.getClass();
                            throw null;
                        }
                        o0OO0<SessionCommand> it = oo00o.f9516OooO0o0.f9518OooO0Oo.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (next.f9272OooO0Oo != 0 || !next.f9274OooO0o0.equals(str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next != null) {
                            oooo0.Ooooo00();
                            boolean zOooO0OO = oooo0.OooO0OO();
                            oooo0.getClass();
                            if (zOooO0OO) {
                                throw null;
                            }
                            oo00o oo00oVar = oo00o.f9516OooO0o0;
                            oo00oVar.getClass();
                            if (oo00oVar.f9518OooO0Oo.contains(next)) {
                                Bundle bundle = Bundle.EMPTY;
                                oooo0.Ooooo00();
                                p080o000OoO.o00O0O.OooO0O0(next.f9272OooO0Oo == 0, "command must be a custom command");
                                if (oooo0.OooO0OO()) {
                                    throw null;
                                }
                                com.google.common.util.concurrent.OooOO0 oooOO1 = new com.google.common.util.concurrent.OooOO0(new SessionResult(-100));
                                oooOO1.OooO0oo(new com.google.common.util.concurrent.OooO0o.OooO00o(oooOO1, new o00O0000(str)), com.google.common.util.concurrent.OooO0O0.INSTANCE);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p317o0O0oOo0.o0OO00O o0oo00o2 = (p317o0O0oOo0.o0OO00O) obj3;
                        p312o0O0oO0o.oo0o0Oo oo0o0oo = p317o0O0oOo0.o0OO00O.f41907OooOo0;
                        o0oo00o2.getClass();
                        PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                        oooO0O0NewBuilder.OooO0o((TraceMetric) obj2);
                        o0oo00o2.OooO0Oo(oooO0O0NewBuilder, (ApplicationProcessState) obj);
                        return;
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0283  */
    /* JADX WARN: Code duplicated, block: B:104:0x029e  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:126:0x0308  */
    /* JADX WARN: Code duplicated, block: B:128:0x030b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0320  */
    /* JADX WARN: Code duplicated, block: B:139:0x033a  */
    /* JADX WARN: Code duplicated, block: B:142:0x033f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0353  */
    /* JADX WARN: Code duplicated, block: B:157:0x039c  */
    /* JADX WARN: Code duplicated, block: B:158:0x039e  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:167:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:173:0x03db  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:176:0x0410  */
    /* JADX WARN: Code duplicated, block: B:178:0x0430  */
    /* JADX WARN: Code duplicated, block: B:181:0x0445  */
    /* JADX WARN: Code duplicated, block: B:183:0x044f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0464  */
    /* JADX WARN: Code duplicated, block: B:188:0x046e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0471  */
    /* JADX WARN: Code duplicated, block: B:191:0x0477  */
    /* JADX WARN: Code duplicated, block: B:194:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0226  */
    /* JADX WARN: Code duplicated, block: B:91:0x0232 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:89:0x022e, B:91:0x0232, B:92:0x0239), top: B:194:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0279  */
    @WorkerThread
    public final void OooO0Oo(PerfMetric.OooO0O0 oooO0O0, ApplicationProcessState applicationProcessState) {
        boolean z;
        o00oO0o o00oo0o2;
        boolean z2;
        boolean z3;
        o00oO0o o00oo0o3;
        boolean z4;
        boolean zOooO0O0;
        boolean z5;
        o000OOo0 o000ooo1;
        o00O0OOO o00o0ooo2;
        OooO<Double> oooO;
        OooO<Double> oooOOooO0O0;
        double dDoubleValue;
        boolean z6;
        boolean zHasTraceMetric;
        p312o0O0oO0o.oo0o0Oo oo0o0oo;
        o00Ooo o00ooo2;
        o0OoO00O<PerfMetric> o0ooo00o2;
        p312o0O0oO0o.oo0o0Oo oo0o0oo2;
        o0OoO00O<PerfMetric> o0ooo00o3;
        o0O00O0o o0o00o0o;
        String name;
        String str;
        String str2;
        boolean z7;
        if (!this.f41911OooO0o.get()) {
            ConcurrentHashMap concurrentHashMap = this.f41910OooO0Oo;
            int iIntValue = ((Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING")).intValue();
            int iIntValue2 = ((Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING")).intValue();
            int iIntValue3 = ((Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING")).intValue();
            if (oooO0O0.hasTraceMetric() && iIntValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            } else {
                if (!oooO0O0.hasNetworkRequestMetric() || iIntValue2 <= 0) {
                    if (!oooO0O0.hasGaugeMetric() || iIntValue3 <= 0) {
                        f41907OooOo0.OooO0O0("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", OooO00o(oooO0O0), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3));
                        z7 = false;
                    } else {
                        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
                    }
                    if (z7) {
                        f41907OooOo0.OooO0O0("Transport is not initialized yet, %s will be queued for to be dispatched later", OooO00o(oooO0O0));
                        this.f41912OooO0o0.add(new oo000o(oooO0O0, applicationProcessState));
                        return;
                    }
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            }
            z7 = true;
            if (z7) {
                f41907OooOo0.OooO0O0("Transport is not initialized yet, %s will be queued for to be dispatched later", OooO00o(oooO0O0));
                this.f41912OooO0o0.add(new oo000o(oooO0O0, applicationProcessState));
                return;
            }
            return;
        }
        p312o0O0oO0o.oo0o0Oo oo0o0oo3 = f41907OooOo0;
        if (this.f41918OooOOO.OooOo0() && (!this.f41923OooOOo0.OooO0O0() || this.f41925OooOo00)) {
            try {
                str2 = (String) Tasks.await(this.f41909OooO.getId(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                oo0o0oo3.OooO0OO("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str2 = null;
            } catch (ExecutionException e2) {
                oo0o0oo3.OooO0OO("Unable to retrieve Installation Id: %s", e2.getMessage());
                str2 = null;
            } catch (TimeoutException e3) {
                oo0o0oo3.OooO0OO("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                oo0o0oo3.OooO0o("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            } else {
                this.f41923OooOOo0.OooO0o(str2);
            }
        }
        ApplicationInfo.OooO0O0 oooO0O0Mo4023clone = this.f41923OooOOo0;
        oooO0O0Mo4023clone.OooO0oO(applicationProcessState);
        if (oooO0O0.hasTraceMetric() || oooO0O0.hasNetworkRequestMetric()) {
            oooO0O0Mo4023clone = oooO0O0Mo4023clone.mo4023clone();
            if (this.f41914OooO0oo == null && this.f41911OooO0o.get()) {
                p312o0O0oO0o.oo0o0Oo oo0o0oo4 = FirebasePerformance.f19938OooO0o0;
                this.f41914OooO0oo = (FirebasePerformance) o0Oo0oo.OooO0OO().OooO0O0(FirebasePerformance.class);
            }
            FirebasePerformance firebasePerformance = this.f41914OooO0oo;
            oooO0O0Mo4023clone.OooO0Oo(firebasePerformance != null ? new HashMap(firebasePerformance.f19939OooO00o) : Collections.emptyMap());
        }
        oooO0O0.OooO0O0(oooO0O0Mo4023clone);
        PerfMetric perfMetricBuild = oooO0O0.build();
        if (!this.f41918OooOOO.OooOo0()) {
            f41907OooOo0.OooO0o0("Performance collection is not enabled, dropping %s", OooO00o(perfMetricBuild));
        } else if (perfMetricBuild.getApplicationInfo().hasAppInstanceId()) {
            Context context = this.f41919OooOOO0;
            ArrayList arrayList = new ArrayList();
            if (perfMetricBuild.hasTraceMetric()) {
                arrayList.add(new o00O0O(perfMetricBuild.getTraceMetric()));
            }
            if (perfMetricBuild.hasNetworkRequestMetric()) {
                arrayList.add(new o0OoOo0(perfMetricBuild.getNetworkRequestMetric(), context));
            }
            if (perfMetricBuild.hasApplicationInfo()) {
                arrayList.add(new Oooo0(perfMetricBuild.getApplicationInfo()));
            }
            if (perfMetricBuild.hasGaugeMetric()) {
                arrayList.add(new o000oOoO(perfMetricBuild.getGaugeMetric()));
            }
            if (arrayList.isEmpty()) {
                p312o0O0oO0o.oo0o0Oo.OooO0Oo().OooO00o("No validators found for PerfMetric.");
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!((o00Oo0) it.next()).OooO00o()) {
                    }
                }
                if (z) {
                    o00oo0o2 = this.f41920OooOOOO;
                    o00oo0o2.getClass();
                    if (perfMetricBuild.hasTraceMetric()) {
                        o000ooo1 = o00oo0o2.f41890OooO00o;
                        o000ooo1.getClass();
                        synchronized (o00O0OOO.class) {
                            if (o00O0OOO.f41800OooO00o == null) {
                                o00O0OOO.f41800OooO00o = new o00O0OOO();
                            }
                            o00o0ooo2 = o00O0OOO.f41800OooO00o;
                        }
                        RemoteConfigManager remoteConfigManager = o000ooo1.f41779OooO00o;
                        o00o0ooo2.getClass();
                        oooO = remoteConfigManager.getDouble("fpr_vc_trace_sampling_rate");
                        if (oooO.OooO0O0() || !o000OOo0.OooOo0O(oooO.OooO00o().doubleValue())) {
                            oooOOooO0O0 = o000ooo1.OooO0O0(o00o0ooo2);
                            if (!oooOOooO0O0.OooO0O0() && o000OOo0.OooOo0O(oooOOooO0O0.OooO00o().doubleValue())) {
                                dDoubleValue = oooOOooO0O0.OooO00o().doubleValue();
                            } else if (o000ooo1.f41779OooO00o.isLastFetchFailed()) {
                                dDoubleValue = Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue();
                            } else {
                                dDoubleValue = Double.valueOf(1.0d).doubleValue();
                            }
                        } else {
                            o000ooo1.f41781OooO0OO.OooO0Oo("com.google.firebase.perf.TraceSamplingRate", oooO.OooO00o().doubleValue());
                            dDoubleValue = oooO.OooO00o().doubleValue();
                        }
                        if (o00oo0o2.f41891OooO0O0 < dDoubleValue) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6 || o00oO0o.OooO00o(perfMetricBuild.getTraceMetric().getPerfSessionsList())) {
                            if (!perfMetricBuild.hasTraceMetric() && perfMetricBuild.getTraceMetric().getName().startsWith("_st_") && perfMetricBuild.getTraceMetric().containsCustomAttributes("Hosting_activity")) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((!z2 && !o00oo0o2.OooO0O0() && !o00oO0o.OooO00o(perfMetricBuild.getTraceMetric().getPerfSessionsList())) || (perfMetricBuild.hasNetworkRequestMetric() && !o00oo0o2.OooO0OO() && !o00oO0o.OooO00o(perfMetricBuild.getNetworkRequestMetric().getPerfSessionsList()))) {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        if (!perfMetricBuild.hasTraceMetric()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        z3 = !z2 ? true : true;
                    }
                    if (!z3) {
                        o00oo0o3 = this.f41920OooOOOO;
                        o00oo0o3.getClass();
                        if ((perfMetricBuild.hasTraceMetric() || (!(perfMetricBuild.getTraceMetric().getName().equals(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetricBuild.getTraceMetric().getName().equals(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetricBuild.getTraceMetric().getCountersCount() <= 0)) && !perfMetricBuild.hasGaugeMetric()) {
                            if (perfMetricBuild.hasNetworkRequestMetric()) {
                                zOooO0O0 = o00oo0o3.f41894OooO0o0.OooO0O0();
                            } else if (perfMetricBuild.hasTraceMetric()) {
                                zOooO0O0 = o00oo0o3.f41893OooO0Oo.OooO0O0();
                            } else {
                                z4 = true;
                            }
                            z4 = !zOooO0O0;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            OooO0O0(perfMetricBuild);
                            f41907OooOo0.OooO0o0("Rate limited (per device) - %s", OooO00o(perfMetricBuild));
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            zHasTraceMetric = perfMetricBuild.hasTraceMetric();
                            oo0o0oo = f41907OooOo0;
                            if (zHasTraceMetric) {
                                Object[] objArr = new Object[2];
                                objArr[0] = OooO00o(perfMetricBuild);
                                name = perfMetricBuild.getTraceMetric().getName();
                                if (name.startsWith("_st_")) {
                                    str = String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(this.f41924OooOOoo, this.f41922OooOOo), name, "perf-android-sdk", "android-ide");
                                } else {
                                    str = String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(this.f41924OooOOoo, this.f41922OooOOo), name, "perf-android-sdk", "android-ide");
                                }
                                objArr[1] = str;
                                oo0o0oo.OooO0o0("Logging %s. In a minute, visit the Firebase console to view your data: %s", objArr);
                            } else {
                                oo0o0oo.OooO0o0("Logging %s", OooO00o(perfMetricBuild));
                            }
                            o00ooo2 = this.f41916OooOO0O;
                            o0ooo00o2 = o00ooo2.f41889OooO0OO;
                            oo0o0oo2 = o00Ooo.f41886OooO0Oo;
                            if (o0ooo00o2 == null) {
                                o0o00o0o = o00ooo2.f41888OooO0O0.get();
                                if (o0o00o0o != null) {
                                    o00ooo2.f41889OooO0OO = o0o00o0o.OooO00o(o00ooo2.f41887OooO00o, new o0O000Oo("proto"), new OooO00o());
                                } else {
                                    oo0o0oo2.OooO0o("Flg TransportFactory is not available at the moment");
                                }
                            }
                            o0ooo00o3 = o00ooo2.f41889OooO0OO;
                            if (o0ooo00o3 != null) {
                                ((o0OO0O0) o0ooo00o3).OooO00o(new o0OoOoOo(perfMetricBuild, Priority.DEFAULT), new OooOO0O());
                            } else {
                                oo0o0oo2.OooO0o("Unable to dispatch event because Flg Transport is not available");
                            }
                            SessionManager.getInstance().updatePerfSessionIfExpired();
                        }
                    }
                    OooO0O0(perfMetricBuild);
                    f41907OooOo0.OooO0o0("Event dropped due to device sampling - %s", OooO00o(perfMetricBuild));
                } else {
                    f41907OooOo0.OooO0oO("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", OooO00o(perfMetricBuild));
                }
            }
            z = false;
            if (z) {
                f41907OooOo0.OooO0oO("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", OooO00o(perfMetricBuild));
            } else {
                o00oo0o2 = this.f41920OooOOOO;
                o00oo0o2.getClass();
                if (perfMetricBuild.hasTraceMetric()) {
                    o000ooo1 = o00oo0o2.f41890OooO00o;
                    o000ooo1.getClass();
                    synchronized (o00O0OOO.class) {
                        if (o00O0OOO.f41800OooO00o == null) {
                            o00O0OOO.f41800OooO00o = new o00O0OOO();
                        }
                        o00o0ooo2 = o00O0OOO.f41800OooO00o;
                        RemoteConfigManager remoteConfigManager2 = o000ooo1.f41779OooO00o;
                        o00o0ooo2.getClass();
                        oooO = remoteConfigManager2.getDouble("fpr_vc_trace_sampling_rate");
                        if (oooO.OooO0O0()) {
                            oooOOooO0O0 = o000ooo1.OooO0O0(o00o0ooo2);
                            if (!oooOOooO0O0.OooO0O0()) {
                                if (o000ooo1.f41779OooO00o.isLastFetchFailed()) {
                                    dDoubleValue = Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue();
                                } else {
                                    dDoubleValue = Double.valueOf(1.0d).doubleValue();
                                }
                            } else if (o000ooo1.f41779OooO00o.isLastFetchFailed()) {
                                dDoubleValue = Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue();
                            } else {
                                dDoubleValue = Double.valueOf(1.0d).doubleValue();
                            }
                        } else {
                            oooOOooO0O0 = o000ooo1.OooO0O0(o00o0ooo2);
                            if (!oooOOooO0O0.OooO0O0()) {
                                if (o000ooo1.f41779OooO00o.isLastFetchFailed()) {
                                    dDoubleValue = Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue();
                                } else {
                                    dDoubleValue = Double.valueOf(1.0d).doubleValue();
                                }
                            } else if (o000ooo1.f41779OooO00o.isLastFetchFailed()) {
                                dDoubleValue = Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue();
                            } else {
                                dDoubleValue = Double.valueOf(1.0d).doubleValue();
                            }
                        }
                        if (o00oo0o2.f41891OooO0O0 < dDoubleValue) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (!perfMetricBuild.hasTraceMetric()) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                            }
                        } else {
                            if (!perfMetricBuild.hasTraceMetric()) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                            }
                        }
                    }
                } else {
                    if (!perfMetricBuild.hasTraceMetric()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                    }
                }
                if (!z3) {
                    o00oo0o3 = this.f41920OooOOOO;
                    o00oo0o3.getClass();
                    if ((perfMetricBuild.hasTraceMetric() || (!(perfMetricBuild.getTraceMetric().getName().equals(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetricBuild.getTraceMetric().getName().equals(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetricBuild.getTraceMetric().getCountersCount() <= 0)) && !perfMetricBuild.hasGaugeMetric()) {
                        z4 = false;
                    } else {
                        if (perfMetricBuild.hasNetworkRequestMetric()) {
                            zOooO0O0 = o00oo0o3.f41894OooO0o0.OooO0O0();
                        } else if (perfMetricBuild.hasTraceMetric()) {
                            zOooO0O0 = o00oo0o3.f41893OooO0Oo.OooO0O0();
                        } else {
                            z4 = true;
                        }
                        z4 = !zOooO0O0;
                    }
                    if (z4) {
                        OooO0O0(perfMetricBuild);
                        f41907OooOo0.OooO0o0("Rate limited (per device) - %s", OooO00o(perfMetricBuild));
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        zHasTraceMetric = perfMetricBuild.hasTraceMetric();
                        oo0o0oo = f41907OooOo0;
                        if (zHasTraceMetric) {
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = OooO00o(perfMetricBuild);
                            name = perfMetricBuild.getTraceMetric().getName();
                            if (name.startsWith("_st_")) {
                                str = String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(this.f41924OooOOoo, this.f41922OooOOo), name, "perf-android-sdk", "android-ide");
                            } else {
                                str = String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(this.f41924OooOOoo, this.f41922OooOOo), name, "perf-android-sdk", "android-ide");
                            }
                            objArr2[1] = str;
                            oo0o0oo.OooO0o0("Logging %s. In a minute, visit the Firebase console to view your data: %s", objArr2);
                        } else {
                            oo0o0oo.OooO0o0("Logging %s", OooO00o(perfMetricBuild));
                        }
                        o00ooo2 = this.f41916OooOO0O;
                        o0ooo00o2 = o00ooo2.f41889OooO0OO;
                        oo0o0oo2 = o00Ooo.f41886OooO0Oo;
                        if (o0ooo00o2 == null) {
                            o0o00o0o = o00ooo2.f41888OooO0O0.get();
                            if (o0o00o0o != null) {
                                o00ooo2.f41889OooO0OO = o0o00o0o.OooO00o(o00ooo2.f41887OooO00o, new o0O000Oo("proto"), new OooO00o());
                            } else {
                                oo0o0oo2.OooO0o("Flg TransportFactory is not available at the moment");
                            }
                        }
                        o0ooo00o3 = o00ooo2.f41889OooO0OO;
                        if (o0ooo00o3 != null) {
                            oo0o0oo2.OooO0o("Unable to dispatch event because Flg Transport is not available");
                        } else {
                            ((o0OO0O0) o0ooo00o3).OooO00o(new o0OoOoOo(perfMetricBuild, Priority.DEFAULT), new OooOO0O());
                        }
                        SessionManager.getInstance().updatePerfSessionIfExpired();
                    }
                }
                OooO0O0(perfMetricBuild);
                f41907OooOo0.OooO0o0("Event dropped due to device sampling - %s", OooO00o(perfMetricBuild));
            }
        } else {
            f41907OooOo0.OooO0oO("App Instance ID is null or empty, dropping %s", OooO00o(perfMetricBuild));
        }
        z5 = false;
        if (z5) {
            zHasTraceMetric = perfMetricBuild.hasTraceMetric();
            oo0o0oo = f41907OooOo0;
            if (zHasTraceMetric) {
                Object[] objArr3 = new Object[2];
                objArr3[0] = OooO00o(perfMetricBuild);
                name = perfMetricBuild.getTraceMetric().getName();
                if (name.startsWith("_st_")) {
                    str = String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(this.f41924OooOOoo, this.f41922OooOOo), name, "perf-android-sdk", "android-ide");
                } else {
                    str = String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(this.f41924OooOOoo, this.f41922OooOOo), name, "perf-android-sdk", "android-ide");
                }
                objArr3[1] = str;
                oo0o0oo.OooO0o0("Logging %s. In a minute, visit the Firebase console to view your data: %s", objArr3);
            } else {
                oo0o0oo.OooO0o0("Logging %s", OooO00o(perfMetricBuild));
            }
            o00ooo2 = this.f41916OooOO0O;
            o0ooo00o2 = o00ooo2.f41889OooO0OO;
            oo0o0oo2 = o00Ooo.f41886OooO0Oo;
            if (o0ooo00o2 == null) {
                o0o00o0o = o00ooo2.f41888OooO0O0.get();
                if (o0o00o0o != null) {
                    o00ooo2.f41889OooO0OO = o0o00o0o.OooO00o(o00ooo2.f41887OooO00o, new o0O000Oo("proto"), new OooO00o());
                } else {
                    oo0o0oo2.OooO0o("Flg TransportFactory is not available at the moment");
                }
            }
            o0ooo00o3 = o00ooo2.f41889OooO0OO;
            if (o0ooo00o3 != null) {
                oo0o0oo2.OooO0o("Unable to dispatch event because Flg Transport is not available");
            } else {
                ((o0OO0O0) o0ooo00o3).OooO00o(new o0OoOoOo(perfMetricBuild, Priority.DEFAULT), new OooOO0O());
            }
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    @Override // oooOO0.oo0o0Oo.OooO0O0
    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        int i = 0;
        this.f41925OooOo00 = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (this.f41911OooO0o.get()) {
            this.f41917OooOO0o.execute(new o0Oo0oo(this, i));
        }
    }
}
