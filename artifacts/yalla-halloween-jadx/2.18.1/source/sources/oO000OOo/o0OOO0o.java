package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52652OooO0o0 = o00oO0o.f52644OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f52651OooO0o = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public o0OOO0o() {
        this.f52653OooO0Oo = new int[7];
    }

    public o0OOO0o(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52652OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] iArrOooO0o0 = p697oO0OOo0o.o000oOoO.OooO0o0(bigInteger);
        if (iArrOooO0o0[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArrOooO0o0, o0ooOOo.f52654OooO00o)) {
            p399o0Oo00oo.o00000OO.OooO0O0(7, 6803, iArrOooO0o0);
        }
        this.f52653OooO0Oo = iArrOooO0o0;
    }

    public o0OOO0o(int[] iArr) {
        this.f52653OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o000oOoO.OooO0oo(this.f52653OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        if (p697oO0OOo0o.o000oOoO.OooO00o(this.f52653OooO0Oo, ((o0OOO0o) oooOOO0).f52653OooO0Oo, iArr) != 0 || (iArr[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr, o0ooOOo.f52654OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(7, 6803, iArr);
        }
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[7];
        if (p399o0Oo00oo.o00000OO.OooOO0o(7, this.f52653OooO0Oo, iArr) != 0 || (iArr[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr, o0ooOOo.f52654OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(7, 6803, iArr);
        }
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        p697oO0OOo0o.Oooo000.OooO0OO(o0ooOOo.f52654OooO00o, ((o0OOO0o) oooOOO0).f52653OooO0Oo, iArr);
        o0ooOOo.OooO00o(iArr, this.f52653OooO0Oo, iArr);
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52652OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[7];
        p697oO0OOo0o.Oooo000.OooO0OO(o0ooOOo.f52654OooO00o, this.f52653OooO0Oo, iArr);
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.o000oOoO.OooO0oO(this.f52653OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        o0ooOOo.OooO00o(this.f52653OooO0Oo, ((o0OOO0o) oooOOO0).f52653OooO0Oo, iArr);
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52653OooO0Oo;
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr) || p697oO0OOo0o.o000oOoO.OooO0oO(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        o0ooOOo.OooO0Oo(iArr, iArr2);
        o0ooOOo.OooO00o(iArr2, iArr, iArr2);
        o0ooOOo.OooO0Oo(iArr2, iArr2);
        o0ooOOo.OooO00o(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        o0ooOOo.OooO0Oo(iArr2, iArr3);
        o0ooOOo.OooO00o(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        o0ooOOo.OooO0o0(iArr3, 4, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        o0ooOOo.OooO0o0(iArr4, 3, iArr5);
        o0ooOOo.OooO00o(iArr5, iArr2, iArr5);
        o0ooOOo.OooO0o0(iArr5, 8, iArr5);
        o0ooOOo.OooO00o(iArr5, iArr4, iArr5);
        o0ooOOo.OooO0o0(iArr5, 4, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr3, iArr4);
        o0ooOOo.OooO0o0(iArr4, 19, iArr3);
        o0ooOOo.OooO00o(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        o0ooOOo.OooO0o0(iArr3, 42, iArr6);
        o0ooOOo.OooO00o(iArr6, iArr3, iArr6);
        o0ooOOo.OooO0o0(iArr6, 23, iArr3);
        o0ooOOo.OooO00o(iArr3, iArr4, iArr3);
        o0ooOOo.OooO0o0(iArr3, 84, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr6, iArr4);
        o0ooOOo.OooO0o0(iArr4, 20, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr5, iArr4);
        o0ooOOo.OooO0o0(iArr4, 3, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr, iArr4);
        o0ooOOo.OooO0o0(iArr4, 2, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr, iArr4);
        o0ooOOo.OooO0o0(iArr4, 4, iArr4);
        o0ooOOo.OooO00o(iArr4, iArr2, iArr4);
        o0ooOOo.OooO0Oo(iArr4, iArr4);
        o0ooOOo.OooO0Oo(iArr4, iArr6);
        if (p697oO0OOo0o.o000oOoO.OooO0Oo(iArr, iArr6)) {
            return new o0OOO0o(iArr4);
        }
        o0ooOOo.OooO00o(iArr4, f52651OooO0o, iArr4);
        o0ooOOo.OooO0Oo(iArr4, iArr6);
        if (p697oO0OOo0o.o000oOoO.OooO0Oo(iArr, iArr6)) {
            return new o0OOO0o(iArr4);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[7];
        int[] iArr2 = this.f52653OooO0Oo;
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr2)) {
            p697oO0OOo0o.o000oOoO.OooOOO(iArr);
        } else {
            p697oO0OOo0o.o000oOoO.OooOO0o(o0ooOOo.f52654OooO00o, iArr2, iArr);
        }
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[7];
        o0ooOOo.OooO0Oo(this.f52653OooO0Oo, iArr);
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52653OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        o0ooOOo.OooO0o(this.f52653OooO0Oo, ((o0OOO0o) oooOOO0).f52653OooO0Oo, iArr);
        return new o0OOO0o(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.o000oOoO.OooOOO0(this.f52653OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0OOO0o) {
            return p697oO0OOo0o.o000oOoO.OooO0Oo(this.f52653OooO0Oo, ((o0OOO0o) obj).f52653OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52652OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52653OooO0Oo, 7);
    }
}
