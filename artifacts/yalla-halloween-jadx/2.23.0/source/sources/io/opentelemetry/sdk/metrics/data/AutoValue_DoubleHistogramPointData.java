package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.api.common.Attributes;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoubleHistogramPointData extends DoubleHistogramPointData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f33248OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33249OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Attributes f33250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Exemplar> f33251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f33252OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f33253OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<Double> f33254OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<Long> f33255OooO0oo;

    public AutoValue_DoubleHistogramPointData(long j, long j2, Attributes attributes, List<Exemplar> list, double d, long j3, List<Double> list2, List<Long> list3) {
        this.f33248OooO00o = j;
        this.f33249OooO0O0 = j2;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33250OooO0OO = attributes;
        if (list == null) {
            throw new NullPointerException("Null exemplars");
        }
        this.f33251OooO0Oo = list;
        this.f33253OooO0o0 = d;
        this.f33252OooO0o = j3;
        if (list2 == null) {
            throw new NullPointerException("Null boundaries");
        }
        this.f33254OooO0oO = list2;
        if (list3 == null) {
            throw new NullPointerException("Null counts");
        }
        this.f33255OooO0oo = list3;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleHistogramPointData
    public final double OooO() {
        return this.f33253OooO0o0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final Attributes OooO00o() {
        return this.f33250OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0O0() {
        return this.f33249OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0OO() {
        return this.f33248OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final List<Exemplar> OooO0Oo() {
        return this.f33251OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleHistogramPointData
    public final List<Double> OooO0o() {
        return this.f33254OooO0oO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleHistogramPointData
    public final long OooO0oO() {
        return this.f33252OooO0o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleHistogramPointData
    public final List<Long> OooO0oo() {
        return this.f33255OooO0oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleHistogramPointData)) {
            return false;
        }
        DoubleHistogramPointData doubleHistogramPointData = (DoubleHistogramPointData) obj;
        if (this.f33248OooO00o == ((AutoValue_DoubleHistogramPointData) doubleHistogramPointData).f33248OooO00o) {
            AutoValue_DoubleHistogramPointData autoValue_DoubleHistogramPointData = (AutoValue_DoubleHistogramPointData) doubleHistogramPointData;
            if (this.f33249OooO0O0 == autoValue_DoubleHistogramPointData.f33249OooO0O0 && this.f33250OooO0OO.equals(autoValue_DoubleHistogramPointData.f33250OooO0OO) && this.f33251OooO0Oo.equals(autoValue_DoubleHistogramPointData.f33251OooO0Oo) && Double.doubleToLongBits(this.f33253OooO0o0) == Double.doubleToLongBits(doubleHistogramPointData.OooO()) && this.f33252OooO0o == doubleHistogramPointData.OooO0oO() && this.f33254OooO0oO.equals(doubleHistogramPointData.OooO0o()) && this.f33255OooO0oo.equals(doubleHistogramPointData.OooO0oo())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33248OooO00o;
        long j2 = this.f33249OooO0O0;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f33250OooO0OO.hashCode()) * 1000003) ^ this.f33251OooO0Oo.hashCode()) * 1000003;
        double d = this.f33253OooO0o0;
        int iDoubleToLongBits = (iHashCode ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        long j3 = this.f33252OooO0o;
        return ((((iDoubleToLongBits ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f33254OooO0oO.hashCode()) * 1000003) ^ this.f33255OooO0oo.hashCode();
    }

    public final String toString() {
        return "DoubleHistogramPointData{startEpochNanos=" + this.f33248OooO00o + ", epochNanos=" + this.f33249OooO0O0 + ", attributes=" + this.f33250OooO0OO + ", exemplars=" + this.f33251OooO0Oo + ", sum=" + this.f33253OooO0o0 + ", count=" + this.f33252OooO0o + ", boundaries=" + this.f33254OooO0oO + ", counts=" + this.f33255OooO0oo + "}";
    }
}
