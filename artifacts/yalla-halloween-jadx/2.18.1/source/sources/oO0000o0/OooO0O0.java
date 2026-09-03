package oO0000o0;

import p677o0oooo0o.oO0O00O;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOO00o0;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends oOo0o0oO implements oO0O00O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO0OO0O f52443Oooo0o;

    public OooO0O0() {
        this.f52443Oooo0o = oOOO00o0.f52185Oooo0o;
    }

    public OooO0O0(oO0OO0O oo0oo0o) {
        this.f52443Oooo0o = oo0oo0o;
    }

    public OooO0O0(ooOOO0Oo ooooo0oo) {
        this.f52443Oooo0o = ooooo0oo;
    }

    public OooO0O0(OooO0o oooO0o) {
        this.f52443Oooo0o = null;
        this.f52443Oooo0o = oooO0o.OooO0O0();
    }

    public static OooO0O0 OooO(Object obj) {
        if (obj == null || (obj instanceof OooO0O0)) {
            return (OooO0O0) obj;
        }
        if (obj instanceof oO0OO0O) {
            return new OooO0O0((oO0OO0O) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new OooO0O0(oO0OO0O.OooOO0o((byte[]) obj));
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unable to parse encoded data: ");
            sbOooO0o0.append(e.getMessage());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return this.f52443Oooo0o;
    }
}
