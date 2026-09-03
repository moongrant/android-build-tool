package io.opentelemetry.sdk.metrics.data;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ValueAtPercentile extends ValueAtPercentile {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f32754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f32755OooO0O0;

    public AutoValue_ValueAtPercentile(double d, double d2) {
        this.f32754OooO00o = d;
        this.f32755OooO0O0 = d2;
    }

    @Override // io.opentelemetry.sdk.metrics.data.ValueAtPercentile
    public final double OooO0O0() {
        return this.f32754OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.ValueAtPercentile
    public final double OooO0OO() {
        return this.f32755OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueAtPercentile)) {
            return false;
        }
        ValueAtPercentile valueAtPercentile = (ValueAtPercentile) obj;
        return Double.doubleToLongBits(this.f32754OooO00o) == Double.doubleToLongBits(valueAtPercentile.OooO0O0()) && Double.doubleToLongBits(this.f32755OooO0O0) == Double.doubleToLongBits(valueAtPercentile.OooO0OO());
    }

    public final int hashCode() {
        double d = this.f32754OooO00o;
        int iDoubleToLongBits = (((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ 1000003) * 1000003;
        double d2 = this.f32755OooO0O0;
        return iDoubleToLongBits ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)));
    }

    public final String toString() {
        return "ValueAtPercentile{percentile=" + this.f32754OooO00o + ", value=" + this.f32755OooO0O0 + "}";
    }
}
