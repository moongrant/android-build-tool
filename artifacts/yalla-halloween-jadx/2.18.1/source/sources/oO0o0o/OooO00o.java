package oO0o0o;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import oO0000o0.OooO;
import oO000Oo.OooO0o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p314o0O0oO0o.o00000O;
import p673o0oooo.oo0oOO0;
import p677o0oooo0o.oO0O0Oo0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.ooOOO0Oo;
import p683o0oooooo.xk;
import p686oO0000oo.OooOOO;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOo00;
import p701oO0Oo0oo.Oooo0;
import p701oO0Oo0oo.o000oOoO;
import p711ooOOOOoo.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static HashMap f52963OooO00o = new HashMap();

    static {
        OooO oooO;
        OooO oooO2;
        OooO oooO3;
        Enumeration enumerationElements = OooOOO.f52539Oooo0O0.elements();
        while (enumerationElements.hasMoreElements()) {
            String str = (String) enumerationElements.nextElement();
            ooOOO0Oo ooooo0oo = (ooOOO0Oo) oO0000o0.OooO00o.f52436OooOo.get(OooO0o.OooO0OO(str));
            oO0000o0.OooO0o oooO0oOooO0O0 = null;
            oO0000o0.OooO0o oooO0oOooO0O1 = (ooooo0oo == null || (oooO3 = (OooO) oO0000o0.OooO00o.f52442OooOoO0.get(ooooo0oo)) == null) ? null : oooO3.OooO0O0();
            if (oooO0oOooO0O1 == null) {
                ooOOO0Oo ooooo0oo2 = (ooOOO0Oo) xk.f52309Oooo00o.get(OooO0o.OooO0OO(str));
                oooO0oOooO0O1 = ooooo0oo2 == null ? null : xk.OooO0Oo(ooooo0oo2);
            }
            if (oooO0oOooO0O1 == null) {
                ooOOO0Oo ooooo0oo3 = (ooOOO0Oo) ooo0Oo0.OooO00o.f53513OooO00o.get(OooO0o.OooO0Oo(str));
                oooO0oOooO0O1 = ooooo0oo3 != null ? xk.OooO0Oo(ooooo0oo3) : null;
            }
            if (oooO0oOooO0O1 == null) {
                ooOOO0Oo ooooo0oo4 = (ooOOO0Oo) o.OooO00o.f26532OooOOOO.get(OooO0o.OooO0OO(str));
                oooO0oOooO0O1 = (ooooo0oo4 == null || (oooO2 = (OooO) o.OooO00o.f26533OooOOOo.get(ooooo0oo4)) == null) ? null : oooO2.OooO0O0();
            }
            if (oooO0oOooO0O1 == null) {
                ooOOO0Oo ooooo0oo5 = (ooOOO0Oo) oo0oOO0.f52032OooO0O0.get(OooO0o.OooO0OO(str));
                if (ooooo0oo5 != null && (oooO = (OooO) oo0oOO0.f52033OooO0OO.get(ooooo0oo5)) != null) {
                    oooO0oOooO0O0 = oooO.OooO0O0();
                }
                oooO0oOooO0O1 = oooO0oOooO0O0;
            }
            if (oooO0oOooO0O1 != null) {
                f52963OooO00o.put(oooO0oOooO0O1.f52450Oooo0oO, OooOOO.OooO0Oo(str).f52450Oooo0oO);
            }
        }
        oO0000o0.OooO0o oooO0oOooO0Oo = OooOOO.OooO0Oo("Curve25519");
        f52963OooO00o.put(new OooOO0O.OooO0o(oooO0oOooO0Oo.f52450Oooo0oO.f52759OooO00o.OooO0OO(), oooO0oOooO0Oo.f52450Oooo0oO.f52760OooO0O0.OooOOoo(), oooO0oOooO0Oo.f52450Oooo0oO.f52761OooO0OO.OooOOoo()), oooO0oOooO0Oo.f52450Oooo0oO);
    }

    public static EllipticCurve OooO00o(OooOO0O oooOO0O) {
        int[] iArr;
        ECField eCFieldF2m;
        p711ooOOOOoo.OooO0O0 oooO0O0 = oooOO0O.f52759OooO00o;
        int i = 0;
        if (oooO0O0.OooO0O0() == 1) {
            eCFieldF2m = new ECFieldFp(oooO0O0.OooO0OO());
        } else {
            p711ooOOOOoo.OooO0o oooO0oOooO00o = ((OooOO0) oooO0O0).OooO00o();
            int[] iArr2 = oooO0oOooO00o.f53511OooO00o;
            if (iArr2 == null) {
                iArr = null;
            } else {
                iArr = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            }
            int length = iArr.length - 1;
            int i2 = length - 1;
            if (i2 < 0) {
                StringBuffer stringBuffer = new StringBuffer(1);
                stringBuffer.append(" > ");
                stringBuffer.append(length);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            int[] iArr3 = new int[i2];
            System.arraycopy(iArr, 1, iArr3, 0, iArr.length - 1 < i2 ? iArr.length - 1 : i2);
            int[] iArr4 = new int[i2];
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                iArr4[i2] = iArr3[i];
                i++;
            }
            int[] iArr5 = oooO0oOooO00o.f53511OooO00o;
            eCFieldF2m = new ECFieldF2m(iArr5[iArr5.length - 1], iArr4);
        }
        return new EllipticCurve(eCFieldF2m, oooOO0O.f52760OooO0O0.OooOOoo(), oooOO0O.f52761OooO0OO.OooOOoo(), null);
    }

    public static OooOO0O OooO0O0(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            OooOO0O.OooO0o oooO0o = new OooOO0O.OooO0o(((ECFieldFp) field).getP(), a, b);
            return f52963OooO00o.containsKey(oooO0o) ? (OooOO0O) f52963OooO00o.get(oooO0o) : oooO0o;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] midTermsOfReductionPolynomial = eCFieldF2m.getMidTermsOfReductionPolynomial();
        int[] iArr = new int[3];
        if (midTermsOfReductionPolynomial.length == 1) {
            iArr[0] = midTermsOfReductionPolynomial[0];
        } else {
            if (midTermsOfReductionPolynomial.length != 3) {
                throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
            }
            if (midTermsOfReductionPolynomial[0] < midTermsOfReductionPolynomial[1] && midTermsOfReductionPolynomial[0] < midTermsOfReductionPolynomial[2]) {
                iArr[0] = midTermsOfReductionPolynomial[0];
                if (midTermsOfReductionPolynomial[1] < midTermsOfReductionPolynomial[2]) {
                    iArr[1] = midTermsOfReductionPolynomial[1];
                    iArr[2] = midTermsOfReductionPolynomial[2];
                } else {
                    iArr[1] = midTermsOfReductionPolynomial[2];
                    iArr[2] = midTermsOfReductionPolynomial[1];
                }
            } else if (midTermsOfReductionPolynomial[1] < midTermsOfReductionPolynomial[2]) {
                iArr[0] = midTermsOfReductionPolynomial[1];
                if (midTermsOfReductionPolynomial[0] < midTermsOfReductionPolynomial[2]) {
                    iArr[1] = midTermsOfReductionPolynomial[0];
                    iArr[2] = midTermsOfReductionPolynomial[2];
                } else {
                    iArr[1] = midTermsOfReductionPolynomial[2];
                    iArr[2] = midTermsOfReductionPolynomial[0];
                }
            } else {
                iArr[0] = midTermsOfReductionPolynomial[2];
                if (midTermsOfReductionPolynomial[0] < midTermsOfReductionPolynomial[1]) {
                    iArr[1] = midTermsOfReductionPolynomial[0];
                    iArr[2] = midTermsOfReductionPolynomial[1];
                } else {
                    iArr[1] = midTermsOfReductionPolynomial[1];
                    iArr[2] = midTermsOfReductionPolynomial[0];
                }
            }
        }
        return new OooOO0O.OooO0OO(m, iArr[0], iArr[1], iArr[2], a, b);
    }

    public static OooOo00 OooO0OO(OooOO0O oooOO0O, ECPoint eCPoint) {
        return oooOO0O.OooO0O0(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }

    public static o000oOoO OooO0Oo(ECParameterSpec eCParameterSpec, boolean z) {
        OooOO0O oooOO0OOooO0O0 = OooO0O0(eCParameterSpec.getCurve());
        return new o000oOoO(oooOO0OOooO0O0, OooO0OO(oooOO0OOooO0O0, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static OooOO0O OooO0o(oO000O.OooO00o oooO00o, oO0000o0.OooO0O0 oooO0O0) {
        oO0OOoO0.OooO00o oooO00o2 = (oO0OOoO0.OooO00o) oooO00o;
        Set setUnmodifiableSet = Collections.unmodifiableSet(oooO00o2.f52853OooO0O0);
        oO0OO0O oo0oo0o = oooO0O0.f52443Oooo0o;
        if (!(oo0oo0o instanceof ooOOO0Oo)) {
            if (oo0oo0o instanceof oO0O0Oo0) {
                return oooO00o2.OooO0O0().f52926OooO00o;
            }
            if (setUnmodifiableSet.isEmpty()) {
                return oO0000o0.OooO0o.OooOO0(oooO0O0.f52443Oooo0o).f52450Oooo0oO;
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        ooOOO0Oo ooooo0ooOooOo0 = ooOOO0Oo.OooOo0(oo0oo0o);
        if (!setUnmodifiableSet.isEmpty() && !setUnmodifiableSet.contains(ooooo0ooOooOo0)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        oO0000o0.OooO0o oooO0oOooO0Oo = o00000O.OooO0Oo(ooooo0ooOooOo0);
        if (oooO0oOooO0Oo == null) {
            oooO0oOooO0Oo = (oO0000o0.OooO0o) oooO00o2.OooO00o().get(ooooo0ooOooOo0);
        }
        return oooO0oOooO0Oo.f52450Oooo0oO;
    }

    public static ECParameterSpec OooO0o0(oO0000o0.OooO0O0 oooO0O0, OooOO0O oooOO0O) {
        oO0OO0O oo0oo0o = oooO0O0.f52443Oooo0o;
        if (!(oo0oo0o instanceof ooOOO0Oo)) {
            if (oo0oo0o instanceof oO0O0Oo0) {
                return null;
            }
            oO0000o0.OooO0o oooO0oOooOO0 = oO0000o0.OooO0o.OooOO0(oo0oo0o);
            byte[] bArr = oooO0oOooOO0.f52452OoooO0;
            EllipticCurve ellipticCurveOooO00o = OooO00o(oooOO0O);
            return oooO0oOooOO0.f52453OoooO00 != null ? new ECParameterSpec(ellipticCurveOooO00o, new ECPoint(oooO0oOooOO0.OooO().OooO0o0().OooOOoo(), oooO0oOooOO0.OooO().OooO0o().OooOOoo()), oooO0oOooOO0.f52448Oooo, oooO0oOooOO0.f52453OoooO00.intValue()) : new ECParameterSpec(ellipticCurveOooO00o, new ECPoint(oooO0oOooOO0.OooO().OooO0o0().OooOOoo(), oooO0oOooOO0.OooO().OooO0o().OooOOoo()), oooO0oOooOO0.f52448Oooo, 1);
        }
        ooOOO0Oo ooooo0oo = (ooOOO0Oo) oo0oo0o;
        oO0000o0.OooO0o oooO0oOooO0Oo = o00000O.OooO0Oo(ooooo0oo);
        if (oooO0oOooO0Oo == null) {
            Map mapOooO00o = BouncyCastleProvider.f53675Oooo0o.OooO00o();
            if (!mapOooO00o.isEmpty()) {
                oooO0oOooO0Oo = (oO0000o0.OooO0o) mapOooO00o.get(ooooo0oo);
            }
        }
        byte[] bArr2 = oooO0oOooO0Oo.f52452OoooO0;
        return new Oooo0(o00000O.OooO0O0(ooooo0oo), OooO00o(oooOO0O), new ECPoint(oooO0oOooO0Oo.OooO().OooO0o0().OooOOoo(), oooO0oOooO0Oo.OooO().OooO0o().OooOOoo()), oooO0oOooO0Oo.f52448Oooo, oooO0oOooO0Oo.f52453OoooO00);
    }
}
