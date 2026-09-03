package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.proto.metrics.v1.Gauge;
import io.opentelemetry.proto.metrics.v1.Histogram;
import io.opentelemetry.proto.metrics.v1.HistogramDataPoint;
import io.opentelemetry.proto.metrics.v1.InstrumentationLibraryMetrics;
import io.opentelemetry.proto.metrics.v1.Metric;
import io.opentelemetry.proto.metrics.v1.NumberDataPoint;
import io.opentelemetry.proto.metrics.v1.ResourceMetrics;
import io.opentelemetry.proto.metrics.v1.Sum;
import io.opentelemetry.proto.metrics.v1.Summary;
import io.opentelemetry.proto.metrics.v1.SummaryDataPoint;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleGaugeData;
import io.opentelemetry.sdk.metrics.data.DoubleHistogramData;
import io.opentelemetry.sdk.metrics.data.DoubleHistogramPointData;
import io.opentelemetry.sdk.metrics.data.DoublePointData;
import io.opentelemetry.sdk.metrics.data.DoubleSumData;
import io.opentelemetry.sdk.metrics.data.DoubleSummaryData;
import io.opentelemetry.sdk.metrics.data.DoubleSummaryPointData;
import io.opentelemetry.sdk.metrics.data.Exemplar;
import io.opentelemetry.sdk.metrics.data.LongGaugeData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import io.opentelemetry.sdk.metrics.data.LongSumData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import io.opentelemetry.sdk.metrics.data.ValueAtPercentile;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p203o00o0o0o.o00O0OO;
import p203o00o0o0o.oo0o0O0;
import p484o0o00O.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/opentelemetry/exporter/otlp/internal/MetricAdapter;", "", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class MetricAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MetricAdapter f33123OooO00o = new MetricAdapter();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MetricDataType.values().length];
            iArr[MetricDataType.LONG_SUM.ordinal()] = 1;
            iArr[MetricDataType.DOUBLE_SUM.ordinal()] = 2;
            iArr[MetricDataType.SUMMARY.ordinal()] = 3;
            iArr[MetricDataType.LONG_GAUGE.ordinal()] = 4;
            iArr[MetricDataType.DOUBLE_GAUGE.ordinal()] = 5;
            iArr[MetricDataType.HISTOGRAM.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AggregationTemporality.values().length];
            iArr2[AggregationTemporality.CUMULATIVE.ordinal()] = 1;
            iArr2[AggregationTemporality.DELTA.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        new ThrottlingLogger(Logger.getLogger(MetricAdapter.class.getName()));
    }

    private MetricAdapter() {
    }

    @NotNull
    public static ArrayList OooO(@NotNull Collection points) {
        Intrinsics.checkNotNullParameter(points, "points");
        ArrayList arrayList = new ArrayList(points.size());
        Iterator it = points.iterator();
        while (it.hasNext()) {
            LongPointData longPointData = (LongPointData) it.next();
            NumberDataPoint.Builder builderNewBuilder = NumberDataPoint.newBuilder();
            builderNewBuilder.OooO0o(longPointData.OooO0OO());
            builderNewBuilder.OooO0oO(longPointData.OooO0O0());
            builderNewBuilder.OooO0o0(longPointData.OooO0o());
            longPointData.OooO00o().OooO0Oo(new com.yalla.yalla.ui.activity.room.OooO00o(builderNewBuilder));
            List<Exemplar> listOooO0Oo = longPointData.OooO0Oo();
            Intrinsics.checkNotNullExpressionValue(listOooO0Oo, "longPoint.exemplars");
            Iterator<T> it2 = listOooO0Oo.iterator();
            if (it2.hasNext()) {
                Exemplar exemplar = (Exemplar) it2.next();
                f33123OooO00o.getClass();
                OooO0oo(exemplar);
                throw null;
            }
            NumberDataPoint numberDataPointBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(numberDataPointBuild, "builder.build()");
            arrayList.add(numberDataPointBuild);
        }
        return arrayList;
    }

    public static void OooO00o(HistogramDataPoint.Builder builder, AttributeKey attributeKey, Object obj) {
        builder.OooO0o0(CommonAdapter.OooO00o(attributeKey, obj));
    }

    public static void OooO0O0(NumberDataPoint.Builder builder, AttributeKey attributeKey, Object obj) {
        builder.OooO0O0(CommonAdapter.OooO00o(attributeKey, obj));
    }

    public static void OooO0OO(SummaryDataPoint.Builder builder, AttributeKey attributeKey, Object obj) {
        builder.OooO0O0(CommonAdapter.OooO00o(attributeKey, obj));
    }

    public static void OooO0Oo(io.opentelemetry.proto.metrics.v1.Exemplar.Builder builder, AttributeKey attributeKey, Object obj) {
        builder.OooO0O0(CommonAdapter.OooO00o(attributeKey, obj));
    }

    public static io.opentelemetry.proto.metrics.v1.AggregationTemporality OooO0o(AggregationTemporality aggregationTemporality) {
        int i = WhenMappings.$EnumSwitchMapping$1[aggregationTemporality.ordinal()];
        if (i == 1) {
            return io.opentelemetry.proto.metrics.v1.AggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE;
        }
        if (i == 2) {
            return io.opentelemetry.proto.metrics.v1.AggregationTemporality.AGGREGATION_TEMPORALITY_DELTA;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void OooO0o0(NumberDataPoint.Builder builder, AttributeKey attributeKey, Object obj) {
        builder.OooO0O0(CommonAdapter.OooO00o(attributeKey, obj));
    }

    @NotNull
    public static ArrayList OooO0oO(@NotNull Collection points) {
        Intrinsics.checkNotNullParameter(points, "points");
        ArrayList arrayList = new ArrayList(points.size());
        Iterator it = points.iterator();
        while (it.hasNext()) {
            DoublePointData doublePointData = (DoublePointData) it.next();
            NumberDataPoint.Builder builderNewBuilder = NumberDataPoint.newBuilder();
            builderNewBuilder.OooO0o(doublePointData.OooO0OO());
            builderNewBuilder.OooO0oO(doublePointData.OooO0O0());
            builderNewBuilder.OooO0Oo(doublePointData.OooO0o());
            doublePointData.OooO00o().OooO0Oo(new o00O0OO(builderNewBuilder));
            List<Exemplar> listOooO0Oo = doublePointData.OooO0Oo();
            Intrinsics.checkNotNullExpressionValue(listOooO0Oo, "doublePoint.exemplars");
            Iterator<T> it2 = listOooO0Oo.iterator();
            if (it2.hasNext()) {
                Exemplar exemplar = (Exemplar) it2.next();
                f33123OooO00o.getClass();
                OooO0oo(exemplar);
                throw null;
            }
            NumberDataPoint numberDataPointBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(numberDataPointBuild, "builder.build()");
            arrayList.add(numberDataPointBuild);
        }
        return arrayList;
    }

    @NotNull
    public static io.opentelemetry.proto.metrics.v1.Exemplar OooO0oo(@NotNull Exemplar exemplar) {
        Intrinsics.checkNotNullParameter(exemplar, "exemplar");
        io.opentelemetry.proto.metrics.v1.Exemplar.Builder builderNewBuilder = io.opentelemetry.proto.metrics.v1.Exemplar.newBuilder();
        exemplar.OooO0O0();
        builderNewBuilder.OooO0Oo(0L);
        exemplar.OooO0OO();
        exemplar.OooO0Oo();
        exemplar.OooO0o0();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public static ArrayList OooOO0(@NotNull Collection metricData) {
        Intrinsics.checkNotNullParameter(metricData, "metricData");
        HashMap map = new HashMap();
        Iterator it = metricData.iterator();
        while (it.hasNext()) {
            MetricData metricData2 = (MetricData) it.next();
            if (!metricData2.OooOOO()) {
                Resource resource = metricData2.OooOO0O();
                Map map2 = (Map) map.get(metricData2.OooOO0O());
                if (map2 == null) {
                    map2 = new HashMap();
                    Intrinsics.checkNotNullExpressionValue(resource, "resource");
                    map.put(resource, map2);
                }
                InstrumentationLibraryInfo instrumentationLibraryInfoOooO = metricData2.OooO();
                Object arrayList = map2.get(instrumentationLibraryInfoOooO);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(instrumentationLibraryInfoOooO, arrayList);
                }
                List list = (List) arrayList;
                Intrinsics.checkNotNullParameter(metricData2, "metricData");
                Metric.Builder builderNewBuilder = Metric.newBuilder();
                builderNewBuilder.OooO0o(metricData2.OooOO0());
                builderNewBuilder.OooO0O0(metricData2.OooO0oo());
                builderNewBuilder.OooO(metricData2.OooOOO0());
                MetricDataType metricDataTypeOooOO0o = metricData2.OooOO0o();
                switch (metricDataTypeOooOO0o == null ? -1 : WhenMappings.$EnumSwitchMapping$0[metricDataTypeOooOO0o.ordinal()]) {
                    case 1:
                        LongSumData longSumData = metricData2.OooOO0o() == MetricDataType.LONG_SUM ? (LongSumData) metricData2.OooO0oO() : MetricData.f33293OooO0Oo;
                        Sum.Builder builderNewBuilder2 = Sum.newBuilder();
                        builderNewBuilder2.OooO0o0(longSumData.OooO0OO());
                        AggregationTemporality aggregationTemporalityOooO0O0 = longSumData.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(aggregationTemporalityOooO0O0, "longSumData.aggregationTemporality");
                        builderNewBuilder2.OooO0Oo(OooO0o(aggregationTemporalityOooO0O0));
                        Collection<T> collectionOooO00o = longSumData.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(collectionOooO00o, "longSumData.points");
                        builderNewBuilder2.OooO0O0(OooO(collectionOooO00o));
                        builderNewBuilder.OooO0oO(builderNewBuilder2.build());
                        Metric metricBuild = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild, "builder.build()");
                        list.add(metricBuild);
                        break;
                    case 2:
                        DoubleSumData doubleSumData = metricData2.OooOO0o() == MetricDataType.DOUBLE_SUM ? (DoubleSumData) metricData2.OooO0oO() : MetricData.f33292OooO0OO;
                        Sum.Builder builderNewBuilder3 = Sum.newBuilder();
                        builderNewBuilder3.OooO0o0(doubleSumData.OooO0OO());
                        AggregationTemporality aggregationTemporalityOooO0O1 = doubleSumData.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(aggregationTemporalityOooO0O1, "doubleSumData.aggregationTemporality");
                        builderNewBuilder3.OooO0Oo(OooO0o(aggregationTemporalityOooO0O1));
                        Collection<T> collectionOooO00o2 = doubleSumData.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(collectionOooO00o2, "doubleSumData.points");
                        builderNewBuilder3.OooO0O0(OooO0oO(collectionOooO00o2));
                        builderNewBuilder.OooO0oO(builderNewBuilder3.build());
                        Metric metricBuild2 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild2, "builder.build()");
                        list.add(metricBuild2);
                        break;
                    case 3:
                        DoubleSummaryData doubleSummaryData = metricData2.OooOO0o() == MetricDataType.SUMMARY ? (DoubleSummaryData) metricData2.OooO0oO() : MetricData.f33295OooO0o0;
                        Summary.Builder builderNewBuilder4 = Summary.newBuilder();
                        Collection<DoubleSummaryPointData> points = doubleSummaryData.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(points, "doubleSummaryData.points");
                        Intrinsics.checkNotNullParameter(points, "points");
                        ArrayList arrayList2 = new ArrayList(points.size());
                        for (DoubleSummaryPointData doubleSummaryPointData : points) {
                            SummaryDataPoint.Builder builderNewBuilder5 = SummaryDataPoint.newBuilder();
                            builderNewBuilder5.OooO0o(doubleSummaryPointData.OooO0OO());
                            builderNewBuilder5.OooO0oo(doubleSummaryPointData.OooO0O0());
                            builderNewBuilder5.OooO0o0(doubleSummaryPointData.OooO0o());
                            builderNewBuilder5.OooO0oO(doubleSummaryPointData.OooO0oo());
                            doubleSummaryPointData.OooO00o().OooO0Oo(new oo0o0O0(builderNewBuilder5));
                            if (!doubleSummaryPointData.OooO0oO().isEmpty()) {
                                for (ValueAtPercentile valueAtPercentile : doubleSummaryPointData.OooO0oO()) {
                                    SummaryDataPoint.ValueAtQuantile.Builder builderNewBuilder6 = SummaryDataPoint.ValueAtQuantile.newBuilder();
                                    builderNewBuilder6.OooO0O0(valueAtPercentile.OooO0O0() / 100.0d);
                                    builderNewBuilder6.OooO0Oo(valueAtPercentile.OooO0OO());
                                    builderNewBuilder5.OooO0Oo(builderNewBuilder6.build());
                                }
                            }
                            SummaryDataPoint summaryDataPointBuild = builderNewBuilder5.build();
                            Intrinsics.checkNotNullExpressionValue(summaryDataPointBuild, "builder.build()");
                            arrayList2.add(summaryDataPointBuild);
                        }
                        builderNewBuilder4.OooO0O0(arrayList2);
                        builderNewBuilder.OooO0oo(builderNewBuilder4.build());
                        Metric metricBuild3 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild3, "builder.build()");
                        list.add(metricBuild3);
                        break;
                    case 4:
                        LongGaugeData longGaugeData = metricData2.OooOO0o() == MetricDataType.LONG_GAUGE ? (LongGaugeData) metricData2.OooO0oO() : MetricData.f33291OooO0O0;
                        Gauge.Builder builderNewBuilder7 = Gauge.newBuilder();
                        Collection<T> collectionOooO00o3 = longGaugeData.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(collectionOooO00o3, "longGaugeData.points");
                        builderNewBuilder7.OooO0O0(OooO(collectionOooO00o3));
                        builderNewBuilder.OooO0Oo(builderNewBuilder7.build());
                        Metric metricBuild4 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild4, "builder.build()");
                        list.add(metricBuild4);
                        break;
                    case 5:
                        DoubleGaugeData doubleGaugeData = metricData2.OooOO0o() == MetricDataType.DOUBLE_GAUGE ? (DoubleGaugeData) metricData2.OooO0oO() : MetricData.f33290OooO00o;
                        Gauge.Builder builderNewBuilder8 = Gauge.newBuilder();
                        Collection<T> collectionOooO00o4 = doubleGaugeData.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(collectionOooO00o4, "doubleGaugeData.points");
                        builderNewBuilder8.OooO0O0(OooO0oO(collectionOooO00o4));
                        builderNewBuilder.OooO0Oo(builderNewBuilder8.build());
                        Metric metricBuild5 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild5, "builder.build()");
                        list.add(metricBuild5);
                        break;
                    case 6:
                        DoubleHistogramData doubleHistogramData = metricData2.OooOO0o() == MetricDataType.HISTOGRAM ? (DoubleHistogramData) metricData2.OooO0oO() : MetricData.f33294OooO0o;
                        Histogram.Builder builderNewBuilder9 = Histogram.newBuilder();
                        AggregationTemporality aggregationTemporalityOooO0O2 = doubleHistogramData.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(aggregationTemporalityOooO0O2, "doubleHistogramData.aggregationTemporality");
                        builderNewBuilder9.OooO0Oo(OooO0o(aggregationTemporalityOooO0O2));
                        Collection<DoubleHistogramPointData> points2 = doubleHistogramData.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(points2, "doubleHistogramData.points");
                        Intrinsics.checkNotNullParameter(points2, "points");
                        ArrayList arrayList3 = new ArrayList(points2.size());
                        for (DoubleHistogramPointData doubleHistogramPointData : points2) {
                            HistogramDataPoint.Builder builderNewBuilder10 = HistogramDataPoint.newBuilder();
                            builderNewBuilder10.OooO0oO(doubleHistogramPointData.OooO0OO());
                            builderNewBuilder10.OooO(doubleHistogramPointData.OooO0O0());
                            builderNewBuilder10.OooO0o(doubleHistogramPointData.OooO0oO());
                            builderNewBuilder10.OooO0oo(doubleHistogramPointData.OooO());
                            builderNewBuilder10.OooO0O0(doubleHistogramPointData.OooO0oo());
                            List<Double> listOooO0o = doubleHistogramPointData.OooO0o();
                            if (!listOooO0o.isEmpty()) {
                                builderNewBuilder10.OooO0Oo(listOooO0o);
                            }
                            doubleHistogramPointData.OooO00o().OooO0Oo(new o0000O0O(builderNewBuilder10));
                            List<Exemplar> listOooO0Oo = doubleHistogramPointData.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(listOooO0Oo, "doubleHistogramPoint.exemplars");
                            Iterator<T> it2 = listOooO0Oo.iterator();
                            if (it2.hasNext()) {
                                Exemplar exemplar = (Exemplar) it2.next();
                                f33123OooO00o.getClass();
                                OooO0oo(exemplar);
                                throw null;
                            }
                            HistogramDataPoint histogramDataPointBuild = builderNewBuilder10.build();
                            Intrinsics.checkNotNullExpressionValue(histogramDataPointBuild, "builder.build()");
                            arrayList3.add(histogramDataPointBuild);
                        }
                        builderNewBuilder9.OooO0O0(arrayList3);
                        builderNewBuilder.OooO0o0(builderNewBuilder9.build());
                        Metric metricBuild6 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild6, "builder.build()");
                        list.add(metricBuild6);
                        break;
                    default:
                        Metric metricBuild7 = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(metricBuild7, "builder.build()");
                        list.add(metricBuild7);
                        break;
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Resource resource2 = (Resource) entry.getKey();
            Map map3 = (Map) entry.getValue();
            ArrayList arrayList5 = new ArrayList(map3.size());
            for (Map.Entry entry2 : map3.entrySet()) {
                InstrumentationLibraryMetrics.Builder builderNewBuilder11 = InstrumentationLibraryMetrics.newBuilder();
                builderNewBuilder11.OooO0Oo(CommonAdapter.OooO0O0((InstrumentationLibraryInfo) entry2.getKey()));
                builderNewBuilder11.OooO0O0((Iterable) entry2.getValue());
                if (((InstrumentationLibraryInfo) entry2.getKey()).OooO0OO() != null) {
                    builderNewBuilder11.OooO0o0(((InstrumentationLibraryInfo) entry2.getKey()).OooO0OO());
                }
                InstrumentationLibraryMetrics instrumentationLibraryMetricsBuild = builderNewBuilder11.build();
                Intrinsics.checkNotNullExpressionValue(instrumentationLibraryMetricsBuild, "metricsBuilder.build()");
                arrayList5.add(instrumentationLibraryMetricsBuild);
            }
            ResourceMetrics.Builder builderNewBuilder12 = ResourceMetrics.newBuilder();
            builderNewBuilder12.OooO0Oo(ResourceAdapter.OooO00o(resource2));
            builderNewBuilder12.OooO0O0(arrayList5);
            String strOooO0OO = resource2.OooO0OO();
            if (strOooO0OO != null) {
                builderNewBuilder12.OooO0o0(strOooO0OO);
            }
            ResourceMetrics resourceMetricsBuild = builderNewBuilder12.build();
            Intrinsics.checkNotNullExpressionValue(resourceMetricsBuild, "resourceMetricsBuilder.build()");
            arrayList4.add(resourceMetricsBuild);
        }
        return arrayList4;
    }
}
