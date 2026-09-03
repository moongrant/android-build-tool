package io.opentelemetry.sdk.metrics.data;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_LongGaugeData extends LongGaugeData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Collection<LongPointData> f32738OooO00o;

    public AutoValue_LongGaugeData(List list) {
        if (list == null) {
            throw new NullPointerException("Null points");
        }
        this.f32738OooO00o = list;
    }

    @Override // io.opentelemetry.sdk.metrics.data.Data
    public final Collection<LongPointData> OooO00o() {
        return this.f32738OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongGaugeData)) {
            return false;
        }
        return this.f32738OooO00o.equals(((AutoValue_LongGaugeData) ((LongGaugeData) obj)).f32738OooO00o);
    }

    public final int hashCode() {
        return this.f32738OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LongGaugeData{points=" + this.f32738OooO00o + "}";
    }
}
