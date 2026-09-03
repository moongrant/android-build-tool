package p262o00ooo0;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements OnDelegateCreatedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f40393OooO00o;

    public o000OOo(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f40393OooO00o = deferredLifecycleHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper deferredLifecycleHelper = this.f40393OooO00o;
        deferredLifecycleHelper.f14834OooO00o = lifecycleDelegate;
        Iterator<o0000Ooo> it = deferredLifecycleHelper.f14836OooO0OO.iterator();
        while (it.hasNext()) {
            it.next().zab();
        }
        deferredLifecycleHelper.f14836OooO0OO.clear();
        deferredLifecycleHelper.f14835OooO0O0 = null;
    }
}
