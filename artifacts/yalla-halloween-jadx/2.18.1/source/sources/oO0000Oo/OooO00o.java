package oO0000Oo;

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
    public ooOOO0Oo f52392Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oO0O00o0 f52393Oooo0oO;

    public OooO00o(oO0Oo0o0 oo0oo0o0) {
        if (oo0oo0o0.size() < 1 || oo0oo0o0.size() > 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Bad sequence size: ");
            sbOooO0o0.append(oo0oo0o0.size());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        this.f52392Oooo0o = ooOOO0Oo.OooOo0(oo0oo0o0.OooOo00(0));
        this.f52393Oooo0oO = oo0oo0o0.size() == 2 ? oo0oo0o0.OooOo00(1) : null;
    }

    public OooO00o(ooOOO0Oo ooooo0oo) {
        this.f52392Oooo0o = ooooo0oo;
    }

    public OooO00o(ooOOO0Oo ooooo0oo, oO0O00o0 oo0o00o0) {
        this.f52392Oooo0o = ooooo0oo;
        this.f52393Oooo0oO = oo0o00o0;
    }

    public static OooO00o OooO(Object obj) {
        if (obj instanceof OooO00o) {
            return (OooO00o) obj;
        }
        if (obj != null) {
            return new OooO00o(oO0Oo0o0.OooOOo0(obj));
        }
        return null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(this.f52392Oooo0o);
        oO0O00o0 oo0o00o0 = this.f52393Oooo0oO;
        if (oo0o00o0 != null) {
            oo0o00oo.OooO00o(oo0o00o0);
        }
        return new oOOo0000(oo0o00oo);
    }
}
