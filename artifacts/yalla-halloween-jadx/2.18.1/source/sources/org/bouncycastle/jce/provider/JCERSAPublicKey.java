package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import oO0000Oo.OooO00o;
import oO000Oo.OooO0o;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOOO00o0;
import p682o0oooooO.rk;
import p682o0oooooO.uk;

/* JADX INFO: loaded from: classes3.dex */
public class JCERSAPublicKey implements RSAPublicKey {
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
        return o0O000Oo.OooO0o0(new OooO00o(rk.f52251OooO00o, oOOO00o0.f52185Oooo0o), new uk(getModulus(), getPublicExponent()));
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
