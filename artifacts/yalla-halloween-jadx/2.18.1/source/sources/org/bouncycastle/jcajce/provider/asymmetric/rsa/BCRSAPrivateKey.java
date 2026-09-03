package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.util.Hashtable;
import java.util.Vector;
import oO0000Oo.OooO00o;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOOO00o0;
import p682o0oooooO.rk;
import p682o0oooooO.tk;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPrivateKey implements RSAPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static BigInteger f53654Oooo0o = BigInteger.valueOf(0);

    public BCRSAPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
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
        BigInteger bigInteger = f53654Oooo0o;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = f53654Oooo0o;
        return o0O000Oo.OooO0Oo(oooO00o, new tk(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
        return null;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public final BigInteger getPrivateExponent() {
        return null;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }
}
