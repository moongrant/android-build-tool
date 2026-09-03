package io.opentelemetry.sdk.metrics.export;

import com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class IntervalMetricReaderBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final IntervalMetricReader.InternalState.Builder f33309OooO00o;

    public IntervalMetricReaderBuilder(AutoValue_IntervalMetricReader_InternalState.Builder builder) {
        this.f33309OooO00o = builder;
    }

    public final IntervalMetricReader OooO00o() {
        AutoValue_IntervalMetricReader_InternalState autoValue_IntervalMetricReader_InternalStateOooO00o = this.f33309OooO00o.OooO00o();
        if (!(autoValue_IntervalMetricReader_InternalStateOooO00o.f33297OooO0O0 > 0)) {
            throw new IllegalArgumentException("Export interval must be positive");
        }
        IntervalMetricReader intervalMetricReader = new IntervalMetricReader(autoValue_IntervalMetricReader_InternalStateOooO00o);
        synchronized (intervalMetricReader.f33306OooO0Oo) {
            if (intervalMetricReader.f33305OooO0OO == null) {
                ScheduledExecutorService scheduledExecutorService = intervalMetricReader.f33304OooO0O0;
                IntervalMetricReader.Exporter exporter = intervalMetricReader.f33303OooO00o;
                intervalMetricReader.f33305OooO0OO = scheduledExecutorService.scheduleAtFixedRate(exporter, exporter.f33307OooO0Oo.OooO00o(), intervalMetricReader.f33303OooO00o.f33307OooO0Oo.OooO00o(), TimeUnit.MILLISECONDS);
            }
        }
        return intervalMetricReader;
    }

    public final void OooO0O0(long j) {
        this.f33309OooO00o.OooO0O0(j);
    }

    public final void OooO0OO(YallaOtlpMetricExporter yallaOtlpMetricExporter) {
        this.f33309OooO00o.OooO0OO(yallaOtlpMetricExporter);
    }

    public final void OooO0Oo(Collection collection) {
        this.f33309OooO00o.OooO0Oo(collection);
    }
}
