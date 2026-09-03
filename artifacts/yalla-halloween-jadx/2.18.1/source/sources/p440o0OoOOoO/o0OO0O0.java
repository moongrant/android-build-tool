package p440o0OoOOoO;

import p029Oooo0oO.o0o0Oo;
import p436o0OoOOOO.o0O000Oo;
import p436o0OoOOOO.o0O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0O0 {
    public static void OooO00o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 7;
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        OooO00o(jArr, jArr4);
        OooO00o(jArr2, jArr5);
        int i2 = 0;
        while (i2 < i) {
            long j = jArr5[i2];
            long[] jArr6 = new long[8];
            jArr6[1] = j;
            jArr6[2] = jArr6[1] << 1;
            jArr6[3] = jArr6[2] ^ j;
            jArr6[4] = jArr6[2] << 1;
            jArr6[5] = jArr6[4] ^ j;
            jArr6[6] = jArr6[3] << 1;
            jArr6[i] = jArr6[6] ^ j;
            int i3 = 0;
            while (i3 < i) {
                long j2 = jArr4[i3];
                int i4 = (int) j2;
                long j3 = jArr6[i4 & 7] ^ (jArr6[(i4 >>> 3) & i] << 3);
                int i5 = i2;
                int i6 = 54;
                long j4 = 0;
                while (true) {
                    int i7 = (int) (j2 >>> i6);
                    long j5 = (jArr6[(i7 >>> 3) & i] << 3) ^ jArr6[i7 & 7];
                    j3 ^= j5 << i6;
                    j4 ^= j5 >>> (-i6);
                    i6 -= 6;
                    if (i6 <= 0) {
                        break;
                    } else {
                        i = 7;
                    }
                }
                int i8 = i5 + i3;
                jArr3[i8] = jArr3[i8] ^ (j3 & 576460752303423487L);
                int i9 = i8 + 1;
                jArr3[i9] = jArr3[i9] ^ ((j4 << 5) ^ (j3 >>> 59));
                i3++;
                i2 = i5;
                i = 7;
            }
            i2++;
            i = 7;
        }
        long j6 = jArr3[0];
        long j7 = jArr3[1];
        long j8 = jArr3[2];
        long j9 = jArr3[3];
        long j10 = jArr3[4];
        long j11 = jArr3[5];
        long j12 = jArr3[6];
        long j13 = jArr3[7];
        long j14 = jArr3[8];
        long j15 = jArr3[9];
        long j16 = jArr3[10];
        long j17 = jArr3[11];
        long j18 = jArr3[12];
        long j19 = jArr3[13];
        jArr3[0] = j6 ^ (j7 << 59);
        jArr3[1] = (j7 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j12 << 34);
        jArr3[6] = (j12 >>> 30) ^ (j13 << 29);
        jArr3[7] = (j13 >>> 35) ^ (j14 << 24);
        jArr3[8] = (j14 >>> 40) ^ (j15 << 19);
        jArr3[9] = (j15 >>> 45) ^ (j16 << 14);
        jArr3[10] = (j16 >>> 50) ^ (j17 << 9);
        jArr3[11] = ((j17 >>> 55) ^ (j18 << 4)) ^ (j19 << 63);
        jArr3[12] = (j18 >>> 60) ^ (j19 >>> 1);
        jArr3[13] = 0;
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            o0o0Oo.OooO0OO(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = o0o0Oo.OooO0O0((int) jArr[6]);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public static boolean OooO0Oo(o0O000Oo o0o000oo2) {
        boolean z;
        if ("player".equals(o0o000oo2.f39980OooO0O0) || "vine".equals(o0o000oo2.f39980OooO0O0)) {
            o0O0O0O o0o0o0o = (o0O0O0O) o0o000oo2.f39979OooO00o.OooO00o("site");
            if (o0o0o0o != null) {
                try {
                    if (Long.parseLong(o0o0o0o.f40045OooO00o) == 586671909) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        OooO0O0(jArr, jArr2, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        OooO0O0(jArr, jArr2, jArr4);
        OooO0oO(jArr4, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    public static void OooO0oo(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[13];
        OooO0OO(jArr, jArr3);
        while (true) {
            OooO0oO(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                OooO0OO(jArr2, jArr3);
            }
        }
    }
}
