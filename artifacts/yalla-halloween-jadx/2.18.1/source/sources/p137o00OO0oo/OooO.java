package p137o00OO0oo;

import p029Oooo0oO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f31646OooO00o;

    public static void OooO(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        OooO0o0(jArr, jArr3);
        OooO0oo(jArr3, jArr2);
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        OooO0O0(jArr, jArr4);
        OooO0O0(jArr2, jArr5);
        OooO0Oo(jArr4[0], jArr5[0], jArr3, 0);
        OooO0Oo(jArr4[1], jArr5[1], jArr3, 1);
        OooO0Oo(jArr4[2], jArr5[2], jArr3, 2);
        OooO0Oo(jArr4[3], jArr5[3], jArr3, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        OooO0Oo(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        OooO0Oo(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        OooO0Oo(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        OooO0Oo(j, j3, jArr6, 0);
        OooO0Oo(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        long j8 = jArr3[0];
        long j9 = jArr3[1];
        long j10 = jArr3[2];
        long j11 = jArr3[3];
        long j12 = jArr3[4];
        long j13 = jArr3[5];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j8 ^ (j9 << 59);
        jArr3[1] = (j9 >>> 5) ^ (j10 << 54);
        jArr3[2] = (j10 >>> 10) ^ (j11 << 49);
        jArr3[3] = (j11 >>> 15) ^ (j12 << 44);
        jArr3[4] = (j12 >>> 20) ^ (j13 << 39);
        jArr3[5] = (j13 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    public static void OooO0Oo(long j, long j2, long[] jArr, int i) {
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        int i2 = (int) j;
        long j3 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j4 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j3 ^= j5 << i3;
            j4 ^= j5 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j3);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j3 >>> 59) ^ (j4 << 5));
    }

    public static void OooO0o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        OooO0OO(jArr, jArr2, jArr4);
        OooO0oo(jArr4, jArr3);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        o0o0Oo.OooO0OO(jArr[0], jArr2, 0);
        o0o0Oo.OooO0OO(jArr[1], jArr2, 2);
        o0o0Oo.OooO0OO(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = o0o0Oo.OooO0O0((int) j);
        jArr2[7] = ((long) o0o0Oo.OooO00o((int) (j >>> 32))) & 4294967295L;
    }

    public static void OooO0oO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        OooO0OO(jArr, jArr2, jArr4);
        OooO00o(jArr3, jArr4, jArr3);
    }

    public static void OooO0oo(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    public static void OooOO0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        OooO0o0(jArr, jArr3);
        while (true) {
            OooO0oo(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                OooO0o0(jArr2, jArr3);
            }
        }
    }
}
