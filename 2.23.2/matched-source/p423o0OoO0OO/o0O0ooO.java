package p423o0OoO0OO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0ooO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46717OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46718OooO0o0;

    public /* synthetic */ o0O0ooO(Object obj, int i) {
        this.f46717OooO0Oo = i;
        this.f46718OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46717OooO0Oo;
        Object obj2 = this.f46718OooO0o0;
        switch (i) {
            case 0:
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserveSticky.<no name provided>.invokeSuspend$lambda$0");
                ((Observer) obj2).onChanged(obj);
                break;
            default:
                MainMomentFragment.initObserver$lambda$10((MainMomentFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
