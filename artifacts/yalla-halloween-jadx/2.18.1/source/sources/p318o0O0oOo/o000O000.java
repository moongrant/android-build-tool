package p318o0O0oOo;

import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f36716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f36717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36718OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36719OooO0Oo;

    public /* synthetic */ o000O000(int i) {
        this.f36717OooO0O0 = i;
        this.f36716OooO00o = new byte[i];
        this.f36718OooO0OO = 0;
        this.f36719OooO0Oo = 0;
    }

    public final boolean OooO(int i) {
        if (2 <= i && i < this.f36717OooO0O0) {
            byte[] bArr = this.f36716OooO00o;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void OooO00o() {
        int i;
        int i2 = this.f36718OooO0OO;
        o00000O0.OooO0Oo(i2 >= 0 && (i2 < (i = this.f36717OooO0O0) || (i2 == i && this.f36719OooO0Oo == 0)));
    }

    public final boolean OooO0O0(int i) {
        int i2 = this.f36718OooO0OO;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f36719OooO0Oo + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f36717OooO0O0) {
                break;
            }
            if (OooO(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f36717OooO0O0;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean OooO0OO() {
        int i = this.f36718OooO0OO;
        int i2 = this.f36719OooO0Oo;
        int i3 = 0;
        while (this.f36718OooO0OO < this.f36717OooO0O0 && !OooO0o0()) {
            i3++;
        }
        boolean z = this.f36718OooO0OO == this.f36717OooO0O0;
        this.f36718OooO0OO = i;
        this.f36719OooO0Oo = i2;
        return !z && OooO0O0((i3 * 2) + 1);
    }

    public final int OooO0Oo(boolean z) {
        int i;
        if (z) {
            int i2 = this.f36719OooO0Oo;
            int i3 = this.f36718OooO0OO;
            if (i2 > i3) {
                i = (i3 - i2) + this.f36717OooO0O0;
            } else {
                if (i2 >= i3) {
                    return this.f36717OooO0O0 - 1;
                }
                i = i3 - i2;
            }
            return i - 1;
        }
        int i4 = this.f36719OooO0Oo;
        int i5 = this.f36718OooO0OO;
        if (i4 > i5) {
            return i4 - i5;
        }
        if (i4 >= i5) {
            return 0;
        }
        return this.f36717OooO0O0 + (i4 - i5);
    }

    public final int OooO0o(int i) {
        int i2;
        this.f36719OooO0Oo += i;
        int i3 = 0;
        while (true) {
            i2 = this.f36719OooO0Oo;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f36719OooO0Oo = i5;
            byte[] bArr = this.f36716OooO00o;
            int i6 = this.f36718OooO0OO;
            i3 |= (bArr[i6] & UByte.MAX_VALUE) << i5;
            if (!OooO(i6 + 1)) {
                i4 = 1;
            }
            this.f36718OooO0OO = i6 + i4;
        }
        byte[] bArr2 = this.f36716OooO00o;
        int i7 = this.f36718OooO0OO;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f36719OooO0Oo = 0;
            this.f36718OooO0OO = i7 + (OooO(i7 + 1) ? 2 : 1);
        }
        OooO00o();
        return i8;
    }

    public final boolean OooO0o0() {
        boolean z = (this.f36716OooO00o[this.f36718OooO0OO] & (128 >> this.f36719OooO0Oo)) != 0;
        OooOO0();
        return z;
    }

    public final int OooO0oO() {
        int i = 0;
        while (!OooO0o0()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? OooO0o(i) : 0);
    }

    public final int OooO0oo() {
        int iOooO0oO = OooO0oO();
        return ((iOooO0oO + 1) / 2) * (iOooO0oO % 2 == 0 ? -1 : 1);
    }

    public final void OooOO0() {
        int i = this.f36719OooO0Oo + 1;
        this.f36719OooO0Oo = i;
        if (i == 8) {
            this.f36719OooO0Oo = 0;
            int i2 = this.f36718OooO0OO;
            this.f36718OooO0OO = i2 + (OooO(i2 + 1) ? 2 : 1);
        }
        OooO00o();
    }

    public final void OooOO0O(int i) {
        int i2 = this.f36718OooO0OO;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f36718OooO0OO = i4;
        int i5 = (i - (i3 * 8)) + this.f36719OooO0Oo;
        this.f36719OooO0Oo = i5;
        if (i5 > 7) {
            this.f36718OooO0OO = i4 + 1;
            this.f36719OooO0Oo = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f36718OooO0OO) {
                OooO00o();
                return;
            } else if (OooO(i2)) {
                this.f36718OooO0OO++;
                i2 += 2;
            }
        }
    }

    public o000O000(byte[] bArr, int i, int i2) {
        this.f36716OooO00o = bArr;
        this.f36718OooO0OO = i;
        this.f36717OooO0O0 = i2;
        this.f36719OooO0Oo = 0;
        OooO00o();
    }
}
