package p677o0oooo0o;

import java.io.IOException;
import oO000Oo.OooO00o;
import oO000Oo.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO000 extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public byte[] f52160Oooo0o;

    public oOO000(byte[] bArr) {
        this.f52160Oooo0o = bArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof oOO000) {
            return OooO00o.OooO00o(this.f52160Oooo0o, ((oOO000) oo0oo0o).f52160Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0OO(23);
        int length = this.f52160Oooo0o.length;
        oo0oo00.OooO0oo(length);
        for (int i = 0; i != length; i++) {
            oo0oo00.OooO0OO(this.f52160Oooo0o[i]);
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        int length = this.f52160Oooo0o.length;
        return m.OooO00o(length) + 1 + length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return OooO00o.OooO0oO(this.f52160Oooo0o);
    }

    public final String toString() {
        return OooO0o.OooO00o(this.f52160Oooo0o);
    }
}
