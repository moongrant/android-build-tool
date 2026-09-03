package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.BoundLongHistogram;
import io.opentelemetry.api.metrics.LongHistogram;
import io.opentelemetry.api.metrics.LongHistogramBuilder;

/* JADX INFO: loaded from: classes5.dex */
final class SdkLongHistogram extends AbstractInstrument implements LongHistogram {

    public static final class BoundInstrument implements BoundLongHistogram {
    }

    public static final class Builder extends AbstractInstrumentBuilder<Builder> implements LongHistogramBuilder {
    }
}
