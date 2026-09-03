package p032OoooO0;

import p026Oooo0OO.o000;
import p026Oooo0OO.o000O0o;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f3199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000 f3200OooO0O0;

    public o00OOO0O(o0O00OO o0o00oo2, o000 o000Var) {
        this.f3199OooO00o = o0o00oo2;
        this.f3200OooO0O0 = o000Var;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o000Oo0 o000oo1 = (o000Oo0) this.f3199OooO00o.getValue();
        if (o000oo1 != null) {
            o000O0o o000o0o2 = new o000O0o(o000oo1);
            o000 o000Var = this.f3200OooO0O0;
            if (o000Var != null) {
                o000Var.OooO0O0(o000o0o2);
            }
            this.f3199OooO00o.setValue(null);
        }
    }
}
