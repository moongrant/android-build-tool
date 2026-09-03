package p318o0O0oOo;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import kotlin.UByte;
import o0OOOO0o.OooO0o;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f36661OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f36662OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36663OooO0OO;

    public o000() {
        this.f36661OooO00o = o000OOo0.f36744OooO0o;
    }

    public final int OooO() {
        int iOooO0o = OooO0o();
        if (iOooO0o >= 0) {
            return iOooO0o;
        }
        throw new IllegalStateException(Oooo0.OooO00o(29, "Top bit not zero: ", iOooO0o));
    }

    public final int OooO00o() {
        return this.f36661OooO00o[this.f36662OooO0O0] & UByte.MAX_VALUE;
    }

    public final void OooO0O0(o0000OO0 o0000oo1, int i) {
        OooO0OO(o0000oo1.f36700OooO00o, 0, i);
        o0000oo1.OooOO0O(0);
    }

    public final void OooO0OO(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f36661OooO00o, this.f36662OooO0O0, bArr, i, i2);
        this.f36662OooO0O0 += i2;
    }

    public final int OooO0Oo() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 24;
        int i4 = i2 + 1;
        this.f36662OooO0O0 = i4;
        int i5 = i3 | ((bArr[i2] & UByte.MAX_VALUE) << 16);
        int i6 = i4 + 1;
        this.f36662OooO0O0 = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 8);
        this.f36662OooO0O0 = i6 + 1;
        return (bArr[i6] & UByte.MAX_VALUE) | i7;
    }

    public final int OooO0o() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i2 + 1;
        this.f36662OooO0O0 = i4;
        int i5 = i3 | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        int i6 = i4 + 1;
        this.f36662OooO0O0 = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 16);
        this.f36662OooO0O0 = i6 + 1;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | i7;
    }

    @Nullable
    public final String OooO0o0() {
        int i = this.f36663OooO0OO;
        int i2 = this.f36662OooO0O0;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f36663OooO0OO) {
            byte b = this.f36661OooO00o[i2];
            int i3 = o000OOo0.f36740OooO00o;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.f36662OooO0O0;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f36661OooO00o;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f36662OooO0O0 = i4 + 3;
            }
        }
        byte[] bArr2 = this.f36661OooO00o;
        int i5 = this.f36662OooO0O0;
        String strOooOOO0 = o000OOo0.OooOOO0(bArr2, i5, i2 - i5);
        this.f36662OooO0O0 = i2;
        int i6 = this.f36663OooO0OO;
        if (i2 == i6) {
            return strOooOOO0;
        }
        byte[] bArr3 = this.f36661OooO00o;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f36662OooO0O0 = i7;
            if (i7 == i6) {
                return strOooOOO0;
            }
        }
        int i8 = this.f36662OooO0O0;
        if (bArr3[i8] == 10) {
            this.f36662OooO0O0 = i8 + 1;
        }
        return strOooOOO0;
    }

    public final short OooO0oO() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.f36662OooO0O0 = i2 + 1;
        return (short) (((bArr[i2] & UByte.MAX_VALUE) << 8) | i3);
    }

    public final long OooO0oo() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        this.f36662OooO0O0 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        this.f36662OooO0O0 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f36662OooO0O0 = i4 + 1;
        return j3 | ((((long) bArr[i4]) & 255) << 24);
    }

    public final int OooOO0() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.f36662OooO0O0 = i2 + 1;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public final long OooOO0O() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i2 + 1;
        this.f36662OooO0O0 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i3 + 1;
        this.f36662OooO0O0 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i4 + 1;
        this.f36662OooO0O0 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i5 + 1;
        this.f36662OooO0O0 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        this.f36662OooO0O0 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i7 + 1;
        this.f36662OooO0O0 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f36662OooO0O0 = i8 + 1;
        return j7 | (((long) bArr[i8]) & 255);
    }

    @Nullable
    public final String OooOO0o() {
        int i = this.f36663OooO0OO;
        int i2 = this.f36662OooO0O0;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f36663OooO0OO && this.f36661OooO00o[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f36661OooO00o;
        int i3 = this.f36662OooO0O0;
        String strOooOOO0 = o000OOo0.OooOOO0(bArr, i3, i2 - i3);
        this.f36662OooO0O0 = i2;
        if (i2 < this.f36663OooO0OO) {
            this.f36662OooO0O0 = i2 + 1;
        }
        return strOooOOO0;
    }

    public final String OooOOO(int i) {
        return OooOOOO(i, OooO0o.f38232OooO0OO);
    }

    public final String OooOOO0(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f36662OooO0O0;
        int i3 = (i2 + i) - 1;
        String strOooOOO0 = o000OOo0.OooOOO0(this.f36661OooO00o, i2, (i3 >= this.f36663OooO0OO || this.f36661OooO00o[i3] != 0) ? i : i - 1);
        this.f36662OooO0O0 += i;
        return strOooOOO0;
    }

    public final String OooOOOO(int i, Charset charset) {
        String str = new String(this.f36661OooO00o, this.f36662OooO0O0, i, charset);
        this.f36662OooO0O0 += i;
        return str;
    }

    public final int OooOOOo() {
        return (OooOOo0() << 21) | (OooOOo0() << 14) | (OooOOo0() << 7) | OooOOo0();
    }

    public final long OooOOo() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i2 + 1;
        this.f36662OooO0O0 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i3 + 1;
        this.f36662OooO0O0 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f36662OooO0O0 = i4 + 1;
        return j3 | (((long) bArr[i4]) & 255);
    }

    public final int OooOOo0() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        this.f36662OooO0O0 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int OooOOoo() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 16;
        int i4 = i2 + 1;
        this.f36662OooO0O0 = i4;
        int i5 = i3 | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        this.f36662OooO0O0 = i4 + 1;
        return (bArr[i4] & UByte.MAX_VALUE) | i5;
    }

    public final void OooOo(int i) {
        byte[] bArr = this.f36661OooO00o;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        OooOoO0(bArr, i);
    }

    public final long OooOo0() {
        long jOooOO0O = OooOO0O();
        if (jOooOO0O >= 0) {
            return jOooOO0O;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jOooOO0O);
        throw new IllegalStateException(sb.toString());
    }

    public final int OooOo00() {
        int iOooO0Oo = OooO0Oo();
        if (iOooO0Oo >= 0) {
            return iOooO0Oo;
        }
        throw new IllegalStateException(Oooo0.OooO00o(29, "Top bit not zero: ", iOooO0Oo));
    }

    public final int OooOo0O() {
        byte[] bArr = this.f36661OooO00o;
        int i = this.f36662OooO0O0;
        int i2 = i + 1;
        this.f36662OooO0O0 = i2;
        int i3 = (bArr[i] & UByte.MAX_VALUE) << 8;
        this.f36662OooO0O0 = i2 + 1;
        return (bArr[i2] & UByte.MAX_VALUE) | i3;
    }

    public final long OooOo0o() {
        int i;
        int i2;
        long j = this.f36661OooO00o[this.f36662OooO0O0];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f36661OooO00o[this.f36662OooO0O0 + i];
            if ((b & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f36662OooO0O0 += i2;
        return j;
    }

    public final void OooOoO(int i) {
        o00000O0.OooO00o(i >= 0 && i <= this.f36661OooO00o.length);
        this.f36663OooO0OO = i;
    }

    public final void OooOoO0(byte[] bArr, int i) {
        this.f36661OooO00o = bArr;
        this.f36663OooO0OO = i;
        this.f36662OooO0O0 = 0;
    }

    public final void OooOoOO(int i) {
        o00000O0.OooO00o(i >= 0 && i <= this.f36663OooO0OO);
        this.f36662OooO0O0 = i;
    }

    public final void OooOoo0(int i) {
        OooOoOO(this.f36662OooO0O0 + i);
    }

    public o000(int i) {
        this.f36661OooO00o = new byte[i];
        this.f36663OooO0OO = i;
    }

    public o000(byte[] bArr) {
        this.f36661OooO00o = bArr;
        this.f36663OooO0OO = bArr.length;
    }

    public o000(byte[] bArr, int i) {
        this.f36661OooO00o = bArr;
        this.f36663OooO0OO = i;
    }
}
