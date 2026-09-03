package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import p677o0oooo0o.ooOOO0Oo;
import p682o0oooooO.qk;
import p682o0oooooO.rk;

/* JADX INFO: loaded from: classes3.dex */
public class BCDHPublicKey implements DHPublicKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient DHParameterSpec f53621Oooo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f53621Oooo0o = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f53621Oooo0o.getP());
        objectOutputStream.writeObject(this.f53621Oooo0o.getG());
        objectOutputStream.writeInt(this.f53621Oooo0o.getL());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        ooOOO0Oo ooooo0oo = rk.f52254OooO0Oo;
        new qk(this.f53621Oooo0o.getP(), this.f53621Oooo0o.getG(), this.f53621Oooo0o.getL()).OooO0O0();
        BigInteger bigInteger = null;
        bigInteger.toByteArray();
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        return this.f53621Oooo0o;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public final BigInteger getY() {
        return null;
    }

    public final int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
