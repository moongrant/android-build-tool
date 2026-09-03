package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0Oo0o0 extends oO0OO0O implements Iterable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Vector f52153Oooo0o = new Vector();

    public oO0Oo0o0() {
    }

    public oO0Oo0o0(oO0O00oO oo0o00oo) {
        for (int i = 0; i != oo0o00oo.OooO0OO(); i++) {
            this.f52153Oooo0o.addElement(oo0o00oo.OooO0O0(i));
        }
    }

    public oO0Oo0o0(oO0O00o0[] oo0o00o0Arr) {
        for (int i = 0; i != oo0o00o0Arr.length; i++) {
            this.f52153Oooo0o.addElement(oo0o00o0Arr[i]);
        }
    }

    public static oO0Oo0o0 OooOOo0(Object obj) {
        if (obj == null || (obj instanceof oO0Oo0o0)) {
            return (oO0Oo0o0) obj;
        }
        if (obj instanceof oO0o0000) {
            return OooOOo0(((oO0o0000) obj).OooO0O0());
        }
        if (obj instanceof byte[]) {
            try {
                return OooOOo0(oO0OO0O.OooOO0o((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("failed to construct sequence from byte[]: ");
                sbOooO0o0.append(e.getMessage());
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
        }
        if (obj instanceof oO0O00o0) {
            oO0OO0O oo0oo0oOooO0O0 = ((oO0O00o0) obj).OooO0O0();
            if (oo0oo0oOooO0O0 instanceof oO0Oo0o0) {
                return (oO0Oo0o0) oo0oo0oOooO0O0;
            }
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("unknown object in getInstance: ");
        sbOooO0o1.append(obj.getClass().getName());
        throw new IllegalArgumentException(sbOooO0o1.toString());
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (!(oo0oo0o instanceof oO0Oo0o0)) {
            return false;
        }
        oO0Oo0o0 oo0oo0o0 = (oO0Oo0o0) oo0oo0o;
        if (size() != oo0oo0o0.size()) {
            return false;
        }
        Enumeration enumerationOooOo0 = OooOo0();
        Enumeration enumerationOooOo1 = oo0oo0o0.OooOo0();
        while (enumerationOooOo0.hasMoreElements()) {
            oO0O00o0 oo0o00o0 = (oO0O00o0) enumerationOooOo0.nextElement();
            oO0O00o0 oo0o00o0OooOOoo = OooOOoo(enumerationOooOo1);
            oO0OO0O oo0oo0oOooO0O0 = oo0o00o0.OooO0O0();
            oO0OO0O oo0oo0oOooO0O1 = oo0o00o0OooOOoo.OooO0O0();
            if (oo0oo0oOooO0O0 != oo0oo0oOooO0O1 && !oo0oo0oOooO0O0.equals(oo0oo0oOooO0O1)) {
                return false;
            }
        }
        return true;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return true;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public oO0OO0O OooOOOO() {
        oOOo0000 oooo0000 = new oOOo0000();
        oooo0000.f52153Oooo0o = this.f52153Oooo0o;
        return oooo0000;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public oO0OO0O OooOOOo() {
        d dVar = new d();
        dVar.f52153Oooo0o = this.f52153Oooo0o;
        return dVar;
    }

    public final oO0O00o0 OooOOoo(Enumeration enumeration) {
        return (oO0O00o0) enumeration.nextElement();
    }

    public Enumeration OooOo0() {
        return this.f52153Oooo0o.elements();
    }

    public oO0O00o0 OooOo00(int i) {
        return (oO0O00o0) this.f52153Oooo0o.elementAt(i);
    }

    public final oO0O00o0[] OooOo0O() {
        oO0O00o0[] oo0o00o0Arr = new oO0O00o0[size()];
        for (int i = 0; i != size(); i++) {
            oo0o00o0Arr[i] = OooOo00(i);
        }
        return oo0o00o0Arr;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        Enumeration enumerationOooOo0 = OooOo0();
        int size = size();
        while (enumerationOooOo0.hasMoreElements()) {
            size = (size * 17) ^ ((oO0O00o0) enumerationOooOo0.nextElement()).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator<oO0O00o0> iterator() {
        return new oO000Oo.OooO00o.C0433OooO00o(OooOo0O());
    }

    public int size() {
        return this.f52153Oooo0o.size();
    }

    public final String toString() {
        return this.f52153Oooo0o.toString();
    }
}
