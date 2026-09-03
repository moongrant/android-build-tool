package io.opentelemetry.sdk.internal;

import io.opentelemetry.sdk.common.Clock;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class RateLimiter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Clock f33207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f33208OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f33209OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicLong f33210OooO0Oo;

    public RateLimiter(double d, double d2, Clock clock) {
        this.f33207OooO00o = clock;
        double d3 = d / 1.0E9d;
        this.f33208OooO0O0 = d3;
        long j = (long) (d2 / d3);
        this.f33209OooO0OO = j;
        this.f33210OooO0Oo = new AtomicLong(clock.nanoTime() - j);
    }

    public final boolean OooO00o() {
        AtomicLong atomicLong;
        long j;
        long jNanoTime;
        long j2;
        long j3 = (long) (1.0d / this.f33208OooO0O0);
        do {
            atomicLong = this.f33210OooO0Oo;
            j = atomicLong.get();
            jNanoTime = this.f33207OooO00o.nanoTime();
            long j4 = jNanoTime - j;
            long j5 = this.f33209OooO0OO;
            if (j4 > j5) {
                j4 = j5;
            }
            j2 = j4 - j3;
            if (j2 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j, jNanoTime - j2));
        return true;
    }
}
