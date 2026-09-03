package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.io.IOException;
import java.security.PublicKey;
import oO000Oo0.OooO00o;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            ooOOO0Oo ooooo0oo = OooO00o.f52669OooO0OO;
            new oOo0oooO(0L);
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        throw null;
    }
}
