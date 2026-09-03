package p677o0oooo0o;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends oO0oO000 {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f52116Oooo0oo;

    public e() {
        this.f52116Oooo0oo = -1;
    }

    public e(oO0O00o0 oo0o00o0) {
        super(oo0o00o0);
        this.f52116Oooo0oo = -1;
    }

    public e(oO0O00oO oo0o00oo) {
        super(oo0o00oo, false);
        this.f52116Oooo0oo = -1;
    }

    public e(oO0O00o0[] oo0o00o0Arr) {
        super(oo0o00o0Arr);
        this.f52116Oooo0oo = -1;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oO0OO00 oo0oo00OooO0O0 = oo0oo00.OooO0O0();
        int iOooOo0o = OooOo0o();
        oo0oo00.OooO0OO(49);
        oo0oo00.OooO0oo(iOooOo0o);
        Enumeration enumerationOooOo0 = OooOo0();
        while (enumerationOooOo0.hasMoreElements()) {
            oo0oo00OooO0O0.OooO((oO0O00o0) enumerationOooOo0.nextElement());
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        int iOooOo0o = OooOo0o();
        return m.OooO00o(iOooOo0o) + 1 + iOooOo0o;
    }

    public final int OooOo0o() throws IOException {
        if (this.f52116Oooo0oo < 0) {
            int iOooOO0O = 0;
            Enumeration enumerationOooOo0 = OooOo0();
            while (enumerationOooOo0.hasMoreElements()) {
                iOooOO0O += ((oO0O00o0) enumerationOooOo0.nextElement()).OooO0O0().OooOOOo().OooOO0O();
            }
            this.f52116Oooo0oo = iOooOO0O;
        }
        return this.f52116Oooo0oo;
    }
}
