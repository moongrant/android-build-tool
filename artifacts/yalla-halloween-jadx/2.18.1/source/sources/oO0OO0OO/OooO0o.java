package oO0OO0OO;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f52754OooO00o = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f52755OooO0O0 = new byte[128];

    public OooO0o() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f52755OooO0O0;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f52754OooO00o;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.f52755OooO0O0;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f52755OooO0O0[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public static boolean OooO0OO(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public final int OooO00o(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!OooO0OO(str.charAt(i))) {
                break;
            }
            length = i;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            while (i2 < length && OooO0OO(str.charAt(i2))) {
                i2++;
            }
            int i4 = i2 + 1;
            byte b = this.f52755OooO0O0[str.charAt(i2)];
            while (i4 < length && OooO0OO(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = this.f52755OooO0O0[str.charAt(i4)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write((b << 4) | b2);
            i3++;
            i2 = i5;
        }
        return i3;
    }

    public final int OooO0O0(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & UByte.MAX_VALUE;
            outputStream.write(this.f52754OooO00o[i4 >>> 4]);
            outputStream.write(this.f52754OooO00o[i4 & 15]);
        }
        return i2 * 2;
    }
}
