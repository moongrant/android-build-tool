package org.bouncycastle.jcajce.provider.drbg;

import java.security.AccessController;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oO000O0O.OooO;
import oO000O0O.OooO00o.C0432OooO00o;
import oO000O0O.OooO0OO;
import oO000O0O.OooOO0;
import oO000Oo.OooO0o;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import p685oO0000oO.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class DRBG {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[][] f53660OooO00o = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object[] f53661OooO0O0;

    public static class Default extends SecureRandomSpi {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final SP800SecureRandom f53662Oooo0o = (SP800SecureRandom) DRBG.OooO00o(true);

        @Override // java.security.SecureRandomSpi
        public final byte[] engineGenerateSeed(int i) {
            return f53662Oooo0o.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public final void engineNextBytes(byte[] bArr) {
            f53662Oooo0o.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public final void engineSetSeed(byte[] bArr) {
            f53662Oooo0o.setSeed(bArr);
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final SP800SecureRandom f53663Oooo0o = (SP800SecureRandom) DRBG.OooO00o(false);

        @Override // java.security.SecureRandomSpi
        public final byte[] engineGenerateSeed(int i) {
            return f53663Oooo0o.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public final void engineNextBytes(byte[] bArr) {
            f53663Oooo0o.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public final void engineSetSeed(byte[] bArr) {
            f53663Oooo0o.setSeed(bArr);
        }
    }

    public static class OooO00o extends SecureRandom {
        /* JADX WARN: Illegal instructions before constructor call */
        public OooO00o() {
            Object[] objArr = DRBG.f53661OooO0O0;
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    public static class OooO0O0 extends SecureRandom {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final SP800SecureRandom f53664Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final AtomicBoolean f53665Oooo0o = new AtomicBoolean(false);

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final AtomicInteger f53666Oooo0oO = new AtomicInteger(0);

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final SecureRandom f53667Oooo0oo;

        public class OooO00o implements OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f53668OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final AtomicReference f53669OooO0O0 = new AtomicReference();

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final AtomicBoolean f53670OooO0OO = new AtomicBoolean(false);

            /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.drbg.DRBG$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public class RunnableC0446OooO00o implements Runnable {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final int f53672Oooo0o;

                public RunnableC0446OooO00o(int i) {
                    this.f53672Oooo0o = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o oooO00o = OooO00o.this;
                    oooO00o.f53669OooO0O0.set(OooO0O0.this.f53667Oooo0oo.generateSeed(this.f53672Oooo0o));
                    OooO0O0.this.f53665Oooo0o.set(true);
                }
            }

            public OooO00o(int i) {
                this.f53668OooO00o = (i + 7) / 8;
            }

            @Override // oO000O0O.OooO0OO
            public final byte[] OooO00o() {
                byte[] bArrGenerateSeed = (byte[]) this.f53669OooO0O0.getAndSet(null);
                if (bArrGenerateSeed == null || bArrGenerateSeed.length != this.f53668OooO00o) {
                    bArrGenerateSeed = OooO0O0.this.f53667Oooo0oo.generateSeed(this.f53668OooO00o);
                } else {
                    this.f53670OooO0OO.set(false);
                }
                if (!this.f53670OooO0OO.getAndSet(true)) {
                    new Thread(new RunnableC0446OooO00o(this.f53668OooO00o)).start();
                }
                return bArrGenerateSeed;
            }

            @Override // oO000O0O.OooO0OO
            public final int OooO0O0() {
                return this.f53668OooO00o * 8;
            }
        }

        public OooO0O0() {
            SecureRandom oooO00o = DRBG.f53661OooO0O0 != null ? new OooO00o() : new SecureRandom();
            this.f53667Oooo0oo = oooO00o;
            this.f53664Oooo = new SP800SecureRandom(null, new OooO00o(256), new OooO(new oO000.OooO00o(new OooOOO0()), oooO00o.generateSeed(32), OooO0o.OooO0O0("Bouncy Castle Hybrid Entropy Source")), false);
        }

        @Override // java.security.SecureRandom
        public final byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.f53666Oooo0oO.getAndIncrement() > 20 && this.f53665Oooo0o.getAndSet(false)) {
                this.f53666Oooo0oO.set(0);
                this.f53664Oooo.f53619OoooO00.OooO0O0();
            }
            this.f53664Oooo.nextBytes(bArr);
            return bArr;
        }
    }

    static {
        Object[] objArr;
        int i = 0;
        while (true) {
            String[][] strArr = f53660OooO00o;
            if (i >= strArr.length) {
                objArr = null;
                break;
            }
            String[] strArr2 = strArr[i];
            try {
                objArr = new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
                break;
            } catch (Throwable unused) {
                i++;
            }
        }
        f53661OooO0O0 = objArr;
    }

    public static SecureRandom OooO00o(boolean z) {
        if (System.getProperty("org.bouncycastle.drbg.entropysource") == null) {
            OooO0O0 oooO0O0 = new OooO0O0();
            byte[] bArrGenerateSeed = oooO0O0.generateSeed(16);
            return new SP800SecureRandom(oooO0O0, new oO000O0O.OooO00o(oooO0O0).new C0432OooO00o(256), new OooOO0(new OooOOO0(), oooO0O0.generateSeed(32), z ? OooO0O0(bArrGenerateSeed) : OooO0OO(bArrGenerateSeed)), z);
        }
        oO000O0O.OooO0o oooO0o = (oO000O0O.OooO0o) AccessController.doPrivileged(new p702oO0OoOO0.OooO0OO(System.getProperty("org.bouncycastle.drbg.entropysource")));
        OooO0OO oooO0OO = oooO0o.get(128);
        byte[] bArrOooO00o = oooO0OO.OooO00o();
        return new SP800SecureRandom(null, oooO0o.get(256), new OooOO0(new OooOOO0(), oO000Oo.OooO00o.OooO0Oo(oooO0OO.OooO00o(), oooO0OO.OooO00o()), z ? OooO0O0(bArrOooO00o) : OooO0OO(bArrOooO00o)), z);
    }

    public static byte[] OooO0O0(byte[] bArr) {
        byte[] bArrOooO0O0 = OooO0o.OooO0O0("Default");
        byte[] bArr2 = new byte[8];
        p684oO0000o.OooOO0.OooO0Oo(Thread.currentThread().getId(), bArr2, 0);
        byte[] bArr3 = new byte[8];
        p684oO0000o.OooOO0.OooO0Oo(System.currentTimeMillis(), bArr3, 0);
        return oO000Oo.OooO00o.OooO0o(bArrOooO0O0, bArr, bArr2, bArr3);
    }

    public static byte[] OooO0OO(byte[] bArr) {
        return oO000Oo.OooO00o.OooO0o(OooO0o.OooO0O0("Nonce"), bArr, p684oO0000o.OooOO0.OooO0o0(Thread.currentThread().getId()), p684oO0000o.OooOO0.OooO0o0(System.currentTimeMillis()));
    }
}
