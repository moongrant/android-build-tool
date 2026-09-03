package io.opentelemetry.sdk.metrics.data;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoubleGaugeData extends DoubleGaugeData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Collection<DoublePointData> f32711OooO00o;

    public AutoValue_DoubleGaugeData(List list) {
        if (list == null) {
            throw new NullPointerException("Null points");
        }
        this.f32711OooO00o = list;
    }

    @Override // io.opentelemetry.sdk.metrics.data.Data
    public final Collection<DoublePointData> OooO00o() {
        return this.f32711OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleGaugeData)) {
            return false;
        }
        return this.f32711OooO00o.equals(((AutoValue_DoubleGaugeData) ((DoubleGaugeData) obj)).f32711OooO00o);
    }

    public final int hashCode() {
        return this.f32711OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DoubleGaugeData{points=" + this.f32711OooO00o + "}";
    }
}
