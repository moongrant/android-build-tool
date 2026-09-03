package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.o000oOoO;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.OooOO0;
import com.google.firebase.perf.util.OooOo00;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o0O0oo00.OooOOO;
import p037OoooOo0.o00O00O;
import p307o0O0oO0.OooOOO0;
import p310o0O0oOO.o00Ooo;
import p310o0O0oOO.o00oO0o;
import p310o0O0oOO.o0OoOo0;
import p310o0O0oOO.o0ooOOo;
import p310o0O0oOO.oo000o;
import p319o0O0oo0O.o0000;
import p319o0O0oo0O.o0000O0;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final o0Oo0oo configResolver;
    private final o000oOoO<o0OoOo0> cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final o000oOoO<ScheduledExecutorService> gaugeManagerExecutor;

    @Nullable
    private o0ooOOo gaugeMetadataManager;
    private final o000oOoO<p310o0O0oOO.o0Oo0oo> memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final OooOOO transportManager;
    private static final OooOOO0 logger = OooOOO0.OooO0Oo();
    private static final GaugeManager instance = new GaugeManager();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20456OooO00o;

        static {
            int[] iArr = new int[ApplicationProcessState.values().length];
            f20456OooO00o = iArr;
            try {
                iArr[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20456OooO00o[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new o000oOoO(new o00Ooo()), OooOOO.f42635OooOo0O, o0Oo0oo.OooO0o0(), null, new o000oOoO(new oo000o()), new o000oOoO(new o00oO0o()));
    }

    private static void collectGaugeMetricOnce(final o0OoOo0 o0oooo0, p310o0O0oOO.o0Oo0oo o0oo0oo2, final Timer timer) {
        synchronized (o0oooo0) {
            try {
                o0oooo0.f42520OooO0O0.schedule(new Runnable() { // from class: o0O0oOO.o000oOoO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0OoOo0 o0oooo1 = o0oooo0;
                        CpuMetricReading cpuMetricReadingOooO0O0 = o0oooo1.OooO0O0(timer);
                        if (cpuMetricReadingOooO0O0 != null) {
                            o0oooo1.f42519OooO00o.add(cpuMetricReadingOooO0O0);
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                o0OoOo0.f42517OooO0oO.OooO0o("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        o0oo0oo2.OooO00o(timer);
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        o0000 o0000Var;
        long jLongValue;
        int i = OooO00o.f20456OooO00o[applicationProcessState.ordinal()];
        if (i != 1) {
            jLongValue = i != 2 ? -1L : this.configResolver.OooOOO();
        } else {
            o0Oo0oo o0oo0oo2 = this.configResolver;
            o0oo0oo2.getClass();
            synchronized (o0000.class) {
                if (o0000.f42656OooO00o == null) {
                    o0000.f42656OooO00o = new o0000();
                }
                o0000Var = o0000.f42656OooO00o;
            }
            OooOO0<Long> oooOO0OooOO0O = o0oo0oo2.OooOO0O(o0000Var);
            if (oooOO0OooOO0O.OooO0O0() && o0Oo0oo.OooOo00(oooOO0OooOO0O.OooO00o().longValue())) {
                jLongValue = oooOO0OooOO0O.OooO00o().longValue();
            } else {
                OooOO0<Long> oooOO0OooOOO0 = o0oo0oo2.OooOOO0(o0000Var);
                if (oooOO0OooOOO0.OooO0O0() && o0Oo0oo.OooOo00(oooOO0OooOOO0.OooO00o().longValue())) {
                    o0oo0oo2.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = oooOO0OooOOO0.OooO00o().longValue();
                } else {
                    OooOO0<Long> oooOO0OooO0OO = o0oo0oo2.OooO0OO(o0000Var);
                    if (oooOO0OooO0OO.OooO0O0() && o0Oo0oo.OooOo00(oooOO0OooO0OO.OooO00o().longValue())) {
                        jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                    } else {
                        Long l = 0L;
                        jLongValue = l.longValue();
                    }
                }
            }
        }
        OooOOO0 oooOOO0 = o0OoOo0.f42517OooO0oO;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    private GaugeMetadata getGaugeMetadata() {
        GaugeMetadata.OooO0O0 oooO0O0NewBuilder = GaugeMetadata.newBuilder();
        o0ooOOo o0ooooo = this.gaugeMetadataManager;
        StorageUnit storageUnit = StorageUnit.BYTES;
        oooO0O0NewBuilder.OooO0O0(OooOo00.OooO0O0(storageUnit.OooO00o(o0ooooo.f42527OooO0OO.totalMem)));
        oooO0O0NewBuilder.OooO0Oo(OooOo00.OooO0O0(storageUnit.OooO00o(this.gaugeMetadataManager.f42525OooO00o.maxMemory())));
        oooO0O0NewBuilder.OooO0o0(OooOo00.OooO0O0(StorageUnit.MEGABYTES.OooO00o(this.gaugeMetadataManager.f42526OooO0O0.getMemoryClass())));
        return oooO0O0NewBuilder.build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        o0000O0 o0000o1;
        long jLongValue;
        int i = OooO00o.f20456OooO00o[applicationProcessState.ordinal()];
        if (i != 1) {
            jLongValue = i != 2 ? -1L : this.configResolver.OooOOOO();
        } else {
            o0Oo0oo o0oo0oo2 = this.configResolver;
            o0oo0oo2.getClass();
            synchronized (o0000O0.class) {
                if (o0000O0.f42665OooO00o == null) {
                    o0000O0.f42665OooO00o = new o0000O0();
                }
                o0000o1 = o0000O0.f42665OooO00o;
            }
            OooOO0<Long> oooOO0OooOO0O = o0oo0oo2.OooOO0O(o0000o1);
            if (oooOO0OooOO0O.OooO0O0() && o0Oo0oo.OooOo00(oooOO0OooOO0O.OooO00o().longValue())) {
                jLongValue = oooOO0OooOO0O.OooO00o().longValue();
            } else {
                OooOO0<Long> oooOO0OooOOO0 = o0oo0oo2.OooOOO0(o0000o1);
                if (oooOO0OooOOO0.OooO0O0() && o0Oo0oo.OooOo00(oooOO0OooOOO0.OooO00o().longValue())) {
                    o0oo0oo2.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = oooOO0OooOOO0.OooO00o().longValue();
                } else {
                    OooOO0<Long> oooOO0OooO0OO = o0oo0oo2.OooO0OO(o0000o1);
                    if (oooOO0OooO0OO.OooO0O0() && o0Oo0oo.OooOo00(oooOO0OooO0OO.OooO00o().longValue())) {
                        jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                    } else {
                        Long l = 0L;
                        jLongValue = l.longValue();
                    }
                }
            }
        }
        OooOOO0 oooOOO0 = p310o0O0oOO.o0Oo0oo.f42511OooO0o;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0OoOo0 lambda$new$0() {
        return new o0OoOo0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p310o0O0oOO.o0Oo0oo lambda$new$1() {
        return new p310o0O0oOO.o0Oo0oo();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.OooO00o("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        o0OoOo0 o0oooo0 = this.cpuGaugeCollector.get();
        long j2 = o0oooo0.f42522OooO0Oo;
        if (j2 != -1 && j2 != 0) {
            if (!(j <= 0)) {
                ScheduledFuture scheduledFuture = o0oooo0.f42524OooO0o0;
                if (scheduledFuture == null) {
                    o0oooo0.OooO00o(j, timer);
                } else if (o0oooo0.f42523OooO0o != j) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        o0oooo0.f42524OooO0o0 = null;
                        o0oooo0.f42523OooO0o = -1L;
                    }
                    o0oooo0.OooO00o(j, timer);
                }
            }
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.OooO00o("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        p310o0O0oOO.o0Oo0oo o0oo0oo2 = this.memoryGaugeCollector.get();
        OooOOO0 oooOOO0 = p310o0O0oOO.o0Oo0oo.f42511OooO0o;
        if (j <= 0) {
            o0oo0oo2.getClass();
        } else {
            ScheduledFuture scheduledFuture = o0oo0oo2.f42515OooO0Oo;
            if (scheduledFuture == null) {
                o0oo0oo2.OooO0O0(j, timer);
            } else if (o0oo0oo2.f42516OooO0o0 != j) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    o0oo0oo2.f42515OooO0Oo = null;
                    o0oo0oo2.f42516OooO0o0 = -1L;
                }
                o0oo0oo2.OooO0O0(j, timer);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState) {
        GaugeMetric.OooO0O0 oooO0O0NewBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().f42519OooO00o.isEmpty()) {
            oooO0O0NewBuilder.OooO0Oo(this.cpuGaugeCollector.get().f42519OooO00o.poll());
        }
        while (!this.memoryGaugeCollector.get().f42513OooO0O0.isEmpty()) {
            oooO0O0NewBuilder.OooO0O0(this.memoryGaugeCollector.get().f42513OooO0O0.poll());
        }
        oooO0O0NewBuilder.OooO0o(str);
        OooOOO oooOOO = this.transportManager;
        oooOOO.f42644OooOO0o.execute(new o00O00O(1, oooOOO, oooO0O0NewBuilder.build(), applicationProcessState));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new o0ooOOo(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        GaugeMetric.OooO0O0 oooO0O0NewBuilder = GaugeMetric.newBuilder();
        oooO0O0NewBuilder.OooO0o(str);
        oooO0O0NewBuilder.OooO0o0(getGaugeMetadata());
        GaugeMetric gaugeMetricBuild = oooO0O0NewBuilder.build();
        OooOOO oooOOO = this.transportManager;
        oooOOO.f42644OooOO0o.execute(new o00O00O(1, oooOOO, gaugeMetricBuild, applicationProcessState));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, final ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.f20455OooO0o0);
        if (jStartCollectingGauges == -1) {
            logger.OooO0o("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String str = perfSession.f20453OooO0Oo;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: o0O0oOO.o00Oo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42506OooO0Oo.lambda$startCollectingGauges$2(str, applicationProcessState);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.OooO0o("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final ApplicationProcessState applicationProcessState = this.applicationProcessState;
        o0OoOo0 o0oooo0 = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = o0oooo0.f42524OooO0o0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            o0oooo0.f42524OooO0o0 = null;
            o0oooo0.f42523OooO0o = -1L;
        }
        p310o0O0oOO.o0Oo0oo o0oo0oo2 = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = o0oo0oo2.f42515OooO0Oo;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            o0oo0oo2.f42515OooO0Oo = null;
            o0oo0oo2.f42516OooO0o0 = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: o0O0oOO.o00O0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f42503OooO0Oo.lambda$stopCollectingGauges$3(str, applicationProcessState);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    @VisibleForTesting
    public GaugeManager(o000oOoO<ScheduledExecutorService> o000oooo2, OooOOO oooOOO, o0Oo0oo o0oo0oo2, o0ooOOo o0ooooo, o000oOoO<o0OoOo0> o000oooo3, o000oOoO<p310o0O0oOO.o0Oo0oo> o000oooo4) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = o000oooo2;
        this.transportManager = oooOOO;
        this.configResolver = o0oo0oo2;
        this.gaugeMetadataManager = o0ooooo;
        this.cpuGaugeCollector = o000oooo3;
        this.memoryGaugeCollector = o000oooo4;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
