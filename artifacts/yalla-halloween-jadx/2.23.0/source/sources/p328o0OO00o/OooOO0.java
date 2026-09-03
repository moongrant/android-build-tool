package p328o0OO00o;

import androidx.compose.material.TextFieldImplKt;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import io.agora.rtc.Constants;
import java.util.Arrays;
import o0OO000.OooO00o;
import p441o0OoOoO.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[][] f43060OooO00o = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[][] f43061OooO0O0 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[][] f43062OooO0OO = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, TextFieldImplKt.AnimationDuration}, new int[]{6, 24, 50, 76, 102, 128, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[][] f43063OooO0Oo = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:105:0x0224  */
    /* JADX WARN: Code duplicated, block: B:106:0x0227  */
    /* JADX WARN: Code duplicated, block: B:108:0x022b  */
    public static void OooO00o(OooO00o oooO00o, ErrorCorrectionLevel errorCorrectionLevel, o00OOOO0 o00oooo1, int i, OooO0o oooO0o) throws WriterException {
        boolean zOooO0o;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6 = 0;
        for (byte[] bArr : oooO0o.f43057OooO00o) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = f43060OooO00o[0].length;
        OooO0Oo(0, 0, oooO0o);
        int i7 = oooO0o.f43058OooO0O0;
        int i8 = i7 - length;
        OooO0Oo(i8, 0, oooO0o);
        OooO0Oo(0, i8, oooO0o);
        OooO0OO(0, 7, oooO0o);
        int i9 = i7 - 8;
        OooO0OO(i9, 7, oooO0o);
        OooO0OO(0, i9, oooO0o);
        OooO0o0(7, 0, oooO0o);
        int i10 = oooO0o.f43059OooO0OO;
        int i11 = i10 - 7;
        OooO0o0(i11 - 1, 0, oooO0o);
        OooO0o0(7, i11, oooO0o);
        int i12 = i10 - 8;
        if (oooO0o.OooO00o(8, i12) == 0) {
            throw new WriterException();
        }
        oooO0o.OooO0O0(8, i12, 1);
        int i13 = 5;
        int i14 = o00oooo1.f46169OooO00o;
        if (i14 >= 2) {
            int[] iArr = f43062OooO0OO[i14 - 1];
            int length2 = iArr.length;
            int i15 = 0;
            while (i15 < length2) {
                int i16 = iArr[i15];
                if (i16 >= 0) {
                    int length3 = iArr.length;
                    while (i6 < length3) {
                        int i17 = iArr[i6];
                        if (i17 >= 0 && OooO0o(oooO0o.OooO00o(i17, i16))) {
                            int i18 = i17 - 2;
                            int i19 = i16 - 2;
                            int i20 = 0;
                            while (i20 < i13) {
                                int[] iArr2 = f43061OooO0O0[i20];
                                int i21 = length2;
                                int i22 = 0;
                                while (i22 < i13) {
                                    oooO0o.OooO0O0(i18 + i22, i19 + i20, iArr2[i22]);
                                    i22++;
                                    i18 = i18;
                                    length3 = length3;
                                    i13 = 5;
                                }
                                i20++;
                                length2 = i21;
                                i13 = 5;
                            }
                        }
                        i6++;
                        i16 = i16;
                        length2 = length2;
                        length3 = length3;
                        i13 = 5;
                    }
                }
                i15++;
                length2 = length2;
                i6 = 0;
                i13 = 5;
            }
        }
        int i23 = 8;
        while (i23 < i9) {
            int i24 = i23 + 1;
            int i25 = i24 % 2;
            if (OooO0o(oooO0o.OooO00o(i23, 6))) {
                oooO0o.OooO0O0(i23, 6, i25);
            }
            if (OooO0o(oooO0o.OooO00o(6, i23))) {
                oooO0o.OooO0O0(6, i23, i25);
            }
            i23 = i24;
        }
        OooO00o oooO00o2 = new OooO00o();
        if (!(i >= 0 && i < 8)) {
            throw new WriterException("Invalid mask pattern");
        }
        int iOooO00o = (errorCorrectionLevel.OooO00o() << 3) | i;
        oooO00o2.OooO0Oo(iOooO00o, 5);
        oooO00o2.OooO0Oo(OooO0O0(iOooO00o, 1335), 10);
        OooO00o oooO00o3 = new OooO00o();
        oooO00o3.OooO0Oo(21522, 15);
        if (oooO00o2.f42979OooO0o0 != oooO00o3.f42979OooO0o0) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i26 = 0;
        while (true) {
            int[] iArr3 = oooO00o2.f42978OooO0Oo;
            if (i26 >= iArr3.length) {
                break;
            }
            iArr3[i26] = iArr3[i26] ^ oooO00o3.f42978OooO0Oo[i26];
            i26++;
        }
        if (oooO00o2.f42979OooO0o0 != 15) {
            throw new WriterException("should not happen but we got: " + oooO00o2.f42979OooO0o0);
        }
        int i27 = 0;
        while (true) {
            int i28 = oooO00o2.f42979OooO0o0;
            if (i27 >= i28) {
                break;
            }
            boolean zOooO0o2 = oooO00o2.OooO0o((i28 - 1) - i27);
            int[] iArr4 = f43063OooO0Oo[i27];
            oooO0o.OooO0OO(iArr4[0], iArr4[1], zOooO0o2);
            if (i27 < 8) {
                oooO0o.OooO0OO((i7 - i27) - 1, 8, zOooO0o2);
            } else {
                oooO0o.OooO0OO(8, (i27 - 8) + i11, zOooO0o2);
            }
            i27++;
        }
        if (i14 >= 7) {
            OooO00o oooO00o4 = new OooO00o();
            oooO00o4.OooO0Oo(i14, 6);
            oooO00o4.OooO0Oo(OooO0O0(i14, 7973), 12);
            if (oooO00o4.f42979OooO0o0 != 18) {
                throw new WriterException("should not happen but we got: " + oooO00o4.f42979OooO0o0);
            }
            int i29 = 17;
            for (int i30 = 0; i30 < 6; i30++) {
                for (int i31 = 0; i31 < 3; i31++) {
                    boolean zOooO0o3 = oooO00o4.OooO0o(i29);
                    i29--;
                    int i32 = (i10 - 11) + i31;
                    oooO0o.OooO0OO(i30, i32, zOooO0o3);
                    oooO0o.OooO0OO(i32, i30, zOooO0o3);
                }
            }
        }
        int i33 = i7 - 1;
        int i34 = i10 - 1;
        int i35 = 0;
        int i36 = -1;
        while (i33 > 0) {
            if (i33 == 6) {
                i33--;
            }
            while (i34 >= 0 && i34 < i10) {
                for (int i37 = 0; i37 < 2; i37++) {
                    int i38 = i33 - i37;
                    if (OooO0o(oooO0o.OooO00o(i38, i34))) {
                        if (i35 < oooO00o.f42979OooO0o0) {
                            zOooO0o = oooO00o.OooO0o(i35);
                            i35++;
                        } else {
                            zOooO0o = false;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i2 = i34 + i38;
                                    z = true;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 1:
                                    i2 = i34;
                                    z = true;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 2:
                                    i3 = i38 % 3;
                                    z = true;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 3:
                                    i3 = (i34 + i38) % 3;
                                    z = true;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 4:
                                    i2 = (i38 / 3) + (i34 / 2);
                                    z = true;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 5:
                                    int i39 = i34 * i38;
                                    i3 = (i39 % 3) + (i39 & 1);
                                    z = true;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 6:
                                    int i40 = i34 * i38;
                                    i4 = i40 & 1;
                                    i5 = i40 % 3;
                                    i2 = i5 + i4;
                                    z = true;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                case 7:
                                    i5 = (i34 * i38) % 3;
                                    i4 = (i34 + i38) & 1;
                                    i2 = i5 + i4;
                                    z = true;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        zOooO0o = !zOooO0o;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
                            }
                        }
                        oooO0o.OooO0OO(i38, i34, zOooO0o);
                    }
                }
                i34 += i36;
            }
            i36 = -i36;
            i34 += i36;
            i33 -= 2;
        }
        if (i35 == oooO00o.f42979OooO0o0) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i35 + '/' + oooO00o.f42979OooO0o0);
    }

    public static int OooO0O0(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
        int iNumberOfLeadingZeros2 = i << (iNumberOfLeadingZeros - 1);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= iNumberOfLeadingZeros) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - iNumberOfLeadingZeros);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void OooO0OO(int i, int i2, OooO0o oooO0o) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!OooO0o(oooO0o.OooO00o(i4, i2))) {
                throw new WriterException();
            }
            oooO0o.OooO0O0(i4, i2, 0);
        }
    }

    public static void OooO0Oo(int i, int i2, OooO0o oooO0o) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f43060OooO00o[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                oooO0o.OooO0O0(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static boolean OooO0o(int i) {
        return i == -1;
    }

    public static void OooO0o0(int i, int i2, OooO0o oooO0o) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!OooO0o(oooO0o.OooO00o(i, i4))) {
                throw new WriterException();
            }
            oooO0o.OooO0O0(i, i4, 0);
        }
    }
}
