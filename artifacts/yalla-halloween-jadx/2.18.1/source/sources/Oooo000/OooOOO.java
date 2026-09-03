package Oooo000;

import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO f804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f805OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f806OooO0OO;

    public OooOOO(o00OO0OO o00oo0oo, Object obj, o000oOoO o000oooo2) {
        this.f804OooO00o = o00oo0oo;
        this.f805OooO0O0 = obj;
        this.f806OooO0OO = o000oooo2;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        this.f804OooO00o.remove(this.f805OooO0O0);
        this.f806OooO0OO.f912OooO0Oo.remove(this.f805OooO0O0);
    }
}
