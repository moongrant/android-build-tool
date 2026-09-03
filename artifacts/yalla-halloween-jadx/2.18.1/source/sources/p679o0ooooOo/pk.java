package p679o0ooooOo;

import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0Oo0o0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class pk extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ooOOO0Oo f52232Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ooOOO0Oo f52233Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ooOOO0Oo f52234Oooo0oo;

    public pk(oO0Oo0o0 oo0oo0o0) {
        this.f52232Oooo0o = (ooOOO0Oo) oo0oo0o0.OooOo00(0);
        this.f52233Oooo0oO = (ooOOO0Oo) oo0oo0o0.OooOo00(1);
        if (oo0oo0o0.size() > 2) {
            this.f52234Oooo0oo = (ooOOO0Oo) oo0oo0o0.OooOo00(2);
        }
    }

    public pk(ooOOO0Oo ooooo0oo, ooOOO0Oo ooooo0oo2) {
        this.f52232Oooo0o = ooooo0oo;
        this.f52233Oooo0oO = ooooo0oo2;
        this.f52234Oooo0oo = null;
    }

    public static pk OooO(Object obj) {
        if (obj instanceof pk) {
            return (pk) obj;
        }
        if (obj != null) {
            return new pk(oO0Oo0o0.OooOOo0(obj));
        }
        return null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(this.f52232Oooo0o);
        oo0o00oo.OooO00o(this.f52233Oooo0oO);
        ooOOO0Oo ooooo0oo = this.f52234Oooo0oo;
        if (ooooo0oo != null) {
            oo0o00oo.OooO00o(ooooo0oo);
        }
        return new oOOo0000(oo0o00oo);
    }
}
