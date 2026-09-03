package p403o0Oo0O0O;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import io.agora.rtc.Constants;
import java.util.Arrays;
import p392o0OOooo.o00000O;
import p401o0Oo0O0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[][] f39015OooO00o = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[][] f39016OooO0O0 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[][] f39017OooO0OO = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[][] f39018OooO0Oo = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:106:0x0231  */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    public static void OooO00o(o00000O o00000o, ErrorCorrectionLevel errorCorrectionLevel, o000oOoO o000oooo2, int i, o0OoOo0 o0oooo1) throws WriterException {
        boolean zOooO0oO;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        for (byte[] bArr : o0oooo1.f39019OooO00o) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = f39015OooO00o[0].length;
        OooO0Oo(0, 0, o0oooo1);
        OooO0Oo(o0oooo1.f39020OooO0O0 - length, 0, o0oooo1);
        OooO0Oo(0, o0oooo1.f39020OooO0O0 - length, o0oooo1);
        OooO0OO(0, 7, o0oooo1);
        OooO0OO(o0oooo1.f39020OooO0O0 - 8, 7, o0oooo1);
        OooO0OO(0, o0oooo1.f39020OooO0O0 - 8, o0oooo1);
        OooO0o0(7, 0, o0oooo1);
        OooO0o0((o0oooo1.f39021OooO0OO - 7) - 1, 0, o0oooo1);
        OooO0o0(7, o0oooo1.f39021OooO0OO - 7, o0oooo1);
        if (o0oooo1.OooO00o(8, o0oooo1.f39021OooO0OO - 8) == 0) {
            throw new WriterException();
        }
        o0oooo1.OooO0O0(8, o0oooo1.f39021OooO0OO - 8, 1);
        int i8 = o000oooo2.f39004OooO00o;
        int i9 = 5;
        if (i8 >= 2) {
            int[] iArr = f39017OooO0OO[i8 - 1];
            int length2 = iArr.length;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    int length3 = iArr.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = iArr[i12];
                        if (i13 >= 0 && OooO0oO(o0oooo1.OooO00o(i13, i11))) {
                            int i14 = i13 - 2;
                            int i15 = i11 - 2;
                            int i16 = 0;
                            while (i16 < i9) {
                                int[] iArr2 = f39016OooO0O0[i16];
                                int i17 = 0;
                                while (i17 < i9) {
                                    o0oooo1.OooO0O0(i14 + i17, i15 + i16, iArr2[i17]);
                                    i17++;
                                    i9 = 5;
                                }
                                i16++;
                                i9 = 5;
                            }
                        }
                        i12++;
                        i9 = 5;
                    }
                }
                i10++;
                i9 = 5;
            }
        }
        int i18 = 8;
        while (i18 < o0oooo1.f39020OooO0O0 - 8) {
            int i19 = i18 + 1;
            int i20 = i19 % 2;
            if (OooO0oO(o0oooo1.OooO00o(i18, 6))) {
                o0oooo1.OooO0O0(i18, 6, i20);
            }
            if (OooO0oO(o0oooo1.OooO00o(6, i18))) {
                o0oooo1.OooO0O0(6, i18, i20);
            }
            i18 = i19;
        }
        o00000O o00000o2 = new o00000O();
        if (!(i >= 0 && i < 8)) {
            throw new WriterException("Invalid mask pattern");
        }
        int iOooO00o = (errorCorrectionLevel.OooO00o() << 3) | i;
        o00000o2.OooO0o0(iOooO00o, 5);
        o00000o2.OooO0o0(OooO0O0(iOooO00o, 1335), 10);
        o00000O o00000o3 = new o00000O();
        o00000o3.OooO0o0(21522, 15);
        if (o00000o2.f38917Oooo0oO != o00000o3.f38917Oooo0oO) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i21 = 0;
        while (true) {
            int[] iArr3 = o00000o2.f38916Oooo0o;
            if (i21 >= iArr3.length) {
                break;
            }
            iArr3[i21] = iArr3[i21] ^ o00000o3.f38916Oooo0o[i21];
            i21++;
        }
        if (o00000o2.f38917Oooo0oO != 15) {
            throw new WriterException("should not happen but we got: " + o00000o2.f38917Oooo0oO);
        }
        int i22 = 0;
        while (true) {
            int i23 = o00000o2.f38917Oooo0oO;
            if (i22 >= i23) {
                break;
            }
            boolean zOooO0oO2 = o00000o2.OooO0oO((i23 - 1) - i22);
            int[] iArr4 = f39018OooO0Oo[i22];
            o0oooo1.OooO0OO(iArr4[0], iArr4[1], zOooO0oO2);
            if (i22 < 8) {
                o0oooo1.OooO0OO((o0oooo1.f39020OooO0O0 - i22) - 1, 8, zOooO0oO2);
            } else {
                o0oooo1.OooO0OO(8, (i22 - 8) + (o0oooo1.f39021OooO0OO - 7), zOooO0oO2);
            }
            i22++;
        }
        int i24 = o000oooo2.f39004OooO00o;
        if (i24 >= 7) {
            o00000O o00000o4 = new o00000O();
            o00000o4.OooO0o0(i24, 6);
            o00000o4.OooO0o0(OooO0O0(o000oooo2.f39004OooO00o, 7973), 12);
            if (o00000o4.f38917Oooo0oO != 18) {
                throw new WriterException("should not happen but we got: " + o00000o4.f38917Oooo0oO);
            }
            int i25 = 17;
            for (int i26 = 0; i26 < 6; i26++) {
                for (int i27 = 0; i27 < 3; i27++) {
                    boolean zOooO0oO3 = o00000o4.OooO0oO(i25);
                    i25--;
                    o0oooo1.OooO0OO(i26, (o0oooo1.f39021OooO0OO - 11) + i27, zOooO0oO3);
                    o0oooo1.OooO0OO((o0oooo1.f39021OooO0OO - 11) + i27, i26, zOooO0oO3);
                }
            }
        }
        int i28 = o0oooo1.f39020OooO0O0 - 1;
        int i29 = o0oooo1.f39021OooO0OO - 1;
        int i30 = 0;
        int i31 = -1;
        while (i28 > 0) {
            if (i28 == 6) {
                i28--;
            }
            while (i29 >= 0 && i29 < o0oooo1.f39021OooO0OO) {
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i28 - i32;
                    if (OooO0oO(o0oooo1.OooO00o(i33, i29))) {
                        if (i30 < o00000o.f38917Oooo0oO) {
                            zOooO0oO = o00000o.OooO0oO(i30);
                            i30++;
                        } else {
                            zOooO0oO = false;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i2 = i29 + i33;
                                    i3 = i2;
                                    i5 = i3 & 1;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 1:
                                    i3 = i29;
                                    i5 = i3 & 1;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 2:
                                    i4 = i33 % 3;
                                    i5 = i4;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 3:
                                    i4 = (i29 + i33) % 3;
                                    i5 = i4;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 4:
                                    i2 = (i33 / 3) + (i29 / 2);
                                    i3 = i2;
                                    i5 = i3 & 1;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 5:
                                    int i34 = i29 * i33;
                                    i4 = (i34 % 3) + (i34 & 1);
                                    i5 = i4;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 6:
                                    int i35 = i29 * i33;
                                    i6 = i35 & 1;
                                    i7 = i35 % 3;
                                    i2 = i7 + i6;
                                    i3 = i2;
                                    i5 = i3 & 1;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                case 7:
                                    i7 = (i29 * i33) % 3;
                                    i6 = (i29 + i33) & 1;
                                    i2 = i7 + i6;
                                    i3 = i2;
                                    i5 = i3 & 1;
                                    if (i5 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zOooO0oO = !zOooO0oO;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
                            }
                        }
                        o0oooo1.OooO0OO(i33, i29, zOooO0oO);
                    }
                }
                i29 += i31;
            }
            i31 = -i31;
            i29 += i31;
            i28 -= 2;
        }
        if (i30 == o00000o.f38917Oooo0oO) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i30 + '/' + o00000o.f38917Oooo0oO);
    }

    public static int OooO0O0(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iOooO0o = OooO0o(i2);
        int iOooO0o2 = i << (iOooO0o - 1);
        while (OooO0o(iOooO0o2) >= iOooO0o) {
            iOooO0o2 ^= i2 << (OooO0o(iOooO0o2) - iOooO0o);
        }
        return iOooO0o2;
    }

    public static void OooO0OO(int i, int i2, o0OoOo0 o0oooo1) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!OooO0oO(o0oooo1.OooO00o(i4, i2))) {
                throw new WriterException();
            }
            o0oooo1.OooO0O0(i4, i2, 0);
        }
    }

    public static void OooO0Oo(int i, int i2, o0OoOo0 o0oooo1) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f39015OooO00o[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                o0oooo1.OooO0O0(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static int OooO0o(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static void OooO0o0(int i, int i2, o0OoOo0 o0oooo1) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!OooO0oO(o0oooo1.OooO00o(i, i4))) {
                throw new WriterException();
            }
            o0oooo1.OooO0O0(i, i4, 0);
        }
    }

    public static boolean OooO0oO(int i) {
        return i == -1;
    }
}
