package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.PrivateKey;
import p684oO0000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcEliecePrivateKey implements OooO0O0, PrivateKey {
    public final boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
