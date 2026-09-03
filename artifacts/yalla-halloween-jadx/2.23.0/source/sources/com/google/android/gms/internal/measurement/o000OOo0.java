package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzef f15464OooO0Oo;

    public o000OOo0(zzef zzefVar) {
        this.f15464OooO0Oo = zzefVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f15464OooO0Oo.OooO0OO(new o000O00O(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f15464OooO0Oo.OooO0OO(new o000OO00(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f15464OooO0Oo.OooO0OO(new o000OO0O(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f15464OooO0Oo.OooO0OO(new o000O0Oo(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbzVar = new zzbz();
        this.f15464OooO0Oo.OooO0OO(new o000O(this, activity, zzbzVar));
        Bundle bundleZzb = zzbzVar.zzb(50L);
        if (bundleZzb != null) {
            bundle.putAll(bundleZzb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f15464OooO0Oo.OooO0OO(new o000O0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f15464OooO0Oo.OooO0OO(new o000O0O0(this, activity));
    }
}
