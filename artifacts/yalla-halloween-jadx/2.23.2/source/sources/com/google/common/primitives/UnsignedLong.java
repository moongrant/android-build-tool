package com.google.common.primitives;

import com.facebook.appevents.AppEventsConstants;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(serializable = true)
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19278OooO0Oo;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j) {
        this.f19278OooO0Oo = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        unsignedLong2.getClass();
        long j = this.f19278OooO0Oo ^ Long.MIN_VALUE;
        long j2 = Long.MIN_VALUE ^ unsignedLong2.f19278OooO0Oo;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.f19278OooO0Oo;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0d;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return (obj instanceof UnsignedLong) && this.f19278OooO0Oo == ((UnsignedLong) obj).f19278OooO0Oo;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.f19278OooO0Oo;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0f;
    }

    public final int hashCode() {
        return OooO.OooO00o(this.f19278OooO0Oo);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f19278OooO0Oo;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f19278OooO0Oo;
    }

    public final String toString() {
        long j = this.f19278OooO0Oo;
        if (j == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / ((long) 5);
        long j3 = 10;
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % j3), 10);
            j2 /= j3;
        }
        return new String(cArr, i, 64 - i);
    }
}
