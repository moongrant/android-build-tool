package p314o0O0oO0o;

import android.text.Spannable;
import java.math.BigInteger;
import java.util.Hashtable;
import oO0000o0.OooO00o;
import oO000O0.OooO;
import oO000O0.OooO0o;
import p673o0oooo.oo0oOO0;
import p677o0oooo0o.ooOOO0Oo;
import p679o0ooooOo.mk;
import p681o0ooooo0.o0O0OO0;
import p683o0oooooo.xk;
import p686oO0000oo.OooOOO;
import p701oO0Oo0oo.Oooo000;
import p701oO0Oo0oo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static o00000O f36573OooO00o;

    public static void OooO00o(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static String OooO0O0(ooOOO0Oo ooooo0oo) {
        String str = (String) OooO00o.f52441OooOoO.get(ooooo0oo);
        if (str != null) {
            return str;
        }
        String str2 = (String) xk.f52310Oooo0O0.get(ooooo0oo);
        if (str2 == null) {
            str2 = (String) ooo0Oo0.OooO00o.f53514OooO0O0.get(ooooo0oo);
        }
        if (str2 == null) {
            str2 = (String) o.OooO00o.f26534OooOOo0.get(ooooo0oo);
        }
        return str2 == null ? mk.OooO0O0(ooooo0oo) : str2;
    }

    public static OooO0o OooO0OO(o000oOoO o000oooo2) {
        if (!(o000oooo2 instanceof Oooo000)) {
            return new OooO0o(o000oooo2.f52926OooO00o, o000oooo2.f52928OooO0OO, o000oooo2.f52929OooO0Oo, o000oooo2.f52930OooO0o0, o000oooo2.f52927OooO0O0);
        }
        Oooo000 oooo000 = (Oooo000) o000oooo2;
        OooO0o0(oooo000.f52925OooO0o);
        return new OooO(oooo000.f52926OooO00o, oooo000.f52928OooO0OO, oooo000.f52929OooO0Oo, oooo000.f52930OooO0o0, oooo000.f52927OooO0O0);
    }

    public static oO0000o0.OooO0o OooO0Oo(ooOOO0Oo ooooo0oo) {
        oO0000o0.OooO oooO = (oO0000o0.OooO) OooOOO.f52538Oooo00o.get(ooooo0oo);
        oO0000o0.OooO0o oooO0oOooO0O0 = oooO == null ? null : oooO.OooO0O0();
        if (oooO0oOooO0O0 != null) {
            return oooO0oOooO0O0;
        }
        oO0000o0.OooO oooO2 = (oO0000o0.OooO) OooO00o.f52442OooOoO0.get(ooooo0oo);
        oO0000o0.OooO0o oooO0oOooO0O1 = oooO2 != null ? oooO2.OooO0O0() : null;
        if (oooO0oOooO0O1 == null) {
            oooO0oOooO0O1 = xk.OooO0Oo(ooooo0oo);
        }
        if (oooO0oOooO0O1 == null) {
            Hashtable hashtable = ooo0Oo0.OooO00o.f53513OooO00o;
            oooO0oOooO0O1 = xk.OooO0Oo(ooooo0oo);
        }
        if (oooO0oOooO0O1 == null) {
            oO0000o0.OooO oooO3 = (oO0000o0.OooO) o.OooO00o.f26533OooOOOo.get(ooooo0oo);
            oooO0oOooO0O1 = oooO3 != null ? oooO3.OooO0O0() : null;
        }
        if (oooO0oOooO0O1 != null) {
            return oooO0oOooO0O1;
        }
        oO0000o0.OooO oooO4 = (oO0000o0.OooO) o0O0OO0.f52243OooO0Oo.get(ooooo0oo);
        return oooO4 != null ? oooO4.OooO0O0() : null;
    }

    public static int OooO0o(oO000O.OooO00o oooO00o, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        o000oOoO o000ooooOooO0O0 = ((oO0OOoO0.OooO00o) oooO00o).OooO0O0();
        return o000ooooOooO0O0 == null ? bigInteger2.bitLength() : o000ooooOooO0O0.f52929OooO0Oo.bitLength();
    }

    public static ooOOO0Oo OooO0o0(String str) {
        if (str.indexOf(32) > 0) {
            str = str.substring(str.indexOf(32) + 1);
        }
        try {
            return (str.charAt(0) < '0' || str.charAt(0) > '2') ? OooO0oO(str) : new ooOOO0Oo(str);
        } catch (IllegalArgumentException unused) {
            return OooO0oO(str);
        }
    }

    public static ooOOO0Oo OooO0oO(String str) {
        ooOOO0Oo ooooo0oo = (ooOOO0Oo) OooO00o.f52436OooOo.get(oO000Oo.OooO0o.OooO0OO(str));
        if (ooooo0oo != null) {
            return ooooo0oo;
        }
        ooOOO0Oo ooooo0ooOooO0OO = (ooOOO0Oo) xk.f52309Oooo00o.get(oO000Oo.OooO0o.OooO0OO(str));
        if (ooooo0ooOooO0OO == null) {
            ooooo0ooOooO0OO = (ooOOO0Oo) ooo0Oo0.OooO00o.f53513OooO00o.get(oO000Oo.OooO0o.OooO0Oo(str));
        }
        if (ooooo0ooOooO0OO == null) {
            ooooo0ooOooO0OO = (ooOOO0Oo) o.OooO00o.f26532OooOOOO.get(oO000Oo.OooO0o.OooO0OO(str));
        }
        if (ooooo0ooOooO0OO == null) {
            ooooo0ooOooO0OO = mk.OooO0OO(str);
        }
        if (ooooo0ooOooO0OO == null) {
            ooooo0ooOooO0OO = (ooOOO0Oo) oo0oOO0.f52032OooO0O0.get(oO000Oo.OooO0o.OooO0OO(str));
        }
        return ooooo0ooOooO0OO == null ? (ooOOO0Oo) o0O0OO0.f52242OooO0OO.get(oO000Oo.OooO0o.OooO0OO(str)) : ooooo0ooOooO0OO;
    }
}
