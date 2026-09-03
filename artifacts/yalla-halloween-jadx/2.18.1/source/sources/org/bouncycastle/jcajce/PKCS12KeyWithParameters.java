package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    @Override // javax.crypto.interfaces.PBEKey
    public final int getIterationCount() {
        return 0;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final byte[] getSalt() {
        return null;
    }
}
