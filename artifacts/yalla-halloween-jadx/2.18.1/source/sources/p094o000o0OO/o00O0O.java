package p094o000o0OO;

import OooO00o.OooO00o;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f29284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f29285OooO0O0 = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f29286OooO0OO;

    public o00O0O(o00Oo0 o00oo1) {
        this.f29284OooO00o = o00oo1;
    }

    @JvmStatic
    @NotNull
    public static final o00O0O OooO00o(@NotNull o00Oo0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new o00O0O(owner);
    }

    @MainThread
    public final void OooO0O0() {
        Lifecycle lifecycle = this.f29284OooO00o.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "owner.lifecycle");
        if (!(lifecycle.getCurrentState() == Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new Recreator(this.f29284OooO00o));
        final o0OoOo0 o0oooo1 = this.f29285OooO0O0;
        Objects.requireNonNull(o0oooo1);
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!(!o0oooo1.f29290OooO0O0)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: o000o0OO.o000oOoO
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                o0OoOo0 this$0 = o0oooo1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_START) {
                    this$0.f29293OooO0o = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    this$0.f29293OooO0o = false;
                }
            }
        });
        o0oooo1.f29290OooO0O0 = true;
        this.f29286OooO0OO = true;
    }

    @MainThread
    public final void OooO0OO(@Nullable Bundle bundle) {
        if (!this.f29286OooO0OO) {
            OooO0O0();
        }
        Lifecycle lifecycle = this.f29284OooO00o.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "owner.lifecycle");
        if (!(!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED))) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("performRestore cannot be called when owner is ");
            sbOooO0o0.append(lifecycle.getCurrentState());
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        o0OoOo0 o0oooo1 = this.f29285OooO0O0;
        if (!o0oooo1.f29290OooO0O0) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!o0oooo1.f29292OooO0Oo)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        o0oooo1.f29291OooO0OO = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        o0oooo1.f29292OooO0Oo = true;
    }

    @MainThread
    public final void OooO0Oo(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        o0OoOo0 o0oooo1 = this.f29285OooO0O0;
        Objects.requireNonNull(o0oooo1);
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = o0oooo1.f29291OooO0OO;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, o0OoOo0.OooO0O0>.IteratorWithAdditions iteratorWithAdditions = o0oooo1.f29289OooO00o.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry next = iteratorWithAdditions.next();
            bundle.putBundle((String) next.getKey(), ((o0OoOo0.OooO0O0) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
