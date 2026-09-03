package org.bouncycastle.jcajce;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF2Key implements PBKDFKey {
    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        throw null;
    }

    public final char[] getPassword() {
        return null;
    }
}
