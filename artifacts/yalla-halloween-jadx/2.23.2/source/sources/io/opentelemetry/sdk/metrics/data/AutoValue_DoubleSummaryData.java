package io.opentelemetry.sdk.metrics.data;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DoubleSummaryData extends DoubleSummaryData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Collection<DoubleSummaryPointData> f32730OooO00o;

    public AutoValue_DoubleSummaryData(List list) {
        if (list == null) {
            throw new NullPointerException("Null points");
        }
        this.f32730OooO00o = list;
    }

    @Override // io.opentelemetry.sdk.metrics.data.Data
    public final Collection<DoubleSummaryPointData> OooO00o() {
        return this.f32730OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DoubleSummaryData) {
            return this.f32730OooO00o.equals(((DoubleSummaryData) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f32730OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DoubleSummaryData{points=" + this.f32730OooO00o + "}";
    }
}
