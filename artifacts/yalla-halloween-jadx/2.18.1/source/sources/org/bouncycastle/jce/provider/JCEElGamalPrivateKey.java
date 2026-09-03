package org.bouncycastle.jce.provider;

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
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;
import p680o0ooooo.y;
import p680o0ooooo.z;
import p701oO0Oo0oo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public class JCEElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f53700Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0OoOo0 f53701Oooo0oO;

    public JCEElGamalPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f53700Oooo0o = (BigInteger) objectInputStream.readObject();
        this.f53701Oooo0oO = new o0OoOo0((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.f53701Oooo0oO.f52938OooO00o);
        objectOutputStream.writeObject(this.f53701Oooo0oO.f52939OooO0O0);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        ooOOO0Oo ooooo0oo = z.f52239OooO0OO;
        o0OoOo0 o0oooo1 = this.f53701Oooo0oO;
        return o0O000Oo.OooO0Oo(new OooO00o(ooooo0oo, new y(o0oooo1.f52938OooO00o, o0oooo1.f52939OooO0O0)), new oOo0oooO(getX()));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        o0OoOo0 o0oooo1 = this.f53701Oooo0oO;
        return new DHParameterSpec(o0oooo1.f52938OooO00o, o0oooo1.f52939OooO0O0);
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public final BigInteger getX() {
        return this.f53700Oooo0o;
    }
}
