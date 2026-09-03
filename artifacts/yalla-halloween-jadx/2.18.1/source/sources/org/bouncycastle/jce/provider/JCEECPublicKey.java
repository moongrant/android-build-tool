package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Objects;
import oO0000Oo.OooO0o;
import oO0000o0.OooO0O0;
import oO0000o0.OooOO0;
import oO0000o0.OooOOO0;
import oO0o0o.OooO00o;
import p032OoooO0.o0O000Oo;
import p206o00o0o0o.o000OO0O;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O0Oo0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.ooOOO00O;
import p677o0oooo0o.ooOOO0Oo;
import p679o0ooooOo.lk;
import p679o0ooooOo.mk;
import p679o0ooooOo.pk;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOo00;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.Oooo000;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f53695Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53696Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooOo00 f53697Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ECParameterSpec f53698Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public pk f53699OoooO00;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        OooOO0O oooOO0O;
        ECParameterSpec eCParameterSpec;
        OooOO0O oooOO0O2;
        byte[] bArrOooOOo0;
        ooOOO00O oooo0oo0;
        OooO0o oooO0oOooO = OooO0o.OooO(oO0OO0O.OooOO0o((byte[]) objectInputStream.readObject()));
        if (oooO0oOooO.f52412Oooo0o.f52392Oooo0o.equals(lk.f52211OooO0O0)) {
            oOO0Oo00 ooo0oo00 = oooO0oOooO.f52413Oooo0oO;
            this.f53696Oooo0o = "ECGOST3410";
            try {
                byte[] bArrOooOOoo = ((ooOOO00O) oO0OO0O.OooOO0o(ooo0oo00.OooOOo0())).OooOOoo();
                byte[] bArr = new byte[32];
                byte[] bArr2 = new byte[32];
                for (int i = 0; i != 32; i++) {
                    bArr[i] = bArrOooOOoo[31 - i];
                }
                for (int i2 = 0; i2 != 32; i2++) {
                    bArr2[i2] = bArrOooOOoo[63 - i2];
                }
                pk pkVar = new pk((oO0Oo0o0) oooO0oOooO.f52412Oooo0o.f52393Oooo0oO);
                this.f53699OoooO00 = pkVar;
                Oooo000 oooo000OooO0OO = o000OO0O.OooO0OO(mk.OooO0O0(pkVar.f52232Oooo0o));
                OooOO0O oooOO0O3 = oooo000OooO0OO.f52926OooO00o;
                EllipticCurve ellipticCurveOooO00o = OooO00o.OooO00o(oooOO0O3);
                this.f53697Oooo0oO = oooOO0O3.OooO0O0(new BigInteger(1, bArr), new BigInteger(1, bArr2), false);
                this.f53698Oooo0oo = new Oooo0(mk.OooO0O0(this.f53699OoooO00.f52232Oooo0o), ellipticCurveOooO00o, new ECPoint(oooo000OooO0OO.f52928OooO0OO.OooO0o0().OooOOoo(), oooo000OooO0OO.f52928OooO0OO.OooO0o().OooOOoo()), oooo000OooO0OO.f52929OooO0Oo, oooo000OooO0OO.f52930OooO0o0);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        } else {
            oO0OO0O oo0oo0o = (oO0OO0O) oooO0oOooO.f52412Oooo0o.f52393Oooo0oO;
            if (oo0oo0o instanceof ooOOO0Oo) {
                ooOOO0Oo ooooo0oo = (ooOOO0Oo) oo0oo0o;
                oO0000o0.OooO0o oooO0oOooO0Oo = o00000O.OooO0Oo(ooooo0oo);
                oooOO0O = oooO0oOooO0Oo.f52450Oooo0oO;
                eCParameterSpec = new Oooo0(o00000O.OooO0O0(ooooo0oo), OooO00o.OooO00o(oooOO0O), new ECPoint(oooO0oOooO0Oo.OooO().OooO0o0().OooOOoo(), oooO0oOooO0Oo.OooO().OooO0o().OooOOoo()), oooO0oOooO0Oo.f52448Oooo, oooO0oOooO0Oo.f52453OoooO00);
            } else {
                if (oo0oo0o instanceof oO0O0Oo0) {
                    this.f53698Oooo0oo = null;
                    oooOO0O2 = BouncyCastleProvider.f53675Oooo0o.OooO0O0().f52926OooO00o;
                } else {
                    oO0000o0.OooO0o oooO0oOooOO0 = oO0000o0.OooO0o.OooOO0(oo0oo0o);
                    oooOO0O = oooO0oOooOO0.f52450Oooo0oO;
                    eCParameterSpec = new ECParameterSpec(OooO00o.OooO00o(oooOO0O), new ECPoint(oooO0oOooOO0.OooO().OooO0o0().OooOOoo(), oooO0oOooOO0.OooO().OooO0o().OooOOoo()), oooO0oOooOO0.f52448Oooo, oooO0oOooOO0.f52453OoooO00.intValue());
                }
                bArrOooOOo0 = oooO0oOooO.f52413Oooo0oO.OooOOo0();
                oooo0oo0 = new oOOO0OO0(bArrOooOOo0);
                if (bArrOooOOo0[0] == 4 && bArrOooOOo0[1] == bArrOooOOo0.length - 2 && ((bArrOooOOo0[2] == 2 || bArrOooOOo0[2] == 3) && (oooOO0O2.OooO0oo() + 7) / 8 >= bArrOooOOo0.length - 3)) {
                    try {
                        oooo0oo0 = (ooOOO00O) oO0OO0O.OooOO0o(bArrOooOOo0);
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("error recovering public key");
                    }
                }
                byte[] bArrOooO0OO = oO000Oo.OooO00o.OooO0OO(oooo0oo0.OooOOoo());
                Objects.requireNonNull(bArrOooO0OO, "string cannot be null");
                this.f53697Oooo0oO = oooOO0O2.OooO0Oo(bArrOooO0OO).OooOOO();
            }
            this.f53698Oooo0oo = eCParameterSpec;
            oooOO0O2 = oooOO0O;
            bArrOooOOo0 = oooO0oOooO.f52413Oooo0oO.OooOOo0();
            oooo0oo0 = new oOOO0OO0(bArrOooOOo0);
            if (bArrOooOOo0[0] == 4) {
                oooo0oo0 = (ooOOO00O) oO0OO0O.OooOO0o(bArrOooOOo0);
            }
            byte[] bArrOooO0OO2 = oO000Oo.OooO00o.OooO0OO(oooo0oo0.OooOOoo());
            Objects.requireNonNull(bArrOooO0OO2, "string cannot be null");
            this.f53697Oooo0oO = oooOO0O2.OooO0Oo(bArrOooO0OO2).OooOOO();
        }
        this.f53696Oooo0o = (String) objectInputStream.readObject();
        this.f53695Oooo = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.f53696Oooo0o);
        objectOutputStream.writeBoolean(this.f53695Oooo);
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53698Oooo0oo;
        return eCParameterSpec != null ? OooO00o.OooO0Oo(eCParameterSpec, this.f53695Oooo) : BouncyCastleProvider.f53675Oooo0o.OooO0O0();
    }

    public final void OooO0O0(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return this.f53697Oooo0oO.OooO0Oo(jCEECPublicKey.f53697Oooo0oO) && OooO00o().equals(jCEECPublicKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53696Oooo0o;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        OooO0O0 oooO0O0;
        OooO0o oooO0o;
        oO0O00o0 oooO0O1;
        if (this.f53696Oooo0o.equals("ECGOST3410")) {
            oO0O00o0 oo0o00o0 = this.f53699OoooO00;
            if (oo0o00o0 == null) {
                ECParameterSpec eCParameterSpec = this.f53698Oooo0oo;
                if (eCParameterSpec instanceof Oooo0) {
                    oooO0O1 = new pk(mk.OooO0OO(((Oooo0) eCParameterSpec).f52924OooO00o), lk.f52212OooO0OO);
                } else {
                    OooOO0O oooOO0OOooO0O0 = OooO00o.OooO0O0(eCParameterSpec.getCurve());
                    oooO0O1 = new OooO0O0(new oO0000o0.OooO0o(oooOO0OOooO0O0, OooO00o.OooO0OO(oooOO0OOooO0O0, this.f53698Oooo0oo.getGenerator()), this.f53698Oooo0oo.getOrder(), BigInteger.valueOf(this.f53698Oooo0oo.getCofactor()), this.f53698Oooo0oo.getCurve().getSeed()));
                }
                oo0o00o0 = oooO0O1;
            }
            BigInteger bigIntegerOooOOoo = this.f53697Oooo0oO.OooO0o0().OooOOoo();
            BigInteger bigIntegerOooOOoo2 = this.f53697Oooo0oO.OooO0o().OooOOoo();
            byte[] bArr = new byte[64];
            OooO0O0(bArr, 0, bigIntegerOooOOoo);
            OooO0O0(bArr, 32, bigIntegerOooOOoo2);
            try {
                oooO0o = new OooO0o(new oO0000Oo.OooO00o(lk.f52211OooO0O0, oo0o00o0), new oOOO0OO0(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.f53698Oooo0oo;
            if (eCParameterSpec2 instanceof Oooo0) {
                ooOOO0Oo ooooo0ooOooO0o0 = o00000O.OooO0o0(((Oooo0) eCParameterSpec2).f52924OooO00o);
                if (ooooo0ooOooO0o0 == null) {
                    ooooo0ooOooO0o0 = new ooOOO0Oo(((Oooo0) this.f53698Oooo0oo).f52924OooO00o);
                }
                oooO0O0 = new OooO0O0(ooooo0ooOooO0o0);
            } else if (eCParameterSpec2 == null) {
                oooO0O0 = new OooO0O0();
            } else {
                OooOO0O oooOO0OOooO0O1 = OooO00o.OooO0O0(eCParameterSpec2.getCurve());
                oooO0O0 = new OooO0O0(new oO0000o0.OooO0o(oooOO0OOooO0O1, OooO00o.OooO0OO(oooOO0OOooO0O1, this.f53698Oooo0oo.getGenerator()), this.f53698Oooo0oo.getOrder(), BigInteger.valueOf(this.f53698Oooo0oo.getCofactor()), this.f53698Oooo0oo.getCurve().getSeed()));
            }
            OooOo00 oooOo00OooO0OO = this.f53697Oooo0oO;
            OooOO0O oooOO0O = oooOo00OooO0OO.f52786OooO00o;
            if (this.f53698Oooo0oo == null) {
                oooOo00OooO0OO = oooOo00OooO0OO.OooOOO().OooO0OO();
            }
            oooO0o = new OooO0o(new oO0000Oo.OooO00o(OooOOO0.f52464OooOOO0, oooO0O0), new OooOO0(oooOO0O.OooO0O0(oooOo00OooO0OO.OooO0o0().OooOOoo(), (this.f53698Oooo0oo == null ? this.f53697Oooo0oO.OooOOO().OooO0OO() : this.f53697Oooo0oO).OooO0o().OooOOoo(), this.f53695Oooo), false).f52454Oooo0o.f52196Oooo0o);
        }
        return o0O000Oo.OooO0o(oooO0o);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.f53698Oooo0oo;
    }

    @Override // java.security.interfaces.ECPublicKey
    public final ECPoint getW() {
        return new ECPoint(this.f53697Oooo0oO.OooO0o0().OooOOoo(), this.f53697Oooo0oO.OooO0o().OooOOoo());
    }

    public final int hashCode() {
        return this.f53697Oooo0oO.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        stringBuffer.append("EC Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.f53697Oooo0oO.OooO0o0().OooOOoo().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.f53697Oooo0oO.OooO0o().OooOOoo().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
