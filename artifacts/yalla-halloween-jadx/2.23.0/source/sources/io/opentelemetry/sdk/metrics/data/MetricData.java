package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collections;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class MetricData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final DoubleGaugeData f33290OooO00o = new AutoValue_DoubleGaugeData(Collections.emptyList());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LongGaugeData f33291OooO0O0 = new AutoValue_LongGaugeData(Collections.emptyList());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final DoubleSumData f33292OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final LongSumData f33293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final DoubleHistogramData f33294OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final DoubleSummaryData f33295OooO0o0;

    static {
        AggregationTemporality aggregationTemporality = AggregationTemporality.CUMULATIVE;
        f33292OooO0OO = new AutoValue_DoubleSumData(aggregationTemporality, Collections.emptyList(), false);
        f33293OooO0Oo = new AutoValue_LongSumData(aggregationTemporality, Collections.emptyList(), false);
        f33295OooO0o0 = new AutoValue_DoubleSummaryData(Collections.emptyList());
        f33294OooO0o = new AutoValue_DoubleHistogramData(aggregationTemporality, Collections.emptyList());
    }

    public static MetricData OooO00o(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, DoubleGaugeData doubleGaugeData) {
        return new AutoValue_MetricData(resource, instrumentationLibraryInfo, str, str2, str3, MetricDataType.DOUBLE_GAUGE, doubleGaugeData);
    }

    public static MetricData OooO0O0(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, DoubleHistogramData doubleHistogramData) {
        return new AutoValue_MetricData(resource, instrumentationLibraryInfo, str, str2, str3, MetricDataType.HISTOGRAM, doubleHistogramData);
    }

    public static MetricData OooO0OO(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, DoubleSumData doubleSumData) {
        return new AutoValue_MetricData(resource, instrumentationLibraryInfo, str, str2, str3, MetricDataType.DOUBLE_SUM, doubleSumData);
    }

    public static MetricData OooO0Oo(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, DoubleSummaryData doubleSummaryData) {
        return new AutoValue_MetricData(resource, instrumentationLibraryInfo, str, str2, str3, MetricDataType.SUMMARY, doubleSummaryData);
    }

    public static MetricData OooO0o(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, LongSumData longSumData) {
        return new AutoValue_MetricData(resource, instrumentationLibraryInfo, str, str2, str3, MetricDataType.LONG_SUM, longSumData);
    }

    public static MetricData OooO0o0(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, LongGaugeData longGaugeData) {
        return new AutoValue_MetricData(resource, instrumentationLibraryInfo, str, str2, str3, MetricDataType.LONG_GAUGE, longGaugeData);
    }

    public abstract InstrumentationLibraryInfo OooO();

    public abstract Data<?> OooO0oO();

    public abstract String OooO0oo();

    public abstract String OooOO0();

    public abstract Resource OooOO0O();

    public abstract MetricDataType OooOO0o();

    public final boolean OooOOO() {
        return OooO0oO().OooO00o().isEmpty();
    }

    public abstract String OooOOO0();
}
