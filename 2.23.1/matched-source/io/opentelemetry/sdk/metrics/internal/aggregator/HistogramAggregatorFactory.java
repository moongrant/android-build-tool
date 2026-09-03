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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/opentelemetry/sdk/metrics/internal/aggregator/HistogramAggregatorFactory;", "Lio/opentelemetry/sdk/metrics/internal/aggregator/AggregatorFactory;", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class HistogramAggregatorFactory implements AggregatorFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final double[] f32810OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AggregationTemporality f32811OooO0O0;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
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
        this.f32810OooO00o = dArrCopyOf;
        this.f32811OooO0O0 = temporality;
        for (double d : dArrCopyOf) {
            if (!(true ^ Double.isNaN(d))) {
                throw new IllegalArgumentException("invalid bucket boundary: NaN".toString());
            }
        }
        int length = this.f32810OooO00o.length;
        for (int i = 1; i < length; i++) {
            double[] dArr = this.f32810OooO00o;
            int i2 = i - 1;
            if (!(dArr[i2] < dArr[i])) {
                throw new IllegalArgumentException(("invalid bucket boundary: " + this.f32810OooO00o[i2] + " >= " + this.f32810OooO00o[i]).toString());
            }
        }
        double[] dArr2 = this.f32810OooO00o;
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
        boolean z = this.f32811OooO0O0 == AggregationTemporality.CUMULATIVE;
        InstrumentValueType instrumentValueTypeOooO0o = instrumentDescriptor.OooO0o();
        int i = instrumentValueTypeOooO0o == null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentValueTypeOooO0o.ordinal()];
        if (i == 1 || i == 2) {
            return new DoubleHistogramAggregator(resource, instrumentationLibraryInfo, metricDescriptor, this.f32810OooO00o, z);
        }
        throw new NoWhenBranchMatchedException();
    }
}
