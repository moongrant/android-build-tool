package io.opentelemetry.sdk.metrics.export;

import com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter;
import com.google.auto.value.AutoValue;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.internal.DaemonThreadFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;
import p023Oooo00o.oO00O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class IntervalMetricReader {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Logger f32768OooO0o0 = Logger.getLogger(IntervalMetricReader.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Exporter f32769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f32770OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile ScheduledFuture<?> f32771OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f32772OooO0Oo;

    public static final class Exporter implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InternalState f32773OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicBoolean f32774OooO0o0 = new AtomicBoolean(true);

        public Exporter(InternalState internalState) {
            this.f32773OooO0Oo = internalState;
        }

        public final CompletableResultCode OooO00o() {
            InternalState internalState = this.f32773OooO0Oo;
            final CompletableResultCode completableResultCode = new CompletableResultCode();
            AtomicBoolean atomicBoolean = this.f32774OooO0o0;
            if (atomicBoolean.compareAndSet(true, false)) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator<MetricProducer> it = internalState.OooO0OO().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(it.next().OooO00o());
                    }
                    final CompletableResultCode completableResultCodeExport = internalState.OooO0O0().export(Collections.unmodifiableList(arrayList));
                    completableResultCodeExport.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.OooO0O0
                        @Override // java.lang.Runnable
                        public final void run() {
                            IntervalMetricReader.Exporter exporter = this.f32778OooO0Oo;
                            exporter.getClass();
                            if (!completableResultCodeExport.OooO0O0()) {
                                IntervalMetricReader.f32768OooO0o0.log(Level.FINE, "Exporter failed");
                            }
                            completableResultCode.OooO0o0();
                            exporter.f32774OooO0o0.set(true);
                        }
                    });
                } catch (Throwable th) {
                    atomicBoolean.set(true);
                    IntervalMetricReader.f32768OooO0o0.log(Level.WARNING, "Exporter threw an Exception", th);
                    completableResultCode.OooO00o();
                }
            } else {
                IntervalMetricReader.f32768OooO0o0.log(Level.FINE, "Exporter busy. Dropping metrics.");
                completableResultCode.OooO00o();
            }
            return completableResultCode;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO00o();
        }
    }

    @Immutable
    @AutoValue
    public static abstract class InternalState {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract AutoValue_IntervalMetricReader_InternalState OooO00o();

            public abstract AutoValue_IntervalMetricReader_InternalState.Builder OooO0O0(long j);

            public abstract AutoValue_IntervalMetricReader_InternalState.Builder OooO0OO(YallaOtlpMetricExporter yallaOtlpMetricExporter);

            public abstract AutoValue_IntervalMetricReader_InternalState.Builder OooO0Oo(Collection collection);
        }

        public abstract long OooO00o();

        public abstract MetricExporter OooO0O0();

        public abstract Collection<MetricProducer> OooO0OO();
    }

    static {
        new AtomicReference();
    }

    public IntervalMetricReader(InternalState internalState) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new DaemonThreadFactory("IntervalMetricReader"));
        this.f32772OooO0Oo = new Object();
        this.f32769OooO00o = new Exporter(internalState);
        this.f32770OooO0O0 = scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static IntervalMetricReaderBuilder OooO00o() {
        AutoValue_IntervalMetricReader_InternalState.Builder builder = new AutoValue_IntervalMetricReader_InternalState.Builder();
        builder.OooO0O0(60000L);
        return new IntervalMetricReaderBuilder(builder);
    }

    public final void OooO0O0() {
        final CompletableResultCode completableResultCodeShutdown;
        Runnable oo00o0o;
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        if (this.f32771OooO0OO != null) {
            this.f32771OooO0OO.cancel(false);
        }
        this.f32770OooO0O0.shutdown();
        try {
            try {
                ScheduledExecutorService scheduledExecutorService = this.f32770OooO0O0;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                scheduledExecutorService.awaitTermination(5L, timeUnit);
                this.f32769OooO00o.OooO00o().OooO0OO(5L, timeUnit);
                completableResultCodeShutdown = this.f32769OooO00o.f32773OooO0Oo.OooO0O0().shutdown();
                oo00o0o = new oO00O0o(3, completableResultCodeShutdown, completableResultCode);
            } catch (InterruptedException unused) {
                this.f32770OooO0O0.shutdownNow();
                Thread.currentThread().interrupt();
                completableResultCodeShutdown = this.f32769OooO00o.f32773OooO0Oo.OooO0O0().shutdown();
                oo00o0o = new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.OooO00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Logger logger = IntervalMetricReader.f32768OooO0o0;
                        boolean zOooO0O0 = completableResultCodeShutdown.OooO0O0();
                        CompletableResultCode completableResultCode2 = completableResultCode;
                        if (zOooO0O0) {
                            completableResultCode2.OooO0o0();
                        } else {
                            completableResultCode2.OooO00o();
                        }
                    }
                };
            }
            completableResultCodeShutdown.OooO0o(oo00o0o);
        } catch (Throwable th) {
            final CompletableResultCode completableResultCodeShutdown2 = this.f32769OooO00o.f32773OooO0Oo.OooO0O0().shutdown();
            completableResultCodeShutdown2.OooO0o(new Runnable() { // from class: io.opentelemetry.sdk.metrics.export.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    Logger logger = IntervalMetricReader.f32768OooO0o0;
                    boolean zOooO0O0 = completableResultCodeShutdown2.OooO0O0();
                    CompletableResultCode completableResultCode2 = completableResultCode;
                    if (zOooO0O0) {
                        completableResultCode2.OooO0o0();
                    } else {
                        completableResultCode2.OooO00o();
                    }
                }
            });
            throw th;
        }
    }
}
