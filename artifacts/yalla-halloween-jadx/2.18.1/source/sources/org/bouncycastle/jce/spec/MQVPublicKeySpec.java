package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class MQVPublicKeySpec implements KeySpec, MQVPublicKey {
    @Override // java.security.Key
    public final String getAlgorithm() {
        return "ECMQV";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return null;
    }
}
