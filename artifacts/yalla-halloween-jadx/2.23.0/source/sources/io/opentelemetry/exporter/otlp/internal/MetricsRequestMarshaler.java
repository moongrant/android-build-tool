package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;

/* JADX INFO: loaded from: classes5.dex */
public final class MetricsRequestMarshaler extends MarshalerWithSize {

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.MetricsRequestMarshaler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33124OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f33125OooO0O0;

        static {
            int[] iArr = new int[AggregationTemporality.values().length];
            f33125OooO0O0 = iArr;
            try {
                iArr[AggregationTemporality.CUMULATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33125OooO0O0[AggregationTemporality.DELTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[MetricDataType.values().length];
            f33124OooO00o = iArr2;
            try {
                iArr2[MetricDataType.LONG_GAUGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33124OooO00o[MetricDataType.DOUBLE_GAUGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33124OooO00o[MetricDataType.LONG_SUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33124OooO00o[MetricDataType.DOUBLE_SUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33124OooO00o[MetricDataType.SUMMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33124OooO00o[MetricDataType.HISTOGRAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class ExemplarMarshaler extends MarshalerWithSize {
    }

    public static class GaugeMarshaler extends MarshalerWithSize {
    }

    public static class HistogramDataPointMarshaler extends MarshalerWithSize {
    }

    public static class HistogramMarshaler extends MarshalerWithSize {
    }

    public static final class InstrumentationLibraryMetricsMarshaler extends MarshalerWithSize {
    }

    public static final class MetricMarshaler extends MarshalerWithSize {
    }

    public static final class NumberDataPointMarshaler extends MarshalerWithSize {
    }

    public static final class ResourceMetricsMarshaler extends MarshalerWithSize {
    }

    public static class SumMarshaler extends MarshalerWithSize {
    }

    public static class SummaryDataPointMarshaler extends MarshalerWithSize {
    }

    public static class SummaryMarshaler extends MarshalerWithSize {
    }

    public static class ValueAtQuantileMarshaler extends MarshalerWithSize {
    }
}
