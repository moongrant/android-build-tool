package androidx.compose.ui.platform;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 {
    public static void OooO(long j, long j2, long[] jArr, int i) {
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
        jArr[i] = jArr[i] ^ (1152921504606846975L & j3);
        int i5 = i + 1;
        jArr[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j4) << 4) ^ (j3 >>> 60)) ^ jArr[i5];
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

    public static final int OooO0O0(float f) {
        return ((int) (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public static int OooO0OO(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil(fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static String OooO0Oo(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        return i4 > 0 ? String.format(Locale.getDefault(), "%1$d:%2$02d:%3$02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)) : String.format(Locale.getDefault(), "%1$d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static void OooO0o(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static final int OooO0o0(long j) {
        long jOooO0O0 = o0000O0O.o00O0O.OooO0O0(j);
        if (o0000O0O.o00Ooo.OooO00o(jOooO0O0, 4294967296L)) {
            return 0;
        }
        return o0000O0O.o00Ooo.OooO00o(jOooO0O0, 8589934592L) ? 1 : 2;
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void OooO0oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        OooO0oO(jArr, jArr4);
        OooO0oO(jArr2, jArr5);
        OooO(jArr4[0], jArr5[0], jArr3, 0);
        OooO(jArr4[1], jArr5[1], jArr3, 1);
        OooO(jArr4[2], jArr5[2], jArr3, 2);
        OooO(jArr4[3], jArr5[3], jArr3, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        OooO(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        OooO(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        OooO(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        OooO(j, j3, jArr6, 0);
        OooO(j2, j4, jArr6, 1);
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
        jArr3[0] = j8 ^ (j9 << 60);
        jArr3[1] = (j9 >>> 4) ^ (j10 << 56);
        jArr3[2] = (j10 >>> 8) ^ (j11 << 52);
        jArr3[3] = (j11 >>> 12) ^ (j12 << 48);
        jArr3[4] = (j12 >>> 16) ^ (j13 << 44);
        jArr3[5] = (j13 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static void OooOO0(long[] jArr, long[] jArr2) {
        p029Oooo0oO.o0o0Oo.OooO0OO(jArr[0], jArr2, 0);
        p029Oooo0oO.o0o0Oo.OooO0OO(jArr[1], jArr2, 2);
        p029Oooo0oO.o0o0Oo.OooO0OO(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = p029Oooo0oO.o0o0Oo.OooO0O0((int) j);
        jArr2[7] = ((long) p029Oooo0oO.o0o0Oo.OooO00o((int) (j >>> 32))) & 4294967295L;
    }

    public static boolean OooOO0O(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean OooOO0o(char c) {
        return c >= 128 && c <= 255;
    }

    public static int OooOOO(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iOooO0OO = OooO0OO(fArr, iArr, bArr);
                int i6 = 0;
                for (int i7 = 0; i7 < 6; i7++) {
                    i6 += bArr[i7];
                }
                if (iArr[i3] == iOooO0OO) {
                    return i3;
                }
                if (i6 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i6 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i6 != 1 || bArr[2] <= 0) {
                    return (i6 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (OooOO0O(cCharAt)) {
                fArr[i3] = fArr[i3] + 0.5f;
            } else if (OooOO0o(cCharAt)) {
                fArr[i3] = (float) Math.ceil(fArr[i3]);
                fArr[i3] = fArr[i3] + 2.0f;
            } else {
                fArr[i3] = (float) Math.ceil(fArr[i3]);
                fArr[i3] = fArr[i3] + 1.0f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (OooOO0o(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (OooOO0o(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (OooOOO0(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (OooOO0o(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt >= ' ' && cCharAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (OooOO0o(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                OooO0OO(fArr, iArr2, bArr2);
                int i8 = 0;
                for (int i9 = 0; i9 < 6; i9++) {
                    i8 += bArr2[i9];
                }
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (i8 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (i8 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (i8 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i10 = i + i4 + 1; i10 < charSequence.length(); i10++) {
                            char cCharAt2 = charSequence.charAt(i10);
                            if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                return 3;
                            }
                            if (!OooOOO0(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            i3 = 0;
        }
    }

    public static boolean OooOOO0(char c) {
        return (c == '\r' || c == '*' || c == '>') || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    public static void OooOOOO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        OooO0oo(jArr, jArr2, jArr4);
        OooOOo(jArr4, jArr3);
    }

    public static void OooOOOo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        OooO0oo(jArr, jArr2, jArr4);
        OooO00o(jArr3, jArr4, jArr3);
    }

    public static void OooOOo(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    public static long OooOOo0(long j) {
        short s = (short) (j & 65535);
        short s2 = (short) ((j >>> 16) & 65535);
        short sOooOOoo = (short) (OooOOoo((short) (s + s2), 9) + s);
        short s3 = (short) (s2 ^ s);
        return ((((long) OooOOoo(s3, 10)) | (((long) sOooOOoo) << 16)) << 16) | ((long) ((short) (((short) (OooOOoo(s, 13) ^ s3)) ^ (s3 << 5))));
    }

    public static short OooOOoo(short s, int i) {
        return (short) ((s >>> (32 - i)) | (s << i));
    }

    public static void OooOo0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        OooOO0(jArr, jArr3);
        while (true) {
            OooOOo(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                OooOO0(jArr2, jArr3);
            }
        }
    }

    public static void OooOo00(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        OooOO0(jArr, jArr3);
        OooOOo(jArr3, jArr2);
    }

    public static int OooOo0O(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
