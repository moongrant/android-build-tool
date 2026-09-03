package p677o0oooo0o;

import OooO00o.OooO00o;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O0 extends oOO0000 {
    public oOO0O0O0(boolean z, int i, oO0O00o0 oo0o00o0) {
        super(z, i, oo0o00o0);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        Enumeration enumerationOooOo0;
        oo0oo00.OooOO0(Constants.ERR_ALREADY_IN_RECORDING, this.f52161Oooo0o);
        oo0oo00.OooO0OO(128);
        if (this.f52162Oooo0oO) {
            oo0oo00.OooO(this.f52163Oooo0oo);
        } else {
            oO0O00o0 oo0o00o0 = this.f52163Oooo0oo;
            if (oo0o00o0 instanceof ooOOO00O) {
                enumerationOooOo0 = oo0o00o0 instanceof oOO00OO ? ((oOO00OO) oo0o00o0).OooOo00() : new oOO00OO(((ooOOO00O) oo0o00o0).OooOOoo()).OooOo00();
            } else if (oo0o00o0 instanceof oO0Oo0o0) {
                enumerationOooOo0 = ((oO0Oo0o0) oo0o00o0).OooOo0();
            } else {
                if (!(oo0o00o0 instanceof oO0oO000)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("not implemented: ");
                    sbOooO0o0.append(this.f52163Oooo0oo.getClass().getName());
                    throw new ASN1Exception(sbOooO0o0.toString());
                }
                enumerationOooOo0 = ((oO0oO000) oo0o00o0).OooOo0();
            }
            while (enumerationOooOo0.hasMoreElements()) {
                oo0oo00.OooO((oO0O00o0) enumerationOooOo0.nextElement());
            }
        }
        oo0oo00.OooO0OO(0);
        oo0oo00.OooO0OO(0);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        int iOooOO0O = this.f52163Oooo0oo.OooO0O0().OooOO0O();
        if (this.f52162Oooo0oO) {
            return m.OooO00o(iOooOO0O) + m.OooO0O0(this.f52161Oooo0o) + iOooOO0O;
        }
        return m.OooO0O0(this.f52161Oooo0o) + (iOooOO0O - 1);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        if (this.f52162Oooo0oO) {
            return true;
        }
        return this.f52163Oooo0oo.OooO0O0().OooOOOO().OooOOO0();
    }
}
