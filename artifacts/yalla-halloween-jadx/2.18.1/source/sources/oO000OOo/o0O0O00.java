package oO000OOo;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BigInteger f52647OooO0o0 = o0OO00O.f52649OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f52648OooO0Oo;

    public o0O0O00() {
        this.f52648OooO0Oo = new int[7];
    }

    public o0O0O00(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f52647OooO0o0) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] iArrOooO0o0 = p697oO0OOo0o.o000oOoO.OooO0o0(bigInteger);
        if (iArrOooO0o0[6] == -1) {
            int[] iArr = oo0o0Oo.f52660OooO00o;
            if (p697oO0OOo0o.o000oOoO.OooO0o(iArrOooO0o0, iArr)) {
                long j = ((((long) iArrOooO0o0[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
                iArrOooO0o0[0] = (int) j;
                long j2 = ((((long) iArrOooO0o0[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
                iArrOooO0o0[1] = (int) j2;
                long j3 = ((((long) iArrOooO0o0[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
                iArrOooO0o0[2] = (int) j3;
                long j4 = ((((long) iArrOooO0o0[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
                iArrOooO0o0[3] = (int) j4;
                long j5 = ((((long) iArrOooO0o0[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
                iArrOooO0o0[4] = (int) j5;
                long j6 = ((((long) iArrOooO0o0[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
                iArrOooO0o0[5] = (int) j6;
                iArrOooO0o0[6] = (int) (((((long) iArrOooO0o0[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32));
            }
        }
        this.f52648OooO0Oo = iArrOooO0o0;
    }

    public o0O0O00(int[] iArr) {
        this.f52648OooO0Oo = iArr;
    }

    public static void OooOo00(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        oo0o0Oo.OooO0Oo(iArr2, iArr, iArr2);
        oo0o0Oo.OooOO0(iArr2, iArr2);
        oo0o0Oo.OooO0oo(iArr, iArr4);
        oo0o0Oo.OooO00o(iArr3, iArr4, iArr);
        oo0o0Oo.OooO0Oo(iArr3, iArr4, iArr3);
        oo0o0Oo.OooO0oO(p399o0Oo00oo.o00000OO.OooOOoo(7, iArr3), iArr3);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        return p697oO0OOo0o.o000oOoO.OooO0oo(this.f52648OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        oo0o0Oo.OooO00o(this.f52648OooO0Oo, ((o0O0O00) oooOOO0).f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        int[] iArr = new int[7];
        oo0o0Oo.OooO0O0(this.f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        p697oO0OOo0o.Oooo000.OooO0OO(oo0o0Oo.f52660OooO00o, ((o0O0O00) oooOOO0).f52648OooO0Oo, iArr);
        oo0o0Oo.OooO0Oo(iArr, this.f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return f52647OooO0o0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        int[] iArr = new int[7];
        p697oO0OOo0o.Oooo000.OooO0OO(oo0o0Oo.f52660OooO00o, this.f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        return p697oO0OOo0o.o000oOoO.OooO0oO(this.f52648OooO0Oo);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        oo0o0Oo.OooO0Oo(this.f52648OooO0Oo, ((o0O0O00) oooOOO0).f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        boolean z;
        int[] iArr = this.f52648OooO0Oo;
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr) || p697oO0OOo0o.o000oOoO.OooO0oO(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        oo0o0Oo.OooO0o0(iArr, iArr2);
        int[] iArr3 = oo0o0Oo.f52660OooO00o;
        Random random = new Random();
        int[] iArr4 = new int[7];
        int i = iArr3[6];
        int i2 = i | (i >>> 1);
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        int i6 = i5 | (i5 >>> 16);
        do {
            for (int i7 = 0; i7 != 7; i7++) {
                iArr4[i7] = random.nextInt();
            }
            iArr4[6] = iArr4[6] & i6;
        } while (p399o0Oo00oo.o00000OO.OooOO0O(7, iArr4, iArr3));
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        p697oO0OOo0o.o000oOoO.OooO0OO(iArr, iArr6);
        for (int i8 = 0; i8 < 7; i8++) {
            p697oO0OOo0o.o000oOoO.OooO0OO(iArr6, iArr7);
            int i9 = 1 << i8;
            int[] iArr8 = new int[14];
            do {
                p697oO0OOo0o.o000oOoO.OooOO0O(iArr6, iArr8);
                oo0o0Oo.OooO0o(iArr8, iArr6);
                i9--;
            } while (i9 > 0);
            oo0o0Oo.OooO0Oo(iArr6, iArr7, iArr6);
        }
        int i10 = 95;
        int[] iArr9 = new int[14];
        do {
            p697oO0OOo0o.o000oOoO.OooOO0O(iArr6, iArr9);
            oo0o0Oo.OooO0o(iArr9, iArr6);
            i10--;
        } while (i10 > 0);
        if (!p697oO0OOo0o.o000oOoO.OooO0oO(iArr6)) {
            return null;
        }
        while (true) {
            int[] iArr10 = new int[7];
            p697oO0OOo0o.o000oOoO.OooO0OO(iArr4, iArr10);
            int[] iArr11 = new int[7];
            iArr11[0] = 1;
            int[] iArr12 = new int[7];
            p697oO0OOo0o.o000oOoO.OooO0OO(iArr2, iArr12);
            int[] iArr13 = new int[7];
            int[] iArr14 = new int[7];
            for (int i11 = 0; i11 < 7; i11++) {
                p697oO0OOo0o.o000oOoO.OooO0OO(iArr10, iArr13);
                p697oO0OOo0o.o000oOoO.OooO0OO(iArr11, iArr14);
                int i12 = 1 << i11;
                while (true) {
                    i12--;
                    if (i12 >= 0) {
                        OooOo00(iArr10, iArr11, iArr12, iArr5);
                    }
                }
                oo0o0Oo.OooO0Oo(iArr11, iArr14, iArr5);
                oo0o0Oo.OooO0Oo(iArr5, iArr2, iArr5);
                oo0o0Oo.OooO0Oo(iArr10, iArr13, iArr12);
                oo0o0Oo.OooO00o(iArr12, iArr5, iArr12);
                oo0o0Oo.OooO0Oo(iArr10, iArr14, iArr5);
                p697oO0OOo0o.o000oOoO.OooO0OO(iArr12, iArr10);
                oo0o0Oo.OooO0Oo(iArr11, iArr13, iArr11);
                oo0o0Oo.OooO00o(iArr11, iArr5, iArr11);
                oo0o0Oo.OooO0oo(iArr11, iArr12);
                oo0o0Oo.OooO0Oo(iArr12, iArr2, iArr12);
            }
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            int i13 = 1;
            while (true) {
                if (i13 >= 96) {
                    z = false;
                    break;
                }
                p697oO0OOo0o.o000oOoO.OooO0OO(iArr10, iArr15);
                p697oO0OOo0o.o000oOoO.OooO0OO(iArr11, iArr16);
                OooOo00(iArr10, iArr11, iArr12, iArr5);
                if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr10)) {
                    p697oO0OOo0o.Oooo000.OooO0OO(oo0o0Oo.f52660OooO00o, iArr16, iArr5);
                    oo0o0Oo.OooO0Oo(iArr5, iArr15, iArr5);
                    z = true;
                    break;
                }
                i13++;
            }
            if (z) {
                break;
            }
            oo0o0Oo.OooO0O0(iArr4, iArr4);
        }
        oo0o0Oo.OooO0oo(iArr5, iArr4);
        if (p697oO0OOo0o.o000oOoO.OooO0Oo(iArr, iArr4)) {
            return new o0O0O00(iArr5);
        }
        return null;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        int[] iArr = new int[7];
        oo0o0Oo.OooO0o0(this.f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        int[] iArr = new int[7];
        oo0o0Oo.OooO0oo(this.f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52648OooO0Oo[0] & 1) == 1;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        int[] iArr = new int[7];
        oo0o0Oo.OooO(this.f52648OooO0Oo, ((o0O0O00) oooOOO0).f52648OooO0Oo, iArr);
        return new o0O0O00(iArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        return p697oO0OOo0o.o000oOoO.OooOOO0(this.f52648OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0O00) {
            return p697oO0OOo0o.o000oOoO.OooO0Oo(this.f52648OooO0Oo, ((o0O0O00) obj).f52648OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return f52647OooO0o0.hashCode() ^ oO000Oo.OooO00o.OooO(this.f52648OooO0Oo, 7);
    }
}
