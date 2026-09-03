package o0OO000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO f42245OooO0o0 = new OooO(OooOO0.f42259OooO0O0, 0, 0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f42246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f42247OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42248OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f42249OooO0Oo;

    public OooO(OooOO0 oooOO1, int i, int i2, int i3) {
        this.f42247OooO0O0 = oooOO1;
        this.f42246OooO00o = i;
        this.f42248OooO0OO = i2;
        this.f42249OooO0Oo = i3;
    }

    public final OooO OooO00o(int i) {
        int i2;
        OooOO0 oooO0o = this.f42247OooO0O0;
        int i3 = this.f42246OooO00o;
        int i4 = this.f42249OooO0Oo;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = OooO0OO.f42253OooO0OO[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            oooO0o.getClass();
            i4 += i7;
            oooO0o = new OooO0o(oooO0o, i6, i7);
        }
        int i8 = this.f42248OooO0OO;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        OooO oooO = new OooO(oooO0o, i3, i9, i4 + i2);
        return i9 == 2078 ? oooO.OooO0O0(i + 1) : oooO;
    }

    public final OooO OooO0O0(int i) {
        int i2 = this.f42248OooO0OO;
        if (i2 == 0) {
            return this;
        }
        OooOO0 oooOO1 = this.f42247OooO0O0;
        oooOO1.getClass();
        return new OooO(new OooO00o(oooOO1, i - i2, i2), this.f42246OooO00o, 0, this.f42249OooO0Oo);
    }

    public final boolean OooO0OO(OooO oooO) {
        int i;
        int i2 = this.f42249OooO0Oo + (OooO0OO.f42253OooO0OO[this.f42246OooO00o][oooO.f42246OooO00o] >> 16);
        int i3 = oooO.f42248OooO0OO;
        if (i3 > 0 && ((i = this.f42248OooO0OO) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= oooO.f42249OooO0Oo;
    }

    public final OooO OooO0Oo(int i, int i2) {
        int i3 = this.f42249OooO0Oo;
        OooOO0 oooO0o = this.f42247OooO0O0;
        int i4 = this.f42246OooO00o;
        if (i != i4) {
            int i5 = OooO0OO.f42253OooO0OO[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            oooO0o.getClass();
            i3 += i7;
            oooO0o = new OooO0o(oooO0o, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        oooO0o.getClass();
        return new OooO(new OooO0o(oooO0o, i2, i8), i, 0, i3 + i8);
    }

    public final OooO OooO0o0(int i, int i2) {
        int i3 = this.f42246OooO00o;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = OooO0OO.f42255OooO0o0[i3][i];
        OooOO0 oooOO1 = this.f42247OooO0O0;
        oooOO1.getClass();
        return new OooO(new OooO0o(new OooO0o(oooOO1, i5, i4), i2, 5), i3, 0, this.f42249OooO0Oo + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", OooO0OO.f42252OooO0O0[this.f42246OooO00o], Integer.valueOf(this.f42249OooO0Oo), Integer.valueOf(this.f42248OooO0OO));
    }
}
