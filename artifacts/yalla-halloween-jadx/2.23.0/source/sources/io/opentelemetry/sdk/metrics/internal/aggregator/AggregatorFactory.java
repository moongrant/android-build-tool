package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface AggregatorFactory {
    <T> Aggregator<T> OooO00o(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, InstrumentDescriptor instrumentDescriptor, MetricDescriptor metricDescriptor);
}
