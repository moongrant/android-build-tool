package oO000OOo;

import java.math.BigInteger;
import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52613OooO0Oo;

    public o000OO00() {
        this.f52613OooO0Oo = new long[3];
    }

    public o000OO00(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        long[] jArrOooOO0O = oO00O0o0.OooOO0O(bigInteger);
        long j = jArrOooOO0O[2];
        long j2 = j >>> 35;
        jArrOooOO0O[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArrOooOO0O[0];
        jArrOooOO0O[2] = j & 34359738367L;
        this.f52613OooO0Oo = jArrOooOO0O;
    }

    public o000OO00(long[] jArr) {
        this.f52613OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return oO00O0o0.OooOOo(this.f52613OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52613OooO0Oo;
        long[] jArr2 = ((o000OO00) oooOOO0).f52613OooO0Oo;
        return new o000OO00(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52613OooO0Oo;
        return new o000OO00(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 163;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f52613OooO0Oo;
        if (oO00O0o0.OooOOo(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[6];
        o000O.OooO0Oo(jArr2, jArr5);
        o000O.OooO0oO(jArr5, jArr3);
        o000O.OooO0oo(jArr3, 1, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr4, 1, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr3, 3, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr4, 3, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr3, 9, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr4, 9, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr3, 27, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr4, 27, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr3);
        o000O.OooO0oo(jArr3, 81, jArr4);
        o000O.OooO0o0(jArr3, jArr4, jArr);
        return new o000OO00(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return oO00O0o0.OooOOOo(this.f52613OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[3];
        o000O.OooO0o0(this.f52613OooO0Oo, ((o000OO00) oooOOO0).f52613OooO0Oo, jArr);
        return new o000OO00(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52613OooO0Oo;
        long[] jArr2 = ((o000OO00) oooOOO0).f52613OooO0Oo;
        long[] jArr3 = ((o000OO00) oooOOO1).f52613OooO0Oo;
        long[] jArr4 = ((o000OO00) oooOOO2).f52613OooO0Oo;
        long[] jArr5 = new long[6];
        o000O.OooO0o(jArr, jArr2, jArr5);
        o000O.OooO0o(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        o000O.OooO0oO(jArr5, jArr6);
        return new o000OO00(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f52613OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[1]);
        long j = (jOooO0Oo & 4294967295L) | (jOooO0Oo2 << 32);
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[2]);
        o000O.OooO0o0(new long[]{(jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L)), jOooO0Oo3 >>> 32, 0}, o000O.f52607OooO00o, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jOooO0Oo3 & 4294967295L);
        return new o000OO00(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        o000O.OooO0Oo(this.f52613OooO0Oo, jArr2);
        o000O.OooO0oO(jArr2, jArr);
        return new o000OO00(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52613OooO0Oo;
        long[] jArr2 = ((o000OO00) oooOOO0).f52613OooO0Oo;
        long[] jArr3 = ((o000OO00) oooOOO1).f52613OooO0Oo;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        o000O.OooO0Oo(jArr, jArr5);
        o000O.OooO00o(jArr4, jArr5, jArr4);
        o000O.OooO0o(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[3];
        o000O.OooO0oO(jArr4, jArr6);
        return new o000OO00(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52613OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return oO00O0o0.OooOoOO(this.f52613OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OO00)) {
            return false;
        }
        long[] jArr = this.f52613OooO0Oo;
        long[] jArr2 = ((o000OO00) obj).f52613OooO0Oo;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52613OooO0Oo, 3) ^ 163763;
    }
}
