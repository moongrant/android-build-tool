package com.amazonaws.util;

/* JADX INFO: loaded from: classes2.dex */
class Base64Codec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f12666OooO00o = CodecUtils.OooO00o("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    public static class LazyHolder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final byte[] f12667OooO00o;

        static {
            byte[] bArr = new byte[123];
            for (int i = 0; i <= 122; i++) {
                if (i >= 65 && i <= 90) {
                    bArr[i] = (byte) (i - 65);
                } else if (i >= 48 && i <= 57) {
                    bArr[i] = (byte) (i + 4);
                } else if (i == 43) {
                    bArr[i] = (byte) (i + 19);
                } else if (i == 47) {
                    bArr[i] = (byte) (i + 16);
                } else if (i < 97 || i > 122) {
                    bArr[i] = -1;
                } else {
                    bArr[i] = (byte) (i - 71);
                }
            }
            f12667OooO00o = bArr;
        }
    }

    public static int OooO0O0(byte b) {
        byte b2 = LazyHolder.f12667OooO00o[b];
        if (b2 > -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b) + "'");
    }

    public final void OooO00o(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = i2 + 1;
        int i4 = i + 1;
        byte b = bArr[i];
        byte[] bArr3 = this.f12666OooO00o;
        bArr2[i2] = bArr3[(b >>> 2) & 63];
        int i5 = i3 + 1;
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        bArr2[i3] = bArr3[((b & 3) << 4) | ((b2 >>> 4) & 15)];
        byte b3 = bArr[i6];
        bArr2[i5] = bArr3[((b2 & 15) << 2) | ((b3 >>> 6) & 3)];
        bArr2[i5 + 1] = bArr3[b3 & 63];
    }
}
