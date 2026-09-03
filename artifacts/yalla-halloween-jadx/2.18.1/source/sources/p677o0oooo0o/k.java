package p677o0oooo0o;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oO0Oo0o0 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public byte[] f52126Oooo0oO;

    public k(byte[] bArr) throws IOException {
        this.f52126Oooo0oO = bArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        byte[] bArr = this.f52126Oooo0oO;
        if (bArr != null) {
            oo0oo00.OooO0o(48, bArr);
        } else {
            super.OooOOOo().OooOO0(oo0oo00);
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        byte[] bArr = this.f52126Oooo0oO;
        return bArr != null ? m.OooO00o(bArr.length) + 1 + this.f52126Oooo0oO.length : super.OooOOOo().OooOO0O();
    }

    @Override // p677o0oooo0o.oO0Oo0o0, p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOO() {
        if (this.f52126Oooo0oO != null) {
            OooOo0o();
        }
        return super.OooOOOO();
    }

    @Override // p677o0oooo0o.oO0Oo0o0, p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOo() {
        if (this.f52126Oooo0oO != null) {
            OooOo0o();
        }
        return super.OooOOOo();
    }

    @Override // p677o0oooo0o.oO0Oo0o0
    public final synchronized Enumeration OooOo0() {
        byte[] bArr = this.f52126Oooo0oO;
        if (bArr == null) {
            return super.OooOo0();
        }
        return new j(bArr);
    }

    @Override // p677o0oooo0o.oO0Oo0o0
    public final synchronized oO0O00o0 OooOo00(int i) {
        if (this.f52126Oooo0oO != null) {
            OooOo0o();
        }
        return super.OooOo00(i);
    }

    public final void OooOo0o() {
        j jVar = new j(this.f52126Oooo0oO);
        while (jVar.hasMoreElements()) {
            this.f52153Oooo0o.addElement(jVar.nextElement());
        }
        this.f52126Oooo0oO = null;
    }

    @Override // p677o0oooo0o.oO0Oo0o0
    public final synchronized int size() {
        if (this.f52126Oooo0oO != null) {
            OooOo0o();
        }
        return super.size();
    }
}
