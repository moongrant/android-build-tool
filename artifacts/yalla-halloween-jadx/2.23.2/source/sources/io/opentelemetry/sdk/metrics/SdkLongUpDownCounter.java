package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.BoundLongUpDownCounter;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;

/* JADX INFO: loaded from: classes5.dex */
final class SdkLongUpDownCounter extends AbstractInstrument implements LongUpDownCounter {

    public static final class BoundInstrument implements BoundLongUpDownCounter {
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements LongUpDownCounterBuilder {
    }
}
