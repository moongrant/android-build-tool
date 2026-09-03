package org.jctools.counters;

import org.jctools.util.UnsafeAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
class FixedSizeStripedLongCounterV6 extends FixedSizeStripedLongCounter {
    public FixedSizeStripedLongCounterV6(int i) {
        super(i);
    }

    @Override // org.jctools.counters.FixedSizeStripedLongCounter
    public long getAndReset(long[] jArr, long j) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = UnsafeAccess.UNSAFE;
            longVolatile = unsafe.getLongVolatile(jArr, j);
        } while (!unsafe.compareAndSwapLong(jArr, j, longVolatile, 0L));
        return longVolatile;
    }

    @Override // org.jctools.counters.FixedSizeStripedLongCounter
    public void inc(long[] jArr, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = UnsafeAccess.UNSAFE;
            longVolatile = unsafe.getLongVolatile(jArr, j);
        } while (!unsafe.compareAndSwapLong(jArr, j, longVolatile, longVolatile + j2));
    }
}
