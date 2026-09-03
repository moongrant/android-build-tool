package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import oO0000Oo.OooO00o;
import oO0o0o.OooO0O0;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOOO00o0;
import p682o0oooooO.rk;
import p682o0oooooO.tk;

/* JADX INFO: loaded from: classes3.dex */
public class JCERSAPrivateKey implements RSAPrivateKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static BigInteger f53704Oooo = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f53705Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public BigInteger f53706Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0O0 f53707Oooo0oo = new OooO0O0();

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.f53705Oooo0o = (BigInteger) objectInputStream.readObject();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f53707Oooo0oo = oooO0O0;
        oooO0O0.OooO00o(objectInputStream);
        this.f53706Oooo0oO = (BigInteger) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f53705Oooo0o);
        this.f53707Oooo0oo.OooO0O0(objectOutputStream);
        objectOutputStream.writeObject(this.f53706Oooo0oO);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        OooO00o oooO00o = new OooO00o(rk.f52251OooO00o, oOOO00o0.f52185Oooo0o);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = f53704Oooo;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = f53704Oooo;
        return o0O000Oo.OooO0Oo(oooO00o, new tk(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
        return this.f53705Oooo0o;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public final BigInteger getPrivateExponent() {
        return this.f53706Oooo0oO;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }
}
