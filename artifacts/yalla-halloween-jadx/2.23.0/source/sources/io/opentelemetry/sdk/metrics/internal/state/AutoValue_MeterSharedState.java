package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MeterSharedState extends MeterSharedState {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InstrumentationLibraryInfo f33379OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MetricStorageRegistry f33380OooO0OO;

    public AutoValue_MeterSharedState(InstrumentationLibraryInfo instrumentationLibraryInfo, MetricStorageRegistry metricStorageRegistry) {
        if (instrumentationLibraryInfo == null) {
            throw new NullPointerException("Null instrumentationLibraryInfo");
        }
        this.f33379OooO0O0 = instrumentationLibraryInfo;
        this.f33380OooO0OO = metricStorageRegistry;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MeterSharedState
    public final InstrumentationLibraryInfo OooO0O0() {
        return this.f33379OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MeterSharedState
    public final MetricStorageRegistry OooO0OO() {
        return this.f33380OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeterSharedState)) {
            return false;
        }
        MeterSharedState meterSharedState = (MeterSharedState) obj;
        return this.f33379OooO0O0.equals(meterSharedState.OooO0O0()) && this.f33380OooO0OO.equals(meterSharedState.OooO0OO());
    }

    public final int hashCode() {
        return ((this.f33379OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f33380OooO0OO.hashCode();
    }

    public final String toString() {
        return "MeterSharedState{instrumentationLibraryInfo=" + this.f33379OooO0O0 + ", metricStorageRegistry=" + this.f33380OooO0OO + "}";
    }
}
