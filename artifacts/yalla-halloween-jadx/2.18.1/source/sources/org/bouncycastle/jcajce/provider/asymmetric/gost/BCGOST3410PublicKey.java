package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Objects;
import oO000Oo.OooO0o;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import p701oO0Oo0oo.o00O0O;
import p701oO0Oo0oo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PublicKey implements GOST3410PublicKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient o00O0O f53653Oooo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.f53653Oooo0o = new o00O0O(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.f53653Oooo0o = new o00O0O(new o00Oo0((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        o00O0O o00o0o2;
        objectOutputStream.defaultWriteObject();
        String str = this.f53653Oooo0o.f52932OooO0O0;
        if (str != null) {
            objectOutputStream.writeObject(str);
            objectOutputStream.writeObject(this.f53653Oooo0o.f52933OooO0OO);
            o00o0o2 = this.f53653Oooo0o;
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.f53653Oooo0o.f52931OooO00o.f52935OooO00o);
            objectOutputStream.writeObject(this.f53653Oooo0o.f52931OooO00o.f52936OooO0O0);
            objectOutputStream.writeObject(this.f53653Oooo0o.f52931OooO00o.f52937OooO0OO);
            objectOutputStream.writeObject(this.f53653Oooo0o.f52933OooO0OO);
            o00o0o2 = this.f53653Oooo0o;
        }
        objectOutputStream.writeObject(o00o0o2.f52934OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        Objects.requireNonNull((BCGOST3410PublicKey) obj);
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
        return "X.509";
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = OooO0o.f52666OooO00o;
        stringBuffer.append("GOST3410 Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            y: ");
        throw null;
    }
}
