package oO00000;

import java.math.BigInteger;
import java.util.Random;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOOO0;
import p696oO0OO0oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO {
    public static OooOo00 OooO00o(OooOO0O oooOO0O, byte[] bArr) {
        OooOOO0 oooOOO0OooO0oO = oooOO0O.OooO0oO(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        OooOOO0 oooOOO0OooO0oO2 = oooOO0O.OooO0oO(new BigInteger(1, bArr));
        if (!OooO0O0(oooOOO0OooO0oO2).equals(oooOO0O.f52760OooO0O0)) {
            oooOOO0OooO0oO2 = oooOOO0OooO0oO2.OooO0O0();
        }
        OooOOO0 oooOOO0OooOO0 = null;
        if (oooOOO0OooO0oO2.OooO()) {
            oooOOO0OooOO0 = oooOO0O.f52761OooO0OO.OooOOO();
        } else {
            OooOOO0 oooOOO0OooO00o = oooOOO0OooO0oO2.OooOOOO().OooO0oO().OooOO0(oooOO0O.f52761OooO0OO).OooO00o(oooOO0O.f52760OooO0O0).OooO00o(oooOOO0OooO0oO2);
            if (!oooOOO0OooO00o.OooO()) {
                OooOOO0 oooOOO0OooO0oO3 = oooOO0O.OooO0oO(p696oO0OO0oo.OooOO0.f52756OooO00o);
                Random random = new Random();
                int iOooO0o = oooOOO0OooO00o.OooO0o();
                while (true) {
                    OooOOO0 oooOOO0OooO0oO4 = oooOO0O.OooO0oO(new BigInteger(iOooO0o, random));
                    OooOOO0 oooOOO0OooO00o2 = oooOOO0OooO00o;
                    OooOOO0 oooOOO0OooO00o3 = oooOOO0OooO0oO3;
                    for (int i = 1; i <= iOooO0o - 1; i++) {
                        OooOOO0 oooOOO0OooOOOO = oooOOO0OooO00o2.OooOOOO();
                        oooOOO0OooO00o3 = oooOOO0OooO00o3.OooOOOO().OooO00o(oooOOO0OooOOOO.OooOO0(oooOOO0OooO0oO4));
                        oooOOO0OooO00o2 = oooOOO0OooOOOO.OooO00o(oooOOO0OooO00o);
                    }
                    if (!oooOOO0OooO00o2.OooO()) {
                        oooOOO0OooO00o = null;
                        break;
                    }
                    if (!oooOOO0OooO00o3.OooOOOO().OooO00o(oooOOO0OooO00o3).OooO()) {
                        oooOOO0OooO00o = oooOOO0OooO00o3;
                        break;
                    }
                }
            }
            if (oooOOO0OooO00o != null) {
                if (!OooO0O0(oooOOO0OooO00o).equals(oooOOO0OooO0oO)) {
                    oooOOO0OooO00o = oooOOO0OooO00o.OooO0O0();
                }
                oooOOO0OooOO0 = oooOOO0OooO0oO2.OooOO0(oooOOO0OooO00o);
            }
        }
        if (oooOOO0OooOO0 != null) {
            return oooOO0O.OooOO0o(oooOOO0OooO0oO2.OooOOoo(), oooOOO0OooOO0.OooOOoo());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static OooOOO0 OooO0O0(OooOOO0 oooOOO0) {
        OooOOO0 oooOOO0OooO00o = oooOOO0;
        for (int i = 1; i < oooOOO0.OooO0o(); i++) {
            oooOOO0OooO00o = oooOOO0OooO00o.OooOOOO().OooO00o(oooOOO0);
        }
        return oooOOO0OooO00o;
    }
}
