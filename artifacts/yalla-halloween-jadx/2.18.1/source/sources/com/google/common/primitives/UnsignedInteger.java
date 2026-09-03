package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f18731Oooo0o;

    static {
        OooO00o(0);
        OooO00o(1);
        OooO00o(-1);
    }

    public UnsignedInteger(int i) {
        this.f18731Oooo0o = i & (-1);
    }

    public static UnsignedInteger OooO00o(int i) {
        return new UnsignedInteger(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        Objects.requireNonNull(unsignedInteger2);
        int i = this.f18731Oooo0o ^ Integer.MIN_VALUE;
        int i2 = unsignedInteger2.f18731Oooo0o ^ Integer.MIN_VALUE;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(@NullableDecl Object obj) {
        return (obj instanceof UnsignedInteger) && this.f18731Oooo0o == ((UnsignedInteger) obj).f18731Oooo0o;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.f18731Oooo0o;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f18731Oooo0o;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return ((long) this.f18731Oooo0o) & 4294967295L;
    }

    public final String toString() {
        return Long.toString(((long) this.f18731Oooo0o) & 4294967295L, 10);
    }
}
