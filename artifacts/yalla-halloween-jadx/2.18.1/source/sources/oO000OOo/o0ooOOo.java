package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f52654OooO00o = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f52655OooO0O0 = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f52656OooO0OO = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        p697oO0OOo0o.o000oOoO.OooO(iArr, iArr2, iArr4);
        OooO0O0(iArr4, iArr3);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        long j = ((long) 6803) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j3;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr2[1] = (int) j5;
        long j6 = ((long) iArr[9]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr2[2] = (int) j7;
        long j8 = ((long) iArr[10]) & 4294967295L;
        long j9 = (j * j8) + j6 + (((long) iArr[3]) & 4294967295L) + (j7 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = ((long) iArr[11]) & 4294967295L;
        long j11 = (j * j10) + j8 + (((long) iArr[4]) & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = ((long) iArr[12]) & 4294967295L;
        long j13 = (j * j12) + j10 + (((long) iArr[5]) & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = ((long) iArr[13]) & 4294967295L;
        long j15 = (j * j14) + j12 + (((long) iArr[6]) & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + j14;
        long j17 = j16 & 4294967295L;
        long j18 = (j * j17) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j18;
        long j19 = j16 >>> 32;
        long j20 = (j * j19) + j17 + (((long) iArr2[1]) & 4294967295L) + (j18 >>> 32);
        iArr2[1] = (int) j20;
        long j21 = j19 + (((long) iArr2[2]) & 4294967295L) + (j20 >>> 32);
        iArr2[2] = (int) j21;
        long j22 = (j21 >>> 32) + (4294967295L & ((long) iArr2[3]));
        iArr2[3] = (int) j22;
        if (((j22 >>> 32) == 0 ? 0 : p399o0Oo00oo.o00000OO.OooOOOO(7, iArr2, 4)) != 0 || (iArr2[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr2, f52654OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(7, 6803, iArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    public static void OooO0OO(int i, int[] iArr) {
        if (i == 0) {
            if (iArr[6] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) 6803) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? p399o0Oo00oo.o00000OO.OooOOOO(7, iArr, 3) : 0) == 0) {
            if (iArr[6] == -1 || !p697oO0OOo0o.o000oOoO.OooO0o(iArr, f52654OooO00o)) {
                return;
            }
        }
        p399o0Oo00oo.o00000OO.OooO0O0(7, 6803, iArr);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        p697oO0OOo0o.o000oOoO.OooOO0O(iArr, iArr3);
        OooO0O0(iArr3, iArr2);
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.o000oOoO.OooOO0o(iArr, iArr2, iArr3) != 0) {
            p399o0Oo00oo.o00000OO.OooOo0o(7, 6803, iArr3);
        }
    }

    public static void OooO0o0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        p697oO0OOo0o.o000oOoO.OooOO0O(iArr, iArr3);
        while (true) {
            OooO0O0(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                p697oO0OOo0o.o000oOoO.OooOO0O(iArr2, iArr3);
            }
        }
    }
}
