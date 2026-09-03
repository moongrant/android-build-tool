package p677o0oooo0o;

import java.io.IOException;
import oO000Oo.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0O00 extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public byte[] f52147Oooo0o;

    public oO0O0O00(byte[] bArr) {
        this.f52147Oooo0o = bArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof oO0O0O00) {
            return OooO00o.OooO00o(this.f52147Oooo0o, ((oO0O0O00) oo0oo0o).f52147Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(24, this.f52147Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        int length = this.f52147Oooo0o.length;
        return m.OooO00o(length) + 1 + length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return OooO00o.OooO0oO(this.f52147Oooo0o);
    }
}
