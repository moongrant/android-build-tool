package oO0000Oo;

import java.io.IOException;
import java.util.Enumeration;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f52412Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oOO0Oo00 f52413Oooo0oO;

    public OooO0o(oO0Oo0o0 oo0oo0o0) {
        if (oo0oo0o0.size() != 2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Bad sequence size: ");
            sbOooO0o0.append(oo0oo0o0.size());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        Enumeration enumerationOooOo0 = oo0oo0o0.OooOo0();
        this.f52412Oooo0o = OooO00o.OooO(enumerationOooOo0.nextElement());
        this.f52413Oooo0oO = oOO0Oo00.OooOOoo(enumerationOooOo0.nextElement());
    }

    public OooO0o(OooO00o oooO00o, oO0O00o0 oo0o00o0) throws IOException {
        this.f52413Oooo0oO = new oOO0Oo00(oo0o00o0);
        this.f52412Oooo0o = oooO00o;
    }

    public OooO0o(OooO00o oooO00o, byte[] bArr) {
        this.f52413Oooo0oO = new oOO0Oo00(bArr);
        this.f52412Oooo0o = oooO00o;
    }

    public static OooO0o OooO(Object obj) {
        if (obj instanceof OooO0o) {
            return (OooO0o) obj;
        }
        if (obj != null) {
            return new OooO0o(oO0Oo0o0.OooOOo0(obj));
        }
        return null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(this.f52412Oooo0o);
        oo0o00oo.OooO00o(this.f52413Oooo0oO);
        return new oOOo0000(oo0o00oo);
    }
}
