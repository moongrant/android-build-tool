package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MeterSharedState;

/* JADX INFO: loaded from: classes5.dex */
final class SdkMeter implements Meter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MeterProviderSharedState f32692OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MeterSharedState f32693OooO0O0;

    public SdkMeter(MeterProviderSharedState meterProviderSharedState, InstrumentationLibraryInfo instrumentationLibraryInfo) {
        this.f32692OooO00o = meterProviderSharedState;
        this.f32693OooO0O0 = MeterSharedState.OooO00o(instrumentationLibraryInfo);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public final LongCounterBuilder OooO00o() {
        return new SdkLongCounter.Builder(this.f32692OooO00o, this.f32693OooO0O0);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public final DoubleGaugeBuilder OooO0O0() {
        return new SdkDoubleGaugeBuilder(this.f32692OooO00o, this.f32693OooO0O0);
    }
}
