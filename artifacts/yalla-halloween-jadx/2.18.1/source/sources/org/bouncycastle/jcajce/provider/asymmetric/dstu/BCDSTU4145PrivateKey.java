package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Hashtable;
import java.util.Vector;
import oO00000.OooO0OO;
import oO00000.OooOO0;
import oO0000o0.OooO0O0;
import oO0000o0.OooO0o;
import oO0000o0.OooOOO0;
import oO0o0o.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O0Oo0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO0Oo;
import p682o0oooooO.sk;
import p683o0oooooo.vk;
import p696oO0OO0oo.OooOO0O;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient oOO0Oo00 f53625Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53626Oooo0o = "DSTU4145";

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient BigInteger f53627Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient ECParameterSpec f53628Oooo0oo;

    public BCDSTU4145PrivateKey() {
        new Hashtable();
        new Vector();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:16:0x00db  */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ECParameterSpec eCParameterSpec;
        oO0O00o0 oo0o00o0OooOO0;
        objectInputStream.defaultReadObject();
        sk skVarOooO = sk.OooO(oO0OO0O.OooOO0o((byte[]) objectInputStream.readObject()));
        oO0OO0O oo0oo0o = (oO0OO0O) skVarOooO.f52260Oooo0oO.f52393Oooo0oO;
        if (!(oo0oo0o instanceof ooOOO0Oo)) {
            if (oo0oo0o instanceof oO0O0Oo0) {
                this.f53628Oooo0oo = null;
            } else {
                OooO0o oooO0oOooOO0 = OooO0o.OooOO0(oo0oo0o);
                eCParameterSpec = new ECParameterSpec(OooO00o.OooO00o(oooO0oOooOO0.f52450Oooo0oO), new ECPoint(oooO0oOooOO0.OooO().OooO0o0().OooOOoo(), oooO0oOooOO0.OooO().OooO0o().OooOOoo()), oooO0oOooOO0.f52448Oooo, oooO0oOooOO0.f52453OoooO00.intValue());
            }
            oo0o00o0OooOO0 = skVarOooO.OooOO0();
            if (oo0o00o0OooOO0 instanceof oOo0oooO) {
                this.f53627Oooo0oO = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
            } else {
                vk vkVarOooO = vk.OooO(oo0o00o0OooOO0);
                this.f53627Oooo0oO = vkVarOooO.OooOO0();
                this.f53625Oooo = vkVarOooO.OooOO0O();
            }
            new Hashtable();
            new Vector();
        }
        ooOOO0Oo ooooo0ooOooOo0 = ooOOO0Oo.OooOo0(oo0oo0o);
        OooO0o oooO0oOooO0Oo = o00000O.OooO0Oo(ooooo0ooOooOo0);
        if (oooO0oOooO0Oo == null) {
            oO000O0.OooO0o oooO0oOooO00o = OooO0OO.OooO00o(ooooo0ooOooOo0);
            OooOO0O oooOO0O = oooO0oOooO00o.f52545OooO0Oo;
            oooO0oOooO00o.OooO00o();
            eCParameterSpec = new Oooo0(ooooo0ooOooOo0.f52198Oooo0o, OooO00o.OooO00o(oooOO0O), new ECPoint(oooO0oOooO00o.f52546OooO0o.OooO0o0().OooOOoo(), oooO0oOooO00o.f52546OooO0o.OooO0o().OooOOoo()), oooO0oOooO00o.f52548OooO0oO, oooO0oOooO00o.f52549OooO0oo);
        } else {
            eCParameterSpec = new Oooo0(o00000O.OooO0O0(ooooo0ooOooOo0), OooO00o.OooO00o(oooO0oOooO0Oo.f52450Oooo0oO), new ECPoint(oooO0oOooO0Oo.OooO().OooO0o0().OooOOoo(), oooO0oOooO0Oo.OooO().OooO0o().OooOOoo()), oooO0oOooO0Oo.f52448Oooo, oooO0oOooO0Oo.f52453OoooO00);
        }
        this.f53628Oooo0oo = eCParameterSpec;
        oo0o00o0OooOO0 = skVarOooO.OooOO0();
        if (oo0o00o0OooOO0 instanceof oOo0oooO) {
            this.f53627Oooo0oO = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
        } else {
            vk vkVarOooO2 = vk.OooO(oo0o00o0OooOO0);
            this.f53627Oooo0oO = vkVarOooO2.OooOO0();
            this.f53625Oooo = vkVarOooO2.OooOO0O();
        }
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53628Oooo0oo;
        return eCParameterSpec != null ? OooO00o.OooO0Oo(eCParameterSpec, false) : BouncyCastleProvider.f53675Oooo0o.OooO0O0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return this.f53627Oooo0oO.equals(bCDSTU4145PrivateKey.f53627Oooo0oO) && OooO00o().equals(bCDSTU4145PrivateKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53626Oooo0o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0083  */
    /* JADX WARN: Code duplicated, block: B:15:0x008f  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a2 A[Catch: IOException -> 0x00ca, TryCatch #0 {IOException -> 0x00ca, blocks: (B:16:0x0098, B:18:0x00a2, B:20:0x00c3, B:19:0x00b3), top: B:23:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b3 A[Catch: IOException -> 0x00ca, TryCatch #0 {IOException -> 0x00ca, blocks: (B:16:0x0098, B:18:0x00a2, B:20:0x00c3, B:19:0x00b3), top: B:23:0x0098 }] */
    @Override // java.security.Key
    public final byte[] getEncoded() {
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O1;
        int iOooO0o;
        vk vkVar;
        sk skVar;
        ECParameterSpec eCParameterSpec = this.f53628Oooo0oo;
        try {
            if (!(eCParameterSpec instanceof Oooo0)) {
                if (eCParameterSpec == null) {
                    oooO0O1 = new OooO0O0();
                    iOooO0o = o00000O.OooO0o(BouncyCastleProvider.f53675Oooo0o, null, getS());
                } else {
                    OooOO0O oooOO0OOooO0O0 = OooO00o.OooO0O0(eCParameterSpec.getCurve());
                    oooO0O0 = new OooO0O0(new OooO0o(oooOO0OOooO0O0, OooO00o.OooO0OO(oooOO0OOooO0O0, this.f53628Oooo0oo.getGenerator()), this.f53628Oooo0oo.getOrder(), BigInteger.valueOf(this.f53628Oooo0oo.getCofactor()), this.f53628Oooo0oo.getCurve().getSeed()));
                }
                if (this.f53625Oooo != null) {
                    vkVar = new vk(iOooO0o, getS(), this.f53625Oooo, oooO0O1);
                } else {
                    vkVar = new vk(iOooO0o, getS(), null, oooO0O1);
                }
                if (this.f53626Oooo0o.equals("DSTU4145")) {
                    skVar = new sk(new oO0000Oo.OooO00o(OooOO0.f52370OooO0O0, oooO0O1.f52443Oooo0o), vkVar.f52273Oooo0o);
                } else {
                    skVar = new sk(new oO0000Oo.OooO00o(OooOOO0.f52464OooOOO0, oooO0O1.f52443Oooo0o), vkVar.f52273Oooo0o);
                }
                return skVar.OooO0oo("DER");
            }
            ooOOO0Oo ooooo0ooOooO0o0 = o00000O.OooO0o0(((Oooo0) eCParameterSpec).f52924OooO00o);
            if (ooooo0ooOooO0o0 == null) {
                ooooo0ooOooO0o0 = new ooOOO0Oo(((Oooo0) this.f53628Oooo0oo).f52924OooO00o);
            }
            oooO0O0 = new OooO0O0(ooooo0ooOooO0o0);
            if (this.f53626Oooo0o.equals("DSTU4145")) {
                skVar = new sk(new oO0000Oo.OooO00o(OooOO0.f52370OooO0O0, oooO0O1.f52443Oooo0o), vkVar.f52273Oooo0o);
            } else {
                skVar = new sk(new oO0000Oo.OooO00o(OooOOO0.f52464OooOOO0, oooO0O1.f52443Oooo0o), vkVar.f52273Oooo0o);
            }
            return skVar.OooO0oo("DER");
        } catch (IOException unused) {
            return null;
        }
        OooO0O0 oooO0O2 = oooO0O0;
        iOooO0o = o00000O.OooO0o(BouncyCastleProvider.f53675Oooo0o, this.f53628Oooo0oo.getOrder(), getS());
        oooO0O1 = oooO0O2;
        if (this.f53625Oooo != null) {
            vkVar = new vk(iOooO0o, getS(), this.f53625Oooo, oooO0O1);
        } else {
            vkVar = new vk(iOooO0o, getS(), null, oooO0O1);
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.f53628Oooo0oo;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public final BigInteger getS() {
        return this.f53627Oooo0oO;
    }

    public final int hashCode() {
        return this.f53627Oooo0oO.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        stringBuffer.append("EC Private Key");
        stringBuffer.append(str);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f53627Oooo0oO.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
