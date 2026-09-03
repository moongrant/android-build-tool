package o0OO00o0;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0[] f42321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f42322OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42323OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f42324OooO0Oo;

    public OooO00o(int i, int i2) {
        OooO0O0[] oooO0O0Arr = new OooO0O0[i];
        this.f42321OooO00o = oooO0O0Arr;
        int length = oooO0O0Arr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f42321OooO00o[i3] = new OooO0O0(((i2 + 4) * 17) + 1);
        }
        this.f42324OooO0Oo = i2 * 17;
        this.f42323OooO0OO = i;
        this.f42322OooO0O0 = -1;
    }

    public final OooO0O0 OooO00o() {
        return this.f42321OooO00o[this.f42322OooO0O0];
    }

    public final byte[][] OooO0O0(int i, int i2) {
        int i3 = this.f42323OooO0OO;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3 * i2, this.f42324OooO0Oo * i);
        int i4 = i3 * i2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i4 - i5) - 1;
            byte[] bArr2 = this.f42321OooO00o[i5 / i2].f42325OooO00o;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                bArr3[i7] = bArr2[i7 / i];
            }
            bArr[i6] = bArr3;
        }
        return bArr;
    }
}
