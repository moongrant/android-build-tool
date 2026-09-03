package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends oO0OO0oo.OooOo00.OooO0O0 {
    public o0000OO0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o0000OO0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
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
        o0000O o0000o2 = (o0000O) this.f52787OooO0O0;
        o0000O o0000o3 = (o0000O) this.f52788OooO0OO;
        o0000O o0000o4 = (o0000O) oooOo00.f52787OooO0O0;
        o0000O o0000o5 = (o0000O) oooOo00.OooO0oo();
        o0000O o0000o6 = (o0000O) this.f52789OooO0Oo[0];
        o0000O o0000o7 = (o0000O) oooOo00.OooO();
        int[] iArr5 = new int[17];
        int[] iArr6 = new int[17];
        int[] iArr7 = new int[17];
        int[] iArr8 = new int[17];
        boolean zOooO0oo = o0000o6.OooO0oo();
        if (zOooO0oo) {
            iArr = o0000o4.f52597OooO0Oo;
            iArr2 = o0000o5.f52597OooO0Oo;
        } else {
            p231o00oOo0o.oo000o.OooO0oO(o0000o6.f52597OooO0Oo, iArr7);
            p231o00oOo0o.oo000o.OooO0Oo(iArr7, o0000o4.f52597OooO0Oo, iArr6);
            p231o00oOo0o.oo000o.OooO0Oo(iArr7, o0000o6.f52597OooO0Oo, iArr7);
            p231o00oOo0o.oo000o.OooO0Oo(iArr7, o0000o5.f52597OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o0000o7.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o0000o2.f52597OooO0Oo;
            iArr4 = o0000o3.f52597OooO0Oo;
        } else {
            p231o00oOo0o.oo000o.OooO0oO(o0000o7.f52597OooO0Oo, iArr8);
            p231o00oOo0o.oo000o.OooO0Oo(iArr8, o0000o2.f52597OooO0Oo, iArr5);
            p231o00oOo0o.oo000o.OooO0Oo(iArr8, o0000o7.f52597OooO0Oo, iArr8);
            p231o00oOo0o.oo000o.OooO0Oo(iArr8, o0000o3.f52597OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[17];
        p231o00oOo0o.oo000o.OooO0oo(iArr3, iArr, iArr9);
        p231o00oOo0o.oo000o.OooO0oo(iArr4, iArr2, iArr6);
        if (p399o0Oo00oo.o00000OO.OooOOo0(17, iArr9)) {
            return p399o0Oo00oo.o00000OO.OooOOo0(17, iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        p231o00oOo0o.oo000o.OooO0oO(iArr9, iArr7);
        int[] iArr10 = new int[17];
        p231o00oOo0o.oo000o.OooO0Oo(iArr7, iArr9, iArr10);
        p231o00oOo0o.oo000o.OooO0Oo(iArr7, iArr3, iArr7);
        p231o00oOo0o.oo000o.OooO0Oo(iArr4, iArr10, iArr5);
        o0000O o0000o8 = new o0000O(iArr8);
        p231o00oOo0o.oo000o.OooO0oO(iArr6, iArr8);
        int[] iArr11 = o0000o8.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0O0(iArr11, iArr10, iArr11);
        int[] iArr12 = o0000o8.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0oo(iArr12, iArr7, iArr12);
        int[] iArr13 = o0000o8.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0oo(iArr13, iArr7, iArr13);
        o0000O o0000o9 = new o0000O(iArr10);
        p231o00oOo0o.oo000o.OooO0oo(iArr7, o0000o8.f52597OooO0Oo, iArr10);
        p231o00oOo0o.oo000o.OooO0Oo(o0000o9.f52597OooO0Oo, iArr6, iArr6);
        p231o00oOo0o.oo000o.OooO0oo(iArr6, iArr5, o0000o9.f52597OooO0Oo);
        o0000O o0000o10 = new o0000O(iArr9);
        if (!zOooO0oo) {
            p231o00oOo0o.oo000o.OooO0Oo(iArr9, o0000o6.f52597OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr14 = o0000o10.f52597OooO0Oo;
            p231o00oOo0o.oo000o.OooO0Oo(iArr14, o0000o7.f52597OooO0Oo, iArr14);
        }
        return new o0000OO0(oooOO0O, o0000o8, o0000o9, new p696oO0OO0oo.OooOOO0[]{o0000o10}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o0000OO0(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o0000OO0(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o0000O o0000o2 = (o0000O) this.f52788OooO0OO;
        if (o0000o2.OooO()) {
            return oooOO0O.OooO();
        }
        o0000O o0000o3 = (o0000O) this.f52787OooO0O0;
        o0000O o0000o4 = (o0000O) this.f52789OooO0Oo[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        p231o00oOo0o.oo000o.OooO0oO(o0000o2.f52597OooO0Oo, iArr3);
        int[] iArr4 = new int[17];
        p231o00oOo0o.oo000o.OooO0oO(iArr3, iArr4);
        boolean zOooO0oo = o0000o4.OooO0oo();
        int[] iArr5 = o0000o4.f52597OooO0Oo;
        if (!zOooO0oo) {
            p231o00oOo0o.oo000o.OooO0oO(iArr5, iArr2);
            iArr5 = iArr2;
        }
        p231o00oOo0o.oo000o.OooO0oo(o0000o3.f52597OooO0Oo, iArr5, iArr);
        p231o00oOo0o.oo000o.OooO0O0(o0000o3.f52597OooO0Oo, iArr5, iArr2);
        p231o00oOo0o.oo000o.OooO0Oo(iArr2, iArr, iArr2);
        p399o0Oo00oo.o00000OO.OooO0OO(17, iArr2, iArr2, iArr2);
        p231o00oOo0o.oo000o.OooO0o(iArr2);
        p231o00oOo0o.oo000o.OooO0Oo(iArr3, o0000o3.f52597OooO0Oo, iArr3);
        p399o0Oo00oo.o00000OO.OooOOoo(17, iArr3);
        p231o00oOo0o.oo000o.OooO0o(iArr3);
        p399o0Oo00oo.o00000OO.OooOo00(17, iArr4, iArr);
        p231o00oOo0o.oo000o.OooO0o(iArr);
        o0000O o0000o5 = new o0000O(iArr4);
        p231o00oOo0o.oo000o.OooO0oO(iArr2, iArr4);
        int[] iArr6 = o0000o5.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0oo(iArr6, iArr3, iArr6);
        int[] iArr7 = o0000o5.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0oo(iArr7, iArr3, iArr7);
        o0000O o0000o6 = new o0000O(iArr3);
        p231o00oOo0o.oo000o.OooO0oo(iArr3, o0000o5.f52597OooO0Oo, iArr3);
        int[] iArr8 = o0000o6.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0Oo(iArr8, iArr2, iArr8);
        int[] iArr9 = o0000o6.f52597OooO0Oo;
        p231o00oOo0o.oo000o.OooO0oo(iArr9, iArr, iArr9);
        o0000O o0000o7 = new o0000O(iArr2);
        int[] iArr10 = o0000o2.f52597OooO0Oo;
        int i = iArr10[16];
        iArr2[16] = (p399o0Oo00oo.o00000OO.OooOOo(16, iArr10, i << 23, iArr2) | (i << 1)) & 511;
        if (!zOooO0oo) {
            int[] iArr11 = o0000o7.f52597OooO0Oo;
            p231o00oOo0o.oo000o.OooO0Oo(iArr11, o0000o4.f52597OooO0Oo, iArr11);
        }
        return new o0000OO0(oooOO0O, o0000o5, o0000o6, new p696oO0OO0oo.OooOOO0[]{o0000o7}, this.f52790OooO0o0);
    }
}
