package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import oO000O0O.OooO0O0;
import oO000O0O.OooO0OO;
import p660o0ooo0o0.oo0O;
import p706oO0Ooooo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class SP800SecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0OO f53615Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0O0 f53616Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f53617Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final SecureRandom f53618Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooOo00 f53619OoooO00;

    public SP800SecureRandom(SecureRandom secureRandom, OooO0OO oooO0OO, OooO0O0 oooO0O0, boolean z) {
        this.f53618Oooo0oo = secureRandom;
        this.f53615Oooo = oooO0OO;
        this.f53616Oooo0o = oooO0O0;
        this.f53617Oooo0oO = z;
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        return oo0O.OooO00o(this.f53615Oooo, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.f53619OoooO00 == null) {
                this.f53619OoooO00 = this.f53616Oooo0o.OooO00o(this.f53615Oooo);
            }
            if (this.f53619OoooO00.OooO00o(bArr, this.f53617Oooo0oO) < 0) {
                this.f53619OoooO00.OooO0O0();
                this.f53619OoooO00.OooO00o(bArr, this.f53617Oooo0oO);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            SecureRandom secureRandom = this.f53618Oooo0oo;
            if (secureRandom != null) {
                secureRandom.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.f53618Oooo0oo;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }
}
