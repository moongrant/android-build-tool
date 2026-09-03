package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;
import p680o0ooooo.z;
import p701oO0Oo0oo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public class BCElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient o0OoOo0 f53651Oooo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f53651Oooo0o = new o0OoOo0((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f53651Oooo0o.f52938OooO00o);
        objectOutputStream.writeObject(this.f53651Oooo0o.f52939OooO0O0);
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
        return "ElGamal";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        BigInteger bigInteger = null;
        try {
            ooOOO0Oo ooooo0oo = z.f52239OooO0OO;
            o0OoOo0 o0oooo1 = this.f53651Oooo0o;
            BigInteger bigInteger2 = o0oooo1.f52938OooO00o;
            BigInteger bigInteger3 = o0oooo1.f52939OooO0O0;
            new oOo0oooO(bigInteger2);
            new oOo0oooO(bigInteger3);
            bigInteger.toByteArray();
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        o0OoOo0 o0oooo1 = this.f53651Oooo0o;
        return new DHParameterSpec(o0oooo1.f52938OooO00o, o0oooo1.f52939OooO0O0);
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public final BigInteger getY() {
        return null;
    }

    public final int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
