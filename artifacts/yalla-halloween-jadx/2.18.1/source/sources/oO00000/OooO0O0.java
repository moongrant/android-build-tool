package oO00000;

import java.math.BigInteger;
import p677o0oooo0o.O0000000;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0000;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ooOOO00O f52356Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f52357Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO00o f52358Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oOo0oooO f52359Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ooOOO00O f52360OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public oOo0oooO f52361OoooO00;

    public OooO0O0(oO0Oo0o0 oo0oo0o0) {
        this.f52357Oooo0o = BigInteger.valueOf(0L);
        int i = 0;
        if (oo0oo0o0.OooOo00(0) instanceof oOO0000) {
            oOO0000 ooo0000 = (oOO0000) oo0oo0o0.OooOo00(0);
            if (!ooo0000.f52162Oooo0oO || ooo0000.f52161Oooo0o != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f52357Oooo0o = oOo0oooO.OooOOo0(ooo0000).OooOo00();
            i = 1;
        }
        oO0O00o0 oo0o00o0OooOo00 = oo0oo0o0.OooOo00(i);
        this.f52358Oooo0oO = oo0o00o0OooOo00 instanceof OooO00o ? (OooO00o) oo0o00o0OooOo00 : oo0o00o0OooOo00 != null ? new OooO00o(oO0Oo0o0.OooOOo0(oo0o00o0OooOo00)) : null;
        int i2 = i + 1;
        this.f52359Oooo0oo = oOo0oooO.OooOOo0(oo0oo0o0.OooOo00(i2));
        int i3 = i2 + 1;
        this.f52356Oooo = ooOOO00O.OooOOo0(oo0oo0o0.OooOo00(i3));
        int i4 = i3 + 1;
        this.f52361OoooO00 = oOo0oooO.OooOOo0(oo0oo0o0.OooOo00(i4));
        this.f52360OoooO0 = ooOOO00O.OooOOo0(oo0oo0o0.OooOo00(i4 + 1));
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        if (this.f52357Oooo0o.compareTo(BigInteger.valueOf(0L)) != 0) {
            oo0o00oo.OooO00o(new O0000000(true, 0, new oOo0oooO(this.f52357Oooo0o)));
        }
        oo0o00oo.OooO00o(this.f52358Oooo0oO);
        oo0o00oo.OooO00o(this.f52359Oooo0oo);
        oo0o00oo.OooO00o(this.f52356Oooo);
        oo0o00oo.OooO00o(this.f52361OoooO00);
        oo0o00oo.OooO00o(this.f52360OoooO0);
        return new oOOo0000(oo0o00oo);
    }
}
