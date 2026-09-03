package p331o0O0oooO;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting(otherwise = 2)
public final class o0 extends LifecycleCallback {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<Runnable> f37069Oooo0oO;

    public o0(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f37069Oooo0oO = new ArrayList();
        lifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<java.lang.Runnable>] */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        ?? r0;
        synchronized (this) {
            r0 = this.f37069Oooo0oO;
            this.f37069Oooo0oO = new ArrayList();
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
