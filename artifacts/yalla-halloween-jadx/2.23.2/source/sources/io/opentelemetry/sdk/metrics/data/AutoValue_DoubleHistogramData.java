package io.opentelemetry.sdk.metrics.data;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoubleHistogramData extends DoubleHistogramData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AggregationTemporality f32712OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Collection<DoubleHistogramPointData> f32713OooO0O0;

    public AutoValue_DoubleHistogramData(AggregationTemporality aggregationTemporality, List list) {
        if (aggregationTemporality == null) {
            throw new NullPointerException("Null aggregationTemporality");
        }
        this.f32712OooO00o = aggregationTemporality;
        if (list == null) {
            throw new NullPointerException("Null points");
        }
        this.f32713OooO0O0 = list;
    }

    @Override // io.opentelemetry.sdk.metrics.data.Data
    public final Collection<DoubleHistogramPointData> OooO00o() {
        return this.f32713OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleHistogramData
    public final AggregationTemporality OooO0O0() {
        return this.f32712OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleHistogramData)) {
            return false;
        }
        DoubleHistogramData doubleHistogramData = (DoubleHistogramData) obj;
        return this.f32712OooO00o.equals(doubleHistogramData.OooO0O0()) && this.f32713OooO0O0.equals(doubleHistogramData.OooO00o());
    }

    public final int hashCode() {
        return ((this.f32712OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f32713OooO0O0.hashCode();
    }

    public final String toString() {
        return "DoubleHistogramData{aggregationTemporality=" + this.f32712OooO00o + ", points=" + this.f32713OooO0O0 + "}";
    }
}
