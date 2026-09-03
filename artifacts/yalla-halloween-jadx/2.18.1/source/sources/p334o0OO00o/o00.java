package p334o0OO00o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzee f37233Oooo0o;

    public o00(zzee zzeeVar) {
        this.f37233Oooo0o = zzeeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f37233Oooo0o.OooO0OO(new o000O0(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f37233Oooo0o.OooO0OO(new o000OOo0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f37233Oooo0o.OooO0OO(new o000O0O0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f37233Oooo0o.OooO0OO(new o000OO0O(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbzVar = new zzbz();
        this.f37233Oooo0o.OooO0OO(new o000OO00(this, activity, zzbzVar));
        Bundle bundleZzb = zzbzVar.zzb(50L);
        if (bundleZzb != null) {
            bundle.putAll(bundleZzb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f37233Oooo0o.OooO0OO(new o000O0Oo(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f37233Oooo0o.OooO0OO(new o000O(this, activity));
    }
}
