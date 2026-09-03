package p245o00oo0o;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f40622OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40623OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40624OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40625OooO0Oo = 0;

    public o0oOO(byte[] bArr, int i, int i2) {
        this.f40622OooO00o = bArr;
        this.f40624OooO0OO = i;
        this.f40623OooO0O0 = i2;
        OooO00o();
    }

    public final void OooO() {
        int i = this.f40625OooO0Oo + 1;
        this.f40625OooO0Oo = i;
        if (i == 8) {
            this.f40625OooO0Oo = 0;
            int i2 = this.f40624OooO0OO;
            this.f40624OooO0OO = i2 + (OooO0oo(i2 + 1) ? 2 : 1);
        }
        OooO00o();
    }

    public final void OooO00o() {
        int i;
        int i2 = this.f40624OooO0OO;
        o00O000o.OooO0Oo(i2 >= 0 && (i2 < (i = this.f40623OooO0O0) || (i2 == i && this.f40625OooO0Oo == 0)));
    }

    public final boolean OooO0O0(int i) {
        int i2 = this.f40624OooO0OO;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f40625OooO0Oo + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f40623OooO0O0) {
                break;
            }
            if (OooO0oo(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f40623OooO0O0;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean OooO0OO() {
        int i = this.f40624OooO0OO;
        int i2 = this.f40625OooO0Oo;
        int i3 = 0;
        while (this.f40624OooO0OO < this.f40623OooO0O0 && !OooO0Oo()) {
            i3++;
        }
        boolean z = this.f40624OooO0OO == this.f40623OooO0O0;
        this.f40624OooO0OO = i;
        this.f40625OooO0Oo = i2;
        return !z && OooO0O0((i3 * 2) + 1);
    }

    public final boolean OooO0Oo() {
        boolean z = (this.f40622OooO00o[this.f40624OooO0OO] & (128 >> this.f40625OooO0Oo)) != 0;
        OooO();
        return z;
    }

    public final int OooO0o() {
        int i = 0;
        while (!OooO0Oo()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? OooO0o0(i) : 0);
    }

    public final int OooO0o0(int i) {
        int i2;
        this.f40625OooO0Oo += i;
        int i3 = 0;
        while (true) {
            i2 = this.f40625OooO0Oo;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f40625OooO0Oo = i5;
            byte[] bArr = this.f40622OooO00o;
            int i6 = this.f40624OooO0OO;
            i3 |= (bArr[i6] & UByte.MAX_VALUE) << i5;
            if (!OooO0oo(i6 + 1)) {
                i4 = 1;
            }
            this.f40624OooO0OO = i6 + i4;
        }
        byte[] bArr2 = this.f40622OooO00o;
        int i7 = this.f40624OooO0OO;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f40625OooO0Oo = 0;
            this.f40624OooO0OO = i7 + (OooO0oo(i7 + 1) ? 2 : 1);
        }
        OooO00o();
        return i8;
    }

    public final int OooO0oO() {
        int iOooO0o = OooO0o();
        return ((iOooO0o + 1) / 2) * (iOooO0o % 2 == 0 ? -1 : 1);
    }

    public final boolean OooO0oo(int i) {
        if (2 <= i && i < this.f40623OooO0O0) {
            byte[] bArr = this.f40622OooO00o;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void OooOO0(int i) {
        int i2 = this.f40624OooO0OO;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f40624OooO0OO = i4;
        int i5 = (i - (i3 * 8)) + this.f40625OooO0Oo;
        this.f40625OooO0Oo = i5;
        if (i5 > 7) {
            this.f40624OooO0OO = i4 + 1;
            this.f40625OooO0Oo = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f40624OooO0OO) {
                OooO00o();
                return;
            } else if (OooO0oo(i2)) {
                this.f40624OooO0OO++;
                i2 += 2;
            }
        }
    }
}
