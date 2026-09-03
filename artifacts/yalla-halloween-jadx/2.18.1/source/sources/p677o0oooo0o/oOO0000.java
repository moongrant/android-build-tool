package p677o0oooo0o;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oOO0000 extends oO0OO0O implements h {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f52161Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f52162Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO0O00o0 f52163Oooo0oo;

    public oOO0000(boolean z, int i, oO0O00o0 oo0o00o0) {
        this.f52162Oooo0oO = true;
        this.f52163Oooo0oo = null;
        if (oo0o00o0 instanceof oO0O00O) {
            this.f52162Oooo0oO = true;
        } else {
            this.f52162Oooo0oO = z;
        }
        this.f52161Oooo0o = i;
        if (!this.f52162Oooo0oO) {
            boolean z2 = oo0o00o0.OooO0O0() instanceof oO0oO000;
        }
        this.f52163Oooo0oo = oo0o00o0;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (!(oo0oo0o instanceof oOO0000)) {
            return false;
        }
        oOO0000 ooo0000 = (oOO0000) oo0oo0o;
        if (this.f52161Oooo0o != ooo0000.f52161Oooo0o || this.f52162Oooo0oO != ooo0000.f52162Oooo0oO) {
            return false;
        }
        oO0O00o0 oo0o00o0 = this.f52163Oooo0oo;
        if (oo0o00o0 == null) {
            return ooo0000.f52163Oooo0oo == null;
        }
        return oo0o00o0.OooO0O0().equals(ooo0000.f52163Oooo0oo.OooO0O0());
    }

    @Override // p677o0oooo0o.h
    public final oO0OO0O OooO0o0() {
        return this;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOO() {
        return new O0000000(this.f52162Oooo0oO, this.f52161Oooo0o, this.f52163Oooo0oo);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final oO0OO0O OooOOOo() {
        return new f(this.f52162Oooo0oO, this.f52161Oooo0o, this.f52163Oooo0oo);
    }

    public final oO0OO0O OooOOo0() {
        oO0O00o0 oo0o00o0 = this.f52163Oooo0oo;
        if (oo0o00o0 != null) {
            return oo0o00o0.OooO0O0();
        }
        return null;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        int i = this.f52161Oooo0o;
        oO0O00o0 oo0o00o0 = this.f52163Oooo0oo;
        return oo0o00o0 != null ? i ^ oo0o00o0.hashCode() : i;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("[");
        sbOooO0o0.append(this.f52161Oooo0o);
        sbOooO0o0.append("]");
        sbOooO0o0.append(this.f52163Oooo0oo);
        return sbOooO0o0.toString();
    }
}
