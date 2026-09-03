package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0O extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52627OooO0Oo;

    public o00O0O0O() {
        this.f52627OooO0Oo = new long[4];
    }

    public o00O0O0O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        long[] jArrOooO = p697oO0OOo0o.o0OoOo0.OooO(bigInteger);
        long j = jArrOooO[3];
        long j2 = j >>> 47;
        jArrOooO[0] = jArrOooO[0] ^ j2;
        jArrOooO[2] = (j2 << 30) ^ jArrOooO[2];
        jArrOooO[3] = j & 140737488355327L;
        this.f52627OooO0Oo = jArrOooO;
    }

    public o00O0O0O(long[] jArr) {
        this.f52627OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o0OoOo0.OooOOO(this.f52627OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52627OooO0Oo;
        long[] jArr2 = ((o00O0O0O) oooOOO0).f52627OooO0Oo;
        return new o00O0O0O(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52627OooO0Oo;
        return new o00O0O0O(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 239;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f52627OooO0Oo;
        if (p697oO0OOo0o.o0OoOo0.OooOOO(jArr2)) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        androidx.compose.ui.platform.o00O0.OooOo00(jArr2, jArr3);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr3, jArr2, jArr3);
        androidx.compose.ui.platform.o00O0.OooOo00(jArr3, jArr3);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr3, jArr2, jArr3);
        androidx.compose.ui.platform.o00O0.OooOo0(jArr3, 3, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr4, jArr3, jArr4);
        androidx.compose.ui.platform.o00O0.OooOo00(jArr4, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr4, jArr2, jArr4);
        androidx.compose.ui.platform.o00O0.OooOo0(jArr4, 7, jArr3);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00O0.OooOo0(jArr3, 14, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr4, jArr3, jArr4);
        androidx.compose.ui.platform.o00O0.OooOo00(jArr4, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr4, jArr2, jArr4);
        androidx.compose.ui.platform.o00O0.OooOo0(jArr4, 29, jArr3);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00O0.OooOo00(jArr3, jArr3);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr3, jArr2, jArr3);
        androidx.compose.ui.platform.o00O0.OooOo0(jArr3, 59, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr4, jArr3, jArr4);
        androidx.compose.ui.platform.o00O0.OooOo00(jArr4, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr4, jArr2, jArr4);
        androidx.compose.ui.platform.o00O0.OooOo0(jArr4, 119, jArr3);
        androidx.compose.ui.platform.o00O0.OooOOOO(jArr3, jArr4, jArr3);
        androidx.compose.ui.platform.o00O0.OooOo00(jArr3, jArr);
        return new o00O0O0O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.o0OoOo0.OooOO0o(this.f52627OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[4];
        androidx.compose.ui.platform.o00O0.OooOOOO(this.f52627OooO0Oo, ((o00O0O0O) oooOOO0).f52627OooO0Oo, jArr);
        return new o00O0O0O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52627OooO0Oo;
        long[] jArr2 = ((o00O0O0O) oooOOO0).f52627OooO0Oo;
        long[] jArr3 = ((o00O0O0O) oooOOO1).f52627OooO0Oo;
        long[] jArr4 = ((o00O0O0O) oooOOO2).f52627OooO0Oo;
        long[] jArr5 = new long[8];
        androidx.compose.ui.platform.o00O0.OooOOOo(jArr, jArr2, jArr5);
        androidx.compose.ui.platform.o00O0.OooOOOo(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        androidx.compose.ui.platform.o00O0.OooOOo(jArr5, jArr6);
        return new o00O0O0O(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f52627OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[1]);
        long j = (jOooO0Oo & 4294967295L) | (jOooO0Oo2 << 32);
        long j2 = (jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L));
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[2]);
        long jOooO0Oo4 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[3]);
        long j3 = (jOooO0Oo3 & 4294967295L) | (jOooO0Oo4 << 32);
        long j4 = (jOooO0Oo4 & (-4294967296L)) | (jOooO0Oo3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            int i3 = iArr[i] >>> 6;
            int i4 = iArr[i] & 63;
            jArr3[i3] = jArr3[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i6);
            i++;
        }
        androidx.compose.ui.platform.o00O0.OooOOo(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new o00O0O0O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[4];
        androidx.compose.ui.platform.o00O0.OooOo00(this.f52627OooO0Oo, jArr);
        return new o00O0O0O(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52627OooO0Oo;
        long[] jArr2 = ((o00O0O0O) oooOOO0).f52627OooO0Oo;
        long[] jArr3 = ((o00O0O0O) oooOOO1).f52627OooO0Oo;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        androidx.compose.ui.platform.o00O0.OooOO0(jArr, jArr5);
        androidx.compose.ui.platform.o00O0.OooO00o(jArr4, jArr5, jArr4);
        androidx.compose.ui.platform.o00O0.OooOOOo(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        androidx.compose.ui.platform.o00O0.OooOOo(jArr4, jArr6);
        return new o00O0O0O(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52627OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.o0OoOo0.OooOo0O(this.f52627OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0O0O) {
            return p697oO0OOo0o.o0OoOo0.OooO0oO(this.f52627OooO0Oo, ((o00O0O0O) obj).f52627OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52627OooO0Oo, 4) ^ 23900158;
    }
}
