package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class XMSSNode implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f53715Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final byte[] f53716Oooo0oO;

    public XMSSNode(int i, byte[] bArr) {
        this.f53715Oooo0o = i;
        this.f53716Oooo0oO = bArr;
    }

    public final Object clone() throws CloneNotSupportedException {
        int i = this.f53715Oooo0o;
        byte[] bArr = this.f53716Oooo0oO;
        Objects.requireNonNull(bArr, "in == null");
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = bArr[i2];
        }
        return new XMSSNode(i, bArr2);
    }
}
