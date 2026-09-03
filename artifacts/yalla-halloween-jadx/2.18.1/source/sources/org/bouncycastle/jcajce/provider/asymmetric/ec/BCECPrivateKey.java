package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import java.util.Vector;
import oO0000o0.OooO0O0;
import oO0000o0.OooOOO0;
import oO000Oo.OooO0o;
import oO0OOoO0.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p314o0O0oO0o.o00000O;
import p418o0Oo0oo.oo000o;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOo0oooO;
import p682o0oooooO.sk;
import p683o0oooooo.vk;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient OooO00o f53633Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53634Oooo0o = "EC";

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient BigInteger f53635Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient ECParameterSpec f53636Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient oOO0Oo00 f53637OoooO00;

    public BCECPrivateKey() {
        new Hashtable();
        new Vector();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.f53633Oooo = BouncyCastleProvider.f53675Oooo0o;
        sk skVarOooO = sk.OooO(oO0OO0O.OooOO0o(bArr));
        OooO0O0 oooO0O0OooO = OooO0O0.OooO(skVarOooO.f52260Oooo0oO.f52393Oooo0oO);
        this.f53636Oooo0oo = oO0o0o.OooO00o.OooO0o0(oooO0O0OooO, oO0o0o.OooO00o.OooO0o(this.f53633Oooo, oooO0O0OooO));
        oO0O00o0 oo0o00o0OooOO0 = skVarOooO.OooOO0();
        if (oo0o00o0OooOO0 instanceof oOo0oooO) {
            this.f53635Oooo0oO = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
        } else {
            vk vkVarOooO = vk.OooO(oo0o00o0OooOO0);
            this.f53635Oooo0oO = vkVarOooO.OooOO0();
            this.f53637OoooO00 = vkVarOooO.OooOO0O();
        }
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53636Oooo0oo;
        return eCParameterSpec != null ? oO0o0o.OooO00o.OooO0Oo(eCParameterSpec, false) : this.f53633Oooo.OooO0O0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return this.f53635Oooo0oO.equals(bCECPrivateKey.f53635Oooo0oO) && OooO00o().equals(bCECPrivateKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53634Oooo0o;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        OooO0O0 OooO0O1 = oo000o.OooO0O0(this.f53636Oooo0oo);
        ECParameterSpec eCParameterSpec = this.f53636Oooo0oo;
        int iOooO0o = eCParameterSpec == null ? o00000O.OooO0o(this.f53633Oooo, null, getS()) : o00000O.OooO0o(this.f53633Oooo, eCParameterSpec.getOrder(), getS());
        try {
            return new sk(new oO0000Oo.OooO00o(OooOOO0.f52464OooOOO0, OooO0O1), this.f53637OoooO00 != null ? new vk(iOooO0o, getS(), this.f53637OoooO00, OooO0O1) : new vk(iOooO0o, getS(), null, OooO0O1)).OooO0oo("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.f53636Oooo0oo;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public final BigInteger getS() {
        return this.f53635Oooo0oO;
    }

    public final int hashCode() {
        return this.f53635Oooo0oO.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = OooO0o.f52666OooO00o;
        stringBuffer.append("EC Private Key");
        stringBuffer.append(str);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f53635Oooo0oO.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
