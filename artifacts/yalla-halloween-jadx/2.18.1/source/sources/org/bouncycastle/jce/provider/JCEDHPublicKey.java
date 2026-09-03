package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import oO0000Oo.OooO00o;
import p032OoooO0.o0O000Oo;
import p677o0oooo0o.oOo0oooO;
import p682o0oooooO.qk;
import p682o0oooooO.rk;

/* JADX INFO: loaded from: classes3.dex */
public class JCEDHPublicKey implements DHPublicKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f53687Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public DHParameterSpec f53688Oooo0oO;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f53687Oooo0o = (BigInteger) objectInputStream.readObject();
        this.f53688Oooo0oO = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.f53688Oooo0oO.getP());
        objectOutputStream.writeObject(this.f53688Oooo0oO.getG());
        objectOutputStream.writeInt(this.f53688Oooo0oO.getL());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return o0O000Oo.OooO0o0(new OooO00o(rk.f52254OooO0Oo, new qk(this.f53688Oooo0oO.getP(), this.f53688Oooo0oO.getG(), this.f53688Oooo0oO.getL())), new oOo0oooO(this.f53687Oooo0o));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public final DHParameterSpec getParams() {
        return this.f53688Oooo0oO;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public final BigInteger getY() {
        return this.f53687Oooo0o;
    }
}
