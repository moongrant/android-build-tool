package p262o00ooo0;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 implements o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Activity f40383OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Bundle f40384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Bundle f40385OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f40386OooO0Oo;

    public o000000(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f40386OooO0Oo = deferredLifecycleHelper;
        this.f40383OooO00o = activity;
        this.f40384OooO0O0 = bundle;
        this.f40385OooO0OO = bundle2;
    }

    @Override // p262o00ooo0.o0000Ooo
    public final int zaa() {
        return 0;
    }

    @Override // p262o00ooo0.o0000Ooo
    public final void zab() {
        this.f40386OooO0Oo.f14834OooO00o.onInflate(this.f40383OooO00o, this.f40384OooO0O0, this.f40385OooO0OO);
    }
}
