package p677o0oooo0o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO000o extends oO0O000 {
    public oOO000o(int i, oO0O00oO oo0o00oo) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != oo0o00oo.OooO0OO(); i2++) {
            try {
                byteArrayOutputStream.write(((oOo0o0oO) oo0o00oo.OooO0O0(i2)).OooO0oo("BER"));
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed object: " + e, e);
            }
        }
        super(true, i, byteArrayOutputStream.toByteArray());
    }

    @Override // p677o0oooo0o.oO0O000, p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooOO0(this.f52140Oooo0o ? 96 : 64, this.f52141Oooo0oO);
        oo0oo00.OooO0OO(128);
        oo0oo00.OooO0Oo(this.f52142Oooo0oo);
        oo0oo00.OooO0OO(0);
        oo0oo00.OooO0OO(0);
    }
}
