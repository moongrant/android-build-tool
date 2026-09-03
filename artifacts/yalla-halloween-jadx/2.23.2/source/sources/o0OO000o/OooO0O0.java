package o0OO000o;

import java.util.Arrays;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements Cloneable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f42263OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f42264OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f42265OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f42266OooO0oO;

    public OooO0O0(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f42263OooO0Oo = i;
        this.f42265OooO0o0 = i2;
        int i3 = (i + 31) / 32;
        this.f42264OooO0o = i3;
        this.f42266OooO0oO = new int[i3 * i2];
    }

    public final boolean OooO0O0(int i, int i2) {
        return ((this.f42266OooO0oO[(i / 32) + (i2 * this.f42264OooO0o)] >>> (i & 31)) & 1) != 0;
    }

    public final void OooO0Oo(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f42264OooO0o);
        int[] iArr = this.f42266OooO0oO;
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
        if (i6 > this.f42265OooO0o0 || i5 > this.f42263OooO0Oo) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f42264OooO0o * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int i9 = (i8 / 32) + i7;
                int[] iArr = this.f42266OooO0oO;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        int[] iArr = (int[]) this.f42266OooO0oO.clone();
        return new OooO0O0(this.f42263OooO0Oo, this.f42265OooO0o0, iArr, this.f42264OooO0o);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return this.f42263OooO0Oo == oooO0O0.f42263OooO0Oo && this.f42265OooO0o0 == oooO0O0.f42265OooO0o0 && this.f42264OooO0o == oooO0O0.f42264OooO0o && Arrays.equals(this.f42266OooO0oO, oooO0O0.f42266OooO0oO);
    }

    public final int hashCode() {
        int i = this.f42263OooO0Oo;
        return Arrays.hashCode(this.f42266OooO0oO) + ((((o00Ooo.OooO00o(i, 31, i, 31) + this.f42265OooO0o0) * 31) + this.f42264OooO0o) * 31);
    }

    public final String toString() {
        int i = this.f42263OooO0Oo;
        int i2 = this.f42265OooO0o0;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sb.append(OooO0O0(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public OooO0O0(int i, int i2, int[] iArr, int i3) {
        this.f42263OooO0Oo = i;
        this.f42265OooO0o0 = i2;
        this.f42264OooO0o = i3;
        this.f42266OooO0oO = iArr;
    }
}
