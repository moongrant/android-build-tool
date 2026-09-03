package io.opentelemetry.api.metrics.internal;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.BoundDoubleCounter;
import io.opentelemetry.api.metrics.BoundDoubleHistogram;
import io.opentelemetry.api.metrics.BoundDoubleUpDownCounter;
import io.opentelemetry.api.metrics.BoundLongCounter;
import io.opentelemetry.api.metrics.BoundLongHistogram;
import io.opentelemetry.api.metrics.BoundLongUpDownCounter;
import io.opentelemetry.api.metrics.DoubleCounter;
import io.opentelemetry.api.metrics.DoubleCounterBuilder;
import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.DoubleUpDownCounter;
import io.opentelemetry.api.metrics.DoubleUpDownCounterBuilder;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.LongGaugeBuilder;
import io.opentelemetry.api.metrics.LongHistogram;
import io.opentelemetry.api.metrics.LongHistogramBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.Meter;
import javax.annotation.concurrent.ThreadSafe;
import p241o00oo000.OooOo;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public class NoopMeter implements Meter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final NoopMeter f32523OooO00o = new NoopMeter();

    public static class NoopBoundDoubleCounter implements BoundDoubleCounter {
        private NoopBoundDoubleCounter() {
        }
    }

    public static class NoopBoundDoubleHistogram implements BoundDoubleHistogram {
    }

    public static class NoopBoundDoubleUpDownCounter implements BoundDoubleUpDownCounter {
        private NoopBoundDoubleUpDownCounter() {
        }
    }

    public static class NoopBoundLongCounter implements BoundLongCounter {
        private NoopBoundLongCounter() {
        }
    }

    public static class NoopBoundLongHistogram implements BoundLongHistogram {
    }

    public static class NoopBoundLongUpDownCounter implements BoundLongUpDownCounter {
        private NoopBoundLongUpDownCounter() {
        }
    }

    public static class NoopDoubleCounter implements DoubleCounter {
        private NoopDoubleCounter() {
        }
    }

    public static class NoopDoubleCounterBuilder implements DoubleCounterBuilder {
        private NoopDoubleCounterBuilder() {
        }
    }

    public static class NoopDoubleHistogram implements DoubleHistogram {
    }

    public static class NoopDoubleHistogramBuilder implements DoubleHistogramBuilder {
    }

    public static class NoopDoubleObservableInstrumentBuilder implements DoubleGaugeBuilder {
        @Override // io.opentelemetry.api.metrics.DoubleGaugeBuilder
        public final LongGaugeBuilder OooO00o() {
            return new NoopLongObservableInstrumentBuilder();
        }

        @Override // io.opentelemetry.api.metrics.DoubleGaugeBuilder
        public final DoubleGaugeBuilder OooO0O0() {
            return this;
        }
    }

    public static class NoopDoubleUpDownCounter implements DoubleUpDownCounter {
        private NoopDoubleUpDownCounter() {
        }
    }

    public static class NoopDoubleUpDownCounterBuilder implements DoubleUpDownCounterBuilder {
        private NoopDoubleUpDownCounterBuilder() {
        }
    }

    public static class NoopLongCounter implements LongCounter {
        private NoopLongCounter() {
        }

        public /* synthetic */ NoopLongCounter(int i) {
            this();
        }

        @Override // io.opentelemetry.api.metrics.LongCounter
        public final void OooO00o(Attributes attributes) {
        }
    }

    public static class NoopLongCounterBuilder implements LongCounterBuilder {
        private NoopLongCounterBuilder() {
        }

        public /* synthetic */ NoopLongCounterBuilder(int i) {
            this();
        }

        @Override // io.opentelemetry.api.metrics.LongCounterBuilder
        public final LongCounter build() {
            return new NoopLongCounter(0);
        }
    }

    public static class NoopLongHistogram implements LongHistogram {
    }

    public static class NoopLongHistogramBuilder implements LongHistogramBuilder {
    }

    public static class NoopLongObservableInstrumentBuilder implements LongGaugeBuilder {
        @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
        public final LongGaugeBuilder OooO0OO() {
            return this;
        }

        @Override // io.opentelemetry.api.metrics.LongGaugeBuilder
        public final void OooO0Oo(OooOo oooOo) {
        }
    }

    public static class NoopLongUpDownCounter implements LongUpDownCounter {
        private NoopLongUpDownCounter() {
        }
    }

    public static class NoopLongUpDownCounterBuilder implements LongUpDownCounterBuilder {
        private NoopLongUpDownCounterBuilder() {
        }
    }

    private NoopMeter() {
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public final LongCounterBuilder OooO00o() {
        return new NoopLongCounterBuilder(0);
    }

    @Override // io.opentelemetry.api.metrics.Meter
    public final DoubleGaugeBuilder OooO0O0() {
        return new NoopDoubleObservableInstrumentBuilder();
    }
}
