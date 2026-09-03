package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.LongGaugeBuilder;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MeterSharedState;

/* JADX INFO: loaded from: classes5.dex */
final class SdkDoubleGaugeBuilder extends AbstractInstrumentBuilder<SdkDoubleGaugeBuilder> implements DoubleGaugeBuilder {
    public SdkDoubleGaugeBuilder(MeterProviderSharedState meterProviderSharedState, MeterSharedState meterSharedState) {
        super(meterProviderSharedState, meterSharedState, "launch_duration", "", "1");
    }

    @Override // io.opentelemetry.api.metrics.DoubleGaugeBuilder
    public final LongGaugeBuilder OooO00o() {
        return new SdkLongGaugeBuilder(this.f32685OooO00o, this.f32686OooO0O0, this.f32687OooO0OO, this.f32688OooO0Oo, this.f32689OooO0o0);
    }

    @Override // io.opentelemetry.api.metrics.DoubleGaugeBuilder
    public final DoubleGaugeBuilder OooO0O0() {
        this.f32688OooO0Oo = "This is the app startup time statistics";
        return this;
    }
}
