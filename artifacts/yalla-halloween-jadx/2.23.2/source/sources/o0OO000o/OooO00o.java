package o0OO000o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements Cloneable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f42261OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f42262OooO0o0;

    public OooO00o() {
        this.f42262OooO0o0 = 0;
        this.f42261OooO0Oo = new int[1];
    }

    public final void OooO0O0(boolean z) {
        OooO0o0(this.f42262OooO0o0 + 1);
        if (z) {
            int[] iArr = this.f42261OooO0Oo;
            int i = this.f42262OooO0o0;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f42262OooO0o0++;
    }

    public final void OooO0Oo(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        OooO0o0(this.f42262OooO0o0 + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            OooO0O0(z);
            i2--;
        }
    }

    public final boolean OooO0o(int i) {
        return ((1 << (i & 31)) & this.f42261OooO0Oo[i / 32]) != 0;
    }

    public final void OooO0o0(int i) {
        int[] iArr = this.f42261OooO0Oo;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f42261OooO0Oo = iArr2;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new OooO00o((int[]) this.f42261OooO0Oo.clone(), this.f42262OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f42262OooO0o0 == oooO00o.f42262OooO0o0 && Arrays.equals(this.f42261OooO0Oo, oooO00o.f42261OooO0Oo);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42261OooO0Oo) + (this.f42262OooO0o0 * 31);
    }

    public final String toString() {
        int i = this.f42262OooO0o0;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f42262OooO0o0; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(OooO0o(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public OooO00o(int[] iArr, int i) {
        this.f42261OooO0Oo = iArr;
        this.f42262OooO0o0 = i;
    }
}
