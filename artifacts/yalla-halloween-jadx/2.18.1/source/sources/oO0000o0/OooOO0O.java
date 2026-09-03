package oO0000o0;

import java.math.BigInteger;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends oOo0o0oO implements OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ooOOO0Oo f52457Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oO0OO0O f52458Oooo0oO;

    public OooOO0O(int i, int i2, int i3, int i4) {
        this.f52457Oooo0o = OooOOO0.f52460OooOO0;
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            oo0o00oo.OooO00o(OooOOO0.f52461OooOO0O);
            oo0o00oo.OooO00o(new oOo0oooO(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            oo0o00oo.OooO00o(OooOOO0.f52462OooOO0o);
            oO0O00oO oo0o00oo2 = new oO0O00oO();
            oo0o00oo2.OooO00o(new oOo0oooO(i2));
            oo0o00oo2.OooO00o(new oOo0oooO(i3));
            oo0o00oo2.OooO00o(new oOo0oooO(i4));
            oo0o00oo.OooO00o(new oOOo0000(oo0o00oo2));
        }
        this.f52458Oooo0oO = new oOOo0000(oo0o00oo);
    }

    public OooOO0O(BigInteger bigInteger) {
        this.f52457Oooo0o = OooOOO0.f52459OooO;
        this.f52458Oooo0oO = new oOo0oooO(bigInteger);
    }

    public OooOO0O(oO0Oo0o0 oo0oo0o0) {
        this.f52457Oooo0o = ooOOO0Oo.OooOo0(oo0oo0o0.OooOo00(0));
        this.f52458Oooo0oO = oo0oo0o0.OooOo00(1).OooO0O0();
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(this.f52457Oooo0o);
        oo0o00oo.OooO00o(this.f52458Oooo0oO);
        return new oOOo0000(oo0o00oo);
    }
}
