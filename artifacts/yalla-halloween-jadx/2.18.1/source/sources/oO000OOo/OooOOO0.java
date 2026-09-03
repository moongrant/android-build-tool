package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends oO0OO0oo.OooOo00.OooO0O0 {
    public OooOOO0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public OooOOO0(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1, oooOOO0Arr);
        this.f52790OooO0o0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO00o(p696oO0OO0oo.OooOo00 oooOo00) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i;
        OooOO0O oooOO0O;
        if (OooOO0()) {
            return oooOo00;
        }
        if (oooOo00.OooOO0()) {
            return this;
        }
        if (this == oooOo00) {
            return OooOOo();
        }
        p696oO0OO0oo.OooOO0O oooOO0O2 = this.f52786OooO00o;
        OooOO0O oooOO0O3 = (OooOO0O) this.f52787OooO0O0;
        OooOO0O oooOO0O4 = (OooOO0O) this.f52788OooO0OO;
        OooOO0O oooOO0O5 = (OooOO0O) oooOo00.f52787OooO0O0;
        OooOO0O oooOO0O6 = (OooOO0O) oooOo00.OooO0oo();
        OooOO0O oooOO0O7 = (OooOO0O) this.f52789OooO0Oo[0];
        OooOO0O oooOO0O8 = (OooOO0O) oooOo00.OooO();
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zOooO0oo = oooOO0O7.OooO0oo();
        if (zOooO0oo) {
            iArr = oooOO0O5.f52571OooO0Oo;
            iArr2 = oooOO0O6.f52571OooO0Oo;
        } else {
            com.android.billingclient.api.o0000.OooOO0O(oooOO0O7.f52571OooO0Oo, iArr7);
            com.android.billingclient.api.o0000.OooO0o0(iArr7, oooOO0O5.f52571OooO0Oo, iArr6);
            com.android.billingclient.api.o0000.OooO0o0(iArr7, oooOO0O7.f52571OooO0Oo, iArr7);
            com.android.billingclient.api.o0000.OooO0o0(iArr7, oooOO0O6.f52571OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = oooOO0O8.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = oooOO0O3.f52571OooO0Oo;
            iArr4 = oooOO0O4.f52571OooO0Oo;
        } else {
            com.android.billingclient.api.o0000.OooOO0O(oooOO0O8.f52571OooO0Oo, iArr8);
            com.android.billingclient.api.o0000.OooO0o0(iArr8, oooOO0O3.f52571OooO0Oo, iArr5);
            com.android.billingclient.api.o0000.OooO0o0(iArr8, oooOO0O8.f52571OooO0Oo, iArr8);
            com.android.billingclient.api.o0000.OooO0o0(iArr8, oooOO0O4.f52571OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[5];
        com.android.billingclient.api.o0000.OooOOO0(iArr3, iArr, iArr9);
        com.android.billingclient.api.o0000.OooOOO0(iArr4, iArr2, iArr6);
        if (p697oO0OOo0o.Oooo0.OooO0oO(iArr9)) {
            return p697oO0OOo0o.Oooo0.OooO0oO(iArr6) ? OooOOo() : oooOO0O2.OooO();
        }
        com.android.billingclient.api.o0000.OooOO0O(iArr9, iArr7);
        int[] iArr10 = new int[5];
        com.android.billingclient.api.o0000.OooO0o0(iArr7, iArr9, iArr10);
        com.android.billingclient.api.o0000.OooO0o0(iArr7, iArr3, iArr7);
        com.android.billingclient.api.o0000.OooO0o(iArr10, iArr10);
        p697oO0OOo0o.Oooo0.OooO0oo(iArr4, iArr10, iArr5);
        com.android.billingclient.api.o0000.OooO(p697oO0OOo0o.Oooo0.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        OooOO0O oooOO0O9 = new OooOO0O(iArr8);
        com.android.billingclient.api.o0000.OooOO0O(iArr6, iArr8);
        int[] iArr11 = oooOO0O9.f52571OooO0Oo;
        com.android.billingclient.api.o0000.OooOOO0(iArr11, iArr10, iArr11);
        OooOO0O oooOO0O10 = new OooOO0O(iArr10);
        com.android.billingclient.api.o0000.OooOOO0(iArr7, oooOO0O9.f52571OooO0Oo, iArr10);
        if (p697oO0OOo0o.Oooo0.OooO(oooOO0O10.f52571OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[9] == -1) {
                i = 10;
                if (p399o0Oo00oo.o00000OO.OooOO0O(10, iArr5, com.android.billingclient.api.o0000.f11260OooO0OO)) {
                }
            }
            com.android.billingclient.api.o0000.OooO0oo(iArr5, oooOO0O10.f52571OooO0Oo);
            oooOO0O = new OooOO0O(iArr9);
            if (!zOooO0oo) {
                com.android.billingclient.api.o0000.OooO0o0(iArr9, oooOO0O7.f52571OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = oooOO0O.f52571OooO0Oo;
                com.android.billingclient.api.o0000.OooO0o0(iArr12, oooOO0O8.f52571OooO0Oo, iArr12);
            }
            return new OooOOO0(oooOO0O2, oooOO0O9, oooOO0O10, new p696oO0OO0oo.OooOOO0[]{oooOO0O}, this.f52790OooO0o0);
        }
        i = 10;
        if (p399o0Oo00oo.o00000OO.OooO0Oo(7, com.android.billingclient.api.o0000.f11261OooO0Oo, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(i, iArr5, 7);
        }
        com.android.billingclient.api.o0000.OooO0oo(iArr5, oooOO0O10.f52571OooO0Oo);
        oooOO0O = new OooOO0O(iArr9);
        if (!zOooO0oo) {
            com.android.billingclient.api.o0000.OooO0o0(iArr9, oooOO0O7.f52571OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = oooOO0O.f52571OooO0Oo;
            com.android.billingclient.api.o0000.OooO0o0(iArr13, oooOO0O8.f52571OooO0Oo, iArr13);
        }
        return new OooOOO0(oooOO0O2, oooOO0O9, oooOO0O10, new p696oO0OO0oo.OooOOO0[]{oooOO0O}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new OooOOO0(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new OooOOO0(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        OooOO0O oooOO0O2 = (OooOO0O) this.f52788OooO0OO;
        if (oooOO0O2.OooO()) {
            return oooOO0O.OooO();
        }
        OooOO0O oooOO0O3 = (OooOO0O) this.f52787OooO0O0;
        OooOO0O oooOO0O4 = (OooOO0O) this.f52789OooO0Oo[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        com.android.billingclient.api.o0000.OooOO0O(oooOO0O2.f52571OooO0Oo, iArr3);
        int[] iArr4 = new int[5];
        com.android.billingclient.api.o0000.OooOO0O(iArr3, iArr4);
        boolean zOooO0oo = oooOO0O4.OooO0oo();
        int[] iArr5 = oooOO0O4.f52571OooO0Oo;
        if (!zOooO0oo) {
            com.android.billingclient.api.o0000.OooOO0O(iArr5, iArr2);
            iArr5 = iArr2;
        }
        com.android.billingclient.api.o0000.OooOOO0(oooOO0O3.f52571OooO0Oo, iArr5, iArr);
        com.android.billingclient.api.o0000.OooO0O0(oooOO0O3.f52571OooO0Oo, iArr5, iArr2);
        com.android.billingclient.api.o0000.OooO0o0(iArr2, iArr, iArr2);
        com.android.billingclient.api.o0000.OooO(p697oO0OOo0o.Oooo0.OooO0O0(iArr2, iArr2, iArr2), iArr2);
        com.android.billingclient.api.o0000.OooO0o0(iArr3, oooOO0O3.f52571OooO0Oo, iArr3);
        com.android.billingclient.api.o0000.OooO(p399o0Oo00oo.o00000OO.OooOOoo(5, iArr3), iArr3);
        com.android.billingclient.api.o0000.OooO(p399o0Oo00oo.o00000OO.OooOo00(5, iArr4, iArr), iArr);
        OooOO0O oooOO0O5 = new OooOO0O(iArr4);
        com.android.billingclient.api.o0000.OooOO0O(iArr2, iArr4);
        int[] iArr6 = oooOO0O5.f52571OooO0Oo;
        com.android.billingclient.api.o0000.OooOOO0(iArr6, iArr3, iArr6);
        int[] iArr7 = oooOO0O5.f52571OooO0Oo;
        com.android.billingclient.api.o0000.OooOOO0(iArr7, iArr3, iArr7);
        OooOO0O oooOO0O6 = new OooOO0O(iArr3);
        com.android.billingclient.api.o0000.OooOOO0(iArr3, oooOO0O5.f52571OooO0Oo, iArr3);
        int[] iArr8 = oooOO0O6.f52571OooO0Oo;
        com.android.billingclient.api.o0000.OooO0o0(iArr8, iArr2, iArr8);
        int[] iArr9 = oooOO0O6.f52571OooO0Oo;
        com.android.billingclient.api.o0000.OooOOO0(iArr9, iArr, iArr9);
        OooOO0O oooOO0O7 = new OooOO0O(iArr2);
        if (p399o0Oo00oo.o00000OO.OooOOo(5, oooOO0O2.f52571OooO0Oo, 0, iArr2) != 0 || (iArr2[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr2, com.android.billingclient.api.o0000.f11259OooO0O0))) {
            p399o0Oo00oo.o00000OO.OooO0oO(5, -2147483647, iArr2);
        }
        if (!zOooO0oo) {
            int[] iArr10 = oooOO0O7.f52571OooO0Oo;
            com.android.billingclient.api.o0000.OooO0o0(iArr10, oooOO0O4.f52571OooO0Oo, iArr10);
        }
        return new OooOOO0(oooOO0O, oooOO0O5, oooOO0O6, new p696oO0OO0oo.OooOOO0[]{oooOO0O7}, this.f52790OooO0o0);
    }
}
