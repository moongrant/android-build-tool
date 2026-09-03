package p231o00oOo0o;

import com.google.android.gms.internal.measurement.zzkh;
import kotlin.collections.OooO0OO;
import p399o0Oo00oo.o00000OO;
import p697oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o implements o0OOO0o, zzkh {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final int[] f33942Oooo0o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        int iOooO00o = o00000OO.OooO00o(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iOooO00o > 511 || (iOooO00o == 511 && o00000OO.OooO(16, iArr3, f33942Oooo0o))) {
            iOooO00o = (o00000OO.OooOOO0(iArr3) + iOooO00o) & 511;
        }
        iArr3[16] = iOooO00o;
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        int i;
        o0OoOo0.OooOOo0(iArr, iArr2);
        int i2 = 8;
        long j = 4294967295L;
        long j2 = ((long) iArr[8]) & 4294967295L;
        int i3 = 16;
        int i4 = 7;
        int i5 = 16;
        int i6 = 0;
        while (true) {
            int i7 = i4 - 1;
            long j3 = j & ((long) iArr[i4 + i2]);
            long j4 = j3 * j3;
            int i8 = i5 - 1;
            iArr2[i3 + i8] = (i6 << 31) | ((int) (j4 >>> 33));
            i5 = i8 - 1;
            iArr2[i3 + i5] = (int) (j4 >>> 1);
            i = (int) j4;
            if (i7 <= 0) {
                break;
            }
            i2 = 8;
            i6 = i;
            j = 4294967295L;
            i4 = i7;
            i3 = 16;
        }
        long j5 = j2 * j2;
        long j6 = (((long) (i << 31)) & 4294967295L) | (j5 >>> 33);
        iArr2[16] = (int) j5;
        int i9 = 1 & ((int) (j5 >>> 32));
        long j7 = ((long) iArr[9]) & 4294967295L;
        long j8 = 4294967295L & ((long) iArr2[18]);
        long j9 = (j7 * j2) + j6;
        int i10 = (int) j9;
        iArr2[17] = i9 | (i10 << 1);
        int i11 = i10 >>> 31;
        long j10 = ((long) iArr[10]) & 4294967295L;
        long j11 = ((long) iArr2[19]) & 4294967295L;
        long j12 = ((long) iArr2[20]) & 4294967295L;
        long j13 = (j10 * j2) + j8 + (j9 >>> 32);
        int i12 = (int) j13;
        iArr2[18] = i11 | (i12 << 1);
        int i13 = i12 >>> 31;
        long jOooO0O0 = OooO0OO.OooO0O0(j10, j7, j13 >>> 32, j11);
        long j14 = j12 + (jOooO0O0 >>> 32);
        long j15 = ((long) iArr[11]) & 4294967295L;
        long j16 = (((long) iArr2[21]) & 4294967295L) + (j14 >>> 32);
        long j17 = (((long) iArr2[22]) & 4294967295L) + (j16 >>> 32);
        long j18 = (j15 * j2) + (jOooO0O0 & 4294967295L);
        int i14 = (int) j18;
        iArr2[19] = i13 | (i14 << 1);
        long jOooO0O1 = OooO0OO.OooO0O0(j15, j7, j18 >>> 32, j14 & 4294967295L);
        long jOooO0O2 = OooO0OO.OooO0O0(j15, j10, jOooO0O1 >>> 32, j16 & 4294967295L);
        long j19 = j17 + (jOooO0O2 >>> 32);
        long j20 = jOooO0O2 & 4294967295L;
        long j21 = ((long) iArr[12]) & 4294967295L;
        long j22 = (((long) iArr2[23]) & 4294967295L) + (j19 >>> 32);
        long j23 = j19 & 4294967295L;
        long j24 = (((long) iArr2[24]) & 4294967295L) + (j22 >>> 32);
        long j25 = j22 & 4294967295L;
        long j26 = (j21 * j2) + (jOooO0O1 & 4294967295L);
        int i15 = (int) j26;
        iArr2[20] = (i14 >>> 31) | (i15 << 1);
        int i16 = i15 >>> 31;
        long jOooO0O3 = OooO0OO.OooO0O0(j21, j7, j26 >>> 32, j20);
        long jOooO0O4 = OooO0OO.OooO0O0(j21, j10, jOooO0O3 >>> 32, j23);
        long jOooO0O5 = OooO0OO.OooO0O0(j21, j15, jOooO0O4 >>> 32, j25);
        long j27 = jOooO0O4 & 4294967295L;
        long j28 = j24 + (jOooO0O5 >>> 32);
        long j29 = ((long) iArr[13]) & 4294967295L;
        long j30 = (((long) iArr2[25]) & 4294967295L) + (j28 >>> 32);
        long j31 = j28 & 4294967295L;
        long j32 = (((long) iArr2[26]) & 4294967295L) + (j30 >>> 32);
        long j33 = j30 & 4294967295L;
        long j34 = (j29 * j2) + (jOooO0O3 & 4294967295L);
        int i17 = (int) j34;
        iArr2[21] = i16 | (i17 << 1);
        int i18 = i17 >>> 31;
        long jOooO0O6 = OooO0OO.OooO0O0(j29, j7, j34 >>> 32, j27);
        long jOooO0O7 = OooO0OO.OooO0O0(j29, j10, jOooO0O6 >>> 32, jOooO0O5 & 4294967295L);
        long jOooO0O8 = OooO0OO.OooO0O0(j29, j15, jOooO0O7 >>> 32, j31);
        long j35 = jOooO0O7 & 4294967295L;
        long jOooO0O9 = OooO0OO.OooO0O0(j29, j21, jOooO0O8 >>> 32, j33);
        long j36 = j32 + (jOooO0O9 >>> 32);
        long j37 = jOooO0O9 & 4294967295L;
        long j38 = ((long) iArr[14]) & 4294967295L;
        long j39 = (((long) iArr2[27]) & 4294967295L) + (j36 >>> 32);
        long j40 = j36 & 4294967295L;
        long j41 = (((long) iArr2[28]) & 4294967295L) + (j39 >>> 32);
        long j42 = j39 & 4294967295L;
        long j43 = (j38 * j2) + (jOooO0O6 & 4294967295L);
        int i19 = (int) j43;
        iArr2[22] = i18 | (i19 << 1);
        int i20 = i19 >>> 31;
        long jOooO0O10 = OooO0OO.OooO0O0(j38, j7, j43 >>> 32, j35);
        long jOooO0O11 = OooO0OO.OooO0O0(j38, j10, jOooO0O10 >>> 32, jOooO0O8 & 4294967295L);
        long jOooO0O12 = OooO0OO.OooO0O0(j38, j15, jOooO0O11 >>> 32, j37);
        long j44 = jOooO0O11 & 4294967295L;
        long jOooO0O13 = OooO0OO.OooO0O0(j38, j21, jOooO0O12 >>> 32, j40);
        long j45 = jOooO0O12 & 4294967295L;
        long jOooO0O14 = OooO0OO.OooO0O0(j38, j29, jOooO0O13 >>> 32, j42);
        long j46 = jOooO0O13 & 4294967295L;
        long j47 = j41 + (jOooO0O14 >>> 32);
        long j48 = ((long) iArr[15]) & 4294967295L;
        long j49 = (((long) iArr2[29]) & 4294967295L) + (j47 >>> 32);
        long j50 = j47 & 4294967295L;
        long j51 = (((long) iArr2[30]) & 4294967295L) + (j49 >>> 32);
        long j52 = j49 & 4294967295L;
        long j53 = (j2 * j48) + (jOooO0O10 & 4294967295L);
        int i21 = (int) j53;
        iArr2[23] = i20 | (i21 << 1);
        long jOooO0O15 = OooO0OO.OooO0O0(j7, j48, j53 >>> 32, j44);
        long jOooO0O16 = OooO0OO.OooO0O0(j48, j10, jOooO0O15 >>> 32, j45);
        long jOooO0O17 = OooO0OO.OooO0O0(j48, j15, jOooO0O16 >>> 32, j46);
        long jOooO0O18 = OooO0OO.OooO0O0(j48, j21, jOooO0O17 >>> 32, jOooO0O14 & 4294967295L);
        long jOooO0O19 = OooO0OO.OooO0O0(j48, j29, jOooO0O18 >>> 32, j50);
        long jOooO0O20 = OooO0OO.OooO0O0(j48, j38, jOooO0O19 >>> 32, j52);
        long j54 = j51 + (jOooO0O20 >>> 32);
        int i22 = (int) jOooO0O15;
        iArr2[24] = (i21 >>> 31) | (i22 << 1);
        int i23 = i22 >>> 31;
        int i24 = (int) jOooO0O16;
        iArr2[25] = i23 | (i24 << 1);
        int i25 = i24 >>> 31;
        int i26 = (int) jOooO0O17;
        iArr2[26] = i25 | (i26 << 1);
        int i27 = i26 >>> 31;
        int i28 = (int) jOooO0O18;
        iArr2[27] = i27 | (i28 << 1);
        int i29 = i28 >>> 31;
        int i30 = (int) jOooO0O19;
        iArr2[28] = i29 | (i30 << 1);
        int i31 = i30 >>> 31;
        int i32 = (int) jOooO0O20;
        iArr2[29] = i31 | (i32 << 1);
        int i33 = i32 >>> 31;
        int i34 = (int) j54;
        iArr2[30] = i33 | (i34 << 1);
        iArr2[31] = (i34 >>> 31) | ((iArr2[31] + ((int) (j54 >>> 32))) << 1);
        int iOooO0Oo = o0OoOo0.OooO0Oo(iArr2, iArr2);
        int iOooO0OO = o0OoOo0.OooO0OO(iArr2, 24, iArr2, 16, o0OoOo0.OooO0OO(iArr2, 0, iArr2, 8, 0) + iOooO0Oo) + iOooO0Oo;
        int[] iArr3 = new int[8];
        o0OoOo0.OooO0o0(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        o0OoOo0.OooOOo0(iArr3, iArr4);
        o00000OO.OooO0o(32, o00000OO.OooOoO0(16, iArr4, iArr2, 8) + iOooO0OO, iArr2, 24);
        int i35 = iArr[16];
        long j55 = ((long) (i35 << 1)) & 4294967295L;
        long j56 = 0;
        int i36 = 0;
        while (true) {
            int i37 = i36 + 16;
            long j57 = ((((long) iArr[0 + i36]) & 4294967295L) * j55) + (((long) iArr2[i37]) & 4294967295L) + j56;
            iArr2[i37] = (int) j57;
            long j58 = j57 >>> 32;
            i36++;
            if (i36 >= 16) {
                iArr2[32] = (i35 * i35) + ((int) j58);
                return;
            }
            j56 = j58;
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[33];
        o0OoOo0.OooOOOO(iArr, iArr2, iArr4);
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = 0;
        long j11 = (j9 * j) + 0;
        iArr4[16] = (int) j11;
        long j12 = (j9 * j2) + (j11 >>> 32);
        iArr4[17] = (int) j12;
        long j13 = (j9 * j3) + (j12 >>> 32);
        iArr4[18] = (int) j13;
        long j14 = (j9 * j4) + (j13 >>> 32);
        iArr4[19] = (int) j14;
        long j15 = (j9 * j5) + (j14 >>> 32);
        iArr4[20] = (int) j15;
        long j16 = (j9 * j6) + (j15 >>> 32);
        iArr4[21] = (int) j16;
        long j17 = (j9 * j7) + (j16 >>> 32);
        iArr4[22] = (int) j17;
        long j18 = (j9 * j8) + (j17 >>> 32);
        iArr4[23] = (int) j18;
        iArr4[24] = (int) (j18 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 16;
        while (i2 < 8) {
            i3 += i;
            long j19 = ((long) iArr[i2 + 8]) & 4294967295L;
            int i4 = i3 + 0;
            long j20 = (j19 * j) + (((long) iArr4[i4]) & 4294967295L) + 0;
            iArr4[i4] = (int) j20;
            int i5 = i3 + 1;
            long j21 = (j19 * j2) + (((long) iArr4[i5]) & 4294967295L) + (j20 >>> 32);
            iArr4[i5] = (int) j21;
            int i6 = i3 + 2;
            long j22 = (j19 * j3) + (((long) iArr4[i6]) & 4294967295L) + (j21 >>> 32);
            iArr4[i6] = (int) j22;
            int i7 = i3 + 3;
            long j23 = (j19 * j4) + (((long) iArr4[i7]) & 4294967295L) + (j22 >>> 32);
            iArr4[i7] = (int) j23;
            int i8 = i3 + 4;
            long j24 = (j19 * j5) + (((long) iArr4[i8]) & 4294967295L) + (j23 >>> 32);
            iArr4[i8] = (int) j24;
            int i9 = i3 + 5;
            long j25 = (j19 * j6) + (((long) iArr4[i9]) & 4294967295L) + (j24 >>> 32);
            iArr4[i9] = (int) j25;
            int i10 = i3 + 6;
            long j26 = (j19 * j7) + (((long) iArr4[i10]) & 4294967295L) + (j25 >>> 32);
            iArr4[i10] = (int) j26;
            long j27 = j26 >>> 32;
            int i11 = i3 + 7;
            long j28 = (j19 * j8) + (((long) iArr4[i11]) & 4294967295L) + j27;
            iArr4[i11] = (int) j28;
            iArr4[i3 + 8] = (int) (j28 >>> 32);
            i2++;
            j2 = j2;
            j3 = j3;
            i = 1;
        }
        int iOooO0Oo = o0OoOo0.OooO0Oo(iArr4, iArr4);
        int i12 = 0;
        int iOooO0OO = o0OoOo0.OooO0OO(iArr4, 24, iArr4, 16, o0OoOo0.OooO0OO(iArr4, 0, iArr4, 8, 0) + iOooO0Oo) + iOooO0Oo;
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        boolean z = o0OoOo0.OooO0o0(iArr, iArr, iArr5) != o0OoOo0.OooO0o0(iArr2, iArr2, iArr6);
        int[] iArr7 = new int[16];
        o0OoOo0.OooOOOO(iArr5, iArr6, iArr7);
        o00000OO.OooO0o(32, iOooO0OO + (z ? o00000OO.OooO0o0(16, iArr7, iArr4, 8) : o00000OO.OooOoO0(16, iArr7, iArr4, 8)), iArr4, 24);
        int i13 = iArr[16];
        int i14 = iArr2[16];
        long j29 = ((long) i13) & 4294967295L;
        long j30 = ((long) i14) & 4294967295L;
        while (true) {
            long j31 = j29;
            int i15 = i12 + 16;
            long j32 = ((((long) iArr[i12]) & 4294967295L) * j30) + ((((long) iArr2[i12]) & 4294967295L) * j29) + (((long) iArr4[i15]) & 4294967295L) + j10;
            iArr4[i15] = (int) j32;
            long j33 = j32 >>> 32;
            i12++;
            if (i12 >= 16) {
                iArr4[32] = (i13 * i14) + ((int) j33);
                OooO0o0(iArr4, iArr3);
                return;
            } else {
                j10 = j33;
                j29 = j31;
            }
        }
    }

    public static void OooO0o(int[] iArr) {
        int i = iArr[16];
        int iOooO0oO = o00000OO.OooO0oO(16, i >>> 9, iArr) + (i & 511);
        if (iOooO0oO > 511 || (iOooO0oO == 511 && o00000OO.OooO(16, iArr, f33942Oooo0o))) {
            iOooO0oO = (o00000OO.OooOOO0(iArr) + iOooO0oO) & 511;
        }
        iArr[16] = iOooO0oO;
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i4 = iArr[16 + i3];
            iArr2[i3 + 0] = (i2 << (-9)) | (i4 >>> 9);
            i2 = i4;
        }
        int iOooO0Oo = o00000OO.OooO0Oo(16, iArr, iArr2) + ((i2 << (-9)) >>> 23) + (i >>> 9);
        if (iOooO0Oo > 511 || (iOooO0Oo == 511 && o00000OO.OooO(16, iArr2, f33942Oooo0o))) {
            iOooO0Oo = (o00000OO.OooOOO0(iArr2) + iOooO0Oo) & 511;
        }
        iArr2[16] = iOooO0Oo;
    }

    public static void OooO0oO(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        OooO0OO(iArr, iArr3);
        OooO0o0(iArr3, iArr2);
    }

    public static void OooO0oo(int[] iArr, int[] iArr2, int[] iArr3) {
        int iOooOo0O = (o00000OO.OooOo0O(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iOooOo0O < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                } else {
                    i2++;
                }
            }
            iOooOo0O = (iOooOo0O + i) & 511;
        }
        iArr3[16] = iOooOo0O;
    }

    @Override // p231o00oOo0o.o0OOO0o
    public void OooO00o() {
    }
}
