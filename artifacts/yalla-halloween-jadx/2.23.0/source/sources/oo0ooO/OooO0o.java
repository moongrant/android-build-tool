package oo0ooO;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharSequence f60939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f60940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f60941OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f60942OooO0Oo;

    public OooO0o(String str, int i, int i2) {
        this.f60939OooO00o = str;
        this.f60941OooO0OO = i;
        this.f60940OooO0O0 = i2;
        byte[] bArr = new byte[i * i2];
        this.f60942OooO0Oo = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void OooO00o(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f60940OooO0O0;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        int i6 = this.f60941OooO0OO;
        if (i2 < 0) {
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        this.f60942OooO0Oo[(i * i6) + i2] = (byte) ((this.f60939OooO00o.charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public final void OooO0O0(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        OooO00o(i4, i5, i3, 1);
        int i6 = i2 - 1;
        OooO00o(i4, i6, i3, 2);
        int i7 = i - 1;
        OooO00o(i7, i5, i3, 3);
        OooO00o(i7, i6, i3, 4);
        OooO00o(i7, i2, i3, 5);
        OooO00o(i, i5, i3, 6);
        OooO00o(i, i6, i3, 7);
        OooO00o(i, i2, i3, 8);
    }
}
