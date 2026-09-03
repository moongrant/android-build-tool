package p697oO0OOo0o;

import java.math.BigInteger;
import kotlin.collections.OooO0OO;
import p684oO0000o.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o000oOoO {
    public static void OooO(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = (j8 * j) + 0;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j17 = j;
            long j18 = (j16 * j) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j18;
            int i4 = i + 1;
            long j19 = j2;
            long j20 = (j16 * j2) + (((long) iArr3[i4]) & 4294967295L) + (j18 >>> 32);
            iArr3[i4] = (int) j20;
            int i5 = i + 2;
            long j21 = (j16 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j20 >>> 32);
            iArr3[i5] = (int) j21;
            int i6 = i + 3;
            long j22 = (j16 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j21 >>> 32);
            iArr3[i6] = (int) j22;
            int i7 = i + 4;
            long j23 = (j16 * j5) + (((long) iArr3[i7]) & 4294967295L) + (j22 >>> 32);
            iArr3[i7] = (int) j23;
            int i8 = i + 5;
            long j24 = (j16 * j6) + (((long) iArr3[i8]) & 4294967295L) + (j23 >>> 32);
            iArr3[i8] = (int) j24;
            long j25 = j24 >>> 32;
            int i9 = i + 6;
            long j26 = (j16 * j7) + (((long) iArr3[i9]) & 4294967295L) + j25;
            iArr3[i9] = (int) j26;
            iArr3[i + 7] = (int) (j26 >>> 32);
            i = i4;
            j = j17;
            j2 = j19;
        }
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
        return (int) (j7 >>> 32);
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
        return (int) (j7 >>> 32);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static boolean OooO0Oo(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0o(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    public static int[] OooO0o0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static boolean OooO0oO(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0oo(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int OooOO0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & 4294967295L;
            int i2 = i + 0;
            long j11 = j6;
            long j12 = (j10 * j) + (((long) iArr3[i2]) & 4294967295L) + 0;
            iArr3[i2] = (int) j12;
            int i3 = i + 1;
            long j13 = j2;
            long j14 = (j10 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j12 >>> 32);
            iArr3[i3] = (int) j14;
            int i4 = i + 2;
            long j15 = (j10 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j14 >>> 32);
            iArr3[i4] = (int) j15;
            int i5 = i + 3;
            long j16 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j15 >>> 32);
            iArr3[i5] = (int) j16;
            int i6 = i + 4;
            long j17 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j16 >>> 32);
            iArr3[i6] = (int) j17;
            int i7 = i + 5;
            long j18 = (j10 * j11) + (((long) iArr3[i7]) & 4294967295L) + (j17 >>> 32);
            iArr3[i7] = (int) j18;
            int i8 = i + 6;
            long j19 = (j10 * j9) + (((long) iArr3[i8]) & 4294967295L) + (j18 >>> 32);
            iArr3[i8] = (int) j19;
            int i9 = i + 7;
            long j20 = j8 + (((long) iArr3[i9]) & 4294967295L) + (j19 >>> 32);
            iArr3[i9] = (int) j20;
            j8 = j20 >>> 32;
            i = i3;
            j7 = j9;
            j6 = j11;
            j3 = j3;
            j2 = j13;
        }
        return (int) j8;
    }

    public static void OooOO0O(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 6;
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
                int i12 = (int) j26;
                iArr2[4] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long jOooO0O3 = OooO0OO.OooO0O0(j21, j5, j26 >>> 32, j20);
                long jOooO0O4 = OooO0OO.OooO0O0(j21, j8, jOooO0O3 >>> 32, j23);
                long jOooO0O5 = OooO0OO.OooO0O0(j21, j13, jOooO0O4 >>> 32, j25);
                long j27 = jOooO0O4 & 4294967295L;
                long j28 = j24 + (jOooO0O5 >>> 32);
                long j29 = ((long) iArr[5]) & 4294967295L;
                long j30 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j31 = j28 & 4294967295L;
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j29 * j) + (jOooO0O3 & 4294967295L);
                int i14 = (int) j34;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long jOooO0O6 = OooO0OO.OooO0O0(j29, j5, j34 >>> 32, j27);
                long jOooO0O7 = OooO0OO.OooO0O0(j29, j8, jOooO0O6 >>> 32, jOooO0O5 & 4294967295L);
                long jOooO0O8 = OooO0OO.OooO0O0(j29, j13, jOooO0O7 >>> 32, j31);
                long j35 = jOooO0O7 & 4294967295L;
                long jOooO0O9 = OooO0OO.OooO0O0(j29, j21, jOooO0O8 >>> 32, j33);
                long j36 = j32 + (jOooO0O9 >>> 32);
                long j37 = jOooO0O9 & 4294967295L;
                long j38 = ((long) iArr[6]) & 4294967295L;
                long j39 = (((long) iArr2[11]) & 4294967295L) + (j36 >>> 32);
                long j40 = (((long) iArr2[12]) & 4294967295L) + (j39 >>> 32);
                long j41 = 4294967295L & j39;
                long j42 = (j * j38) + (jOooO0O6 & 4294967295L);
                int i16 = (int) j42;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long jOooO0O10 = OooO0OO.OooO0O0(j38, j5, j42 >>> 32, j35);
                long jOooO0O11 = OooO0OO.OooO0O0(j38, j8, jOooO0O10 >>> 32, jOooO0O8 & 4294967295L);
                long jOooO0O12 = OooO0OO.OooO0O0(j38, j13, jOooO0O11 >>> 32, j37);
                long jOooO0O13 = OooO0OO.OooO0O0(j38, j21, jOooO0O12 >>> 32, j36 & 4294967295L);
                long jOooO0O14 = OooO0OO.OooO0O0(j38, j29, jOooO0O13 >>> 32, j41);
                long j43 = j40 + (jOooO0O14 >>> 32);
                int i18 = (int) jOooO0O10;
                iArr2[7] = (i18 << 1) | i17;
                int i19 = (int) jOooO0O11;
                iArr2[8] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) jOooO0O12;
                iArr2[9] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) jOooO0O13;
                iArr2[10] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) jOooO0O14;
                iArr2[11] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j43;
                iArr2[12] = i26 | (i27 << 1);
                iArr2[13] = (i27 >>> 31) | ((iArr2[13] + ((int) (j43 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static int OooOO0o(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >> 32);
    }

    public static void OooOOO(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static BigInteger OooOOO0(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                OooOO0.OooO0O0(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
