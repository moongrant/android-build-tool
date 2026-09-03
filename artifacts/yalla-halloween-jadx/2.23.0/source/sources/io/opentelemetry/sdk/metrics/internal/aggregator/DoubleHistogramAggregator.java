package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleHistogramData;
import io.opentelemetry.sdk.metrics.data.DoubleHistogramPointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
final class DoubleHistogramAggregator extends AbstractAggregator<HistogramAccumulation> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<Double> f33334OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double[] f33335OooO0o0;

    public static final class Handle extends AggregatorHandle<HistogramAccumulation> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double[] f33336OooO0OO;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long[] f33339OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ReentrantLock f33338OooO0o = new ReentrantLock();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f33337OooO0Oo = 0.0d;

        public Handle(double[] dArr) {
            this.f33336OooO0OO = dArr;
            this.f33339OooO0o0 = new long[dArr.length + 1];
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final HistogramAccumulation OooO00o() {
            long[] jArr = this.f33339OooO0o0;
            ReentrantLock reentrantLock = this.f33338OooO0o;
            reentrantLock.lock();
            try {
                AutoValue_HistogramAccumulation autoValue_HistogramAccumulation = new AutoValue_HistogramAccumulation(this.f33337OooO0Oo, Arrays.copyOf(jArr, jArr.length));
                this.f33337OooO0Oo = 0.0d;
                Arrays.fill(jArr, 0L);
                return autoValue_HistogramAccumulation;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO(long j) {
            double d = j;
            int length = 0;
            while (true) {
                double[] dArr = this.f33336OooO0OO;
                if (length >= dArr.length) {
                    length = dArr.length;
                    break;
                } else if (d <= dArr[length]) {
                    break;
                } else {
                    length++;
                }
            }
            ReentrantLock reentrantLock = this.f33338OooO0o;
            reentrantLock.lock();
            try {
                this.f33337OooO0Oo += d;
                long[] jArr = this.f33339OooO0o0;
                jArr[length] = jArr[length] + 1;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public DoubleHistogramAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, MetricDescriptor metricDescriptor, double[] dArr, boolean z) {
        super(resource, instrumentationLibraryInfo, metricDescriptor, z);
        this.f33335OooO0o0 = dArr;
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        this.f33334OooO0o = Collections.unmodifiableList(arrayList);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractAggregator, io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO00o(long j) {
        double d = j;
        double[] dArr = this.f33335OooO0o0;
        long[] jArr = new long[dArr.length + 1];
        int length = 0;
        while (length < dArr.length) {
            if (d <= dArr[length]) {
                jArr[length] = 1;
                return new AutoValue_HistogramAccumulation(d, jArr);
            }
            length++;
        }
        length = dArr.length;
        jArr[length] = 1;
        return new AutoValue_HistogramAccumulation(d, jArr);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO0O0(Object obj, Object obj2) {
        HistogramAccumulation histogramAccumulation = (HistogramAccumulation) obj;
        HistogramAccumulation histogramAccumulation2 = (HistogramAccumulation) obj2;
        long[] jArr = new long[histogramAccumulation.OooO00o().length];
        for (int i = 0; i < histogramAccumulation.OooO00o().length; i++) {
            jArr[i] = histogramAccumulation.OooO00o()[i] + histogramAccumulation2.OooO00o()[i];
        }
        return new AutoValue_HistogramAccumulation(histogramAccumulation.OooO0O0() + histogramAccumulation2.OooO0O0(), jArr);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<HistogramAccumulation> OooO0OO() {
        return new Handle(this.f33335OooO0o0);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final MetricData OooO0Oo(Map<Attributes, HistogramAccumulation> map, long j, long j2, long j3) {
        Resource resource = this.f33315OooO00o;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f33316OooO0O0;
        MetricDescriptor metricDescriptor = this.f33317OooO0OO;
        String strOooO0OO = metricDescriptor.OooO0OO();
        String strOooO0O0 = metricDescriptor.OooO0O0();
        String strOooO0Oo = metricDescriptor.OooO0Oo();
        boolean z = this.f33318OooO0Oo;
        AggregationTemporality aggregationTemporality = z ? AggregationTemporality.CUMULATIVE : AggregationTemporality.DELTA;
        long j4 = z ? j : j2;
        List<Double> list = this.f33334OooO0o;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Attributes, HistogramAccumulation> entry : map.entrySet()) {
            Attributes key = entry.getKey();
            HistogramAccumulation value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(value.OooO00o().length);
            for (long j5 : value.OooO00o()) {
                arrayList2.add(Long.valueOf(j5));
            }
            ArrayList arrayList3 = arrayList;
            arrayList3.add(DoubleHistogramPointData.OooO0o0(j4, j3, key, value.OooO0O0(), list, arrayList2));
            arrayList = arrayList3;
        }
        return MetricData.OooO0O0(resource, instrumentationLibraryInfo, strOooO0OO, strOooO0O0, strOooO0Oo, DoubleHistogramData.OooO0Oo(aggregationTemporality, arrayList));
    }
}
