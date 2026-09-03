package p682o0oooooO;

import java.io.IOException;
import java.util.Enumeration;
import oO0000Oo.OooO00o;
import p677o0oooo0o.O0000000;
import p677o0oooo0o.e;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oO0oO000;
import p677o0oooo0o.oOO0000;
import p677o0oooo0o.oOO0O00O;
import p677o0oooo0o.oOO0O0O0;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class sk extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ooOOO00O f52259Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO00o f52260Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO0oO000 f52261Oooo0oo;

    public sk(oO0Oo0o0 oo0oo0o0) {
        oO0oO000 ooo0o00o;
        Enumeration enumerationOooOo0 = oo0oo0o0.OooOo0();
        if (((oOo0oooO) enumerationOooOo0.nextElement()).OooOo00().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.f52260Oooo0oO = OooO00o.OooO(enumerationOooOo0.nextElement());
        this.f52259Oooo0o = ooOOO00O.OooOOo0(enumerationOooOo0.nextElement());
        if (enumerationOooOo0.hasMoreElements()) {
            oOO0000 ooo0000 = (oOO0000) enumerationOooOo0.nextElement();
            if (ooo0000.f52162Oooo0oO) {
                ooo0o00o = ooo0000 instanceof oOO0O0O0 ? new oOO0O00O(ooo0000.OooOOo0()) : new e(ooo0000.OooOOo0());
            } else if (ooo0000.OooOOo0() instanceof oO0oO000) {
                ooo0o00o = (oO0oO000) ooo0000.OooOOo0();
            } else {
                if (!(ooo0000.OooOOo0() instanceof oO0Oo0o0)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("unknown object in getInstance: ");
                    sbOooO0o0.append(ooo0000.getClass().getName());
                    throw new IllegalArgumentException(sbOooO0o0.toString());
                }
                oO0Oo0o0 oo0oo0o1 = (oO0Oo0o0) ooo0000.OooOOo0();
                ooo0o00o = ooo0000 instanceof oOO0O0O0 ? new oOO0O00O(oo0oo0o1.OooOo0O()) : new e(oo0oo0o1.OooOo0O());
            }
            this.f52261Oooo0oo = ooo0o00o;
        }
    }

    public static sk OooO(Object obj) {
        if (obj instanceof sk) {
            return (sk) obj;
        }
        if (obj != null) {
            return new sk(oO0Oo0o0.OooOOo0(obj));
        }
        return null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(0L));
        oo0o00oo.OooO00o(this.f52260Oooo0oO);
        oo0o00oo.OooO00o(this.f52259Oooo0o);
        oO0oO000 oo0oo000 = this.f52261Oooo0oo;
        if (oo0oo000 != null) {
            oo0o00oo.OooO00o(new O0000000(false, 0, oo0oo000));
        }
        return new oOOo0000(oo0o00oo);
    }

    public final oO0O00o0 OooOO0() throws IOException {
        return oO0OO0O.OooOO0o(this.f52259Oooo0o.OooOOoo());
    }

    public sk(OooO00o oooO00o, oO0O00o0 oo0o00o0) throws IOException {
        this.f52259Oooo0o = new oOOO0OO0(oo0o00o0.OooO0O0().OooO0oo("DER"));
        this.f52260Oooo0oO = oooO00o;
        this.f52261Oooo0oo = null;
    }
}
