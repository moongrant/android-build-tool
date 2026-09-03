package org.jctools.util;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

/* JADX INFO: loaded from: classes5.dex */
public class PaddedAtomicLong extends PaddedAtomicLongL2Pad {
    public PaddedAtomicLong() {
    }

    public long accumulateAndGet(long j, LongBinaryOperator longBinaryOperator) {
        long jLvVal;
        long jApplyAsLong;
        do {
            jLvVal = lvVal();
            jApplyAsLong = longBinaryOperator.applyAsLong(jLvVal, j);
        } while (!casVal(jLvVal, jApplyAsLong));
        return jApplyAsLong;
    }

    public long addAndGet(long j) {
        return getAndAddVal(j) + j;
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ boolean casVal(long j, long j2) {
        return super.casVal(j, j2);
    }

    public boolean compareAndSet(long j, long j2) {
        return casVal(j, j2);
    }

    public long decrementAndGet() {
        return getAndAddVal(-1L) - 1;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return lvVal();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return lvVal();
    }

    public long get() {
        return lvVal();
    }

    public long getAndAccumulate(long j, LongBinaryOperator longBinaryOperator) {
        long jLvVal;
        do {
            jLvVal = lvVal();
        } while (!casVal(jLvVal, longBinaryOperator.applyAsLong(jLvVal, j)));
        return jLvVal;
    }

    public long getAndAdd(long j) {
        return getAndAddVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long getAndAddVal(long j) {
        return super.getAndAddVal(j);
    }

    public long getAndDecrement() {
        return getAndAddVal(-1L);
    }

    public long getAndIncrement() {
        return getAndAddVal(1L);
    }

    public long getAndSet(long j) {
        return getAndSetVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long getAndSetVal(long j) {
        return super.getAndSetVal(j);
    }

    public long getAndUpdate(LongUnaryOperator longUnaryOperator) {
        long jLvVal;
        do {
            jLvVal = lvVal();
        } while (!casVal(jLvVal, longUnaryOperator.applyAsLong(jLvVal)));
        return jLvVal;
    }

    public long incrementAndGet() {
        return getAndAddVal(1L) + 1;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) lvVal();
    }

    public void lazySet(long j) {
        soVal(j);
    }

    @Override // java.lang.Number
    public long longValue() {
        return lvVal();
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long lpVal() {
        return super.lpVal();
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long lvVal() {
        return super.lvVal();
    }

    public void set(long j) {
        svVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ void soVal(long j) {
        super.soVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ void spVal(long j) {
        super.spVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ void svVal(long j) {
        super.svVal(j);
    }

    public String toString() {
        return Long.toString(lvVal());
    }

    public long updateAndGet(LongUnaryOperator longUnaryOperator) {
        long jLvVal;
        long jApplyAsLong;
        do {
            jLvVal = lvVal();
            jApplyAsLong = longUnaryOperator.applyAsLong(jLvVal);
        } while (!casVal(jLvVal, jApplyAsLong));
        return jApplyAsLong;
    }

    public boolean weakCompareAndSet(long j, long j2) {
        return casVal(j, j2);
    }

    public PaddedAtomicLong(long j) {
        svVal(j);
    }
}
