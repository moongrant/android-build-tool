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
import p677o0oooo0o.oOo0oooO;
import p682o0oooooO.qk;
import p682o0oooooO.rk;
import p682o0oooooO.sk;

/* JADX INFO: loaded from: classes3.dex */
public class JCEDHPrivateKey implements DHPrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f53685Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public DHParameterSpec f53686Oooo0oO;

    public JCEDHPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f53685Oooo0o = (BigInteger) objectInputStream.readObject();
        this.f53686Oooo0oO = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.f53686Oooo0oO.getP());
        objectOutputStream.writeObject(this.f53686Oooo0oO.getG());
        objectOutputStream.writeInt(this.f53686Oooo0oO.getL());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new sk(new OooO00o(rk.f52254OooO0Oo, new qk(this.f53686Oooo0oO.getP(), this.f53686Oooo0oO.getG(), this.f53686Oooo0oO.getL())), new oOo0oooO(getX())).OooO0oo("DER");
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
        return this.f53686Oooo0oO;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public final BigInteger getX() {
        return this.f53685Oooo0o;
    }
}
