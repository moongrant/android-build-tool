package p677o0oooo0o;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0 extends oO0Oo0o0 {
    public oOO0() {
    }

    public oOO0(oO0O00oO oo0o00oo) {
        super(oo0o00oo);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0OO(48);
        oo0oo00.OooO0OO(128);
        Enumeration enumerationOooOo0 = OooOo0();
        while (enumerationOooOo0.hasMoreElements()) {
            oo0oo00.OooO((oO0O00o0) enumerationOooOo0.nextElement());
        }
        oo0oo00.OooO0OO(0);
        oo0oo00.OooO0OO(0);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        Enumeration enumerationOooOo0 = OooOo0();
        int iOooOO0O = 0;
        while (enumerationOooOo0.hasMoreElements()) {
            iOooOO0O += ((oO0O00o0) enumerationOooOo0.nextElement()).OooO0O0().OooOO0O();
        }
        return iOooOO0O + 2 + 2;
    }
}
