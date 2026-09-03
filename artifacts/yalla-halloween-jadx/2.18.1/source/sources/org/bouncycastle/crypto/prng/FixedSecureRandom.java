package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class FixedSecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f53614Oooo0o;

    public final int OooO00o() {
        this.f53614Oooo0o++;
        throw null;
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        System.arraycopy(null, this.f53614Oooo0o, bArr, 0, bArr.length);
        this.f53614Oooo0o += bArr.length;
    }

    @Override // java.util.Random
    public final int nextInt() {
        OooO00o();
        throw null;
    }

    @Override // java.util.Random
    public final long nextLong() {
        OooO00o();
        throw null;
    }
}
