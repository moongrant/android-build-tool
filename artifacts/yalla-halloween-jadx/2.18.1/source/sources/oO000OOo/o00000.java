package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52585OooO0o0 = o000000.f52587OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52586OooO0Oo;

    public o00000() {
        this.f52586OooO0Oo = new int[8];
    }

    public o00000(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52585OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] iArrOooO0oo = p697oO0OOo0o.o0OoOo0.OooO0oo(bigInteger);
        if (iArrOooO0oo[7] == -1) {
            int[] iArr = o000000O.f52589OooO00o;
            if (p697oO0OOo0o.o0OoOo0.OooOO0(iArrOooO0oo, iArr)) {
                p697oO0OOo0o.o0OoOo0.OooOo00(iArr, iArrOooO0oo);
            }
        }
        this.f52586OooO0Oo = iArrOooO0oo;
    }

    public o00000(int[] iArr) {
        this.f52586OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o0OoOo0.OooOOO0(this.f52586OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        if (p697oO0OOo0o.o0OoOo0.OooO00o(this.f52586OooO0Oo, ((o00000) oooOOO0).f52586OooO0Oo, iArr) != 0 || (iArr[7] == -1 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr, o000000O.f52589OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(8, 977, iArr);
        }
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[8];
        if (p399o0Oo00oo.o00000OO.OooOO0o(8, this.f52586OooO0Oo, iArr) != 0 || (iArr[7] == -1 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr, o000000O.f52589OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(8, 977, iArr);
        }
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        p697oO0OOo0o.Oooo000.OooO0OO(o000000O.f52589OooO00o, ((o00000) oooOOO0).f52586OooO0Oo, iArr);
        o000000O.OooO00o(iArr, this.f52586OooO0Oo, iArr);
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52585OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[8];
        p697oO0OOo0o.Oooo000.OooO0OO(o000000O.f52589OooO00o, this.f52586OooO0Oo, iArr);
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.o0OoOo0.OooOO0O(this.f52586OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        o000000O.OooO00o(this.f52586OooO0Oo, ((o00000) oooOOO0).f52586OooO0Oo, iArr);
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52586OooO0Oo;
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr) || p697oO0OOo0o.o0OoOo0.OooOO0O(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        o000000O.OooO0Oo(iArr, iArr2);
        o000000O.OooO00o(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        o000000O.OooO0Oo(iArr2, iArr3);
        o000000O.OooO00o(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        o000000O.OooO0o0(iArr3, 3, iArr4);
        o000000O.OooO00o(iArr4, iArr3, iArr4);
        o000000O.OooO0o0(iArr4, 3, iArr4);
        o000000O.OooO00o(iArr4, iArr3, iArr4);
        o000000O.OooO0o0(iArr4, 2, iArr4);
        o000000O.OooO00o(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        o000000O.OooO0o0(iArr4, 11, iArr5);
        o000000O.OooO00o(iArr5, iArr4, iArr5);
        o000000O.OooO0o0(iArr5, 22, iArr4);
        o000000O.OooO00o(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        o000000O.OooO0o0(iArr4, 44, iArr6);
        o000000O.OooO00o(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        o000000O.OooO0o0(iArr6, 88, iArr7);
        o000000O.OooO00o(iArr7, iArr6, iArr7);
        o000000O.OooO0o0(iArr7, 44, iArr6);
        o000000O.OooO00o(iArr6, iArr4, iArr6);
        o000000O.OooO0o0(iArr6, 3, iArr4);
        o000000O.OooO00o(iArr4, iArr3, iArr4);
        o000000O.OooO0o0(iArr4, 23, iArr4);
        o000000O.OooO00o(iArr4, iArr5, iArr4);
        o000000O.OooO0o0(iArr4, 6, iArr4);
        o000000O.OooO00o(iArr4, iArr2, iArr4);
        o000000O.OooO0o0(iArr4, 2, iArr4);
        o000000O.OooO0Oo(iArr4, iArr2);
        if (p697oO0OOo0o.o0OoOo0.OooO0o(iArr, iArr2)) {
            return new o00000(iArr4);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f52586OooO0Oo;
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr2)) {
            p697oO0OOo0o.o0OoOo0.OooOo0o(iArr);
        } else {
            p697oO0OOo0o.o0OoOo0.OooOOoo(o000000O.f52589OooO00o, iArr2, iArr);
        }
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[8];
        o000000O.OooO0Oo(this.f52586OooO0Oo, iArr);
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52586OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        o000000O.OooO0o(this.f52586OooO0Oo, ((o00000) oooOOO0).f52586OooO0Oo, iArr);
        return new o00000(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.o0OoOo0.OooOo0(this.f52586OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00000) {
            return p697oO0OOo0o.o0OoOo0.OooO0o(this.f52586OooO0Oo, ((o00000) obj).f52586OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52585OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52586OooO0Oo, 8);
    }
}
