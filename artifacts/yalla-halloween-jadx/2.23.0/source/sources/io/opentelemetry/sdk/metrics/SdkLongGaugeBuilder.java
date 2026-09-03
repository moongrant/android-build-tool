package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.LongGaugeBuilder;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.compat.Consumer;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.common.InstrumentValueType;

/* JADX INFO: loaded from: classes5.dex */
final class SdkLongGaugeBuilder extends AbstractInstrumentBuilder<SdkLongGaugeBuilder> implements LongGaugeBuilder {
    @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
    public final LongGaugeBuilder OooO00o() {
        this.f33220OooO0Oo = "The number of spans queued";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
    public final LongGaugeBuilder OooO0Oo(String str) {
        this.f33221OooO0o0 = str;
        return this;
    }

    @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
    public final void OooO0o0(Consumer<ObservableLongMeasurement> consumer) {
        InstrumentType instrumentType = InstrumentType.OBSERVABLE_GAUGE;
        InstrumentValueType instrumentValueType = InstrumentValueType.LONG;
        this.f33218OooO0O0.OooO0Oo(InstrumentDescriptor.OooO00o(this.f33219OooO0OO, this.f33220OooO0Oo, this.f33221OooO0o0, instrumentType, instrumentValueType), this.f33217OooO00o, consumer);
    }
}
