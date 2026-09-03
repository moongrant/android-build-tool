package p318o0O0oOo;

import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f36700OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f36701OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36702OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36703OooO0Oo;

    public o0000OO0() {
        this.f36700OooO00o = o000OOo0.f36744OooO0o;
    }

    public final void OooO(byte[] bArr, int i) {
        o00000O0.OooO0Oo(this.f36702OooO0OO == 0);
        System.arraycopy(this.f36700OooO00o, this.f36701OooO0O0, bArr, 0, i);
        this.f36701OooO0O0 += i;
        OooO00o();
    }

    public final void OooO00o() {
        int i;
        int i2 = this.f36701OooO0O0;
        o00000O0.OooO0Oo(i2 >= 0 && (i2 < (i = this.f36703OooO0Oo) || (i2 == i && this.f36702OooO0OO == 0)));
    }

    public final int OooO0O0() {
        return ((this.f36703OooO0Oo - this.f36701OooO0O0) * 8) - this.f36702OooO0OO;
    }

    public final void OooO0OO() {
        if (this.f36702OooO0OO == 0) {
            return;
        }
        this.f36702OooO0OO = 0;
        this.f36701OooO0O0++;
        OooO00o();
    }

    public final int OooO0Oo() {
        o00000O0.OooO0Oo(this.f36702OooO0OO == 0);
        return this.f36701OooO0O0;
    }

    public final boolean OooO0o() {
        boolean z = (this.f36700OooO00o[this.f36701OooO0O0] & (128 >> this.f36702OooO0OO)) != 0;
        OooOO0o();
        return z;
    }

    public final int OooO0o0() {
        return (this.f36701OooO0O0 * 8) + this.f36702OooO0OO;
    }

    public final int OooO0oO(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f36702OooO0OO += i;
        int i3 = 0;
        while (true) {
            i2 = this.f36702OooO0OO;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f36702OooO0OO = i4;
            byte[] bArr = this.f36700OooO00o;
            int i5 = this.f36701OooO0O0;
            this.f36701OooO0O0 = i5 + 1;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
        }
        byte[] bArr2 = this.f36700OooO00o;
        int i6 = this.f36701OooO0O0;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f36702OooO0OO = 0;
            this.f36701OooO0O0 = i6 + 1;
        }
        OooO00o();
        return i7;
    }

    public final void OooO0oo(byte[] bArr, int i) {
        int i2 = (i >> 3) + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f36700OooO00o;
            int i4 = this.f36701OooO0O0;
            int i5 = i4 + 1;
            this.f36701OooO0O0 = i5;
            byte b = bArr2[i4];
            int i6 = this.f36702OooO0OO;
            bArr[i3] = (byte) (b << i6);
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i3]);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i2] = (byte) (bArr[i2] & (KotlinVersion.MAX_COMPONENT_VALUE >> i7));
        int i8 = this.f36702OooO0OO;
        if (i8 + i7 > 8) {
            int i9 = bArr[i2];
            byte[] bArr3 = this.f36700OooO00o;
            int i10 = this.f36701OooO0O0;
            this.f36701OooO0O0 = i10 + 1;
            bArr[i2] = (byte) (i9 | ((bArr3[i10] & UByte.MAX_VALUE) << i8));
            this.f36702OooO0OO = i8 - 8;
        }
        int i11 = this.f36702OooO0OO + i7;
        this.f36702OooO0OO = i11;
        byte[] bArr4 = this.f36700OooO00o;
        int i12 = this.f36701OooO0O0;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i2]);
        if (i11 == 8) {
            this.f36702OooO0OO = 0;
            this.f36701OooO0O0 = i12 + 1;
        }
        OooO00o();
    }

    public final void OooOO0(byte[] bArr, int i) {
        this.f36700OooO00o = bArr;
        this.f36701OooO0O0 = 0;
        this.f36702OooO0OO = 0;
        this.f36703OooO0Oo = i;
    }

    public final void OooOO0O(int i) {
        int i2 = i / 8;
        this.f36701OooO0O0 = i2;
        this.f36702OooO0OO = i - (i2 * 8);
        OooO00o();
    }

    public final void OooOO0o() {
        int i = this.f36702OooO0OO + 1;
        this.f36702OooO0OO = i;
        if (i == 8) {
            this.f36702OooO0OO = 0;
            this.f36701OooO0O0++;
        }
        OooO00o();
    }

    public final void OooOOO(int i) {
        o00000O0.OooO0Oo(this.f36702OooO0OO == 0);
        this.f36701OooO0O0 += i;
        OooO00o();
    }

    public final void OooOOO0(int i) {
        int i2 = i / 8;
        int i3 = this.f36701OooO0O0 + i2;
        this.f36701OooO0O0 = i3;
        int i4 = (i - (i2 * 8)) + this.f36702OooO0OO;
        this.f36702OooO0OO = i4;
        if (i4 > 7) {
            this.f36701OooO0O0 = i3 + 1;
            this.f36702OooO0OO = i4 - 8;
        }
        OooO00o();
    }

    public o0000OO0(byte[] bArr, int i) {
        this.f36700OooO00o = bArr;
        this.f36703OooO0Oo = i;
    }
}
