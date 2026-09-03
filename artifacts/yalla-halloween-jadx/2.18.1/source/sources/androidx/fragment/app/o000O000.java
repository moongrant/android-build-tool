package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0O0 f8483Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0o f8484Oooo0oO;

    public o000O000(o000O0o o000o0o2, o000O0o.OooO0O0 oooO0O0) {
        this.f8484Oooo0oO = o000o0o2;
        this.f8483Oooo0o = oooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8484Oooo0oO.f8486OooO0O0.remove(this.f8483Oooo0o);
        this.f8484Oooo0oO.f8487OooO0OO.remove(this.f8483Oooo0o);
    }
}
