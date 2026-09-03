package io.opentelemetry.sdk.metrics.internal.aggregator;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_HistogramAccumulation extends HistogramAccumulation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f33325OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f33326OooO0O0;

    public AutoValue_HistogramAccumulation(double d, long[] jArr) {
        this.f33325OooO00o = d;
        if (jArr == null) {
            throw new NullPointerException("Null counts");
        }
        this.f33326OooO0O0 = jArr;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.HistogramAccumulation
    public final long[] OooO00o() {
        return this.f33326OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.HistogramAccumulation
    public final double OooO0O0() {
        return this.f33325OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HistogramAccumulation)) {
            return false;
        }
        HistogramAccumulation histogramAccumulation = (HistogramAccumulation) obj;
        if (Double.doubleToLongBits(this.f33325OooO00o) == Double.doubleToLongBits(histogramAccumulation.OooO0O0())) {
            if (Arrays.equals(this.f33326OooO0O0, histogramAccumulation instanceof AutoValue_HistogramAccumulation ? ((AutoValue_HistogramAccumulation) histogramAccumulation).f33326OooO0O0 : histogramAccumulation.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.f33325OooO00o;
        return ((((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33326OooO0O0);
    }

    public final String toString() {
        return "HistogramAccumulation{sum=" + this.f33325OooO00o + ", counts=" + Arrays.toString(this.f33326OooO0O0) + "}";
    }
}
