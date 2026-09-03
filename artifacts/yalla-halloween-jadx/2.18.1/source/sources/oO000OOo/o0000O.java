package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52596OooO0o0 = o000OO.f52611OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52597OooO0Oo;

    public o0000O() {
        this.f52597OooO0Oo = new int[17];
    }

    public o0000O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52596OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] iArrOooOO0 = p399o0Oo00oo.o00000OO.OooOO0(521, bigInteger);
        if (p399o0Oo00oo.o00000OO.OooO(17, iArrOooOO0, p231o00oOo0o.oo000o.f33942Oooo0o)) {
            p399o0Oo00oo.o00000OO.OooOoOO(17, iArrOooOO0);
        }
        this.f52597OooO0Oo = iArrOooOO0;
    }

    public o0000O(int[] iArr) {
        this.f52597OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p399o0Oo00oo.o00000OO.OooOOo0(17, this.f52597OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[17];
        p231o00oOo0o.oo000o.OooO0O0(this.f52597OooO0Oo, ((o0000O) oooOOO0).f52597OooO0Oo, iArr);
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f52597OooO0Oo;
        int iOooOO0o = p399o0Oo00oo.o00000OO.OooOO0o(16, iArr2, iArr) + iArr2[16];
        if (iOooOO0o > 511 || (iOooOO0o == 511 && p399o0Oo00oo.o00000OO.OooO(16, iArr, p231o00oOo0o.oo000o.f33942Oooo0o))) {
            iOooOO0o = (p399o0Oo00oo.o00000OO.OooOOO0(iArr) + iOooOO0o) & 511;
        }
        iArr[16] = iOooOO0o;
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[17];
        p697oO0OOo0o.Oooo000.OooO0OO(p231o00oOo0o.oo000o.f33942Oooo0o, ((o0000O) oooOOO0).f52597OooO0Oo, iArr);
        p231o00oOo0o.oo000o.OooO0Oo(iArr, this.f52597OooO0Oo, iArr);
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52596OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[17];
        p697oO0OOo0o.Oooo000.OooO0OO(p231o00oOo0o.oo000o.f33942Oooo0o, this.f52597OooO0Oo, iArr);
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p399o0Oo00oo.o00000OO.OooOOOo(17, this.f52597OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[17];
        p231o00oOo0o.oo000o.OooO0Oo(this.f52597OooO0Oo, ((o0000O) oooOOO0).f52597OooO0Oo, iArr);
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52597OooO0Oo;
        if (p399o0Oo00oo.o00000OO.OooOOo0(17, iArr) || p399o0Oo00oo.o00000OO.OooOOOo(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int i = 519;
        int[] iArr4 = new int[33];
        p231o00oOo0o.oo000o.OooO0OO(iArr, iArr4);
        while (true) {
            p231o00oOo0o.oo000o.OooO0o0(iArr4, iArr2);
            i--;
            if (i <= 0) {
                break;
            }
            p231o00oOo0o.oo000o.OooO0OO(iArr2, iArr4);
        }
        p231o00oOo0o.oo000o.OooO0oO(iArr2, iArr3);
        if (p399o0Oo00oo.o00000OO.OooO(17, iArr, iArr3)) {
            return new o0000O(iArr2);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f52597OooO0Oo;
        if (p399o0Oo00oo.o00000OO.OooOOo0(17, iArr2)) {
            p399o0Oo00oo.o00000OO.OooOoOO(17, iArr);
        } else {
            p399o0Oo00oo.o00000OO.OooOo0O(17, p231o00oOo0o.oo000o.f33942Oooo0o, iArr2, iArr);
        }
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[17];
        p231o00oOo0o.oo000o.OooO0oO(this.f52597OooO0Oo, iArr);
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52597OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[17];
        p231o00oOo0o.oo000o.OooO0oo(this.f52597OooO0Oo, ((o0000O) oooOOO0).f52597OooO0Oo, iArr);
        return new o0000O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p399o0Oo00oo.o00000OO.OooOoO(17, this.f52597OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0000O) {
            return p399o0Oo00oo.o00000OO.OooO(17, this.f52597OooO0Oo, ((o0000O) obj).f52597OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52596OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52597OooO0Oo, 17);
    }
}
