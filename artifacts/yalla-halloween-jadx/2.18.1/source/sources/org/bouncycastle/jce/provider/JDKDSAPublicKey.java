package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import oO0000Oo.OooO00o;
import oO0000Oo.OooO0O0;
import oO0000Oo.OooO0o;
import oO0000o0.OooOOO0;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public class JDKDSAPublicKey implements DSAPublicKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f53711Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public DSAParameterSpec f53712Oooo0oO;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f53711Oooo0o = (BigInteger) objectInputStream.readObject();
        this.f53712Oooo0oO = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f53711Oooo0o);
        objectOutputStream.writeObject(this.f53712Oooo0oO.getP());
        objectOutputStream.writeObject(this.f53712Oooo0oO.getQ());
        objectOutputStream.writeObject(this.f53712Oooo0oO.getG());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            DSAParameterSpec dSAParameterSpec = this.f53712Oooo0oO;
            return dSAParameterSpec == null ? new OooO0o(new OooO00o(OooOOO0.f52488Oooo0o0), new oOo0oooO(this.f53711Oooo0o)).OooO0oo("DER") : new OooO0o(new OooO00o(OooOOO0.f52488Oooo0o0, new OooO0O0(dSAParameterSpec.getP(), this.f53712Oooo0oO.getQ(), this.f53712Oooo0oO.getG())), new oOo0oooO(this.f53711Oooo0o)).OooO0oo("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public final DSAParams getParams() {
        return this.f53712Oooo0oO;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public final BigInteger getY() {
        return this.f53711Oooo0o;
    }

    public final int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
