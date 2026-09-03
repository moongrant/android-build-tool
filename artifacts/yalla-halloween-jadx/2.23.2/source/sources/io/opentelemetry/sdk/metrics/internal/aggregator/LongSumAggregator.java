package io.opentelemetry.sdk.metrics.internal.aggregator;

import android.os.Build;
import androidx.annotation.RequiresApi;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.LongSumData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: loaded from: classes5.dex */
final class LongSumAggregator extends AbstractSumAggregator<Long> {

    public static final class CompatHandle extends AggregatorHandle<Long> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicLong f32824OooO0OO = new AtomicLong();

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Long OooO0O0() {
            return Long.valueOf(this.f32824OooO0OO.get());
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO() {
            this.f32824OooO0OO.getAndAdd(1L);
        }
    }

    @RequiresApi(api = 24)
    public static final class Handle extends AggregatorHandle<Long> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final LongAdder f32825OooO0OO = OooO0O0.OooO00o();

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Long OooO0O0() {
            return Long.valueOf(this.f32825OooO0OO.sumThenReset());
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO() {
            this.f32825OooO0OO.add(1L);
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractAggregator, io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO00o(long j) {
        return Long.valueOf(j);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<Long> OooO0OO() {
        return Build.VERSION.SDK_INT >= 24 ? new Handle() : new CompatHandle();
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, Long> map, long j, long j2, long j3) {
        Resource resource = this.f32781OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f32782OooO0O0;
        MetricDescriptor metricDescriptor = this.f32783OooO0OO;
        String strOooO0OO = metricDescriptor.OooO0OO();
        String strOooO0O0 = metricDescriptor.OooO0O0();
        String strOooO0Oo = metricDescriptor.OooO0Oo();
        AggregationTemporality aggregationTemporality = AggregationTemporality.CUMULATIVE;
        AggregationTemporality aggregationTemporality2 = this.f32785OooO0o;
        if (aggregationTemporality2 != aggregationTemporality) {
            j = j2;
        }
        return MetricData.OooO0o(resource, instrumentationLibraryInfo, strOooO0OO, strOooO0O0, strOooO0Oo, LongSumData.OooO0Oo(aggregationTemporality2, MetricDataUtils.OooO0O0(map, j, j3), this.f32786OooO0o0));
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractSumAggregator
    public final Long OooO0o(Long l, Long l2) {
        return Long.valueOf(l2.longValue() - l.longValue());
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractSumAggregator
    public final Long OooO0oO(Long l, Long l2) {
        return Long.valueOf(l2.longValue() + l.longValue());
    }
}
