package io.opentelemetry.sdk.metrics.view;

import io.opentelemetry.compat.Function;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.internal.aggregator.HistogramAggregatorFactory;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0OO implements Function {
    @Override // io.opentelemetry.compat.Function
    public final Object apply(Object obj) {
        InstrumentDescriptor instrumentDescriptor = (InstrumentDescriptor) obj;
        ThrottlingLogger throttlingLogger = Aggregation.f32872OooO00o;
        switch (Aggregation.AnonymousClass2.f32877OooO00o[instrumentDescriptor.OooO0Oo().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return io.opentelemetry.sdk.metrics.internal.aggregator.OooO00o.OooO0O0(AggregationTemporality.CUMULATIVE);
            case 5:
                return new HistogramAggregatorFactory(AggregationTemporality.CUMULATIVE, Aggregation.f32873OooO0O0);
            case 6:
                return io.opentelemetry.sdk.metrics.internal.aggregator.OooO00o.OooO00o();
            default:
                Aggregation.f32872OooO00o.OooO00o(Level.WARNING, "Unable to find default aggregation for instrument: " + instrumentDescriptor);
                return null;
        }
    }
}
