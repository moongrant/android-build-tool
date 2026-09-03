package p025Oooo0O0;

import p026Oooo0OO.o000;
import p026Oooo0OO.o00000O;
import p026Oooo0OO.o00000OO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f1689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000 f1690OooO0O0;

    public o0O0O00(o0O00OO o0o00oo2, o000 o000Var) {
        this.f1689OooO00o = o0o00oo2;
        this.f1690OooO0O0 = o000Var;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o00000OO o00000oo2 = (o00000OO) this.f1689OooO00o.getValue();
        if (o00000oo2 != null) {
            o000 o000Var = this.f1690OooO0O0;
            if (o000Var != null) {
                o000Var.OooO0O0(new o00000O(o00000oo2));
            }
            this.f1689OooO00o.setValue(null);
        }
    }
}
