package io.opentelemetry.utils;

/* JADX INFO: loaded from: classes5.dex */
public class Base64 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f33595OooO00o = new byte[128];

    static {
        for (int i = 0; i < 128; i++) {
            f33595OooO00o[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f33595OooO00o[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f33595OooO00o[i3] = (byte) ((i3 - 97) + 26);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f33595OooO00o[i4] = (byte) ((i4 - 48) + 52);
        }
        byte[] bArr = f33595OooO00o;
        bArr[43] = 62;
        bArr[47] = 63;
    }
}
