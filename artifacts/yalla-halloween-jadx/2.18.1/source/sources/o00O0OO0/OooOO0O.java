package o00O0OO0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lifecycle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f30581OooO00o = new OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f30582OooO0O0 = OooOO0.f30580Oooo0o;

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(@NotNull LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!(observer instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) observer;
        OooOO0 oooOO1 = f30582OooO0O0;
        defaultLifecycleObserver.onCreate(oooOO1);
        defaultLifecycleObserver.onStart(oooOO1);
        defaultLifecycleObserver.onResume(oooOO1);
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public final Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(@NotNull LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    @NotNull
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
