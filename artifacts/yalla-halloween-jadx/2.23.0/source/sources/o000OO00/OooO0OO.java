package o000OO00;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f34873OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final androidx.savedstate.OooO00o f34874OooO0O0 = new androidx.savedstate.OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f34875OooO0OO;

    public OooO0OO(OooO0o oooO0o) {
        this.f34873OooO00o = oooO0o;
    }

    @MainThread
    public final void OooO00o() {
        OooO0o oooO0o = this.f34873OooO00o;
        Lifecycle lifecycle = oooO0o.getLifecycle();
        if (!(lifecycle.getState() == Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new Recreator(oooO0o));
        final androidx.savedstate.OooO00o oooO00o = this.f34874OooO0O0;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!oooO00o.f7947OooO0O0)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: o000OO00.OooO0O0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                androidx.savedstate.OooO00o this$0 = oooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_START) {
                    this$0.f7950OooO0o = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    this$0.f7950OooO0o = false;
                }
            }
        });
        oooO00o.f7947OooO0O0 = true;
        this.f34875OooO0OO = true;
    }

    @MainThread
    public final void OooO0O0(@Nullable Bundle bundle) {
        if (!this.f34875OooO0OO) {
            OooO00o();
        }
        Lifecycle lifecycle = this.f34873OooO00o.getLifecycle();
        if (!(!lifecycle.getState().isAtLeast(Lifecycle.State.STARTED))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
        }
        androidx.savedstate.OooO00o oooO00o = this.f34874OooO0O0;
        if (!oooO00o.f7947OooO0O0) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!oooO00o.f7949OooO0Oo)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        oooO00o.f7948OooO0OO = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        oooO00o.f7949OooO0Oo = true;
    }

    @MainThread
    public final void OooO0OO(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        androidx.savedstate.OooO00o oooO00o = this.f34874OooO0O0;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = oooO00o.f7948OooO0OO;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, androidx.savedstate.OooO00o.OooO0O0>.IteratorWithAdditions iteratorWithAdditions = oooO00o.f7946OooO00o.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry next = iteratorWithAdditions.next();
            bundle.putBundle((String) next.getKey(), ((androidx.savedstate.OooO00o.OooO0O0) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
