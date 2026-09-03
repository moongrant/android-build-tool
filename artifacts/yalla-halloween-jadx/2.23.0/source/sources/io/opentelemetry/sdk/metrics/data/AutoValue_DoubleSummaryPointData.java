package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.api.common.Attributes;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoubleSummaryPointData extends DoubleSummaryPointData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f33265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Attributes f33267OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Exemplar> f33268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final double f33269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f33270OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<ValueAtPercentile> f33271OooO0oO;

    public AutoValue_DoubleSummaryPointData(long j, long j2, Attributes attributes, List<Exemplar> list, long j3, double d, List<ValueAtPercentile> list2) {
        this.f33265OooO00o = j;
        this.f33266OooO0O0 = j2;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33267OooO0OO = attributes;
        if (list == null) {
            throw new NullPointerException("Null exemplars");
        }
        this.f33268OooO0Oo = list;
        this.f33270OooO0o0 = j3;
        this.f33269OooO0o = d;
        if (list2 == null) {
            throw new NullPointerException("Null percentileValues");
        }
        this.f33271OooO0oO = list2;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final Attributes OooO00o() {
        return this.f33267OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0O0() {
        return this.f33266OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0OO() {
        return this.f33265OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final List<Exemplar> OooO0Oo() {
        return this.f33268OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleSummaryPointData
    public final long OooO0o() {
        return this.f33270OooO0o0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleSummaryPointData
    public final List<ValueAtPercentile> OooO0oO() {
        return this.f33271OooO0oO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoubleSummaryPointData
    public final double OooO0oo() {
        return this.f33269OooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleSummaryPointData)) {
            return false;
        }
        DoubleSummaryPointData doubleSummaryPointData = (DoubleSummaryPointData) obj;
        if (this.f33265OooO00o == ((AutoValue_DoubleSummaryPointData) doubleSummaryPointData).f33265OooO00o) {
            AutoValue_DoubleSummaryPointData autoValue_DoubleSummaryPointData = (AutoValue_DoubleSummaryPointData) doubleSummaryPointData;
            if (this.f33266OooO0O0 == autoValue_DoubleSummaryPointData.f33266OooO0O0 && this.f33267OooO0OO.equals(autoValue_DoubleSummaryPointData.f33267OooO0OO) && this.f33268OooO0Oo.equals(autoValue_DoubleSummaryPointData.f33268OooO0Oo) && this.f33270OooO0o0 == doubleSummaryPointData.OooO0o() && Double.doubleToLongBits(this.f33269OooO0o) == Double.doubleToLongBits(doubleSummaryPointData.OooO0oo()) && this.f33271OooO0oO.equals(doubleSummaryPointData.OooO0oO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33265OooO00o;
        long j2 = this.f33266OooO0O0;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f33267OooO0OO.hashCode()) * 1000003) ^ this.f33268OooO0Oo.hashCode()) * 1000003;
        long j3 = this.f33270OooO0o0;
        int i = (iHashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        double d = this.f33269OooO0o;
        return ((i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ this.f33271OooO0oO.hashCode();
    }

    public final String toString() {
        return "DoubleSummaryPointData{startEpochNanos=" + this.f33265OooO00o + ", epochNanos=" + this.f33266OooO0O0 + ", attributes=" + this.f33267OooO0OO + ", exemplars=" + this.f33268OooO0Oo + ", count=" + this.f33270OooO0o0 + ", sum=" + this.f33269OooO0o + ", percentileValues=" + this.f33271OooO0oO + "}";
    }
}
