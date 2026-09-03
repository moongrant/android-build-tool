package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f34693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34694OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34695OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34696OooO0Oo;

    public o00000(byte[] bArr) {
        this.f34693OooO00o = bArr;
        this.f34694OooO0O0 = bArr.length;
    }

    public final boolean OooO00o() {
        boolean z = (((this.f34693OooO00o[this.f34695OooO0OO] & UByte.MAX_VALUE) >> this.f34696OooO0Oo) & 1) == 1;
        OooO0OO(1);
        return z;
    }

    public final int OooO0O0(int i) {
        int i2 = this.f34695OooO0OO;
        int iMin = Math.min(i, 8 - this.f34696OooO0Oo);
        int i3 = i2 + 1;
        byte[] bArr = this.f34693OooO00o;
        int i4 = ((bArr[i2] & UByte.MAX_VALUE) >> this.f34696OooO0Oo) & (255 >> (8 - iMin));
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
        int i4 = this.f34695OooO0OO + i3;
        this.f34695OooO0OO = i4;
        int i5 = (i - (i3 * 8)) + this.f34696OooO0Oo;
        this.f34696OooO0Oo = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f34695OooO0OO = i4 + 1;
            this.f34696OooO0Oo = i5 - 8;
        }
        int i6 = this.f34695OooO0OO;
        if (i6 < 0 || (i6 >= (i2 = this.f34694OooO0O0) && (i6 != i2 || this.f34696OooO0Oo != 0))) {
            z = false;
        }
        p080o000OoO.o00Oo0.OooO0Oo(z);
    }
}
