package com.android.billingclient.api;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O00 {
    public static int OooO00o(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static void OooO0O0(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean OooO0OO(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean OooO0Oo(char c) {
        return (c == '\r' || c == '*' || c == '>') || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    public static int OooO0o0(String str, int i, int i2) {
        float[] fArr;
        int i3;
        if (i >= str.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i + i4;
            if (i5 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iOooO00o = OooO00o(fArr, iArr, bArr);
                int i6 = 0;
                for (int i7 = 0; i7 < 6; i7++) {
                    i6 += bArr[i7];
                }
                if (iArr[0] == iOooO00o) {
                    return 0;
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
            char cCharAt = str.charAt(i5);
            i4++;
            if (cCharAt >= '0' && cCharAt <= '9') {
                fArr[0] = fArr[0] + 0.5f;
            } else if (OooO0OO(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (OooO0OO(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (OooO0OO(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (OooO0Oo(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (OooO0OO(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt >= ' ' && cCharAt <= '^') {
                i3 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i3 = 4;
                if (OooO0OO(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i4 >= i3) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                OooO00o(fArr, iArr2, bArr2);
                int i8 = 0;
                for (int i9 = 0; i9 < 6; i9++) {
                    i8 += bArr2[i9];
                }
                int i10 = iArr2[0];
                int i11 = iArr2[5];
                if (i10 < i11 && i10 < iArr2[1] && i10 < iArr2[2] && i10 < iArr2[3] && i10 < iArr2[4]) {
                    return 0;
                }
                if (i11 >= i10) {
                    byte b = bArr2[1];
                    byte b2 = bArr2[2];
                    byte b3 = bArr2[3];
                    byte b4 = bArr2[4];
                    if (b + b2 + b3 + b4 != 0) {
                        if (i8 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (i8 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (i8 == 1 && b3 > 0) {
                            return 3;
                        }
                        int i12 = iArr2[1];
                        int i13 = i12 + 1;
                        if (i13 < i10 && i13 < i11 && i13 < iArr2[4] && i13 < iArr2[2]) {
                            int i14 = iArr2[3];
                            if (i12 < i14) {
                                return 1;
                            }
                            if (i12 == i14) {
                                for (int i15 = i + i4 + 1; i15 < str.length(); i15++) {
                                    char cCharAt2 = str.charAt(i15);
                                    if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                        return 3;
                                    }
                                    if (!OooO0Oo(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return 5;
            }
        }
    }
}
