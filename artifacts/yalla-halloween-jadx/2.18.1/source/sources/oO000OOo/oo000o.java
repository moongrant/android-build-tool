package oO000OOo;

import p101o000oOoo.oO00O0o0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends oO0OO0oo.OooOo00.OooO0O0 {
    public oo000o(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public oo000o(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
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
        o00Ooo o00ooo2;
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
        o00Ooo o00ooo3 = (o00Ooo) this.f52787OooO0O0;
        o00Ooo o00ooo4 = (o00Ooo) this.f52788OooO0OO;
        o00Ooo o00ooo5 = (o00Ooo) oooOo00.f52787OooO0O0;
        o00Ooo o00ooo6 = (o00Ooo) oooOo00.OooO0oo();
        o00Ooo o00ooo7 = (o00Ooo) this.f52789OooO0Oo[0];
        o00Ooo o00ooo8 = (o00Ooo) oooOo00.OooO();
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zOooO0oo = o00ooo7.OooO0oo();
        if (zOooO0oo) {
            iArr = o00ooo5.f52643OooO0Oo;
            iArr2 = o00ooo6.f52643OooO0Oo;
        } else {
            o00Oo0.OooO0oO(o00ooo7.f52643OooO0Oo, iArr7);
            o00Oo0.OooO0OO(iArr7, o00ooo5.f52643OooO0Oo, iArr6);
            o00Oo0.OooO0OO(iArr7, o00ooo7.f52643OooO0Oo, iArr7);
            o00Oo0.OooO0OO(iArr7, o00ooo6.f52643OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o00ooo8.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o00ooo3.f52643OooO0Oo;
            iArr4 = o00ooo4.f52643OooO0Oo;
        } else {
            o00Oo0.OooO0oO(o00ooo8.f52643OooO0Oo, iArr8);
            o00Oo0.OooO0OO(iArr8, o00ooo3.f52643OooO0Oo, iArr5);
            o00Oo0.OooO0OO(iArr8, o00ooo8.f52643OooO0Oo, iArr8);
            o00Oo0.OooO0OO(iArr8, o00ooo4.f52643OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[6];
        o00Oo0.OooO(iArr3, iArr, iArr9);
        o00Oo0.OooO(iArr4, iArr2, iArr6);
        if (oO00O0o0.OooOOo0(iArr9)) {
            return oO00O0o0.OooOOo0(iArr6) ? OooOOo() : oooOO0O.OooO();
        }
        o00Oo0.OooO0oO(iArr9, iArr7);
        int[] iArr10 = new int[6];
        o00Oo0.OooO0OO(iArr7, iArr9, iArr10);
        o00Oo0.OooO0OO(iArr7, iArr3, iArr7);
        o00Oo0.OooO0Oo(iArr10, iArr10);
        oO00O0o0.OooOOoo(iArr4, iArr10, iArr5);
        o00Oo0.OooO0o(oO00O0o0.OooO0O0(iArr7, iArr7, iArr10), iArr10);
        o00Ooo o00ooo9 = new o00Ooo(iArr8);
        o00Oo0.OooO0oO(iArr6, iArr8);
        int[] iArr11 = o00ooo9.f52643OooO0Oo;
        o00Oo0.OooO(iArr11, iArr10, iArr11);
        o00Ooo o00ooo10 = new o00Ooo(iArr10);
        o00Oo0.OooO(iArr7, o00ooo9.f52643OooO0Oo, iArr10);
        if (oO00O0o0.OooOo00(o00ooo10.f52643OooO0Oo, iArr6, iArr5) == 0) {
            if (iArr5[11] == -1) {
                i = 12;
                if (p399o0Oo00oo.o00000OO.OooOO0O(12, iArr5, o00Oo0.f52640OooO0O0)) {
                }
            }
            o00Oo0.OooO0o0(iArr5, o00ooo10.f52643OooO0Oo);
            o00ooo2 = new o00Ooo(iArr9);
            if (!zOooO0oo) {
                o00Oo0.OooO0OO(iArr9, o00ooo7.f52643OooO0Oo, iArr9);
            }
            if (!zOooO0oo2) {
                int[] iArr12 = o00ooo2.f52643OooO0Oo;
                o00Oo0.OooO0OO(iArr12, o00ooo8.f52643OooO0Oo, iArr12);
            }
            return new oo000o(oooOO0O, o00ooo9, o00ooo10, new p696oO0OO0oo.OooOOO0[]{o00ooo2}, this.f52790OooO0o0);
        }
        i = 12;
        if (p399o0Oo00oo.o00000OO.OooO0Oo(9, o00Oo0.f52641OooO0OO, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(i, iArr5, 9);
        }
        o00Oo0.OooO0o0(iArr5, o00ooo10.f52643OooO0Oo);
        o00ooo2 = new o00Ooo(iArr9);
        if (!zOooO0oo) {
            o00Oo0.OooO0OO(iArr9, o00ooo7.f52643OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o00ooo2.f52643OooO0Oo;
            o00Oo0.OooO0OO(iArr13, o00ooo8.f52643OooO0Oo, iArr13);
        }
        return new oo000o(oooOO0O, o00ooo9, o00ooo10, new p696oO0OO0oo.OooOOO0[]{o00ooo2}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new oo000o(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new oo000o(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o00Ooo o00ooo2 = (o00Ooo) this.f52788OooO0OO;
        if (o00ooo2.OooO()) {
            return oooOO0O.OooO();
        }
        o00Ooo o00ooo3 = (o00Ooo) this.f52787OooO0O0;
        o00Ooo o00ooo4 = (o00Ooo) this.f52789OooO0Oo[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        o00Oo0.OooO0oO(o00ooo2.f52643OooO0Oo, iArr3);
        int[] iArr4 = new int[6];
        o00Oo0.OooO0oO(iArr3, iArr4);
        boolean zOooO0oo = o00ooo4.OooO0oo();
        int[] iArr5 = o00ooo4.f52643OooO0Oo;
        if (!zOooO0oo) {
            o00Oo0.OooO0oO(iArr5, iArr2);
            iArr5 = iArr2;
        }
        o00Oo0.OooO(o00ooo3.f52643OooO0Oo, iArr5, iArr);
        o00Oo0.OooO00o(o00ooo3.f52643OooO0Oo, iArr5, iArr2);
        o00Oo0.OooO0OO(iArr2, iArr, iArr2);
        o00Oo0.OooO0o(oO00O0o0.OooO0O0(iArr2, iArr2, iArr2), iArr2);
        o00Oo0.OooO0OO(iArr3, o00ooo3.f52643OooO0Oo, iArr3);
        o00Oo0.OooO0o(p399o0Oo00oo.o00000OO.OooOOoo(6, iArr3), iArr3);
        o00Oo0.OooO0o(p399o0Oo00oo.o00000OO.OooOo00(6, iArr4, iArr), iArr);
        o00Ooo o00ooo5 = new o00Ooo(iArr4);
        o00Oo0.OooO0oO(iArr2, iArr4);
        int[] iArr6 = o00ooo5.f52643OooO0Oo;
        o00Oo0.OooO(iArr6, iArr3, iArr6);
        int[] iArr7 = o00ooo5.f52643OooO0Oo;
        o00Oo0.OooO(iArr7, iArr3, iArr7);
        o00Ooo o00ooo6 = new o00Ooo(iArr3);
        o00Oo0.OooO(iArr3, o00ooo5.f52643OooO0Oo, iArr3);
        int[] iArr8 = o00ooo6.f52643OooO0Oo;
        o00Oo0.OooO0OO(iArr8, iArr2, iArr8);
        int[] iArr9 = o00ooo6.f52643OooO0Oo;
        o00Oo0.OooO(iArr9, iArr, iArr9);
        o00Ooo o00ooo7 = new o00Ooo(iArr2);
        if (p399o0Oo00oo.o00000OO.OooOOo(6, o00ooo2.f52643OooO0Oo, 0, iArr2) != 0 || (iArr2[5] == -1 && oO00O0o0.OooOOO(iArr2, o00Oo0.f52639OooO00o))) {
            o00Oo0.OooO0O0(iArr2);
        }
        if (!zOooO0oo) {
            int[] iArr10 = o00ooo7.f52643OooO0Oo;
            o00Oo0.OooO0OO(iArr10, o00ooo4.f52643OooO0Oo, iArr10);
        }
        return new oo000o(oooOO0O, o00ooo5, o00ooo6, new p696oO0OO0oo.OooOOO0[]{o00ooo7}, this.f52790OooO0o0);
    }
}
