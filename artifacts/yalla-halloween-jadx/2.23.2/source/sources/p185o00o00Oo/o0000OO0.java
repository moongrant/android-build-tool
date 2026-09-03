package p185o00o00Oo;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "使用compose dialog")
public class o0000OO0 extends Dialog implements LifecycleOwner {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f38482OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0000O f38483OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final WeakReference<Lifecycle> f38484OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f38485OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LifecycleObserver, o00o00Oo.o0000O] */
    public o0000OO0(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.f38482OooO0Oo = lifecycleRegistry;
        Intrinsics.checkNotNull(OooO00o(context));
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        final o000OO o000oo2 = (o000OO) this;
        ?? r3 = new LifecycleEventObserver() { // from class: o00o00Oo.o0000O
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                o0000OO0 this$0 = o000oo2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                boolean zIsShowing = this$0.isShowing();
                LifecycleRegistry lifecycleRegistry2 = this$0.f38482OooO0Oo;
                if (zIsShowing) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this$0.cancel();
                    }
                    lifecycleRegistry2.handleLifecycleEvent(event);
                }
                Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
                if (event != event2 || this$0.f38485OooO0oO) {
                    return;
                }
                if (lifecycleRegistry2.getState() != Lifecycle.State.DESTROYED) {
                    lifecycleRegistry2.handleLifecycleEvent(event2);
                }
                Object context2 = this$0.getContext();
                LifecycleOwner lifecycleOwner2 = context2 instanceof LifecycleOwner ? (LifecycleOwner) context2 : null;
                if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle.removeObserver(this$0.f38483OooO0o);
                }
                WeakReference<Lifecycle> weakReference = this$0.f38484OooO0o0;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this$0.f38485OooO0oO = true;
            }
        };
        this.f38483OooO0o = r3;
        ComponentCallbacks2 componentCallbacks2OooO00o = OooO00o(context);
        LifecycleOwner lifecycleOwner = componentCallbacks2OooO00o instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2OooO00o : null;
        if (lifecycleOwner != null) {
            WeakReference<Lifecycle> weakReference = new WeakReference<>(lifecycleOwner.getLifecycle());
            this.f38484OooO0o0 = weakReference;
            Lifecycle lifecycle = weakReference.get();
            if (lifecycle != 0) {
                lifecycle.addObserver(r3);
            }
        }
    }

    public static Activity OooO00o(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if ((context instanceof Application) || (context instanceof Service)) {
            return null;
        }
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        Lifecycle.Event event = Lifecycle.Event.ON_PAUSE;
        LifecycleRegistry lifecycleRegistry = this.f38482OooO0Oo;
        lifecycleRegistry.handleLifecycleEvent(event);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return this.f38482OooO0Oo;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (this.f38485OooO0oO) {
            throw new IllegalStateException("Dialog finish released can not be show again, please create new dialog ");
        }
        super.show();
        this.f38482OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }
}
