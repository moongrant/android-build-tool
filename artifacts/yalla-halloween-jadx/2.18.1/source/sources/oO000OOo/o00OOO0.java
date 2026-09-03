package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52633OooO0Oo;

    public o00OOO0() {
        this.f52633OooO0Oo = new long[9];
    }

    public o00OOO0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[9];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        o00OOO00.OooOO0(jArr, 0);
        this.f52633OooO0Oo = jArr;
    }

    public o00OOO0(long[] jArr) {
        this.f52633OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o00Oo0.OooO00o(this.f52633OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[9];
        o00OOO00.OooO00o(this.f52633OooO0Oo, ((o00OOO0) oooOOO0).f52633OooO0Oo, jArr);
        return new o00OOO0(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f52633OooO0Oo;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new o00OOO0(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 571;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f52633OooO0Oo;
        if (p697oO0OOo0o.o00Oo0.OooO00o(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        o00OOO00.OooOO0O(jArr2, jArr5);
        o00OOO00.OooOO0O(jArr5, jArr3);
        o00OOO00.OooOO0O(jArr3, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr3, 2, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooO0o0(jArr3, jArr5, jArr3);
        o00OOO00.OooOOO0(jArr3, 5, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr4, 5, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr3, 15, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr5);
        o00OOO00.OooOOO0(jArr5, 30, jArr3);
        o00OOO00.OooOOO0(jArr3, 30, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr3, 60, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr4, 60, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr3, 180, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooOOO0(jArr4, 180, jArr4);
        o00OOO00.OooO0o0(jArr3, jArr4, jArr3);
        o00OOO00.OooO0o0(jArr3, jArr5, jArr);
        return new o00OOO0(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        long[] jArr = this.f52633OooO0Oo;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[9];
        o00OOO00.OooO0o0(this.f52633OooO0Oo, ((o00OOO0) oooOOO0).f52633OooO0Oo, jArr);
        return new o00OOO0(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52633OooO0Oo;
        long[] jArr2 = ((o00OOO0) oooOOO0).f52633OooO0Oo;
        long[] jArr3 = ((o00OOO0) oooOOO1).f52633OooO0Oo;
        long[] jArr4 = ((o00OOO0) oooOOO2).f52633OooO0Oo;
        long[] jArr5 = new long[18];
        o00OOO00.OooO0o(jArr, jArr2, jArr5);
        o00OOO00.OooO0o(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        o00OOO00.OooO(jArr5, jArr6);
        return new o00OOO0(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f52633OooO0Oo;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[i]);
            i = i3 + 1;
            long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[i3]);
            jArr3[i2] = (4294967295L & jOooO0Oo) | (jOooO0Oo2 << 32);
            jArr4[i2] = (jOooO0Oo >>> 32) | ((-4294967296L) & jOooO0Oo2);
        }
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[i]);
        jArr3[4] = 4294967295L & jOooO0Oo3;
        jArr4[4] = jOooO0Oo3 >>> 32;
        o00OOO00.OooO0o0(jArr4, o00OOO00.f52634OooO00o, jArr);
        o00OOO00.OooO00o(jArr, jArr3, jArr);
        return new o00OOO0(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[9];
        o00OOO00.OooOO0O(this.f52633OooO0Oo, jArr);
        return new o00OOO0(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52633OooO0Oo;
        long[] jArr2 = ((o00OOO0) oooOOO0).f52633OooO0Oo;
        long[] jArr3 = ((o00OOO0) oooOOO1).f52633OooO0Oo;
        long[] jArr4 = new long[18];
        o00OOO00.OooOO0o(jArr, jArr4);
        o00OOO00.OooO0o(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        o00OOO00.OooO(jArr4, jArr5);
        return new o00OOO0(jArr5);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52633OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        long[] jArr = this.f52633OooO0Oo;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                p684oO0000o.OooOO0.OooO0Oo(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOO0)) {
            return false;
        }
        long[] jArr = this.f52633OooO0Oo;
        long[] jArr2 = ((o00OOO0) obj).f52633OooO0Oo;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52633OooO0Oo, 9) ^ 5711052;
    }
}
