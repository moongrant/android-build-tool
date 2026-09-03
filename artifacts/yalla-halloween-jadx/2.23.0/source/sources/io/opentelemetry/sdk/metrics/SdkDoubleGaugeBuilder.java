package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.LongGaugeBuilder;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MeterSharedState;

/* JADX INFO: loaded from: classes5.dex */
final class SdkDoubleGaugeBuilder extends AbstractInstrumentBuilder<SdkDoubleGaugeBuilder> implements DoubleGaugeBuilder {
    public SdkDoubleGaugeBuilder(MeterProviderSharedState meterProviderSharedState, MeterSharedState meterSharedState, String str) {
        super(meterProviderSharedState, meterSharedState, str, "", "1");
    }

    @Override // io.opentelemetry.api.metrics.DoubleGaugeBuilder
    public final DoubleGaugeBuilder OooO00o() {
        this.f33220OooO0Oo = "This is the app startup time statistics";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.DoubleGaugeBuilder
    public final LongGaugeBuilder OooO0O0() {
        return new SdkLongGaugeBuilder(this.f33217OooO00o, this.f33218OooO0O0, this.f33219OooO0OO, this.f33220OooO0Oo, this.f33221OooO0o0);
    }
}
