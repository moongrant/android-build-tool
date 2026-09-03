package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long[] f52634OooO00o = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void OooO(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void OooO0O0(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                OooO0O0(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            p399o0Oo00oo.o00000OO.OooOo0(16, jArr3);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                OooO0O0(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5);
            }
            if (i4 > 0) {
                p399o0Oo00oo.o00000OO.OooOo0(18, jArr3);
            }
        }
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            p029Oooo0oO.o0o0Oo.OooO0OO(jArr[i], jArr2, i << 1);
        }
    }

    public static void OooO0o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        OooO0OO(jArr, OooO0oo(jArr2), jArr4);
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        OooO0OO(jArr, OooO0oo(jArr2), jArr4);
        OooO(jArr4, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        OooO0OO(jArr, jArr2, jArr4);
        OooO(jArr4, jArr3);
    }

    public static long[] OooO0oo(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i = 7;
        int i2 = 0;
        while (true) {
            j = 0;
            if (i <= 0) {
                break;
            }
            i2 += 18;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArr2[i3 + i4];
                jArr2[i2 + i4] = (j >>> 63) | (j2 << 1);
                i4++;
                j = j2;
            }
            OooOO0(jArr2, i2);
            int i5 = i2 + 9;
            for (int i6 = 0; i6 < 9; i6++) {
                jArr2[i5 + i6] = jArr2[9 + i6] ^ jArr2[i2 + i6];
            }
            i--;
        }
        int i7 = 0;
        while (i7 < 144) {
            long j3 = jArr2[0 + i7];
            jArr2[144 + i7] = (j >>> (-4)) | (j3 << 4);
            i7++;
            j = j3;
        }
        return jArr2;
    }

    public static void OooOO0(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    public static void OooOO0O(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        OooO0Oo(jArr, jArr3);
        OooO(jArr3, jArr2);
    }

    public static void OooOO0o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        OooO0Oo(jArr, jArr3);
        for (int i = 0; i < 18; i++) {
            jArr2[i] = jArr2[i] ^ jArr3[i];
        }
    }

    public static void OooOOO0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[18];
        OooO0Oo(jArr, jArr3);
        while (true) {
            OooO(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                OooO0Oo(jArr2, jArr3);
            }
        }
    }
}
