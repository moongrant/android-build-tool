package p677o0oooo0o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0 implements oOo00o00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO f52168Oooo0o;

    public oOO0O0(oO oOVar) {
        this.f52168Oooo0o = oOVar;
    }

    @Override // p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        try {
            return OooO0o0();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() throws IOException {
        return new oOO0O00O(this.f52168Oooo0o.OooO0OO());
    }
}
