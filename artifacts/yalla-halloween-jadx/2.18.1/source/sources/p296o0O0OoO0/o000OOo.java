package p296o0O0OoO0;

import kotlin.KotlinVersion;
import kotlin.UByte;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f35907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35908OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f35909OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35910OooO0Oo;

    public o000OOo(byte[] bArr) {
        this.f35907OooO00o = bArr;
        this.f35908OooO0O0 = bArr.length;
    }

    public final boolean OooO00o() {
        boolean z = (((this.f35907OooO00o[this.f35909OooO0OO] & UByte.MAX_VALUE) >> this.f35910OooO0Oo) & 1) == 1;
        OooO0OO(1);
        return z;
    }

    public final int OooO0O0(int i) {
        int i2 = this.f35909OooO0OO;
        int iMin = Math.min(i, 8 - this.f35910OooO0Oo);
        int i3 = i2 + 1;
        int i4 = ((this.f35907OooO00o[i2] & UByte.MAX_VALUE) >> this.f35910OooO0Oo) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f35907OooO00o[i3] & UByte.MAX_VALUE) << iMin;
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
        int i4 = this.f35909OooO0OO + i3;
        this.f35909OooO0OO = i4;
        int i5 = (i - (i3 * 8)) + this.f35910OooO0Oo;
        this.f35910OooO0Oo = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f35909OooO0OO = i4 + 1;
            this.f35910OooO0Oo = i5 - 8;
        }
        int i6 = this.f35909OooO0OO;
        if (i6 < 0 || (i6 >= (i2 = this.f35908OooO0O0) && (i6 != i2 || this.f35910OooO0Oo != 0))) {
            z = false;
        }
        o00000O0.OooO0Oo(z);
    }
}
