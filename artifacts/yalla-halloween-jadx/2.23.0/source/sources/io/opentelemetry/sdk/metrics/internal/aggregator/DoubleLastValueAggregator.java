package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.data.DoubleGaugeData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class DoubleLastValueAggregator extends AbstractAggregator<Double> {

    public static final class Handle extends AggregatorHandle<Double> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReference<Double> f33340OooO0OO;

        public /* synthetic */ Handle(int i) {
            this();
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Double OooO00o() {
            return this.f33340OooO0OO.getAndSet(null);
        }

        private Handle() {
            this.f33340OooO0OO = new AtomicReference<>(null);
        }
    }

    public DoubleLastValueAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, MetricDescriptor metricDescriptor) {
        super(resource, instrumentationLibraryInfo, metricDescriptor, true);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO0O0(Object obj, Object obj2) {
        return (Double) obj2;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<Double> OooO0OO() {
        return new Handle(0);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, Double> map, long j, long j2, long j3) {
        Resource resource = this.f33315OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f33316OooO0O0;
        MetricDescriptor metricDescriptor = this.f33317OooO0OO;
        return MetricData.OooO00o(resource, instrumentationLibraryInfo, metricDescriptor.OooO0OO(), metricDescriptor.OooO0O0(), metricDescriptor.OooO0Oo(), DoubleGaugeData.OooO0Oo(MetricDataUtils.OooO00o(map, 0L, j3)));
    }
}
