package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f52660OooO00o = {1, 0, 0, -1, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f52661OooO0O0 = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f52662OooO0OO = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void OooO(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.o000oOoO.OooOO0o(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((4294967295L & ((long) iArr3[3])) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                p399o0Oo00oo.o00000OO.OooO0oo(7, iArr3, 4);
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.o000oOoO.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr3, f52660OooO00o))) {
            OooO0OO(iArr3);
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if (p399o0Oo00oo.o00000OO.OooOO0o(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr2, f52660OooO00o))) {
            OooO0OO(iArr2);
        }
    }

    public static void OooO0OO(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & ((long) iArr[3])) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(7, iArr, 4);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        p697oO0OOo0o.o000oOoO.OooO(iArr, iArr2, iArr4);
        OooO0o(iArr4, iArr3);
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = ((((long) iArr[0]) & 4294967295L) - j5) + 0;
        long j9 = ((((long) iArr[1]) & 4294967295L) - j6) + (j8 >> 32);
        iArr2[1] = (int) j9;
        long j10 = ((((long) iArr[2]) & 4294967295L) - j7) + (j9 >> 32);
        iArr2[2] = (int) j10;
        long j11 = (((((long) iArr[3]) & 4294967295L) + j5) - j) + (j10 >> 32);
        long j12 = (((((long) iArr[4]) & 4294967295L) + j6) - j2) + (j11 >> 32);
        iArr2[4] = (int) j12;
        long j13 = (((((long) iArr[5]) & 4294967295L) + j7) - j3) + (j12 >> 32);
        iArr2[5] = (int) j13;
        long j14 = (((((long) iArr[6]) & 4294967295L) + j) - j4) + (j13 >> 32);
        iArr2[6] = (int) j14;
        long j15 = (j14 >> 32) + 1;
        long j16 = (j11 & 4294967295L) + j15;
        long j17 = (j8 & 4294967295L) - j15;
        iArr2[0] = (int) j17;
        long j18 = j17 >> 32;
        if (j18 != 0) {
            long j19 = j18 + (((long) iArr2[1]) & 4294967295L);
            iArr2[1] = (int) j19;
            long j20 = (j19 >> 32) + (4294967295L & ((long) iArr2[2]));
            iArr2[2] = (int) j20;
            j16 += j20 >> 32;
        }
        iArr2[3] = (int) j16;
        if (((j16 >> 32) == 0 || p399o0Oo00oo.o00000OO.OooOOO(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr2, f52660OooO00o))) {
            return;
        }
        OooO0OO(iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr)) {
            p697oO0OOo0o.o000oOoO.OooOOO(iArr2);
        } else {
            p697oO0OOo0o.o000oOoO.OooOO0o(f52660OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0oO(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & ((long) iArr[3])) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || p399o0Oo00oo.o00000OO.OooOOO(7, iArr, 4) == 0) && !(iArr[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr, f52660OooO00o))) {
            return;
        }
        OooO0OO(iArr);
    }

    public static void OooO0oo(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        p697oO0OOo0o.o000oOoO.OooOO0O(iArr, iArr3);
        OooO0o(iArr3, iArr2);
    }

    public static void OooOO0(int[] iArr, int[] iArr2) {
        if (p399o0Oo00oo.o00000OO.OooOOo(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr2, f52660OooO00o))) {
            OooO0OO(iArr2);
        }
    }
}
