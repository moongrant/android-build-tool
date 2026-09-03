package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import p701oO0Oo0oo.o00O0O;
import p701oO0Oo0oo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PrivateKey implements GOST3410PrivateKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient o00O0O f53652Oooo0o;

    public BCGOST3410PrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.f53652Oooo0o = new o00O0O(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.f53652Oooo0o = new o00O0O(new o00Oo0((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        o00O0O o00o0o2;
        objectOutputStream.defaultWriteObject();
        String str = this.f53652Oooo0o.f52932OooO0O0;
        if (str != null) {
            objectOutputStream.writeObject(str);
            objectOutputStream.writeObject(this.f53652Oooo0o.f52933OooO0OO);
            o00o0o2 = this.f53652Oooo0o;
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.f53652Oooo0o.f52931OooO00o.f52935OooO00o);
            objectOutputStream.writeObject(this.f53652Oooo0o.f52931OooO00o.f52936OooO0O0);
            objectOutputStream.writeObject(this.f53652Oooo0o.f52931OooO00o.f52937OooO0OO);
            objectOutputStream.writeObject(this.f53652Oooo0o.f52933OooO0OO);
            o00o0o2 = this.f53652Oooo0o;
        }
        objectOutputStream.writeObject(o00o0o2.f52934OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PrivateKey)) {
            return false;
        }
        ((GOST3410PrivateKey) obj).getX();
        throw null;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public final BigInteger getX() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }
}
