package o00000O;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Application f33401OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.OooO00o f33402OooO0o0;

    public OooO(Application application, OooOO0O.OooO00o oooO00o) {
        this.f33401OooO0Oo = application;
        this.f33402OooO0o0 = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33401OooO0Oo.unregisterActivityLifecycleCallbacks(this.f33402OooO0o0);
    }
}
