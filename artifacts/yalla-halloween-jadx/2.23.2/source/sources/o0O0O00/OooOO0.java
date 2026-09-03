package o0O0O00;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0 implements OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0 f41116OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f41117OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f41119OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0OoOo0 f41113OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f41114OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41115OooO0OO = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f41118OooO0o0 = OooO00o.UNKNOWN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f41120OooO0oo = 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOO0O f41112OooO = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f41121OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f41122OooOO0O = new ArrayList();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f41123OooOO0o = new ArrayList();

    public enum OooO00o {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public OooOO0(o0OoOo0 o0oooo1) {
        this.f41116OooO0Oo = o0oooo1;
    }

    @Override // o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        ArrayList<OooOO0> arrayList = this.f41123OooOO0o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((OooOO0) it.next()).f41121OooOO0) {
                return;
            }
        }
        this.f41115OooO0OO = true;
        o0OoOo0 o0oooo1 = this.f41113OooO00o;
        if (o0oooo1 != null) {
            o0oooo1.OooO00o(this);
        }
        if (this.f41114OooO0O0) {
            this.f41116OooO0Oo.OooO00o(this);
            return;
        }
        OooOO0 oooOO1 = null;
        int i = 0;
        for (OooOO0 oooOO2 : arrayList) {
            if (!(oooOO2 instanceof OooOO0O)) {
                i++;
                oooOO1 = oooOO2;
            }
        }
        if (oooOO1 != null && i == 1 && oooOO1.f41121OooOO0) {
            OooOO0O oooOO0O = this.f41112OooO;
            if (oooOO0O != null) {
                if (!oooOO0O.f41121OooOO0) {
                    return;
                } else {
                    this.f41117OooO0o = this.f41120OooO0oo * oooOO0O.f41119OooO0oO;
                }
            }
            OooO0Oo(oooOO1.f41119OooO0oO + this.f41117OooO0o);
        }
        o0OoOo0 o0oooo2 = this.f41113OooO00o;
        if (o0oooo2 != null) {
            o0oooo2.OooO00o(this);
        }
    }

    public final void OooO0O0(OooO0o oooO0o) {
        this.f41122OooOO0O.add(oooO0o);
        if (this.f41121OooOO0) {
            oooO0o.OooO00o(oooO0o);
        }
    }

    public final void OooO0OO() {
        this.f41123OooOO0o.clear();
        this.f41122OooOO0O.clear();
        this.f41121OooOO0 = false;
        this.f41119OooO0oO = 0;
        this.f41115OooO0OO = false;
        this.f41114OooO0O0 = false;
    }

    public void OooO0Oo(int i) {
        if (this.f41121OooOO0) {
            return;
        }
        this.f41121OooOO0 = true;
        this.f41119OooO0oO = i;
        for (OooO0o oooO0o : this.f41122OooOO0O) {
            oooO0o.OooO00o(oooO0o);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41116OooO0Oo.f41141OooO0O0.f4402o00O0O);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.f41118OooO0o0);
        sb.append("(");
        sb.append(this.f41121OooOO0 ? Integer.valueOf(this.f41119OooO0oO) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f41123OooOO0o.size());
        sb.append(":d=");
        sb.append(this.f41122OooOO0O.size());
        sb.append(">");
        return sb.toString();
    }
}
