package io.opentelemetry.sdk.metrics.export;

import com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_IntervalMetricReader_InternalState extends IntervalMetricReader.InternalState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MetricExporter f33296OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33297OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Collection<MetricProducer> f33298OooO0OO;

    public static final class Builder extends IntervalMetricReader.InternalState.Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public MetricExporter f33299OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f33300OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Collection<MetricProducer> f33301OooO0OO;

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final AutoValue_IntervalMetricReader_InternalState OooO00o() {
            Long l;
            MetricExporter metricExporter = this.f33299OooO00o;
            if (metricExporter != null && (l = this.f33300OooO0O0) != null && this.f33301OooO0OO != null) {
                return new AutoValue_IntervalMetricReader_InternalState(metricExporter, l.longValue(), this.f33301OooO0OO);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f33299OooO00o == null) {
                sb.append(" metricExporter");
            }
            if (this.f33300OooO0O0 == null) {
                sb.append(" exportIntervalMillis");
            }
            if (this.f33301OooO0OO == null) {
                sb.append(" metricProducers");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final Builder OooO0O0(long j) {
            this.f33300OooO0O0 = Long.valueOf(j);
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final Builder OooO0OO(YallaOtlpMetricExporter yallaOtlpMetricExporter) {
            this.f33299OooO00o = yallaOtlpMetricExporter;
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final Builder OooO0Oo(Collection collection) {
            if (collection == null) {
                throw new NullPointerException("Null metricProducers");
            }
            this.f33301OooO0OO = collection;
            return this;
        }
    }

    public AutoValue_IntervalMetricReader_InternalState() {
        throw null;
    }

    public AutoValue_IntervalMetricReader_InternalState(MetricExporter metricExporter, long j, Collection collection) {
        this.f33296OooO00o = metricExporter;
        this.f33297OooO0O0 = j;
        this.f33298OooO0OO = collection;
    }

    @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState
    public final long OooO00o() {
        return this.f33297OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState
    public final MetricExporter OooO0O0() {
        return this.f33296OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState
    public final Collection<MetricProducer> OooO0OO() {
        return this.f33298OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntervalMetricReader.InternalState)) {
            return false;
        }
        IntervalMetricReader.InternalState internalState = (IntervalMetricReader.InternalState) obj;
        return this.f33296OooO00o.equals(internalState.OooO0O0()) && this.f33297OooO0O0 == internalState.OooO00o() && this.f33298OooO0OO.equals(internalState.OooO0OO());
    }

    public final int hashCode() {
        int iHashCode = (this.f33296OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f33297OooO0O0;
        return ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f33298OooO0OO.hashCode();
    }

    public final String toString() {
        return "InternalState{metricExporter=" + this.f33296OooO00o + ", exportIntervalMillis=" + this.f33297OooO0O0 + ", metricProducers=" + this.f33298OooO0OO + "}";
    }
}
