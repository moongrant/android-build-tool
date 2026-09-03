package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends oO0OO0oo.OooOo00.OooO0O0 {
    public o000OOo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o000OOo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
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
        o0O0O00 o0o0o00;
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
        o0O0O00 o0o0o01 = (o0O0O00) this.f52787OooO0O0;
        o0O0O00 o0o0o02 = (o0O0O00) this.f52788OooO0OO;
        o0O0O00 o0o0o03 = (o0O0O00) oooOo00.f52787OooO0O0;
        o0O0O00 o0o0o04 = (o0O0O00) oooOo00.OooO0oo();
        o0O0O00 o0o0o05 = (o0O0O00) this.f52789OooO0Oo[0];
        o0O0O00 o0o0o06 = (o0O0O00) oooOo00.OooO();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zOooO0oo = o0o0o05.OooO0oo();
        if (zOooO0oo) {
            iArr = o0o0o03.f52648OooO0Oo;
            iArr2 = o0o0o04.f52648OooO0Oo;
        } else {
            oo0o0Oo.OooO0oo(o0o0o05.f52648OooO0Oo, iArr7);
            oo0o0Oo.OooO0Oo(iArr7, o0o0o03.f52648OooO0Oo, iArr6);
            oo0o0Oo.OooO0Oo(iArr7, o0o0o05.f52648OooO0Oo, iArr7);
            oo0o0Oo.OooO0Oo(iArr7, o0o0o04.f52648OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o0o0o06.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o0o0o01.f52648OooO0Oo;
            iArr4 = o0o0o02.f52648OooO0Oo;
        } else {
            oo0o0Oo.OooO0oo(o0o0o06.f52648OooO0Oo, iArr8);
            oo0o0Oo.OooO0Oo(iArr8, o0o0o01.f52648OooO0Oo, iArr5);
            oo0o0Oo.OooO0Oo(iArr8, o0o0o06.f52648OooO0Oo, iArr8);
            oo0o0Oo.OooO0Oo(iArr8, o0o0o02.f52648OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[7];
        oo0o0Oo.OooO(iArr3, iArr, iArr9);
        oo0o0Oo.OooO(iArr4, iArr2, iArr6);
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr9)) {
            return p697oO0OOo0o.o000oOoO.OooO0oo(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        oo0o0Oo.OooO0oo(iArr9, iArr7);
        int[] iArr10 = new int[7];
        oo0o0Oo.OooO0Oo(iArr7, iArr9, iArr10);
        oo0o0Oo.OooO0Oo(iArr7, iArr3, iArr7);
        oo0o0Oo.OooO0o0(iArr10, iArr10);
        p697oO0OOo0o.o000oOoO.OooO(iArr4, iArr10, iArr5);
        oo0o0Oo.OooO0oO(p697oO0OOo0o.o000oOoO.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        o0O0O00 o0o0o07 = new o0O0O00(iArr8);
        oo0o0Oo.OooO0oo(iArr6, iArr8);
        int[] iArr11 = o0o0o07.f52648OooO0Oo;
        oo0o0Oo.OooO(iArr11, iArr10, iArr11);
        o0O0O00 o0o0o08 = new o0O0O00(iArr10);
        oo0o0Oo.OooO(iArr7, o0o0o07.f52648OooO0Oo, iArr10);
        if (p697oO0OOo0o.o000oOoO.OooOO0(o0o0o08.f52648OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[13] == -1) {
                i = 14;
                if (p399o0Oo00oo.o00000OO.OooOO0O(14, iArr5, oo0o0Oo.f52661OooO0O0)) {
                }
            }
            oo0o0Oo.OooO0o(iArr5, o0o0o08.f52648OooO0Oo);
            o0o0o00 = new o0O0O00(iArr9);
            if (!zOooO0oo) {
                oo0o0Oo.OooO0Oo(iArr9, o0o0o05.f52648OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = o0o0o00.f52648OooO0Oo;
                oo0o0Oo.OooO0Oo(iArr12, o0o0o06.f52648OooO0Oo, iArr12);
            }
            return new o000OOo(oooOO0O, o0o0o07, o0o0o08, new p696oO0OO0oo.OooOOO0[]{o0o0o00}, this.f52790OooO0o0);
        }
        i = 14;
        if (p399o0Oo00oo.o00000OO.OooO0Oo(11, oo0o0Oo.f52662OooO0OO, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(i, iArr5, 11);
        }
        oo0o0Oo.OooO0o(iArr5, o0o0o08.f52648OooO0Oo);
        o0o0o00 = new o0O0O00(iArr9);
        if (!zOooO0oo) {
            oo0o0Oo.OooO0Oo(iArr9, o0o0o05.f52648OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o0o0o00.f52648OooO0Oo;
            oo0o0Oo.OooO0Oo(iArr13, o0o0o06.f52648OooO0Oo, iArr13);
        }
        return new o000OOo(oooOO0O, o0o0o07, o0o0o08, new p696oO0OO0oo.OooOOO0[]{o0o0o00}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o000OOo(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o000OOo(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o0O0O00 o0o0o00 = (o0O0O00) this.f52788OooO0OO;
        if (o0o0o00.OooO()) {
            return oooOO0O.OooO();
        }
        o0O0O00 o0o0o01 = (o0O0O00) this.f52787OooO0O0;
        o0O0O00 o0o0o02 = (o0O0O00) this.f52789OooO0Oo[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        oo0o0Oo.OooO0oo(o0o0o00.f52648OooO0Oo, iArr3);
        int[] iArr4 = new int[7];
        oo0o0Oo.OooO0oo(iArr3, iArr4);
        boolean zOooO0oo = o0o0o02.OooO0oo();
        int[] iArr5 = o0o0o02.f52648OooO0Oo;
        if (!zOooO0oo) {
            oo0o0Oo.OooO0oo(iArr5, iArr2);
            iArr5 = iArr2;
        }
        oo0o0Oo.OooO(o0o0o01.f52648OooO0Oo, iArr5, iArr);
        oo0o0Oo.OooO00o(o0o0o01.f52648OooO0Oo, iArr5, iArr2);
        oo0o0Oo.OooO0Oo(iArr2, iArr, iArr2);
        oo0o0Oo.OooO0oO(p697oO0OOo0o.o000oOoO.OooO0O0(iArr2, iArr2, iArr2), iArr2);
        oo0o0Oo.OooO0Oo(iArr3, o0o0o01.f52648OooO0Oo, iArr3);
        oo0o0Oo.OooO0oO(p399o0Oo00oo.o00000OO.OooOOoo(7, iArr3), iArr3);
        oo0o0Oo.OooO0oO(p399o0Oo00oo.o00000OO.OooOo00(7, iArr4, iArr), iArr);
        o0O0O00 o0o0o03 = new o0O0O00(iArr4);
        oo0o0Oo.OooO0oo(iArr2, iArr4);
        int[] iArr6 = o0o0o03.f52648OooO0Oo;
        oo0o0Oo.OooO(iArr6, iArr3, iArr6);
        int[] iArr7 = o0o0o03.f52648OooO0Oo;
        oo0o0Oo.OooO(iArr7, iArr3, iArr7);
        o0O0O00 o0o0o04 = new o0O0O00(iArr3);
        oo0o0Oo.OooO(iArr3, o0o0o03.f52648OooO0Oo, iArr3);
        int[] iArr8 = o0o0o04.f52648OooO0Oo;
        oo0o0Oo.OooO0Oo(iArr8, iArr2, iArr8);
        int[] iArr9 = o0o0o04.f52648OooO0Oo;
        oo0o0Oo.OooO(iArr9, iArr, iArr9);
        o0O0O00 o0o0o05 = new o0O0O00(iArr2);
        oo0o0Oo.OooOO0(o0o0o00.f52648OooO0Oo, iArr2);
        if (!zOooO0oo) {
            int[] iArr10 = o0o0o05.f52648OooO0Oo;
            oo0o0Oo.OooO0Oo(iArr10, o0o0o02.f52648OooO0Oo, iArr10);
        }
        return new o000OOo(oooOO0O, o0o0o03, o0o0o04, new p696oO0OO0oo.OooOOO0[]{o0o0o05}, this.f52790OooO0o0);
    }
}
