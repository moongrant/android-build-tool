package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.BoundDoubleCounter;
import io.opentelemetry.api.metrics.DoubleCounter;
import io.opentelemetry.api.metrics.DoubleCounterBuilder;

/* JADX INFO: loaded from: classes5.dex */
final class SdkDoubleCounter extends AbstractInstrument implements DoubleCounter {

    public static final class BoundInstrument implements BoundDoubleCounter {
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements DoubleCounterBuilder {
    }
}
