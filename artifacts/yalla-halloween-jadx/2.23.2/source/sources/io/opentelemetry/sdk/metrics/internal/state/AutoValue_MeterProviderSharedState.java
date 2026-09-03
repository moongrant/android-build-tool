package io.opentelemetry.sdk.metrics.internal.state;

import android.support.v4.media.session.OooO0OO;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistry;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MeterProviderSharedState extends MeterProviderSharedState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Clock f32841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resource f32842OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ViewRegistry f32843OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f32844OooO0Oo;

    public AutoValue_MeterProviderSharedState(Clock clock, Resource resource, ViewRegistry viewRegistry, long j) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.f32841OooO00o = clock;
        if (resource == null) {
            throw new NullPointerException("Null resource");
        }
        this.f32842OooO0O0 = resource;
        this.f32843OooO0OO = viewRegistry;
        this.f32844OooO0Oo = j;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState
    public final Clock OooO0O0() {
        return this.f32841OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState
    public final Resource OooO0OO() {
        return this.f32842OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState
    public final long OooO0Oo() {
        return this.f32844OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState
    public final ViewRegistry OooO0o0() {
        return this.f32843OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeterProviderSharedState)) {
            return false;
        }
        MeterProviderSharedState meterProviderSharedState = (MeterProviderSharedState) obj;
        return this.f32841OooO00o.equals(meterProviderSharedState.OooO0O0()) && this.f32842OooO0O0.equals(meterProviderSharedState.OooO0OO()) && this.f32843OooO0OO.equals(meterProviderSharedState.OooO0o0()) && this.f32844OooO0Oo == meterProviderSharedState.OooO0Oo();
    }

    public final int hashCode() {
        int iHashCode = (((((this.f32841OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f32842OooO0O0.hashCode()) * 1000003) ^ this.f32843OooO0OO.hashCode()) * 1000003;
        long j = this.f32844OooO0Oo;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeterProviderSharedState{clock=");
        sb.append(this.f32841OooO00o);
        sb.append(", resource=");
        sb.append(this.f32842OooO0O0);
        sb.append(", viewRegistry=");
        sb.append(this.f32843OooO0OO);
        sb.append(", startEpochNanos=");
        return OooO0OO.OooO0O0(sb, this.f32844OooO0Oo, "}");
    }
}
