package oO00000o;

import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ooOOO0Oo f52371Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oO0O00o0 f52372Oooo0oO;

    public OooO00o(oO0Oo0o0 oo0oo0o0) {
        this.f52371Oooo0o = (ooOOO0Oo) oo0oo0o0.OooOo00(0);
        this.f52372Oooo0oO = oo0oo0o0.OooOo00(1);
    }

    public static OooO00o OooO(Object obj) {
        if (obj instanceof OooO00o) {
            return (OooO00o) obj;
        }
        if (obj != null) {
            return new OooO00o(oO0Oo0o0.OooOOo0(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(this.f52371Oooo0o);
        oo0o00oo.OooO00o(this.f52372Oooo0oO);
        return new oOOo0000(oo0o00oo);
    }
}
