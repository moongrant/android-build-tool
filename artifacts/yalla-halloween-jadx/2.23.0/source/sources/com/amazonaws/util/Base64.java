package com.amazonaws.util;

import android.support.v4.media.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public enum Base64 {
    ;

    private static final Base64Codec CODEC = new Base64Codec();

    public static byte[] OooO00o(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int i2 = 0;
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        char[] charArray = str.toCharArray();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char c = charArray[i4];
            if (c != '\r' && c != '\n' && c != ' ') {
                if (c > 127) {
                    throw new IllegalArgumentException("Invalid character found at position " + i4 + " for " + str);
                }
                bArr[i3] = (byte) c;
                i3++;
            }
        }
        CODEC.getClass();
        if (i3 % 4 != 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Input is expected to be encoded in multiple of 4 bytes but found: ", i3));
        }
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 < 2 && i5 > -1 && bArr[i5] == 61) {
            i5--;
            i6++;
        }
        if (i6 == 0) {
            i = 3;
        } else if (i6 == 1) {
            i = 2;
        } else {
            if (i6 != 2) {
                throw new Error("Impossible");
            }
            i = 1;
        }
        int i7 = ((i3 / 4) * 3) - (3 - i);
        byte[] bArr2 = new byte[i7];
        int i8 = 0;
        while (i2 < i7 - (i % 3)) {
            int i9 = i2 + 1;
            int i10 = i8 + 1;
            int iOooO0O0 = Base64Codec.OooO0O0(bArr[i8]) << 2;
            int i11 = i10 + 1;
            int iOooO0O1 = Base64Codec.OooO0O0(bArr[i10]);
            bArr2[i2] = (byte) (iOooO0O0 | ((iOooO0O1 >>> 4) & 3));
            int i12 = i11 + 1;
            int iOooO0O2 = Base64Codec.OooO0O0(bArr[i11]);
            bArr2[i9] = (byte) (((iOooO0O1 & 15) << 4) | ((iOooO0O2 >>> 2) & 15));
            bArr2[i9 + 1] = (byte) (((iOooO0O2 & 3) << 6) | Base64Codec.OooO0O0(bArr[i12]));
            i8 += 4;
            i2 += 3;
        }
        if (i < 3) {
            int i13 = i2 + 1;
            int i14 = i8 + 1;
            int iOooO0O3 = Base64Codec.OooO0O0(bArr[i8]) << 2;
            int i15 = i14 + 1;
            int iOooO0O4 = Base64Codec.OooO0O0(bArr[i14]);
            bArr2[i2] = (byte) (iOooO0O3 | ((iOooO0O4 >>> 4) & 3));
            if (i != 1) {
                int i16 = i13 + 1;
                int i17 = (iOooO0O4 & 15) << 4;
                int i18 = i15 + 1;
                int iOooO0O5 = Base64Codec.OooO0O0(bArr[i15]);
                bArr2[i13] = (byte) (i17 | ((iOooO0O5 >>> 2) & 15));
                if (i != 2) {
                    bArr2[i16] = (byte) (((3 & iOooO0O5) << 6) | Base64Codec.OooO0O0(bArr[i18]));
                } else if ((3 & iOooO0O5) != 0) {
                    throw new IllegalArgumentException("Invalid last non-pad character detected");
                }
            } else if ((iOooO0O4 & 15) != 0) {
                throw new IllegalArgumentException("Invalid last non-pad character detected");
            }
        }
        return bArr2;
    }

    public static String OooO0O0(byte... bArr) {
        byte[] bArr2;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        Base64Codec base64Codec = CODEC;
        base64Codec.getClass();
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i = 0;
        if (length2 == 0) {
            bArr2 = new byte[length * 4];
            int i2 = 0;
            int i3 = 0;
            while (i2 < bArr.length) {
                base64Codec.OooO00o(i2, i3, bArr, bArr2);
                i2 += 3;
                i3 += 4;
            }
        } else {
            bArr2 = new byte[(length + 1) * 4];
            int i4 = 0;
            int i5 = 0;
            while (i4 < bArr.length - length2) {
                base64Codec.OooO00o(i4, i5, bArr, bArr2);
                i4 += 3;
                i5 += 4;
            }
            byte[] bArr3 = base64Codec.f9575OooO00o;
            if (length2 == 1) {
                int i6 = i5 + 1;
                byte b = bArr[i4];
                bArr2[i5] = bArr3[(b >>> 2) & 63];
                int i7 = i6 + 1;
                bArr2[i6] = bArr3[(b & 3) << 4];
                bArr2[i7] = kotlin.io.encoding.Base64.padSymbol;
                bArr2[i7 + 1] = kotlin.io.encoding.Base64.padSymbol;
            } else if (length2 == 2) {
                int i8 = i5 + 1;
                int i9 = i4 + 1;
                byte b2 = bArr[i4];
                bArr2[i5] = bArr3[(b2 >>> 2) & 63];
                int i10 = i8 + 1;
                byte b3 = bArr[i9];
                bArr2[i8] = bArr3[((b2 & 3) << 4) | ((b3 >>> 4) & 15)];
                bArr2[i10] = bArr3[(b3 & 15) << 2];
                bArr2[i10 + 1] = kotlin.io.encoding.Base64.padSymbol;
            }
        }
        char[] cArr = new char[bArr2.length];
        int length3 = bArr2.length;
        int i11 = 0;
        while (i < length3) {
            cArr[i11] = (char) bArr2[i];
            i++;
            i11++;
        }
        return new String(cArr);
    }
}
