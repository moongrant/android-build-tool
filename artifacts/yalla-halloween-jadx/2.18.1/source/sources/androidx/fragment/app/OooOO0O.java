package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8395Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0o.OooO0OO f8396Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f8397Oooo0oo;

    public OooOO0O(o000O0o.OooO0OO oooO0OO, o000O0o.OooO0OO oooO0OO2, boolean z, p021OooOooo.Oooo0 oooo0) {
        this.f8395Oooo0o = oooO0OO;
        this.f8396Oooo0oO = oooO0OO2;
        this.f8397Oooo0oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.f8395Oooo0o.f8495OooO0OO;
        Fragment fragment2 = this.f8396Oooo0oO.f8495OooO0OO;
        boolean z = this.f8397Oooo0oo;
        o0000 o0000Var = o0000Ooo.f8480OooO00o;
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
