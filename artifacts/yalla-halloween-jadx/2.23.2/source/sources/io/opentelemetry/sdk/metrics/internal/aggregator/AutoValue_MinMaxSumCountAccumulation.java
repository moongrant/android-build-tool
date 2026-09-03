package io.opentelemetry.sdk.metrics.internal.aggregator;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MinMaxSumCountAccumulation extends MinMaxSumCountAccumulation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f32793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f32794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f32795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f32796OooO0Oo;

    public AutoValue_MinMaxSumCountAccumulation(long j, double d, double d2, double d3) {
        this.f32793OooO00o = j;
        this.f32794OooO0O0 = d;
        this.f32795OooO0OO = d2;
        this.f32796OooO0Oo = d3;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.MinMaxSumCountAccumulation
    public final long OooO00o() {
        return this.f32793OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.MinMaxSumCountAccumulation
    public final double OooO0O0() {
        return this.f32796OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.MinMaxSumCountAccumulation
    public final double OooO0OO() {
        return this.f32795OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.MinMaxSumCountAccumulation
    public final double OooO0Oo() {
        return this.f32794OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MinMaxSumCountAccumulation)) {
            return false;
        }
        MinMaxSumCountAccumulation minMaxSumCountAccumulation = (MinMaxSumCountAccumulation) obj;
        return this.f32793OooO00o == minMaxSumCountAccumulation.OooO00o() && Double.doubleToLongBits(this.f32794OooO0O0) == Double.doubleToLongBits(minMaxSumCountAccumulation.OooO0Oo()) && Double.doubleToLongBits(this.f32795OooO0OO) == Double.doubleToLongBits(minMaxSumCountAccumulation.OooO0OO()) && Double.doubleToLongBits(this.f32796OooO0Oo) == Double.doubleToLongBits(minMaxSumCountAccumulation.OooO0O0());
    }

    public final int hashCode() {
        long j = this.f32793OooO00o;
        double d = this.f32794OooO0O0;
        int iDoubleToLongBits = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        double d2 = this.f32795OooO0OO;
        int iDoubleToLongBits2 = (iDoubleToLongBits ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)))) * 1000003;
        double d3 = this.f32796OooO0Oo;
        return iDoubleToLongBits2 ^ ((int) ((Double.doubleToLongBits(d3) >>> 32) ^ Double.doubleToLongBits(d3)));
    }

    public final String toString() {
        return "MinMaxSumCountAccumulation{count=" + this.f32793OooO00o + ", sum=" + this.f32794OooO0O0 + ", min=" + this.f32795OooO0OO + ", max=" + this.f32796OooO0Oo + "}";
    }
}
