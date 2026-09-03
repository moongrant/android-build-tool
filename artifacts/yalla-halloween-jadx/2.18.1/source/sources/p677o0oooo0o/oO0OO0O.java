package p677o0oooo0o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0OO0O extends oOo0o0oO {
    public static oO0OO0O OooOO0o(byte[] bArr) throws IOException {
        oO0O0O0o oo0o0o0o = new oO0O0O0o(bArr);
        try {
            oO0OO0O oo0oo0oOooOOO = oo0o0o0o.OooOOO();
            if (oo0o0o0o.available() == 0) {
                return oo0oo0oOooOOO;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract boolean OooO(oO0OO0O oo0oo0o);

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return this;
    }

    public abstract void OooOO0(oO0OO00 oo0oo00) throws IOException;

    public abstract int OooOO0O() throws IOException;

    public abstract boolean OooOOO0();

    public oO0OO0O OooOOOO() {
        return this;
    }

    public oO0OO0O OooOOOo() {
        return this;
    }

    @Override // p677o0oooo0o.oOo0o0oO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oO0O00o0) && OooO(((oO0O00o0) obj).OooO0O0());
    }

    @Override // p677o0oooo0o.oOo0o0oO
    public abstract int hashCode();
}
