package p696oO0OO0oo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static OooOOO0[] f52785OooO0o = new OooOOO0[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOO0O f52786OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOO0 f52787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO0 f52788OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO0[] f52789OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f52790OooO0o0;

    public static abstract class OooO00o extends OooOo00 {
        public OooO00o(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            super(oooOO0O, oooOOO0, oooOOO1);
        }

        public OooO00o(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0[] oooOOO0Arr) {
            super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final boolean OooOOo0() {
            OooOOO0 oooOOO0OooOO0o;
            OooOOO0 oooOOO0OooOOOo;
            OooOO0O oooOO0O = this.f52786OooO00o;
            OooOOO0 oooOOO0 = this.f52787OooO0O0;
            OooOOO0 oooOOO0OooOO0 = oooOO0O.f52760OooO0O0;
            OooOOO0 oooOOO0OooOO1 = oooOO0O.f52761OooO0OO;
            int i = oooOO0O.f52763OooO0o;
            if (i != 6) {
                OooOOO0 oooOOO1 = this.f52788OooO0OO;
                OooOOO0 oooOOO0OooOO2 = oooOOO1.OooO00o(oooOOO0).OooOO0(oooOOO1);
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
                    if (!oooOOO2.OooO0oo()) {
                        OooOOO0 oooOOO0OooOO3 = oooOOO2.OooOO0(oooOOO2.OooOOOO());
                        oooOOO0OooOO2 = oooOOO0OooOO2.OooOO0(oooOOO2);
                        oooOOO0OooOO0 = oooOOO0OooOO0.OooOO0(oooOOO2);
                        oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO0OooOO3);
                    }
                }
                return oooOOO0OooOO2.equals(oooOOO0.OooO00o(oooOOO0OooOO0).OooOO0(oooOOO0.OooOOOO()).OooO00o(oooOOO0OooOO1));
            }
            OooOOO0 oooOOO3 = this.f52789OooO0Oo[0];
            boolean zOooO0oo = oooOOO3.OooO0oo();
            if (oooOOO0.OooO()) {
                OooOOO0 oooOOO0OooOOOO = this.f52788OooO0OO.OooOOOO();
                if (!zOooO0oo) {
                    oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO3.OooOOOO());
                }
                return oooOOO0OooOOOO.equals(oooOOO0OooOO1);
            }
            OooOOO0 oooOOO4 = this.f52788OooO0OO;
            OooOOO0 oooOOO0OooOOOO2 = oooOOO0.OooOOOO();
            if (zOooO0oo) {
                oooOOO0OooOO0o = OooOOOO.OooO00o(oooOOO4, oooOOO4, oooOOO0OooOO0);
                oooOOO0OooOOOo = oooOOO0OooOOOO2.OooOOOO().OooO00o(oooOOO0OooOO1);
            } else {
                OooOOO0 oooOOO0OooOOOO3 = oooOOO3.OooOOOO();
                OooOOO0 oooOOO0OooOOOO4 = oooOOO0OooOOOO3.OooOOOO();
                oooOOO0OooOO0o = oooOOO4.OooO00o(oooOOO3).OooOO0o(oooOOO4, oooOOO0OooOO0, oooOOO0OooOOOO3);
                oooOOO0OooOOOo = oooOOO0OooOOOO2.OooOOOo(oooOOO0OooOO1, oooOOO0OooOOOO4);
            }
            return oooOOO0OooOO0o.OooOO0(oooOOO0OooOOOO2).equals(oooOOO0OooOOOo);
        }
    }

    public static abstract class OooO0O0 extends OooOo00 {
        public OooO0O0(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            super(oooOO0O, oooOOO0, oooOOO1);
        }

        public OooO0O0(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0[] oooOOO0Arr) {
            super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final boolean OooOOo0() {
            OooOOO0 oooOOO0 = this.f52787OooO0O0;
            OooOOO0 oooOOO1 = this.f52788OooO0OO;
            OooOO0O oooOO0O = this.f52786OooO00o;
            OooOOO0 oooOOO0OooOO0 = oooOO0O.f52760OooO0O0;
            OooOOO0 oooOOO0OooOO1 = oooOO0O.f52761OooO0OO;
            OooOOO0 oooOOO0OooOOOO = oooOOO1.OooOOOO();
            int iOooO0oO = OooO0oO();
            if (iOooO0oO != 0) {
                if (iOooO0oO == 1) {
                    OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
                    if (!oooOOO2.OooO0oo()) {
                        OooOOO0 oooOOO0OooOOOO2 = oooOOO2.OooOOOO();
                        OooOOO0 oooOOO0OooOO2 = oooOOO2.OooOO0(oooOOO0OooOOOO2);
                        oooOOO0OooOOOO = oooOOO0OooOOOO.OooOO0(oooOOO2);
                        oooOOO0OooOO0 = oooOOO0OooOO0.OooOO0(oooOOO0OooOOOO2);
                        oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO0OooOO2);
                    }
                } else {
                    if (iOooO0oO != 2 && iOooO0oO != 3 && iOooO0oO != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    OooOOO0 oooOOO3 = this.f52789OooO0Oo[0];
                    if (!oooOOO3.OooO0oo()) {
                        OooOOO0 oooOOO0OooOOOO3 = oooOOO3.OooOOOO();
                        OooOOO0 oooOOO0OooOOOO4 = oooOOO0OooOOOO3.OooOOOO();
                        OooOOO0 oooOOO0OooOO3 = oooOOO0OooOOOO3.OooOO0(oooOOO0OooOOOO4);
                        oooOOO0OooOO0 = oooOOO0OooOO0.OooOO0(oooOOO0OooOOOO4);
                        oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO0OooOO3);
                    }
                }
            }
            return oooOOO0OooOOOO.equals(oooOOO0.OooOOOO().OooO00o(oooOOO0OooOO0).OooOO0(oooOOO0).OooO00o(oooOOO0OooOO1));
        }
    }

    public static class OooO0OO extends OooO00o {
        public OooO0OO(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, boolean z) {
            super(oooOO0O, oooOOO0, oooOOO1);
            if ((oooOOO0 == null) != (oooOOO1 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (oooOOO0 != null) {
                OooOOO0.OooO00o.OooOo00(this.f52787OooO0O0, this.f52788OooO0OO);
                if (oooOO0O != null) {
                    OooOOO0.OooO00o.OooOo00(this.f52787OooO0O0, this.f52786OooO00o.f52760OooO0O0);
                }
            }
            this.f52790OooO0o0 = z;
        }

        public OooO0OO(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0[] oooOOO0Arr, boolean z) {
            super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
            this.f52790OooO0o0 = z;
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooO00o(OooOo00 oooOo00) {
            OooOOO0 oooOOO0OooOO0;
            OooOOO0 oooOOO0OooOO1;
            OooOOO0 oooOOO0OooOO2;
            OooOOO0 oooOOO0OooOOOo;
            OooOOO0 oooOOO0OooOO3;
            OooOOO0 oooOOO0OooO00o;
            if (OooOO0()) {
                return oooOo00;
            }
            if (oooOo00.OooOO0()) {
                return this;
            }
            OooOO0O oooOO0O = this.f52786OooO00o;
            int i = oooOO0O.f52763OooO0o;
            OooOOO0 oooOOO0OooOO4 = this.f52787OooO0O0;
            OooOOO0 oooOOO0 = oooOo00.f52787OooO0O0;
            if (i == 0) {
                OooOOO0 oooOOO1 = this.f52788OooO0OO;
                OooOOO0 oooOOO2 = oooOo00.f52788OooO0OO;
                OooOOO0 oooOOO0OooO00o2 = oooOOO0OooOO4.OooO00o(oooOOO0);
                OooOOO0 oooOOO0OooO00o3 = oooOOO1.OooO00o(oooOOO2);
                if (oooOOO0OooO00o2.OooO()) {
                    return oooOOO0OooO00o3.OooO() ? OooOOo() : oooOO0O.OooO();
                }
                OooOOO0 oooOOO0OooO0Oo = oooOOO0OooO00o3.OooO0Oo(oooOOO0OooO00o2);
                OooOOO0 oooOOO0OooO00o4 = OooOOOO.OooO00o(oooOOO0OooO0Oo, oooOOO0OooO0Oo, oooOOO0OooO00o2).OooO00o(oooOO0O.f52760OooO0O0);
                return new OooO0OO(oooOO0O, oooOOO0OooO00o4, oooOOO0OooO0Oo.OooOO0(oooOOO0OooOO4.OooO00o(oooOOO0OooO00o4)).OooO00o(oooOOO0OooO00o4).OooO00o(oooOOO1), this.f52790OooO0o0);
            }
            if (i == 1) {
                OooOOO0 oooOOO3 = this.f52788OooO0OO;
                OooOOO0 oooOOO0OooOO5 = this.f52789OooO0Oo[0];
                OooOOO0 oooOOO4 = oooOo00.f52788OooO0OO;
                OooOOO0 oooOOO5 = oooOo00.f52789OooO0Oo[0];
                boolean zOooO0oo = oooOOO5.OooO0oo();
                OooOOO0 oooOOO0OooO00o5 = oooOOO0OooOO5.OooOO0(oooOOO4).OooO00o(zOooO0oo ? oooOOO3 : oooOOO3.OooOO0(oooOOO5));
                OooOOO0 oooOOO0OooO00o6 = oooOOO0OooOO5.OooOO0(oooOOO0).OooO00o(zOooO0oo ? oooOOO0OooOO4 : oooOOO0OooOO4.OooOO0(oooOOO5));
                if (oooOOO0OooO00o6.OooO()) {
                    return oooOOO0OooO00o5.OooO() ? OooOOo() : oooOO0O.OooO();
                }
                OooOOO0 oooOOO0OooOOOO = oooOOO0OooO00o6.OooOOOO();
                OooOOO0 oooOOO0OooOO6 = oooOOO0OooOOOO.OooOO0(oooOOO0OooO00o6);
                if (!zOooO0oo) {
                    oooOOO0OooOO5 = oooOOO0OooOO5.OooOO0(oooOOO5);
                }
                OooOOO0 oooOOO0OooO00o7 = oooOOO0OooO00o5.OooO00o(oooOOO0OooO00o6);
                OooOOO0 oooOOO0OooO00o8 = oooOOO0OooO00o7.OooOO0o(oooOOO0OooO00o5, oooOOO0OooOOOO, oooOO0O.f52760OooO0O0).OooOO0(oooOOO0OooOO5).OooO00o(oooOOO0OooOO6);
                OooOOO0 oooOOO0OooOO7 = oooOOO0OooO00o6.OooOO0(oooOOO0OooO00o8);
                if (!zOooO0oo) {
                    oooOOO0OooOOOO = oooOOO0OooOOOO.OooOO0(oooOOO5);
                }
                return new OooO0OO(oooOO0O, oooOOO0OooOO7, oooOOO0OooO00o5.OooOO0o(oooOOO0OooOO4, oooOOO0OooO00o6, oooOOO3).OooOO0o(oooOOO0OooOOOO, oooOOO0OooO00o7, oooOOO0OooO00o8), new OooOOO0[]{oooOOO0OooOO6.OooOO0(oooOOO0OooOO5)}, this.f52790OooO0o0);
            }
            if (i != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (oooOOO0OooOO4.OooO()) {
                return oooOOO0.OooO() ? oooOO0O.OooO() : oooOo00.OooO00o(this);
            }
            OooOOO0 oooOOO6 = this.f52788OooO0OO;
            OooOOO0 oooOOO7 = this.f52789OooO0Oo[0];
            OooOOO0 oooOOO8 = oooOo00.f52788OooO0OO;
            OooOOO0 oooOOO9 = oooOo00.f52789OooO0Oo[0];
            boolean zOooO0oo2 = oooOOO7.OooO0oo();
            if (zOooO0oo2) {
                oooOOO0OooOO0 = oooOOO0;
                oooOOO0OooOO1 = oooOOO8;
            } else {
                oooOOO0OooOO0 = oooOOO0.OooOO0(oooOOO7);
                oooOOO0OooOO1 = oooOOO8.OooOO0(oooOOO7);
            }
            boolean zOooO0oo3 = oooOOO9.OooO0oo();
            if (zOooO0oo3) {
                oooOOO0OooOO2 = oooOOO6;
            } else {
                oooOOO0OooOO4 = oooOOO0OooOO4.OooOO0(oooOOO9);
                oooOOO0OooOO2 = oooOOO6.OooOO0(oooOOO9);
            }
            OooOOO0 oooOOO0OooO00o9 = oooOOO0OooOO2.OooO00o(oooOOO0OooOO1);
            OooOOO0 oooOOO0OooO00o10 = oooOOO0OooOO4.OooO00o(oooOOO0OooOO0);
            if (oooOOO0OooO00o10.OooO()) {
                return oooOOO0OooO00o9.OooO() ? OooOOo() : oooOO0O.OooO();
            }
            if (oooOOO0.OooO()) {
                OooOo00 oooOo00OooOOO = OooOOO();
                OooOOO0 oooOOO10 = oooOo00OooOOO.f52787OooO0O0;
                OooOOO0 oooOOO0OooO0oo = oooOo00OooOOO.OooO0oo();
                OooOOO0 oooOOO0OooO0Oo2 = oooOOO0OooO0oo.OooO00o(oooOOO8).OooO0Oo(oooOOO10);
                oooOOO0OooO00o = OooOOOO.OooO00o(oooOOO0OooO0Oo2, oooOOO0OooO0Oo2, oooOOO10).OooO00o(oooOO0O.f52760OooO0O0);
                if (oooOOO0OooO00o.OooO()) {
                    return new OooO0OO(oooOO0O, oooOOO0OooO00o, oooOO0O.f52761OooO0OO.OooOOO(), this.f52790OooO0o0);
                }
                oooOOO0OooOOOo = oooOOO0OooO0Oo2.OooOO0(oooOOO10.OooO00o(oooOOO0OooO00o)).OooO00o(oooOOO0OooO00o).OooO00o(oooOOO0OooO0oo).OooO0Oo(oooOOO0OooO00o).OooO00o(oooOOO0OooO00o);
                oooOOO0OooOO3 = oooOO0O.OooO0oO(OooOO0.f52757OooO0O0);
            } else {
                OooOOO0 oooOOO0OooOOOO2 = oooOOO0OooO00o10.OooOOOO();
                OooOOO0 oooOOO0OooOO8 = oooOOO0OooO00o9.OooOO0(oooOOO0OooOO4);
                OooOOO0 oooOOO0OooOO9 = oooOOO0OooO00o9.OooOO0(oooOOO0OooOO0);
                OooOOO0 oooOOO0OooOO10 = oooOOO0OooOO8.OooOO0(oooOOO0OooOO9);
                if (oooOOO0OooOO10.OooO()) {
                    return new OooO0OO(oooOO0O, oooOOO0OooOO10, oooOO0O.f52761OooO0OO.OooOOO(), this.f52790OooO0o0);
                }
                OooOOO0 oooOOO0OooOO11 = oooOOO0OooO00o9.OooOO0(oooOOO0OooOOOO2);
                if (!zOooO0oo3) {
                    oooOOO0OooOO11 = oooOOO0OooOO11.OooOO0(oooOOO9);
                }
                oooOOO0OooOOOo = oooOOO0OooOO9.OooO00o(oooOOO0OooOOOO2).OooOOOo(oooOOO0OooOO11, oooOOO6.OooO00o(oooOOO7));
                oooOOO0OooOO3 = !zOooO0oo2 ? oooOOO0OooOO11.OooOO0(oooOOO7) : oooOOO0OooOO11;
                oooOOO0OooO00o = oooOOO0OooOO10;
            }
            return new OooO0OO(oooOO0O, oooOOO0OooO00o, oooOOO0OooOOOo, new OooOOO0[]{oooOOO0OooOO3}, this.f52790OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooO0OO() {
            return new OooO0OO(null, OooO0o0(), OooO0o(), false);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOOO0 OooO0oo() {
            int iOooO0oO = OooO0oO();
            if (iOooO0oO != 5 && iOooO0oO != 6) {
                return this.f52788OooO0OO;
            }
            OooOOO0 oooOOO0 = this.f52787OooO0O0;
            OooOOO0 oooOOO1 = this.f52788OooO0OO;
            if (OooOO0() || oooOOO0.OooO()) {
                return oooOOO1;
            }
            OooOOO0 oooOOO0OooOO0 = oooOOO1.OooO00o(oooOOO0).OooOO0(oooOOO0);
            if (6 != iOooO0oO) {
                return oooOOO0OooOO0;
            }
            OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
            return !oooOOO2.OooO0oo() ? oooOOO0OooOO0.OooO0Oo(oooOOO2) : oooOOO0OooOO0;
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooOOO0() {
            if (OooOO0()) {
                return this;
            }
            OooOOO0 oooOOO0 = this.f52787OooO0O0;
            if (oooOOO0.OooO()) {
                return this;
            }
            int iOooO0oO = OooO0oO();
            if (iOooO0oO == 0) {
                return new OooO0OO(this.f52786OooO00o, oooOOO0, this.f52788OooO0OO.OooO00o(oooOOO0), this.f52790OooO0o0);
            }
            if (iOooO0oO == 1) {
                return new OooO0OO(this.f52786OooO00o, oooOOO0, this.f52788OooO0OO.OooO00o(oooOOO0), new OooOOO0[]{this.f52789OooO0Oo[0]}, this.f52790OooO0o0);
            }
            if (iOooO0oO == 5) {
                return new OooO0OO(this.f52786OooO00o, oooOOO0, this.f52788OooO0OO.OooO0O0(), this.f52790OooO0o0);
            }
            if (iOooO0oO != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            OooOOO0 oooOOO1 = this.f52788OooO0OO;
            OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
            return new OooO0OO(this.f52786OooO00o, oooOOO0, oooOOO1.OooO00o(oooOOO2), new OooOOO0[]{oooOOO2}, this.f52790OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooOOo() {
            OooOOO0 oooOOO0OooO00o;
            if (OooOO0()) {
                return this;
            }
            OooOO0O oooOO0O = this.f52786OooO00o;
            OooOOO0 oooOOO0OooOO0 = this.f52787OooO0O0;
            if (oooOOO0OooOO0.OooO()) {
                return oooOO0O.OooO();
            }
            int i = oooOO0O.f52763OooO0o;
            if (i == 0) {
                OooOOO0 oooOOO0OooO00o2 = this.f52788OooO0OO.OooO0Oo(oooOOO0OooOO0).OooO00o(oooOOO0OooOO0);
                OooOOO0 oooOOO0OooO00o3 = oooOOO0OooO00o2.OooOOOO().OooO00o(oooOOO0OooO00o2).OooO00o(oooOO0O.f52760OooO0O0);
                return new OooO0OO(oooOO0O, oooOOO0OooO00o3, oooOOO0OooOO0.OooOOOo(oooOOO0OooO00o3, oooOOO0OooO00o2.OooO0O0()), this.f52790OooO0o0);
            }
            if (i == 1) {
                OooOOO0 oooOOO0OooOO1 = this.f52788OooO0OO;
                OooOOO0 oooOOO0 = this.f52789OooO0Oo[0];
                boolean zOooO0oo = oooOOO0.OooO0oo();
                OooOOO0 oooOOO0OooOO2 = zOooO0oo ? oooOOO0OooOO0 : oooOOO0OooOO0.OooOO0(oooOOO0);
                if (!zOooO0oo) {
                    oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO0);
                }
                OooOOO0 oooOOO0OooOOOO = oooOOO0OooOO0.OooOOOO();
                OooOOO0 oooOOO0OooO00o4 = oooOOO0OooOOOO.OooO00o(oooOOO0OooOO1);
                OooOOO0 oooOOO0OooOOOO2 = oooOOO0OooOO2.OooOOOO();
                OooOOO0 oooOOO0OooO00o5 = oooOOO0OooO00o4.OooO00o(oooOOO0OooOO2);
                OooOOO0 oooOOO0OooOO0o = oooOOO0OooO00o5.OooOO0o(oooOOO0OooO00o4, oooOOO0OooOOOO2, oooOO0O.f52760OooO0O0);
                return new OooO0OO(oooOO0O, oooOOO0OooOO2.OooOO0(oooOOO0OooOO0o), oooOOO0OooOOOO.OooOOOO().OooOO0o(oooOOO0OooOO2, oooOOO0OooOO0o, oooOOO0OooO00o5), new OooOOO0[]{oooOOO0OooOO2.OooOO0(oooOOO0OooOOOO2)}, this.f52790OooO0o0);
            }
            if (i != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            OooOOO0 oooOOO1 = this.f52788OooO0OO;
            OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
            boolean zOooO0oo2 = oooOOO2.OooO0oo();
            OooOOO0 oooOOO0OooOO3 = zOooO0oo2 ? oooOOO1 : oooOOO1.OooOO0(oooOOO2);
            OooOOO0 oooOOO0OooOOOO3 = zOooO0oo2 ? oooOOO2 : oooOOO2.OooOOOO();
            OooOOO0 oooOOO3 = oooOO0O.f52760OooO0O0;
            OooOOO0 oooOOO0OooOO4 = zOooO0oo2 ? oooOOO3 : oooOOO3.OooOO0(oooOOO0OooOOOO3);
            OooOOO0 oooOOO0OooO00o6 = OooOOOO.OooO00o(oooOOO1, oooOOO0OooOO3, oooOOO0OooOO4);
            if (oooOOO0OooO00o6.OooO()) {
                return new OooO0OO(oooOO0O, oooOOO0OooO00o6, oooOO0O.f52761OooO0OO.OooOOO(), this.f52790OooO0o0);
            }
            OooOOO0 oooOOO0OooOOOO4 = oooOOO0OooO00o6.OooOOOO();
            OooOOO0 oooOOO0OooOO5 = zOooO0oo2 ? oooOOO0OooO00o6 : oooOOO0OooO00o6.OooOO0(oooOOO0OooOOOO3);
            OooOOO0 oooOOO4 = oooOO0O.f52761OooO0OO;
            if (oooOOO4.OooO0OO() < (oooOO0O.OooO0oo() >> 1)) {
                OooOOO0 oooOOO0OooOOOO5 = oooOOO1.OooO00o(oooOOO0OooOO0).OooOOOO();
                oooOOO0OooO00o = oooOOO0OooOOOO5.OooO00o(oooOOO0OooO00o6).OooO00o(oooOOO0OooOOOO3).OooOO0(oooOOO0OooOOOO5).OooO00o(oooOOO4.OooO0oo() ? oooOOO0OooOO4.OooO00o(oooOOO0OooOOOO3).OooOOOO() : oooOOO0OooOO4.OooOOOo(oooOOO4, oooOOO0OooOOOO3.OooOOOO())).OooO00o(oooOOO0OooOOOO4);
                if (!oooOOO3.OooO()) {
                    if (!oooOOO3.OooO0oo()) {
                        oooOOO0OooO00o = oooOOO0OooO00o.OooO00o(oooOOO3.OooO0O0().OooOO0(oooOOO0OooOO5));
                    }
                }
                return new OooO0OO(oooOO0O, oooOOO0OooOOOO4, oooOOO0OooO00o, new OooOOO0[]{oooOOO0OooOO5}, this.f52790OooO0o0);
            }
            if (!zOooO0oo2) {
                oooOOO0OooOO0 = oooOOO0OooOO0.OooOO0(oooOOO2);
            }
            oooOOO0OooO00o = oooOOO0OooOO0.OooOOOo(oooOOO0OooO00o6, oooOOO0OooOO3).OooO00o(oooOOO0OooOOOO4);
            oooOOO0OooO00o = oooOOO0OooO00o.OooO00o(oooOOO0OooOO5);
            return new OooO0OO(oooOO0O, oooOOO0OooOOOO4, oooOOO0OooO00o, new OooOOO0[]{oooOOO0OooOO5}, this.f52790OooO0o0);
        }
    }

    public static class OooO0o extends OooO0O0 {
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

        /* JADX WARN: Code duplicated, block: B:60:0x0123  */
        /* JADX WARN: Code duplicated, block: B:61:0x0131  */
        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooO00o(OooOo00 oooOo00) {
            OooOOO0 oooOOO0OooOOOO;
            OooOOO0 oooOOO0OooOO0;
            OooOOO0 oooOOO0;
            OooOOO0 oooOOO1;
            OooOOO0[] oooOOO0Arr;
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
            int i = oooOO0O.f52763OooO0o;
            OooOOO0 oooOOO0OooOO1 = this.f52787OooO0O0;
            OooOOO0 oooOOO0OooOO2 = this.f52788OooO0OO;
            OooOOO0 oooOOO0OooOO3 = oooOo00.f52787OooO0O0;
            OooOOO0 oooOOO0OooOO4 = oooOo00.f52788OooO0OO;
            if (i == 0) {
                OooOOO0 OooOOo1 = oooOOO0OooOO3.OooOOo0(oooOOO0OooOO1);
                OooOOO0 OooOOo2 = oooOOO0OooOO4.OooOOo0(oooOOO0OooOO2);
                if (OooOOo1.OooO()) {
                    return OooOOo2.OooO() ? OooOOo() : oooOO0O.OooO();
                }
                OooOOO0 oooOOO0OooO0Oo = OooOOo2.OooO0Oo(OooOOo1);
                OooOOO0 OooOOo3 = oooOOO0OooO0Oo.OooOOOO().OooOOo0(oooOOO0OooOO1).OooOOo0(oooOOO0OooOO3);
                return new OooO0o(oooOO0O, OooOOo3, oooOOO0OooO0Oo.OooOO0(oooOOO0OooOO1.OooOOo0(OooOOo3)).OooOOo0(oooOOO0OooOO2), this.f52790OooO0o0);
            }
            if (i == 1) {
                OooOOO0 oooOOO0OooOO5 = this.f52789OooO0Oo[0];
                OooOOO0 oooOOO2 = oooOo00.f52789OooO0Oo[0];
                boolean zOooO0oo = oooOOO0OooOO5.OooO0oo();
                boolean zOooO0oo2 = oooOOO2.OooO0oo();
                if (!zOooO0oo) {
                    oooOOO0OooOO4 = oooOOO0OooOO4.OooOO0(oooOOO0OooOO5);
                }
                if (!zOooO0oo2) {
                    oooOOO0OooOO2 = oooOOO0OooOO2.OooOO0(oooOOO2);
                }
                OooOOO0 OooOOo4 = oooOOO0OooOO4.OooOOo0(oooOOO0OooOO2);
                if (!zOooO0oo) {
                    oooOOO0OooOO3 = oooOOO0OooOO3.OooOO0(oooOOO0OooOO5);
                }
                if (!zOooO0oo2) {
                    oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO2);
                }
                OooOOO0 OooOOo5 = oooOOO0OooOO3.OooOOo0(oooOOO0OooOO1);
                if (OooOOo5.OooO()) {
                    return OooOOo4.OooO() ? OooOOo() : oooOO0O.OooO();
                }
                if (zOooO0oo) {
                    oooOOO0OooOO5 = oooOOO2;
                } else if (!zOooO0oo2) {
                    oooOOO0OooOO5 = oooOOO0OooOO5.OooOO0(oooOOO2);
                }
                OooOOO0 oooOOO0OooOOOO2 = OooOOo5.OooOOOO();
                OooOOO0 oooOOO0OooOO6 = oooOOO0OooOOOO2.OooOO0(OooOOo5);
                OooOOO0 oooOOO0OooOO7 = oooOOO0OooOOOO2.OooOO0(oooOOO0OooOO1);
                OooOOO0 OooOOo6 = OooOOo4.OooOOOO().OooOO0(oooOOO0OooOO5).OooOOo0(oooOOO0OooOO6).OooOOo0(oooOOO0OooOO7.OooO00o(oooOOO0OooOO7));
                return new OooO0o(oooOO0O, OooOOo5.OooOO0(OooOOo6), oooOOO0OooOO7.OooOOo0(OooOOo6).OooOO0O(OooOOo4, oooOOO0OooOO2, oooOOO0OooOO6), new OooOOO0[]{oooOOO0OooOO6.OooOO0(oooOOO0OooOO5)}, this.f52790OooO0o0);
            }
            if (i != 2 && i != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            OooOOO0 oooOOO3 = this.f52789OooO0Oo[0];
            OooOOO0 oooOOO4 = oooOo00.f52789OooO0Oo[0];
            boolean zOooO0oo3 = oooOOO3.OooO0oo();
            if (zOooO0oo3 || !oooOOO3.equals(oooOOO4)) {
                if (!zOooO0oo3) {
                    OooOOO0 oooOOO0OooOOOO3 = oooOOO3.OooOOOO();
                    oooOOO0OooOO3 = oooOOO0OooOOOO3.OooOO0(oooOOO0OooOO3);
                    oooOOO0OooOO4 = oooOOO0OooOOOO3.OooOO0(oooOOO3).OooOO0(oooOOO0OooOO4);
                }
                boolean zOooO0oo4 = oooOOO4.OooO0oo();
                if (!zOooO0oo4) {
                    OooOOO0 oooOOO0OooOOOO4 = oooOOO4.OooOOOO();
                    oooOOO0OooOO1 = oooOOO0OooOOOO4.OooOO0(oooOOO0OooOO1);
                    oooOOO0OooOO2 = oooOOO0OooOOOO4.OooOO0(oooOOO4).OooOO0(oooOOO0OooOO2);
                }
                OooOOO0 OooOOo7 = oooOOO0OooOO1.OooOOo0(oooOOO0OooOO3);
                OooOOO0 OooOOo8 = oooOOO0OooOO2.OooOOo0(oooOOO0OooOO4);
                if (OooOOo7.OooO()) {
                    return OooOOo8.OooO() ? OooOOo() : oooOO0O.OooO();
                }
                oooOOO0OooOOOO = OooOOo7.OooOOOO();
                OooOOO0 oooOOO0OooOO8 = oooOOO0OooOOOO.OooOO0(OooOOo7);
                OooOOO0 oooOOO0OooOO9 = oooOOO0OooOOOO.OooOO0(oooOOO0OooOO1);
                OooOOO0 OooOOo9 = OooOOo8.OooOOOO().OooO00o(oooOOO0OooOO8).OooOOo0(oooOOO0OooOO9.OooO00o(oooOOO0OooOO9));
                OooOOO0 oooOOO0OooOO0O = oooOOO0OooOO9.OooOOo0(OooOOo9).OooOO0O(OooOOo8, oooOOO0OooOO8, oooOOO0OooOO2);
                OooOOO0 oooOOO0OooOO10 = !zOooO0oo3 ? OooOOo7.OooOO0(oooOOO3) : OooOOo7;
                oooOOO0OooOO0 = !zOooO0oo4 ? oooOOO0OooOO10.OooOO0(oooOOO4) : oooOOO0OooOO10;
                oooOOO0 = oooOOO0OooOO0O;
                oooOOO1 = OooOOo9;
                if (oooOOO0OooOO0 != OooOOo7) {
                }
                if (i == 4) {
                    oooOOO0Arr = new OooOOO0[]{oooOOO0OooOO0, OooOOoo(oooOOO0OooOO0, oooOOO0OooOOOO)};
                } else {
                    oooOOO0Arr = new OooOOO0[]{oooOOO0OooOO0};
                }
                return new OooO0o(oooOO0O, oooOOO1, oooOOO0, oooOOO0Arr, this.f52790OooO0o0);
            }
            OooOOO0 OooOOo10 = oooOOO0OooOO1.OooOOo0(oooOOO0OooOO3);
            OooOOO0 OooOOo11 = oooOOO0OooOO2.OooOOo0(oooOOO0OooOO4);
            if (OooOOo10.OooO()) {
                return OooOOo11.OooO() ? OooOOo() : oooOO0O.OooO();
            }
            OooOOO0 oooOOO0OooOOOO5 = OooOOo10.OooOOOO();
            OooOOO0 oooOOO0OooOO11 = oooOOO0OooOO1.OooOO0(oooOOO0OooOOOO5);
            OooOOO0 oooOOO0OooOO12 = oooOOO0OooOO3.OooOO0(oooOOO0OooOOOO5);
            OooOOO0 oooOOO0OooOO13 = oooOOO0OooOO11.OooOOo0(oooOOO0OooOO12).OooOO0(oooOOO0OooOO2);
            OooOOO0 OooOOo12 = OooOOo11.OooOOOO().OooOOo0(oooOOO0OooOO11).OooOOo0(oooOOO0OooOO12);
            OooOOO0 OooOOo13 = oooOOO0OooOO11.OooOOo0(OooOOo12).OooOO0(OooOOo11).OooOOo0(oooOOO0OooOO13);
            oooOOO0OooOO0 = OooOOo10.OooOO0(oooOOO3);
            oooOOO0 = OooOOo13;
            oooOOO1 = OooOOo12;
            oooOOO0OooOOOO = null;
            if (i == 4) {
                oooOOO0Arr = new OooOOO0[]{oooOOO0OooOO0, OooOOoo(oooOOO0OooOO0, oooOOO0OooOOOO)};
            } else {
                oooOOO0Arr = new OooOOO0[]{oooOOO0OooOO0};
            }
            return new OooO0o(oooOO0O, oooOOO1, oooOOO0, oooOOO0Arr, this.f52790OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooO0OO() {
            return new OooO0o(null, OooO0o0(), OooO0o(), false);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooOOO0() {
            if (OooOO0()) {
                return this;
            }
            OooOO0O oooOO0O = this.f52786OooO00o;
            return oooOO0O.f52763OooO0o != 0 ? new OooO0o(oooOO0O, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0) : new OooO0o(oooOO0O, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52790OooO0o0);
        }

        @Override // p696oO0OO0oo.OooOo00
        public final OooOo00 OooOOo() {
            OooOOO0 OooOOo1;
            OooOOO0 oooOOO0OooOO0;
            if (OooOO0()) {
                return this;
            }
            OooOO0O oooOO0O = this.f52786OooO00o;
            OooOOO0 oooOOO0 = this.f52788OooO0OO;
            if (oooOOO0.OooO()) {
                return oooOO0O.OooO();
            }
            int i = oooOO0O.f52763OooO0o;
            OooOOO0 oooOOO1 = this.f52787OooO0O0;
            if (i == 0) {
                OooOOO0 oooOOO0OooO0Oo = OooOo0(oooOOO1.OooOOOO()).OooO00o(this.f52786OooO00o.f52760OooO0O0).OooO0Oo(oooOOO0.OooO00o(oooOOO0));
                OooOOO0 OooOOo2 = oooOOO0OooO0Oo.OooOOOO().OooOOo0(oooOOO1.OooO00o(oooOOO1));
                return new OooO0o(oooOO0O, OooOOo2, oooOOO0OooO0Oo.OooOO0(oooOOO1.OooOOo0(OooOOo2)).OooOOo0(oooOOO0), this.f52790OooO0o0);
            }
            if (i == 1) {
                OooOOO0 oooOOO2 = this.f52789OooO0Oo[0];
                boolean zOooO0oo = oooOOO2.OooO0oo();
                OooOOO0 oooOOO0OooOO1 = oooOO0O.f52760OooO0O0;
                if (!oooOOO0OooOO1.OooO() && !zOooO0oo) {
                    oooOOO0OooOO1 = oooOOO0OooOO1.OooOO0(oooOOO2.OooOOOO());
                }
                OooOOO0 oooOOO0OooO00o = oooOOO0OooOO1.OooO00o(OooOo0(oooOOO1.OooOOOO()));
                OooOOO0 oooOOO0OooOO2 = zOooO0oo ? oooOOO0 : oooOOO0.OooOO0(oooOOO2);
                OooOOO0 oooOOO0OooOOOO = zOooO0oo ? oooOOO0.OooOOOO() : oooOOO0OooOO2.OooOO0(oooOOO0);
                OooOOO0 oooOOO0OooOo00 = OooOo00(oooOOO1.OooOO0(oooOOO0OooOOOO));
                OooOOO0 OooOOo3 = oooOOO0OooO00o.OooOOOO().OooOOo0(oooOOO0OooOo00.OooO00o(oooOOO0OooOo00));
                OooOOO0 oooOOO0OooO00o2 = oooOOO0OooOO2.OooO00o(oooOOO0OooOO2);
                OooOOO0 oooOOO0OooOO3 = OooOOo3.OooOO0(oooOOO0OooO00o2);
                OooOOO0 oooOOO0OooO00o3 = oooOOO0OooOOOO.OooO00o(oooOOO0OooOOOO);
                OooOOO0 oooOOO0OooOO4 = oooOOO0OooOo00.OooOOo0(OooOOo3).OooOO0(oooOOO0OooO00o);
                OooOOO0 oooOOO0OooOOOO2 = oooOOO0OooO00o3.OooOOOO();
                OooOOO0 OooOOo4 = oooOOO0OooOO4.OooOOo0(oooOOO0OooOOOO2.OooO00o(oooOOO0OooOOOO2));
                OooOOO0 oooOOO0OooO00o4 = zOooO0oo ? oooOOO0OooO00o3.OooO00o(oooOOO0OooO00o3) : oooOOO0OooO00o2.OooOOOO();
                return new OooO0o(oooOO0O, oooOOO0OooOO3, OooOOo4, new OooOOO0[]{oooOOO0OooO00o4.OooO00o(oooOOO0OooO00o4).OooOO0(oooOOO0OooOO2)}, this.f52790OooO0o0);
            }
            if (i != 2) {
                if (i != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                OooOOO0 oooOOO3 = this.f52788OooO0OO;
                OooOOO0[] oooOOO0Arr = this.f52789OooO0Oo;
                OooOOO0 oooOOO4 = oooOOO0Arr[0];
                OooOOO0 oooOOO0OooOOoo = oooOOO0Arr[1];
                if (oooOOO0OooOOoo == null) {
                    oooOOO0OooOOoo = OooOOoo(oooOOO0Arr[0], null);
                    oooOOO0Arr[1] = oooOOO0OooOOoo;
                }
                OooOOO0 oooOOO0OooO00o5 = OooOo0(oooOOO1.OooOOOO()).OooO00o(oooOOO0OooOOoo);
                OooOOO0 oooOOO0OooO00o6 = oooOOO3.OooO00o(oooOOO3);
                OooOOO0 oooOOO0OooOO5 = oooOOO0OooO00o6.OooOO0(oooOOO3);
                OooOOO0 oooOOO0OooOO6 = oooOOO1.OooOO0(oooOOO0OooOO5);
                OooOOO0 oooOOO0OooO00o7 = oooOOO0OooOO6.OooO00o(oooOOO0OooOO6);
                OooOOO0 OooOOo5 = oooOOO0OooO00o5.OooOOOO().OooOOo0(oooOOO0OooO00o7.OooO00o(oooOOO0OooO00o7));
                OooOOO0 oooOOO0OooOOOO3 = oooOOO0OooOO5.OooOOOO();
                OooOOO0 oooOOO0OooO00o8 = oooOOO0OooOOOO3.OooO00o(oooOOO0OooOOOO3);
                OooOOO0 OooOOo6 = oooOOO0OooO00o5.OooOO0(oooOOO0OooO00o7.OooOOo0(OooOOo5)).OooOOo0(oooOOO0OooO00o8);
                OooOOO0 oooOOO0OooOO7 = oooOOO0OooO00o8.OooOO0(oooOOO0OooOOoo);
                OooOOO0 oooOOO0OooO00o9 = oooOOO0OooOO7.OooO00o(oooOOO0OooOO7);
                if (!oooOOO4.OooO0oo()) {
                    oooOOO0OooO00o6 = oooOOO0OooO00o6.OooOO0(oooOOO4);
                }
                return new OooO0o(this.f52786OooO00o, OooOOo5, OooOOo6, new OooOOO0[]{oooOOO0OooO00o6, oooOOO0OooO00o9}, this.f52790OooO0o0);
            }
            OooOOO0 oooOOO5 = this.f52789OooO0Oo[0];
            boolean zOooO0oo2 = oooOOO5.OooO0oo();
            OooOOO0 oooOOO0OooOOOO4 = oooOOO0.OooOOOO();
            OooOOO0 oooOOO0OooOOOO5 = oooOOO0OooOOOO4.OooOOOO();
            OooOOO0 oooOOO0OooOO8 = oooOO0O.f52760OooO0O0;
            OooOOO0 OooOOO1 = oooOOO0OooOO8.OooOOO0();
            if (OooOOO1.OooOOoo().equals(BigInteger.valueOf(3L))) {
                OooOOO0 oooOOO0OooOOOO6 = zOooO0oo2 ? oooOOO5 : oooOOO5.OooOOOO();
                OooOOo1 = OooOo0(oooOOO1.OooO00o(oooOOO0OooOOOO6).OooOO0(oooOOO1.OooOOo0(oooOOO0OooOOOO6)));
                oooOOO0OooOO0 = oooOOO0OooOOOO4.OooOO0(oooOOO1);
            } else {
                OooOOO0 oooOOO0OooOo0 = OooOo0(oooOOO1.OooOOOO());
                if (zOooO0oo2) {
                    OooOOo1 = oooOOO0OooOo0.OooO00o(oooOOO0OooOO8);
                } else if (oooOOO0OooOO8.OooO()) {
                    OooOOo1 = oooOOO0OooOo0;
                } else {
                    OooOOO0 oooOOO0OooOOOO7 = oooOOO5.OooOOOO().OooOOOO();
                    if (OooOOO1.OooO0OO() < oooOOO0OooOO8.OooO0OO()) {
                        OooOOo1 = oooOOO0OooOo0.OooOOo0(oooOOO0OooOOOO7.OooOO0(OooOOO1));
                    } else {
                        oooOOO0OooOO8 = oooOOO0OooOOOO7.OooOO0(oooOOO0OooOO8);
                        OooOOo1 = oooOOO0OooOo0.OooO00o(oooOOO0OooOO8);
                    }
                }
                oooOOO0OooOO0 = oooOOO1.OooOO0(oooOOO0OooOOOO4);
            }
            OooOOO0 oooOOO0OooOo01 = OooOo00(oooOOO0OooOO0);
            OooOOO0 OooOOo7 = OooOOo1.OooOOOO().OooOOo0(oooOOO0OooOo01.OooO00o(oooOOO0OooOo01));
            OooOOO0 OooOOo8 = oooOOO0OooOo01.OooOOo0(OooOOo7).OooOO0(OooOOo1).OooOOo0(OooOo00(oooOOO0OooOOOO5.OooO00o(oooOOO0OooOOOO5)));
            OooOOO0 oooOOO0OooO00o10 = oooOOO0.OooO00o(oooOOO0);
            if (!zOooO0oo2) {
                oooOOO0OooO00o10 = oooOOO0OooO00o10.OooOO0(oooOOO5);
            }
            return new OooO0o(oooOO0O, OooOOo7, OooOOo8, new OooOOO0[]{oooOOO0OooO00o10}, this.f52790OooO0o0);
        }

        public final OooOOO0 OooOOoo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            OooOOO0 oooOOO2 = this.f52786OooO00o.f52760OooO0O0;
            if (oooOOO2.OooO() || oooOOO0.OooO0oo()) {
                return oooOOO2;
            }
            if (oooOOO1 == null) {
                oooOOO1 = oooOOO0.OooOOOO();
            }
            OooOOO0 oooOOO0OooOOOO = oooOOO1.OooOOOO();
            OooOOO0 OooOOO1 = oooOOO2.OooOOO0();
            return OooOOO1.OooO0OO() < oooOOO2.OooO0OO() ? oooOOO0OooOOOO.OooOO0(OooOOO1).OooOOO0() : oooOOO0OooOOOO.OooOO0(oooOOO2);
        }

        public final OooOOO0 OooOo0(OooOOO0 oooOOO0) {
            return oooOOO0.OooO00o(oooOOO0).OooO00o(oooOOO0);
        }

        public final OooOOO0 OooOo00(OooOOO0 oooOOO0) {
            OooOOO0 oooOOO0OooO00o = oooOOO0.OooO00o(oooOOO0);
            return oooOOO0OooO00o.OooO00o(oooOOO0OooO00o);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOo00(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
        OooOOO0[] oooOOO0Arr;
        int i = oooOO0O == null ? 0 : oooOO0O.f52763OooO0o;
        if (i == 0 || i == 5) {
            oooOOO0Arr = f52785OooO0o;
        } else {
            OooOOO0 oooOOO0OooO0oO = oooOO0O.OooO0oO(OooOO0.f52757OooO0O0);
            if (i == 1 || i == 2) {
                oooOOO0Arr = new OooOOO0[]{oooOOO0OooO0oO};
            } else if (i == 3) {
                oooOOO0Arr = new OooOOO0[]{oooOOO0OooO0oO, oooOOO0OooO0oO, oooOOO0OooO0oO};
            } else if (i != 4) {
                if (i != 6) {
                    throw new IllegalArgumentException("unknown coordinate system");
                }
                oooOOO0Arr = new OooOOO0[]{oooOOO0OooO0oO};
            } else {
                oooOOO0Arr = new OooOOO0[]{oooOOO0OooO0oO, oooOO0O.f52760OooO0O0};
            }
        }
        this(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
    }

    public OooOo00(OooOO0O oooOO0O, OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0[] oooOOO0Arr) {
        this.f52786OooO00o = oooOO0O;
        this.f52787OooO0O0 = oooOOO0;
        this.f52788OooO0OO = oooOOO1;
        this.f52789OooO0Oo = oooOOO0Arr;
    }

    public OooOOO0 OooO() {
        OooOOO0[] oooOOO0Arr = this.f52789OooO0Oo;
        if (oooOOO0Arr.length <= 0) {
            return null;
        }
        return oooOOO0Arr[0];
    }

    public abstract OooOo00 OooO00o(OooOo00 oooOo00);

    public final OooOo00 OooO0O0(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
        return this.f52786OooO00o.OooO0OO(this.f52787OooO0O0.OooOO0(oooOOO0), this.f52788OooO0OO.OooOO0(oooOOO1), this.f52790OooO0o0);
    }

    public abstract OooOo00 OooO0OO();

    public final boolean OooO0Oo(OooOo00 oooOo00) {
        OooOo00 oooOo00OooOOO;
        if (oooOo00 == null) {
            return false;
        }
        OooOO0O oooOO0O = this.f52786OooO00o;
        OooOO0O oooOO0O2 = oooOo00.f52786OooO00o;
        boolean z = oooOO0O == null;
        boolean z2 = oooOO0O2 == null;
        boolean zOooOO0 = OooOO0();
        boolean zOooOO1 = oooOo00.OooOO0();
        if (zOooOO0 || zOooOO1) {
            if (zOooOO0 && zOooOO1) {
                return z || z2 || oooOO0O.OooO0o(oooOO0O2);
            }
            return false;
        }
        if (z && z2) {
            oooOo00OooOOO = this;
        } else if (z) {
            oooOo00 = oooOo00.OooOOO();
            oooOo00OooOOO = this;
        } else if (z2) {
            oooOo00OooOOO = OooOOO();
        } else {
            if (!oooOO0O.OooO0o(oooOO0O2)) {
                return false;
            }
            OooOo00[] oooOo00Arr = new OooOo00[2];
            oooOo00Arr[0] = this;
            oooOo00Arr[1] = oooOO0O.OooOO0(oooOo00);
            for (int i = 0; i < 2; i++) {
                OooOo00 oooOo01 = oooOo00Arr[0 + i];
                if (oooOo01 != null && oooOO0O != oooOo01.f52786OooO00o) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
            int i2 = oooOO0O.f52763OooO0o;
            if (i2 != 0 && i2 != 5) {
                OooOOO0[] oooOOO0Arr = new OooOOO0[2];
                int[] iArr = new int[2];
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = 0 + i4;
                    OooOo00 oooOo02 = oooOo00Arr[i5];
                    if (oooOo02 != null && !oooOo02.OooOO0O()) {
                        oooOOO0Arr[i3] = oooOo02.OooO();
                        iArr[i3] = i5;
                        i3++;
                    }
                }
                if (i3 != 0) {
                    OooOOO0[] oooOOO0Arr2 = new OooOOO0[i3];
                    oooOOO0Arr2[0] = oooOOO0Arr[0];
                    int i6 = 0;
                    while (true) {
                        i6++;
                        if (i6 >= i3) {
                            break;
                        }
                        oooOOO0Arr2[i6] = oooOOO0Arr2[i6 - 1].OooOO0(oooOOO0Arr[0 + i6]);
                    }
                    int i7 = i6 - 1;
                    OooOOO0 oooOOO0OooO0oO = oooOOO0Arr2[i7].OooO0oO();
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        int i9 = i7 + 0;
                        OooOOO0 oooOOO0 = oooOOO0Arr[i9];
                        oooOOO0Arr[i9] = oooOOO0Arr2[i8].OooOO0(oooOOO0OooO0oO);
                        oooOOO0OooO0oO = oooOOO0OooO0oO.OooOO0(oooOOO0);
                        i7 = i8;
                    }
                    oooOOO0Arr[0] = oooOOO0OooO0oO;
                    for (int i10 = 0; i10 < i3; i10++) {
                        int i11 = iArr[i10];
                        oooOo00Arr[i11] = oooOo00Arr[i11].OooOOOO(oooOOO0Arr[i10]);
                    }
                }
            }
            oooOo00OooOOO = oooOo00Arr[0];
            oooOo00 = oooOo00Arr[1];
        }
        return oooOo00OooOOO.f52787OooO0O0.equals(oooOo00.f52787OooO0O0) && oooOo00OooOOO.OooO0oo().equals(oooOo00.OooO0oo());
    }

    public final OooOOO0 OooO0o() {
        if (OooOO0O()) {
            return OooO0oo();
        }
        throw new IllegalStateException("point not in normal form");
    }

    public final OooOOO0 OooO0o0() {
        if (OooOO0O()) {
            return this.f52787OooO0O0;
        }
        throw new IllegalStateException("point not in normal form");
    }

    public final int OooO0oO() {
        OooOO0O oooOO0O = this.f52786OooO00o;
        if (oooOO0O == null) {
            return 0;
        }
        return oooOO0O.f52763OooO0o;
    }

    public OooOOO0 OooO0oo() {
        return this.f52788OooO0OO;
    }

    public final boolean OooOO0() {
        if (this.f52787OooO0O0 != null && this.f52788OooO0OO != null) {
            OooOOO0[] oooOOO0Arr = this.f52789OooO0Oo;
            if (oooOOO0Arr.length <= 0 || !oooOOO0Arr[0].OooO()) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOO0O() {
        int iOooO0oO = OooO0oO();
        return iOooO0oO == 0 || iOooO0oO == 5 || OooOO0() || this.f52789OooO0Oo[0].OooO0oo();
    }

    public final boolean OooOO0o() {
        return OooOO0() || this.f52786OooO00o == null || (OooOOo0() && OooOOOo());
    }

    public final OooOo00 OooOOO() {
        int iOooO0oO;
        if (OooOO0() || (iOooO0oO = OooO0oO()) == 0 || iOooO0oO == 5) {
            return this;
        }
        OooOOO0 oooOOO0OooO = OooO();
        return oooOOO0OooO.OooO0oo() ? this : OooOOOO(oooOOO0OooO.OooO0oO());
    }

    public abstract OooOo00 OooOOO0();

    public final OooOo00 OooOOOO(OooOOO0 oooOOO0) {
        int iOooO0oO = OooO0oO();
        if (iOooO0oO != 1) {
            if (iOooO0oO == 2 || iOooO0oO == 3 || iOooO0oO == 4) {
                OooOOO0 oooOOO0OooOOOO = oooOOO0.OooOOOO();
                return OooO0O0(oooOOO0OooOOOO, oooOOO0OooOOOO.OooOO0(oooOOO0));
            }
            if (iOooO0oO != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return OooO0O0(oooOOO0, oooOOO0);
    }

    public final boolean OooOOOo() {
        BigInteger bigInteger = this.f52786OooO00o.f52764OooO0o0;
        if (bigInteger != null && !bigInteger.equals(OooOO0.f52757OooO0O0)) {
            BigInteger bigIntegerAbs = bigInteger.abs();
            OooOo00 oooOo00OooO = this.f52786OooO00o.OooO();
            int iBitLength = bigIntegerAbs.bitLength();
            if (iBitLength > 0) {
                if (bigIntegerAbs.testBit(0)) {
                    oooOo00OooO = this;
                }
                OooOo00 oooOo00OooOOo = this;
                for (int i = 1; i < iBitLength; i++) {
                    oooOo00OooOOo = oooOo00OooOOo.OooOOo();
                    if (bigIntegerAbs.testBit(i)) {
                        oooOo00OooO = oooOo00OooO.OooO00o(oooOo00OooOOo);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                oooOo00OooO = oooOo00OooO.OooOOO0();
            }
            if (oooOo00OooO.OooOO0()) {
                return false;
            }
        }
        return true;
    }

    public abstract OooOo00 OooOOo();

    public abstract boolean OooOOo0();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOo00) {
            return OooO0Oo((OooOo00) obj);
        }
        return false;
    }

    public final int hashCode() {
        OooOO0O oooOO0O = this.f52786OooO00o;
        int i = oooOO0O == null ? 0 : ~oooOO0O.hashCode();
        if (OooOO0()) {
            return i;
        }
        OooOo00 oooOo00OooOOO = OooOOO();
        return (i ^ (oooOo00OooOOO.f52787OooO0O0.hashCode() * 17)) ^ (oooOo00OooOOO.OooO0oo().hashCode() * 257);
    }

    public final String toString() {
        if (OooOO0()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.f52787OooO0O0);
        stringBuffer.append(',');
        stringBuffer.append(this.f52788OooO0OO);
        for (int i = 0; i < this.f52789OooO0Oo.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.f52789OooO0Oo[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
