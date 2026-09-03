package io.opentelemetry.sdk.metrics.data;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoubleSumData extends DoubleSumData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Collection<DoublePointData> f32727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f32728OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AggregationTemporality f32729OooO0OO;

    public AutoValue_DoubleSumData(AggregationTemporality aggregationTemporality, List list, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null points");
        }
        this.f32727OooO00o = list;
        this.f32728OooO0O0 = z;
        if (aggregationTemporality == null) {
            throw new NullPointerException("Null aggregationTemporality");
        }
        this.f32729OooO0OO = aggregationTemporality;
    }

    @Override // io.opentelemetry.sdk.metrics.data.Data
    public final Collection<DoublePointData> OooO00o() {
        return this.f32727OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.SumData
    public final AggregationTemporality OooO0O0() {
        return this.f32729OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.SumData
    public final boolean OooO0OO() {
        return this.f32728OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleSumData)) {
            return false;
        }
        DoubleSumData doubleSumData = (DoubleSumData) obj;
        if (this.f32727OooO00o.equals(((AutoValue_DoubleSumData) doubleSumData).f32727OooO00o)) {
            AutoValue_DoubleSumData autoValue_DoubleSumData = (AutoValue_DoubleSumData) doubleSumData;
            if (this.f32728OooO0O0 == autoValue_DoubleSumData.f32728OooO0O0 && this.f32729OooO0OO.equals(autoValue_DoubleSumData.f32729OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f32727OooO00o.hashCode() ^ 1000003) * 1000003) ^ (this.f32728OooO0O0 ? 1231 : 1237)) * 1000003) ^ this.f32729OooO0OO.hashCode();
    }

    public final String toString() {
        return "DoubleSumData{points=" + this.f32727OooO00o + ", monotonic=" + this.f32728OooO0O0 + ", aggregationTemporality=" + this.f32729OooO0OO + "}";
    }
}
