package p703oO0OoOOO;

import java.io.IOException;
import java.security.Principal;
import oO0000Oo.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends OooO implements Principal {
    @Override // p677o0oooo0o.oOo0o0oO
    public final byte[] OooO0oO() {
        try {
            return OooO0oo("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override // java.security.Principal
    public final String getName() {
        return toString();
    }
}
