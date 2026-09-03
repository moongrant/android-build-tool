package io.opentelemetry.sdk.metrics.data;

import android.support.v4.media.session.OooO0o;
import io.opentelemetry.api.common.Attributes;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_LongPointData extends LongPointData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f33273OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33274OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Attributes f33275OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Exemplar> f33276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f33277OooO0o0;

    public AutoValue_LongPointData(long j, long j2, long j3, Attributes attributes, List list) {
        this.f33273OooO00o = j;
        this.f33274OooO0O0 = j2;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33275OooO0OO = attributes;
        if (list == null) {
            throw new NullPointerException("Null exemplars");
        }
        this.f33276OooO0Oo = list;
        this.f33277OooO0o0 = j3;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final Attributes OooO00o() {
        return this.f33275OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0O0() {
        return this.f33274OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final long OooO0OO() {
        return this.f33273OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public final List<Exemplar> OooO0Oo() {
        return this.f33276OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.data.LongPointData
    public final long OooO0o() {
        return this.f33277OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongPointData)) {
            return false;
        }
        LongPointData longPointData = (LongPointData) obj;
        if (this.f33273OooO00o == ((AutoValue_LongPointData) longPointData).f33273OooO00o) {
            AutoValue_LongPointData autoValue_LongPointData = (AutoValue_LongPointData) longPointData;
            if (this.f33274OooO0O0 == autoValue_LongPointData.f33274OooO0O0 && this.f33275OooO0OO.equals(autoValue_LongPointData.f33275OooO0OO) && this.f33276OooO0Oo.equals(autoValue_LongPointData.f33276OooO0Oo) && this.f33277OooO0o0 == longPointData.OooO0o()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33273OooO00o;
        long j2 = this.f33274OooO0O0;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f33275OooO0OO.hashCode()) * 1000003) ^ this.f33276OooO0Oo.hashCode()) * 1000003;
        long j3 = this.f33277OooO0o0;
        return iHashCode ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongPointData{startEpochNanos=");
        sb.append(this.f33273OooO00o);
        sb.append(", epochNanos=");
        sb.append(this.f33274OooO0O0);
        sb.append(", attributes=");
        sb.append(this.f33275OooO0OO);
        sb.append(", exemplars=");
        sb.append(this.f33276OooO0Oo);
        sb.append(", value=");
        return OooO0o.OooO0O0(sb, this.f33277OooO0o0, "}");
    }
}
