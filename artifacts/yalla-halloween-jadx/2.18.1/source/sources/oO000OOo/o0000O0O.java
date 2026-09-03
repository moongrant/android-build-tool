package oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O extends oO0OO0oo.OooOo00.OooO0O0 {
    public o0000O0O(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        super(oooOO0O, oooOOO0, oooOOO1);
        if ((oooOOO0 == null) != (oooOOO1 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f52790OooO0o0 = z;
    }

    public o0000O0O(p696oO0OO0oo.OooOO0O oooOO0O, p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0[] oooOOO0Arr, boolean z) {
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
        o0000O0 o0000o1 = (o0000O0) this.f52787OooO0O0;
        o0000O0 o0000o2 = (o0000O0) this.f52788OooO0OO;
        o0000O0 o0000o3 = (o0000O0) oooOo00.f52787OooO0O0;
        o0000O0 o0000o4 = (o0000O0) oooOo00.OooO0oo();
        o0000O0 o0000o5 = (o0000O0) this.f52789OooO0Oo[0];
        o0000O0 o0000o6 = (o0000O0) oooOo00.OooO();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean zOooO0oo = o0000o5.OooO0oo();
        if (zOooO0oo) {
            iArr = o0000o3.f52599OooO0Oo;
            iArr2 = o0000o4.f52599OooO0Oo;
        } else {
            o0000oo.OooO0o(o0000o5.f52599OooO0Oo, iArr7);
            o0000oo.OooO0OO(iArr7, o0000o3.f52599OooO0Oo, iArr6);
            o0000oo.OooO0OO(iArr7, o0000o5.f52599OooO0Oo, iArr7);
            o0000oo.OooO0OO(iArr7, o0000o4.f52599OooO0Oo, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zOooO0oo2 = o0000o6.OooO0oo();
        if (zOooO0oo2) {
            iArr3 = o0000o1.f52599OooO0Oo;
            iArr4 = o0000o2.f52599OooO0Oo;
        } else {
            o0000oo.OooO0o(o0000o6.f52599OooO0Oo, iArr8);
            o0000oo.OooO0OO(iArr8, o0000o1.f52599OooO0Oo, iArr5);
            o0000oo.OooO0OO(iArr8, o0000o6.f52599OooO0Oo, iArr8);
            o0000oo.OooO0OO(iArr8, o0000o2.f52599OooO0Oo, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[12];
        o0000oo.OooO0oo(iArr3, iArr, iArr9);
        int[] iArr10 = new int[12];
        o0000oo.OooO0oo(iArr4, iArr2, iArr10);
        if (p399o0Oo00oo.o00000OO.OooOOo0(12, iArr9)) {
            return p399o0Oo00oo.o00000OO.OooOOo0(12, iArr10) ? OooOOo() : oooOO0O.OooO();
        }
        o0000oo.OooO0o(iArr9, iArr7);
        int[] iArr11 = new int[12];
        o0000oo.OooO0OO(iArr7, iArr9, iArr11);
        o0000oo.OooO0OO(iArr7, iArr3, iArr7);
        if (p399o0Oo00oo.o00000OO.OooOOo0(12, iArr11)) {
            p399o0Oo00oo.o00000OO.OooOoOO(12, iArr11);
        } else {
            p399o0Oo00oo.o00000OO.OooOo0O(12, o0000oo.f52604OooO00o, iArr11, iArr11);
        }
        p697oO0OOo0o.o00O0O.OooO00o(iArr4, iArr11, iArr5);
        o0000oo.OooO0o0(p399o0Oo00oo.o00000OO.OooO0OO(12, iArr7, iArr7, iArr11), iArr11);
        o0000O0 o0000o7 = new o0000O0(iArr8);
        o0000oo.OooO0o(iArr10, iArr8);
        int[] iArr12 = o0000o7.f52599OooO0Oo;
        o0000oo.OooO0oo(iArr12, iArr11, iArr12);
        o0000O0 o0000o8 = new o0000O0(iArr11);
        o0000oo.OooO0oo(iArr7, o0000o7.f52599OooO0Oo, iArr11);
        p697oO0OOo0o.o00O0O.OooO00o(o0000o8.f52599OooO0Oo, iArr10, iArr6);
        if ((p399o0Oo00oo.o00000OO.OooO00o(24, iArr5, iArr6, iArr5) != 0 || (iArr5[23] == -1 && p399o0Oo00oo.o00000OO.OooOO0O(24, iArr5, o0000oo.f52605OooO0O0))) && p399o0Oo00oo.o00000OO.OooO0Oo(17, o0000oo.f52606OooO0OO, iArr5) != 0) {
            p399o0Oo00oo.o00000OO.OooOOO(24, iArr5, 17);
        }
        o0000oo.OooO0Oo(iArr5, o0000o8.f52599OooO0Oo);
        o0000O0 o0000o9 = new o0000O0(iArr9);
        if (!zOooO0oo) {
            o0000oo.OooO0OO(iArr9, o0000o5.f52599OooO0Oo, iArr9);
        }
        if (!zOooO0oo2) {
            int[] iArr13 = o0000o9.f52599OooO0Oo;
            o0000oo.OooO0OO(iArr13, o0000o6.f52599OooO0Oo, iArr13);
        }
        return new o0000O0O(oooOO0O, o0000o7, o0000o8, new p696oO0OO0oo.OooOOO0[]{o0000o9}, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooO0OO() {
        return new o0000O0O(null, OooO0o0(), OooO0o(), false);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOO0() {
        return OooOO0() ? this : new o0000O0O(this.f52786OooO00o, this.f52787OooO0O0, this.f52788OooO0OO.OooOOO0(), this.f52789OooO0Oo, this.f52790OooO0o0);
    }

    @Override // p696oO0OO0oo.OooOo00
    public final p696oO0OO0oo.OooOo00 OooOOo() {
        if (OooOO0()) {
            return this;
        }
        p696oO0OO0oo.OooOO0O oooOO0O = this.f52786OooO00o;
        o0000O0 o0000o1 = (o0000O0) this.f52788OooO0OO;
        if (o0000o1.OooO()) {
            return oooOO0O.OooO();
        }
        o0000O0 o0000o2 = (o0000O0) this.f52787OooO0O0;
        o0000O0 o0000o3 = (o0000O0) this.f52789OooO0Oo[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        o0000oo.OooO0o(o0000o1.f52599OooO0Oo, iArr3);
        int[] iArr4 = new int[12];
        o0000oo.OooO0o(iArr3, iArr4);
        boolean zOooO0oo = o0000o3.OooO0oo();
        int[] iArr5 = o0000o3.f52599OooO0Oo;
        if (!zOooO0oo) {
            o0000oo.OooO0o(iArr5, iArr2);
            iArr5 = iArr2;
        }
        o0000oo.OooO0oo(o0000o2.f52599OooO0Oo, iArr5, iArr);
        o0000oo.OooO00o(o0000o2.f52599OooO0Oo, iArr5, iArr2);
        o0000oo.OooO0OO(iArr2, iArr, iArr2);
        o0000oo.OooO0o0(p399o0Oo00oo.o00000OO.OooO0OO(12, iArr2, iArr2, iArr2), iArr2);
        o0000oo.OooO0OO(iArr3, o0000o2.f52599OooO0Oo, iArr3);
        o0000oo.OooO0o0(p399o0Oo00oo.o00000OO.OooOOoo(12, iArr3), iArr3);
        o0000oo.OooO0o0(p399o0Oo00oo.o00000OO.OooOo00(12, iArr4, iArr), iArr);
        o0000O0 o0000o4 = new o0000O0(iArr4);
        o0000oo.OooO0o(iArr2, iArr4);
        int[] iArr6 = o0000o4.f52599OooO0Oo;
        o0000oo.OooO0oo(iArr6, iArr3, iArr6);
        int[] iArr7 = o0000o4.f52599OooO0Oo;
        o0000oo.OooO0oo(iArr7, iArr3, iArr7);
        o0000O0 o0000o5 = new o0000O0(iArr3);
        o0000oo.OooO0oo(iArr3, o0000o4.f52599OooO0Oo, iArr3);
        int[] iArr8 = o0000o5.f52599OooO0Oo;
        o0000oo.OooO0OO(iArr8, iArr2, iArr8);
        int[] iArr9 = o0000o5.f52599OooO0Oo;
        o0000oo.OooO0oo(iArr9, iArr, iArr9);
        o0000O0 o0000o6 = new o0000O0(iArr2);
        if (p399o0Oo00oo.o00000OO.OooOOo(12, o0000o1.f52599OooO0Oo, 0, iArr2) != 0 || (iArr2[11] == -1 && p399o0Oo00oo.o00000OO.OooOO0O(12, iArr2, o0000oo.f52604OooO00o))) {
            o0000oo.OooO0O0(iArr2);
        }
        if (!zOooO0oo) {
            int[] iArr10 = o0000o6.f52599OooO0Oo;
            o0000oo.OooO0OO(iArr10, o0000o3.f52599OooO0Oo, iArr10);
        }
        return new o0000O0O(oooOO0O, o0000o4, o0000o5, new p696oO0OO0oo.OooOOO0[]{o0000o6}, this.f52790OooO0o0);
    }
}
