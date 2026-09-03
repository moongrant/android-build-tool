package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class NullPRNG extends SecureRandom {
    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }
}
