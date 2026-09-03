package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class OooO0OO {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19736OooO00o;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f19736OooO00o = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19736OooO00o[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19736OooO00o[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19736OooO00o[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19736OooO00o[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19736OooO00o[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19736OooO00o[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19736OooO00o[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @GwtIncompatible
    public static long OooO00o(long j, long j2) {
        long j3 = j + j2;
        OooO0o.OooO00o(j, j2, "checkedAdd", ((j ^ j2) < 0) | ((j ^ j3) >= 0));
        return j3;
    }

    public static long OooO0O0(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        OooO0o.OooO00o(j, j2, "checkedMultiply", iNumberOfLeadingZeros >= 64);
        OooO0o.OooO00o(j, j2, "checkedMultiply", (j >= 0) | (j2 != Long.MIN_VALUE));
        long j3 = j * j2;
        OooO0o.OooO00o(j, j2, "checkedMultiply", j == 0 || j3 / j == j2);
        return j3;
    }

    @GwtIncompatible
    public static long OooO0OO(long j, long j2) {
        long j3 = j - j2;
        OooO0o.OooO00o(j, j2, "checkedSubtract", ((j ^ j2) >= 0) | ((j ^ j3) >= 0));
        return j3;
    }
}
