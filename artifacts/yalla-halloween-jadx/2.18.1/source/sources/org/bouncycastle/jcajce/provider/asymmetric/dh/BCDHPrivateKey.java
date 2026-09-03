package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import oO0000Oo.OooO00o;
import p677o0oooo0o.oOo0oooO;
import p682o0oooooO.qk;
import p682o0oooooO.rk;
import p682o0oooooO.sk;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPrivateKey implements DHPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient DHParameterSpec f53620Oooo0o;

    public BCDHPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f53620Oooo0o = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f53620Oooo0o.getP());
        objectOutputStream.writeObject(this.f53620Oooo0o.getG());
        objectOutputStream.writeInt(this.f53620Oooo0o.getL());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new sk(new OooO00o(rk.f52254OooO0Oo, new qk(this.f53620Oooo0o.getP(), this.f53620Oooo0o.getG(), this.f53620Oooo0o.getL()).OooO0O0()), new oOo0oooO(getX())).OooO0oo("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        return this.f53620Oooo0o;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public final BigInteger getX() {
        return null;
    }

    public final int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
