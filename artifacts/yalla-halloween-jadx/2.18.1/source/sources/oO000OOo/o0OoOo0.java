package oO000OOo;

import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends oO0OO0oo.OooOo00.OooO0O0 {
    public o0OoOo0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o0OoOo0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        o000oOoO o000oooo2;
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
        o000oOoO o000oooo3 = (o000oOoO) this.f52787OooO0O0;
        o000oOoO o000oooo4 = (o000oOoO) this.f52788OooO0OO;
        o000oOoO o000oooo5 = (o000oOoO) oooOo00.f52787OooO0O0;
        o000oOoO o000oooo6 = (o000oOoO) oooOo00.OooO0oo();
        o000oOoO o000oooo7 = (o000oOoO) this.f52789OooO0Oo[0];
        o000oOoO o000oooo8 = (o000oOoO) oooOo00.OooO();
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zOooO0oo = o000oooo7.OooO0oo();
        if (zOooO0oo) {
            iArr = o000oooo5.f52618OooO0Oo;
            iArr2 = o000oooo6.f52618OooO0Oo;
        } else {
            Oooo0.OooO0o0(o000oooo7.f52618OooO0Oo, iArr7);
            Oooo0.OooO00o(iArr7, o000oooo5.f52618OooO0Oo, iArr6);
            Oooo0.OooO00o(iArr7, o000oooo7.f52618OooO0Oo, iArr7);
            Oooo0.OooO00o(iArr7, o000oooo6.f52618OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o000oooo8.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o000oooo3.f52618OooO0Oo;
            iArr4 = o000oooo4.f52618OooO0Oo;
        } else {
            Oooo0.OooO0o0(o000oooo8.f52618OooO0Oo, iArr8);
            Oooo0.OooO00o(iArr8, o000oooo3.f52618OooO0Oo, iArr5);
            Oooo0.OooO00o(iArr8, o000oooo8.f52618OooO0Oo, iArr8);
            Oooo0.OooO00o(iArr8, o000oooo4.f52618OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[6];
        Oooo0.OooO0oO(iArr3, iArr, iArr9);
        Oooo0.OooO0oO(iArr4, iArr2, iArr6);
        if (oO00O0o0.OooOOo0(iArr9)) {
            return oO00O0o0.OooOOo0(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        Oooo0.OooO0o0(iArr9, iArr7);
        int[] iArr10 = new int[6];
        Oooo0.OooO00o(iArr7, iArr9, iArr10);
        Oooo0.OooO00o(iArr7, iArr3, iArr7);
        Oooo0.OooO0O0(iArr10, iArr10);
        oO00O0o0.OooOOoo(iArr4, iArr10, iArr5);
        Oooo0.OooO0Oo(oO00O0o0.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        o000oOoO o000oooo9 = new o000oOoO(iArr8);
        Oooo0.OooO0o0(iArr6, iArr8);
        int[] iArr11 = o000oooo9.f52618OooO0Oo;
        Oooo0.OooO0oO(iArr11, iArr10, iArr11);
        o000oOoO o000oooo10 = new o000oOoO(iArr10);
        Oooo0.OooO0oO(iArr7, o000oooo9.f52618OooO0Oo, iArr10);
        if (oO00O0o0.OooOo00(o000oooo10.f52618OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[11] == -1) {
                i = 12;
                if (p399o0Oo00oo.o00000OO.OooOO0O(12, iArr5, Oooo0.f52580OooO0O0)) {
                }
            }
            Oooo0.OooO0OO(iArr5, o000oooo10.f52618OooO0Oo);
            o000oooo2 = new o000oOoO(iArr9);
            if (!zOooO0oo) {
                Oooo0.OooO00o(iArr9, o000oooo7.f52618OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = o000oooo2.f52618OooO0Oo;
                Oooo0.OooO00o(iArr12, o000oooo8.f52618OooO0Oo, iArr12);
            }
            return new o0OoOo0(oooOO0O, o000oooo9, o000oooo10, new p696oO0OO0oo.OooOOO0[]{o000oooo2}, this.f52790OooO0o0);
        }
        i = 12;
        if (p399o0Oo00oo.o00000OO.OooO0Oo(8, Oooo0.f52581OooO0OO, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(i, iArr5, 8);
        }
        Oooo0.OooO0OO(iArr5, o000oooo10.f52618OooO0Oo);
        o000oooo2 = new o000oOoO(iArr9);
        if (!zOooO0oo) {
            Oooo0.OooO00o(iArr9, o000oooo7.f52618OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o000oooo2.f52618OooO0Oo;
            Oooo0.OooO00o(iArr13, o000oooo8.f52618OooO0Oo, iArr13);
        }
        return new o0OoOo0(oooOO0O, o000oooo9, o000oooo10, new p696oO0OO0oo.OooOOO0[]{o000oooo2}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o0OoOo0(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o0OoOo0(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o000oOoO o000oooo2 = (o000oOoO) this.f52788OooO0OO;
        if (o000oooo2.OooO()) {
            return oooOO0O.OooO();
        }
        o000oOoO o000oooo3 = (o000oOoO) this.f52787OooO0O0;
        o000oOoO o000oooo4 = (o000oOoO) this.f52789OooO0Oo[0];
        int[] iArr = new int[6];
        Oooo0.OooO0o0(o000oooo2.f52618OooO0Oo, iArr);
        int[] iArr2 = new int[6];
        Oooo0.OooO0o0(iArr, iArr2);
        int[] iArr3 = new int[6];
        Oooo0.OooO0o0(o000oooo3.f52618OooO0Oo, iArr3);
        Oooo0.OooO0Oo(oO00O0o0.OooO0O0(iArr3, iArr3, iArr3), iArr3);
        Oooo0.OooO00o(iArr, o000oooo3.f52618OooO0Oo, iArr);
        Oooo0.OooO0Oo(p399o0Oo00oo.o00000OO.OooOOoo(6, iArr), iArr);
        int[] iArr4 = new int[6];
        Oooo0.OooO0Oo(p399o0Oo00oo.o00000OO.OooOo00(6, iArr2, iArr4), iArr4);
        o000oOoO o000oooo5 = new o000oOoO(iArr2);
        Oooo0.OooO0o0(iArr3, iArr2);
        int[] iArr5 = o000oooo5.f52618OooO0Oo;
        Oooo0.OooO0oO(iArr5, iArr, iArr5);
        int[] iArr6 = o000oooo5.f52618OooO0Oo;
        Oooo0.OooO0oO(iArr6, iArr, iArr6);
        o000oOoO o000oooo6 = new o000oOoO(iArr);
        Oooo0.OooO0oO(iArr, o000oooo5.f52618OooO0Oo, iArr);
        int[] iArr7 = o000oooo6.f52618OooO0Oo;
        Oooo0.OooO00o(iArr7, iArr3, iArr7);
        int[] iArr8 = o000oooo6.f52618OooO0Oo;
        Oooo0.OooO0oO(iArr8, iArr4, iArr8);
        o000oOoO o000oooo7 = new o000oOoO(iArr3);
        if (p399o0Oo00oo.o00000OO.OooOOo(6, o000oooo2.f52618OooO0Oo, 0, iArr3) != 0 || (iArr3[5] == -1 && oO00O0o0.OooOOO(iArr3, Oooo0.f52579OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(6, 4553, iArr3);
        }
        if (!o000oooo4.OooO0oo()) {
            int[] iArr9 = o000oooo7.f52618OooO0Oo;
            Oooo0.OooO00o(iArr9, o000oooo4.f52618OooO0Oo, iArr9);
        }
        return new o0OoOo0(oooOO0O, o000oooo5, o000oooo6, new p696oO0OO0oo.OooOOO0[]{o000oooo7}, this.f52790OooO0o0);
    }
}
