package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
final class CountAggregatorFactory implements AggregatorFactory {
    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public final <T> Aggregator<T> OooO00o(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, InstrumentDescriptor instrumentDescriptor, MetricDescriptor metricDescriptor) {
        return new CountAggregator(resource, instrumentationLibraryInfo, metricDescriptor);
    }
}
