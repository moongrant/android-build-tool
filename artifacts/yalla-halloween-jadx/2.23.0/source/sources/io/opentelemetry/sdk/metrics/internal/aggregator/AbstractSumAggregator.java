package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractSumAggregator<T> extends AbstractAggregator<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AggregationTemporality f33319OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f33320OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final MergeStrategy f33321OooO0oO;

    /* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.internal.aggregator.AbstractSumAggregator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33322OooO00o;

        static {
            int[] iArr = new int[MergeStrategy.values().length];
            f33322OooO00o = iArr;
            try {
                iArr[MergeStrategy.SUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33322OooO00o[MergeStrategy.DIFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum MergeStrategy {
        SUM,
        DIFF
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractSumAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, InstrumentDescriptor instrumentDescriptor, MetricDescriptor metricDescriptor, AggregationTemporality aggregationTemporality) {
        InstrumentType instrumentTypeOooO0Oo = instrumentDescriptor.OooO0Oo();
        InstrumentType instrumentType = InstrumentType.OBSERVABLE_SUM;
        super(resource, instrumentationLibraryInfo, metricDescriptor, instrumentTypeOooO0Oo == instrumentType || instrumentTypeOooO0Oo == InstrumentType.OBSERVABLE_UP_DOWN_SUM ? aggregationTemporality == AggregationTemporality.DELTA : aggregationTemporality == AggregationTemporality.CUMULATIVE);
        InstrumentType instrumentTypeOooO0Oo2 = instrumentDescriptor.OooO0Oo();
        this.f33320OooO0o0 = instrumentTypeOooO0Oo2 == InstrumentType.COUNTER || instrumentTypeOooO0Oo2 == instrumentType;
        this.f33319OooO0o = aggregationTemporality;
        this.f33321OooO0oO = ((instrumentTypeOooO0Oo2 == instrumentType || instrumentTypeOooO0Oo2 == InstrumentType.OBSERVABLE_UP_DOWN_SUM) && aggregationTemporality == AggregationTemporality.DELTA) ? MergeStrategy.DIFF : MergeStrategy.SUM;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final T OooO0O0(T t, T t2) {
        int[] iArr = AnonymousClass1.f33322OooO00o;
        MergeStrategy mergeStrategy = this.f33321OooO0oO;
        int i = iArr[mergeStrategy.ordinal()];
        if (i == 1) {
            return OooO0oO(t, t2);
        }
        if (i == 2) {
            return OooO0o(t, t2);
        }
        throw new IllegalStateException("Unsupported merge strategy: " + mergeStrategy.name());
    }

    public abstract T OooO0o(T t, T t2);

    public abstract T OooO0oO(T t, T t2);
}
