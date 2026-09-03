package p070o0000ooO;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Application f28007Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o.OooO00o f28008Oooo0oO;

    public o00oO0o(Application application, o0OOO0o.OooO00o oooO00o) {
        this.f28007Oooo0o = application;
        this.f28008Oooo0oO = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28007Oooo0o.unregisterActivityLifecycleCallbacks(this.f28008Oooo0oO);
    }
}
