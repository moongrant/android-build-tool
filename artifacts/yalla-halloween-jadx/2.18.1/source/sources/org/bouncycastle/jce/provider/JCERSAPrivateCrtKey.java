package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import oO0000Oo.OooO00o;
import oO000Oo.OooO0o;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOOO00o0;
import p682o0oooooO.rk;
import p682o0oooooO.tk;

/* JADX INFO: loaded from: classes3.dex */
public class JCERSAPrivateCrtKey extends JCERSAPrivateKey implements RSAPrivateCrtKey {
    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getCrtCoefficient() {
        return null;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public final byte[] getEncoded() {
        return o0O000Oo.OooO0Oo(new OooO00o(rk.f52251OooO00o, oOOO00o0.f52185Oooo0o), new tk(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey, java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeExponentP() {
        return null;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeExponentQ() {
        return null;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeP() {
        return null;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPrimeQ() {
        return null;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public final BigInteger getPublicExponent() {
        return null;
    }

    @Override // org.bouncycastle.jce.provider.JCERSAPrivateKey
    public final int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = OooO0o.f52666OooO00o;
        stringBuffer.append("RSA Private CRT Key");
        stringBuffer.append(str);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("    public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("   private exponent: ");
        stringBuffer.append(getPrivateExponent().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("             primeP: ");
        stringBuffer.append(getPrimeP().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("             primeQ: ");
        stringBuffer.append(getPrimeQ().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("     primeExponentP: ");
        stringBuffer.append(getPrimeExponentP().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("     primeExponentQ: ");
        stringBuffer.append(getPrimeExponentQ().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("     crtCoefficient: ");
        stringBuffer.append(getCrtCoefficient().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
