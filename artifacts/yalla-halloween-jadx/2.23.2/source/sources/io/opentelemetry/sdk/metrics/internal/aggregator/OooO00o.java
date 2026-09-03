package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o {
    public static AggregatorFactory OooO00o() {
        return LastValueAggregatorFactory.f32815OooO00o;
    }

    public static AggregatorFactory OooO0O0(AggregationTemporality aggregationTemporality) {
        return new SumAggregatorFactory(aggregationTemporality);
    }
}
