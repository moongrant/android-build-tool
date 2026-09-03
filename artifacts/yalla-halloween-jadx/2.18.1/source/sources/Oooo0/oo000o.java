package Oooo0;

import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o implements p100o000oOoO.o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f770OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f771OooO0O0;

    public oo000o(o0O00OO o0o00oo2, p026Oooo0OO.o000 o000Var) {
        this.f770OooO00o = o0o00oo2;
        this.f771OooO0O0 = o000Var;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        p026Oooo0OO.o000Oo0 o000oo1 = (p026Oooo0OO.o000Oo0) this.f770OooO00o.getValue();
        if (o000oo1 != null) {
            this.f771OooO0O0.OooO0O0(new p026Oooo0OO.o000O0o(o000oo1));
            this.f770OooO00o.setValue(null);
        }
    }
}
