package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52622OooO0Oo;

    public o00O000o() {
        this.f52622OooO0Oo = new long[4];
    }

    public o00O000o(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        long[] jArrOooO = p697oO0OOo0o.o0OoOo0.OooO(bigInteger);
        long j = jArrOooO[3];
        long j2 = j >>> 1;
        jArrOooO[0] = jArrOooO[0] ^ ((j2 << 15) ^ j2);
        jArrOooO[1] = (j2 >>> 49) ^ jArrOooO[1];
        jArrOooO[3] = j & 1;
        this.f52622OooO0Oo = jArrOooO;
    }

    public o00O000o(long[] jArr) {
        this.f52622OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o0OoOo0.OooOOO(this.f52622OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52622OooO0Oo;
        long[] jArr2 = ((o00O000o) oooOOO0).f52622OooO0Oo;
        return new o00O000o(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52622OooO0Oo;
        return new o00O000o(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 193;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f52622OooO0Oo;
        if (p697oO0OOo0o.o0OoOo0.OooOOO(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[8];
        androidx.compose.ui.platform.o00OO00O.OooO0oO(jArr2, jArr5);
        androidx.compose.ui.platform.o00OO00O.OooOO0o(jArr5, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 1, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr4, 1, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 3, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 6, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 12, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 24, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 48, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00OO00O.OooOOO0(jArr3, 96, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0(jArr3, jArr4, jArr);
        return new o00O000o(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.o0OoOo0.OooOO0o(this.f52622OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[4];
        androidx.compose.ui.platform.o00OO00O.OooOO0(this.f52622OooO0Oo, ((o00O000o) oooOOO0).f52622OooO0Oo, jArr);
        return new o00O000o(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52622OooO0Oo;
        long[] jArr2 = ((o00O000o) oooOOO0).f52622OooO0Oo;
        long[] jArr3 = ((o00O000o) oooOOO1).f52622OooO0Oo;
        long[] jArr4 = ((o00O000o) oooOOO2).f52622OooO0Oo;
        long[] jArr5 = new long[8];
        androidx.compose.ui.platform.o00OO00O.OooOO0O(jArr, jArr2, jArr5);
        androidx.compose.ui.platform.o00OO00O.OooOO0O(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        androidx.compose.ui.platform.o00OO00O.OooOO0o(jArr5, jArr6);
        return new o00O000o(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = this.f52622OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[1]);
        long j = (jOooO0Oo & 4294967295L) | (jOooO0Oo2 << 32);
        long j2 = (jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L));
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr[2]);
        long j3 = jOooO0Oo3 >>> 32;
        return new o00O000o(new long[]{j ^ (j2 << 8), (((j3 << 8) ^ ((jOooO0Oo3 & 4294967295L) ^ (jArr[3] << 32))) ^ (j2 >>> 56)) ^ (j2 << 33), ((j3 >>> 56) ^ (j3 << 33)) ^ (j2 >>> 31), j3 >>> 31});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        androidx.compose.ui.platform.o00OO00O.OooO0oO(this.f52622OooO0Oo, jArr2);
        androidx.compose.ui.platform.o00OO00O.OooOO0o(jArr2, jArr);
        return new o00O000o(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52622OooO0Oo;
        long[] jArr2 = ((o00O000o) oooOOO0).f52622OooO0Oo;
        long[] jArr3 = ((o00O000o) oooOOO1).f52622OooO0Oo;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        androidx.compose.ui.platform.o00OO00O.OooO0oO(jArr, jArr5);
        androidx.compose.ui.platform.o00OO00O.OooO00o(jArr4, jArr5, jArr4);
        androidx.compose.ui.platform.o00OO00O.OooOO0O(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        androidx.compose.ui.platform.o00OO00O.OooOO0o(jArr4, jArr6);
        return new o00O000o(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52622OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.o0OoOo0.OooOo0O(this.f52622OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O000o) {
            return p697oO0OOo0o.o0OoOo0.OooO0oO(this.f52622OooO0Oo, ((o00O000o) obj).f52622OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52622OooO0Oo, 4) ^ 1930015;
    }
}
