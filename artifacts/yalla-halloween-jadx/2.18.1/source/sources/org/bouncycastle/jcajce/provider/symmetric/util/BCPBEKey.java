package org.bouncycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes3.dex */
public class BCPBEKey implements PBEKey {
    @Override // java.security.Key
    public final String getAlgorithm() {
        return null;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final int getIterationCount() {
        throw null;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final char[] getPassword() {
        throw null;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final byte[] getSalt() {
        throw null;
    }
}
