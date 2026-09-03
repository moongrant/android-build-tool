package Oooo0;

import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 implements p100o000oOoO.o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f558OooO0O0;

    public o0000O00(o0O00OO o0o00oo2, p026Oooo0OO.o000 o000Var) {
        this.f557OooO00o = o0o00oo2;
        this.f558OooO0O0 = o000Var;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        p026Oooo0OO.o0000 o0000Var = (p026Oooo0OO.o0000) this.f557OooO00o.getValue();
        if (o0000Var != null) {
            p026Oooo0OO.o0000O00 o0000o00 = new p026Oooo0OO.o0000O00(o0000Var);
            p026Oooo0OO.o000 o000Var = this.f558OooO0O0;
            if (o000Var != null) {
                o000Var.OooO0O0(o0000o00);
            }
            this.f557OooO00o.setValue(null);
        }
    }
}
