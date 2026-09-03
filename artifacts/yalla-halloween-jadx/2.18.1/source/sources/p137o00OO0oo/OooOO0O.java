package p137o00OO0oo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p029Oooo0oO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static ScheduledExecutorService f31654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static ExecutorService f31655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static ExecutorService f31656OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static ExecutorService f31657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static ExecutorService f31658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static ExecutorService f31659OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final long[] f31660OooO0oO = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void OooO(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
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
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        OooO0O0(jArr, jArr4);
        OooO0O0(jArr2, jArr5);
        long[] jArr6 = new long[26];
        OooO0Oo(jArr4[0], jArr5[0], jArr6, 0);
        OooO0Oo(jArr4[1], jArr5[1], jArr6, 2);
        OooO0Oo(jArr4[2], jArr5[2], jArr6, 4);
        OooO0Oo(jArr4[3], jArr5[3], jArr6, 6);
        OooO0Oo(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0] ^ jArr4[1];
        long j2 = jArr5[0] ^ jArr5[1];
        long j3 = jArr4[0] ^ jArr4[2];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr4[2] ^ jArr4[4];
        long j6 = jArr5[2] ^ jArr5[4];
        long j7 = jArr4[3] ^ jArr4[4];
        long j8 = jArr5[3] ^ jArr5[4];
        OooO0Oo(j3 ^ jArr4[3], j4 ^ jArr5[3], jArr6, 18);
        OooO0Oo(j5 ^ jArr4[1], j6 ^ jArr5[1], jArr6, 20);
        long j9 = j ^ j7;
        long j10 = j2 ^ j8;
        long j11 = j9 ^ jArr4[2];
        long j12 = jArr5[2] ^ j10;
        OooO0Oo(j9, j10, jArr6, 22);
        OooO0Oo(j11, j12, jArr6, 24);
        OooO0Oo(j, j2, jArr6, 10);
        OooO0Oo(j3, j4, jArr6, 12);
        OooO0Oo(j5, j6, jArr6, 14);
        OooO0Oo(j7, j8, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j13 = jArr6[0] ^ jArr6[1];
        long j14 = jArr6[2] ^ j13;
        long j15 = jArr6[10] ^ j14;
        jArr3[1] = j15;
        long j16 = jArr6[3] ^ jArr6[4];
        long j17 = j14 ^ (j16 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j17;
        long j18 = j13 ^ j16;
        long j19 = jArr6[5] ^ jArr6[6];
        long j20 = (j18 ^ j19) ^ jArr6[8];
        long j21 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j20 ^ j21) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j22 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j23 = j22 ^ jArr6[17];
        jArr3[8] = j23;
        long j24 = (j22 ^ j19) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j24;
        long j25 = j15 ^ j24;
        long j26 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j26 ^ (jArr6[18] ^ jArr6[23])) ^ j25;
        jArr3[5] = ((j17 ^ j23) ^ j26) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = (((((j20 ^ jArr6[0]) ^ jArr6[9]) ^ j21) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
        long j27 = jArr3[0];
        long j28 = jArr3[1];
        long j29 = jArr3[2];
        long j30 = jArr3[3];
        long j31 = jArr3[4];
        long j32 = jArr3[5];
        long j33 = jArr3[6];
        long j34 = jArr3[7];
        long j35 = jArr3[8];
        long j36 = jArr3[9];
        jArr3[0] = j27 ^ (j28 << 57);
        jArr3[1] = (j28 >>> 7) ^ (j29 << 50);
        jArr3[2] = (j29 >>> 14) ^ (j30 << 43);
        jArr3[3] = (j30 >>> 21) ^ (j31 << 36);
        jArr3[4] = (j31 >>> 28) ^ (j32 << 29);
        jArr3[5] = (j32 >>> 35) ^ (j33 << 22);
        jArr3[6] = (j33 >>> 42) ^ (j34 << 15);
        jArr3[7] = (j34 >>> 49) ^ (j35 << 8);
        jArr3[8] = (j35 >>> 56) ^ (j36 << 1);
        jArr3[9] = j36 >>> 63;
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
        long j3 = jArr2[((int) j) & 7];
        long j4 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j5 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j3 ^= j5 << i2;
            j4 ^= j5 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j3;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j4) << 7) ^ (j3 >>> 57);
    }

    public static void OooO0o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        OooO0OO(jArr, jArr2, jArr4);
        OooO0oo(jArr4, jArr3);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            o0o0Oo.OooO0OO(jArr[i], jArr2, i << 1);
        }
        jArr2[8] = o0o0Oo.OooO0O0((int) jArr[4]);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
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
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static void OooOO0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[9];
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
