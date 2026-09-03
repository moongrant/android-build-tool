package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import oO0000Oo.OooO00o;
import oO000Oo.OooO0o;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOOO00o0;
import p682o0oooooO.rk;
import p682o0oooooO.uk;

/* JADX INFO: loaded from: classes3.dex */
public class BCRSAPublicKey implements RSAPublicKey {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO00o f53655Oooo0oO = new OooO00o(rk.f52251OooO00o, oOOO00o0.f52185Oooo0o);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient OooO00o f53656Oooo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.f53656Oooo0o = OooO00o.OooO(objectInputStream.readObject());
        } catch (Exception unused) {
            this.f53656Oooo0o = f53655Oooo0oO;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.f53656Oooo0o.equals(f53655Oooo0oO)) {
            return;
        }
        objectOutputStream.writeObject(this.f53656Oooo0o.OooO0oO());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return o0O000Oo.OooO0o0(this.f53656Oooo0o, new uk(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public final BigInteger getModulus() {
        return null;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public final BigInteger getPublicExponent() {
        return null;
    }

    public final int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = OooO0o.f52666OooO00o;
        stringBuffer.append("RSA Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
