package io.opentelemetry.sdk.metrics.internal.aggregator;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class DoubleMinMaxSumCountAggregator extends AbstractMinMaxSumCountAggregator {

    public static final class Handle extends AggregatorHandle<MinMaxSumCountAccumulation> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ReentrantReadWriteLock f33341OooO0OO = new ReentrantReadWriteLock();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final DoubleState f33342OooO0Oo = new DoubleState();

        public static final class DoubleState {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public double f33343OooO00o = Double.POSITIVE_INFINITY;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public double f33344OooO0O0 = Double.NEGATIVE_INFINITY;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final MinMaxSumCountAccumulation OooO00o() {
            DoubleState doubleState = this.f33342OooO0Oo;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f33341OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            try {
                doubleState.getClass();
                AutoValue_MinMaxSumCountAccumulation autoValue_MinMaxSumCountAccumulation = new AutoValue_MinMaxSumCountAccumulation(0L, 0.0d, doubleState.f33343OooO00o, doubleState.f33344OooO0O0);
                doubleState.f33343OooO00o = Double.POSITIVE_INFINITY;
                doubleState.f33344OooO0O0 = Double.NEGATIVE_INFINITY;
                return autoValue_MinMaxSumCountAccumulation;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<MinMaxSumCountAccumulation> OooO0OO() {
        return new Handle();
    }
}
