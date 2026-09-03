package com.google.common.primitives;

import com.facebook.appevents.AppEventsConstants;
import com.google.common.annotations.GwtCompatible;
import java.util.Objects;
import o0OOOOO.OooO;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class UnsignedLong extends Number implements Comparable<UnsignedLong> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f18732Oooo0o;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j) {
        this.f18732Oooo0o = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        Objects.requireNonNull(unsignedLong2);
        return OooO.OooO00o(this.f18732Oooo0o, unsignedLong2.f18732Oooo0o);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.f18732Oooo0o;
        double d = Long.MAX_VALUE & j;
        return j < 0 ? d + 9.223372036854776E18d : d;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return (obj instanceof UnsignedLong) && this.f18732Oooo0o == ((UnsignedLong) obj).f18732Oooo0o;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.f18732Oooo0o;
        float f = Long.MAX_VALUE & j;
        return j < 0 ? f + 9.223372E18f : f;
    }

    public final int hashCode() {
        long j = this.f18732Oooo0o;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f18732Oooo0o;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f18732Oooo0o;
    }

    public final String toString() {
        long j = this.f18732Oooo0o;
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
