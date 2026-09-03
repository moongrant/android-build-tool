package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.BoundDoubleUpDownCounter;
import io.opentelemetry.api.metrics.DoubleUpDownCounter;
import io.opentelemetry.api.metrics.DoubleUpDownCounterBuilder;

/* JADX INFO: loaded from: classes5.dex */
final class SdkDoubleUpDownCounter extends AbstractInstrument implements DoubleUpDownCounter {

    public static final class BoundInstrument implements BoundDoubleUpDownCounter {
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements DoubleUpDownCounterBuilder {
    }
}
