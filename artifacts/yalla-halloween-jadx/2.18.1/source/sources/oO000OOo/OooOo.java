package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends oO0OO0oo.OooOo00.OooO0O0 {
    public OooOo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public OooOo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
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
        OooOo00 oooOo01 = (OooOo00) this.f52787OooO0O0;
        OooOo00 oooOo02 = (OooOo00) this.f52788OooO0OO;
        OooOo00 oooOo03 = (OooOo00) oooOo00.f52787OooO0O0;
        OooOo00 oooOo04 = (OooOo00) oooOo00.OooO0oo();
        OooOo00 oooOo05 = (OooOo00) this.f52789OooO0Oo[0];
        OooOo00 oooOo06 = (OooOo00) oooOo00.OooO();
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zOooO0oo = oooOo05.OooO0oo();
        if (zOooO0oo) {
            iArr = oooOo03.f52578OooO0Oo;
            iArr2 = oooOo04.f52578OooO0Oo;
        } else {
            OooOOOO.OooO0oO(oooOo05.f52578OooO0Oo, iArr7);
            OooOOOO.OooO0O0(iArr7, oooOo03.f52578OooO0Oo, iArr6);
            OooOOOO.OooO0O0(iArr7, oooOo05.f52578OooO0Oo, iArr7);
            OooOOOO.OooO0O0(iArr7, oooOo04.f52578OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = oooOo06.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = oooOo01.f52578OooO0Oo;
            iArr4 = oooOo02.f52578OooO0Oo;
        } else {
            OooOOOO.OooO0oO(oooOo06.f52578OooO0Oo, iArr8);
            OooOOOO.OooO0O0(iArr8, oooOo01.f52578OooO0Oo, iArr5);
            OooOOOO.OooO0O0(iArr8, oooOo06.f52578OooO0Oo, iArr8);
            OooOOOO.OooO0O0(iArr8, oooOo02.f52578OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[5];
        OooOOOO.OooO(iArr3, iArr, iArr9);
        OooOOOO.OooO(iArr4, iArr2, iArr6);
        if (p697oO0OOo0o.Oooo0.OooO0oO(iArr9)) {
            return p697oO0OOo0o.Oooo0.OooO0oO(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        OooOOOO.OooO0oO(iArr9, iArr7);
        int[] iArr10 = new int[5];
        OooOOOO.OooO0O0(iArr7, iArr9, iArr10);
        OooOOOO.OooO0O0(iArr7, iArr3, iArr7);
        OooOOOO.OooO0Oo(iArr10, iArr10);
        p697oO0OOo0o.Oooo0.OooO0oo(iArr4, iArr10, iArr5);
        OooOOOO.OooO0o(p697oO0OOo0o.Oooo0.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        OooOo00 oooOo07 = new OooOo00(iArr8);
        OooOOOO.OooO0oO(iArr6, iArr8);
        int[] iArr11 = oooOo07.f52578OooO0Oo;
        OooOOOO.OooO(iArr11, iArr10, iArr11);
        OooOo00 oooOo08 = new OooOo00(iArr10);
        OooOOOO.OooO(iArr7, oooOo07.f52578OooO0Oo, iArr10);
        OooOOOO.OooO0OO(oooOo08.f52578OooO0Oo, iArr6, iArr5);
        OooOOOO.OooO0o0(iArr5, oooOo08.f52578OooO0Oo);
        OooOo00 oooOo09 = new OooOo00(iArr9);
        if (!zOooO0oo) {
            OooOOOO.OooO0O0(iArr9, oooOo05.f52578OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr12 = oooOo09.f52578OooO0Oo;
            OooOOOO.OooO0O0(iArr12, oooOo06.f52578OooO0Oo, iArr12);
        }
        return new OooOo(oooOO0O, oooOo07, oooOo08, new p696oO0OO0oo.OooOOO0[]{oooOo09}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new OooOo(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new OooOo(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        OooOo00 oooOo00 = (OooOo00) this.f52788OooO0OO;
        if (oooOo00.OooO()) {
            return oooOO0O.OooO();
        }
        OooOo00 oooOo01 = (OooOo00) this.f52787OooO0O0;
        OooOo00 oooOo02 = (OooOo00) this.f52789OooO0Oo[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        OooOOOO.OooO0oO(oooOo00.f52578OooO0Oo, iArr3);
        int[] iArr4 = new int[5];
        OooOOOO.OooO0oO(iArr3, iArr4);
        boolean zOooO0oo = oooOo02.OooO0oo();
        int[] iArr5 = oooOo02.f52578OooO0Oo;
        if (!zOooO0oo) {
            OooOOOO.OooO0oO(iArr5, iArr2);
            iArr5 = iArr2;
        }
        OooOOOO.OooO(oooOo01.f52578OooO0Oo, iArr5, iArr);
        OooOOOO.OooO00o(oooOo01.f52578OooO0Oo, iArr5, iArr2);
        OooOOOO.OooO0O0(iArr2, iArr, iArr2);
        OooOOOO.OooO0o(p697oO0OOo0o.Oooo0.OooO0O0(iArr2, iArr2, iArr2), iArr2);
        OooOOOO.OooO0O0(iArr3, oooOo01.f52578OooO0Oo, iArr3);
        OooOOOO.OooO0o(p399o0Oo00oo.o00000OO.OooOOoo(5, iArr3), iArr3);
        OooOOOO.OooO0o(p399o0Oo00oo.o00000OO.OooOo00(5, iArr4, iArr), iArr);
        OooOo00 oooOo03 = new OooOo00(iArr4);
        OooOOOO.OooO0oO(iArr2, iArr4);
        int[] iArr6 = oooOo03.f52578OooO0Oo;
        OooOOOO.OooO(iArr6, iArr3, iArr6);
        int[] iArr7 = oooOo03.f52578OooO0Oo;
        OooOOOO.OooO(iArr7, iArr3, iArr7);
        OooOo00 oooOo04 = new OooOo00(iArr3);
        OooOOOO.OooO(iArr3, oooOo03.f52578OooO0Oo, iArr3);
        int[] iArr8 = oooOo04.f52578OooO0Oo;
        OooOOOO.OooO0O0(iArr8, iArr2, iArr8);
        int[] iArr9 = oooOo04.f52578OooO0Oo;
        OooOOOO.OooO(iArr9, iArr, iArr9);
        OooOo00 oooOo05 = new OooOo00(iArr2);
        OooOOOO.OooOO0(oooOo00.f52578OooO0Oo, iArr2);
        if (!zOooO0oo) {
            int[] iArr10 = oooOo05.f52578OooO0Oo;
            OooOOOO.OooO0O0(iArr10, oooOo02.f52578OooO0Oo, iArr10);
        }
        return new OooOo(oooOO0O, oooOo03, oooOo04, new p696oO0OO0oo.OooOOO0[]{oooOo05}, this.f52790OooO0o0);
    }
}
