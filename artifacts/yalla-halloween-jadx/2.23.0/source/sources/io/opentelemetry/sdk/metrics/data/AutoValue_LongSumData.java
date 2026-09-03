package io.opentelemetry.sdk.metrics.data;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_LongSumData extends LongSumData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Collection<LongPointData> f33278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f33279OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AggregationTemporality f33280OooO0OO;

    public AutoValue_LongSumData(AggregationTemporality aggregationTemporality, List list, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null points");
        }
        this.f33278OooO00o = list;
        this.f33279OooO0O0 = z;
        if (aggregationTemporality == null) {
            throw new NullPointerException("Null aggregationTemporality");
        }
        this.f33280OooO0OO = aggregationTemporality;
    }

    @Override // io.opentelemetry.sdk.metrics.data.Data
    public final Collection<LongPointData> OooO00o() {
        return this.f33278OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.SumData
    public final AggregationTemporality OooO0O0() {
        return this.f33280OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.SumData
    public final boolean OooO0OO() {
        return this.f33279OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongSumData)) {
            return false;
        }
        LongSumData longSumData = (LongSumData) obj;
        if (this.f33278OooO00o.equals(((AutoValue_LongSumData) longSumData).f33278OooO00o)) {
            AutoValue_LongSumData autoValue_LongSumData = (AutoValue_LongSumData) longSumData;
            if (this.f33279OooO0O0 == autoValue_LongSumData.f33279OooO0O0 && this.f33280OooO0OO.equals(autoValue_LongSumData.f33280OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f33278OooO00o.hashCode() ^ 1000003) * 1000003) ^ (this.f33279OooO0O0 ? 1231 : 1237)) * 1000003) ^ this.f33280OooO0OO.hashCode();
    }

    public final String toString() {
        return "LongSumData{points=" + this.f33278OooO00o + ", monotonic=" + this.f33279OooO0O0 + ", aggregationTemporality=" + this.f33280OooO0OO + "}";
    }
}
