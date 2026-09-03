package p677o0oooo0o;

import com.umeng.analytics.pro.bz;
import java.io.IOException;
import kotlin.UByte;
import oO000Oo.OooO00o;
import oO000Oo.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class O0O0 extends oO0OO0O implements oOO00000 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52110Oooo0o;

    public O0O0(byte[] bArr) {
        this.f52110Oooo0o = bArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof O0O0) {
            return OooO00o.OooO00o(this.f52110Oooo0o, ((O0O0) oo0oo0o).f52110Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oOO00000
    public final String OooO0OO() {
        char c;
        byte[] bArr = this.f52110Oooo0o;
        String str = OooO0o.f52666OooO00o;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            i3++;
            if ((bArr[i2] & 240) == 240) {
                i3++;
                i2 += 4;
            } else if ((bArr[i2] & 224) == 224) {
                i2 += 3;
            } else {
                i2 = (bArr[i2] & 192) == 192 ? i2 + 2 : i2 + 1;
            }
        }
        char[] cArr = new char[i3];
        int i4 = 0;
        while (i < bArr.length) {
            if ((bArr[i] & 240) == 240) {
                int i5 = (((((bArr[i] & 3) << 18) | ((bArr[i + 1] & 63) << 12)) | ((bArr[i + 2] & 63) << 6)) | (bArr[i + 3] & 63)) - 65536;
                char c2 = (char) (55296 | (i5 >> 10));
                c = (char) ((i5 & 1023) | 56320);
                cArr[i4] = c2;
                i += 4;
                i4++;
            } else if ((bArr[i] & 224) == 224) {
                c = (char) (((bArr[i] & bz.m) << 12) | ((bArr[i + 1] & 63) << 6) | (bArr[i + 2] & 63));
                i += 3;
            } else if ((bArr[i] & 208) == 208 || (bArr[i] & 192) == 192) {
                int i6 = (bArr[i] & 31) << 6;
                byte b = bArr[i + 1];
                c = (char) (i6 | (b & 63));
                i += 2;
            } else {
                c = (char) (bArr[i] & UByte.MAX_VALUE);
                i++;
            }
            cArr[i4] = c;
            i4++;
        }
        return new String(cArr);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(12, this.f52110Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        return m.OooO00o(this.f52110Oooo0o.length) + 1 + this.f52110Oooo0o.length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return OooO00o.OooO0oO(this.f52110Oooo0o);
    }

    public final String toString() {
        return OooO0OO();
    }
}
