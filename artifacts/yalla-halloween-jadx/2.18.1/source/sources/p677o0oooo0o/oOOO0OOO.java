package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO0OOO implements ooo0o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public g f52188Oooo0o;

    public oOOO0OOO(g gVar) {
        this.f52188Oooo0o = gVar;
    }

    @Override // p677o0oooo0o.ooo0o
    public final InputStream OooO00o() {
        return this.f52188Oooo0o;
    }

    @Override // p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        try {
            return new oOOO0OO0(this.f52188Oooo0o.OooO0Oo());
        } catch (IOException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("IOException converting stream to byte array: ");
            sbOooO0o0.append(e.getMessage());
            throw new ASN1ParsingException(sbOooO0o0.toString(), e);
        }
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() throws IOException {
        return new oOOO0OO0(this.f52188Oooo0o.OooO0Oo());
    }
}
