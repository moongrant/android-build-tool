package Oooo0;

import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 implements p100o000oOoO.o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f600OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f601OooO0O0;

    public o000OOo0(o0O00OO o0o00oo2, p026Oooo0OO.o000 o000Var) {
        this.f600OooO00o = o0o00oo2;
        this.f601OooO0O0 = o000Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o0O00OO o0o00oo2 = this.f600OooO00o;
        p026Oooo0OO.o000 o000Var = this.f601OooO0O0;
        p026Oooo0OO.o0000O0 o0000o1 = (p026Oooo0OO.o0000O0) o0o00oo2.getValue();
        if (o0000o1 != null) {
            o000Var.OooO0O0(new p026Oooo0OO.o0000O0O(o0000o1));
            o0o00oo2.setValue(null);
        }
    }
}
