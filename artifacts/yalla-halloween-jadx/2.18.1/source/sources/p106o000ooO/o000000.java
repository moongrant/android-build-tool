package p106o000ooO;

import o00O0000.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f29933Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000000O f29934Oooo0oO;

    public o000000(o000000O o000000o2, o0OoOo0 o0oooo1) {
        this.f29934Oooo0oO = o000000o2;
        this.f29933Oooo0o = o0oooo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p102o000oo.o0OoOo0.OooO0OO().OooO00o(o000000O.f29935OooO0Oo, String.format("Scheduling work %s", this.f29933Oooo0o.f30152OooO00o), new Throwable[0]);
        this.f29934Oooo0oO.f29936OooO00o.OooO0OO(this.f29933Oooo0o);
    }
}
