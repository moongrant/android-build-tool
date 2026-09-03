package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo extends oO0OO0oo.OooOo00.OooO0O0 {
    public o0Oo0oo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o0Oo0oo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        o0OOO0o o0ooo0o2;
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
        o0OOO0o o0ooo0o3 = (o0OOO0o) this.f52787OooO0O0;
        o0OOO0o o0ooo0o4 = (o0OOO0o) this.f52788OooO0OO;
        o0OOO0o o0ooo0o5 = (o0OOO0o) oooOo00.f52787OooO0O0;
        o0OOO0o o0ooo0o6 = (o0OOO0o) oooOo00.OooO0oo();
        o0OOO0o o0ooo0o7 = (o0OOO0o) this.f52789OooO0Oo[0];
        o0OOO0o o0ooo0o8 = (o0OOO0o) oooOo00.OooO();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zOooO0oo = o0ooo0o7.OooO0oo();
        if (zOooO0oo) {
            iArr = o0ooo0o5.f52653OooO0Oo;
            iArr2 = o0ooo0o6.f52653OooO0Oo;
        } else {
            o0ooOOo.OooO0Oo(o0ooo0o7.f52653OooO0Oo, iArr7);
            o0ooOOo.OooO00o(iArr7, o0ooo0o5.f52653OooO0Oo, iArr6);
            o0ooOOo.OooO00o(iArr7, o0ooo0o7.f52653OooO0Oo, iArr7);
            o0ooOOo.OooO00o(iArr7, o0ooo0o6.f52653OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o0ooo0o8.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o0ooo0o3.f52653OooO0Oo;
            iArr4 = o0ooo0o4.f52653OooO0Oo;
        } else {
            o0ooOOo.OooO0Oo(o0ooo0o8.f52653OooO0Oo, iArr8);
            o0ooOOo.OooO00o(iArr8, o0ooo0o3.f52653OooO0Oo, iArr5);
            o0ooOOo.OooO00o(iArr8, o0ooo0o8.f52653OooO0Oo, iArr8);
            o0ooOOo.OooO00o(iArr8, o0ooo0o4.f52653OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[7];
        o0ooOOo.OooO0o(iArr3, iArr, iArr9);
        o0ooOOo.OooO0o(iArr4, iArr2, iArr6);
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr9)) {
            return p697oO0OOo0o.o000oOoO.OooO0oo(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        o0ooOOo.OooO0Oo(iArr9, iArr7);
        int[] iArr10 = new int[7];
        o0ooOOo.OooO00o(iArr7, iArr9, iArr10);
        o0ooOOo.OooO00o(iArr7, iArr3, iArr7);
        if (p697oO0OOo0o.o000oOoO.OooO0oo(iArr10)) {
            p697oO0OOo0o.o000oOoO.OooOOO(iArr10);
        } else {
            p697oO0OOo0o.o000oOoO.OooOO0o(o0ooOOo.f52654OooO00o, iArr10, iArr10);
        }
        p697oO0OOo0o.o000oOoO.OooO(iArr4, iArr10, iArr5);
        o0ooOOo.OooO0OO(p697oO0OOo0o.o000oOoO.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        o0OOO0o o0ooo0o9 = new o0OOO0o(iArr8);
        o0ooOOo.OooO0Oo(iArr6, iArr8);
        int[] iArr11 = o0ooo0o9.f52653OooO0Oo;
        o0ooOOo.OooO0o(iArr11, iArr10, iArr11);
        o0OOO0o o0ooo0o10 = new o0OOO0o(iArr10);
        o0ooOOo.OooO0o(iArr7, o0ooo0o9.f52653OooO0Oo, iArr10);
        if (p697oO0OOo0o.o000oOoO.OooOO0(o0ooo0o10.f52653OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[13] == -1) {
                i = 14;
                if (p399o0Oo00oo.o00000OO.OooOO0O(14, iArr5, o0ooOOo.f52655OooO0O0)) {
                }
            }
            o0ooOOo.OooO0O0(iArr5, o0ooo0o10.f52653OooO0Oo);
            o0ooo0o2 = new o0OOO0o(iArr9);
            if (!zOooO0oo) {
                o0ooOOo.OooO00o(iArr9, o0ooo0o7.f52653OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = o0ooo0o2.f52653OooO0Oo;
                o0ooOOo.OooO00o(iArr12, o0ooo0o8.f52653OooO0Oo, iArr12);
            }
            return new o0Oo0oo(oooOO0O, o0ooo0o9, o0ooo0o10, new p696oO0OO0oo.OooOOO0[]{o0ooo0o2}, this.f52790OooO0o0);
        }
        i = 14;
        if (p399o0Oo00oo.o00000OO.OooO0Oo(9, o0ooOOo.f52656OooO0OO, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(i, iArr5, 9);
        }
        o0ooOOo.OooO0O0(iArr5, o0ooo0o10.f52653OooO0Oo);
        o0ooo0o2 = new o0OOO0o(iArr9);
        if (!zOooO0oo) {
            o0ooOOo.OooO00o(iArr9, o0ooo0o7.f52653OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o0ooo0o2.f52653OooO0Oo;
            o0ooOOo.OooO00o(iArr13, o0ooo0o8.f52653OooO0Oo, iArr13);
        }
        return new o0Oo0oo(oooOO0O, o0ooo0o9, o0ooo0o10, new p696oO0OO0oo.OooOOO0[]{o0ooo0o2}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o0Oo0oo(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o0Oo0oo(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o0OOO0o o0ooo0o2 = (o0OOO0o) this.f52788OooO0OO;
        if (o0ooo0o2.OooO()) {
            return oooOO0O.OooO();
        }
        o0OOO0o o0ooo0o3 = (o0OOO0o) this.f52787OooO0O0;
        o0OOO0o o0ooo0o4 = (o0OOO0o) this.f52789OooO0Oo[0];
        int[] iArr = new int[7];
        o0ooOOo.OooO0Oo(o0ooo0o2.f52653OooO0Oo, iArr);
        int[] iArr2 = new int[7];
        o0ooOOo.OooO0Oo(iArr, iArr2);
        int[] iArr3 = new int[7];
        o0ooOOo.OooO0Oo(o0ooo0o3.f52653OooO0Oo, iArr3);
        o0ooOOo.OooO0OO(p697oO0OOo0o.o000oOoO.OooO0O0(iArr3, iArr3, iArr3), iArr3);
        o0ooOOo.OooO00o(iArr, o0ooo0o3.f52653OooO0Oo, iArr);
        o0ooOOo.OooO0OO(p399o0Oo00oo.o00000OO.OooOOoo(7, iArr), iArr);
        int[] iArr4 = new int[7];
        o0ooOOo.OooO0OO(p399o0Oo00oo.o00000OO.OooOo00(7, iArr2, iArr4), iArr4);
        o0OOO0o o0ooo0o5 = new o0OOO0o(iArr2);
        o0ooOOo.OooO0Oo(iArr3, iArr2);
        int[] iArr5 = o0ooo0o5.f52653OooO0Oo;
        o0ooOOo.OooO0o(iArr5, iArr, iArr5);
        int[] iArr6 = o0ooo0o5.f52653OooO0Oo;
        o0ooOOo.OooO0o(iArr6, iArr, iArr6);
        o0OOO0o o0ooo0o6 = new o0OOO0o(iArr);
        o0ooOOo.OooO0o(iArr, o0ooo0o5.f52653OooO0Oo, iArr);
        int[] iArr7 = o0ooo0o6.f52653OooO0Oo;
        o0ooOOo.OooO00o(iArr7, iArr3, iArr7);
        int[] iArr8 = o0ooo0o6.f52653OooO0Oo;
        o0ooOOo.OooO0o(iArr8, iArr4, iArr8);
        o0OOO0o o0ooo0o7 = new o0OOO0o(iArr3);
        if (p399o0Oo00oo.o00000OO.OooOOo(7, o0ooo0o2.f52653OooO0Oo, 0, iArr3) != 0 || (iArr3[6] == -1 && p697oO0OOo0o.o000oOoO.OooO0o(iArr3, o0ooOOo.f52654OooO00o))) {
            p399o0Oo00oo.o00000OO.OooO0O0(7, 6803, iArr3);
        }
        if (!o0ooo0o4.OooO0oo()) {
            int[] iArr9 = o0ooo0o7.f52653OooO0Oo;
            o0ooOOo.OooO00o(iArr9, o0ooo0o4.f52653OooO0Oo, iArr9);
        }
        return new o0Oo0oo(oooOO0O, o0ooo0o5, o0ooo0o6, new p696oO0OO0oo.OooOOO0[]{o0ooo0o7}, this.f52790OooO0o0);
    }
}
