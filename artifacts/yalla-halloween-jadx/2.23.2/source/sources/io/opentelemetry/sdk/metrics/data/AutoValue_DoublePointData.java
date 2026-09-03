package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.api.common.Attributes;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoublePointData extends DoublePointData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f32722OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32723OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Attributes f32724OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Exemplar> f32725OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f32726OooO0o0;

    public AutoValue_DoublePointData(double d, long j, long j2, Attributes attributes, List list) {
        this.f32722OooO00o = j;
        this.f32723OooO0O0 = j2;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f32724OooO0OO = attributes;
        if (list == null) {
            throw new NullPointerException("Null exemplars");
        }
        this.f32725OooO0Oo = list;
        this.f32726OooO0o0 = d;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final Attributes OooO00o() {
        return this.f32724OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0O0() {
        return this.f32723OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0Oo() {
        return this.f32722OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.DoublePointData
    public final double OooO0o() {
        return this.f32726OooO0o0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final List<Exemplar> OooO0o0() {
        return this.f32725OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoublePointData)) {
            return false;
        }
        DoublePointData doublePointData = (DoublePointData) obj;
        if (this.f32722OooO00o == ((AutoValue_DoublePointData) doublePointData).f32722OooO00o) {
            AutoValue_DoublePointData autoValue_DoublePointData = (AutoValue_DoublePointData) doublePointData;
            if (this.f32723OooO0O0 == autoValue_DoublePointData.f32723OooO0O0 && this.f32724OooO0OO.equals(autoValue_DoublePointData.f32724OooO0OO) && this.f32725OooO0Oo.equals(autoValue_DoublePointData.f32725OooO0Oo) && Double.doubleToLongBits(this.f32726OooO0o0) == Double.doubleToLongBits(doublePointData.OooO0o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f32722OooO00o;
        long j2 = this.f32723OooO0O0;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f32724OooO0OO.hashCode()) * 1000003) ^ this.f32725OooO0Oo.hashCode()) * 1000003;
        double d = this.f32726OooO0o0;
        return iHashCode ^ ((int) ((Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d)));
    }

    public final String toString() {
        return "DoublePointData{startEpochNanos=" + this.f32722OooO00o + ", epochNanos=" + this.f32723OooO0O0 + ", attributes=" + this.f32724OooO0OO + ", exemplars=" + this.f32725OooO0Oo + ", value=" + this.f32726OooO0o0 + "}";
    }
}
