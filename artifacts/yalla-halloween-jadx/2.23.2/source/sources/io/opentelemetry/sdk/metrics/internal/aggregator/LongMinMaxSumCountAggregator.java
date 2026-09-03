package io.opentelemetry.sdk.metrics.internal.aggregator;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.concurrent.ThreadSafe;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
final class LongMinMaxSumCountAggregator extends AbstractMinMaxSumCountAggregator {

    public static final class Handle extends AggregatorHandle<MinMaxSumCountAccumulation> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ReentrantReadWriteLock f32818OooO0OO = new ReentrantReadWriteLock();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final LongState f32819OooO0Oo = new LongState();

        public static final class LongState {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public long f32821OooO0O0 = 0;

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f32820OooO00o = 0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f32822OooO0OO = LongCompanionObject.MAX_VALUE;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f32823OooO0Oo = Long.MIN_VALUE;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final MinMaxSumCountAccumulation OooO0O0() {
            LongState longState = this.f32819OooO0Oo;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f32818OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            try {
                AutoValue_MinMaxSumCountAccumulation autoValue_MinMaxSumCountAccumulation = new AutoValue_MinMaxSumCountAccumulation(longState.f32820OooO00o, longState.f32821OooO0O0, longState.f32822OooO0OO, longState.f32823OooO0Oo);
                longState.f32821OooO0O0 = 0L;
                longState.f32820OooO00o = 0L;
                longState.f32822OooO0OO = LongCompanionObject.MAX_VALUE;
                longState.f32823OooO0Oo = Long.MIN_VALUE;
                return autoValue_MinMaxSumCountAccumulation;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public final void OooO0OO() {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f32818OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            try {
                LongState longState = this.f32819OooO0Oo;
                longState.f32820OooO00o++;
                longState.f32821OooO0O0++;
                longState.f32822OooO0OO = Math.min(1L, longState.f32822OooO0OO);
                longState.f32823OooO0Oo = Math.max(1L, longState.f32823OooO0Oo);
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
