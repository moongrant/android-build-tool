package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import oO000Oo0.OooO00o;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class BCNHPrivateKey implements NHPrivateKey {
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPrivateKey)) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            ooOOO0Oo ooooo0oo = OooO00o.f52670OooO0Oo;
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        throw null;
    }
}
