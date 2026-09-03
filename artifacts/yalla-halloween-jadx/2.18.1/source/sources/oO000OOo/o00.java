package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 extends oO0OO0oo.OooOo00.OooO00o {
    public o00(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o00(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO0;
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO1;
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO2;
        p696oO0OO0oo.OooOOO0 oooOOO0;
        p696oO0OO0oo.OooOOO0 oooOOO0OooO0O0;
        p696oO0OO0oo.OooOOO0 oooOOO0OooO0oO;
        if (OooOO0()) {
            return oooOo00;
        }
        if (oooOo00.OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO3 = this.f52787OooO0O0;
        p696oO0OO0oo.OooOOO0 oooOOO1 = oooOo00.f52787OooO0O0;
        if (oooOOO0OooOO3.OooO()) {
            return oooOOO1.OooO() ? oooOO0O.OooO() : oooOo00.OooO00o(this);
        }
        p696oO0OO0oo.OooOOO0 oooOOO2 = this.f52788OooO0OO;
        p696oO0OO0oo.OooOOO0 oooOOO3 = this.f52789OooO0Oo[0];
        p696oO0OO0oo.OooOOO0 oooOOO4 = oooOo00.f52788OooO0OO;
        p696oO0OO0oo.OooOOO0 oooOOO0OooO = oooOo00.OooO();
        boolean zOooO0oo = oooOOO3.OooO0oo();
        if (zOooO0oo) {
            oooOOO0OooOO0 = oooOOO1;
            oooOOO0OooOO1 = oooOOO4;
        } else {
            oooOOO0OooOO0 = oooOOO1.OooOO0(oooOOO3);
            oooOOO0OooOO1 = oooOOO4.OooOO0(oooOOO3);
        }
        boolean zOooO0oo2 = oooOOO0OooO.OooO0oo();
        if (zOooO0oo2) {
            oooOOO0OooOO2 = oooOOO2;
        } else {
            oooOOO0OooOO3 = oooOOO0OooOO3.OooOO0(oooOOO0OooO);
            oooOOO0OooOO2 = oooOOO2.OooOO0(oooOOO0OooO);
        }
        p696oO0OO0oo.OooOOO0 oooOOO0OooO00o = oooOOO0OooOO2.OooO00o(oooOOO0OooOO1);
        p696oO0OO0oo.OooOOO0 oooOOO0OooO00o2 = oooOOO0OooOO3.OooO00o(oooOOO0OooOO0);
        if (oooOOO0OooO00o2.OooO()) {
            return oooOOO0OooO00o.OooO() ? OooOOo() : oooOO0O.OooO();
        }
        if (oooOOO1.OooO()) {
            p696oO0OO0oo.OooOo00 oooOo00OooOOO = OooOOO();
            p696oO0OO0oo.OooOOO0 oooOOO5 = oooOo00OooOOO.f52787OooO0O0;
            p696oO0OO0oo.OooOOO0 oooOOO0OooO0oo = oooOo00OooOOO.OooO0oo();
            p696oO0OO0oo.OooOOO0 oooOOO0OooO0Oo = oooOOO0OooO0oo.OooO00o(oooOOO4).OooO0Oo(oooOOO5);
            oooOOO0OooO0O0 = oooOOO0OooO0Oo.OooOOOO().OooO00o(oooOOO0OooO0Oo).OooO00o(oooOOO5).OooO0O0();
            if (oooOOO0OooO0O0.OooO()) {
                return new o00(oooOO0O, oooOOO0OooO0O0, oooOO0O.f52761OooO0OO, this.f52790OooO0o0);
            }
            p696oO0OO0oo.OooOOO0 oooOOO0OooO00o3 = oooOOO0OooO0Oo.OooOO0(oooOOO5.OooO00o(oooOOO0OooO0O0)).OooO00o(oooOOO0OooO0O0).OooO00o(oooOOO0OooO0oo).OooO0Oo(oooOOO0OooO0O0).OooO00o(oooOOO0OooO0O0);
            oooOOO0OooO0oO = oooOO0O.OooO0oO(p696oO0OO0oo.OooOO0.f52757OooO0O0);
            oooOOO0 = oooOOO0OooO00o3;
        } else {
            p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO = oooOOO0OooO00o2.OooOOOO();
            p696oO0OO0oo.OooOOO0 oooOOO0OooOO4 = oooOOO0OooO00o.OooOO0(oooOOO0OooOO3);
            p696oO0OO0oo.OooOOO0 oooOOO0OooOO5 = oooOOO0OooO00o.OooOO0(oooOOO0OooOO0);
            p696oO0OO0oo.OooOOO0 oooOOO0OooOO6 = oooOOO0OooOO4.OooOO0(oooOOO0OooOO5);
            if (oooOOO0OooOO6.OooO()) {
                return new o00(oooOO0O, oooOOO0OooOO6, oooOO0O.f52761OooO0OO, this.f52790OooO0o0);
            }
            p696oO0OO0oo.OooOOO0 oooOOO0OooOO7 = oooOOO0OooO00o.OooOO0(oooOOO0OooOOOO);
            if (!zOooO0oo2) {
                oooOOO0OooOO7 = oooOOO0OooOO7.OooOO0(oooOOO0OooO);
            }
            p696oO0OO0oo.OooOOO0 oooOOO0OooOOOo = oooOOO0OooOO5.OooO00o(oooOOO0OooOOOO).OooOOOo(oooOOO0OooOO7, oooOOO2.OooO00o(oooOOO3));
            p696oO0OO0oo.OooOOO0 oooOOO0OooOO8 = !zOooO0oo ? oooOOO0OooOO7.OooOO0(oooOOO3) : oooOOO0OooOO7;
            oooOOO0 = oooOOO0OooOOOo;
            oooOOO0OooO0O0 = oooOOO0OooOO6;
            oooOOO0OooO0oO = oooOOO0OooOO8;
        }
        return new o00(oooOO0O, oooOOO0OooO0O0, oooOOO0, new p696oO0OO0oo.OooOOO0[]{oooOOO0OooO0oO}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o00(null, OooO0o0(), OooO0o(), false);
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
        return new o00(this.f52786OooO00o, oooOOO0, oooOOO1.OooO00o(oooOOO2), new p696oO0OO0oo.OooOOO0[]{oooOOO2}, this.f52790OooO0o0);
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
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO0 = zOooO0oo ? oooOOO1 : oooOOO1.OooOO0(oooOOO0OooOOOO);
        if (!zOooO0oo) {
            oooOOO0OooOOOO = oooOOO0OooOOOO.OooOOOO();
        }
        p696oO0OO0oo.OooOOO0 oooOOO0OooO00o = p696oO0OO0oo.OooOOOO.OooO00o(oooOOO1, oooOOO0OooOO0, oooOOO0OooOOOO);
        if (oooOOO0OooO00o.OooO()) {
            return new o00(oooOO0O, oooOOO0OooO00o, oooOO0O.f52761OooO0OO, this.f52790OooO0o0);
        }
        p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO2 = oooOOO0OooO00o.OooOOOO();
        p696oO0OO0oo.OooOOO0 oooOOO0OooOO1 = zOooO0oo ? oooOOO0OooO00o : oooOOO0OooO00o.OooOO0(oooOOO0OooOOOO);
        p696oO0OO0oo.OooOOO0 oooOOO0OooOOOO3 = oooOOO1.OooO00o(oooOOO0).OooOOOO();
        return new o00(oooOO0O, oooOOO0OooOOOO2, oooOOO0OooOOOO3.OooO00o(oooOOO0OooO00o).OooO00o(oooOOO0OooOOOO).OooOO0(oooOOO0OooOOOO3).OooO00o(oooOOO0OooOOOO2), new p696oO0OO0oo.OooOOO0[]{oooOOO0OooOO1}, this.f52790OooO0o0);
    }
}
