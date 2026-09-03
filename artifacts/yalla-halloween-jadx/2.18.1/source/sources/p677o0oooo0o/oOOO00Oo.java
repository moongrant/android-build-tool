package p677o0oooo0o;

import java.io.IOException;
import oO000Oo.OooO00o;
import oO000Oo.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class oOOO00Oo extends oO0OO0O implements oOO00000 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52184Oooo0o;

    public oOOO00Oo(byte[] bArr) {
        this.f52184Oooo0o = bArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof oOOO00Oo) {
            return OooO00o.OooO00o(this.f52184Oooo0o, ((oOOO00Oo) oo0oo0o).f52184Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oOO00000
    public final String OooO0OO() {
        return OooO0o.OooO00o(this.f52184Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(22, this.f52184Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return m.OooO00o(this.f52184Oooo0o.length) + 1 + this.f52184Oooo0o.length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return OooO00o.OooO0oO(this.f52184Oooo0o);
    }

    public String toString() {
        return OooO0OO();
    }
}
