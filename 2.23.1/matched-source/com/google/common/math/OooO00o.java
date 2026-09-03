package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class OooO00o {

    /* JADX INFO: renamed from: com.google.common.math.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0236OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19263OooO00o;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f19263OooO00o = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19263OooO00o[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19263OooO00o[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19263OooO00o[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19263OooO00o[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19263OooO00o[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19263OooO00o[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19263OooO00o[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int OooO00o(int i, int i2) {
        long j = ((long) i) - ((long) i2);
        int i3 = (int) j;
        OooO0OO.OooO0O0("checkedSubtract", i, i2, j == ((long) i3));
        return i3;
    }

    public static int OooO0O0(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        boolean z = true;
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (C0236OooO00o.f19263OooO00o[roundingMode.ordinal()]) {
            case 1:
                if (!(i4 == 0)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                z = false;
                break;
                break;
            case 2:
                z = false;
                break;
            case 3:
                if (i5 >= 0) {
                    z = false;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    z = false;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 != 0) {
                    if (iAbs2 <= 0) {
                        z = false;
                    }
                } else if (roundingMode != RoundingMode.HALF_UP) {
                    if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                        z = false;
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
        return z ? i3 + i5 : i3;
    }

    public static int OooO0OO(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("x (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        switch (C0236OooO00o.f19263OooO00o[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
