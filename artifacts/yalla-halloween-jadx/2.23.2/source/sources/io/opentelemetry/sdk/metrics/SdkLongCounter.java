package io.opentelemetry.sdk.metrics;

import com.common.support.apm.otlp.biz.BlockMetric;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.BoundLongCounter;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.context.OooO0O0;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.common.InstrumentValueType;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MeterSharedState;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;

/* JADX INFO: loaded from: classes5.dex */
final class SdkLongCounter extends AbstractInstrument implements LongCounter {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WriteableMetricStorage f32691OooO0O0;

    public static final class BoundInstrument implements BoundLongCounter {
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements LongCounterBuilder {
        public Builder(MeterProviderSharedState meterProviderSharedState, MeterSharedState meterSharedState) {
            super(meterProviderSharedState, meterSharedState, BlockMetric.METER_NAME_BLOCK, "", "1");
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public final LongCounter build() {
            InstrumentType instrumentType = InstrumentType.COUNTER;
            InstrumentValueType instrumentValueType = InstrumentValueType.LONG;
            InstrumentDescriptor instrumentDescriptorOooO00o = InstrumentDescriptor.OooO00o(this.f32687OooO0OO, this.f32688OooO0Oo, this.f32689OooO0o0, instrumentType, instrumentValueType);
            return new SdkLongCounter(instrumentDescriptorOooO00o, this.f32686OooO0O0.OooO0o0(instrumentDescriptorOooO00o, this.f32685OooO00o));
        }
    }

    public SdkLongCounter(InstrumentDescriptor instrumentDescriptor, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor);
        this.f32691OooO0O0 = writeableMetricStorage;
    }

    @Override // io.opentelemetry.api.metrics.LongCounter
    public final void OooO00o(Attributes attributes) {
        this.f32691OooO0O0.OooO00o(attributes, OooO0O0.OooO00o());
    }
}
