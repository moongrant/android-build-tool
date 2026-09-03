package o0O0000O;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends LifecycleCallback {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f40959OooO0o0;

    public oo0o0Oo(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f40959OooO0o0 = new ArrayList();
        lifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static oo0o0Oo OooO0O0(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        oo0o0Oo oo0o0oo = (oo0o0Oo) fragment.getCallbackOrNull("TaskOnStopCallback", oo0o0Oo.class);
        return oo0o0oo == null ? new oo0o0Oo(fragment) : oo0o0oo;
    }

    public final void OooO0OO(o00oO0o o00oo0o2) {
        synchronized (this.f40959OooO0o0) {
            this.f40959OooO0o0.add(new WeakReference(o00oo0o2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        synchronized (this.f40959OooO0o0) {
            Iterator it = this.f40959OooO0o0.iterator();
            while (it.hasNext()) {
                o00oO0o o00oo0o2 = (o00oO0o) ((WeakReference) it.next()).get();
                if (o00oo0o2 != null) {
                    o00oo0o2.zzc();
                }
            }
            this.f40959OooO0o0.clear();
        }
    }
}
