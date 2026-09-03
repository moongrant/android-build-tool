package o0OO0o00;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends LifecycleCallback {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final List<WeakReference<o00Ooo<?>>> f37963Oooo0oO;

    public o0Oo0oo(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f37963Oooo0oO = new ArrayList();
        lifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static o0Oo0oo OooO0O0(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) fragment.getCallbackOrNull("TaskOnStopCallback", o0Oo0oo.class);
        return o0oo0oo2 == null ? new o0Oo0oo(fragment) : o0oo0oo2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T> void OooO0OO(o00Ooo<T> o00ooo2) {
        synchronized (this.f37963Oooo0oO) {
            this.f37963Oooo0oO.add(new WeakReference<>(o00ooo2));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<o0OO0o00.o00Ooo<?>>>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.ref.WeakReference<o0OO0o00.o00Ooo<?>>>] */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        synchronized (this.f37963Oooo0oO) {
            Iterator it = this.f37963Oooo0oO.iterator();
            while (it.hasNext()) {
                o00Ooo o00ooo2 = (o00Ooo) ((WeakReference) it.next()).get();
                if (o00ooo2 != null) {
                    o00ooo2.zzc();
                }
            }
            this.f37963Oooo0oO.clear();
        }
    }
}
