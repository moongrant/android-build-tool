package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.IESKey;

/* JADX INFO: loaded from: classes3.dex */
public class IEKeySpec implements KeySpec, IESKey {
    @Override // java.security.Key
    public final String getAlgorithm() {
        return "IES";
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
