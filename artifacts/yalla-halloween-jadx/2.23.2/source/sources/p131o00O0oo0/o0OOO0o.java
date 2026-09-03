package p131o00O0oo0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends Lifecycle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f36853OooO00o = new o0OOO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0ooOOo f36854OooO0O0 = new o0ooOOo();

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(@NotNull LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        o0ooOOo o0ooooo = f36854OooO0O0;
        defaultLifecycleObserver.onCreate(o0ooooo);
        defaultLifecycleObserver.onStart(o0ooooo);
        defaultLifecycleObserver.onResume(o0ooooo);
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public final Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(@NotNull LifecycleObserver lifecycleObserver) {
    }

    @NotNull
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
