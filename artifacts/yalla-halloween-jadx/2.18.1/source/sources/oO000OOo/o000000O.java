package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f52589OooO00o = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f52590OooO0O0 = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f52591OooO0OO = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        p697oO0OOo0o.o0OoOo0.OooOOOO(iArr, iArr2, iArr4);
        OooO0O0(iArr4, iArr3);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        long j = ((long) 977) & 4294967295L;
        long j2 = ((long) iArr[8]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j3;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr2[1] = (int) j5;
        long j6 = ((long) iArr[10]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr2[2] = (int) j7;
        long j8 = ((long) iArr[11]) & 4294967295L;
        long j9 = (j * j8) + j6 + (((long) iArr[3]) & 4294967295L) + (j7 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = ((long) iArr[12]) & 4294967295L;
        long j11 = (j * j10) + j8 + (((long) iArr[4]) & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = ((long) iArr[13]) & 4294967295L;
        long j13 = (j * j12) + j10 + (((long) iArr[5]) & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = ((long) iArr[14]) & 4294967295L;
        long j15 = (j * j14) + j12 + (((long) iArr[6]) & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = j15 >>> 32;
        long j17 = ((long) iArr[15]) & 4294967295L;
        long j18 = (j * j17) + j14 + (((long) iArr[7]) & 4294967295L) + j16;
        iArr2[7] = (int) j18;
        long j19 = (j18 >>> 32) + j17;
        long j20 = j19 & 4294967295L;
        long j21 = (j * j20) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j21;
        long j22 = j19 >>> 32;
        long j23 = (j * j22) + j20 + (((long) iArr2[1]) & 4294967295L) + (j21 >>> 32);
        iArr2[1] = (int) j23;
        long j24 = j22 + (((long) iArr2[2]) & 4294967295L) + (j23 >>> 32);
        iArr2[2] = (int) j24;
        long j25 = (j24 >>> 32) + (4294967295L & ((long) iArr2[3]));
        iArr2[3] = (int) j25;
        if (((j25 >>> 32) == 0 ? 0 : p399o0Oo00oo.o00000OO.OooOOOO(8, iArr2, 4)) != 0 || (iArr2[7] == -1 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr2, f52589OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(8, 977, iArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    public static void OooO0OO(int i, int[] iArr) {
        if (i == 0) {
            if (iArr[7] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) 977) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? p399o0Oo00oo.o00000OO.OooOOOO(8, iArr, 3) : 0) == 0) {
            if (iArr[7] == -1 || !p697oO0OOo0o.o0OoOo0.OooOO0(iArr, f52589OooO00o)) {
                return;
            }
        }
        p399o0Oo00oo.o00000OO.OooO0O0(8, 977, iArr);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        p697oO0OOo0o.o0OoOo0.OooOOo0(iArr, iArr3);
        OooO0O0(iArr3, iArr2);
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.o0OoOo0.OooOOoo(iArr, iArr2, iArr3) != 0) {
            p399o0Oo00oo.o00000OO.OooOo0o(8, 977, iArr3);
        }
    }

    public static void OooO0o0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        p697oO0OOo0o.o0OoOo0.OooOOo0(iArr, iArr3);
        while (true) {
            OooO0O0(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                p697oO0OOo0o.o0OoOo0.OooOOo0(iArr2, iArr3);
            }
        }
    }
}
