package oo0ooO;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Activity f53425OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Bundle f53426OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Bundle f53427OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f53428OooO0Oo;

    public OooO0O0(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f53428OooO0Oo = deferredLifecycleHelper;
        this.f53425OooO00o = activity;
        this.f53426OooO0O0 = bundle;
        this.f53427OooO0OO = bundle2;
    }

    @Override // oo0ooO.OooOOO0
    public final int zaa() {
        return 0;
    }

    @Override // oo0ooO.OooOOO0
    public final void zab() {
        this.f53428OooO0Oo.f15817OooO00o.onInflate(this.f53425OooO00o, this.f53426OooO0O0, this.f53427OooO0OO);
    }
}
