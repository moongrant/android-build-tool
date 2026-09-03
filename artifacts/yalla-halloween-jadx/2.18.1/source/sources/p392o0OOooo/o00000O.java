package p392o0OOooo;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O implements Cloneable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int[] f38916Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f38917Oooo0oO;

    public o00000O() {
        this.f38917Oooo0oO = 0;
        this.f38916Oooo0o = new int[1];
    }

    public final int OooO() {
        return (this.f38917Oooo0oO + 7) / 8;
    }

    public final void OooO0OO(boolean z) {
        OooO0o(this.f38917Oooo0oO + 1);
        if (z) {
            int[] iArr = this.f38916Oooo0o;
            int i = this.f38917Oooo0oO;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f38917Oooo0oO++;
    }

    public final void OooO0Oo(o00000O o00000o) {
        int i = o00000o.f38917Oooo0oO;
        OooO0o(this.f38917Oooo0oO + i);
        for (int i2 = 0; i2 < i; i2++) {
            OooO0OO(o00000o.OooO0oO(i2));
        }
    }

    public final void OooO0o(int i) {
        int[] iArr = this.f38916Oooo0o;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f38916Oooo0o = iArr2;
        }
    }

    public final void OooO0o0(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        OooO0o(this.f38917Oooo0oO + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            OooO0OO(z);
            i2--;
        }
    }

    public final boolean OooO0oO(int i) {
        return ((1 << (i & 31)) & this.f38916Oooo0o[i / 32]) != 0;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o00000O((int[]) this.f38916Oooo0o.clone(), this.f38917Oooo0oO);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000O)) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return this.f38917Oooo0oO == o00000o.f38917Oooo0oO && Arrays.equals(this.f38916Oooo0o, o00000o.f38916Oooo0o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f38916Oooo0o) + (this.f38917Oooo0oO * 31);
    }

    public final String toString() {
        int i = this.f38917Oooo0oO;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f38917Oooo0oO; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(OooO0oO(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public o00000O(int[] iArr, int i) {
        this.f38916Oooo0o = iArr;
        this.f38917Oooo0oO = i;
    }
}
