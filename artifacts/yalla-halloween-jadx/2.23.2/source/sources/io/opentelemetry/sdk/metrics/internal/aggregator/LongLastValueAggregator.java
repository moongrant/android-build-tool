package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.data.LongGaugeData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
final class LongLastValueAggregator extends AbstractAggregator<Long> {

    public static final class Handle extends AggregatorHandle<Long> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReference<Long> f32817OooO0OO = new AtomicReference<>(null);

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Long OooO0O0() {
            return this.f32817OooO0OO.getAndSet(null);
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO() {
            this.f32817OooO0OO.set(1L);
        }
    }

    public LongLastValueAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, MetricDescriptor metricDescriptor) {
        super(resource, instrumentationLibraryInfo, metricDescriptor, false);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractAggregator, io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO00o(long j) {
        return Long.valueOf(j);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO0O0(Object obj, Object obj2) {
        return (Long) obj2;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<Long> OooO0OO() {
        return new Handle();
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, Long> map, long j, long j2, long j3) {
        Resource resource = this.f32781OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f32782OooO0O0;
        MetricDescriptor metricDescriptor = this.f32783OooO0OO;
        return MetricData.OooO0o0(resource, instrumentationLibraryInfo, metricDescriptor.OooO0OO(), metricDescriptor.OooO0O0(), metricDescriptor.OooO0Oo(), LongGaugeData.OooO0Oo(MetricDataUtils.OooO0O0(map, 0L, j3)));
    }
}
