package oO00000;

import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f52352Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f52353Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f52354Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f52355Oooo0oo;

    public OooO00o(oO0Oo0o0 oo0oo0o0) {
        this.f52353Oooo0o = oOo0oooO.OooOOo0(oo0oo0o0.OooOo00(0)).OooOOoo().intValue();
        if (oo0oo0o0.OooOo00(1) instanceof oOo0oooO) {
            this.f52354Oooo0oO = ((oOo0oooO) oo0oo0o0.OooOo00(1)).OooOOoo().intValue();
        } else {
            if (!(oo0oo0o0.OooOo00(1) instanceof oO0Oo0o0)) {
                throw new IllegalArgumentException("object parse error");
            }
            oO0Oo0o0 oo0oo0o0OooOOo0 = oO0Oo0o0.OooOOo0(oo0oo0o0.OooOo00(1));
            this.f52354Oooo0oO = oOo0oooO.OooOOo0(oo0oo0o0OooOOo0.OooOo00(0)).OooOOoo().intValue();
            this.f52355Oooo0oo = oOo0oooO.OooOOo0(oo0oo0o0OooOOo0.OooOo00(1)).OooOOoo().intValue();
            this.f52352Oooo = oOo0oooO.OooOOo0(oo0oo0o0OooOOo0.OooOo00(2)).OooOOoo().intValue();
        }
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(this.f52353Oooo0o));
        if (this.f52355Oooo0oo == 0) {
            oo0o00oo.OooO00o(new oOo0oooO(this.f52354Oooo0oO));
        } else {
            oO0O00oO oo0o00oo2 = new oO0O00oO();
            oo0o00oo2.OooO00o(new oOo0oooO(this.f52354Oooo0oO));
            oo0o00oo2.OooO00o(new oOo0oooO(this.f52355Oooo0oo));
            oo0o00oo2.OooO00o(new oOo0oooO(this.f52352Oooo));
            oo0o00oo.OooO00o(new oOOo0000(oo0o00oo2));
        }
        return new oOOo0000(oo0o00oo);
    }
}
