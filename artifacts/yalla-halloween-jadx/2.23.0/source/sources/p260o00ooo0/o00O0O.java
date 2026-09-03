package p260o00ooo0;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Activity f41049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Bundle f41050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Bundle f41051OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f41052OooO0Oo;

    public o00O0O(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f41052OooO0Oo = deferredLifecycleHelper;
        this.f41049OooO00o = activity;
        this.f41050OooO0O0 = bundle;
        this.f41051OooO0OO = bundle2;
    }

    @Override // p260o00ooo0.o0OOO0o
    public final int zaa() {
        return 0;
    }

    @Override // p260o00ooo0.o0OOO0o
    public final void zab() {
        this.f41052OooO0Oo.f15310OooO00o.onInflate(this.f41049OooO00o, this.f41050OooO0O0, this.f41051OooO0OO);
    }
}
