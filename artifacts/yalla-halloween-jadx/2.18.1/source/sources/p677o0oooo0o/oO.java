package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes3.dex */
public final class oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InputStream f52130OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f52131OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[][] f52132OooO0OO;

    public oO(InputStream inputStream) {
        this(inputStream, m.OooO0OO(inputStream));
    }

    public oO(InputStream inputStream, int i) {
        this.f52130OooO00o = inputStream;
        this.f52131OooO0O0 = i;
        this.f52132OooO0OO = new byte[11][];
    }

    public final oO0O00o0 OooO00o() throws IOException {
        int i = this.f52130OooO00o.read();
        if (i == -1) {
            return null;
        }
        InputStream inputStream = this.f52130OooO00o;
        if (inputStream instanceof i) {
            i iVar = (i) inputStream;
            iVar.f52122OoooO0 = false;
            iVar.OooO0Oo();
        }
        int iOooOOo = oO0O0O0o.OooOOo(this.f52130OooO00o, i);
        boolean z = (i & 32) != 0;
        int iOooO0oo = oO0O0O0o.OooO0oo(this.f52130OooO00o, this.f52131OooO0O0);
        if (iOooO0oo < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            oO oOVar = new oO(new i(this.f52130OooO00o, this.f52131OooO0O0), this.f52131OooO0O0);
            if ((i & 64) != 0) {
                return new oOO00(iOooOOo, oOVar);
            }
            if ((i & 128) != 0) {
                return new oOO0O0O(true, iOooOOo, oOVar);
            }
            if (iOooOOo == 4) {
                return new ooooO000(oOVar);
            }
            if (iOooOOo == 8) {
                return new ooooO0O0(oOVar);
            }
            if (iOooOOo == 16) {
                return new oOO0O000(oOVar);
            }
            if (iOooOOo == 17) {
                return new oOO0O0(oOVar);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("unknown BER object encountered: 0x");
            sbOooO0o0.append(Integer.toHexString(iOooOOo));
            throw new ASN1Exception(sbOooO0o0.toString());
        }
        g gVar = new g(this.f52130OooO00o, iOooO0oo);
        if ((i & 64) != 0) {
            return new oOO0OO(z, iOooOOo, gVar.OooO0Oo());
        }
        if ((i & 128) != 0) {
            return new oOO0O0O(z, iOooOOo, new oO(gVar));
        }
        if (!z) {
            if (iOooOOo == 4) {
                return new oOOO0OOO(gVar);
            }
            try {
                return oO0O0O0o.OooO0Oo(iOooOOo, gVar, this.f52132OooO0OO);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if (iOooOOo == 4) {
            return new ooooO000(new oO(gVar));
        }
        if (iOooOOo == 8) {
            return new ooooO0O0(new oO(gVar));
        }
        if (iOooOOo == 16) {
            return new oOOo0O00(new oO(gVar));
        }
        if (iOooOOo == 17) {
            return new oo000000(new oO(gVar));
        }
        throw new IOException(OooO0O0.OooO00o.OooO00o("unknown tag ", iOooOOo, " encountered"));
    }

    public final oO0OO0O OooO0O0(boolean z, int i) throws IOException {
        if (!z) {
            return new O0000000(false, i, new oOOO0OO0(((g) this.f52130OooO00o).OooO0Oo()));
        }
        oO0O00oO oo0o00ooOooO0OO = OooO0OO();
        if (this.f52130OooO00o instanceof i) {
            if (oo0o00ooOooO0OO.OooO0OO() == 1) {
                return new oOO0O0O0(true, i, oo0o00ooOooO0OO.OooO0O0(0));
            }
            oOO0 ooo0 = oOO00O0.f52164OooO00o;
            return new oOO0O0O0(false, i, oo0o00ooOooO0OO.OooO0OO() < 1 ? oOO00O0.f52164OooO00o : new oOO0(oo0o00ooOooO0OO));
        }
        if (oo0o00ooOooO0OO.OooO0OO() == 1) {
            return new O0000000(true, i, oo0o00ooOooO0OO.OooO0O0(0));
        }
        oOOo0000 oooo0000 = oOO.f52156OooO00o;
        return new O0000000(false, i, oo0o00ooOooO0OO.OooO0OO() < 1 ? oOO.f52156OooO00o : new d(oo0o00ooOooO0OO));
    }

    public final oO0O00oO OooO0OO() throws IOException {
        oO0O00oO oo0o00oo = new oO0O00oO();
        while (true) {
            oO0O00o0 oo0o00o0OooO00o = OooO00o();
            if (oo0o00o0OooO00o == null) {
                return oo0o00oo;
            }
            oo0o00oo.OooO00o(oo0o00o0OooO00o instanceof h ? ((h) oo0o00o0OooO00o).OooO0o0() : oo0o00o0OooO00o.OooO0O0());
        }
    }
}
