package oO000OOo;

import java.math.BigInteger;
import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52617OooO0o0 = Oooo000.f52582OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52618OooO0Oo;

    public o000oOoO() {
        this.f52618OooO0Oo = new int[6];
    }

    public o000oOoO(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52617OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] iArrOooOO0 = oO00O0o0.OooOO0(bigInteger);
        if (iArrOooOO0[5] == -1) {
            int[] iArr = Oooo0.f52579OooO00o;
            if (oO00O0o0.OooOOO(iArrOooOO0, iArr)) {
                oO00O0o0.OooOoO0(iArr, iArrOooOO0);
            }
        }
        this.f52618OooO0Oo = iArrOooOO0;
    }

    public o000oOoO(int[] iArr) {
        this.f52618OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return oO00O0o0.OooOOo0(this.f52618OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        if (oO00O0o0.OooO00o(this.f52618OooO0Oo, ((o000oOoO) oooOOO0).f52618OooO0Oo, iArr) != 0 || (iArr[5] == -1 && oO00O0o0.OooOOO(iArr, Oooo0.f52579OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(6, 4553, iArr);
        }
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[6];
        if (p399o0Oo00oo.o00000OO.OooOO0o(6, this.f52618OooO0Oo, iArr) != 0 || (iArr[5] == -1 && oO00O0o0.OooOOO(iArr, Oooo0.f52579OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(6, 4553, iArr);
        }
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        p697oO0OOo0o.Oooo000.OooO0OO(Oooo0.f52579OooO00o, ((o000oOoO) oooOOO0).f52618OooO0Oo, iArr);
        Oooo0.OooO00o(iArr, this.f52618OooO0Oo, iArr);
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52617OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[6];
        p697oO0OOo0o.Oooo000.OooO0OO(Oooo0.f52579OooO00o, this.f52618OooO0Oo, iArr);
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return oO00O0o0.OooOOOO(this.f52618OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        Oooo0.OooO00o(this.f52618OooO0Oo, ((o000oOoO) oooOOO0).f52618OooO0Oo, iArr);
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52618OooO0Oo;
        if (oO00O0o0.OooOOo0(iArr) || oO00O0o0.OooOOOO(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        Oooo0.OooO0o0(iArr, iArr2);
        Oooo0.OooO00o(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        Oooo0.OooO0o0(iArr2, iArr3);
        Oooo0.OooO00o(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        Oooo0.OooO0o(iArr3, 3, iArr4);
        Oooo0.OooO00o(iArr4, iArr3, iArr4);
        Oooo0.OooO0o(iArr4, 2, iArr4);
        Oooo0.OooO00o(iArr4, iArr2, iArr4);
        Oooo0.OooO0o(iArr4, 8, iArr2);
        Oooo0.OooO00o(iArr2, iArr4, iArr2);
        Oooo0.OooO0o(iArr2, 3, iArr4);
        Oooo0.OooO00o(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        Oooo0.OooO0o(iArr4, 16, iArr5);
        Oooo0.OooO00o(iArr5, iArr2, iArr5);
        Oooo0.OooO0o(iArr5, 35, iArr2);
        Oooo0.OooO00o(iArr2, iArr5, iArr2);
        Oooo0.OooO0o(iArr2, 70, iArr5);
        Oooo0.OooO00o(iArr5, iArr2, iArr5);
        Oooo0.OooO0o(iArr5, 19, iArr2);
        Oooo0.OooO00o(iArr2, iArr4, iArr2);
        Oooo0.OooO0o(iArr2, 20, iArr2);
        Oooo0.OooO00o(iArr2, iArr4, iArr2);
        Oooo0.OooO0o(iArr2, 4, iArr2);
        Oooo0.OooO00o(iArr2, iArr3, iArr2);
        Oooo0.OooO0o(iArr2, 6, iArr2);
        Oooo0.OooO00o(iArr2, iArr3, iArr2);
        Oooo0.OooO0o0(iArr2, iArr2);
        Oooo0.OooO0o0(iArr2, iArr3);
        if (oO00O0o0.OooO(iArr, iArr3)) {
            return new o000oOoO(iArr2);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[6];
        Oooo0.OooO0O0(this.f52618OooO0Oo, iArr);
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[6];
        Oooo0.OooO0o0(this.f52618OooO0Oo, iArr);
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52618OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        Oooo0.OooO0oO(this.f52618OooO0Oo, ((o000oOoO) oooOOO0).f52618OooO0Oo, iArr);
        return new o000oOoO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return oO00O0o0.OooOoO(this.f52618OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000oOoO) {
            return oO00O0o0.OooO(this.f52618OooO0Oo, ((o000oOoO) obj).f52618OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52617OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52618OooO0Oo, 6);
    }
}
