package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Runnable f5439OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList<o0OOO0o> f5440OooO0O0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f5441OooO0OO = new HashMap();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Lifecycle f5442OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public LifecycleEventObserver f5443OooO0O0;

        public OooO00o(@NonNull Lifecycle lifecycle, @NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.f5442OooO00o = lifecycle;
            this.f5443OooO0O0 = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }

    public o00oO0o(@NonNull Runnable runnable) {
        this.f5439OooO00o = runnable;
    }

    public final void OooO00o(@NonNull o0OOO0o o0ooo0o2) {
        this.f5440OooO0O0.remove(o0ooo0o2);
        OooO00o oooO00o = (OooO00o) this.f5441OooO0OO.remove(o0ooo0o2);
        if (oooO00o != null) {
            oooO00o.f5442OooO00o.removeObserver(oooO00o.f5443OooO0O0);
            oooO00o.f5443OooO0O0 = null;
        }
        this.f5439OooO00o.run();
    }
}
