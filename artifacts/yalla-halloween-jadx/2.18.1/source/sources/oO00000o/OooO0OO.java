package oO00000o;

import Oooo000.o00O00;
import java.util.Enumeration;
import java.util.Objects;
import p101o000oOoo.oO00O0o0;
import p677o0oooo0o.oO0O00O;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oO0oO000;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends oOo0o0oO implements oO0O00O {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static oO00O0o0 f52374OoooO00 = oO0000O.OooO00o.f52381OooO0Oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0O0[] f52375Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f52376Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f52377Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO00O0o0 f52378Oooo0oo;

    public OooO0OO(oO00O0o0 oo00o0o0, oO0Oo0o0 oo0oo0o0) {
        this.f52378Oooo0oo = oo00o0o0;
        this.f52375Oooo = new OooO0O0[oo0oo0o0.size()];
        Enumeration enumerationOooOo0 = oo0oo0o0.OooOo0();
        int i = 0;
        while (enumerationOooOo0.hasMoreElements()) {
            OooO0O0[] oooO0O0Arr = this.f52375Oooo;
            int i2 = i + 1;
            Object objNextElement = enumerationOooOo0.nextElement();
            oooO0O0Arr[i] = objNextElement instanceof OooO0O0 ? (OooO0O0) objNextElement : objNextElement != null ? new OooO0O0(oO0oO000.OooOOo0(objNextElement)) : null;
            i = i2;
        }
    }

    public final OooO0O0[] OooO() {
        OooO0O0[] oooO0O0Arr = this.f52375Oooo;
        int length = oooO0O0Arr.length;
        OooO0O0[] oooO0O0Arr2 = new OooO0O0[length];
        System.arraycopy(oooO0O0Arr, 0, oooO0O0Arr2, 0, length);
        return oooO0O0Arr2;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return new oOOo0000(this.f52375Oooo);
    }

    @Override // p677o0oooo0o.oOo0o0oO
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0OO) && !(obj instanceof oO0Oo0o0)) {
            return false;
        }
        if (OooO0O0().equals(((oO0O00o0) obj).OooO0O0())) {
            return true;
        }
        try {
            return this.f52378Oooo0oo.OooO0o0(this, new OooO0OO(f52374OoooO00, oO0Oo0o0.OooOOo0(((oO0O00o0) obj).OooO0O0())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        if (this.f52376Oooo0o) {
            return this.f52377Oooo0oO;
        }
        this.f52376Oooo0o = true;
        Objects.requireNonNull(this.f52378Oooo0oo);
        OooO0O0[] oooO0O0ArrOooO = OooO();
        int iHashCode = 0;
        for (int i = 0; i != oooO0O0ArrOooO.length; i++) {
            if (oooO0O0ArrOooO[i].OooOO0O()) {
                OooO00o[] oooO00oArrOooOO0 = oooO0O0ArrOooO[i].OooOO0();
                for (int i2 = 0; i2 != oooO00oArrOooOO0.length; i2++) {
                    iHashCode = (iHashCode ^ oooO00oArrOooOO0[i2].f52371Oooo0o.hashCode()) ^ o00O00.OooO0oO(o00O00.OooOOOO(oooO00oArrOooOO0[i2].f52372Oooo0oO)).hashCode();
                }
            } else {
                iHashCode = (iHashCode ^ oooO0O0ArrOooO[i].OooO().f52371Oooo0o.hashCode()) ^ o00O00.OooO0oO(o00O00.OooOOOO(oooO0O0ArrOooO[i].OooO().f52372Oooo0oO)).hashCode();
            }
        }
        this.f52377Oooo0oO = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f52378Oooo0oo.OooOoo0(this);
    }
}
