package p260o00ooo0;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 implements OnDelegateCreatedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f41061OooO00o;

    public o0OoOo0(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f41061OooO00o = deferredLifecycleHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper deferredLifecycleHelper = this.f41061OooO00o;
        deferredLifecycleHelper.f15310OooO00o = lifecycleDelegate;
        Iterator<o0OOO0o> it = deferredLifecycleHelper.f15312OooO0OO.iterator();
        while (it.hasNext()) {
            it.next().zab();
        }
        deferredLifecycleHelper.f15312OooO0OO.clear();
        deferredLifecycleHelper.f15311OooO0O0 = null;
    }
}
