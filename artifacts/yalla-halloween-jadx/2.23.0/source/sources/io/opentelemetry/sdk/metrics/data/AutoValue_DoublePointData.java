package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.api.common.Attributes;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoublePointData extends DoublePointData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f33256OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33257OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Attributes f33258OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Exemplar> f33259OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f33260OooO0o0;

    public AutoValue_DoublePointData(double d, long j, long j2, Attributes attributes, List list) {
        this.f33256OooO00o = j;
        this.f33257OooO0O0 = j2;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33258OooO0OO = attributes;
        if (list == null) {
            throw new NullPointerException("Null exemplars");
        }
        this.f33259OooO0Oo = list;
        this.f33260OooO0o0 = d;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final Attributes OooO00o() {
        return this.f33258OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0O0() {
        return this.f33257OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0OO() {
        return this.f33256OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final List<Exemplar> OooO0Oo() {
        return this.f33259OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoublePointData
    public final double OooO0o() {
        return this.f33260OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoublePointData)) {
            return false;
        }
        DoublePointData doublePointData = (DoublePointData) obj;
        if (this.f33256OooO00o == ((AutoValue_DoublePointData) doublePointData).f33256OooO00o) {
            AutoValue_DoublePointData autoValue_DoublePointData = (AutoValue_DoublePointData) doublePointData;
            if (this.f33257OooO0O0 == autoValue_DoublePointData.f33257OooO0O0 && this.f33258OooO0OO.equals(autoValue_DoublePointData.f33258OooO0OO) && this.f33259OooO0Oo.equals(autoValue_DoublePointData.f33259OooO0Oo) && Double.doubleToLongBits(this.f33260OooO0o0) == Double.doubleToLongBits(doublePointData.OooO0o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33256OooO00o;
        long j2 = this.f33257OooO0O0;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f33258OooO0OO.hashCode()) * 1000003) ^ this.f33259OooO0Oo.hashCode()) * 1000003;
        double d = this.f33260OooO0o0;
        return iHashCode ^ ((int) ((Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d)));
    }

    public final String toString() {
        return "DoublePointData{startEpochNanos=" + this.f33256OooO00o + ", epochNanos=" + this.f33257OooO0O0 + ", attributes=" + this.f33258OooO0OO + ", exemplars=" + this.f33259OooO0Oo + ", value=" + this.f33260OooO0o0 + "}";
    }
}
