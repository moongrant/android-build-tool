package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.PublicKey;
import oO000Oo0.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public class BCRainbowPublicKey implements PublicKey {
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCRainbowPublicKey)) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        new OooO0OO();
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        throw null;
    }
}
