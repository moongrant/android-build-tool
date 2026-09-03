package org.jctools.util;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes5.dex */
abstract class PaddedAtomicLongL1Field extends PaddedAtomicLongL1Pad {
    private static final long VALUE_OFFSET = UnsafeAccess.fieldOffset(PaddedAtomicLongL1Field.class, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    private volatile long value;

    public boolean casVal(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, VALUE_OFFSET, j, j2);
    }

    public long getAndAddVal(long j) {
        long jLvVal;
        if (UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
            return UnsafeAccess.UNSAFE.getAndAddLong(this, VALUE_OFFSET, j);
        }
        do {
            jLvVal = lvVal();
        } while (!casVal(jLvVal, jLvVal + j));
        return jLvVal;
    }

    public long getAndSetVal(long j) {
        long jLvVal;
        if (UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
            return UnsafeAccess.UNSAFE.getAndSetLong(this, VALUE_OFFSET, j);
        }
        do {
            jLvVal = lvVal();
        } while (!casVal(jLvVal, j));
        return jLvVal;
    }

    public long lpVal() {
        return UnsafeAccess.UNSAFE.getLong(this, VALUE_OFFSET);
    }

    public long lvVal() {
        return this.value;
    }

    public void soVal(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, VALUE_OFFSET, j);
    }

    public void spVal(long j) {
        UnsafeAccess.UNSAFE.putLong(this, VALUE_OFFSET, j);
    }

    public void svVal(long j) {
        this.value = j;
    }
}
