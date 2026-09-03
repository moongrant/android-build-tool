package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52598OooO0o0 = o0000O00.f52600OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52599OooO0Oo;

    public o0000O0() {
        this.f52599OooO0Oo = new int[12];
    }

    public o0000O0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52598OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] iArrOooOO0 = p399o0Oo00oo.o00000OO.OooOO0(384, bigInteger);
        if (iArrOooOO0[11] == -1) {
            int[] iArr = o0000oo.f52604OooO00o;
            if (p399o0Oo00oo.o00000OO.OooOO0O(12, iArrOooOO0, iArr)) {
                p399o0Oo00oo.o00000OO.OooOo(12, iArr, iArrOooOO0);
            }
        }
        this.f52599OooO0Oo = iArrOooOO0;
    }

    public o0000O0(int[] iArr) {
        this.f52599OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p399o0Oo00oo.o00000OO.OooOOo0(12, this.f52599OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[12];
        o0000oo.OooO00o(this.f52599OooO0Oo, ((o0000O0) oooOOO0).f52599OooO0Oo, iArr);
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[12];
        if (p399o0Oo00oo.o00000OO.OooOO0o(12, this.f52599OooO0Oo, iArr) != 0 || (iArr[11] == -1 && p399o0Oo00oo.o00000OO.OooOO0O(12, iArr, o0000oo.f52604OooO00o))) {
            o0000oo.OooO0O0(iArr);
        }
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[12];
        p697oO0OOo0o.Oooo000.OooO0OO(o0000oo.f52604OooO00o, ((o0000O0) oooOOO0).f52599OooO0Oo, iArr);
        o0000oo.OooO0OO(iArr, this.f52599OooO0Oo, iArr);
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52598OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[12];
        p697oO0OOo0o.Oooo000.OooO0OO(o0000oo.f52604OooO00o, this.f52599OooO0Oo, iArr);
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p399o0Oo00oo.o00000OO.OooOOOo(12, this.f52599OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[12];
        o0000oo.OooO0OO(this.f52599OooO0Oo, ((o0000O0) oooOOO0).f52599OooO0Oo, iArr);
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52599OooO0Oo;
        if (p399o0Oo00oo.o00000OO.OooOOo0(12, iArr) || p399o0Oo00oo.o00000OO.OooOOOo(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        o0000oo.OooO0o(iArr, iArr2);
        o0000oo.OooO0OO(iArr2, iArr, iArr2);
        o0000oo.OooO0oO(iArr2, 2, iArr3);
        o0000oo.OooO0OO(iArr3, iArr2, iArr3);
        o0000oo.OooO0o(iArr3, iArr3);
        o0000oo.OooO0OO(iArr3, iArr, iArr3);
        o0000oo.OooO0oO(iArr3, 5, iArr4);
        o0000oo.OooO0OO(iArr4, iArr3, iArr4);
        o0000oo.OooO0oO(iArr4, 5, iArr5);
        o0000oo.OooO0OO(iArr5, iArr3, iArr5);
        o0000oo.OooO0oO(iArr5, 15, iArr3);
        o0000oo.OooO0OO(iArr3, iArr5, iArr3);
        o0000oo.OooO0oO(iArr3, 2, iArr4);
        o0000oo.OooO0OO(iArr2, iArr4, iArr2);
        o0000oo.OooO0oO(iArr4, 28, iArr4);
        o0000oo.OooO0OO(iArr3, iArr4, iArr3);
        o0000oo.OooO0oO(iArr3, 60, iArr4);
        o0000oo.OooO0OO(iArr4, iArr3, iArr4);
        o0000oo.OooO0oO(iArr4, 120, iArr3);
        o0000oo.OooO0OO(iArr3, iArr4, iArr3);
        o0000oo.OooO0oO(iArr3, 15, iArr3);
        o0000oo.OooO0OO(iArr3, iArr5, iArr3);
        o0000oo.OooO0oO(iArr3, 33, iArr3);
        o0000oo.OooO0OO(iArr3, iArr2, iArr3);
        o0000oo.OooO0oO(iArr3, 64, iArr3);
        o0000oo.OooO0OO(iArr3, iArr, iArr3);
        o0000oo.OooO0oO(iArr3, 30, iArr2);
        o0000oo.OooO0o(iArr2, iArr3);
        if (p399o0Oo00oo.o00000OO.OooO(12, iArr, iArr3)) {
            return new o0000O0(iArr2);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[12];
        int[] iArr2 = this.f52599OooO0Oo;
        if (p399o0Oo00oo.o00000OO.OooOOo0(12, iArr2)) {
            p399o0Oo00oo.o00000OO.OooOoOO(12, iArr);
        } else {
            p399o0Oo00oo.o00000OO.OooOo0O(12, o0000oo.f52604OooO00o, iArr2, iArr);
        }
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[12];
        o0000oo.OooO0o(this.f52599OooO0Oo, iArr);
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52599OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[12];
        o0000oo.OooO0oo(this.f52599OooO0Oo, ((o0000O0) oooOOO0).f52599OooO0Oo, iArr);
        return new o0000O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p399o0Oo00oo.o00000OO.OooOoO(12, this.f52599OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0000O0) {
            return p399o0Oo00oo.o00000OO.OooO(12, this.f52599OooO0Oo, ((o0000O0) obj).f52599OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52598OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52599OooO0Oo, 12);
    }
}
