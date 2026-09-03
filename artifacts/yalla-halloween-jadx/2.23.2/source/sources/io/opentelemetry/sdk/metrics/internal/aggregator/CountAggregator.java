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
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class CountAggregator extends AbstractAggregator<Long> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AggregationTemporality f32797OooO0o0;

    public static final class CompatHandle extends AggregatorHandle<Long> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicLong f32798OooO0OO;

        public /* synthetic */ CompatHandle(int i) {
            this();
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Long OooO0O0() {
            return Long.valueOf(this.f32798OooO0OO.getAndSet(0L));
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO() {
            this.f32798OooO0OO.getAndAdd(1L);
        }

        private CompatHandle() {
            this.f32798OooO0OO = new AtomicLong();
        }
    }

    @RequiresApi(api = 24)
    public static final class Handle extends AggregatorHandle<Long> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final LongAdder f32799OooO0OO;

        public /* synthetic */ Handle(int i) {
            this();
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Long OooO0O0() {
            return Long.valueOf(this.f32799OooO0OO.sumThenReset());
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO() {
            this.f32799OooO0OO.add(1L);
        }

        private Handle() {
            this.f32799OooO0OO = OooO0O0.OooO00o();
        }
    }

    public CountAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, MetricDescriptor metricDescriptor) {
        super(resource, instrumentationLibraryInfo, metricDescriptor, AggregationTemporality.CUMULATIVE == null);
        this.f32797OooO0o0 = null;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractAggregator, io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO00o(long j) {
        return 1L;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO0O0(Object obj, Object obj2) {
        return Long.valueOf(((Long) obj2).longValue() + ((Long) obj).longValue());
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<Long> OooO0OO() {
        int i = 0;
        return Build.VERSION.SDK_INT >= 24 ? new Handle(i) : new CompatHandle(i);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, Long> map, long j, long j2, long j3) {
        Resource resource = this.f32781OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f32782OooO0O0;
        MetricDescriptor metricDescriptor = this.f32783OooO0OO;
        String strOooO0OO = metricDescriptor.OooO0OO();
        String strOooO0O0 = metricDescriptor.OooO0O0();
        AggregationTemporality aggregationTemporality = AggregationTemporality.CUMULATIVE;
        AggregationTemporality aggregationTemporality2 = this.f32797OooO0o0;
        if (aggregationTemporality2 != aggregationTemporality) {
            j = j2;
        }
        return MetricData.OooO0o(resource, instrumentationLibraryInfo, strOooO0OO, strOooO0O0, "1", LongSumData.OooO0Oo(aggregationTemporality2, MetricDataUtils.OooO0O0(map, j, j3), true));
    }
}
