package p260o00ooo0;

import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Bundle f41053OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f41054OooO0O0;

    public o00Oo0(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f41054OooO0O0 = deferredLifecycleHelper;
        this.f41053OooO00o = bundle;
    }

    @Override // p260o00ooo0.o0OOO0o
    public final int zaa() {
        return 1;
    }

    @Override // p260o00ooo0.o0OOO0o
    public final void zab() {
        this.f41054OooO0O0.f15310OooO00o.onCreate(this.f41053OooO00o);
    }
}
