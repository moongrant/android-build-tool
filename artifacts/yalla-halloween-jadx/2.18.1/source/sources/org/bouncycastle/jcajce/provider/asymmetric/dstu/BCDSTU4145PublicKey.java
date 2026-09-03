package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Objects;
import oO00000.OooO;
import oO00000.OooO0O0;
import oO00000.OooO0OO;
import oO00000.OooO0o;
import oO000O0.OooOO0;
import oO000Oo.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p032OoooO0.o0O000Oo;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.ooOOO00O;
import p677o0oooo0o.ooOOO0Oo;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOOO0;
import p696oO0OO0oo.OooOo00;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.Oooo000;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient OooO0o f53629Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53630Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient OooOO0 f53631Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient ECParameterSpec f53632Oooo0oo;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        o000oOoO o000oooo2;
        objectInputStream.defaultReadObject();
        oO0000Oo.OooO0o oooO0oOooO = oO0000Oo.OooO0o.OooO(oO0OO0O.OooOO0o((byte[]) objectInputStream.readObject()));
        oOO0Oo00 ooo0oo00 = oooO0oOooO.f52413Oooo0oO;
        this.f53630Oooo0o = "DSTU4145";
        try {
            byte[] bArrOooOOoo = ((ooOOO00O) oO0OO0O.OooOO0o(ooo0oo00.OooOOo0())).OooOOoo();
            ooOOO0Oo ooooo0oo = oooO0oOooO.f52412Oooo0o.f52392Oooo0o;
            ooOOO0Oo ooooo0oo2 = oO00000.OooOO0.f52369OooO00o;
            if (ooooo0oo.equals(ooooo0oo2)) {
                OooO0O0(bArrOooOOoo);
            }
            oOo0o0oO ooo0o0oo = (oO0Oo0o0) oooO0oOooO.f52412Oooo0o.f52393Oooo0oO;
            OooO0O0 oooO0O0 = null;
            if (ooo0o0oo instanceof OooO0o) {
                oooO0o2 = (OooO0o) ooo0o0oo;
            } else {
                if (ooo0o0oo == null) {
                    throw new IllegalArgumentException("object parse error");
                }
                oO0Oo0o0 oo0oo0o0OooOOo0 = oO0Oo0o0.OooOOo0(ooo0o0oo);
                if (oo0oo0o0OooOOo0.OooOo00(0) instanceof ooOOO0Oo) {
                    oooO0o = new OooO0o(ooOOO0Oo.OooOo0(oo0oo0o0OooOOo0.OooOo00(0)));
                } else {
                    oO0O00o0 oo0o00o0OooOo00 = oo0oo0o0OooOOo0.OooOo00(0);
                    if (oo0o00o0OooOo00 instanceof OooO0O0) {
                        oooO0O0 = (OooO0O0) oo0o00o0OooOo00;
                    } else if (oo0o00o0OooOo00 != null) {
                        oooO0O0 = new OooO0O0(oO0Oo0o0.OooOOo0(oo0o00o0OooOo00));
                    }
                    oooO0o = new OooO0o(oooO0O0);
                }
                if (oo0oo0o0OooOOo0.size() == 2) {
                    byte[] bArrOooOOoo2 = ooOOO00O.OooOOo0(oo0oo0o0OooOOo0.OooOo00(1)).OooOOoo();
                    oooO0o.f52368Oooo0oo = bArrOooOOoo2;
                    if (bArrOooOOoo2.length != 64) {
                        throw new IllegalArgumentException("object parse error");
                    }
                }
                oooO0o2 = oooO0o;
            }
            this.f53629Oooo = oooO0o2;
            ooOOO0Oo ooooo0oo3 = oooO0o2.f52366Oooo0o;
            if (ooooo0oo3 != null) {
                oO000O0.OooO0o oooO0oOooO00o = OooO0OO.OooO00o(ooooo0oo3);
                o000oooo2 = new Oooo000(ooooo0oo3.f52198Oooo0o, oooO0oOooO00o.f52545OooO0Oo, oooO0oOooO00o.f52546OooO0o, oooO0oOooO00o.f52548OooO0oO, oooO0oOooO00o.f52549OooO0oo, oooO0oOooO00o.OooO00o());
            } else {
                OooO0O0 oooO0O1 = oooO0o2.f52367Oooo0oO;
                byte[] bArrOooO0OO = OooO00o.OooO0OO(oooO0O1.f52356Oooo.OooOOoo());
                if (oooO0oOooO.f52412Oooo0o.f52392Oooo0o.equals(ooooo0oo2)) {
                    OooO0O0(bArrOooO0OO);
                }
                oO00000.OooO00o oooO00o = oooO0O1.f52358Oooo0oO;
                OooOO0O.OooO0OO oooO0OO = new OooOO0O.OooO0OO(oooO00o.f52353Oooo0o, oooO00o.f52354Oooo0oO, oooO00o.f52355Oooo0oo, oooO00o.f52352Oooo, oooO0O1.f52359Oooo0oo.OooOo00(), new BigInteger(1, bArrOooO0OO));
                byte[] bArrOooO0OO2 = OooO00o.OooO0OO(oooO0O1.f52360OoooO0.OooOOoo());
                if (oooO0oOooO.f52412Oooo0o.f52392Oooo0o.equals(ooooo0oo2)) {
                    OooO0O0(bArrOooO0OO2);
                }
                o000oooo2 = new o000oOoO(oooO0OO, OooO.OooO00o(oooO0OO, bArrOooO0OO2), oooO0O1.f52361OoooO00.OooOo00());
            }
            OooOO0O oooOO0O = o000oooo2.f52926OooO00o;
            EllipticCurve ellipticCurveOooO00o = oO0o0o.OooO00o.OooO00o(oooOO0O);
            this.f53632Oooo0oo = this.f53629Oooo.f52366Oooo0o != null ? new Oooo0(this.f53629Oooo.f52366Oooo0o.f52198Oooo0o, ellipticCurveOooO00o, new ECPoint(o000oooo2.f52928OooO0OO.OooO0o0().OooOOoo(), o000oooo2.f52928OooO0OO.OooO0o().OooOOoo()), o000oooo2.f52929OooO0Oo, o000oooo2.f52930OooO0o0) : new ECParameterSpec(ellipticCurveOooO00o, new ECPoint(o000oooo2.f52928OooO0OO.OooO0o0().OooOOoo(), o000oooo2.f52928OooO0OO.OooO0o().OooOOoo()), o000oooo2.f52929OooO0Oo, o000oooo2.f52930OooO0o0.intValue());
            OooOo00 oooOo00OooO00o = OooO.OooO00o(oooOO0O, bArrOooOOoo);
            ECParameterSpec eCParameterSpec = this.f53632Oooo0oo;
            Objects.requireNonNull(eCParameterSpec);
            o00000O.OooO0OO(oO0o0o.OooO00o.OooO0Oo(eCParameterSpec, false));
            this.f53631Oooo0oO = new OooOO0(oooOo00OooO00o);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53632Oooo0oo;
        return eCParameterSpec != null ? oO0o0o.OooO00o.OooO0Oo(eCParameterSpec, false) : BouncyCastleProvider.f53675Oooo0o.OooO0O0();
    }

    public final void OooO0O0(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.f53631Oooo0oO.f52550Oooo0o.OooO0Oo(bCDSTU4145PublicKey.f53631Oooo0oO.f52550Oooo0o) && OooO00o().equals(bCDSTU4145PublicKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53630Oooo0o;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        oO0O00o0 oooO0O0 = this.f53629Oooo;
        if (oooO0O0 == null) {
            ECParameterSpec eCParameterSpec = this.f53632Oooo0oo;
            if (eCParameterSpec instanceof Oooo0) {
                oooO0O0 = new OooO0o(new ooOOO0Oo(((Oooo0) this.f53632Oooo0oo).f52924OooO00o));
            } else {
                OooOO0O oooOO0OOooO0O0 = oO0o0o.OooO00o.OooO0O0(eCParameterSpec.getCurve());
                oooO0O0 = new oO0000o0.OooO0O0(new oO0000o0.OooO0o(oooOO0OOooO0O0, oO0o0o.OooO00o.OooO0OO(oooOO0OOooO0O0, this.f53632Oooo0oo.getGenerator()), this.f53632Oooo0oo.getOrder(), BigInteger.valueOf(this.f53632Oooo0oo.getCofactor()), this.f53632Oooo0oo.getCurve().getSeed()));
            }
        }
        OooOo00 oooOo00OooOOO = this.f53631Oooo0oO.f52550Oooo0o.OooOOO();
        OooOOO0 oooOOO0OooO0o0 = oooOo00OooOOO.OooO0o0();
        byte[] bArrOooO0o0 = oooOOO0OooO0o0.OooO0o0();
        if (!oooOOO0OooO0o0.OooO()) {
            if (OooO.OooO0O0(oooOo00OooOOO.OooO0o().OooO0Oo(oooOOO0OooO0o0)).OooO0oo()) {
                int length = bArrOooO0o0.length - 1;
                bArrOooO0o0[length] = (byte) (bArrOooO0o0[length] | 1);
            } else {
                int length2 = bArrOooO0o0.length - 1;
                bArrOooO0o0[length2] = (byte) (bArrOooO0o0[length2] & 254);
            }
        }
        try {
            return o0O000Oo.OooO0o(new oO0000Oo.OooO0o(new oO0000Oo.OooO00o(oO00000.OooOO0.f52370OooO0O0, oooO0O0), new oOOO0OO0(bArrOooO0o0)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.f53632Oooo0oo;
    }

    @Override // java.security.interfaces.ECPublicKey
    public final ECPoint getW() {
        OooOo00 oooOo00 = this.f53631Oooo0oO.f52550Oooo0o;
        return new ECPoint(oooOo00.OooO0o0().OooOOoo(), oooOo00.OooO0o().OooOOoo());
    }

    public final int hashCode() {
        return this.f53631Oooo0oO.f52550Oooo0o.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        stringBuffer.append("EC Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            X: ");
        OooOo00 oooOo00OooO0OO = this.f53631Oooo0oO.f52550Oooo0o;
        if (this.f53632Oooo0oo == null) {
            oooOo00OooO0OO = oooOo00OooO0OO.OooOOO().OooO0OO();
        }
        stringBuffer.append(oooOo00OooO0OO.OooO0o0().OooOOoo().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        OooOo00 oooOo00OooO0OO2 = this.f53631Oooo0oO.f52550Oooo0o;
        if (this.f53632Oooo0oo == null) {
            oooOo00OooO0OO2 = oooOo00OooO0OO2.OooOOO().OooO0OO();
        }
        stringBuffer.append(oooOo00OooO0OO2.OooO0o().OooOOoo().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
