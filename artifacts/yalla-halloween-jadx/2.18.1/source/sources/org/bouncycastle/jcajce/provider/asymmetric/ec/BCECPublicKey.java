package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Objects;
import oO0000Oo.OooO0o;
import oO0000o0.OooO0O0;
import oO0000o0.OooOOO0;
import oO000O0.OooOO0;
import oO0OOoO0.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p032OoooO0.o0O000Oo;
import p314o0O0oO0o.o00000O;
import p418o0Oo0oo.oo000o;
import p677o0oooo0o.oO0O0Oo0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.ooOOO00O;
import p677o0oooo0o.ooOOO0Oo;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOo00;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient OooOO0 f53638Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public transient ECParameterSpec f53639Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient OooO00o f53640Oooo0oo;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        OooOo00 oooOo00OooO;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.f53640Oooo0oo = BouncyCastleProvider.f53675Oooo0o;
        OooO0o oooO0oOooO = OooO0o.OooO(oO0OO0O.OooOO0o(bArr));
        OooO0O0 oooO0O0OooO = OooO0O0.OooO(oooO0oOooO.f52412Oooo0o.f52393Oooo0oO);
        OooOO0O oooOO0OOooO0o = oO0o0o.OooO00o.OooO0o(this.f53640Oooo0oo, oooO0O0OooO);
        this.f53639Oooo0oO = oO0o0o.OooO00o.OooO0o0(oooO0O0OooO, oooOO0OOooO0o);
        byte[] bArrOooOOo0 = oooO0oOooO.f52413Oooo0oO.OooOOo0();
        ooOOO00O oooo0oo0 = new oOOO0OO0(bArrOooOOo0);
        if (bArrOooOOo0[0] == 4 && bArrOooOOo0[1] == bArrOooOOo0.length - 2 && ((bArrOooOOo0[2] == 2 || bArrOooOOo0[2] == 3) && (oooOO0OOooO0o.OooO0oo() + 7) / 8 >= bArrOooOOo0.length - 3)) {
            try {
                oooo0oo0 = (ooOOO00O) oO0OO0O.OooOO0o(bArrOooOOo0);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        byte[] bArrOooO0OO = oO000Oo.OooO00o.OooO0OO(oooo0oo0.OooOOoo());
        Objects.requireNonNull(bArrOooO0OO, "string cannot be null");
        OooOo00 oooOo00OooOOO = oooOO0OOooO0o.OooO0Oo(bArrOooO0OO).OooOOO();
        OooO00o oooO00o = this.f53640Oooo0oo;
        oO0OO0O oo0oo0o = oooO0O0OooO.f52443Oooo0o;
        if (oo0oo0o instanceof ooOOO0Oo) {
            ooOOO0Oo ooooo0ooOooOo0 = ooOOO0Oo.OooOo0(oo0oo0o);
            oO0000o0.OooO0o oooO0oOooO0Oo = o00000O.OooO0Oo(ooooo0ooOooOo0);
            if (oooO0oOooO0Oo == null) {
                oooO0oOooO0Oo = (oO0000o0.OooO0o) oooO00o.OooO00o().get(ooooo0ooOooOo0);
            }
            OooOO0O oooOO0O = oooO0oOooO0Oo.f52450Oooo0oO;
            oooO0oOooO0Oo.OooO().OooOOO();
        } else {
            if (oo0oo0o instanceof oO0O0Oo0) {
                o000oOoO o000ooooOooO0O0 = oooO00o.OooO0O0();
                OooOO0O oooOO0O2 = o000ooooOooO0O0.f52926OooO00o;
                oooOo00OooO = o000ooooOooO0O0.f52928OooO0OO;
            } else {
                oO0000o0.OooO0o oooO0oOooOO0 = oO0000o0.OooO0o.OooOO0(oo0oo0o);
                OooOO0O oooOO0O3 = oooO0oOooOO0.f52450Oooo0oO;
                oooOo00OooO = oooO0oOooOO0.OooO();
            }
            oooOo00OooO.OooOOO();
        }
        this.f53638Oooo0o = new OooOO0(oooOo00OooOOO);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final o000oOoO OooO00o() {
        ECParameterSpec eCParameterSpec = this.f53639Oooo0oO;
        return eCParameterSpec != null ? oO0o0o.OooO00o.OooO0Oo(eCParameterSpec, false) : this.f53640Oooo0oo.OooO0O0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.f53638Oooo0o.f52550Oooo0o.OooO0Oo(bCECPublicKey.f53638Oooo0o.f52550Oooo0o) && OooO00o().equals(bCECPublicKey.OooO00o());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return null;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return o0O000Oo.OooO0o(new OooO0o(new oO0000Oo.OooO00o(OooOOO0.f52464OooOOO0, oo000o.OooO0O0(this.f53639Oooo0oO)), ooOOO00O.OooOOo0(new oO0000o0.OooOO0(this.f53638Oooo0o.f52550Oooo0o, false).f52454Oooo0o).OooOOoo()));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public final ECParameterSpec getParams() {
        return this.f53639Oooo0oO;
    }

    @Override // java.security.interfaces.ECPublicKey
    public final ECPoint getW() {
        OooOo00 oooOo00 = this.f53638Oooo0o.f52550Oooo0o;
        return new ECPoint(oooOo00.OooO0o0().OooOOoo(), oooOo00.OooO0o().OooOOoo());
    }

    public final int hashCode() {
        return this.f53638Oooo0o.f52550Oooo0o.hashCode() ^ OooO00o().hashCode();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = oO000Oo.OooO0o.f52666OooO00o;
        OooOo00 oooOo00 = this.f53638Oooo0o.f52550Oooo0o;
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
