package p677o0oooo0o;

import OooO00o.OooO00o;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO0oO000 extends oO0OO0O implements Iterable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Vector f52154Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f52155Oooo0oO;

    public oO0oO000() {
        this.f52154Oooo0o = new Vector();
        this.f52155Oooo0oO = false;
    }

    public oO0oO000(oO0O00o0 oo0o00o0) {
        Vector vector = new Vector();
        this.f52154Oooo0o = vector;
        this.f52155Oooo0oO = false;
        vector.addElement(oo0o00o0);
    }

    public oO0oO000(oO0O00oO oo0o00oo, boolean z) throws IOException {
        this.f52154Oooo0o = new Vector();
        this.f52155Oooo0oO = false;
        for (int i = 0; i != oo0o00oo.OooO0OO(); i++) {
            this.f52154Oooo0o.addElement(oo0o00oo.OooO0O0(i));
        }
        if (z) {
            OooOo0O();
        }
    }

    public oO0oO000(oO0O00o0[] oo0o00o0Arr) {
        this.f52154Oooo0o = new Vector();
        this.f52155Oooo0oO = false;
        for (int i = 0; i != oo0o00o0Arr.length; i++) {
            this.f52154Oooo0o.addElement(oo0o00o0Arr[i]);
        }
    }

    public static oO0oO000 OooOOo0(Object obj) {
        if (obj == null || (obj instanceof oO0oO000)) {
            return (oO0oO000) obj;
        }
        if (obj instanceof oOo00o00) {
            return OooOOo0(((oOo00o00) obj).OooO0O0());
        }
        if (obj instanceof byte[]) {
            try {
                return OooOOo0(oO0OO0O.OooOO0o((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("failed to construct set from byte[]: ");
                sbOooO0o0.append(e.getMessage());
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
        }
        if (obj instanceof oO0O00o0) {
            oO0OO0O oo0oo0oOooO0O0 = ((oO0O00o0) obj).OooO0O0();
            if (oo0oo0oOooO0O0 instanceof oO0oO000) {
                return (oO0oO000) oo0oo0oOooO0O0;
            }
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("unknown object in getInstance: ");
        sbOooO0o1.append(obj.getClass().getName());
        throw new IllegalArgumentException(sbOooO0o1.toString());
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (!(oo0oo0o instanceof oO0oO000)) {
            return false;
        }
        oO0oO000 oo0oo000 = (oO0oO000) oo0oo0o;
        if (size() != oo0oo000.size()) {
            return false;
        }
        Enumeration enumerationOooOo0 = OooOo0();
        Enumeration enumerationOooOo1 = oo0oo000.OooOo0();
        while (enumerationOooOo0.hasMoreElements()) {
            oO0O00o0 oo0o00o0OooOOoo = OooOOoo(enumerationOooOo0);
            oO0O00o0 oo0o00o0OooOOoo2 = OooOOoo(enumerationOooOo1);
            oO0OO0O oo0oo0oOooO0O0 = oo0o00o0OooOOoo.OooO0O0();
            oO0OO0O oo0oo0oOooO0O1 = oo0o00o0OooOOoo2.OooO0O0();
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
    public final oO0OO0O OooOOOO() throws IOException {
        if (this.f52155Oooo0oO) {
            oOo0o00 ooo0o00 = new oOo0o00();
            ooo0o00.f52154Oooo0o = this.f52154Oooo0o;
            return ooo0o00;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.f52154Oooo0o.size(); i++) {
            vector.addElement(this.f52154Oooo0o.elementAt(i));
        }
        oOo0o00 ooo0o01 = new oOo0o00();
        ooo0o01.f52154Oooo0o = vector;
        ooo0o01.OooOo0O();
        return ooo0o01;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOo() {
        e eVar = new e();
        eVar.f52154Oooo0o = this.f52154Oooo0o;
        return eVar;
    }

    public final oO0O00o0 OooOOoo(Enumeration enumeration) {
        oO0O00o0 oo0o00o0 = (oO0O00o0) enumeration.nextElement();
        return oo0o00o0 == null ? oOOO00o0.f52185Oooo0o : oo0o00o0;
    }

    public final Enumeration OooOo0() {
        return this.f52154Oooo0o.elements();
    }

    public final oO0O00o0 OooOo00(int i) {
        return (oO0O00o0) this.f52154Oooo0o.elementAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void OooOo0O() throws java.io.IOException {
        /*
            r15 = this;
            java.lang.String r0 = "cannot encode object added to SET"
            java.lang.String r1 = "DER"
            boolean r2 = r15.f52155Oooo0oO
            if (r2 != 0) goto L95
            r2 = 1
            r15.f52155Oooo0oO = r2
            java.util.Vector r3 = r15.f52154Oooo0o
            int r3 = r3.size()
            if (r3 <= r2) goto L95
            java.util.Vector r3 = r15.f52154Oooo0o
            int r3 = r3.size()
            int r3 = r3 - r2
            r4 = 1
        L1b:
            if (r4 == 0) goto L95
            java.util.Vector r4 = r15.f52154Oooo0o
            r5 = 0
            java.lang.Object r4 = r4.elementAt(r5)
            o0oooo0o.oO0O00o0 r4 = (p677o0oooo0o.oO0O00o0) r4
            o0oooo0o.oO0OO0O r4 = r4.OooO0O0()     // Catch: java.io.IOException -> L8f
            byte[] r4 = r4.OooO0oo(r1)     // Catch: java.io.IOException -> L8f
            r7 = r4
            r4 = 0
            r6 = 0
            r8 = 0
        L32:
            if (r8 == r3) goto L8c
            java.util.Vector r9 = r15.f52154Oooo0o
            int r10 = r8 + 1
            java.lang.Object r9 = r9.elementAt(r10)
            o0oooo0o.oO0O00o0 r9 = (p677o0oooo0o.oO0O00o0) r9
            o0oooo0o.oO0OO0O r9 = r9.OooO0O0()     // Catch: java.io.IOException -> L86
            byte[] r9 = r9.OooO0oo(r1)     // Catch: java.io.IOException -> L86
            int r11 = r7.length
            int r12 = r9.length
            int r11 = java.lang.Math.min(r11, r12)
            r12 = 0
        L4d:
            if (r12 == r11) goto L66
            r13 = r7[r12]
            r14 = r9[r12]
            if (r13 == r14) goto L63
            r11 = r7[r12]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r11 >= r12) goto L61
        L5f:
            r11 = 1
            goto L6a
        L61:
            r11 = 0
            goto L6a
        L63:
            int r12 = r12 + 1
            goto L4d
        L66:
            int r12 = r7.length
            if (r11 != r12) goto L61
            goto L5f
        L6a:
            if (r11 == 0) goto L6e
            r7 = r9
            goto L84
        L6e:
            java.util.Vector r4 = r15.f52154Oooo0o
            java.lang.Object r4 = r4.elementAt(r8)
            java.util.Vector r6 = r15.f52154Oooo0o
            java.lang.Object r9 = r6.elementAt(r10)
            r6.setElementAt(r9, r8)
            java.util.Vector r6 = r15.f52154Oooo0o
            r6.setElementAt(r4, r10)
            r4 = r8
            r6 = 1
        L84:
            r8 = r10
            goto L32
        L86:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L8c:
            r3 = r4
            r4 = r6
            goto L1b
        L8f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p677o0oooo0o.oO0oO000.OooOo0O():void");
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        Enumeration enumerationOooOo0 = OooOo0();
        int size = size();
        while (enumerationOooOo0.hasMoreElements()) {
            size = (size * 17) ^ OooOOoo(enumerationOooOo0).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator<oO0O00o0> iterator() {
        oO0O00o0[] oo0o00o0Arr = new oO0O00o0[size()];
        for (int i = 0; i != size(); i++) {
            oo0o00o0Arr[i] = OooOo00(i);
        }
        return new oO000Oo.OooO00o.C0433OooO00o(oo0o00o0Arr);
    }

    public final int size() {
        return this.f52154Oooo0o.size();
    }

    public final String toString() {
        return this.f52154Oooo0o.toString();
    }
}
