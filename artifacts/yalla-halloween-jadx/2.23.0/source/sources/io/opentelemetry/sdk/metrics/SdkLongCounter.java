package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.BoundLongCounter;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.OooO0O0;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.common.InstrumentValueType;
import io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MeterSharedState;
import io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage;

/* JADX INFO: loaded from: classes5.dex */
final class SdkLongCounter extends AbstractInstrument implements LongCounter {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WriteableMetricStorage f33223OooO0O0;

    public static final class BoundInstrument implements BoundLongCounter {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final BoundStorageHandle f33224OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Attributes f33225OooO0O0;

        public BoundInstrument(BoundStorageHandle boundStorageHandle, Attributes attributes) {
            this.f33224OooO00o = boundStorageHandle;
            this.f33225OooO0O0 = attributes;
        }

        @Override // io.opentelemetry.api.metrics.BoundLongCounter
        public final void OooO00o(long j) {
            Context contextOooO00o = OooO0O0.OooO00o();
            if (j < 0) {
                throw new IllegalArgumentException("Counters can only increase");
            }
            this.f33224OooO00o.OooO0O0(j, this.f33225OooO0O0, contextOooO00o);
        }
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements LongCounterBuilder {
        public Builder(MeterProviderSharedState meterProviderSharedState, MeterSharedState meterSharedState, String str) {
            super(meterProviderSharedState, meterSharedState, str, "", "1");
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public final LongCounterBuilder OooO00o() {
            this.f33220OooO0Oo = "The number of spans processed by the BatchSpanProcessor. [dropped=true if they were dropped due to high throughput]";
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public final LongCounterBuilder OooO0OO() {
            this.f33221OooO0o0 = "1";
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public final LongCounter build() {
            InstrumentType instrumentType = InstrumentType.COUNTER;
            InstrumentValueType instrumentValueType = InstrumentValueType.LONG;
            InstrumentDescriptor instrumentDescriptorOooO00o = InstrumentDescriptor.OooO00o(this.f33219OooO0OO, this.f33220OooO0Oo, this.f33221OooO0o0, instrumentType, instrumentValueType);
            return new SdkLongCounter(instrumentDescriptorOooO00o, this.f33218OooO0O0.OooO0o0(instrumentDescriptorOooO00o, this.f33217OooO00o));
        }
    }

    public SdkLongCounter(InstrumentDescriptor instrumentDescriptor, WriteableMetricStorage writeableMetricStorage) {
        super(instrumentDescriptor);
        this.f33223OooO0O0 = writeableMetricStorage;
    }

    @Override // io.opentelemetry.api.metrics.LongCounter
    public final BoundLongCounter OooO00o(Attributes attributes) {
        return new BoundInstrument(this.f33223OooO0O0.OooO00o(attributes), attributes);
    }

    @Override // io.opentelemetry.api.metrics.LongCounter
    public final void OooO0O0(Attributes attributes) {
        this.f33223OooO0O0.OooO0O0(1L, attributes, OooO0O0.OooO00o());
    }
}
