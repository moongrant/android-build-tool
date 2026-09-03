package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52577OooO0o0 = OooOOO.f52572OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52578OooO0Oo;

    public OooOo00() {
        this.f52578OooO0Oo = new int[5];
    }

    public OooOo00(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52577OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] iArrOooO0Oo = p697oO0OOo0o.Oooo0.OooO0Oo(bigInteger);
        if (iArrOooO0Oo[4] == -1) {
            int[] iArr = OooOOOO.f52574OooO00o;
            if (p697oO0OOo0o.Oooo0.OooO0o0(iArrOooO0Oo, iArr)) {
                p697oO0OOo0o.Oooo0.OooOO0o(iArr, iArrOooO0Oo);
            }
        }
        this.f52578OooO0Oo = iArrOooO0Oo;
    }

    public OooOo00(int[] iArr) {
        this.f52578OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.Oooo0.OooO0oO(this.f52578OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        OooOOOO.OooO00o(this.f52578OooO0Oo, ((OooOo00) oooOOO0).f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[5];
        if (p399o0Oo00oo.o00000OO.OooOO0o(5, this.f52578OooO0Oo, iArr) != 0 || (iArr[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr, OooOOOO.f52574OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(5, 21389, iArr);
        }
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        p697oO0OOo0o.Oooo000.OooO0OO(OooOOOO.f52574OooO00o, ((OooOo00) oooOOO0).f52578OooO0Oo, iArr);
        OooOOOO.OooO0O0(iArr, this.f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52577OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[5];
        p697oO0OOo0o.Oooo000.OooO0OO(OooOOOO.f52574OooO00o, this.f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.Oooo0.OooO0o(this.f52578OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        OooOOOO.OooO0O0(this.f52578OooO0Oo, ((OooOo00) oooOOO0).f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52578OooO0Oo;
        if (p697oO0OOo0o.Oooo0.OooO0oO(iArr) || p697oO0OOo0o.Oooo0.OooO0o(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        OooOOOO.OooO0oO(iArr, iArr2);
        OooOOOO.OooO0O0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        OooOOOO.OooO0oO(iArr2, iArr3);
        OooOOOO.OooO0O0(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        OooOOOO.OooO0oO(iArr3, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        OooOOOO.OooO0oo(iArr4, 3, iArr5);
        OooOOOO.OooO0O0(iArr5, iArr3, iArr5);
        OooOOOO.OooO0oo(iArr5, 7, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr5, iArr4);
        OooOOOO.OooO0oo(iArr4, 3, iArr5);
        OooOOOO.OooO0O0(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        OooOOOO.OooO0oo(iArr5, 14, iArr6);
        OooOOOO.OooO0O0(iArr6, iArr4, iArr6);
        OooOOOO.OooO0oo(iArr6, 31, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr6, iArr4);
        OooOOOO.OooO0oo(iArr4, 62, iArr6);
        OooOOOO.OooO0O0(iArr6, iArr4, iArr6);
        OooOOOO.OooO0oo(iArr6, 3, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr3, iArr4);
        OooOOOO.OooO0oo(iArr4, 18, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr5, iArr4);
        OooOOOO.OooO0oo(iArr4, 2, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr, iArr4);
        OooOOOO.OooO0oo(iArr4, 3, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr2, iArr4);
        OooOOOO.OooO0oo(iArr4, 6, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr3, iArr4);
        OooOOOO.OooO0oo(iArr4, 2, iArr4);
        OooOOOO.OooO0O0(iArr4, iArr, iArr4);
        OooOOOO.OooO0oO(iArr4, iArr2);
        if (p697oO0OOo0o.Oooo0.OooO0OO(iArr, iArr2)) {
            return new OooOo00(iArr4);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[5];
        OooOOOO.OooO0Oo(this.f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[5];
        OooOOOO.OooO0oO(this.f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52578OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        OooOOOO.OooO(this.f52578OooO0Oo, ((OooOo00) oooOOO0).f52578OooO0Oo, iArr);
        return new OooOo00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.Oooo0.OooOOO0(this.f52578OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOo00) {
            return p697oO0OOo0o.Oooo0.OooO0OO(this.f52578OooO0Oo, ((OooOo00) obj).f52578OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52577OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52578OooO0Oo, 5);
    }
}
