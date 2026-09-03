package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.PublicKey;
import p684oO0000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public class BCMcElieceCCA2PublicKey implements OooO0O0, PublicKey {
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("McEliecePublicKey:\n");
        sb.append(" length of the code         : ");
        throw null;
    }
}
