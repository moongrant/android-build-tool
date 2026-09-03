package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f52574OooO00o = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f52575OooO0O0 = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f52576OooO0OO = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void OooO(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.Oooo0.OooOO0O(iArr, iArr2, iArr3) != 0) {
            p399o0Oo00oo.o00000OO.OooOo0o(5, 21389, iArr3);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.Oooo0.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr3, f52574OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(5, 21389, iArr3);
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        p697oO0OOo0o.Oooo0.OooO0oo(iArr, iArr2, iArr4);
        OooO0o0(iArr4, iArr3);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((p697oO0OOo0o.Oooo0.OooO(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && p399o0Oo00oo.o00000OO.OooOO0O(10, iArr3, f52575OooO0O0))) && p399o0Oo00oo.o00000OO.OooO0Oo(7, f52576OooO0OO, iArr3) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(10, iArr3, 7);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        if (!p697oO0OOo0o.Oooo0.OooO0oO(iArr)) {
            p697oO0OOo0o.Oooo0.OooOO0O(f52574OooO00o, iArr, iArr2);
            return;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        iArr2[4] = 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    public static void OooO0o(int i, int[] iArr) {
        if (i == 0) {
            if (iArr[4] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) 21389) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? p399o0Oo00oo.o00000OO.OooOOOO(5, iArr, 3) : 0) == 0) {
            if (iArr[4] == -1 || !p697oO0OOo0o.Oooo0.OooO0o0(iArr, f52574OooO00o)) {
                return;
            }
        }
        p399o0Oo00oo.o00000OO.OooO0O0(5, 21389, iArr);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        long j = ((long) 21389) & 4294967295L;
        long j2 = ((long) iArr[5]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j3;
        long j4 = ((long) iArr[6]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr2[1] = (int) j5;
        long j6 = ((long) iArr[7]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr2[2] = (int) j7;
        long j8 = ((long) iArr[8]) & 4294967295L;
        long j9 = (j * j8) + j6 + (((long) iArr[3]) & 4294967295L) + (j7 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = ((long) iArr[9]) & 4294967295L;
        long j11 = (j * j10) + j8 + (((long) iArr[4]) & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = (j11 >>> 32) + j10;
        long j13 = j12 & 4294967295L;
        long j14 = (j * j13) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j14;
        long j15 = j12 >>> 32;
        long j16 = (j * j15) + j13 + (((long) iArr2[1]) & 4294967295L) + (j14 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j15 + (((long) iArr2[2]) & 4294967295L) + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (4294967295L & ((long) iArr2[3]));
        iArr2[3] = (int) j18;
        if (((j18 >>> 32) == 0 ? 0 : p399o0Oo00oo.o00000OO.OooOOOO(5, iArr2, 4)) != 0 || (iArr2[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr2, f52574OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(5, 21389, iArr2);
        }
    }

    public static void OooO0oO(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        p697oO0OOo0o.Oooo0.OooOO0(iArr, iArr3);
        OooO0o0(iArr3, iArr2);
    }

    public static void OooO0oo(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        p697oO0OOo0o.Oooo0.OooOO0(iArr, iArr3);
        while (true) {
            OooO0o0(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                p697oO0OOo0o.Oooo0.OooOO0(iArr2, iArr3);
            }
        }
    }

    public static void OooOO0(int[] iArr, int[] iArr2) {
        if (p399o0Oo00oo.o00000OO.OooOOo(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr2, f52574OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(5, 21389, iArr2);
        }
    }
}
