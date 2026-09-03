package io.opentelemetry.sdk.metrics.export;

import com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_IntervalMetricReader_InternalState extends IntervalMetricReader.InternalState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MetricExporter f32762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Collection<MetricProducer> f32764OooO0OO;

    public static final class Builder extends IntervalMetricReader.InternalState.Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public MetricExporter f32765OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f32766OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Collection<MetricProducer> f32767OooO0OO;

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final AutoValue_IntervalMetricReader_InternalState OooO00o() {
            Long l;
            MetricExporter metricExporter = this.f32765OooO00o;
            if (metricExporter != null && (l = this.f32766OooO0O0) != null && this.f32767OooO0OO != null) {
                return new AutoValue_IntervalMetricReader_InternalState(metricExporter, l.longValue(), this.f32767OooO0OO);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f32765OooO00o == null) {
                sb.append(" metricExporter");
            }
            if (this.f32766OooO0O0 == null) {
                sb.append(" exportIntervalMillis");
            }
            if (this.f32767OooO0OO == null) {
                sb.append(" metricProducers");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final Builder OooO0O0(long j) {
            this.f32766OooO0O0 = Long.valueOf(j);
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final Builder OooO0OO(YallaOtlpMetricExporter yallaOtlpMetricExporter) {
            this.f32765OooO00o = yallaOtlpMetricExporter;
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState.Builder
        public final Builder OooO0Oo(Collection collection) {
            if (collection == null) {
                throw new NullPointerException("Null metricProducers");
            }
            this.f32767OooO0OO = collection;
            return this;
        }
    }

    public AutoValue_IntervalMetricReader_InternalState() {
        throw null;
    }

    public AutoValue_IntervalMetricReader_InternalState(MetricExporter metricExporter, long j, Collection collection) {
        this.f32762OooO00o = metricExporter;
        this.f32763OooO0O0 = j;
        this.f32764OooO0OO = collection;
    }

    @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState
    public final long OooO00o() {
        return this.f32763OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState
    public final MetricExporter OooO0O0() {
        return this.f32762OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.export.IntervalMetricReader.InternalState
    public final Collection<MetricProducer> OooO0OO() {
        return this.f32764OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntervalMetricReader.InternalState)) {
            return false;
        }
        IntervalMetricReader.InternalState internalState = (IntervalMetricReader.InternalState) obj;
        return this.f32762OooO00o.equals(internalState.OooO0O0()) && this.f32763OooO0O0 == internalState.OooO00o() && this.f32764OooO0OO.equals(internalState.OooO0OO());
    }

    public final int hashCode() {
        int iHashCode = (this.f32762OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f32763OooO0O0;
        return ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f32764OooO0OO.hashCode();
    }

    public final String toString() {
        return "InternalState{metricExporter=" + this.f32762OooO00o + ", exportIntervalMillis=" + this.f32763OooO0O0 + ", metricProducers=" + this.f32764OooO0OO + "}";
    }
}
