package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class OooO0O0 {
    @GwtIncompatible
    public static long OooO00o(long j, long j2) {
        long j3 = j + j2;
        OooO0OO.OooO00o(j, j2, "checkedAdd", ((j ^ j2) < 0) | ((j ^ j3) >= 0));
        return j3;
    }

    public static long OooO0O0(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        OooO0OO.OooO00o(j, j2, "checkedMultiply", iNumberOfLeadingZeros >= 64);
        OooO0OO.OooO00o(j, j2, "checkedMultiply", (j >= 0) | (j2 != Long.MIN_VALUE));
        long j3 = j * j2;
        OooO0OO.OooO00o(j, j2, "checkedMultiply", j == 0 || j3 / j == j2);
        return j3;
    }

    @GwtIncompatible
    public static long OooO0OO(long j, long j2) {
        long j3 = j - j2;
        OooO0OO.OooO00o(j, j2, "checkedSubtract", ((j ^ j2) >= 0) | ((j ^ j3) >= 0));
        return j3;
    }
}
