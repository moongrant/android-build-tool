package p245o00oo0o;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f40584OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40585OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40586OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40587OooO0Oo;

    public o00OOOOo() {
        this.f40584OooO00o = o0O00.f40599OooO0o;
    }

    public final void OooO(int i, byte[] bArr) {
        o00O000o.OooO0Oo(this.f40586OooO0OO == 0);
        System.arraycopy(this.f40584OooO00o, this.f40585OooO0O0, bArr, 0, i);
        this.f40585OooO0O0 += i;
        OooO00o();
    }

    public final void OooO00o() {
        int i;
        int i2 = this.f40585OooO0O0;
        o00O000o.OooO0Oo(i2 >= 0 && (i2 < (i = this.f40587OooO0Oo) || (i2 == i && this.f40586OooO0OO == 0)));
    }

    public final int OooO0O0() {
        return ((this.f40587OooO0Oo - this.f40585OooO0O0) * 8) - this.f40586OooO0OO;
    }

    public final void OooO0OO() {
        if (this.f40586OooO0OO == 0) {
            return;
        }
        this.f40586OooO0OO = 0;
        this.f40585OooO0O0++;
        OooO00o();
    }

    public final int OooO0Oo() {
        o00O000o.OooO0Oo(this.f40586OooO0OO == 0);
        return this.f40585OooO0O0;
    }

    public final boolean OooO0o() {
        boolean z = (this.f40584OooO00o[this.f40585OooO0O0] & (128 >> this.f40586OooO0OO)) != 0;
        OooOO0o();
        return z;
    }

    public final int OooO0o0() {
        return (this.f40585OooO0O0 * 8) + this.f40586OooO0OO;
    }

    public final int OooO0oO(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f40586OooO0OO += i;
        int i3 = 0;
        while (true) {
            i2 = this.f40586OooO0OO;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f40586OooO0OO = i4;
            byte[] bArr = this.f40584OooO00o;
            int i5 = this.f40585OooO0O0;
            this.f40585OooO0O0 = i5 + 1;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
        }
        byte[] bArr2 = this.f40584OooO00o;
        int i6 = this.f40585OooO0O0;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f40586OooO0OO = 0;
            this.f40585OooO0O0 = i6 + 1;
        }
        OooO00o();
        return i7;
    }

    public final void OooO0oo(int i, byte[] bArr) {
        int i2 = (i >> 3) + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f40584OooO00o;
            int i4 = this.f40585OooO0O0;
            int i5 = i4 + 1;
            this.f40585OooO0O0 = i5;
            byte b = bArr2[i4];
            int i6 = this.f40586OooO0OO;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f40586OooO0OO;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f40584OooO00o;
            int i9 = this.f40585OooO0O0;
            this.f40585OooO0O0 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & UByte.MAX_VALUE) << i8));
            this.f40586OooO0OO = i8 - 8;
        }
        int i10 = this.f40586OooO0OO + i7;
        this.f40586OooO0OO = i10;
        byte[] bArr4 = this.f40584OooO00o;
        int i11 = this.f40585OooO0O0;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f40586OooO0OO = 0;
            this.f40585OooO0O0 = i11 + 1;
        }
        OooO00o();
    }

    public final void OooOO0(int i, byte[] bArr) {
        this.f40584OooO00o = bArr;
        this.f40585OooO0O0 = 0;
        this.f40586OooO0OO = 0;
        this.f40587OooO0Oo = i;
    }

    public final void OooOO0O(int i) {
        int i2 = i / 8;
        this.f40585OooO0O0 = i2;
        this.f40586OooO0OO = i - (i2 * 8);
        OooO00o();
    }

    public final void OooOO0o() {
        int i = this.f40586OooO0OO + 1;
        this.f40586OooO0OO = i;
        if (i == 8) {
            this.f40586OooO0OO = 0;
            this.f40585OooO0O0++;
        }
        OooO00o();
    }

    public final void OooOOO(int i) {
        o00O000o.OooO0Oo(this.f40586OooO0OO == 0);
        this.f40585OooO0O0 += i;
        OooO00o();
    }

    public final void OooOOO0(int i) {
        int i2 = i / 8;
        int i3 = this.f40585OooO0O0 + i2;
        this.f40585OooO0O0 = i3;
        int i4 = (i - (i2 * 8)) + this.f40586OooO0OO;
        this.f40586OooO0OO = i4;
        if (i4 > 7) {
            this.f40585OooO0O0 = i3 + 1;
            this.f40586OooO0OO = i4 - 8;
        }
        OooO00o();
    }

    public o00OOOOo(byte[] bArr, int i) {
        this.f40584OooO00o = bArr;
        this.f40587OooO0Oo = i;
    }
}
