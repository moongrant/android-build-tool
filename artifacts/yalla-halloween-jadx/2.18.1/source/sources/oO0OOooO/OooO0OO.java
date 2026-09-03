package oO0OOooO;

import java.math.BigInteger;
import p399o0Oo00oo.o00000OO;
import p696oO0OO0oo.OooOOO0;
import p697oO0OOo0o.Oooo000;
import p697oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52861OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52860OooO0o0 = OooO00o.f52855OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f52859OooO0o = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public OooO0OO() {
        this.f52861OooO0Oo = new int[8];
    }

    public OooO0OO(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52860OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] iArrOooO0oo = o0OoOo0.OooO0oo(bigInteger);
        while (true) {
            int[] iArr = OooO0O0.f52857OooO00o;
            if (!o0OoOo0.OooOO0(iArrOooO0oo, iArr)) {
                this.f52861OooO0Oo = iArrOooO0oo;
                return;
            }
            o0OoOo0.OooOo00(iArr, iArrOooO0oo);
        }
    }

    public OooO0OO(int[] iArr) {
        this.f52861OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return o0OoOo0.OooOOO0(this.f52861OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooO00o(OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        o0OoOo0.OooO00o(this.f52861OooO0Oo, ((OooO0OO) oooOOO0).f52861OooO0Oo, iArr);
        if (o0OoOo0.OooOO0(iArr, OooO0O0.f52857OooO00o)) {
            OooO0O0.OooO0o(iArr);
        }
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooO0O0() {
        int[] iArr = new int[8];
        o00000OO.OooOO0o(8, this.f52861OooO0Oo, iArr);
        if (o0OoOo0.OooOO0(iArr, OooO0O0.f52857OooO00o)) {
            OooO0O0.OooO0o(iArr);
        }
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooO0Oo(OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        Oooo000.OooO0OO(OooO0O0.f52857OooO00o, ((OooO0OO) oooOOO0).f52861OooO0Oo, iArr);
        OooO0O0.OooO00o(iArr, this.f52861OooO0Oo, iArr);
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52860OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooO0oO() {
        int[] iArr = new int[8];
        Oooo000.OooO0OO(OooO0O0.f52857OooO00o, this.f52861OooO0Oo, iArr);
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return o0OoOo0.OooOO0O(this.f52861OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooOO0(OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        OooO0O0.OooO00o(this.f52861OooO0Oo, ((OooO0OO) oooOOO0).f52861OooO0Oo, iArr);
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooOOO() {
        int[] iArr = this.f52861OooO0Oo;
        if (o0OoOo0.OooOOO0(iArr) || o0OoOo0.OooOO0O(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        OooO0O0.OooO0Oo(iArr, iArr2);
        OooO0O0.OooO00o(iArr2, iArr, iArr2);
        OooO0O0.OooO0Oo(iArr2, iArr2);
        OooO0O0.OooO00o(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        OooO0O0.OooO0Oo(iArr2, iArr3);
        OooO0O0.OooO00o(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        OooO0O0.OooO0o0(iArr3, 3, iArr4);
        OooO0O0.OooO00o(iArr4, iArr2, iArr4);
        OooO0O0.OooO0o0(iArr4, 4, iArr2);
        OooO0O0.OooO00o(iArr2, iArr3, iArr2);
        OooO0O0.OooO0o0(iArr2, 4, iArr4);
        OooO0O0.OooO00o(iArr4, iArr3, iArr4);
        OooO0O0.OooO0o0(iArr4, 15, iArr3);
        OooO0O0.OooO00o(iArr3, iArr4, iArr3);
        OooO0O0.OooO0o0(iArr3, 30, iArr4);
        OooO0O0.OooO00o(iArr4, iArr3, iArr4);
        OooO0O0.OooO0o0(iArr4, 60, iArr3);
        OooO0O0.OooO00o(iArr3, iArr4, iArr3);
        OooO0O0.OooO0o0(iArr3, 11, iArr4);
        OooO0O0.OooO00o(iArr4, iArr2, iArr4);
        OooO0O0.OooO0o0(iArr4, 120, iArr2);
        OooO0O0.OooO00o(iArr2, iArr3, iArr2);
        OooO0O0.OooO0Oo(iArr2, iArr2);
        OooO0O0.OooO0Oo(iArr2, iArr3);
        if (o0OoOo0.OooO0o(iArr, iArr3)) {
            return new OooO0OO(iArr2);
        }
        OooO0O0.OooO00o(iArr2, f52859OooO0o, iArr2);
        OooO0O0.OooO0Oo(iArr2, iArr3);
        if (o0OoOo0.OooO0o(iArr, iArr3)) {
            return new OooO0OO(iArr2);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooOOO0() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f52861OooO0Oo;
        if (o0OoOo0.OooOOO0(iArr2)) {
            o0OoOo0.OooOo0o(iArr);
        } else {
            o0OoOo0.OooOOoo(OooO0O0.f52857OooO00o, iArr2, iArr);
        }
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooOOOO() {
        int[] iArr = new int[8];
        OooO0O0.OooO0Oo(this.f52861OooO0Oo, iArr);
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52861OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final OooOOO0 OooOOo0(OooOOO0 oooOOO0) {
        int[] iArr = new int[8];
        OooO0O0.OooO0oO(this.f52861OooO0Oo, ((OooO0OO) oooOOO0).f52861OooO0Oo, iArr);
        return new OooO0OO(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return o0OoOo0.OooOo0(this.f52861OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO0OO) {
            return o0OoOo0.OooO0o(this.f52861OooO0Oo, ((OooO0OO) obj).f52861OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52860OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52861OooO0Oo, 8);
    }
}
