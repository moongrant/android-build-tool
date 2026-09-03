package o0OOOOO0;

import com.google.common.annotations.GwtCompatible;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class OooO00o {

    /* JADX INFO: renamed from: o0OOOOO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0380OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f38255OooO00o;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f38255OooO00o = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38255OooO00o[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38255OooO00o[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38255OooO00o[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38255OooO00o[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38255OooO00o[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38255OooO00o[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38255OooO00o[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static int OooO00o(int i, int i2, RoundingMode roundingMode) {
        Objects.requireNonNull(roundingMode);
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
        switch (C0380OooO00o.f38255OooO00o[roundingMode.ordinal()]) {
            case 1:
                if (!(i4 == 0)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                z = false;
                if (z) {
                    return i3 + i5;
                }
                return i3;
            case 2:
                z = false;
                if (z) {
                    return i3 + i5;
                }
                return i3;
            case 3:
                if (i5 >= 0) {
                    z = false;
                }
                if (z) {
                    return i3 + i5;
                }
                return i3;
            case 4:
                if (z) {
                    return i3 + i5;
                }
                return i3;
            case 5:
                if (i5 <= 0) {
                    z = false;
                }
                if (z) {
                    return i3 + i5;
                }
                return i3;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            z = false;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    z = false;
                }
                if (z) {
                    return i3 + i5;
                }
                return i3;
            default:
                throw new AssertionError();
        }
    }

    public static int OooO0O0(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException("x (" + i + ") must be > 0");
        }
        switch (C0380OooO00o.f38255OooO00o[roundingMode.ordinal()]) {
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
