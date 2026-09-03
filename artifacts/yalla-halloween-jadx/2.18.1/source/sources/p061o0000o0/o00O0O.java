package p061o0000o0;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o00O0O implements Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O0O00 f27861OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f27862OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f27864OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0O0O00 f27858OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f27859OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f27860OooO0OO = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27863OooO0o0 = 1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f27865OooO0oo = 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00Oo0 f27857OooO = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f27866OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public List<Oooo0> f27867OooOO0O = new ArrayList();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public List<o00O0O> f27868OooOO0o = new ArrayList();

    public o00O0O(o0O0O00 o0o0o00) {
        this.f27861OooO0Oo = o0o0o00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    @Override // p061o0000o0.Oooo0
    public final void OooO00o(Oooo0 oooo0) {
        Iterator it = this.f27868OooOO0o.iterator();
        while (it.hasNext()) {
            if (!((o00O0O) it.next()).f27866OooOO0) {
                return;
            }
        }
        this.f27860OooO0OO = true;
        o0O0O00 o0o0o00 = this.f27858OooO00o;
        if (o0o0o00 != null) {
            o0o0o00.OooO00o(this);
        }
        if (this.f27859OooO0O0) {
            this.f27861OooO0Oo.OooO00o(this);
            return;
        }
        o00O0O o00o0o2 = null;
        int i = 0;
        for (o00O0O o00o0o3 : this.f27868OooOO0o) {
            if (!(o00o0o3 instanceof o00Oo0)) {
                i++;
                o00o0o2 = o00o0o3;
            }
        }
        if (o00o0o2 != null && i == 1 && o00o0o2.f27866OooOO0) {
            o00Oo0 o00oo1 = this.f27857OooO;
            if (o00oo1 != null) {
                if (!o00oo1.f27866OooOO0) {
                    return;
                } else {
                    this.f27862OooO0o = this.f27865OooO0oo * o00oo1.f27864OooO0oO;
                }
            }
            OooO0Oo(o00o0o2.f27864OooO0oO + this.f27862OooO0o);
        }
        o0O0O00 o0o0o01 = this.f27858OooO00o;
        if (o0o0o01 != null) {
            o0o0o01.OooO00o(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public final void OooO0O0(Oooo0 oooo0) {
        this.f27867OooOO0O.add(oooo0);
        if (this.f27866OooOO0) {
            oooo0.OooO00o(oooo0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public final void OooO0OO() {
        this.f27868OooOO0o.clear();
        this.f27867OooOO0O.clear();
        this.f27866OooOO0 = false;
        this.f27864OooO0oO = 0;
        this.f27860OooO0OO = false;
        this.f27859OooO0O0 = false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public void OooO0Oo(int i) {
        if (this.f27866OooOO0) {
            return;
        }
        this.f27866OooOO0 = true;
        this.f27864OooO0oO = i;
        for (Oooo0 oooo0 : this.f27867OooOO0O) {
            oooo0.OooO00o(oooo0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList, java.util.List<o0000o0.Oooo0>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27861OooO0Oo.f27873OooO0O0.f6962o00O0O);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(o0OoOo0.OooO00o(this.f27863OooO0o0));
        sb.append("(");
        sb.append(this.f27866OooOO0 ? Integer.valueOf(this.f27864OooO0oO) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f27868OooOO0o.size());
        sb.append(":d=");
        sb.append(this.f27867OooOO0O.size());
        sb.append(">");
        return sb.toString();
    }
}
