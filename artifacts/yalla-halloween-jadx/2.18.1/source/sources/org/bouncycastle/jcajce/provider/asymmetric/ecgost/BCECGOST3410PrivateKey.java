package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Hashtable;
import java.util.Vector;
import oO0000o0.OooO0O0;
import oO0000o0.OooO0o;
import oO0o0o.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p206o00o0o0o.o000OO0O;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O0Oo0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO00O;
import p677o0oooo0o.ooOOO0Oo;
import p679o0ooooOo.lk;
import p679o0ooooOo.mk;
import p679o0ooooOo.pk;
import p682o0oooooO.sk;
import p683o0oooooo.vk;
import p696oO0OO0oo.OooOO0O;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.Oooo000;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient ECParameterSpec f53641Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53642Oooo0o = "ECGOST3410";

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient pk f53643Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient BigInteger f53644Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient oOO0Oo00 f53645OoooO00;

    public BCECGOST3410PrivateKey() {
        new Hashtable();
        new Vector();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0172  */
    /* JADX WARN: Code duplicated, block: B:31:0x017d  */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ECParameterSpec eCParameterSpec;
        oO0O00o0 oo0o00o0OooOO0;
        BigInteger bigIntegerOooOo00;
        objectInputStream.defaultReadObject();
        sk skVarOooO = sk.OooO(oO0OO0O.OooOO0o((byte[]) objectInputStream.readObject()));
        oO0OO0O oo0oo0oOooO0O0 = skVarOooO.f52260Oooo0oO.f52393Oooo0oO.OooO0O0();
        if (!(oo0oo0oOooO0O0 instanceof oO0Oo0o0) || (oO0Oo0o0.OooOOo0(oo0oo0oOooO0O0).size() != 2 && oO0Oo0o0.OooOOo0(oo0oo0oOooO0O0).size() != 3)) {
            oO0OO0O oo0oo0o = OooO0O0.OooO(skVarOooO.f52260Oooo0oO.f52393Oooo0oO).f52443Oooo0o;
            if (!(oo0oo0o instanceof ooOOO0Oo)) {
                if (oo0oo0o instanceof oO0O0Oo0) {
                    this.f53641Oooo = null;
                } else {
                    OooO0o oooO0oOooOO0 = OooO0o.OooOO0(oo0oo0o);
                    eCParameterSpec = new ECParameterSpec(OooO00o.OooO00o(oooO0oOooOO0.f52450Oooo0oO), new ECPoint(oooO0oOooOO0.OooO().OooO0o0().OooOOoo(), oooO0oOooOO0.OooO().OooO0o().OooOOoo()), oooO0oOooOO0.f52448Oooo, oooO0oOooOO0.f52453OoooO00.intValue());
                }
                oo0o00o0OooOO0 = skVarOooO.OooOO0();
                if (oo0o00o0OooOO0 instanceof oOo0oooO) {
                    bigIntegerOooOo00 = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
                } else {
                    vk vkVarOooO = vk.OooO(oo0o00o0OooOO0);
                    this.f53644Oooo0oo = vkVarOooO.OooOO0();
                    this.f53645OoooO00 = vkVarOooO.OooOO0O();
                }
                new Hashtable();
                new Vector();
            }
            ooOOO0Oo ooooo0ooOooOo0 = ooOOO0Oo.OooOo0(oo0oo0o);
            OooO0o oooO0oOooO0Oo = o00000O.OooO0Oo(ooooo0ooOooOo0);
            if (oooO0oOooO0Oo == null) {
                oO000O0.OooO0o oooO0oOooO00o = mk.OooO00o(ooooo0ooOooOo0);
                OooOO0O oooOO0O = oooO0oOooO00o.f52545OooO0Oo;
                oooO0oOooO00o.OooO00o();
                eCParameterSpec = new Oooo0(mk.OooO0O0(ooooo0ooOooOo0), OooO00o.OooO00o(oooOO0O), new ECPoint(oooO0oOooO00o.f52546OooO0o.OooO0o0().OooOOoo(), oooO0oOooO00o.f52546OooO0o.OooO0o().OooOOoo()), oooO0oOooO00o.f52548OooO0oO, oooO0oOooO00o.f52549OooO0oo);
            } else {
                eCParameterSpec = new Oooo0(o00000O.OooO0O0(ooooo0ooOooOo0), OooO00o.OooO00o(oooO0oOooO0Oo.f52450Oooo0oO), new ECPoint(oooO0oOooO0Oo.OooO().OooO0o0().OooOOoo(), oooO0oOooO0Oo.OooO().OooO0o().OooOOoo()), oooO0oOooO0Oo.f52448Oooo, oooO0oOooO0Oo.f52453OoooO00);
            }
            this.f53641Oooo = eCParameterSpec;
            oo0o00o0OooOO0 = skVarOooO.OooOO0();
            if (oo0o00o0OooOO0 instanceof oOo0oooO) {
                bigIntegerOooOo00 = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
            } else {
                vk vkVarOooO2 = vk.OooO(oo0o00o0OooOO0);
                this.f53644Oooo0oo = vkVarOooO2.OooOO0();
                this.f53645OoooO00 = vkVarOooO2.OooOO0O();
            }
            new Hashtable();
            new Vector();
        }
        pk pkVarOooO = pk.OooO(skVarOooO.f52260Oooo0oO.f52393Oooo0oO);
        this.f53643Oooo0oO = pkVarOooO;
        Oooo000 oooo000OooO0OO = o000OO0O.OooO0OO(mk.OooO0O0(pkVarOooO.f52232Oooo0o));
        this.f53641Oooo = new Oooo0(mk.OooO0O0(this.f53643Oooo0oO.f52232Oooo0o), OooO00o.OooO00o(oooo000OooO0OO.f52926OooO00o), new ECPoint(oooo000OooO0OO.f52928OooO0OO.OooO0o0().OooOOoo(), oooo000OooO0OO.f52928OooO0OO.OooO0o().OooOOoo()), oooo000OooO0OO.f52929OooO0Oo, oooo000OooO0OO.f52930OooO0o0);
        oO0O00o0 oo0o00o0OooOO1 = skVarOooO.OooOO0();
        if (oo0o00o0OooOO1 instanceof oOo0oooO) {
            bigIntegerOooOo00 = oOo0oooO.OooOOo0(oo0o00o0OooOO1).OooOOoo();
        } else {
            byte[] bArrOooOOoo = ooOOO00O.OooOOo0(oo0o00o0OooOO1).OooOOoo();
            byte[] bArr = new byte[bArrOooOOoo.length];
            for (int i = 0; i != bArrOooOOoo.length; i++) {
                bArr[i] = bArrOooOOoo[(bArrOooOOoo.length - 1) - i];
            }
            bigIntegerOooOo00 = new BigInteger(1, bArr);
        }
        this.f53644Oooo0oo = bigIntegerOooOo00;
        new Hashtable();
        new Vector();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53641Oooo;
        return eCParameterSpec != null ? OooO00o.OooO0Oo(eCParameterSpec, false) : BouncyCastleProvider.f53675Oooo0o.OooO0O0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return this.f53644Oooo0oo.equals(bCECGOST3410PrivateKey.f53644Oooo0oo) && OooO00o().equals(bCECGOST3410PrivateKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53642Oooo0o;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    @Override // java.security.Key
    public final byte[] getEncoded() {
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O1;
        int iOooO0o;
        vk vkVar;
        if (this.f53643Oooo0oO != null) {
            byte[] bArr = new byte[32];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < 32) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
                byteArray = bArr2;
            }
            for (int i = 0; i != 32; i++) {
                bArr[0 + i] = byteArray[(byteArray.length - 1) - i];
            }
            try {
                return new sk(new oO0000Oo.OooO00o(lk.f52211OooO0O0, this.f53643Oooo0oO), new oOOO0OO0(bArr)).OooO0oo("DER");
            } catch (IOException unused) {
                return null;
            }
        }
        ECParameterSpec eCParameterSpec = this.f53641Oooo;
        try {
            if (!(eCParameterSpec instanceof Oooo0)) {
                if (eCParameterSpec == null) {
                    oooO0O1 = new OooO0O0();
                    iOooO0o = o00000O.OooO0o(BouncyCastleProvider.f53675Oooo0o, null, getS());
                } else {
                    OooOO0O oooOO0OOooO0O0 = OooO00o.OooO0O0(eCParameterSpec.getCurve());
                    oooO0O0 = new OooO0O0(new OooO0o(oooOO0OOooO0O0, OooO00o.OooO0OO(oooOO0OOooO0O0, this.f53641Oooo.getGenerator()), this.f53641Oooo.getOrder(), BigInteger.valueOf(this.f53641Oooo.getCofactor()), this.f53641Oooo.getCurve().getSeed()));
                }
                if (this.f53645OoooO00 != null) {
                    vkVar = new vk(iOooO0o, getS(), this.f53645OoooO00, oooO0O1);
                } else {
                    vkVar = new vk(iOooO0o, getS(), null, oooO0O1);
                }
                return new sk(new oO0000Oo.OooO00o(lk.f52211OooO0O0, oooO0O1.f52443Oooo0o), vkVar.f52273Oooo0o).OooO0oo("DER");
            }
            ooOOO0Oo ooooo0ooOooO0o0 = o00000O.OooO0o0(((Oooo0) eCParameterSpec).f52924OooO00o);
            if (ooooo0ooOooO0o0 == null) {
                ooooo0ooOooO0o0 = new ooOOO0Oo(((Oooo0) this.f53641Oooo).f52924OooO00o);
            }
            oooO0O0 = new OooO0O0(ooooo0ooOooO0o0);
            return new sk(new oO0000Oo.OooO00o(lk.f52211OooO0O0, oooO0O1.f52443Oooo0o), vkVar.f52273Oooo0o).OooO0oo("DER");
        } catch (IOException unused2) {
            return null;
        }
        OooO0O0 oooO0O2 = oooO0O0;
        iOooO0o = o00000O.OooO0o(BouncyCastleProvider.f53675Oooo0o, this.f53641Oooo.getOrder(), getS());
        oooO0O1 = oooO0O2;
        if (this.f53645OoooO00 != null) {
            vkVar = new vk(iOooO0o, getS(), this.f53645OoooO00, oooO0O1);
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
        return this.f53641Oooo;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public final BigInteger getS() {
        return this.f53644Oooo0oo;
    }

    public final int hashCode() {
        return this.f53644Oooo0oo.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        stringBuffer.append("EC Private Key");
        stringBuffer.append(str);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f53644Oooo0oo.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
