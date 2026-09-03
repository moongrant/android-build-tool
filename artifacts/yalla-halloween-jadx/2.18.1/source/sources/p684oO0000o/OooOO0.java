package p684oO0000o;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOO0 {
    public static int OooO00o(byte[] bArr, int i) {
        int i2 = bArr[i] << 24;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & UByte.MAX_VALUE) << 16);
        int i5 = i3 + 1;
        return (bArr[i5 + 1] & UByte.MAX_VALUE) | i4 | ((bArr[i5] & UByte.MAX_VALUE) << 8);
    }

    public static void OooO0O0(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void OooO0OO(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void OooO0Oo(long j, byte[] bArr, int i) {
        OooO0O0((int) (j >>> 32), bArr, i);
        OooO0O0((int) (j & 4294967295L), bArr, i + 4);
    }

    public static byte[] OooO0o0(long j) {
        byte[] bArr = new byte[8];
        OooO0OO((int) (4294967295L & j), bArr, 0);
        OooO0OO((int) (j >>> 32), bArr, 4);
        return bArr;
    }
}
