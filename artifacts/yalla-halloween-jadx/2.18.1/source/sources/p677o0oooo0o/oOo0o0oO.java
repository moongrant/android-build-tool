package p677o0oooo0o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oOo0o0oO implements oO0O00o0 {
    @Override // p677o0oooo0o.oO0O00o0
    public abstract oO0OO0O OooO0O0();

    public byte[] OooO0oO() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new oO0OO00(byteArrayOutputStream).OooO(this);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] OooO0oo(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (str.equals("DER")) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new oOOOoo00(byteArrayOutputStream).OooO(this);
        } else {
            if (!str.equals("DL")) {
                return OooO0oO();
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            new c(byteArrayOutputStream).OooO(this);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oO0O00o0) {
            return OooO0O0().equals(((oO0O00o0) obj).OooO0O0());
        }
        return false;
    }

    public int hashCode() {
        return OooO0O0().hashCode();
    }
}
