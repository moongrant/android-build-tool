package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.BoundDoubleHistogram;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.DoubleHistogramBuilder;

/* JADX INFO: loaded from: classes5.dex */
final class SdkDoubleHistogram extends AbstractInstrument implements DoubleHistogram {

    public static final class BoundInstrument implements BoundDoubleHistogram {
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements DoubleHistogramBuilder {
    }
}
