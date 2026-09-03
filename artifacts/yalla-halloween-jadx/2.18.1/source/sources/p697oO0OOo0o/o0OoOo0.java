package p697oO0OOo0o;

import java.math.BigInteger;
import kotlin.collections.OooO0OO;
import p684oO0000o.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OoOo0 {
    public static long[] OooO(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    public static int OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int OooO0OO(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j >>> 32);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j2 >>> 32);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L) + (j3 >>> 32);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j4 >>> 32);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L) + (j5 >>> 32);
        iArr2[i9] = (int) j6;
        int i10 = i2 + 6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L) + (j6 >>> 32);
        iArr2[i10] = (int) j7;
        int i11 = i2 + 7;
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i11])) + (j7 >>> 32);
        iArr2[i11] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int OooO0Oo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + 0;
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23])) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static boolean OooO0o(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[8 + i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[0 + i];
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
            i--;
        }
        if (z) {
            OooOOo(iArr, 8, iArr2, 0, iArr3);
        } else {
            OooOOo(iArr2, 0, iArr, 8, iArr3);
        }
        return z;
    }

    public static boolean OooO0oO(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] OooO0oo(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static boolean OooOO0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean OooOO0O(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooOO0o(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooOOO(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooOOO0(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void OooOOOO(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j19 = j;
            long j20 = (j18 * j) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j20;
            int i4 = i + 1;
            long j21 = j2;
            long j22 = (j18 * j2) + (((long) iArr3[i4]) & 4294967295L) + (j20 >>> 32);
            iArr3[i4] = (int) j22;
            int i5 = i + 2;
            long j23 = (j18 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j22 >>> 32);
            iArr3[i5] = (int) j23;
            int i6 = i + 3;
            long j24 = (j18 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j23 >>> 32);
            iArr3[i6] = (int) j24;
            int i7 = i + 4;
            long j25 = (j18 * j5) + (((long) iArr3[i7]) & 4294967295L) + (j24 >>> 32);
            iArr3[i7] = (int) j25;
            int i8 = i + 5;
            long j26 = (j18 * j6) + (((long) iArr3[i8]) & 4294967295L) + (j25 >>> 32);
            iArr3[i8] = (int) j26;
            int i9 = i + 6;
            long j27 = (j18 * j7) + (((long) iArr3[i9]) & 4294967295L) + (j26 >>> 32);
            iArr3[i9] = (int) j27;
            long j28 = j27 >>> 32;
            int i10 = i + 7;
            long j29 = (j18 * j8) + (((long) iArr3[i10]) & 4294967295L) + j28;
            iArr3[i10] = (int) j29;
            iArr3[i + 8] = (int) (j29 >>> 32);
            i = i4;
            j = j19;
            j2 = j21;
        }
    }

    public static int OooOOOo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = j8;
            long j11 = ((long) iArr[i]) & 4294967295L;
            int i2 = i + 0;
            long j12 = j6;
            long j13 = (j11 * j) + (((long) iArr3[i2]) & 4294967295L) + 0;
            iArr3[i2] = (int) j13;
            int i3 = i + 1;
            long j14 = j2;
            long j15 = (j11 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j13 >>> 32);
            iArr3[i3] = (int) j15;
            int i4 = i + 2;
            long j16 = (j11 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j15 >>> 32);
            iArr3[i4] = (int) j16;
            int i5 = i + 3;
            long j17 = (j11 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j16 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i + 4;
            long j18 = (j11 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            int i7 = i + 5;
            long j19 = (j11 * j12) + (((long) iArr3[i7]) & 4294967295L) + (j18 >>> 32);
            iArr3[i7] = (int) j19;
            int i8 = i + 6;
            long j20 = (j11 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j19 >>> 32);
            iArr3[i8] = (int) j20;
            int i9 = i + 7;
            long j21 = (j11 * j10) + (((long) iArr3[i9]) & 4294967295L) + (j20 >>> 32);
            iArr3[i9] = (int) j21;
            int i10 = i + 8;
            long j22 = j9 + (((long) iArr3[i10]) & 4294967295L) + (j21 >>> 32);
            iArr3[i10] = (int) j22;
            j9 = j22 >>> 32;
            i = i3;
            j8 = j10;
            j6 = j12;
            j3 = j3;
            j2 = j14;
        }
        return (int) j9;
    }

    public static int OooOOo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static void OooOOo0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 7;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & 4294967295L;
                long j6 = ((long) iArr2[2]) & 4294967295L;
                long j7 = (j5 * j) + ((((long) (i6 << 31)) & 4294967295L) | (j4 >>> 33));
                int i7 = (int) j7;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i7 << 1);
                int i8 = i7 >>> 31;
                long j8 = ((long) iArr[2]) & 4294967295L;
                long j9 = ((long) iArr2[3]) & 4294967295L;
                long j10 = ((long) iArr2[4]) & 4294967295L;
                long j11 = (j8 * j) + j6 + (j7 >>> 32);
                int i9 = (int) j11;
                iArr2[2] = i8 | (i9 << 1);
                int i10 = i9 >>> 31;
                long jOooO0O0 = OooO0OO.OooO0O0(j8, j5, j11 >>> 32, j9);
                long j12 = j10 + (jOooO0O0 >>> 32);
                long j13 = ((long) iArr[3]) & 4294967295L;
                long j14 = (((long) iArr2[5]) & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (((long) iArr2[6]) & 4294967295L) + (j14 >>> 32);
                long j17 = j14 & 4294967295L;
                long j18 = (j13 * j) + (jOooO0O0 & 4294967295L);
                int i11 = (int) j18;
                iArr2[3] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long jOooO0O1 = OooO0OO.OooO0O0(j13, j5, j18 >>> 32, j15);
                long jOooO0O2 = OooO0OO.OooO0O0(j13, j8, jOooO0O1 >>> 32, j17);
                long j19 = j16 + (jOooO0O2 >>> 32);
                long j20 = jOooO0O2 & 4294967295L;
                long j21 = ((long) iArr[4]) & 4294967295L;
                long j22 = (((long) iArr2[7]) & 4294967295L) + (j19 >>> 32);
                long j23 = j19 & 4294967295L;
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j) + (jOooO0O1 & 4294967295L);
                int i13 = (int) j26;
                iArr2[4] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jOooO0O3 = OooO0OO.OooO0O0(j21, j5, j26 >>> 32, j20);
                long jOooO0O4 = OooO0OO.OooO0O0(j21, j8, jOooO0O3 >>> 32, j23);
                long jOooO0O5 = OooO0OO.OooO0O0(j21, j13, jOooO0O4 >>> 32, j25);
                long j27 = jOooO0O4 & 4294967295L;
                long j28 = j24 + (jOooO0O5 >>> 32);
                long j29 = ((long) iArr[5]) & 4294967295L;
                long j30 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j31 = (((long) iArr2[10]) & 4294967295L) + (j30 >>> 32);
                long j32 = j30 & 4294967295L;
                long j33 = (j29 * j) + (jOooO0O3 & 4294967295L);
                int i15 = (int) j33;
                iArr2[5] = i14 | (i15 << 1);
                long jOooO0O6 = OooO0OO.OooO0O0(j29, j5, j33 >>> 32, j27);
                long jOooO0O7 = OooO0OO.OooO0O0(j29, j8, jOooO0O6 >>> 32, jOooO0O5 & 4294967295L);
                long jOooO0O8 = OooO0OO.OooO0O0(j29, j13, jOooO0O7 >>> 32, j28 & 4294967295L);
                long j34 = jOooO0O7 & 4294967295L;
                long jOooO0O9 = OooO0OO.OooO0O0(j29, j21, jOooO0O8 >>> 32, j32);
                long j35 = jOooO0O8 & 4294967295L;
                long j36 = j31 + (jOooO0O9 >>> 32);
                long j37 = jOooO0O9 & 4294967295L;
                long j38 = ((long) iArr[6]) & 4294967295L;
                long j39 = (((long) iArr2[11]) & 4294967295L) + (j36 >>> 32);
                long j40 = j36 & 4294967295L;
                long j41 = (((long) iArr2[12]) & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                long j43 = (j38 * j) + (jOooO0O6 & 4294967295L);
                int i16 = (int) j43;
                iArr2[6] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                long jOooO0O10 = OooO0OO.OooO0O0(j38, j5, j43 >>> 32, j34);
                long jOooO0O11 = OooO0OO.OooO0O0(j38, j8, jOooO0O10 >>> 32, j35);
                long jOooO0O12 = OooO0OO.OooO0O0(j38, j13, jOooO0O11 >>> 32, j37);
                long j44 = jOooO0O11 & 4294967295L;
                long jOooO0O13 = OooO0OO.OooO0O0(j38, j21, jOooO0O12 >>> 32, j40);
                long j45 = jOooO0O12 & 4294967295L;
                long jOooO0O14 = OooO0OO.OooO0O0(j38, j29, jOooO0O13 >>> 32, j42);
                long j46 = jOooO0O13 & 4294967295L;
                long j47 = j41 + (jOooO0O14 >>> 32);
                long j48 = ((long) iArr[7]) & 4294967295L;
                long j49 = (((long) iArr2[13]) & 4294967295L) + (j47 >>> 32);
                long j50 = (((long) iArr2[14]) & 4294967295L) + (j49 >>> 32);
                long j51 = (j * j48) + (jOooO0O10 & 4294967295L);
                int i18 = (int) j51;
                iArr2[7] = (i18 << 1) | i17;
                long jOooO0O15 = OooO0OO.OooO0O0(j48, j5, j51 >>> 32, j44);
                long jOooO0O16 = OooO0OO.OooO0O0(j48, j8, jOooO0O15 >>> 32, j45);
                long jOooO0O17 = OooO0OO.OooO0O0(j48, j13, jOooO0O16 >>> 32, j46);
                long jOooO0O18 = OooO0OO.OooO0O0(j48, j21, jOooO0O17 >>> 32, jOooO0O14 & 4294967295L);
                long jOooO0O19 = OooO0OO.OooO0O0(j48, j29, jOooO0O18 >>> 32, j47 & 4294967295L);
                long jOooO0O20 = OooO0OO.OooO0O0(j48, j38, jOooO0O19 >>> 32, j49 & 4294967295L);
                long j52 = j50 + (jOooO0O20 >>> 32);
                int i19 = (int) jOooO0O15;
                iArr2[8] = (i19 << 1) | (i18 >>> 31);
                int i20 = (int) jOooO0O16;
                iArr2[9] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) jOooO0O17;
                iArr2[10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jOooO0O18;
                iArr2[11] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) jOooO0O19;
                iArr2[12] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) jOooO0O20;
                iArr2[13] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j52;
                iArr2[14] = i29 | (i30 << 1);
                iArr2[15] = (i30 >>> 31) | ((iArr2[15] + ((int) (j52 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static int OooOOoo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger OooOo0(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                OooOO0.OooO0O0(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int OooOo00(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        long j8 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j7 >> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger OooOo0O(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                OooOO0.OooO0Oo(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void OooOo0o(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }
}
