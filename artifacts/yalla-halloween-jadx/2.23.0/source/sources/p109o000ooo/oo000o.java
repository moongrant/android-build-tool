package p109o000ooo;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends Lifecycle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo000o f35893OooO00o = new oo000o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f35894OooO0O0 = new o00Ooo();

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(@NotNull LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        o00Ooo o00ooo2 = f35894OooO0O0;
        defaultLifecycleObserver.onCreate(o00ooo2);
        defaultLifecycleObserver.onStart(o00ooo2);
        defaultLifecycleObserver.onResume(o00ooo2);
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
