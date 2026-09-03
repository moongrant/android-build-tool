package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import oO0000Oo.OooO00o;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;
import p680o0ooooo.y;
import p680o0ooooo.z;
import p682o0oooooO.sk;
import p701oO0Oo0oo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public class BCElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient o0OoOo0 f53650Oooo0o;

    public BCElGamalPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f53650Oooo0o = new o0OoOo0((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f53650Oooo0o.f52938OooO00o);
        objectOutputStream.writeObject(this.f53650Oooo0o.f52939OooO0O0);
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
        return "ElGamal";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            ooOOO0Oo ooooo0oo = z.f52239OooO0OO;
            o0OoOo0 o0oooo1 = this.f53650Oooo0o;
            return new sk(new OooO00o(ooooo0oo, new y(o0oooo1.f52938OooO00o, o0oooo1.f52939OooO0O0)), new oOo0oooO(getX())).OooO0oo("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        o0OoOo0 o0oooo1 = this.f53650Oooo0o;
        return new DHParameterSpec(o0oooo1.f52938OooO00o, o0oooo1.f52939OooO0O0);
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public final BigInteger getX() {
        return null;
    }

    public final int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
