package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f19755OooO0Oo;

    static {
        new UnsignedInteger(0);
        new UnsignedInteger(1);
        new UnsignedInteger(-1);
    }

    public UnsignedInteger(int i) {
        this.f19755OooO0Oo = i & (-1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        unsignedInteger2.getClass();
        int i = this.f19755OooO0Oo ^ Integer.MIN_VALUE;
        int i2 = unsignedInteger2.f19755OooO0Oo ^ Integer.MIN_VALUE;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(@CheckForNull Object obj) {
        return (obj instanceof UnsignedInteger) && this.f19755OooO0Oo == ((UnsignedInteger) obj).f19755OooO0Oo;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.f19755OooO0Oo;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f19755OooO0Oo;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return ((long) this.f19755OooO0Oo) & 4294967295L;
    }

    public final String toString() {
        return Long.toString(((long) this.f19755OooO0Oo) & 4294967295L, 10);
    }
}
