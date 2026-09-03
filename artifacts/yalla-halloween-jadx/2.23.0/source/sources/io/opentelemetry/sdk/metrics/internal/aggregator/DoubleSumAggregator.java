package io.opentelemetry.sdk.metrics.internal.aggregator;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.AtomicDouble;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleSumData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Map;
import java.util.concurrent.atomic.DoubleAdder;

/* JADX INFO: loaded from: classes5.dex */
final class DoubleSumAggregator extends AbstractSumAggregator<Double> {

    public static final class CompatHandle extends AggregatorHandle<Double> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicDouble f33345OooO0OO = new AtomicDouble();

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Double OooO00o() {
            AtomicDouble atomicDouble = this.f33345OooO0OO;
            atomicDouble.getClass();
            return Double.valueOf(Double.longBitsToDouble(atomicDouble.f19785OooO0Oo.getAndSet(Double.doubleToRawLongBits(0.0d))));
        }
    }

    @RequiresApi(api = 24)
    public static final class Handle extends AggregatorHandle<Double> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final DoubleAdder f33346OooO0OO = OooO.OooO00o();

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final Double OooO00o() {
            return Double.valueOf(this.f33346OooO0OO.sumThenReset());
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<Double> OooO0OO() {
        return Build.VERSION.SDK_INT >= 24 ? new Handle() : new CompatHandle();
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, Double> map, long j, long j2, long j3) {
        Resource resource = this.f33315OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f33316OooO0O0;
        MetricDescriptor metricDescriptor = this.f33317OooO0OO;
        String strOooO0OO = metricDescriptor.OooO0OO();
        String strOooO0O0 = metricDescriptor.OooO0O0();
        String strOooO0Oo = metricDescriptor.OooO0Oo();
        AggregationTemporality aggregationTemporality = AggregationTemporality.CUMULATIVE;
        AggregationTemporality aggregationTemporality2 = this.f33319OooO0o;
        if (aggregationTemporality2 != aggregationTemporality) {
            j = j2;
        }
        return MetricData.OooO0OO(resource, instrumentationLibraryInfo, strOooO0OO, strOooO0O0, strOooO0Oo, DoubleSumData.OooO0Oo(aggregationTemporality2, MetricDataUtils.OooO00o(map, j, j3), this.f33320OooO0o0));
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractSumAggregator
    public final Double OooO0o(Double d, Double d2) {
        return Double.valueOf(d2.doubleValue() - d.doubleValue());
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractSumAggregator
    public final Double OooO0oO(Double d, Double d2) {
        return Double.valueOf(d2.doubleValue() + d.doubleValue());
    }
}
