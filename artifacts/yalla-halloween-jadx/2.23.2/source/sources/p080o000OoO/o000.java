package p080o000OoO;

import androidx.media3.common.util.UnstableApi;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f34922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34924OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34925OooO0Oo;

    public o000() {
        this.f34922OooO00o = o00.f34914OooO0o;
    }

    public final void OooO(int i, byte[] bArr) {
        o00Oo0.OooO0Oo(this.f34924OooO0OO == 0);
        System.arraycopy(this.f34922OooO00o, this.f34923OooO0O0, bArr, 0, i);
        this.f34923OooO0O0 += i;
        OooO00o();
    }

    public final void OooO00o() {
        int i;
        int i2 = this.f34923OooO0O0;
        o00Oo0.OooO0Oo(i2 >= 0 && (i2 < (i = this.f34925OooO0Oo) || (i2 == i && this.f34924OooO0OO == 0)));
    }

    public final int OooO0O0() {
        return ((this.f34925OooO0Oo - this.f34923OooO0O0) * 8) - this.f34924OooO0OO;
    }

    public final void OooO0OO() {
        if (this.f34924OooO0OO == 0) {
            return;
        }
        this.f34924OooO0OO = 0;
        this.f34923OooO0O0++;
        OooO00o();
    }

    public final int OooO0Oo() {
        o00Oo0.OooO0Oo(this.f34924OooO0OO == 0);
        return this.f34923OooO0O0;
    }

    public final boolean OooO0o() {
        boolean z = (this.f34922OooO00o[this.f34923OooO0O0] & (128 >> this.f34924OooO0OO)) != 0;
        OooOO0o();
        return z;
    }

    public final int OooO0o0() {
        return (this.f34923OooO0O0 * 8) + this.f34924OooO0OO;
    }

    public final int OooO0oO(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f34924OooO0OO += i;
        int i3 = 0;
        while (true) {
            i2 = this.f34924OooO0OO;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f34924OooO0OO = i4;
            byte[] bArr = this.f34922OooO00o;
            int i5 = this.f34923OooO0O0;
            this.f34923OooO0O0 = i5 + 1;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
        }
        byte[] bArr2 = this.f34922OooO00o;
        int i6 = this.f34923OooO0O0;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.f34924OooO0OO = 0;
            this.f34923OooO0O0 = i6 + 1;
        }
        OooO00o();
        return i7;
    }

    public final void OooO0oo(int i, byte[] bArr) {
        int i2 = (i >> 3) + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f34922OooO00o;
            int i4 = this.f34923OooO0O0;
            int i5 = i4 + 1;
            this.f34923OooO0O0 = i5;
            byte b = bArr2[i4];
            int i6 = this.f34924OooO0OO;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f34924OooO0OO;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f34922OooO00o;
            int i9 = this.f34923OooO0O0;
            this.f34923OooO0O0 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & UByte.MAX_VALUE) << i8));
            this.f34924OooO0OO = i8 - 8;
        }
        int i10 = this.f34924OooO0OO + i7;
        this.f34924OooO0OO = i10;
        byte[] bArr4 = this.f34922OooO00o;
        int i11 = this.f34923OooO0O0;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f34924OooO0OO = 0;
            this.f34923OooO0O0 = i11 + 1;
        }
        OooO00o();
    }

    public final void OooOO0(int i, byte[] bArr) {
        this.f34922OooO00o = bArr;
        this.f34923OooO0O0 = 0;
        this.f34924OooO0OO = 0;
        this.f34925OooO0Oo = i;
    }

    public final void OooOO0O(int i) {
        int i2 = i / 8;
        this.f34923OooO0O0 = i2;
        this.f34924OooO0OO = i - (i2 * 8);
        OooO00o();
    }

    public final void OooOO0o() {
        int i = this.f34924OooO0OO + 1;
        this.f34924OooO0OO = i;
        if (i == 8) {
            this.f34924OooO0OO = 0;
            this.f34923OooO0O0++;
        }
        OooO00o();
    }

    public final void OooOOO(int i) {
        o00Oo0.OooO0Oo(this.f34924OooO0OO == 0);
        this.f34923OooO0O0 += i;
        OooO00o();
    }

    public final void OooOOO0(int i) {
        int i2 = i / 8;
        int i3 = this.f34923OooO0O0 + i2;
        this.f34923OooO0O0 = i3;
        int i4 = (i - (i2 * 8)) + this.f34924OooO0OO;
        this.f34924OooO0OO = i4;
        if (i4 > 7) {
            this.f34923OooO0O0 = i3 + 1;
            this.f34924OooO0OO = i4 - 8;
        }
        OooO00o();
    }

    public o000(byte[] bArr, int i) {
        this.f34922OooO00o = bArr;
        this.f34925OooO0Oo = i;
    }
}
