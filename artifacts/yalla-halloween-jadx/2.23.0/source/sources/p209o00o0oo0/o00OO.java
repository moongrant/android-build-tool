package p209o00o0oo0;

import kotlin.UByte;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f39539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39540OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39541OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39542OooO0Oo;

    public o00OO(byte[] bArr) {
        this.f39539OooO00o = bArr;
        this.f39540OooO0O0 = bArr.length;
    }

    public final boolean OooO00o() {
        boolean z = (((this.f39539OooO00o[this.f39541OooO0OO] & UByte.MAX_VALUE) >> this.f39542OooO0Oo) & 1) == 1;
        OooO0OO(1);
        return z;
    }

    public final int OooO0O0(int i) {
        int i2 = this.f39541OooO0OO;
        int iMin = Math.min(i, 8 - this.f39542OooO0Oo);
        int i3 = i2 + 1;
        byte[] bArr = this.f39539OooO00o;
        int i4 = ((bArr[i2] & UByte.MAX_VALUE) >> this.f39542OooO0Oo) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & UByte.MAX_VALUE) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        OooO0OO(i);
        return i5;
    }

    public final void OooO0OO(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f39541OooO0OO + i3;
        this.f39541OooO0OO = i4;
        int i5 = (i - (i3 * 8)) + this.f39542OooO0Oo;
        this.f39542OooO0Oo = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f39541OooO0OO = i4 + 1;
            this.f39542OooO0Oo = i5 - 8;
        }
        int i6 = this.f39541OooO0OO;
        if (i6 < 0 || (i6 >= (i2 = this.f39540OooO0O0) && (i6 != i2 || this.f39542OooO0Oo != 0))) {
            z = false;
        }
        o00O000o.OooO0Oo(z);
    }
}
