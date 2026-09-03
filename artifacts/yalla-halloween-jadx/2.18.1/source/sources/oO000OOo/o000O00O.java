package oO000OOo;

import java.math.BigInteger;
import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52610OooO0Oo;

    public o000O00O() {
        this.f52610OooO0Oo = new long[3];
    }

    public o000O00O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        long[] jArrOooOO0O = oO00O0o0.OooOO0O(bigInteger);
        long j = jArrOooOO0O[2];
        long j2 = j >>> 3;
        jArrOooOO0O[0] = jArrOooOO0O[0] ^ ((((j2 << 2) ^ j2) ^ (j2 << 3)) ^ (j2 << 8));
        jArrOooOO0O[1] = (j2 >>> 56) ^ jArrOooOO0O[1];
        jArrOooOO0O[2] = j & 7;
        this.f52610OooO0Oo = jArrOooOO0O;
    }

    public o000O00O(long[] jArr) {
        this.f52610OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return oO00O0o0.OooOOo(this.f52610OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52610OooO0Oo;
        long[] jArr2 = ((o000O00O) oooOOO0).f52610OooO0Oo;
        return new o000O00O(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52610OooO0Oo;
        return new o000O00O(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 131;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f52610OooO0Oo;
        if (oO00O0o0.OooOOo(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        p134o00OO0o.o00O0O.OooO0oo(jArr2, jArr3);
        p134o00OO0o.o00O0O.OooO0o0(jArr3, jArr2, jArr3);
        p134o00OO0o.o00O0O.OooO(jArr3, 2, jArr4);
        p134o00OO0o.o00O0O.OooO0o0(jArr4, jArr3, jArr4);
        p134o00OO0o.o00O0O.OooO(jArr4, 4, jArr3);
        p134o00OO0o.o00O0O.OooO0o0(jArr3, jArr4, jArr3);
        p134o00OO0o.o00O0O.OooO(jArr3, 8, jArr4);
        p134o00OO0o.o00O0O.OooO0o0(jArr4, jArr3, jArr4);
        p134o00OO0o.o00O0O.OooO(jArr4, 16, jArr3);
        p134o00OO0o.o00O0O.OooO0o0(jArr3, jArr4, jArr3);
        p134o00OO0o.o00O0O.OooO(jArr3, 32, jArr4);
        p134o00OO0o.o00O0O.OooO0o0(jArr4, jArr3, jArr4);
        p134o00OO0o.o00O0O.OooO0oo(jArr4, jArr4);
        p134o00OO0o.o00O0O.OooO0o0(jArr4, jArr2, jArr4);
        p134o00OO0o.o00O0O.OooO(jArr4, 65, jArr3);
        p134o00OO0o.o00O0O.OooO0o0(jArr3, jArr4, jArr3);
        p134o00OO0o.o00O0O.OooO0oo(jArr3, jArr);
        return new o000O00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return oO00O0o0.OooOOOo(this.f52610OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[3];
        p134o00OO0o.o00O0O.OooO0o0(this.f52610OooO0Oo, ((o000O00O) oooOOO0).f52610OooO0Oo, jArr);
        return new o000O00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52610OooO0Oo;
        long[] jArr2 = ((o000O00O) oooOOO0).f52610OooO0Oo;
        long[] jArr3 = ((o000O00O) oooOOO1).f52610OooO0Oo;
        long[] jArr4 = ((o000O00O) oooOOO2).f52610OooO0Oo;
        long[] jArr5 = new long[5];
        p134o00OO0o.o00O0O.OooO0o(jArr, jArr2, jArr5);
        p134o00OO0o.o00O0O.OooO0o(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        p134o00OO0o.o00O0O.OooO0oO(jArr5, jArr6);
        return new o000O00O(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f52610OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[1]);
        long j = (jOooO0Oo & 4294967295L) | (jOooO0Oo2 << 32);
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[2]);
        p134o00OO0o.o00O0O.OooO0o0(new long[]{(jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L)), jOooO0Oo3 >>> 32, 0}, p134o00OO0o.o00O0O.f31635OooO0O0, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jOooO0Oo3 & 4294967295L);
        return new o000O00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[3];
        p134o00OO0o.o00O0O.OooO0oo(this.f52610OooO0Oo, jArr);
        return new o000O00O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52610OooO0Oo;
        long[] jArr2 = ((o000O00O) oooOOO0).f52610OooO0Oo;
        long[] jArr3 = ((o000O00O) oooOOO1).f52610OooO0Oo;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        p134o00OO0o.o00O0O.OooO0Oo(jArr, jArr5);
        p134o00OO0o.o00O0O.OooO00o(jArr4, jArr5, jArr4);
        p134o00OO0o.o00O0O.OooO0o(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[3];
        p134o00OO0o.o00O0O.OooO0oO(jArr4, jArr6);
        return new o000O00O(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52610OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return oO00O0o0.OooOoOO(this.f52610OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000O00O)) {
            return false;
        }
        long[] jArr = this.f52610OooO0Oo;
        long[] jArr2 = ((o000O00O) obj).f52610OooO0Oo;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52610OooO0Oo, 3) ^ 131832;
    }
}
