package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends oO0OO0oo.OooOo00.OooO0O0 {
    public OooO0OO(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public OooO0OO(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (OooOO0()) {
            return oooOo00;
        }
        if (oooOo00.OooOO0()) {
            return this;
        }
        if (this == oooOo00) {
            return OooOOo();
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        OooO0O0 oooO0O0 = (OooO0O0) this.f52787OooO0O0;
        OooO0O0 oooO0O1 = (OooO0O0) this.f52788OooO0OO;
        OooO0O0 oooO0O2 = (OooO0O0) oooOo00.f52787OooO0O0;
        OooO0O0 oooO0O3 = (OooO0O0) oooOo00.OooO0oo();
        OooO0O0 oooO0O4 = (OooO0O0) this.f52789OooO0Oo[0];
        OooO0O0 oooO0O5 = (OooO0O0) oooOo00.OooO();
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[4];
        int[] iArr8 = new int[4];
        boolean zOooO0oo = oooO0O4.OooO0oo();
        if (zOooO0oo) {
            iArr = oooO0O2.f52565OooO0Oo;
            iArr2 = oooO0O3.f52565OooO0Oo;
        } else {
            p228o00oOo.o0000OO0.OooO(oooO0O4.f52565OooO0Oo, iArr7);
            p228o00oOo.o0000OO0.OooO0o0(iArr7, oooO0O2.f52565OooO0Oo, iArr6);
            p228o00oOo.o0000OO0.OooO0o0(iArr7, oooO0O4.f52565OooO0Oo, iArr7);
            p228o00oOo.o0000OO0.OooO0o0(iArr7, oooO0O3.f52565OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = oooO0O5.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = oooO0O0.f52565OooO0Oo;
            iArr4 = oooO0O1.f52565OooO0Oo;
        } else {
            p228o00oOo.o0000OO0.OooO(oooO0O5.f52565OooO0Oo, iArr8);
            p228o00oOo.o0000OO0.OooO0o0(iArr8, oooO0O0.f52565OooO0Oo, iArr5);
            p228o00oOo.o0000OO0.OooO0o0(iArr8, oooO0O5.f52565OooO0Oo, iArr8);
            p228o00oOo.o0000OO0.OooO0o0(iArr8, oooO0O1.f52565OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[4];
        p228o00oOo.o0000OO0.OooOO0O(iArr3, iArr, iArr9);
        p228o00oOo.o0000OO0.OooOO0O(iArr4, iArr2, iArr6);
        if (o000OOO.OooO0OO.OooO0Oo(iArr9)) {
            return o000OOO.OooO0OO.OooO0Oo(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        p228o00oOo.o0000OO0.OooO(iArr9, iArr7);
        int[] iArr10 = new int[4];
        p228o00oOo.o0000OO0.OooO0o0(iArr7, iArr9, iArr10);
        p228o00oOo.o0000OO0.OooO0o0(iArr7, iArr3, iArr7);
        p228o00oOo.o0000OO0.OooO0o(iArr10, iArr10);
        o000OOO.OooO0OO.OooO0o0(iArr4, iArr10, iArr5);
        p228o00oOo.o0000OO0.OooO0oo(o000OOO.OooO0OO.OooO00o(iArr7, iArr7, iArr10), iArr10);
        OooO0O0 oooO0O6 = new OooO0O0(iArr8);
        p228o00oOo.o0000OO0.OooO(iArr6, iArr8);
        int[] iArr11 = oooO0O6.f52565OooO0Oo;
        p228o00oOo.o0000OO0.OooOO0O(iArr11, iArr10, iArr11);
        OooO0O0 oooO0O7 = new OooO0O0(iArr10);
        p228o00oOo.o0000OO0.OooOO0O(iArr7, oooO0O6.f52565OooO0Oo, iArr10);
        int[] iArr12 = oooO0O7.f52565OooO0Oo;
        long j = ((long) iArr6[0]) & 4294967295L;
        long j2 = ((long) iArr6[1]) & 4294967295L;
        long j3 = ((long) iArr6[2]) & 4294967295L;
        long j4 = ((long) iArr6[3]) & 4294967295L;
        long j5 = 0;
        int i = 0;
        while (i < 4) {
            long j6 = ((long) iArr12[i]) & 4294967295L;
            int i2 = i + 0;
            long j7 = j;
            long j8 = (j6 * j) + (((long) iArr5[i2]) & 4294967295L) + 0;
            iArr5[i2] = (int) j8;
            int i3 = i + 1;
            long j9 = j2;
            long j10 = (j6 * j2) + (((long) iArr5[i3]) & 4294967295L) + (j8 >>> 32);
            iArr5[i3] = (int) j10;
            int i4 = i + 2;
            long j11 = (j6 * j3) + (((long) iArr5[i4]) & 4294967295L) + (j10 >>> 32);
            iArr5[i4] = (int) j11;
            int i5 = i + 3;
            long j12 = (j6 * j4) + (((long) iArr5[i5]) & 4294967295L) + (j11 >>> 32);
            iArr5[i5] = (int) j12;
            int i6 = i + 4;
            long j13 = j5 + (((long) iArr5[i6]) & 4294967295L) + (j12 >>> 32);
            iArr5[i6] = (int) j13;
            j5 = j13 >>> 32;
            iArr12 = iArr12;
            zOooO0oo2 = zOooO0oo2;
            j = j7;
            i = i3;
            j2 = j9;
            j3 = j3;
        }
        boolean z = zOooO0oo2;
        if (((int) j5) != 0 || (iArr5[7] == -4 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr5, p228o00oOo.o0000OO0.f33889OooO0OO))) {
            p399o0Oo00oo.o00000OO.OooO0Oo(8, p228o00oOo.o0000OO0.f33890OooO0Oo, iArr5);
        }
        p228o00oOo.o0000OO0.OooO0oO(iArr5, oooO0O7.f52565OooO0Oo);
        OooO0O0 oooO0O8 = new OooO0O0(iArr9);
        if (!zOooO0oo) {
            p228o00oOo.o0000OO0.OooO0o0(iArr9, oooO0O4.f52565OooO0Oo, iArr9);
        }
        if (!z) {
            int[] iArr13 = oooO0O8.f52565OooO0Oo;
            p228o00oOo.o0000OO0.OooO0o0(iArr13, oooO0O5.f52565OooO0Oo, iArr13);
        }
        return new OooO0OO(oooOO0O, oooO0O6, oooO0O7, new p696oO0OO0oo.OooOOO0[]{oooO0O8}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new OooO0OO(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new OooO0OO(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        OooO0O0 oooO0O0 = (OooO0O0) this.f52788OooO0OO;
        if (oooO0O0.OooO()) {
            return oooOO0O.OooO();
        }
        OooO0O0 oooO0O1 = (OooO0O0) this.f52787OooO0O0;
        OooO0O0 oooO0O2 = (OooO0O0) this.f52789OooO0Oo[0];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        p228o00oOo.o0000OO0.OooO(oooO0O0.f52565OooO0Oo, iArr3);
        int[] iArr4 = new int[4];
        p228o00oOo.o0000OO0.OooO(iArr3, iArr4);
        boolean zOooO0oo = oooO0O2.OooO0oo();
        int[] iArr5 = oooO0O2.f52565OooO0Oo;
        if (!zOooO0oo) {
            p228o00oOo.o0000OO0.OooO(iArr5, iArr2);
            iArr5 = iArr2;
        }
        p228o00oOo.o0000OO0.OooOO0O(oooO0O1.f52565OooO0Oo, iArr5, iArr);
        p228o00oOo.o0000OO0.OooO00o(oooO0O1.f52565OooO0Oo, iArr5, iArr2);
        p228o00oOo.o0000OO0.OooO0o0(iArr2, iArr, iArr2);
        p228o00oOo.o0000OO0.OooO0oo(o000OOO.OooO0OO.OooO00o(iArr2, iArr2, iArr2), iArr2);
        p228o00oOo.o0000OO0.OooO0o0(iArr3, oooO0O1.f52565OooO0Oo, iArr3);
        p228o00oOo.o0000OO0.OooO0oo(p399o0Oo00oo.o00000OO.OooOOoo(4, iArr3), iArr3);
        p228o00oOo.o0000OO0.OooO0oo(p399o0Oo00oo.o00000OO.OooOo00(4, iArr4, iArr), iArr);
        OooO0O0 oooO0O3 = new OooO0O0(iArr4);
        p228o00oOo.o0000OO0.OooO(iArr2, iArr4);
        int[] iArr6 = oooO0O3.f52565OooO0Oo;
        p228o00oOo.o0000OO0.OooOO0O(iArr6, iArr3, iArr6);
        int[] iArr7 = oooO0O3.f52565OooO0Oo;
        p228o00oOo.o0000OO0.OooOO0O(iArr7, iArr3, iArr7);
        OooO0O0 oooO0O4 = new OooO0O0(iArr3);
        p228o00oOo.o0000OO0.OooOO0O(iArr3, oooO0O3.f52565OooO0Oo, iArr3);
        int[] iArr8 = oooO0O4.f52565OooO0Oo;
        p228o00oOo.o0000OO0.OooO0o0(iArr8, iArr2, iArr8);
        int[] iArr9 = oooO0O4.f52565OooO0Oo;
        p228o00oOo.o0000OO0.OooOO0O(iArr9, iArr, iArr9);
        OooO0O0 oooO0O5 = new OooO0O0(iArr2);
        if (p399o0Oo00oo.o00000OO.OooOOo(4, oooO0O0.f52565OooO0Oo, 0, iArr2) != 0 || (iArr2[3] == -3 && o000OOO.OooO0OO.OooO0OO(iArr2, p228o00oOo.o0000OO0.f33888OooO0O0))) {
            p228o00oOo.o0000OO0.OooO0O0(iArr2);
        }
        if (!zOooO0oo) {
            int[] iArr10 = oooO0O5.f52565OooO0Oo;
            p228o00oOo.o0000OO0.OooO0o0(iArr10, oooO0O2.f52565OooO0Oo, iArr10);
        }
        return new OooO0OO(oooOO0O, oooO0O3, oooO0O4, new p696oO0OO0oo.OooOOO0[]{oooO0O5}, this.f52790OooO0o0);
    }
}
