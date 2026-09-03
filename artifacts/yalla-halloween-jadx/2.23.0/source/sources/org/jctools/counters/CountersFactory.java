package org.jctools.counters;

import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class CountersFactory {
    private CountersFactory() {
    }

    public static FixedSizeStripedLongCounter createFixedSizeStripedCounter(int i) {
        return UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG ? new FixedSizeStripedLongCounterV8(i) : new FixedSizeStripedLongCounterV6(i);
    }

    public static FixedSizeStripedLongCounter createFixedSizeStripedCounterV6(int i) {
        return new FixedSizeStripedLongCounterV6(i);
    }

    public static FixedSizeStripedLongCounter createFixedSizeStripedCounterV8(int i) {
        return new FixedSizeStripedLongCounterV8(i);
    }
}
