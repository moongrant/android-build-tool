package p262o00ooo0;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O implements o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Bundle f40387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f40388OooO0O0;

    public o000000O(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f40388OooO0O0 = deferredLifecycleHelper;
        this.f40387OooO00o = bundle;
    }

    @Override // p262o00ooo0.o0000Ooo
    public final int zaa() {
        return 1;
    }

    @Override // p262o00ooo0.o0000Ooo
    public final void zab() {
        this.f40388OooO0O0.f14834OooO00o.onCreate(this.f40387OooO00o);
    }
}
