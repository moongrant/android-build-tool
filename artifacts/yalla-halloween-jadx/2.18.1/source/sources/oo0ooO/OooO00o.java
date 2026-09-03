package oo0ooO;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OnDelegateCreatedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f53424OooO00o;

    public OooO00o(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f53424OooO00o = deferredLifecycleHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper deferredLifecycleHelper = this.f53424OooO00o;
        deferredLifecycleHelper.f15817OooO00o = lifecycleDelegate;
        for (OooOOO0 oooOOO0 : deferredLifecycleHelper.f15819OooO0OO) {
            T t = this.f53424OooO00o.f15817OooO00o;
            oooOOO0.zab();
        }
        this.f53424OooO00o.f15819OooO0OO.clear();
        this.f53424OooO00o.f15818OooO0O0 = null;
    }
}
