package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.data.DoubleSummaryData;
import io.opentelemetry.sdk.metrics.data.DoubleSummaryPointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.ValueAtPercentile;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractMinMaxSumCountAggregator extends AbstractAggregator<MinMaxSumCountAccumulation> {
    public AbstractMinMaxSumCountAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, MetricDescriptor metricDescriptor) {
        super(resource, instrumentationLibraryInfo, metricDescriptor, false);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO0O0(Object obj, Object obj2) {
        MinMaxSumCountAccumulation minMaxSumCountAccumulation = (MinMaxSumCountAccumulation) obj;
        MinMaxSumCountAccumulation minMaxSumCountAccumulation2 = (MinMaxSumCountAccumulation) obj2;
        return new AutoValue_MinMaxSumCountAccumulation(minMaxSumCountAccumulation.OooO00o() + minMaxSumCountAccumulation2.OooO00o(), minMaxSumCountAccumulation.OooO0Oo() + minMaxSumCountAccumulation2.OooO0Oo(), Math.min(minMaxSumCountAccumulation.OooO0OO(), minMaxSumCountAccumulation2.OooO0OO()), Math.max(minMaxSumCountAccumulation.OooO0O0(), minMaxSumCountAccumulation2.OooO0O0()));
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, MinMaxSumCountAccumulation> map, long j, long j2, long j3) {
        Resource resource = this.f32781OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f32782OooO0O0;
        MetricDescriptor metricDescriptor = this.f32783OooO0OO;
        String strOooO0OO = metricDescriptor.OooO0OO();
        String strOooO0O0 = metricDescriptor.OooO0O0();
        String strOooO0Oo = metricDescriptor.OooO0Oo();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Attributes, MinMaxSumCountAccumulation> entry : map.entrySet()) {
            Attributes key = entry.getKey();
            MinMaxSumCountAccumulation value = entry.getValue();
            arrayList.add(DoubleSummaryPointData.OooO0OO(j2, j3, key, value.OooO00o(), value.OooO0Oo(), Arrays.asList(ValueAtPercentile.OooO00o(0.0d, value.OooO0OO()), ValueAtPercentile.OooO00o(100.0d, value.OooO0O0()))));
        }
        return MetricData.OooO0Oo(resource, instrumentationLibraryInfo, strOooO0OO, strOooO0O0, strOooO0Oo, DoubleSummaryData.OooO0Oo(arrayList));
    }
}
