package p256o00ooOO0;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting(otherwise = 2)
public final class o00O0000 extends LifecycleCallback {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f40270OooO0o0;

    public o00O0000(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f40270OooO0o0 = new ArrayList();
        lifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @MainThread
    public final void onStop() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = this.f40270OooO0o0;
            this.f40270OooO0o0 = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
