package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52602OooO0o0 = o00000O.f52592OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52603OooO0Oo;

    public o0000Ooo() {
        this.f52603OooO0Oo = new int[8];
    }

    public o0000Ooo(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52602OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] iArrOooO0oo = p697oO0OOo0o.o0OoOo0.OooO0oo(bigInteger);
        if (iArrOooO0oo[7] == -1) {
            int[] iArr = o00000OO.f52594OooO00o;
            if (p697oO0OOo0o.o0OoOo0.OooOO0(iArrOooO0oo, iArr)) {
                p697oO0OOo0o.o0OoOo0.OooOo00(iArr, iArrOooO0oo);
            }
        }
        this.f52603OooO0Oo = iArrOooO0oo;
    }

    public o0000Ooo(int[] iArr) {
        this.f52603OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o0OoOo0.OooOOO0(this.f52603OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        o00000OO.OooO00o(this.f52603OooO0Oo, ((o0000Ooo) oooOOO0).f52603OooO0Oo, iArr);
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[8];
        if (p399o0Oo00oo.o00000OO.OooOO0o(8, this.f52603OooO0Oo, iArr) != 0 || (iArr[7] == -1 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr, o00000OO.f52594OooO00o))) {
            o00000OO.OooO0O0(iArr);
        }
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        p697oO0OOo0o.Oooo000.OooO0OO(o00000OO.f52594OooO00o, ((o0000Ooo) oooOOO0).f52603OooO0Oo, iArr);
        o00000OO.OooO0OO(iArr, this.f52603OooO0Oo, iArr);
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52602OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[8];
        p697oO0OOo0o.Oooo000.OooO0OO(o00000OO.f52594OooO00o, this.f52603OooO0Oo, iArr);
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.o0OoOo0.OooOO0O(this.f52603OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        o00000OO.OooO0OO(this.f52603OooO0Oo, ((o0000Ooo) oooOOO0).f52603OooO0Oo, iArr);
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52603OooO0Oo;
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr) || p697oO0OOo0o.o0OoOo0.OooOO0O(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        o00000OO.OooO0o(iArr, iArr2);
        o00000OO.OooO0OO(iArr2, iArr, iArr2);
        o00000OO.OooO0oO(iArr2, 2, iArr3);
        o00000OO.OooO0OO(iArr3, iArr2, iArr3);
        o00000OO.OooO0oO(iArr3, 4, iArr2);
        o00000OO.OooO0OO(iArr2, iArr3, iArr2);
        o00000OO.OooO0oO(iArr2, 8, iArr3);
        o00000OO.OooO0OO(iArr3, iArr2, iArr3);
        o00000OO.OooO0oO(iArr3, 16, iArr2);
        o00000OO.OooO0OO(iArr2, iArr3, iArr2);
        o00000OO.OooO0oO(iArr2, 32, iArr2);
        o00000OO.OooO0OO(iArr2, iArr, iArr2);
        o00000OO.OooO0oO(iArr2, 96, iArr2);
        o00000OO.OooO0OO(iArr2, iArr, iArr2);
        o00000OO.OooO0oO(iArr2, 94, iArr2);
        o00000OO.OooO0o(iArr2, iArr3);
        if (p697oO0OOo0o.o0OoOo0.OooO0o(iArr, iArr3)) {
            return new o0000Ooo(iArr2);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f52603OooO0Oo;
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr2)) {
            p697oO0OOo0o.o0OoOo0.OooOo0o(iArr);
        } else {
            p697oO0OOo0o.o0OoOo0.OooOOoo(o00000OO.f52594OooO00o, iArr2, iArr);
        }
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[8];
        o00000OO.OooO0o(this.f52603OooO0Oo, iArr);
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52603OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        o00000OO.OooO0oo(this.f52603OooO0Oo, ((o0000Ooo) oooOOO0).f52603OooO0Oo, iArr);
        return new o0000Ooo(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.o0OoOo0.OooOo0(this.f52603OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0000Ooo) {
            return p697oO0OOo0o.o0OoOo0.OooO0o(this.f52603OooO0Oo, ((o0000Ooo) obj).f52603OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52602OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52603OooO0Oo, 8);
    }
}
