package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import oO0000Oo.OooO0o;
import oO0000o0.OooO0O0;
import oO000O0.OooOO0;
import oO0o0o.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p032OoooO0.o0O000Oo;
import p206o00o0o0o.o000OO0O;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.ooOOO00O;
import p679o0ooooOo.lk;
import p679o0ooooOo.mk;
import p679o0ooooOo.pk;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOo00;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.Oooo000;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class BCECGOST3410PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient pk f53646Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f53647Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient OooOO0 f53648Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient Oooo0 f53649Oooo0oo;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0o oooO0oOooO = OooO0o.OooO(oO0OO0O.OooOO0o((byte[]) objectInputStream.readObject()));
        oOO0Oo00 ooo0oo00 = oooO0oOooO.f52413Oooo0oO;
        this.f53647Oooo0o = "ECGOST3410";
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
            pk pkVarOooO = pk.OooO(oooO0oOooO.f52412Oooo0o.f52393Oooo0oO);
            this.f53646Oooo = pkVarOooO;
            Oooo000 oooo000OooO0OO = o000OO0O.OooO0OO(mk.OooO0O0(pkVarOooO.f52232Oooo0o));
            OooOO0O oooOO0O = oooo000OooO0OO.f52926OooO00o;
            EllipticCurve ellipticCurveOooO00o = OooO00o.OooO00o(oooOO0O);
            OooOo00 oooOo00OooO0O0 = oooOO0O.OooO0O0(new BigInteger(1, bArr), new BigInteger(1, bArr2), false);
            o00000O.OooO0OO(oooo000OooO0OO);
            this.f53648Oooo0oO = new OooOO0(oooOo00OooO0O0);
            this.f53649Oooo0oo = new Oooo0(mk.OooO0O0(this.f53646Oooo.f52232Oooo0o), ellipticCurveOooO00o, new ECPoint(oooo000OooO0OO.f52928OooO0OO.OooO0o0().OooOOoo(), oooo000OooO0OO.f52928OooO0OO.OooO0o().OooOOoo()), oooo000OooO0OO.f52929OooO0Oo, oooo000OooO0OO.f52930OooO0o0);
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final o000oOoO OooO00o() {
        Oooo0 oooo0 = this.f53649Oooo0oo;
        return oooo0 != null ? OooO00o.OooO0Oo(oooo0, false) : BouncyCastleProvider.f53675Oooo0o.OooO0O0();
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
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return this.f53648Oooo0oO.f52550Oooo0o.OooO0Oo(bCECGOST3410PublicKey.f53648Oooo0oO.f52550Oooo0o) && OooO00o().equals(bCECGOST3410PublicKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f53647Oooo0o;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        oO0O00o0 oooO0O0;
        oO0O00o0 oo0o00o0 = this.f53646Oooo;
        if (oo0o00o0 == null) {
            Oooo0 oooo0 = this.f53649Oooo0oo;
            if (oooo0 instanceof Oooo0) {
                oooO0O0 = new pk(mk.OooO0OO(oooo0.f52924OooO00o), lk.f52212OooO0OO);
            } else {
                OooOO0O oooOO0OOooO0O0 = OooO00o.OooO0O0(oooo0.getCurve());
                oooO0O0 = new OooO0O0(new oO0000o0.OooO0o(oooOO0OOooO0O0, OooO00o.OooO0OO(oooOO0OOooO0O0, this.f53649Oooo0oo.getGenerator()), this.f53649Oooo0oo.getOrder(), BigInteger.valueOf(this.f53649Oooo0oo.getCofactor()), this.f53649Oooo0oo.getCurve().getSeed()));
            }
            oo0o00o0 = oooO0O0;
        }
        BigInteger bigIntegerOooOOoo = this.f53648Oooo0oO.f52550Oooo0o.OooO0o0().OooOOoo();
        BigInteger bigIntegerOooOOoo2 = this.f53648Oooo0oO.f52550Oooo0o.OooO0o().OooOOoo();
        byte[] bArr = new byte[64];
        OooO0O0(bArr, 0, bigIntegerOooOOoo);
        OooO0O0(bArr, 32, bigIntegerOooOOoo2);
        try {
            return o0O000Oo.OooO0o(new OooO0o(new oO0000Oo.OooO00o(lk.f52211OooO0O0, oo0o00o0), new oOOO0OO0(bArr)));
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
        return this.f53649Oooo0oo;
    }

    @Override // java.security.interfaces.ECPublicKey
    public final ECPoint getW() {
        return new ECPoint(this.f53648Oooo0oO.f52550Oooo0o.OooO0o0().OooOOoo(), this.f53648Oooo0oO.f52550Oooo0o.OooO0o().OooOOoo());
    }

    public final int hashCode() {
        return this.f53648Oooo0oO.f52550Oooo0o.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        OooOo00 oooOo00 = this.f53648Oooo0oO.f52550Oooo0o;
        stringBuffer.append("EC Public Key");
        stringBuffer.append(str);
        stringBuffer.append("            X: ");
        stringBuffer.append(oooOo00.OooO0o0().OooOOoo().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("            Y: ");
        stringBuffer.append(oooOo00.OooO0o().OooOOoo().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
