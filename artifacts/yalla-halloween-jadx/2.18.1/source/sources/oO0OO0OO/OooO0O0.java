package oO0OO0OO;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f52751OooO00o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f52752OooO0O0 = new byte[128];

    public OooO0O0() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f52752OooO0O0;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f52751OooO00o;
            if (i >= bArr2.length) {
                return;
            }
            this.f52752OooO0O0[bArr2[i]] = (byte) i;
            i++;
        }
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
        int i2 = length - 4;
        int i3 = 0;
        int iOooO0Oo = OooO0Oo(str, 0, i2);
        while (iOooO0Oo < i2) {
            int i4 = iOooO0Oo + 1;
            byte b = this.f52752OooO0O0[str.charAt(iOooO0Oo)];
            int iOooO0Oo2 = OooO0Oo(str, i4, i2);
            int i5 = iOooO0Oo2 + 1;
            byte b2 = this.f52752OooO0O0[str.charAt(iOooO0Oo2)];
            int iOooO0Oo3 = OooO0Oo(str, i5, i2);
            int i6 = iOooO0Oo3 + 1;
            byte b3 = this.f52752OooO0O0[str.charAt(iOooO0Oo3)];
            int iOooO0Oo4 = OooO0Oo(str, i6, i2);
            int i7 = iOooO0Oo4 + 1;
            byte b4 = this.f52752OooO0O0[str.charAt(iOooO0Oo4)];
            if ((b | b2 | b3 | b4) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i3 += 3;
            iOooO0Oo = OooO0Oo(str, i7, i2);
        }
        char cCharAt = str.charAt(i2);
        char cCharAt2 = str.charAt(length - 3);
        char cCharAt3 = str.charAt(length - 2);
        int i8 = 1;
        char cCharAt4 = str.charAt(length - 1);
        if (cCharAt3 == '=') {
            if (cCharAt4 != '=') {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.f52752OooO0O0;
            byte b5 = bArr[cCharAt];
            byte b6 = bArr[cCharAt2];
            if ((b5 | b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b6 >> 4) | (b5 << 2));
        } else if (cCharAt4 == '=') {
            byte[] bArr2 = this.f52752OooO0O0;
            byte b7 = bArr2[cCharAt];
            byte b8 = bArr2[cCharAt2];
            byte b9 = bArr2[cCharAt3];
            if ((b7 | b8 | b9) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b7 << 2) | (b8 >> 4));
            outputStream.write((b9 >> 2) | (b8 << 4));
            i8 = 2;
        } else {
            byte[] bArr3 = this.f52752OooO0O0;
            byte b10 = bArr3[cCharAt];
            byte b11 = bArr3[cCharAt2];
            byte b12 = bArr3[cCharAt3];
            byte b13 = bArr3[cCharAt4];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write(b13 | (b12 << 6));
            i8 = 3;
        }
        return i3 + i8;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a8  */
    public final int OooO0O0(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3;
        int i4 = i2 % 3;
        int i5 = i2 - i4;
        int i6 = 0;
        while (true) {
            i3 = 0 + i5;
            if (i6 >= i3) {
                break;
            }
            int i7 = bArr[i6] & UByte.MAX_VALUE;
            int i8 = bArr[i6 + 1] & UByte.MAX_VALUE;
            int i9 = bArr[i6 + 2] & UByte.MAX_VALUE;
            outputStream.write(this.f52751OooO00o[(i7 >>> 2) & 63]);
            outputStream.write(this.f52751OooO00o[((i7 << 4) | (i8 >>> 4)) & 63]);
            outputStream.write(this.f52751OooO00o[((i8 << 2) | (i9 >>> 6)) & 63]);
            outputStream.write(this.f52751OooO00o[i9 & 63]);
            i6 += 3;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                int i10 = bArr[i3] & UByte.MAX_VALUE;
                int i11 = bArr[i3 + 1] & UByte.MAX_VALUE;
                outputStream.write(this.f52751OooO00o[(i10 >>> 2) & 63]);
                outputStream.write(this.f52751OooO00o[((i10 << 4) | (i11 >>> 4)) & 63]);
                outputStream.write(this.f52751OooO00o[(i11 << 2) & 63]);
            }
            return ((i5 / 3) * 4) + (i4 != 0 ? 4 : 0);
        }
        int i12 = bArr[i3] & UByte.MAX_VALUE;
        outputStream.write(this.f52751OooO00o[(i12 >>> 2) & 63]);
        outputStream.write(this.f52751OooO00o[(i12 << 4) & 63]);
        outputStream.write(61);
        outputStream.write(61);
        return ((i5 / 3) * 4) + (i4 != 0 ? 4 : 0);
    }

    public final boolean OooO0OO(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public final int OooO0Oo(String str, int i, int i2) {
        while (i < i2 && OooO0OO(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
