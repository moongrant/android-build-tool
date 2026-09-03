package org.jctools.counters;

import org.jctools.util.PortableJvmInfo;
import org.jctools.util.Pow2;
import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class FixedSizeStripedLongCounterFields extends FixedSizeStripedLongCounterPrePad {
    protected static final int CACHE_LINE_IN_LONGS;
    protected static final long COUNTER_ARRAY_BASE;
    protected static final long ELEMENT_SHIFT;
    protected final long[] cells;
    protected final int mask;

    static {
        int i = PortableJvmInfo.CACHE_LINE_SIZE;
        CACHE_LINE_IN_LONGS = i / 8;
        COUNTER_ARRAY_BASE = Math.max(UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class), i - 8);
        ELEMENT_SHIFT = Integer.numberOfTrailingZeros(i);
    }

    public FixedSizeStripedLongCounterFields(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Expecting a stripesCount that is larger than 0");
        }
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.cells = new long[CACHE_LINE_IN_LONGS * iRoundToPowerOfTwo];
        this.mask = iRoundToPowerOfTwo - 1;
    }
}
