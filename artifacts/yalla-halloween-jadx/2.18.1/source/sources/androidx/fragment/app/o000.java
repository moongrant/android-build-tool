package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0O0 f8413Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0o f8414Oooo0oO;

    public o000(o000O0o o000o0o2, o000O0o.OooO0O0 oooO0O0) {
        this.f8414Oooo0oO = o000o0o2;
        this.f8413Oooo0o = oooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8414Oooo0oO.f8486OooO0O0.contains(this.f8413Oooo0o)) {
            o000O0o.OooO0O0 oooO0O0 = this.f8413Oooo0o;
            p016OooOoO0.OooOo00.OooO00o(oooO0O0.f8493OooO00o, oooO0O0.f8495OooO0OO.mView);
        }
    }
}
