package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import java.util.Vector;
import oO0000Oo.OooO00o;
import oO0000o0.OooOOO0;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPrivateKey implements DSAPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient DSAParameterSpec f53622Oooo0o;

    public BCDSAPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f53622Oooo0o = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f53622Oooo0o.getP());
        objectOutputStream.writeObject(this.f53622Oooo0o.getQ());
        objectOutputStream.writeObject(this.f53622Oooo0o.getG());
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
        ooOOO0Oo ooooo0oo = OooOOO0.f52488Oooo0o0;
        BigInteger p = this.f53622Oooo0o.getP();
        BigInteger q = this.f53622Oooo0o.getQ();
        BigInteger g = this.f53622Oooo0o.getG();
        oOo0oooO ooo0oooo = new oOo0oooO(p);
        oOo0oooO ooo0oooo2 = new oOo0oooO(q);
        oOo0oooO ooo0oooo3 = new oOo0oooO(g);
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(ooo0oooo);
        oo0o00oo.OooO00o(ooo0oooo2);
        oo0o00oo.OooO00o(ooo0oooo3);
        return o0O000Oo.OooO0Oo(new OooO00o(ooooo0oo, new oOOo0000(oo0o00oo)), new oOo0oooO(getX()));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public final DSAParams getParams() {
        return this.f53622Oooo0o;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public final BigInteger getX() {
        return null;
    }

    public final int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }
}
