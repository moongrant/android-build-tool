package p683o0oooooo;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Objects;
import oO000Oo.OooO0O0;
import p677o0oooo0o.O0000000;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOO0000;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;
import p677o0oooo0o.ooOOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class vk extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO0Oo0o0 f52273Oooo0o;

    public vk(int i, BigInteger bigInteger, oOO0Oo00 ooo0oo00, oO0O00o0 oo0o00o0) {
        byte[] bArrOooO00o = OooO0O0.OooO00o((i + 7) / 8, bigInteger);
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(1L));
        oo0o00oo.OooO00o(new oOOO0OO0(bArrOooO00o));
        oo0o00oo.OooO00o(new O0000000(true, 0, oo0o00o0));
        if (ooo0oo00 != null) {
            oo0o00oo.OooO00o(new O0000000(true, 1, ooo0oo00));
        }
        this.f52273Oooo0o = new oOOo0000(oo0o00oo);
    }

    public vk(oO0Oo0o0 oo0oo0o0) {
        this.f52273Oooo0o = oo0oo0o0;
    }

    public static vk OooO(Object obj) {
        if (obj instanceof vk) {
            return (vk) obj;
        }
        if (obj != null) {
            return new vk(oO0Oo0o0.OooOOo0(obj));
        }
        return null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return this.f52273Oooo0o;
    }

    public final BigInteger OooOO0() {
        return new BigInteger(1, ((ooOOO00O) this.f52273Oooo0o.OooOo00(1)).OooOOoo());
    }

    public final oOO0Oo00 OooOO0O() {
        oO0OO0O oo0oo0oOooOOo0;
        Enumeration enumerationOooOo0 = this.f52273Oooo0o.OooOo0();
        while (enumerationOooOo0.hasMoreElements()) {
            oO0O00o0 oo0o00o0 = (oO0O00o0) enumerationOooOo0.nextElement();
            if (oo0o00o0 instanceof oOO0000) {
                oOO0000 ooo0000 = (oOO0000) oo0o00o0;
                if (ooo0000.f52161Oooo0o == 1) {
                    oo0oo0oOooOOo0 = ooo0000.OooOOo0();
                    Objects.requireNonNull(oo0oo0oOooOOo0);
                    return (oOO0Oo00) oo0oo0oOooOOo0;
                }
            }
        }
        oo0oo0oOooOOo0 = null;
        return (oOO0Oo00) oo0oo0oOooOOo0;
    }
}
