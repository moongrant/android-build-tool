package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52564OooO0o0 = OooO00o.f52562OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52565OooO0Oo;

    public OooO0O0() {
        this.f52565OooO0Oo = new int[4];
    }

    public OooO0O0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52564OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        if (iArr[3] == -3) {
            int[] iArr2 = p228o00oOo.o0000OO0.f33888OooO0O0;
            if (o000OOO.OooO0OO.OooO0OO(iArr, iArr2)) {
                long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
                iArr[0] = (int) j;
                long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
                iArr[1] = (int) j2;
                long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
                iArr[2] = (int) j3;
                iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32));
            }
        }
        this.f52565OooO0Oo = iArr;
    }

    public OooO0O0(int[] iArr) {
        this.f52565OooO0Oo = iArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return o000OOO.OooO0OO.OooO0Oo(this.f52565OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[4];
        p228o00oOo.o0000OO0.OooO00o(this.f52565OooO0Oo, ((OooO0O0) oooOOO0).f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[4];
        if (p399o0Oo00oo.o00000OO.OooOO0o(4, this.f52565OooO0Oo, iArr) != 0 || (iArr[3] == -3 && o000OOO.OooO0OO.OooO0OO(iArr, p228o00oOo.o0000OO0.f33888OooO0O0))) {
            p228o00oOo.o0000OO0.OooO0O0(iArr);
        }
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[4];
        p697oO0OOo0o.Oooo000.OooO0OO(p228o00oOo.o0000OO0.f33888OooO0O0, ((OooO0O0) oooOOO0).f52565OooO0Oo, iArr);
        p228o00oOo.o0000OO0.OooO0o0(iArr, this.f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52564OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[4];
        p697oO0OOo0o.Oooo000.OooO0OO(p228o00oOo.o0000OO0.f33888OooO0O0, this.f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        int[] iArr = this.f52565OooO0Oo;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[4];
        p228o00oOo.o0000OO0.OooO0o0(this.f52565OooO0Oo, ((OooO0O0) oooOOO0).f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[ORIG_RETURN, RETURN] */
    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        boolean z;
        int[] iArr = this.f52565OooO0Oo;
        if (!o000OOO.OooO0OO.OooO0Oo(iArr)) {
            boolean z2 = false;
            if (iArr[0] != 1) {
                z = false;
                break;
            }
            int i = 1;
            while (true) {
                if (i >= 4) {
                    z = true;
                    break;
                }
                if (iArr[i] != 0) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                int[] iArr2 = new int[4];
                p228o00oOo.o0000OO0.OooO(iArr, iArr2);
                p228o00oOo.o0000OO0.OooO0o0(iArr2, iArr, iArr2);
                int[] iArr3 = new int[4];
                p228o00oOo.o0000OO0.OooOO0(iArr2, 2, iArr3);
                p228o00oOo.o0000OO0.OooO0o0(iArr3, iArr2, iArr3);
                int[] iArr4 = new int[4];
                p228o00oOo.o0000OO0.OooOO0(iArr3, 4, iArr4);
                p228o00oOo.o0000OO0.OooO0o0(iArr4, iArr3, iArr4);
                p228o00oOo.o0000OO0.OooOO0(iArr4, 2, iArr3);
                p228o00oOo.o0000OO0.OooO0o0(iArr3, iArr2, iArr3);
                p228o00oOo.o0000OO0.OooOO0(iArr3, 10, iArr2);
                p228o00oOo.o0000OO0.OooO0o0(iArr2, iArr3, iArr2);
                p228o00oOo.o0000OO0.OooOO0(iArr2, 10, iArr4);
                p228o00oOo.o0000OO0.OooO0o0(iArr4, iArr3, iArr4);
                p228o00oOo.o0000OO0.OooO(iArr4, iArr3);
                p228o00oOo.o0000OO0.OooO0o0(iArr3, iArr, iArr3);
                p228o00oOo.o0000OO0.OooOO0(iArr3, 95, iArr3);
                p228o00oOo.o0000OO0.OooO(iArr3, iArr4);
                for (int i2 = 3; i2 >= 0; i2--) {
                    if (iArr[i2] != iArr4[i2]) {
                        if (z2) {
                            return new OooO0O0(iArr3);
                        }
                        return null;
                    }
                }
                z2 = true;
                if (z2) {
                    return new OooO0O0(iArr3);
                }
                return null;
            }
        }
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[4];
        p228o00oOo.o0000OO0.OooO0o(this.f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[4];
        p228o00oOo.o0000OO0.OooO(this.f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52565OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[4];
        p228o00oOo.o0000OO0.OooOO0O(this.f52565OooO0Oo, ((OooO0O0) oooOOO0).f52565OooO0Oo, iArr);
        return new OooO0O0(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        int[] iArr = this.f52565OooO0Oo;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                p684oO0000o.OooOO0.OooO0O0(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        int[] iArr = this.f52565OooO0Oo;
        int[] iArr2 = ((OooO0O0) obj).f52565OooO0Oo;
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return f52564OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52565OooO0Oo, 4);
    }
}
