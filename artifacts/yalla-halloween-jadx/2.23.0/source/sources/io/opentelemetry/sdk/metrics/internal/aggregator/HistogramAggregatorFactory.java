package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentValueType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/opentelemetry/sdk/metrics/internal/aggregator/HistogramAggregatorFactory;", "Lio/opentelemetry/sdk/metrics/internal/aggregator/AggregatorFactory;", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class HistogramAggregatorFactory implements AggregatorFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final double[] f33347OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AggregationTemporality f33348OooO0O0;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentValueType.values().length];
            iArr[InstrumentValueType.LONG.ordinal()] = 1;
            iArr[InstrumentValueType.DOUBLE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HistogramAggregatorFactory(@NotNull AggregationTemporality temporality, @NotNull List boundaries) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        Intrinsics.checkNotNullParameter(temporality, "temporality");
        double[] doubleArray = CollectionsKt.toDoubleArray(boundaries);
        double[] dArrCopyOf = Arrays.copyOf(doubleArray, doubleArray.length);
        this.f33347OooO00o = dArrCopyOf;
        this.f33348OooO0O0 = temporality;
        int length = dArrCopyOf.length;
        int i = 0;
        while (i < length) {
            double d = dArrCopyOf[i];
            i++;
            if (!(true ^ Double.isNaN(d))) {
                throw new IllegalArgumentException("invalid bucket boundary: NaN".toString());
            }
        }
        int length2 = this.f33347OooO00o.length;
        if (1 < length2) {
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                double[] dArr = this.f33347OooO00o;
                int i4 = i2 - 1;
                if (!(dArr[i4] < dArr[i2])) {
                    throw new IllegalArgumentException(("invalid bucket boundary: " + this.f33347OooO00o[i4] + " >= " + this.f33347OooO00o[i2]).toString());
                }
                if (i3 >= length2) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        double[] dArr2 = this.f33347OooO00o;
        if (!(dArr2.length == 0)) {
            if (!(!(dArr2[0] == Double.NEGATIVE_INFINITY))) {
                throw new IllegalArgumentException("invalid bucket boundary: -Inf".toString());
            }
            if (!(!(dArr2[dArr2.length - 1] == Double.POSITIVE_INFINITY))) {
                throw new IllegalArgumentException("invalid bucket boundary: +Inf".toString());
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    @NotNull
    public final <T> Aggregator<T> OooO00o(@NotNull Resource resource, @NotNull InstrumentationLibraryInfo instrumentationLibraryInfo, @NotNull InstrumentDescriptor instrumentDescriptor, @NotNull MetricDescriptor metricDescriptor) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(instrumentationLibraryInfo, "instrumentationLibraryInfo");
        Intrinsics.checkNotNullParameter(instrumentDescriptor, "instrumentDescriptor");
        Intrinsics.checkNotNullParameter(metricDescriptor, "metricDescriptor");
        boolean z = this.f33348OooO0O0 == AggregationTemporality.CUMULATIVE;
        InstrumentValueType instrumentValueTypeOooO0o = instrumentDescriptor.OooO0o();
        int i = instrumentValueTypeOooO0o == null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentValueTypeOooO0o.ordinal()];
        if (i == 1 || i == 2) {
            return new DoubleHistogramAggregator(resource, instrumentationLibraryInfo, metricDescriptor, this.f33347OooO00o, z);
        }
        throw new NoWhenBranchMatchedException();
    }
}
