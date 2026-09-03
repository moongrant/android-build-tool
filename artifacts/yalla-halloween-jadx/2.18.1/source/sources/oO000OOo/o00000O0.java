package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 extends oO0OO0oo.OooOo00.OooO0O0 {
    public o00000O0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o00000O0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        o00000 o00000Var;
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
        o00000 o00000Var2 = (o00000) this.f52787OooO0O0;
        o00000 o00000Var3 = (o00000) this.f52788OooO0OO;
        o00000 o00000Var4 = (o00000) oooOo00.f52787OooO0O0;
        o00000 o00000Var5 = (o00000) oooOo00.OooO0oo();
        o00000 o00000Var6 = (o00000) this.f52789OooO0Oo[0];
        o00000 o00000Var7 = (o00000) oooOo00.OooO();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zOooO0oo = o00000Var6.OooO0oo();
        if (zOooO0oo) {
            iArr = o00000Var4.f52586OooO0Oo;
            iArr2 = o00000Var5.f52586OooO0Oo;
        } else {
            o000000O.OooO0Oo(o00000Var6.f52586OooO0Oo, iArr7);
            o000000O.OooO00o(iArr7, o00000Var4.f52586OooO0Oo, iArr6);
            o000000O.OooO00o(iArr7, o00000Var6.f52586OooO0Oo, iArr7);
            o000000O.OooO00o(iArr7, o00000Var5.f52586OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o00000Var7.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o00000Var2.f52586OooO0Oo;
            iArr4 = o00000Var3.f52586OooO0Oo;
        } else {
            o000000O.OooO0Oo(o00000Var7.f52586OooO0Oo, iArr8);
            o000000O.OooO00o(iArr8, o00000Var2.f52586OooO0Oo, iArr5);
            o000000O.OooO00o(iArr8, o00000Var7.f52586OooO0Oo, iArr8);
            o000000O.OooO00o(iArr8, o00000Var3.f52586OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        o000000O.OooO0o(iArr3, iArr, iArr9);
        o000000O.OooO0o(iArr4, iArr2, iArr6);
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr9)) {
            return p697oO0OOo0o.o0OoOo0.OooOOO0(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        o000000O.OooO0Oo(iArr9, iArr7);
        int[] iArr10 = new int[8];
        o000000O.OooO00o(iArr7, iArr9, iArr10);
        o000000O.OooO00o(iArr7, iArr3, iArr7);
        if (p697oO0OOo0o.o0OoOo0.OooOOO0(iArr10)) {
            p697oO0OOo0o.o0OoOo0.OooOo0o(iArr10);
        } else {
            p697oO0OOo0o.o0OoOo0.OooOOoo(o000000O.f52589OooO00o, iArr10, iArr10);
        }
        p697oO0OOo0o.o0OoOo0.OooOOOO(iArr4, iArr10, iArr5);
        o000000O.OooO0OO(p697oO0OOo0o.o0OoOo0.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        o00000 o00000Var8 = new o00000(iArr8);
        o000000O.OooO0Oo(iArr6, iArr8);
        int[] iArr11 = o00000Var8.f52586OooO0Oo;
        o000000O.OooO0o(iArr11, iArr10, iArr11);
        o00000 o00000Var9 = new o00000(iArr10);
        o000000O.OooO0o(iArr7, o00000Var8.f52586OooO0Oo, iArr10);
        if (p697oO0OOo0o.o0OoOo0.OooOOOo(o00000Var9.f52586OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[15] == -1) {
                i = 16;
                if (p399o0Oo00oo.o00000OO.OooOO0O(16, iArr5, o000000O.f52590OooO0O0)) {
                }
            }
            o000000O.OooO0O0(iArr5, o00000Var9.f52586OooO0Oo);
            o00000Var = new o00000(iArr9);
            if (!zOooO0oo) {
                o000000O.OooO00o(iArr9, o00000Var6.f52586OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = o00000Var.f52586OooO0Oo;
                o000000O.OooO00o(iArr12, o00000Var7.f52586OooO0Oo, iArr12);
            }
            return new o00000O0(oooOO0O, o00000Var8, o00000Var9, new p696oO0OO0oo.OooOOO0[]{o00000Var}, this.f52790OooO0o0);
        }
        i = 16;
        if (p399o0Oo00oo.o00000OO.OooO0Oo(10, o000000O.f52591OooO0OO, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(i, iArr5, 10);
        }
        o000000O.OooO0O0(iArr5, o00000Var9.f52586OooO0Oo);
        o00000Var = new o00000(iArr9);
        if (!zOooO0oo) {
            o000000O.OooO00o(iArr9, o00000Var6.f52586OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o00000Var.f52586OooO0Oo;
            o000000O.OooO00o(iArr13, o00000Var7.f52586OooO0Oo, iArr13);
        }
        return new o00000O0(oooOO0O, o00000Var8, o00000Var9, new p696oO0OO0oo.OooOOO0[]{o00000Var}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o00000O0(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o00000O0(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o00000 o00000Var = (o00000) this.f52788OooO0OO;
        if (o00000Var.OooO()) {
            return oooOO0O.OooO();
        }
        o00000 o00000Var2 = (o00000) this.f52787OooO0O0;
        o00000 o00000Var3 = (o00000) this.f52789OooO0Oo[0];
        int[] iArr = new int[8];
        o000000O.OooO0Oo(o00000Var.f52586OooO0Oo, iArr);
        int[] iArr2 = new int[8];
        o000000O.OooO0Oo(iArr, iArr2);
        int[] iArr3 = new int[8];
        o000000O.OooO0Oo(o00000Var2.f52586OooO0Oo, iArr3);
        o000000O.OooO0OO(p697oO0OOo0o.o0OoOo0.OooO0O0(iArr3, iArr3, iArr3), iArr3);
        o000000O.OooO00o(iArr, o00000Var2.f52586OooO0Oo, iArr);
        o000000O.OooO0OO(p399o0Oo00oo.o00000OO.OooOOoo(8, iArr), iArr);
        int[] iArr4 = new int[8];
        o000000O.OooO0OO(p399o0Oo00oo.o00000OO.OooOo00(8, iArr2, iArr4), iArr4);
        o00000 o00000Var4 = new o00000(iArr2);
        o000000O.OooO0Oo(iArr3, iArr2);
        int[] iArr5 = o00000Var4.f52586OooO0Oo;
        o000000O.OooO0o(iArr5, iArr, iArr5);
        int[] iArr6 = o00000Var4.f52586OooO0Oo;
        o000000O.OooO0o(iArr6, iArr, iArr6);
        o00000 o00000Var5 = new o00000(iArr);
        o000000O.OooO0o(iArr, o00000Var4.f52586OooO0Oo, iArr);
        int[] iArr7 = o00000Var5.f52586OooO0Oo;
        o000000O.OooO00o(iArr7, iArr3, iArr7);
        int[] iArr8 = o00000Var5.f52586OooO0Oo;
        o000000O.OooO0o(iArr8, iArr4, iArr8);
        o00000 o00000Var6 = new o00000(iArr3);
        if (p399o0Oo00oo.o00000OO.OooOOo(8, o00000Var.f52586OooO0Oo, 0, iArr3) != 0 || (iArr3[7] == -1 && p697oO0OOo0o.o0OoOo0.OooOO0(iArr3, o000000O.f52589OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(8, 977, iArr3);
        }
        if (!o00000Var3.OooO0oo()) {
            int[] iArr9 = o00000Var6.f52586OooO0Oo;
            o000000O.OooO00o(iArr9, o00000Var3.f52586OooO0Oo, iArr9);
        }
        return new o00000O0(oooOO0O, o00000Var4, o00000Var5, new p696oO0OO0oo.OooOOO0[]{o00000Var6}, this.f52790OooO0o0);
    }
}
