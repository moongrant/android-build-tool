package p677o0oooo0o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00 implements oO0O00o0, h {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f52158Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final oO f52159Oooo0oO;

    public oOO00(int i, oO oOVar) {
        this.f52158Oooo0o = i;
        this.f52159Oooo0oO = oOVar;
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
        return new oOO000o(this.f52158Oooo0o, this.f52159Oooo0oO.OooO0OO());
    }
}
