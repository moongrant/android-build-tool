package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.util.Vector;
import oO0000o0.OooOOO0;
import oO000O0.OooO0O0;
import oO000O0.OooO0OO;
import oO000Oo.OooO0o;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;
import p687oO000O0o.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSAPublicKey implements DSAPublicKey {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static BigInteger f53623Oooo0oO = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient DSAParameterSpec f53624Oooo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(f53623Oooo0oO)) {
            this.f53624Oooo0o = null;
        } else {
            this.f53624Oooo0o = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        DSAParameterSpec dSAParameterSpec = this.f53624Oooo0o;
        int i = OooOO0O.f52561OooO00o;
        new OooO0OO(dSAParameterSpec != null ? new OooO0O0(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()) : null);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger g;
        objectOutputStream.defaultWriteObject();
        DSAParameterSpec dSAParameterSpec = this.f53624Oooo0o;
        if (dSAParameterSpec == null) {
            g = f53623Oooo0oO;
        } else {
            objectOutputStream.writeObject(dSAParameterSpec.getP());
            objectOutputStream.writeObject(this.f53624Oooo0o.getQ());
            g = this.f53624Oooo0o.getG();
        }
        objectOutputStream.writeObject(g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        if (this.f53624Oooo0o != null) {
            return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        DSAParameterSpec dSAParameterSpec = this.f53624Oooo0o;
        if (dSAParameterSpec == null) {
            ooOOO0Oo ooooo0oo = OooOOO0.f52488Oooo0o0;
            throw null;
        }
        ooOOO0Oo ooooo0oo2 = OooOOO0.f52488Oooo0o0;
        BigInteger p = dSAParameterSpec.getP();
        BigInteger q = this.f53624Oooo0o.getQ();
        BigInteger g = this.f53624Oooo0o.getG();
        oOo0oooO ooo0oooo = new oOo0oooO(p);
        oOo0oooO ooo0oooo2 = new oOo0oooO(q);
        oOo0oooO ooo0oooo3 = new oOo0oooO(g);
        Vector vector = new Vector();
        vector.addElement(ooo0oooo);
        vector.addElement(ooo0oooo2);
        vector.addElement(ooo0oooo3);
        Vector vector2 = new Vector();
        for (int i = 0; i != vector.size(); i++) {
            vector2.addElement((oO0O00o0) vector.elementAt(i));
        }
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public final DSAParams getParams() {
        return this.f53624Oooo0o;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public final BigInteger getY() {
        return null;
    }

    public final int hashCode() {
        return this.f53624Oooo0o != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = OooO0o.f52666OooO00o;
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
