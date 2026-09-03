package p677o0oooo0o;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Enumeration {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO0O0O0o f52124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO0OO0O f52125OooO0O0 = (oO0OO0O) OooO00o();

    public j(byte[] bArr) {
        this.f52124OooO00o = new oO0O0O0o(bArr, true);
    }

    public final Object OooO00o() {
        try {
            return this.f52124OooO00o.OooOOO();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f52125OooO0O0 != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        oO0OO0O oo0oo0o = this.f52125OooO0O0;
        this.f52125OooO0O0 = (oO0OO0O) OooO00o();
        return oo0oo0o;
    }
}
