package com.qiniu.android.utils;

/* JADX INFO: loaded from: classes3.dex */
public class IPAddressUtil {
    private static final int INADDR16SZ = 16;
    private static final int INADDR4SZ = 4;
    private static final int INT16SZ = 2;

    public static byte[] convertFromIPv4MappedAddress(byte[] bArr) {
        if (!isIPv4MappedAddress(bArr)) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 12, bArr2, 0, 4);
        return bArr2;
    }

    public static boolean isIPv4LiteralAddress(String str) {
        return textToNumericFormatV4(str) != null;
    }

    private static boolean isIPv4MappedAddress(byte[] bArr) {
        return bArr.length >= 16 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0 && bArr[6] == 0 && bArr[7] == 0 && bArr[8] == 0 && bArr[9] == 0 && bArr[10] == -1 && bArr[11] == -1;
    }

    public static boolean isIPv6LiteralAddress(String str) {
        return textToNumericFormatV6(str) != null;
    }

    public static byte[] textToNumericFormatV4(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        if (length != 0 && length <= 15) {
            long j = 0;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '.') {
                    int iDigit = Character.digit(cCharAt, 10);
                    if (iDigit < 0) {
                        return null;
                    }
                    j = (j * 10) + ((long) iDigit);
                } else {
                    if (j < 0 || j > 255 || i == 3) {
                        return null;
                    }
                    bArr[i] = (byte) (j & 255);
                    j = 0;
                    i++;
                }
            }
            if (j >= 0 && j < (1 << ((4 - i) * 8))) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                            }
                            return bArr;
                        }
                        bArr[3] = (byte) ((j >> 0) & 255);
                        return bArr;
                    }
                    bArr[2] = (byte) ((j >> 8) & 255);
                    bArr[3] = (byte) ((j >> 0) & 255);
                    return bArr;
                }
                bArr[0] = (byte) ((j >> 24) & 255);
                bArr[1] = (byte) ((j >> 16) & 255);
                bArr[2] = (byte) ((j >> 8) & 255);
                bArr[3] = (byte) ((j >> 0) & 255);
                return bArr;
            }
        }
        return null;
    }

    public static byte[] textToNumericFormatV6(String str) {
        int i;
        byte[] bArrTextToNumericFormatV4;
        if (str.length() < 2) {
            return null;
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[16];
        int length = charArray.length;
        int iIndexOf = str.indexOf("%");
        if (iIndexOf == length - 1) {
            return null;
        }
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        if (charArray[0] != ':') {
            i = 0;
        } else {
            if (charArray[1] != ':') {
                return null;
            }
            i = 1;
        }
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = -1;
        int i5 = i;
        while (i < length) {
            int i6 = i + 1;
            char c = charArray[i];
            int iDigit = Character.digit(c, 16);
            if (iDigit != -1) {
                i2 = (i2 << 4) | iDigit;
                if (i2 > 65535) {
                    return null;
                }
                i = i6;
                z = true;
            } else {
                if (c != ':') {
                    if (c != '.' || i3 + 4 > 16) {
                        return null;
                    }
                    String strSubstring = str.substring(i5, length);
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        int iIndexOf2 = strSubstring.indexOf(46, i7);
                        if (iIndexOf2 == -1) {
                            break;
                        }
                        i8++;
                        i7 = iIndexOf2 + 1;
                    }
                    if (i8 != 3 || (bArrTextToNumericFormatV4 = textToNumericFormatV4(strSubstring)) == null) {
                        return null;
                    }
                    int i9 = 0;
                    while (i9 < 4) {
                        bArr[i3] = bArrTextToNumericFormatV4[i9];
                        i9++;
                        i3++;
                    }
                    z = false;
                    break;
                }
                if (z) {
                    if (i6 == length || i3 + 2 > 16) {
                        return null;
                    }
                    int i10 = i3 + 1;
                    bArr[i3] = (byte) ((i2 >> 8) & 255);
                    i3 = i10 + 1;
                    bArr[i10] = (byte) (i2 & 255);
                    i = i6;
                    i5 = i;
                    i2 = 0;
                    z = false;
                } else {
                    if (i4 != -1) {
                        return null;
                    }
                    i = i6;
                    i5 = i;
                    i4 = i3;
                }
            }
        }
        if (z) {
            if (i3 + 2 > 16) {
                return null;
            }
            int i11 = i3 + 1;
            bArr[i3] = (byte) ((i2 >> 8) & 255);
            i3 = i11 + 1;
            bArr[i11] = (byte) (i2 & 255);
        }
        if (i4 != -1) {
            int i12 = i3 - i4;
            if (i3 == 16) {
                return null;
            }
            for (int i13 = 1; i13 <= i12; i13++) {
                int i14 = (i4 + i12) - i13;
                bArr[16 - i13] = bArr[i14];
                bArr[i14] = 0;
            }
            i3 = 16;
        }
        if (i3 != 16) {
            return null;
        }
        byte[] bArrConvertFromIPv4MappedAddress = convertFromIPv4MappedAddress(bArr);
        return bArrConvertFromIPv4MappedAddress != null ? bArrConvertFromIPv4MappedAddress : bArr;
    }
}
