package p398o0Oo00oO;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharSequence f38957OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38958OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38959OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f38960OooO0Oo;

    public Oooo0(CharSequence charSequence, int i, int i2) {
        this.f38957OooO00o = charSequence;
        this.f38959OooO0OO = i;
        this.f38958OooO0O0 = i2;
        byte[] bArr = new byte[i * i2];
        this.f38960OooO0Oo = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final boolean OooO00o(int i, int i2) {
        return this.f38960OooO0Oo[(i2 * this.f38959OooO0OO) + i] >= 0;
    }

    public final void OooO0O0(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f38958OooO0O0;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f38959OooO0OO;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        OooO0OO(i2, i, (this.f38957OooO00o.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    public final void OooO0OO(int i, int i2, boolean z) {
        this.f38960OooO0Oo[(i2 * this.f38959OooO0OO) + i] = z ? (byte) 1 : (byte) 0;
    }

    public final void OooO0Oo(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        OooO0O0(i4, i5, i3, 1);
        int i6 = i2 - 1;
        OooO0O0(i4, i6, i3, 2);
        int i7 = i - 1;
        OooO0O0(i7, i5, i3, 3);
        OooO0O0(i7, i6, i3, 4);
        OooO0O0(i7, i2, i3, 5);
        OooO0O0(i, i5, i3, 6);
        OooO0O0(i, i6, i3, 7);
        OooO0O0(i, i2, i3, 8);
    }
}
