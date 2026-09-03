package oo0ooO;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Bundle f53429OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f53430OooO0O0;

    public OooO0OO(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f53430OooO0O0 = deferredLifecycleHelper;
        this.f53429OooO00o = bundle;
    }

    @Override // oo0ooO.OooOOO0
    public final int zaa() {
        return 1;
    }

    @Override // oo0ooO.OooOOO0
    public final void zab() {
        this.f53430OooO0O0.f15817OooO00o.onCreate(this.f53429OooO00o);
    }
}
