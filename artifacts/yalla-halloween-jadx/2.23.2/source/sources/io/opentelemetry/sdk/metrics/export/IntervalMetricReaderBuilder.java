package io.opentelemetry.sdk.metrics.export;

import com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class IntervalMetricReaderBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final IntervalMetricReader.InternalState.Builder f32775OooO00o;

    public IntervalMetricReaderBuilder(AutoValue_IntervalMetricReader_InternalState.Builder builder) {
        this.f32775OooO00o = builder;
    }

    public final IntervalMetricReader OooO00o() {
        AutoValue_IntervalMetricReader_InternalState autoValue_IntervalMetricReader_InternalStateOooO00o = this.f32775OooO00o.OooO00o();
        if (!(autoValue_IntervalMetricReader_InternalStateOooO00o.f32763OooO0O0 > 0)) {
            throw new IllegalArgumentException("Export interval must be positive");
        }
        IntervalMetricReader intervalMetricReader = new IntervalMetricReader(autoValue_IntervalMetricReader_InternalStateOooO00o);
        synchronized (intervalMetricReader.f32772OooO0Oo) {
            if (intervalMetricReader.f32771OooO0OO == null) {
                ScheduledExecutorService scheduledExecutorService = intervalMetricReader.f32770OooO0O0;
                IntervalMetricReader.Exporter exporter = intervalMetricReader.f32769OooO00o;
                intervalMetricReader.f32771OooO0OO = scheduledExecutorService.scheduleAtFixedRate(exporter, exporter.f32773OooO0Oo.OooO00o(), intervalMetricReader.f32769OooO00o.f32773OooO0Oo.OooO00o(), TimeUnit.MILLISECONDS);
            }
        }
        return intervalMetricReader;
    }

    public final void OooO0O0(long j) {
        this.f32775OooO00o.OooO0O0(j);
    }

    public final void OooO0OO(YallaOtlpMetricExporter yallaOtlpMetricExporter) {
        this.f32775OooO00o.OooO0OO(yallaOtlpMetricExporter);
    }

    public final void OooO0Oo(Collection collection) {
        this.f32775OooO00o.OooO0Oo(collection);
    }
}
