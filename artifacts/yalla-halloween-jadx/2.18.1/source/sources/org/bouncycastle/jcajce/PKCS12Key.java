package org.bouncycastle.jcajce;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS12Key implements PBKDFKey {
    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return new byte[0];
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS12";
    }

    public final char[] getPassword() {
        return null;
    }
}
