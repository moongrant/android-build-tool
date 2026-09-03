package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.OooO0o;
import com.google.firebase.components.o0OoOo0;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOOO;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p026Oooo0o.OooO0OO;
import p309o0O0oO0.o000OOo0;
import p309o0O0oO0.o00O0O0;
import p309o0O0oO0.oo00o;
import p311o0O0oO0o.o0O0O00;
import p314o0O0oOOO.o000O0;
import p314o0O0oOOO.o000O00;
import p314o0O0oOOO.o000O000;
import p314o0O0oOOO.o000O00O;
import p314o0O0oOOO.o000OO0O;
import p314o0O0oOOO.o000Oo0;
import p316o0O0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final o000OOo0 configResolver;
    private final o0OoOo0<o000O000> cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final o0OoOo0<ScheduledExecutorService> gaugeManagerExecutor;

    @Nullable
    private o000O0 gaugeMetadataManager;
    private final o0OoOo0<o000OO0O> memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final o0OO00O transportManager;
    private static final o0O0O00 logger = o0O0O00.OooO0Oo();
    private static final GaugeManager instance = new GaugeManager();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19984OooO00o;

        static {
            int[] iArr = new int[ApplicationProcessState.values().length];
            f19984OooO00o = iArr;
            try {
                iArr[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19984OooO00o[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new o0OoOo0(new o000Oo0()), o0OO00O.f41914OooOo0O, o000OOo0.OooO0o0(), null, new o0OoOo0(new o000O00()), new o0OoOo0(new o000O00O()));
    }

    private static void collectGaugeMetricOnce(o000O000 o000o001, o000OO0O o000oo0o2, Timer timer) {
        synchronized (o000o001) {
            try {
                o000o001.f41868OooO0O0.schedule(new OooO0OO(1, o000o001, timer), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                o000O000.f41865OooO0oO.OooO0o("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        o000oo0o2.OooO00o(timer);
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        oo00o oo00oVar;
        long jLongValue;
        int i = OooO00o.f19984OooO00o[applicationProcessState.ordinal()];
        if (i != 1) {
            jLongValue = i != 2 ? -1L : this.configResolver.OooOOO();
        } else {
            o000OOo0 o000ooo1 = this.configResolver;
            o000ooo1.getClass();
            synchronized (oo00o.class) {
                if (oo00o.f41810OooO00o == null) {
                    oo00o.f41810OooO00o = new oo00o();
                }
                oo00oVar = oo00o.f41810OooO00o;
            }
            OooO<Long> oooOOooOO0O = o000ooo1.OooOO0O(oo00oVar);
            if (oooOOooOO0O.OooO0O0() && o000OOo0.OooOo00(oooOOooOO0O.OooO00o().longValue())) {
                jLongValue = oooOOooOO0O.OooO00o().longValue();
            } else {
                OooO<Long> oooOOooOOO0 = o000ooo1.OooOOO0(oo00oVar);
                if (oooOOooOOO0.OooO0O0() && o000OOo0.OooOo00(oooOOooOOO0.OooO00o().longValue())) {
                    o000ooo1.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = oooOOooOOO0.OooO00o().longValue();
                } else {
                    OooO<Long> oooOOooO0OO = o000ooo1.OooO0OO(oo00oVar);
                    if (oooOOooO0OO.OooO0O0() && o000OOo0.OooOo00(oooOOooO0OO.OooO00o().longValue())) {
                        jLongValue = oooOOooO0OO.OooO00o().longValue();
                    } else {
                        Long l = 0L;
                        jLongValue = l.longValue();
                    }
                }
            }
        }
        o0O0O00 o0o0o00 = o000O000.f41865OooO0oO;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    private GaugeMetadata getGaugeMetadata() {
        GaugeMetadata.OooO0O0 oooO0O0NewBuilder = GaugeMetadata.newBuilder();
        o000O0 o000o0 = this.gaugeMetadataManager;
        StorageUnit storageUnit = StorageUnit.BYTES;
        oooO0O0NewBuilder.OooO0O0(OooOOO.OooO0O0(storageUnit.OooO00o(o000o0.f41864OooO0OO.totalMem)));
        oooO0O0NewBuilder.OooO0Oo(OooOOO.OooO0O0(storageUnit.OooO00o(this.gaugeMetadataManager.f41862OooO00o.maxMemory())));
        oooO0O0NewBuilder.OooO0o0(OooOOO.OooO0O0(StorageUnit.MEGABYTES.OooO00o(this.gaugeMetadataManager.f41863OooO0O0.getMemoryClass())));
        return oooO0O0NewBuilder.build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        o00O0O0 o00o0o0;
        long jLongValue;
        int i = OooO00o.f19984OooO00o[applicationProcessState.ordinal()];
        if (i != 1) {
            jLongValue = i != 2 ? -1L : this.configResolver.OooOOOO();
        } else {
            o000OOo0 o000ooo1 = this.configResolver;
            o000ooo1.getClass();
            synchronized (o00O0O0.class) {
                if (o00O0O0.f41801OooO00o == null) {
                    o00O0O0.f41801OooO00o = new o00O0O0();
                }
                o00o0o0 = o00O0O0.f41801OooO00o;
            }
            OooO<Long> oooOOooOO0O = o000ooo1.OooOO0O(o00o0o0);
            if (oooOOooOO0O.OooO0O0() && o000OOo0.OooOo00(oooOOooOO0O.OooO00o().longValue())) {
                jLongValue = oooOOooOO0O.OooO00o().longValue();
            } else {
                OooO<Long> oooOOooOOO0 = o000ooo1.OooOOO0(o00o0o0);
                if (oooOOooOOO0.OooO0O0() && o000OOo0.OooOo00(oooOOooOOO0.OooO00o().longValue())) {
                    o000ooo1.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = oooOOooOOO0.OooO00o().longValue();
                } else {
                    OooO<Long> oooOOooO0OO = o000ooo1.OooO0OO(o00o0o0);
                    if (oooOOooO0OO.OooO0O0() && o000OOo0.OooOo00(oooOOooO0OO.OooO00o().longValue())) {
                        jLongValue = oooOOooO0OO.OooO00o().longValue();
                    } else {
                        Long l = 0L;
                        jLongValue = l.longValue();
                    }
                }
            }
        }
        o0O0O00 o0o0o00 = o000OO0O.f41878OooO0o;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o000O000 lambda$new$0() {
        return new o000O000();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o000OO0O lambda$new$1() {
        return new o000OO0O();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.OooO00o("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        o000O000 o000o001 = this.cpuGaugeCollector.get();
        long j2 = o000o001.f41870OooO0Oo;
        if (j2 != -1 && j2 != 0) {
            if (!(j <= 0)) {
                ScheduledFuture scheduledFuture = o000o001.f41872OooO0o0;
                if (scheduledFuture == null) {
                    o000o001.OooO00o(j, timer);
                } else if (o000o001.f41871OooO0o != j) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        o000o001.f41872OooO0o0 = null;
                        o000o001.f41871OooO0o = -1L;
                    }
                    o000o001.OooO00o(j, timer);
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
        o000OO0O o000oo0o2 = this.memoryGaugeCollector.get();
        o0O0O00 o0o0o00 = o000OO0O.f41878OooO0o;
        if (j <= 0) {
            o000oo0o2.getClass();
        } else {
            ScheduledFuture scheduledFuture = o000oo0o2.f41882OooO0Oo;
            if (scheduledFuture == null) {
                o000oo0o2.OooO0O0(j, timer);
            } else if (o000oo0o2.f41883OooO0o0 != j) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    o000oo0o2.f41882OooO0Oo = null;
                    o000oo0o2.f41883OooO0o0 = -1L;
                }
                o000oo0o2.OooO0O0(j, timer);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState) {
        GaugeMetric.OooO0O0 oooO0O0NewBuilder = GaugeMetric.newBuilder();
        while (!this.cpuGaugeCollector.get().f41867OooO00o.isEmpty()) {
            oooO0O0NewBuilder.OooO0Oo(this.cpuGaugeCollector.get().f41867OooO00o.poll());
        }
        while (!this.memoryGaugeCollector.get().f41880OooO0O0.isEmpty()) {
            oooO0O0NewBuilder.OooO0O0(this.memoryGaugeCollector.get().f41880OooO0O0.poll());
        }
        oooO0O0NewBuilder.OooO0o(str);
        o0OO00O o0oo00o2 = this.transportManager;
        o0oo00o2.f41923OooOO0o.execute(new p289o0O0Oo0.o000OO0O(1, o0oo00o2, oooO0O0NewBuilder.build(), applicationProcessState));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new o000O0(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        GaugeMetric.OooO0O0 oooO0O0NewBuilder = GaugeMetric.newBuilder();
        oooO0O0NewBuilder.OooO0o(str);
        oooO0O0NewBuilder.OooO0o0(getGaugeMetadata());
        GaugeMetric gaugeMetricBuild = oooO0O0NewBuilder.build();
        o0OO00O o0oo00o2 = this.transportManager;
        o0oo00o2.f41923OooOO0o.execute(new p289o0O0Oo0.o000OO0O(1, o0oo00o2, gaugeMetricBuild, applicationProcessState));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, final ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.f19983OooO0o0);
        if (jStartCollectingGauges == -1) {
            logger.OooO0o("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String str = perfSession.f19981OooO0Oo;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: o0O0oOOO.o000O0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41875OooO0Oo.lambda$startCollectingGauges$2(str, applicationProcessState);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.OooO0o("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        o000O000 o000o001 = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = o000o001.f41872OooO0o0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            o000o001.f41872OooO0o0 = null;
            o000o001.f41871OooO0o = -1L;
        }
        o000OO0O o000oo0o2 = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = o000oo0o2.f41882OooO0Oo;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            o000oo0o2.f41882OooO0Oo = null;
            o000oo0o2.f41883OooO0o0 = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new OooO0o(2, this, str, applicationProcessState), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    @VisibleForTesting
    public GaugeManager(o0OoOo0<ScheduledExecutorService> o0oooo1, o0OO00O o0oo00o2, o000OOo0 o000ooo1, o000O0 o000o0, o0OoOo0<o000O000> o0oooo2, o0OoOo0<o000OO0O> o0oooo3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = o0oooo1;
        this.transportManager = o0oo00o2;
        this.configResolver = o000ooo1;
        this.gaugeMetadataManager = o000o0;
        this.cpuGaugeCollector = o0oooo2;
        this.memoryGaugeCollector = o0oooo3;
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
