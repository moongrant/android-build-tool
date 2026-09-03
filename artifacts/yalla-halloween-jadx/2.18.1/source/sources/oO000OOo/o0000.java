package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends oO0OO0oo.OooOo00.OooO0O0 {
    public o0000(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o0000(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        o0000Ooo o0000ooo;
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
        o0000Ooo o0000ooo2 = (o0000Ooo) this.f52787OooO0O0;
        o0000Ooo o0000ooo3 = (o0000Ooo) this.f52788OooO0OO;
        o0000Ooo o0000ooo4 = (o0000Ooo) oooOo00.f52787OooO0O0;
        o0000Ooo o0000ooo5 = (o0000Ooo) oooOo00.OooO0oo();
        o0000Ooo o0000ooo6 = (o0000Ooo) this.f52789OooO0Oo[0];
        o0000Ooo o0000ooo7 = (o0000Ooo) oooOo00.OooO();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zOooO0oo = o0000ooo6.OooO0oo();
        if (zOooO0oo) {
            iArr = o0000ooo4.f52603OooO0Oo;
            iArr2 = o0000ooo5.f52603OooO0Oo;
        } else {
            o00000OO.OooO0o(o0000ooo6.f52603OooO0Oo, iArr7);
            o00000OO.OooO0OO(iArr7, o0000ooo4.f52603OooO0Oo, iArr6);
            o00000OO.OooO0OO(iArr7, o0000ooo6.f52603OooO0Oo, iArr7);
            o00000OO.OooO0OO(iArr7, o0000ooo5.f52603OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o0000ooo7.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o0000ooo2.f52603OooO0Oo;
            iArr4 = o0000ooo3.f52603OooO0Oo;
        } else {
            o00000OO.OooO0o(o0000ooo7.f52603OooO0Oo, iArr8);
            o00000OO.OooO0OO(iArr8, o0000ooo2.f52603OooO0Oo, iArr5);
            o00000OO.OooO0OO(iArr8, o0000ooo7.f52603OooO0Oo, iArr8);
            o00000OO.OooO0OO(iArr8, o0000ooo3.f52603OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        o00000OO.OooO0oo(iArr3, iArr, iArr9);
        o00000OO.OooO0oo(iArr4, iArr2, iArr6);
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr9)) {
            return p697oO0OOo0o.o0OoOo0.OooOOO0(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        o00000OO.OooO0o(iArr9, iArr7);
        int[] iArr10 = new int[8];
        o00000OO.OooO0OO(iArr7, iArr9, iArr10);
        o00000OO.OooO0OO(iArr7, iArr3, iArr7);
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr10)) {
            p697oO0OOo0o.o0OoOo0.OooOo0o(iArr10);
        } else {
            p697oO0OOo0o.o0OoOo0.OooOOoo(o00000OO.f52594OooO00o, iArr10, iArr10);
        }
        p697oO0OOo0o.o0OoOo0.OooOOOO(iArr4, iArr10, iArr5);
        o00000OO.OooO0o0(p697oO0OOo0o.o0OoOo0.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        o0000Ooo o0000ooo8 = new o0000Ooo(iArr8);
        o00000OO.OooO0o(iArr6, iArr8);
        int[] iArr11 = o0000ooo8.f52603OooO0Oo;
        o00000OO.OooO0oo(iArr11, iArr10, iArr11);
        o0000Ooo o0000ooo9 = new o0000Ooo(iArr10);
        o00000OO.OooO0oo(iArr7, o0000ooo8.f52603OooO0Oo, iArr10);
        if (p697oO0OOo0o.o0OoOo0.OooOOOo(o0000ooo9.f52603OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[15] == -1) {
                i = 16;
                if (p399o0Oo00oo.o00000OO.OooOO0O(16, iArr5, o00000OO.f52595OooO0O0)) {
                }
            }
            o00000OO.OooO0Oo(iArr5, o0000ooo9.f52603OooO0Oo);
            o0000ooo = new o0000Ooo(iArr9);
            if (!zOooO0oo) {
                o00000OO.OooO0OO(iArr9, o0000ooo6.f52603OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = o0000ooo.f52603OooO0Oo;
                o00000OO.OooO0OO(iArr12, o0000ooo7.f52603OooO0Oo, iArr12);
            }
            return new o0000(oooOO0O, o0000ooo8, o0000ooo9, new p696oO0OO0oo.OooOOO0[]{o0000ooo}, this.f52790OooO0o0);
        }
        i = 16;
        p399o0Oo00oo.o00000OO.OooOo(i, o00000OO.f52595OooO0O0, iArr5);
        o00000OO.OooO0Oo(iArr5, o0000ooo9.f52603OooO0Oo);
        o0000ooo = new o0000Ooo(iArr9);
        if (!zOooO0oo) {
            o00000OO.OooO0OO(iArr9, o0000ooo6.f52603OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o0000ooo.f52603OooO0Oo;
            o00000OO.OooO0OO(iArr13, o0000ooo7.f52603OooO0Oo, iArr13);
        }
        return new o0000(oooOO0O, o0000ooo8, o0000ooo9, new p696oO0OO0oo.OooOOO0[]{o0000ooo}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o0000(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o0000(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o0000Ooo o0000ooo = (o0000Ooo) this.f52788OooO0OO;
        if (o0000ooo.OooO()) {
            return oooOO0O.OooO();
        }
        o0000Ooo o0000ooo2 = (o0000Ooo) this.f52787OooO0O0;
        o0000Ooo o0000ooo3 = (o0000Ooo) this.f52789OooO0Oo[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        o00000OO.OooO0o(o0000ooo.f52603OooO0Oo, iArr3);
        int[] iArr4 = new int[8];
        o00000OO.OooO0o(iArr3, iArr4);
        boolean zOooO0oo = o0000ooo3.OooO0oo();
        int[] iArr5 = o0000ooo3.f52603OooO0Oo;
        if (!zOooO0oo) {
            o00000OO.OooO0o(iArr5, iArr2);
            iArr5 = iArr2;
        }
        o00000OO.OooO0oo(o0000ooo2.f52603OooO0Oo, iArr5, iArr);
        o00000OO.OooO00o(o0000ooo2.f52603OooO0Oo, iArr5, iArr2);
        o00000OO.OooO0OO(iArr2, iArr, iArr2);
        o00000OO.OooO0o0(p697oO0OOo0o.o0OoOo0.OooO0O0(iArr2, iArr2, iArr2), iArr2);
        o00000OO.OooO0OO(iArr3, o0000ooo2.f52603OooO0Oo, iArr3);
        o00000OO.OooO0o0(p399o0Oo00oo.o00000OO.OooOOoo(8, iArr3), iArr3);
        o00000OO.OooO0o0(p399o0Oo00oo.o00000OO.OooOo00(8, iArr4, iArr), iArr);
        o0000Ooo o0000ooo4 = new o0000Ooo(iArr4);
        o00000OO.OooO0o(iArr2, iArr4);
        int[] iArr6 = o0000ooo4.f52603OooO0Oo;
        o00000OO.OooO0oo(iArr6, iArr3, iArr6);
        int[] iArr7 = o0000ooo4.f52603OooO0Oo;
        o00000OO.OooO0oo(iArr7, iArr3, iArr7);
        o0000Ooo o0000ooo5 = new o0000Ooo(iArr3);
        o00000OO.OooO0oo(iArr3, o0000ooo4.f52603OooO0Oo, iArr3);
        int[] iArr8 = o0000ooo5.f52603OooO0Oo;
        o00000OO.OooO0OO(iArr8, iArr2, iArr8);
        int[] iArr9 = o0000ooo5.f52603OooO0Oo;
        o00000OO.OooO0oo(iArr9, iArr, iArr9);
        o0000Ooo o0000ooo6 = new o0000Ooo(iArr2);
        if (p399o0Oo00oo.o00000OO.OooOOo(8, o0000ooo.f52603OooO0Oo, 0, iArr2) != 0 || (iArr2[7] == -1 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr2, o00000OO.f52594OooO00o))) {
            o00000OO.OooO0O0(iArr2);
        }
        if (!zOooO0oo) {
            int[] iArr10 = o0000ooo6.f52603OooO0Oo;
            o00000OO.OooO0OO(iArr10, o0000ooo3.f52603OooO0Oo, iArr10);
        }
        return new o0000(oooOO0O, o0000ooo4, o0000ooo5, new p696oO0OO0oo.OooOOO0[]{o0000ooo6}, this.f52790OooO0o0);
    }
}
