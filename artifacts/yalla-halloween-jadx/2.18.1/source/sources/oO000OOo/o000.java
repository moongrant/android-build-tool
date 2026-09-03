package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52584OooO0Oo;

    public o000() {
        this.f52584OooO0Oo = new long[2];
    }

    public o000(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[2];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[1];
        long j2 = j >>> 49;
        jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
        jArr[1] = j & 562949953421311L;
        this.f52584OooO0Oo = jArr;
    }

    public o000(long[] jArr) {
        this.f52584OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        long[] jArr = this.f52584OooO0Oo;
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52584OooO0Oo;
        long[] jArr2 = ((o000) oooOOO0).f52584OooO0Oo;
        return new o000(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52584OooO0Oo;
        return new o000(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 113;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[2];
        long[] jArr2 = this.f52584OooO0Oo;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = true;
                break;
            }
            if (jArr2[i] != 0) {
                break;
            }
            i++;
        }
        if (z) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[2];
        long[] jArr4 = new long[2];
        p021OooOooo.o00O0O.OooOOO(jArr2, jArr3);
        p021OooOooo.o00O0O.OooOO0O(jArr3, jArr2, jArr3);
        p021OooOooo.o00O0O.OooOOO(jArr3, jArr3);
        p021OooOooo.o00O0O.OooOO0O(jArr3, jArr2, jArr3);
        p021OooOooo.o00O0O.OooOOOO(jArr3, 3, jArr4);
        p021OooOooo.o00O0O.OooOO0O(jArr4, jArr3, jArr4);
        p021OooOooo.o00O0O.OooOOO(jArr4, jArr4);
        p021OooOooo.o00O0O.OooOO0O(jArr4, jArr2, jArr4);
        p021OooOooo.o00O0O.OooOOOO(jArr4, 7, jArr3);
        p021OooOooo.o00O0O.OooOO0O(jArr3, jArr4, jArr3);
        p021OooOooo.o00O0O.OooOOOO(jArr3, 14, jArr4);
        p021OooOooo.o00O0O.OooOO0O(jArr4, jArr3, jArr4);
        p021OooOooo.o00O0O.OooOOOO(jArr4, 28, jArr3);
        p021OooOooo.o00O0O.OooOO0O(jArr3, jArr4, jArr3);
        p021OooOooo.o00O0O.OooOOOO(jArr3, 56, jArr4);
        p021OooOooo.o00O0O.OooOO0O(jArr4, jArr3, jArr4);
        p021OooOooo.o00O0O.OooOOO(jArr4, jArr);
        return new o000(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        long[] jArr = this.f52584OooO0Oo;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[2];
        p021OooOooo.o00O0O.OooOO0O(this.f52584OooO0Oo, ((o000) oooOOO0).f52584OooO0Oo, jArr);
        return new o000(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52584OooO0Oo;
        long[] jArr2 = ((o000) oooOOO0).f52584OooO0Oo;
        long[] jArr3 = ((o000) oooOOO1).f52584OooO0Oo;
        long[] jArr4 = ((o000) oooOOO2).f52584OooO0Oo;
        long[] jArr5 = new long[4];
        p021OooOooo.o00O0O.OooOO0o(jArr, jArr2, jArr5);
        p021OooOooo.o00O0O.OooOO0o(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[2];
        p021OooOooo.o00O0O.OooOOO0(jArr5, jArr6);
        return new o000(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = this.f52584OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[1]);
        long j = (4294967295L & jOooO0Oo) | (jOooO0Oo2 << 32);
        long j2 = (jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L));
        return new o000(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 7) ^ (j2 >>> 59)});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[2];
        p021OooOooo.o00O0O.OooOOO(this.f52584OooO0Oo, jArr);
        return new o000(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52584OooO0Oo;
        long[] jArr2 = ((o000) oooOOO0).f52584OooO0Oo;
        long[] jArr3 = ((o000) oooOOO1).f52584OooO0Oo;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        p021OooOooo.o00O0O.OooOO0(jArr, jArr5);
        p021OooOooo.o00O0O.OooO00o(jArr4, jArr5, jArr4);
        p021OooOooo.o00O0O.OooOO0o(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[2];
        p021OooOooo.o00O0O.OooOOO0(jArr4, jArr6);
        return new o000(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52584OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        long[] jArr = this.f52584OooO0Oo;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                p684oO0000o.OooOO0.OooO0Oo(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000)) {
            return false;
        }
        long[] jArr = this.f52584OooO0Oo;
        long[] jArr2 = ((o000) obj).f52584OooO0Oo;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52584OooO0Oo, 2) ^ 113009;
    }
}
