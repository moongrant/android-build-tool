package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0Oo extends oO0OO0oo.OooOo00.OooO00o {
    public o0o0Oo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o0o0Oo(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        o00OOO0 o00ooo1;
        o00OOO0 o00ooo2;
        o00OOO0 o00ooo3;
        if (OooOO0()) {
            return oooOo00;
        }
        if (oooOo00.OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o00OOO0 o00ooo4 = (o00OOO0) this.f52787OooO0O0;
        o00OOO0 o00ooo5 = (o00OOO0) oooOo00.f52787OooO0O0;
        if (o00ooo4.OooO()) {
            return o00ooo5.OooO() ? oooOO0O.OooO() : oooOo00.OooO00o(this);
        }
        o00OOO0 o00ooo6 = (o00OOO0) this.f52788OooO0OO;
        o00OOO0 o00ooo7 = (o00OOO0) this.f52789OooO0Oo[0];
        o00OOO0 o00ooo8 = (o00OOO0) oooOo00.f52788OooO0OO;
        o00OOO0 o00ooo9 = (o00OOO0) oooOo00.OooO();
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] jArrOooO0oo = o00ooo7.OooO0oo() ? null : o00OOO00.OooO0oo(o00ooo7.f52633OooO0Oo);
        if (jArrOooO0oo == null) {
            jArr2 = o00ooo5.f52633OooO0Oo;
            jArr = o00ooo8.f52633OooO0Oo;
        } else {
            o00OOO00.OooO0oO(o00ooo5.f52633OooO0Oo, jArrOooO0oo, jArr5);
            o00OOO00.OooO0oO(o00ooo8.f52633OooO0Oo, jArrOooO0oo, jArr7);
            jArr = jArr7;
            jArr2 = jArr5;
        }
        long[] jArrOooO0oo2 = o00ooo9.OooO0oo() ? null : o00OOO00.OooO0oo(o00ooo9.f52633OooO0Oo);
        long[] jArr8 = o00ooo4.f52633OooO0Oo;
        if (jArrOooO0oo2 == null) {
            jArr3 = o00ooo6.f52633OooO0Oo;
        } else {
            o00OOO00.OooO0oO(jArr8, jArrOooO0oo2, jArr4);
            o00OOO00.OooO0oO(o00ooo6.f52633OooO0Oo, jArrOooO0oo2, jArr6);
            jArr8 = jArr4;
            jArr3 = jArr6;
        }
        o00OOO00.OooO00o(jArr3, jArr, jArr6);
        o00OOO00.OooO00o(jArr8, jArr2, jArr7);
        if (p697oO0OOo0o.o00Oo0.OooO00o(jArr7)) {
            return p697oO0OOo0o.o00Oo0.OooO00o(jArr6) ? OooOOo() : oooOO0O.OooO();
        }
        if (o00ooo5.OooO()) {
            p696oO0OO0oo.OooOo00 oooOo00OooOOO = OooOOO();
            o00OOO0 o00ooo10 = (o00OOO0) oooOo00OooOOO.f52787OooO0O0;
            p696oO0OO0oo.OooOOO0 oooOOO0OooO0oo = oooOo00OooOOO.OooO0oo();
            p696oO0OO0oo.OooOOO0 oooOOO0OooO0Oo = oooOOO0OooO0oo.OooO00o(o00ooo8).OooO0Oo(o00ooo10);
            o00ooo1 = (o00OOO0) oooOOO0OooO0Oo.OooOOOO().OooO00o(oooOOO0OooO0Oo).OooO00o(o00ooo10);
            if (o00ooo1.OooO()) {
                return new o0o0Oo(oooOO0O, o00ooo1, oooOO0O.f52761OooO0OO, this.f52790OooO0o0);
            }
            o00OOO0 o00ooo11 = (o00OOO0) oooOOO0OooO0Oo.OooOO0(o00ooo10.OooO00o(o00ooo1)).OooO00o(o00ooo1).OooO00o(oooOOO0OooO0oo).OooO0Oo(o00ooo1).OooO00o(o00ooo1);
            o00ooo3 = (o00OOO0) oooOO0O.OooO0oO(p696oO0OO0oo.OooOO0.f52757OooO0O0);
            o00ooo2 = o00ooo11;
        } else {
            o00OOO00.OooOO0O(jArr7, jArr7);
            long[] jArrOooO0oo3 = o00OOO00.OooO0oo(jArr6);
            o00OOO00.OooO0oO(jArr8, jArrOooO0oo3, jArr4);
            o00OOO00.OooO0oO(jArr2, jArrOooO0oo3, jArr5);
            o00OOO0 o00ooo12 = new o00OOO0(jArr4);
            o00OOO00.OooO0o0(jArr4, jArr5, jArr4);
            if (o00ooo12.OooO()) {
                return new o0o0Oo(oooOO0O, o00ooo12, oooOO0O.f52761OooO0OO, this.f52790OooO0o0);
            }
            o00OOO0 o00ooo13 = new o00OOO0(jArr6);
            o00OOO00.OooO0oO(jArr7, jArrOooO0oo3, jArr6);
            if (jArrOooO0oo2 != null) {
                long[] jArr9 = o00ooo13.f52633OooO0Oo;
                o00OOO00.OooO0oO(jArr9, jArrOooO0oo2, jArr9);
            }
            long[] jArr10 = new long[18];
            o00OOO00.OooO00o(jArr5, jArr7, jArr7);
            o00OOO00.OooOO0o(jArr7, jArr10);
            o00OOO00.OooO00o(o00ooo6.f52633OooO0Oo, o00ooo7.f52633OooO0Oo, jArr7);
            o00OOO00.OooO0o(jArr7, o00ooo13.f52633OooO0Oo, jArr10);
            o00OOO0 o00ooo14 = new o00OOO0(jArr7);
            o00OOO00.OooO(jArr10, jArr7);
            if (jArrOooO0oo != null) {
                long[] jArr11 = o00ooo13.f52633OooO0Oo;
                o00OOO00.OooO0oO(jArr11, jArrOooO0oo, jArr11);
            }
            o00ooo1 = o00ooo12;
            o00ooo2 = o00ooo14;
            o00ooo3 = o00ooo13;
        }
        return new o0o0Oo(oooOO0O, o00ooo1, o00ooo2, new p696oO0OO0oo.OooOOO0[]{o00ooo3}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o0o0Oo(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOOO0 OooO0oo() {
        p696oO0OO0oo.OooOOO0 oooOOO0 = this.f52787OooO0O0;
        p696oO0OO0oo.OooOOO0 oooOOO1 = this.f52788OooO0OO;
        if (OooOO0() || oooOOO0.OooO()) {
            return oooOOO1;
        }
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO0 = oooOOO1.OooO00o(oooOOO0).OooOO0(oooOOO0);
        p696oO0OO0oo.OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
        return !oooOOO2.OooO0oo() ? oooOOO0OooOO0.OooO0Oo(oooOOO2) : oooOOO0OooOO0;
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOOO0 oooOOO0 = this.f52787OooO0O0;
        if (oooOOO0.OooO()) {
            return this;
        }
        p696oO0OO0oo.OooOOO0 oooOOO1 = this.f52788OooO0OO;
        p696oO0OO0oo.OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
        return new o0o0Oo(this.f52786OooO00o, oooOOO0, oooOOO1.OooO00o(oooOOO2), new p696oO0OO0oo.OooOOO0[]{oooOOO2}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        p696oO0OO0oo.OooOOO0 oooOOO0 = this.f52787OooO0O0;
        if (oooOOO0.OooO()) {
            return oooOO0O.OooO();
        }
        p696oO0OO0oo.OooOOO0 oooOOO1 = this.f52788OooO0OO;
        p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO = this.f52789OooO0Oo[0];
        boolean zOooO0oo = oooOOO0OooOOOO.OooO0oo();
        p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO2 = zOooO0oo ? oooOOO0OooOOOO : oooOOO0OooOOOO.OooOOOO();
        p696oO0OO0oo.OooOOO0 oooOOO0OooO00o = zOooO0oo ? oooOOO1.OooOOOO().OooO00o(oooOOO1) : oooOOO1.OooO00o(oooOOO0OooOOOO).OooOO0(oooOOO1);
        if (oooOOO0OooO00o.OooO()) {
            return new o0o0Oo(oooOO0O, oooOOO0OooO00o, oooOO0O.f52761OooO0OO, this.f52790OooO0o0);
        }
        p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO3 = oooOOO0OooO00o.OooOOOO();
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO0 = zOooO0oo ? oooOOO0OooO00o : oooOOO0OooO00o.OooOO0(oooOOO0OooOOOO2);
        p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO4 = oooOOO1.OooO00o(oooOOO0).OooOOOO();
        if (!zOooO0oo) {
            oooOOO0OooOOOO = oooOOO0OooOOOO2.OooOOOO();
        }
        return new o0o0Oo(oooOO0O, oooOOO0OooOOOO3, oooOOO0OooOOOO4.OooO00o(oooOOO0OooO00o).OooO00o(oooOOO0OooOOOO2).OooOO0(oooOOO0OooOOOO4).OooO00o(oooOOO0OooOOOO).OooO00o(oooOOO0OooOOOO3).OooO00o(oooOOO0OooOO0), new p696oO0OO0oo.OooOOO0[]{oooOOO0OooOO0}, this.f52790OooO0o0);
    }
}
