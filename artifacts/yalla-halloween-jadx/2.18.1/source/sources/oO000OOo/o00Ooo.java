package oO000OOo;

import java.math.BigInteger;
import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52642OooO0o0 = o00O0O.f52624OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52643OooO0Oo;

    public o00Ooo() {
        this.f52643OooO0Oo = new int[6];
    }

    public o00Ooo(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52642OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] iArrOooOO0 = oO00O0o0.OooOO0(bigInteger);
        if (iArrOooOO0[5] == -1) {
            int[] iArr = o00Oo0.f52639OooO00o;
            if (oO00O0o0.OooOOO(iArrOooOO0, iArr)) {
                oO00O0o0.OooOoO0(iArr, iArrOooOO0);
            }
        }
        this.f52643OooO0Oo = iArrOooOO0;
    }

    public o00Ooo(int[] iArr) {
        this.f52643OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return oO00O0o0.OooOOo0(this.f52643OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        o00Oo0.OooO00o(this.f52643OooO0Oo, ((o00Ooo) oooOOO0).f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[6];
        if (p399o0Oo00oo.o00000OO.OooOO0o(6, this.f52643OooO0Oo, iArr) != 0 || (iArr[5] == -1 && oO00O0o0.OooOOO(iArr, o00Oo0.f52639OooO00o))) {
            o00Oo0.OooO0O0(iArr);
        }
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        p697oO0OOo0o.Oooo000.OooO0OO(o00Oo0.f52639OooO00o, ((o00Ooo) oooOOO0).f52643OooO0Oo, iArr);
        o00Oo0.OooO0OO(iArr, this.f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52642OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[6];
        p697oO0OOo0o.Oooo000.OooO0OO(o00Oo0.f52639OooO00o, this.f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return oO00O0o0.OooOOOO(this.f52643OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        o00Oo0.OooO0OO(this.f52643OooO0Oo, ((o00Ooo) oooOOO0).f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52643OooO0Oo;
        if (oO00O0o0.OooOOo0(iArr) || oO00O0o0.OooOOOO(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        o00Oo0.OooO0oO(iArr, iArr2);
        o00Oo0.OooO0OO(iArr2, iArr, iArr2);
        o00Oo0.OooO0oo(iArr2, 2, iArr3);
        o00Oo0.OooO0OO(iArr3, iArr2, iArr3);
        o00Oo0.OooO0oo(iArr3, 4, iArr2);
        o00Oo0.OooO0OO(iArr2, iArr3, iArr2);
        o00Oo0.OooO0oo(iArr2, 8, iArr3);
        o00Oo0.OooO0OO(iArr3, iArr2, iArr3);
        o00Oo0.OooO0oo(iArr3, 16, iArr2);
        o00Oo0.OooO0OO(iArr2, iArr3, iArr2);
        o00Oo0.OooO0oo(iArr2, 32, iArr3);
        o00Oo0.OooO0OO(iArr3, iArr2, iArr3);
        o00Oo0.OooO0oo(iArr3, 64, iArr2);
        o00Oo0.OooO0OO(iArr2, iArr3, iArr2);
        o00Oo0.OooO0oo(iArr2, 62, iArr2);
        o00Oo0.OooO0oO(iArr2, iArr3);
        if (oO00O0o0.OooO(iArr, iArr3)) {
            return new o00Ooo(iArr2);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[6];
        o00Oo0.OooO0Oo(this.f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[6];
        o00Oo0.OooO0oO(this.f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52643OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[6];
        o00Oo0.OooO(this.f52643OooO0Oo, ((o00Ooo) oooOOO0).f52643OooO0Oo, iArr);
        return new o00Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return oO00O0o0.OooOoO(this.f52643OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00Ooo) {
            return oO00O0o0.OooO(this.f52643OooO0Oo, ((o00Ooo) obj).f52643OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52642OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52643OooO0Oo, 6);
    }
}
