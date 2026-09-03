package oO0OOooO;

import p399o0Oo00oo.o00000OO;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOOO0;
import p696oO0OO0oo.OooOo00;
import p697oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends OooOo00.OooO0O0 {
    public OooO0o(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public OooO0o(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    @Override // p696oO0OO0oo.OooOo00
    public final OooOOO0 OooO() {
        return super.OooO();
    }

    @Override // p696oO0OO0oo.OooOo00
    public final OooOo00 OooO00o(OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        char c;
        if (OooOO0()) {
            return oooOo00;
        }
        if (oooOo00.OooOO0()) {
            return this;
        }
        if (this == oooOo00) {
            return OooOOo();
        }
        OooOO0O oooOO0O = this.f52786OooO00o;
        OooO0OO oooO0OO = (OooO0OO) this.f52787OooO0O0;
        OooO0OO oooO0OO2 = (OooO0OO) this.f52788OooO0OO;
        OooO0OO oooO0OO3 = (OooO0OO) this.f52789OooO0Oo[0];
        OooO0OO oooO0OO4 = (OooO0OO) oooOo00.f52787OooO0O0;
        OooO0OO oooO0OO5 = (OooO0OO) oooOo00.OooO0oo();
        OooO0OO oooO0OO6 = (OooO0OO) oooOo00.OooO();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zOooO0oo = oooO0OO3.OooO0oo();
        if (zOooO0oo) {
            iArr = oooO0OO4.f52861OooO0Oo;
            iArr2 = oooO0OO5.f52861OooO0Oo;
        } else {
            OooO0O0.OooO0Oo(oooO0OO3.f52861OooO0Oo, iArr7);
            OooO0O0.OooO00o(iArr7, oooO0OO4.f52861OooO0Oo, iArr6);
            OooO0O0.OooO00o(iArr7, oooO0OO3.f52861OooO0Oo, iArr7);
            OooO0O0.OooO00o(iArr7, oooO0OO5.f52861OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = oooO0OO6.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = oooO0OO.f52861OooO0Oo;
            iArr4 = oooO0OO2.f52861OooO0Oo;
        } else {
            OooO0O0.OooO0Oo(oooO0OO6.f52861OooO0Oo, iArr8);
            OooO0O0.OooO00o(iArr8, oooO0OO.f52861OooO0Oo, iArr5);
            OooO0O0.OooO00o(iArr8, oooO0OO6.f52861OooO0Oo, iArr8);
            OooO0O0.OooO00o(iArr8, oooO0OO2.f52861OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        OooO0O0.OooO0oO(iArr3, iArr, iArr9);
        OooO0O0.OooO0oO(iArr4, iArr2, iArr6);
        if (o0OoOo0.OooOOO0(iArr9)) {
            return o0OoOo0.OooOOO0(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        int[] iArr10 = new int[8];
        OooO0O0.OooO0Oo(iArr9, iArr10);
        int[] iArr11 = new int[8];
        OooO0O0.OooO00o(iArr10, iArr9, iArr11);
        OooO0O0.OooO00o(iArr10, iArr3, iArr7);
        if (o0OoOo0.OooOOO0(iArr11)) {
            o0OoOo0.OooOo0o(iArr11);
        } else {
            o0OoOo0.OooOOoo(OooO0O0.f52857OooO00o, iArr11, iArr11);
        }
        o0OoOo0.OooOOOO(iArr4, iArr11, iArr5);
        OooO0O0.OooO0OO(o0OoOo0.OooO0O0(iArr7, iArr7, iArr11), iArr11);
        OooO0OO oooO0OO7 = new OooO0OO(iArr8);
        OooO0O0.OooO0Oo(iArr6, iArr8);
        int[] iArr12 = oooO0OO7.f52861OooO0Oo;
        OooO0O0.OooO0oO(iArr12, iArr11, iArr12);
        OooO0OO oooO0OO8 = new OooO0OO(iArr11);
        OooO0O0.OooO0oO(iArr7, oooO0OO7.f52861OooO0Oo, iArr11);
        o0OoOo0.OooOOOo(oooO0OO8.f52861OooO0Oo, iArr6, iArr5);
        int[] iArr13 = OooO0O0.f52858OooO0O0;
        if (o00000OO.OooOO0O(16, iArr5, iArr13)) {
            long j = (((long) iArr5[0]) & 4294967295L) - (((long) iArr13[0]) & 4294967295L);
            iArr5[0] = (int) j;
            long jOooO0oo = j >> 32;
            if (jOooO0oo != 0) {
                c = '\b';
                jOooO0oo = o00000OO.OooO0oo(8, iArr5, 1);
            } else {
                c = '\b';
            }
            long j2 = (((long) iArr5[c]) & 4294967295L) + 19 + jOooO0oo;
            iArr5[c] = (int) j2;
            long jOooOOO = j2 >> 32;
            if (jOooOOO != 0) {
                jOooOOO = o00000OO.OooOOO(15, iArr5, 9);
            }
            iArr5[15] = (int) (((((long) iArr5[15]) & 4294967295L) - (4294967295L & ((long) (iArr13[15] + 1)))) + jOooOOO);
        }
        OooO0O0.OooO0O0(iArr5, oooO0OO8.f52861OooO0Oo);
        OooO0OO oooO0OO9 = new OooO0OO(iArr9);
        if (!zOooO0oo) {
            OooO0O0.OooO00o(iArr9, oooO0OO3.f52861OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr14 = oooO0OO9.f52861OooO0Oo;
            OooO0O0.OooO00o(iArr14, oooO0OO6.f52861OooO0Oo, iArr14);
        }
        if (!zOooO0oo || !zOooO0oo2) {
            iArr10 = null;
        }
        return new OooO0o(oooOO0O, oooO0OO7, oooO0OO8, new OooOOO0[]{oooO0OO9, OooOOoo(oooO0OO9, iArr10)}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final OooOo00 OooO0OO() {
        return new OooO0o(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final OooOo00 OooOOO0() {
        return OooOO0() ? this : new OooO0o(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        OooOO0O oooOO0O = this.f52786OooO00o;
        if (this.f52788OooO0OO.OooO()) {
            return oooOO0O.OooO();
        }
        OooO0OO oooO0OO = (OooO0OO) this.f52787OooO0O0;
        OooO0OO oooO0OO2 = (OooO0OO) this.f52788OooO0OO;
        OooO0OO oooO0OO3 = (OooO0OO) this.f52789OooO0Oo[0];
        OooO0OO oooO0OOOooOo00 = OooOo00();
        int[] iArr = {(int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j};
        OooO0O0.OooO0Oo(oooO0OO.f52861OooO0Oo, iArr);
        int iOooO0O0 = o0OoOo0.OooO0O0(iArr, iArr, iArr);
        int[] iArr2 = oooO0OOOooOo00.f52861OooO0Oo;
        long j = (((long) iArr2[0]) & 4294967295L) + (((long) iArr[0]) & 4294967295L) + 0;
        long j2 = (((long) iArr2[1]) & 4294967295L) + (((long) iArr[1]) & 4294967295L) + (j >>> 32);
        long j3 = (((long) iArr2[2]) & 4294967295L) + (((long) iArr[2]) & 4294967295L) + (j2 >>> 32);
        long j4 = (((long) iArr2[3]) & 4294967295L) + (((long) iArr[3]) & 4294967295L) + (j3 >>> 32);
        long j5 = (((long) iArr2[4]) & 4294967295L) + (((long) iArr[4]) & 4294967295L) + (j4 >>> 32);
        long j6 = (((long) iArr2[5]) & 4294967295L) + (((long) iArr[5]) & 4294967295L) + (j5 >>> 32);
        long j7 = (((long) iArr2[6]) & 4294967295L) + (((long) iArr[6]) & 4294967295L) + (j6 >>> 32);
        long j8 = (((long) iArr2[7]) & 4294967295L) + (((long) iArr[7]) & 4294967295L) + (j7 >>> 32);
        OooO0O0.OooO0OO(iOooO0O0 + ((int) (j8 >>> 32)), iArr);
        int[] iArr3 = new int[8];
        OooO0O0.OooO0oo(oooO0OO2.f52861OooO0Oo, iArr3);
        int[] iArr4 = new int[8];
        OooO0O0.OooO00o(iArr3, oooO0OO2.f52861OooO0Oo, iArr4);
        int[] iArr5 = new int[8];
        OooO0O0.OooO00o(iArr4, oooO0OO.f52861OooO0Oo, iArr5);
        OooO0O0.OooO0oo(iArr5, iArr5);
        int[] iArr6 = new int[8];
        OooO0O0.OooO0Oo(iArr4, iArr6);
        OooO0O0.OooO0oo(iArr6, iArr6);
        OooO0OO oooO0OO4 = new OooO0OO(iArr4);
        OooO0O0.OooO0Oo(iArr, iArr4);
        int[] iArr7 = oooO0OO4.f52861OooO0Oo;
        OooO0O0.OooO0oO(iArr7, iArr5, iArr7);
        int[] iArr8 = oooO0OO4.f52861OooO0Oo;
        OooO0O0.OooO0oO(iArr8, iArr5, iArr8);
        OooO0OO oooO0OO5 = new OooO0OO(iArr5);
        OooO0O0.OooO0oO(iArr5, oooO0OO4.f52861OooO0Oo, iArr5);
        int[] iArr9 = oooO0OO5.f52861OooO0Oo;
        OooO0O0.OooO00o(iArr9, iArr, iArr9);
        int[] iArr10 = oooO0OO5.f52861OooO0Oo;
        OooO0O0.OooO0oO(iArr10, iArr6, iArr10);
        OooO0OO oooO0OO6 = new OooO0OO(iArr3);
        if (!o0OoOo0.OooOO0O(oooO0OO3.f52861OooO0Oo)) {
            int[] iArr11 = oooO0OO6.f52861OooO0Oo;
            OooO0O0.OooO00o(iArr11, oooO0OO3.f52861OooO0Oo, iArr11);
        }
        OooO0OO oooO0OO7 = new OooO0OO(iArr6);
        OooO0O0.OooO00o(iArr6, oooO0OOOooOo00.f52861OooO0Oo, iArr6);
        int[] iArr12 = oooO0OO7.f52861OooO0Oo;
        OooO0O0.OooO0oo(iArr12, iArr12);
        return new OooO0o(this.f52786OooO00o, oooO0OO4, oooO0OO5, new OooOOO0[]{oooO0OO6, oooO0OO7}, this.f52790OooO0o0);
    }

    public final OooO0OO OooOOoo(OooO0OO oooO0OO, int[] iArr) {
        OooO0OO oooO0OO2 = (OooO0OO) this.f52786OooO00o.f52760OooO0O0;
        if (oooO0OO.OooO0oo()) {
            return oooO0OO2;
        }
        OooO0OO oooO0OO3 = new OooO0OO();
        if (iArr == null) {
            iArr = oooO0OO3.f52861OooO0Oo;
            OooO0O0.OooO0Oo(oooO0OO.f52861OooO0Oo, iArr);
        }
        OooO0O0.OooO0Oo(iArr, oooO0OO3.f52861OooO0Oo);
        int[] iArr2 = oooO0OO3.f52861OooO0Oo;
        OooO0O0.OooO00o(iArr2, oooO0OO2.f52861OooO0Oo, iArr2);
        return oooO0OO3;
    }

    public final OooO0OO OooOo00() {
        OooOOO0[] oooOOO0Arr = this.f52789OooO0Oo;
        OooO0OO oooO0OO = (OooO0OO) oooOOO0Arr[1];
        if (oooO0OO != null) {
            return oooO0OO;
        }
        OooO0OO oooO0OOOooOOoo = OooOOoo((OooO0OO) oooOOO0Arr[0], null);
        oooOOO0Arr[1] = oooO0OOOooOOoo;
        return oooO0OOOooOOoo;
    }
}
