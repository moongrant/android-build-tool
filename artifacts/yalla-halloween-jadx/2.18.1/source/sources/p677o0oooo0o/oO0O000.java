package p677o0oooo0o;

import java.io.IOException;
import oO000Oo.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0O000 extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f52140Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f52141Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final byte[] f52142Oooo0oo;

    public oO0O000(boolean z, int i, byte[] bArr) {
        this.f52140Oooo0o = z;
        this.f52141Oooo0oO = i;
        this.f52142Oooo0oo = OooO00o.OooO0OO(bArr);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (!(oo0oo0o instanceof oO0O000)) {
            return false;
        }
        oO0O000 oo0o000 = (oO0O000) oo0oo0o;
        return this.f52140Oooo0o == oo0o000.f52140Oooo0o && this.f52141Oooo0oO == oo0o000.f52141Oooo0oO && OooO00o.OooO00o(this.f52142Oooo0oo, oo0o000.f52142Oooo0oo);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o0(this.f52140Oooo0o ? 96 : 64, this.f52141Oooo0oO, this.f52142Oooo0oo);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        return m.OooO00o(this.f52142Oooo0oo.length) + m.OooO0O0(this.f52141Oooo0oO) + this.f52142Oooo0oo.length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return this.f52140Oooo0o;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        boolean z = this.f52140Oooo0o;
        return ((z ? 1 : 0) ^ this.f52141Oooo0oO) ^ OooO00o.OooO0oO(this.f52142Oooo0oo);
    }
}
