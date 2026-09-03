package p392o0OOooo;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements Cloneable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int[] f38918Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f38919Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f38920Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f38921Oooo0oo;

    public o00000OO(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f38919Oooo0o = i;
        this.f38920Oooo0oO = i2;
        int i3 = (i + 31) / 32;
        this.f38921Oooo0oo = i3;
        this.f38918Oooo = new int[i3 * i2];
    }

    public final boolean OooO0OO(int i, int i2) {
        return ((this.f38918Oooo[(i / 32) + (i2 * this.f38921Oooo0oo)] >>> (i & 31)) & 1) != 0;
    }

    public final void OooO0Oo(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f38921Oooo0oo);
        int[] iArr = this.f38918Oooo;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void OooO0o0(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f38920Oooo0oO || i5 > this.f38919Oooo0o) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f38921Oooo0oo * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f38918Oooo;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new o00000OO(this.f38919Oooo0o, this.f38920Oooo0oO, this.f38921Oooo0oo, (int[]) this.f38918Oooo.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        return this.f38919Oooo0o == o00000oo2.f38919Oooo0o && this.f38920Oooo0oO == o00000oo2.f38920Oooo0oO && this.f38921Oooo0oo == o00000oo2.f38921Oooo0oo && Arrays.equals(this.f38918Oooo, o00000oo2.f38918Oooo);
    }

    public final int hashCode() {
        int i = this.f38919Oooo0o;
        return Arrays.hashCode(this.f38918Oooo) + (((((((i * 31) + i) * 31) + this.f38920Oooo0oO) * 31) + this.f38921Oooo0oo) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f38919Oooo0o + 1) * this.f38920Oooo0oO);
        for (int i = 0; i < this.f38920Oooo0oO; i++) {
            for (int i2 = 0; i2 < this.f38919Oooo0o; i2++) {
                sb.append(OooO0OO(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public o00000OO(int i, int i2, int i3, int[] iArr) {
        this.f38919Oooo0o = i;
        this.f38920Oooo0oO = i2;
        this.f38921Oooo0oo = i3;
        this.f38918Oooo = iArr;
    }
}
