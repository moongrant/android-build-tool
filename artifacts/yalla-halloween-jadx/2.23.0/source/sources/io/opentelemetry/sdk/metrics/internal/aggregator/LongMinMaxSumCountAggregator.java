package io.opentelemetry.sdk.metrics.internal.aggregator;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.concurrent.ThreadSafe;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class LongMinMaxSumCountAggregator extends AbstractMinMaxSumCountAggregator {

    public static final class Handle extends AggregatorHandle<MinMaxSumCountAccumulation> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ReentrantReadWriteLock f33352OooO0OO = new ReentrantReadWriteLock();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final LongState f33353OooO0Oo = new LongState();

        public static final class LongState {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public long f33355OooO0O0 = 0;

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f33354OooO00o = 0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f33356OooO0OO = LongCompanionObject.MAX_VALUE;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f33357OooO0Oo = Long.MIN_VALUE;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final MinMaxSumCountAccumulation OooO00o() {
            LongState longState = this.f33353OooO0Oo;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f33352OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            try {
                AutoValue_MinMaxSumCountAccumulation autoValue_MinMaxSumCountAccumulation = new AutoValue_MinMaxSumCountAccumulation(longState.f33354OooO00o, longState.f33355OooO0O0, longState.f33356OooO0OO, longState.f33357OooO0Oo);
                longState.f33355OooO0O0 = 0L;
                longState.f33354OooO00o = 0L;
                longState.f33356OooO0OO = LongCompanionObject.MAX_VALUE;
                longState.f33357OooO0Oo = Long.MIN_VALUE;
                return autoValue_MinMaxSumCountAccumulation;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO(long j) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f33352OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            try {
                LongState longState = this.f33353OooO0Oo;
                longState.f33354OooO00o++;
                longState.f33355OooO0O0 += j;
                longState.f33356OooO0OO = Math.min(j, longState.f33356OooO0OO);
                longState.f33357OooO0Oo = Math.max(j, longState.f33357OooO0Oo);
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AbstractAggregator, io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final Object OooO00o(long j) {
        double d = j;
        return new AutoValue_MinMaxSumCountAccumulation(1L, d, d, d);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final AggregatorHandle<MinMaxSumCountAccumulation> OooO0OO() {
        return new Handle();
    }
}
