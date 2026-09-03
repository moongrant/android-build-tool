package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentValueType;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
final class LastValueAggregatorFactory implements AggregatorFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AggregatorFactory f32815OooO00o = new LastValueAggregatorFactory();

    /* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.internal.aggregator.LastValueAggregatorFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32816OooO00o;

        static {
            int[] iArr = new int[InstrumentValueType.values().length];
            f32816OooO00o = iArr;
            try {
                iArr[InstrumentValueType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32816OooO00o[InstrumentValueType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private LastValueAggregatorFactory() {
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public final <T> Aggregator<T> OooO00o(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, InstrumentDescriptor instrumentDescriptor, MetricDescriptor metricDescriptor) {
        int i = AnonymousClass1.f32816OooO00o[instrumentDescriptor.OooO0o().ordinal()];
        if (i == 1) {
            return new LongLastValueAggregator(resource, instrumentationLibraryInfo, metricDescriptor);
        }
        if (i == 2) {
            return new DoubleLastValueAggregator(resource, instrumentationLibraryInfo, metricDescriptor);
        }
        throw new IllegalArgumentException("Invalid instrument value type");
    }
}
