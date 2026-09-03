package p250o00oo0oO;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class o000O00O extends Dialog implements LifecycleOwner {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f34205Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f34206Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public WeakReference<Lifecycle> f34207Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000O00 f34208Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.LifecycleObserver, o00oo0oO.o000O00] */
    public o000O00O(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.f34206Oooo0o = lifecycleRegistry;
        Intrinsics.checkNotNull(OooO00o(context));
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ?? r3 = new LifecycleEventObserver() { // from class: o00oo0oO.o000O00
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                o000O00O this$0 = this.f34198Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (this$0.isShowing()) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this$0.cancel();
                    }
                    this$0.f34206Oooo0o.handleLifecycleEvent(event);
                }
                Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
                if (event != event2 || this$0.f34205Oooo) {
                    return;
                }
                if (this$0.f34206Oooo0o.getCurrentState() != Lifecycle.State.DESTROYED) {
                    this$0.f34206Oooo0o.handleLifecycleEvent(event2);
                }
                Object context2 = this$0.getContext();
                LifecycleOwner lifecycleOwner2 = context2 instanceof LifecycleOwner ? (LifecycleOwner) context2 : null;
                if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle.removeObserver(this$0.f34208Oooo0oo);
                }
                WeakReference<Lifecycle> weakReference = this$0.f34207Oooo0oO;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this$0.f34205Oooo = true;
            }
        };
        this.f34208Oooo0oo = r3;
        ComponentCallbacks2 componentCallbacks2OooO00o = OooO00o(context);
        LifecycleOwner lifecycleOwner = componentCallbacks2OooO00o instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2OooO00o : null;
        if (lifecycleOwner != null) {
            WeakReference<Lifecycle> weakReference = new WeakReference<>(lifecycleOwner.getLifecycle());
            this.f34207Oooo0oO = weakReference;
            Lifecycle lifecycle = weakReference.get();
            if (lifecycle != 0) {
                lifecycle.addObserver(r3);
            }
        }
    }

    public final Activity OooO00o(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof Application) && !(context instanceof Service)) {
            while (context != null && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context, "c.baseContext");
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
        }
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.f34206Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.f34206Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return this.f34206Oooo0o;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (this.f34205Oooo) {
            throw new IllegalStateException("Dialog finish released can not be show again, please create new dialog ");
        }
        super.show();
        this.f34206Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }
}
