package o0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOO0 f41559OooO0o0 = new OooOO0(OooOO0O.f41564OooO0O0, 0, 0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f41560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f41561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f41562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f41563OooO0Oo;

    public OooOO0(OooOO0O oooOO0O, int i, int i2, int i3) {
        this.f41561OooO0O0 = oooOO0O;
        this.f41560OooO00o = i;
        this.f41562OooO0OO = i2;
        this.f41563OooO0Oo = i3;
    }

    public final OooOO0 OooO00o(int i) {
        int i2;
        OooOO0O oooO = this.f41561OooO0O0;
        int i3 = this.f41560OooO00o;
        int i4 = this.f41563OooO0Oo;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = OooO0o.f41555OooO0OO[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            oooO.getClass();
            i4 += i7;
            oooO = new OooO(oooO, i6, i7);
        }
        int i8 = this.f41562OooO0OO;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        OooOO0 oooOO1 = new OooOO0(oooO, i3, i9, i4 + i2);
        return i9 == 2078 ? oooOO1.OooO0O0(i + 1) : oooOO1;
    }

    public final OooOO0 OooO0O0(int i) {
        int i2 = this.f41562OooO0OO;
        if (i2 == 0) {
            return this;
        }
        OooOO0O oooOO0O = this.f41561OooO0O0;
        oooOO0O.getClass();
        return new OooOO0(new OooO00o(oooOO0O, i - i2, i2), this.f41560OooO00o, 0, this.f41563OooO0Oo);
    }

    public final boolean OooO0OO(OooOO0 oooOO1) {
        int i;
        int i2 = this.f41563OooO0Oo + (OooO0o.f41555OooO0OO[this.f41560OooO00o][oooOO1.f41560OooO00o] >> 16);
        int i3 = oooOO1.f41562OooO0OO;
        if (i3 > 0 && ((i = this.f41562OooO0OO) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= oooOO1.f41563OooO0Oo;
    }

    public final OooOO0 OooO0Oo(int i, int i2) {
        int i3 = this.f41563OooO0Oo;
        OooOO0O oooO = this.f41561OooO0O0;
        int i4 = this.f41560OooO00o;
        if (i != i4) {
            int i5 = OooO0o.f41555OooO0OO[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            oooO.getClass();
            i3 += i7;
            oooO = new OooO(oooO, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        oooO.getClass();
        return new OooOO0(new OooO(oooO, i2, i8), i, 0, i3 + i8);
    }

    public final OooOO0 OooO0o0(int i, int i2) {
        int i3 = this.f41560OooO00o;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = OooO0o.f41557OooO0o0[i3][i];
        OooOO0O oooOO0O = this.f41561OooO0O0;
        oooOO0O.getClass();
        return new OooOO0(new OooO(new OooO(oooOO0O, i5, i4), i2, 5), i3, 0, this.f41563OooO0Oo + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", OooO0o.f41554OooO0O0[this.f41560OooO00o], Integer.valueOf(this.f41563OooO0Oo), Integer.valueOf(this.f41562OooO0OO));
    }
}
