package p635o0ooO0O0;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0o[] f48853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f48854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f48855OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f48856OooO0Oo;

    public o000O000(int i, int i2) {
        o000O0o[] o000o0oArr = new o000O0o[i];
        this.f48853OooO00o = o000o0oArr;
        int length = o000o0oArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f48853OooO00o[i3] = new o000O0o(((i2 + 4) * 17) + 1);
        }
        this.f48856OooO0Oo = i2 * 17;
        this.f48855OooO0OO = i;
        this.f48854OooO0O0 = -1;
    }

    public final o000O0o OooO00o() {
        return this.f48853OooO00o[this.f48854OooO0O0];
    }

    public final byte[][] OooO0O0(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.f48855OooO0OO * i2, this.f48856OooO0Oo * i);
        int i3 = this.f48855OooO0OO * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            o000O0o o000o0o2 = this.f48853OooO00o[i4 / i2];
            int length = o000o0o2.f48857OooO00o.length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = o000o0o2.f48857OooO00o[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }
}
