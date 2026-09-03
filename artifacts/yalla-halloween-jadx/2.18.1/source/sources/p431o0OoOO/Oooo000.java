package p431o0OoOO;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<OooOo> f39908OooO00o = new AtomicReference<>(null);

    public final boolean OooO00o(Activity activity, OooOo oooOo) {
        boolean zCompareAndSet = false;
        if (this.f39908OooO00o.get() != null) {
            o0oO0Ooo.OooO0OO().OooO0Oo("Authorize already in progress");
        } else if (oooOo.OooO00o(activity) && !(zCompareAndSet = this.f39908OooO00o.compareAndSet(null, oooOo))) {
            o0oO0Ooo.OooO0OO().OooO0Oo("Failed to update authHandler, authorize already in progress.");
        }
        return zCompareAndSet;
    }
}
