package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52570OooO0o0 = OooOO0.f52568OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52571OooO0Oo;

    public OooOO0O() {
        this.f52571OooO0Oo = new int[5];
    }

    public OooOO0O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52570OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] iArrOooO0Oo = p697oO0OOo0o.Oooo0.OooO0Oo(bigInteger);
        if (iArrOooO0Oo[4] == -1) {
            int[] iArr = com.android.billingclient.api.o0000.f11259OooO0O0;
            if (p697oO0OOo0o.Oooo0.OooO0o0(iArrOooO0Oo, iArr)) {
                p697oO0OOo0o.Oooo0.OooOO0o(iArr, iArrOooO0Oo);
            }
        }
        this.f52571OooO0Oo = iArrOooO0Oo;
    }

    public OooOO0O(int[] iArr) {
        this.f52571OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.Oooo0.OooO0oO(this.f52571OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        com.android.billingclient.api.o0000.OooO0O0(this.f52571OooO0Oo, ((OooOO0O) oooOOO0).f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[5];
        if (p399o0Oo00oo.o00000OO.OooOO0o(5, this.f52571OooO0Oo, iArr) != 0 || (iArr[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr, com.android.billingclient.api.o0000.f11259OooO0O0))) {
            p399o0Oo00oo.o00000OO.OooO0oO(5, -2147483647, iArr);
        }
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        p697oO0OOo0o.Oooo000.OooO0OO(com.android.billingclient.api.o0000.f11259OooO0O0, ((OooOO0O) oooOOO0).f52571OooO0Oo, iArr);
        com.android.billingclient.api.o0000.OooO0o0(iArr, this.f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52570OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[5];
        p697oO0OOo0o.Oooo000.OooO0OO(com.android.billingclient.api.o0000.f11259OooO0O0, this.f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.Oooo0.OooO0o(this.f52571OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        com.android.billingclient.api.o0000.OooO0o0(this.f52571OooO0Oo, ((OooOO0O) oooOOO0).f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        int[] iArr = this.f52571OooO0Oo;
        if (p697oO0OOo0o.Oooo0.OooO0oO(iArr) || p697oO0OOo0o.Oooo0.OooO0o(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        com.android.billingclient.api.o0000.OooOO0O(iArr, iArr2);
        com.android.billingclient.api.o0000.OooO0o0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        com.android.billingclient.api.o0000.OooOO0o(iArr2, 2, iArr3);
        com.android.billingclient.api.o0000.OooO0o0(iArr3, iArr2, iArr3);
        com.android.billingclient.api.o0000.OooOO0o(iArr3, 4, iArr2);
        com.android.billingclient.api.o0000.OooO0o0(iArr2, iArr3, iArr2);
        com.android.billingclient.api.o0000.OooOO0o(iArr2, 8, iArr3);
        com.android.billingclient.api.o0000.OooO0o0(iArr3, iArr2, iArr3);
        com.android.billingclient.api.o0000.OooOO0o(iArr3, 16, iArr2);
        com.android.billingclient.api.o0000.OooO0o0(iArr2, iArr3, iArr2);
        com.android.billingclient.api.o0000.OooOO0o(iArr2, 32, iArr3);
        com.android.billingclient.api.o0000.OooO0o0(iArr3, iArr2, iArr3);
        com.android.billingclient.api.o0000.OooOO0o(iArr3, 64, iArr2);
        com.android.billingclient.api.o0000.OooO0o0(iArr2, iArr3, iArr2);
        com.android.billingclient.api.o0000.OooOO0O(iArr2, iArr3);
        com.android.billingclient.api.o0000.OooO0o0(iArr3, iArr, iArr3);
        com.android.billingclient.api.o0000.OooOO0o(iArr3, 29, iArr3);
        com.android.billingclient.api.o0000.OooOO0O(iArr3, iArr2);
        if (p697oO0OOo0o.Oooo0.OooO0OO(iArr, iArr2)) {
            return new OooOO0O(iArr3);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[5];
        com.android.billingclient.api.o0000.OooO0o(this.f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[5];
        com.android.billingclient.api.o0000.OooOO0O(this.f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52571OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[5];
        com.android.billingclient.api.o0000.OooOOO0(this.f52571OooO0Oo, ((OooOO0O) oooOOO0).f52571OooO0Oo, iArr);
        return new OooOO0O(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.Oooo0.OooOOO0(this.f52571OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            return p697oO0OOo0o.Oooo0.OooO0OO(this.f52571OooO0Oo, ((OooOO0O) obj).f52571OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52570OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52571OooO0Oo, 5);
    }
}
