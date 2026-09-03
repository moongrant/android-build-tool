package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes3.dex */
public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {
    @Override // javax.crypto.interfaces.PBEKey
    public final int getIterationCount() {
        return 0;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final byte[] getSalt() {
        return null;
    }
}
