package o00000O;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Application f33931OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO.OooO00o f33932OooO0o0;

    public OooO0OO(Application application, OooO.OooO00o oooO00o) {
        this.f33931OooO0Oo = application;
        this.f33932OooO0o0 = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33931OooO0Oo.unregisterActivityLifecycleCallbacks(this.f33932OooO0o0);
    }
}
