package com.amazonaws.util;

import OooO00o.OooO00o;
import com.umeng.analytics.pro.bz;

/* JADX INFO: loaded from: classes.dex */
class Base64Codec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f11172OooO00o = CodecUtils.OooO00o("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    public static class LazyHolder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final byte[] f11173OooO00o;

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
            f11173OooO00o = bArr;
        }
    }

    public final void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = i2 + 1;
        byte[] bArr3 = this.f11172OooO00o;
        int i4 = i + 1;
        byte b = bArr[i];
        bArr2[i2] = bArr3[(b >>> 2) & 63];
        int i5 = i3 + 1;
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        bArr2[i3] = bArr3[((b & 3) << 4) | ((b2 >>> 4) & 15)];
        int i7 = (b2 & bz.m) << 2;
        byte b3 = bArr[i6];
        bArr2[i5] = bArr3[i7 | ((b3 >>> 6) & 3)];
        bArr2[i5 + 1] = bArr3[b3 & 63];
    }

    public final int OooO0O0(byte b) {
        byte[] bArr = LazyHolder.f11173OooO00o;
        byte b2 = LazyHolder.f11173OooO00o[b];
        if (b2 > -1) {
            return b2;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Invalid base 64 character: '");
        sbOooO0o0.append((char) b);
        sbOooO0o0.append("'");
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }
}
