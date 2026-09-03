package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Enumeration;
import java.util.Objects;
import oO0000o0.OooO0o;
import oO0000o0.OooOOO0;
import oO0o0o.OooO00o;
import oO0o0o.OooO0O0;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O0Oo0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0000;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO00O;
import p677o0oooo0o.ooOOO0Oo;
import p679o0ooooOo.lk;
import p679o0ooooOo.mk;
import p682o0oooooO.sk;
import p683o0oooooo.wk;
import p696oO0OO0oo.OooOO0O;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f53689Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public BigInteger f53691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ECParameterSpec f53692Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public oOO0Oo00 f53694OoooO00;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53690Oooo0o = "EC";

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO0O0 f53693OoooO0 = new OooO0O0();

    /* JADX WARN: Code duplicated, block: B:15:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:16:0x00da  */
    /* JADX WARN: Code duplicated, block: B:19:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:28:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f2 A[SYNTHETIC] */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ECParameterSpec eCParameterSpec;
        oO0O00o0 oo0o00o0OooOO0;
        Enumeration enumerationOooOo0;
        oO0O00o0 oo0o00o0;
        oOO0000 ooo0000;
        sk skVarOooO = sk.OooO(oO0OO0O.OooOO0o((byte[]) objectInputStream.readObject()));
        oO0OO0O oo0oo0o = (oO0OO0O) skVarOooO.f52260Oooo0oO.f52393Oooo0oO;
        oO0OO0O oo0oo0oOooOOo0 = null;
        if (!(oo0oo0o instanceof ooOOO0Oo)) {
            if (oo0oo0o instanceof oO0O0Oo0) {
                this.f53692Oooo0oo = null;
            } else {
                OooO0o oooO0oOooOO0 = OooO0o.OooOO0(oo0oo0o);
                eCParameterSpec = new ECParameterSpec(OooO00o.OooO00o(oooO0oOooOO0.f52450Oooo0oO), new ECPoint(oooO0oOooOO0.OooO().OooO0o0().OooOOoo(), oooO0oOooOO0.OooO().OooO0o().OooOOoo()), oooO0oOooOO0.f52448Oooo, oooO0oOooOO0.f52453OoooO00.intValue());
            }
            oo0o00o0OooOO0 = skVarOooO.OooOO0();
            if (oo0o00o0OooOO0 instanceof oOo0oooO) {
                this.f53691Oooo0oO = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
            } else {
                oO0Oo0o0 oo0oo0o0 = (oO0Oo0o0) oo0o00o0OooOO0;
                this.f53691Oooo0oO = new BigInteger(1, ((ooOOO00O) oo0oo0o0.OooOo00(1)).OooOOoo());
                enumerationOooOo0 = oo0oo0o0.OooOo0();
                while (enumerationOooOo0.hasMoreElements()) {
                    oo0o00o0 = (oO0O00o0) enumerationOooOo0.nextElement();
                    if (oo0o00o0 instanceof oOO0000) {
                        ooo0000 = (oOO0000) oo0o00o0;
                        if (ooo0000.f52161Oooo0o == 1) {
                            oo0oo0oOooOOo0 = ooo0000.OooOOo0();
                            Objects.requireNonNull(oo0oo0oOooOOo0);
                            break;
                        }
                    }
                }
                this.f53694OoooO00 = (oOO0Oo00) oo0oo0oOooOOo0;
            }
            this.f53690Oooo0o = (String) objectInputStream.readObject();
            this.f53689Oooo = objectInputStream.readBoolean();
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f53693OoooO0 = oooO0O0;
            oooO0O0.OooO00o(objectInputStream);
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
        this.f53692Oooo0oo = eCParameterSpec;
        oo0o00o0OooOO0 = skVarOooO.OooOO0();
        if (oo0o00o0OooOO0 instanceof oOo0oooO) {
            this.f53691Oooo0oO = oOo0oooO.OooOOo0(oo0o00o0OooOO0).OooOo00();
        } else {
            oO0Oo0o0 oo0oo0o1 = (oO0Oo0o0) oo0o00o0OooOO0;
            this.f53691Oooo0oO = new BigInteger(1, ((ooOOO00O) oo0oo0o1.OooOo00(1)).OooOOoo());
            enumerationOooOo0 = oo0oo0o1.OooOo0();
            while (enumerationOooOo0.hasMoreElements()) {
                oo0o00o0 = (oO0O00o0) enumerationOooOo0.nextElement();
                if (oo0o00o0 instanceof oOO0000) {
                    ooo0000 = (oOO0000) oo0o00o0;
                    if (ooo0000.f52161Oooo0o == 1) {
                        oo0oo0oOooOOo0 = ooo0000.OooOOo0();
                        Objects.requireNonNull(oo0oo0oOooOOo0);
                        break;
                    }
                }
            }
            this.f53694OoooO00 = (oOO0Oo00) oo0oo0oOooOOo0;
        }
        this.f53690Oooo0o = (String) objectInputStream.readObject();
        this.f53689Oooo = objectInputStream.readBoolean();
        OooO0O0 oooO0O1 = new OooO0O0();
        this.f53693OoooO0 = oooO0O1;
        oooO0O1.OooO00o(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.f53690Oooo0o);
        objectOutputStream.writeBoolean(this.f53689Oooo);
        this.f53693OoooO0.OooO0O0(objectOutputStream);
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53692Oooo0oo;
        return eCParameterSpec != null ? OooO00o.OooO0Oo(eCParameterSpec, this.f53689Oooo) : BouncyCastleProvider.f53675Oooo0o.OooO0O0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return this.f53691Oooo0oO.equals(jCEECPrivateKey.f53691Oooo0oO) && OooO00o().equals(jCEECPrivateKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53690Oooo0o;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        oO0000o0.OooO0O0 oooO0O0;
        ECParameterSpec eCParameterSpec = this.f53692Oooo0oo;
        if (eCParameterSpec instanceof Oooo0) {
            ooOOO0Oo ooooo0ooOooO0o0 = o00000O.OooO0o0(((Oooo0) eCParameterSpec).f52924OooO00o);
            if (ooooo0ooOooO0o0 == null) {
                ooooo0ooOooO0o0 = new ooOOO0Oo(((Oooo0) this.f53692Oooo0oo).f52924OooO00o);
            }
            oooO0O0 = new oO0000o0.OooO0O0(ooooo0ooOooO0o0);
        } else if (eCParameterSpec == null) {
            oooO0O0 = new oO0000o0.OooO0O0();
        } else {
            OooOO0O oooOO0OOooO0O0 = OooO00o.OooO0O0(eCParameterSpec.getCurve());
            oooO0O0 = new oO0000o0.OooO0O0(new OooO0o(oooOO0OOooO0O0, OooO00o.OooO0OO(oooOO0OOooO0O0, this.f53692Oooo0oo.getGenerator()), this.f53692Oooo0oo.getOrder(), BigInteger.valueOf(this.f53692Oooo0oo.getCofactor()), this.f53692Oooo0oo.getCurve().getSeed()));
        }
        wk wkVar = this.f53694OoooO00 != null ? new wk(getS(), this.f53694OoooO00, oooO0O0) : new wk(getS(), null, oooO0O0);
        try {
            return (this.f53690Oooo0o.equals("ECGOST3410") ? new sk(new oO0000Oo.OooO00o(lk.f52211OooO0O0, oooO0O0.f52443Oooo0o), wkVar.f52274Oooo0o) : new sk(new oO0000Oo.OooO00o(OooOOO0.f52464OooOOO0, oooO0O0.f52443Oooo0o), wkVar.f52274Oooo0o)).OooO0oo("DER");
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
        return this.f53692Oooo0oo;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public final BigInteger getS() {
        return this.f53691Oooo0oO;
    }

    public final int hashCode() {
        return this.f53691Oooo0oO.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        stringBuffer.append("EC Private Key");
        stringBuffer.append(str);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f53691Oooo0oO.toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
