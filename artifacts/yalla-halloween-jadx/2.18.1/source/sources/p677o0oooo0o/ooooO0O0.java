package p677o0oooo0o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class ooooO0O0 implements oO0O00o0, h {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO f52203Oooo0o;

    public ooooO0O0(oO oOVar) {
        this.f52203Oooo0o = oOVar;
    }

    @Override // p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        try {
            return OooO0o0();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() throws IOException {
        try {
            return new oOO0OoO0(this.f52203Oooo0o.OooO0OO());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }
}
