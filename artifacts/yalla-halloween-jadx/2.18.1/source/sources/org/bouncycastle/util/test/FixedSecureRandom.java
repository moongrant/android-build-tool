package org.bouncycastle.util.test;

import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;
import oO0OO0OO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public class FixedSecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f53724Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static BigInteger f53722Oooo0oO = new BigInteger("01020304ffffffff0506070811111111", 16);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static BigInteger f53723Oooo0oo = new BigInteger("1111111105060708ffffffff01020304", 16);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static BigInteger f53721Oooo = new BigInteger("3020104ffffffff05060708111111", 16);

    public static class OooO00o extends Provider {
        public OooO00o() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class OooO0O0 extends SecureRandom {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public byte[] f53725Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f53726Oooo0oO;

        public OooO0O0() {
            super(null, new OooO00o());
            this.f53725Oooo0o = OooO0OO.OooO00o("01020304ffffffff0506070811111111");
            this.f53726Oooo0oO = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void nextBytes(byte[] bArr) {
            System.arraycopy(this.f53725Oooo0o, this.f53726Oooo0oO, bArr, 0, bArr.length);
            this.f53726Oooo0oO += bArr.length;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(128, new OooO0O0());
        BigInteger bigInteger2 = new BigInteger(120, new OooO0O0());
        bigInteger.equals(f53723Oooo0oo);
        bigInteger.equals(f53722Oooo0oO);
        bigInteger2.equals(f53721Oooo);
    }

    public final int OooO00o() {
        this.f53724Oooo0o++;
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
        System.arraycopy(null, this.f53724Oooo0o, bArr, 0, bArr.length);
        this.f53724Oooo0o += bArr.length;
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
