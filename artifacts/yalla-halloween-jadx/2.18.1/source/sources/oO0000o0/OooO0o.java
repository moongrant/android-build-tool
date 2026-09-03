package oO0000o0;

import java.math.BigInteger;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO00O;
import p677o0oooo0o.ooOOO0Oo;
import p696oO0OO0oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends oOo0o0oO implements OooOOO0 {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final BigInteger f52447OoooO0O = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public BigInteger f52448Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOO0O f52449Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public p696oO0OO0oo.OooOO0O f52450Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooOO0 f52451Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public byte[] f52452OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public BigInteger f52453OoooO00;

    public OooO0o(oO0Oo0o0 oo0oo0o0) {
        OooOO0O oooOO0O;
        int iIntValue;
        int iIntValue2;
        int i;
        p696oO0OO0oo.OooOO0O oooO0OO;
        if (!(oo0oo0o0.OooOo00(0) instanceof oOo0oooO) || !((oOo0oooO) oo0oo0o0.OooOo00(0)).OooOo00().equals(f52447OoooO0O)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        oO0O00o0 oo0o00o0OooOo00 = oo0oo0o0.OooOo00(1);
        if (oo0o00o0OooOo00 instanceof OooOO0O) {
            oooOO0O = (OooOO0O) oo0o00o0OooOo00;
        } else {
            oooOO0O = oo0o00o0OooOo00 != null ? new OooOO0O(oO0Oo0o0.OooOOo0(oo0o00o0OooOo00)) : null;
        }
        oO0Oo0o0 oo0oo0o0OooOOo0 = oO0Oo0o0.OooOOo0(oo0oo0o0.OooOo00(2));
        ooOOO0Oo ooooo0oo = oooOO0O.f52457Oooo0o;
        if (ooooo0oo.equals(OooOOO0.f52459OooO)) {
            BigInteger bigIntegerOooOo00 = ((oOo0oooO) oooOO0O.f52458Oooo0oO).OooOo00();
            oooO0OO = new oO0OO0oo.OooOO0O.OooO0o(bigIntegerOooOo00, new oO0OO0oo.OooOOO0.OooO0O0(bigIntegerOooOo00, oO0OO0oo.OooOOO0.OooO0O0.OooOo00(bigIntegerOooOo00), new BigInteger(1, ((ooOOO00O) oo0oo0o0OooOOo0.OooOo00(0)).OooOOoo())).OooOOoo(), new oO0OO0oo.OooOOO0.OooO0O0(bigIntegerOooOo00, oO0OO0oo.OooOOO0.OooO0O0.OooOo00(bigIntegerOooOo00), new BigInteger(1, ((ooOOO00O) oo0oo0o0OooOOo0.OooOo00(1)).OooOOoo())).OooOOoo());
        } else {
            if (!ooooo0oo.equals(OooOOO0.f52460OooOO0)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            oO0Oo0o0 oo0oo0o0OooOOo1 = oO0Oo0o0.OooOOo0(oooOO0O.f52458Oooo0oO);
            int iIntValue3 = ((oOo0oooO) oo0oo0o0OooOOo1.OooOo00(0)).OooOo00().intValue();
            ooOOO0Oo ooooo0oo2 = (ooOOO0Oo) oo0oo0o0OooOOo1.OooOo00(1);
            if (ooooo0oo2.equals(OooOOO0.f52461OooOO0O)) {
                iIntValue2 = oOo0oooO.OooOOo0(oo0oo0o0OooOOo1.OooOo00(2)).OooOo00().intValue();
                i = 0;
                iIntValue = 0;
            } else {
                if (!ooooo0oo2.equals(OooOOO0.f52462OooOO0o)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                oO0Oo0o0 oo0oo0o0OooOOo2 = oO0Oo0o0.OooOOo0(oo0oo0o0OooOOo1.OooOo00(2));
                int iIntValue4 = oOo0oooO.OooOOo0(oo0oo0o0OooOOo2.OooOo00(0)).OooOo00().intValue();
                int iIntValue5 = oOo0oooO.OooOOo0(oo0oo0o0OooOOo2.OooOo00(1)).OooOo00().intValue();
                iIntValue = oOo0oooO.OooOOo0(oo0oo0o0OooOOo2.OooOo00(2)).OooOo00().intValue();
                iIntValue2 = iIntValue4;
                i = iIntValue5;
            }
            int i2 = iIntValue2;
            int i3 = i;
            int i4 = iIntValue;
            oooO0OO = new oO0OO0oo.OooOO0O.OooO0OO(iIntValue3, i2, i3, i4, new oO0OO0oo.OooOOO0.OooO00o(iIntValue3, i2, i3, i4, new BigInteger(1, ((ooOOO00O) oo0oo0o0OooOOo0.OooOo00(0)).OooOOoo())).OooOOoo(), new oO0OO0oo.OooOOO0.OooO00o(iIntValue3, i2, i3, i4, new BigInteger(1, ((ooOOO00O) oo0oo0o0OooOOo0.OooOo00(1)).OooOOoo())).OooOOoo());
        }
        byte[] bArrOooOOo0 = oo0oo0o0OooOOo0.size() == 3 ? ((oOO0Oo00) oo0oo0o0OooOOo0.OooOo00(2)).OooOOo0() : null;
        this.f52450Oooo0oO = oooO0OO;
        oO0O00o0 oo0o00o0OooOo01 = oo0oo0o0.OooOo00(3);
        if (oo0o00o0OooOo01 instanceof OooOO0) {
            this.f52451Oooo0oo = (OooOO0) oo0o00o0OooOo01;
        } else {
            this.f52451Oooo0oo = new OooOO0(this.f52450Oooo0oO, (ooOOO00O) oo0o00o0OooOo01);
        }
        this.f52448Oooo = ((oOo0oooO) oo0oo0o0.OooOo00(4)).OooOo00();
        this.f52452OoooO0 = bArrOooOOo0;
        if (oo0oo0o0.size() == 6) {
            this.f52453OoooO00 = ((oOo0oooO) oo0oo0o0.OooOo00(5)).OooOo00();
        }
    }

    public OooO0o(p696oO0OO0oo.OooOO0O oooOO0O, OooOO0 oooOO1, BigInteger bigInteger, BigInteger bigInteger2) {
        this(oooOO0O, oooOO1, bigInteger, bigInteger2, (byte[]) null);
    }

    public static OooO0o OooOO0(Object obj) {
        if (obj instanceof OooO0o) {
            return (OooO0o) obj;
        }
        if (obj != null) {
            return new OooO0o(oO0Oo0o0.OooOOo0(obj));
        }
        return null;
    }

    public final OooOo00 OooO() {
        return this.f52451Oooo0oo.OooO();
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(f52447OoooO0O));
        oo0o00oo.OooO00o(this.f52449Oooo0o);
        oo0o00oo.OooO00o(new OooO0OO(this.f52450Oooo0oO, this.f52452OoooO0));
        oo0o00oo.OooO00o(this.f52451Oooo0oo);
        oo0o00oo.OooO00o(new oOo0oooO(this.f52448Oooo));
        BigInteger bigInteger = this.f52453OoooO00;
        if (bigInteger != null) {
            oo0o00oo.OooO00o(new oOo0oooO(bigInteger));
        }
        return new oOOo0000(oo0o00oo);
    }

    public OooO0o(p696oO0OO0oo.OooOO0O oooOO0O, OooOO0 oooOO1, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        int[] iArr;
        OooOO0O oooOO0O2;
        this.f52450Oooo0oO = oooOO0O;
        this.f52451Oooo0oo = oooOO1;
        this.f52448Oooo = bigInteger;
        this.f52453OoooO00 = bigInteger2;
        this.f52452OoooO0 = bArr;
        if (oooOO0O.f52759OooO00o.OooO0O0() == 1) {
            oooOO0O2 = new OooOO0O(oooOO0O.f52759OooO00o.OooO0OO());
        } else {
            if (!p696oO0OO0oo.OooO.OooO00o(oooOO0O)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] iArr2 = ((p711ooOOOOoo.OooOO0) oooOO0O.f52759OooO00o).OooO00o().f53511OooO00o;
            if (iArr2 == null) {
                iArr = null;
            } else {
                int[] iArr3 = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                iArr = iArr3;
            }
            if (iArr.length == 3) {
                oooOO0O2 = new OooOO0O(iArr[2], iArr[1], 0, 0);
            } else {
                if (iArr.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                oooOO0O2 = new OooOO0O(iArr[4], iArr[1], iArr[2], iArr[3]);
            }
        }
        this.f52449Oooo0o = oooOO0O2;
    }

    public OooO0o(p696oO0OO0oo.OooOO0O oooOO0O, OooOo00 oooOo00, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(oooOO0O, new OooOO0(oooOo00, false), bigInteger, bigInteger2, bArr);
    }
}
