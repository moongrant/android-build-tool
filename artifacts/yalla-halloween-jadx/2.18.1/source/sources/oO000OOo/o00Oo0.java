package oO000OOo;

import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f52639OooO00o = {-1, -1, -2, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f52640OooO0O0 = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f52641OooO0OO = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void OooO(int[] iArr, int[] iArr2, int[] iArr3) {
        if (oO00O0o0.OooOo(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((4294967295L & ((long) iArr3[2])) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                p399o0Oo00oo.o00000OO.OooO0oo(6, iArr3, 3);
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (oO00O0o0.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && oO00O0o0.OooOOO(iArr3, f52639OooO00o))) {
            OooO0O0(iArr3);
        }
    }

    public static void OooO0O0(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & ((long) iArr[2])) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(6, iArr, 3);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        oO00O0o0.OooOOoo(iArr, iArr2, iArr4);
        OooO0o0(iArr4, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        if (!oO00O0o0.OooOOo0(iArr)) {
            oO00O0o0.OooOo(f52639OooO00o, iArr, iArr2);
            return;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        iArr2[4] = 0;
        iArr2[5] = 0;
    }

    public static void OooO0o(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[2])) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || p399o0Oo00oo.o00000OO.OooOOO(6, iArr, 3) == 0) && !(iArr[5] == -1 && oO00O0o0.OooOOO(iArr, f52639OooO00o))) {
            return;
        }
        OooO0O0(iArr);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = (((long) iArr[0]) & 4294967295L) + j5 + 0;
        int i = (int) j7;
        long j8 = (((long) iArr[1]) & 4294967295L) + j6 + (j7 >> 32);
        iArr2[1] = (int) j8;
        long j9 = j5 + j3;
        long j10 = j6 + j4;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = j11 & 4294967295L;
        long j13 = (((long) iArr[3]) & 4294967295L) + j10 + (j11 >> 32);
        iArr2[3] = (int) j13;
        long j14 = j10 - j2;
        long j15 = (((long) iArr[4]) & 4294967295L) + (j9 - j) + (j13 >> 32);
        iArr2[4] = (int) j15;
        long j16 = (((long) iArr[5]) & 4294967295L) + j14 + (j15 >> 32);
        iArr2[5] = (int) j16;
        long j17 = j16 >> 32;
        long j18 = j12 + j17;
        long j19 = j17 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (4294967295L & ((long) iArr2[1]));
            iArr2[1] = (int) j21;
            j18 += j21 >> 32;
        }
        iArr2[2] = (int) j18;
        if (((j18 >> 32) == 0 || p399o0Oo00oo.o00000OO.OooOOO(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && oO00O0o0.OooOOO(iArr2, f52639OooO00o))) {
            return;
        }
        OooO0O0(iArr2);
    }

    public static void OooO0oO(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        oO00O0o0.OooOo0O(iArr, iArr3);
        OooO0o0(iArr3, iArr2);
    }

    public static void OooO0oo(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        oO00O0o0.OooOo0O(iArr, iArr3);
        while (true) {
            OooO0o0(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                oO00O0o0.OooOo0O(iArr2, iArr3);
            }
        }
    }
}
