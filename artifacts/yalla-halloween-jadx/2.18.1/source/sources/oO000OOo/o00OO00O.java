package oO000OOo;

import java.math.BigInteger;
import p440o0OoOOoO.o0OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52631OooO0Oo;

    public o00OO00O() {
        this.f52631OooO0Oo = new long[7];
    }

    public o00OO00O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[6];
        long j2 = j >>> 25;
        jArr[0] = jArr[0] ^ j2;
        jArr[1] = (j2 << 23) ^ jArr[1];
        jArr[6] = j & 33554431;
        this.f52631OooO0Oo = jArr;
    }

    public o00OO00O(long[] jArr) {
        this.f52631OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        long[] jArr = this.f52631OooO0Oo;
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52631OooO0Oo;
        long[] jArr2 = ((o00OO00O) oooOOO0).f52631OooO0Oo;
        return new o00OO00O(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52631OooO0Oo;
        return new o00OO00O(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 409;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[7];
        long[] jArr2 = this.f52631OooO0Oo;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 7) {
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
        long[] jArr3 = new long[7];
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        long[] jArr6 = new long[13];
        o0OO0O0.OooO0OO(jArr2, jArr6);
        o0OO0O0.OooO0oO(jArr6, jArr3);
        o0OO0O0.OooO0oo(jArr3, 1, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr4, 1, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr3, 3, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr3, 6, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr3, 12, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr5);
        o0OO0O0.OooO0oo(jArr5, 24, jArr3);
        o0OO0O0.OooO0oo(jArr3, 24, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr3, 48, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr3, 96, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0oo(jArr3, 192, jArr4);
        o0OO0O0.OooO0o0(jArr3, jArr4, jArr3);
        o0OO0O0.OooO0o0(jArr3, jArr5, jArr);
        return new o00OO00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        long[] jArr = this.f52631OooO0Oo;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[7];
        o0OO0O0.OooO0o0(this.f52631OooO0Oo, ((o00OO00O) oooOOO0).f52631OooO0Oo, jArr);
        return new o00OO00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52631OooO0Oo;
        long[] jArr2 = ((o00OO00O) oooOOO0).f52631OooO0Oo;
        long[] jArr3 = ((o00OO00O) oooOOO1).f52631OooO0Oo;
        long[] jArr4 = ((o00OO00O) oooOOO2).f52631OooO0Oo;
        long[] jArr5 = new long[13];
        o0OO0O0.OooO0o(jArr, jArr2, jArr5);
        o0OO0O0.OooO0o(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        o0OO0O0.OooO0oO(jArr5, jArr6);
        return new o00OO00O(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = this.f52631OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[1]);
        long j = (jOooO0Oo & 4294967295L) | (jOooO0Oo2 << 32);
        long j2 = (jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L));
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[2]);
        long jOooO0Oo4 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[3]);
        long j3 = (jOooO0Oo3 & 4294967295L) | (jOooO0Oo4 << 32);
        long j4 = (jOooO0Oo3 >>> 32) | (jOooO0Oo4 & (-4294967296L));
        long jOooO0Oo5 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[4]);
        long jOooO0Oo6 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[5]);
        long j5 = (jOooO0Oo5 >>> 32) | (jOooO0Oo6 & (-4294967296L));
        long jOooO0Oo7 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[6]);
        long j6 = jOooO0Oo7 & 4294967295L;
        long j7 = jOooO0Oo7 >>> 32;
        return new o00OO00O(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((jOooO0Oo5 & 4294967295L) | (jOooO0Oo6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((j7 << 44) ^ j6) ^ (j5 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j7 >>> 20) ^ (j4 << 13)), (j5 << 13) ^ (j4 >>> 51), (j5 >>> 51) ^ (j7 << 13)});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        o0OO0O0.OooO0OO(this.f52631OooO0Oo, jArr2);
        o0OO0O0.OooO0oO(jArr2, jArr);
        return new o00OO00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52631OooO0Oo;
        long[] jArr2 = ((o00OO00O) oooOOO0).f52631OooO0Oo;
        long[] jArr3 = ((o00OO00O) oooOOO1).f52631OooO0Oo;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[13];
        o0OO0O0.OooO0OO(jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        o0OO0O0.OooO0o(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[7];
        o0OO0O0.OooO0oO(jArr4, jArr6);
        return new o00OO00O(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52631OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        long[] jArr = this.f52631OooO0Oo;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                p684oO0000o.OooOO0.OooO0Oo(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OO00O)) {
            return false;
        }
        long[] jArr = this.f52631OooO0Oo;
        long[] jArr2 = ((o00OO00O) obj).f52631OooO0Oo;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52631OooO0Oo, 7) ^ 4090087;
    }
}
