package p327o0OO00Oo;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o[] f43049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f43051OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f43052OooO0Oo;

    public oo000o(int i, int i2) {
        o00oO0o[] o00oo0oArr = new o00oO0o[i];
        this.f43049OooO00o = o00oo0oArr;
        int length = o00oo0oArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f43049OooO00o[i3] = new o00oO0o(((i2 + 4) * 17) + 1);
        }
        this.f43052OooO0Oo = i2 * 17;
        this.f43051OooO0OO = i;
        this.f43050OooO0O0 = -1;
    }

    public final o00oO0o OooO00o() {
        return this.f43049OooO00o[this.f43050OooO0O0];
    }

    public final byte[][] OooO0O0(int i, int i2) {
        int i3 = this.f43051OooO0OO;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3 * i2, this.f43052OooO0Oo * i);
        int i4 = i3 * i2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i4 - i5) - 1;
            byte[] bArr2 = this.f43049OooO00o[i5 / i2].f43039OooO00o;
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
