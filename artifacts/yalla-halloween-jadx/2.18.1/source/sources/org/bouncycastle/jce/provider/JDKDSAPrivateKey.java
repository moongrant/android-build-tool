package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import oO0000Oo.OooO00o;
import oO0000o0.OooOOO0;
import oO0o0o.OooO0O0;
import p677o0oooo0o.oOo0oooO;
import p682o0oooooO.sk;

/* JADX INFO: loaded from: classes3.dex */
public class JDKDSAPrivateKey implements DSAPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f53708Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public DSAParameterSpec f53709Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0O0 f53710Oooo0oo = new OooO0O0();

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.f53708Oooo0o = (BigInteger) objectInputStream.readObject();
        this.f53709Oooo0oO = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f53710Oooo0oo = oooO0O0;
        oooO0O0.OooO00o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f53708Oooo0o);
        objectOutputStream.writeObject(this.f53709Oooo0oO.getP());
        objectOutputStream.writeObject(this.f53709Oooo0oO.getQ());
        objectOutputStream.writeObject(this.f53709Oooo0oO.getG());
        this.f53710Oooo0oo.OooO0O0(objectOutputStream);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new sk(new OooO00o(OooOOO0.f52488Oooo0o0, new oO0000Oo.OooO0O0(this.f53709Oooo0oO.getP(), this.f53709Oooo0oO.getQ(), this.f53709Oooo0oO.getG())), new oOo0oooO(getX())).OooO0oo("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public final DSAParams getParams() {
        return this.f53709Oooo0oO;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public final BigInteger getX() {
        return this.f53708Oooo0o;
    }

    public final int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }
}
