package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.LongGaugeBuilder;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.common.InstrumentValueType;
import p241o00oo000.OooOo;

/* JADX INFO: loaded from: classes5.dex */
final class SdkLongGaugeBuilder extends AbstractInstrumentBuilder<SdkLongGaugeBuilder> implements LongGaugeBuilder {
    @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
    public final LongGaugeBuilder OooO0OO() {
        this.f32689OooO0o0 = "MS";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
    public final void OooO0Oo(OooOo oooOo) {
        InstrumentType instrumentType = InstrumentType.OBSERVABLE_GAUGE;
        InstrumentValueType instrumentValueType = InstrumentValueType.LONG;
        this.f32686OooO0O0.OooO0Oo(InstrumentDescriptor.OooO00o(this.f32687OooO0OO, this.f32688OooO0Oo, this.f32689OooO0o0, instrumentType, instrumentValueType), this.f32685OooO00o, oooOo);
    }
}
