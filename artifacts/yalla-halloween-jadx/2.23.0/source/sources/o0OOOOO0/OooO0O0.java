package o0OOOOO0;

import android.app.Activity;
import com.twitter.sdk.android.core.o00Oo0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<OooO00o> f43646OooO00o = new AtomicReference<>(null);

    public final boolean OooO00o(Activity activity, OooO00o oooO00o) {
        AtomicReference<OooO00o> atomicReference = this.f43646OooO00o;
        boolean z = true;
        if (atomicReference.get() != null) {
            o00Oo0.OooO0OO().OooO0OO("Authorize already in progress");
            return false;
        }
        if (!oooO00o.OooO00o(activity)) {
            return false;
        }
        while (!atomicReference.compareAndSet(null, oooO00o)) {
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (!z) {
            o00Oo0.OooO0OO().OooO0OO("Failed to update authHandler, authorize already in progress.");
        }
        return z;
    }
}
