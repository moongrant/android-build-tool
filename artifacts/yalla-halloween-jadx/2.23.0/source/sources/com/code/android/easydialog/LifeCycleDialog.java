package com.code.android.easydialog;

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
public class LifeCycleDialog extends Dialog implements LifecycleOwner {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f10128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LifecycleEventObserver f10129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final WeakReference<Lifecycle> f10130OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f10131OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeCycleDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.f10128OooO0Oo = lifecycleRegistry;
        Intrinsics.checkNotNull(OooO00o(context));
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        final OooOOO0 oooOOO0 = (OooOOO0) this;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.code.android.easydialog.LifeCycleDialog.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
                Lifecycle lifecycle;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                LifeCycleDialog lifeCycleDialog = oooOOO0;
                if (lifeCycleDialog.isShowing()) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifeCycleDialog.cancel();
                    }
                    lifeCycleDialog.f10128OooO0Oo.handleLifecycleEvent(event);
                }
                Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
                if (event != event2 || lifeCycleDialog.f10131OooO0oO) {
                    return;
                }
                LifecycleRegistry lifecycleRegistry2 = lifeCycleDialog.f10128OooO0Oo;
                if (lifecycleRegistry2.getState() != Lifecycle.State.DESTROYED) {
                    lifecycleRegistry2.handleLifecycleEvent(event2);
                }
                Object context2 = lifeCycleDialog.getContext();
                LifecycleOwner lifecycleOwner2 = context2 instanceof LifecycleOwner ? (LifecycleOwner) context2 : null;
                if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle.removeObserver(lifeCycleDialog.f10129OooO0o);
                }
                WeakReference<Lifecycle> weakReference = lifeCycleDialog.f10130OooO0o0;
                if (weakReference != null) {
                    weakReference.clear();
                }
                lifeCycleDialog.f10131OooO0oO = true;
            }
        };
        this.f10129OooO0o = lifecycleEventObserver;
        ComponentCallbacks2 componentCallbacks2OooO00o = OooO00o(context);
        LifecycleOwner lifecycleOwner = componentCallbacks2OooO00o instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2OooO00o : null;
        if (lifecycleOwner != null) {
            WeakReference<Lifecycle> weakReference = new WeakReference<>(lifecycleOwner.getLifecycle());
            this.f10130OooO0o0 = weakReference;
            Lifecycle lifecycle = weakReference.get();
            if (lifecycle != null) {
                lifecycle.addObserver(lifecycleEventObserver);
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
            Intrinsics.checkNotNullExpressionValue(context, "c.baseContext");
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
        LifecycleRegistry lifecycleRegistry = this.f10128OooO0Oo;
        lifecycleRegistry.handleLifecycleEvent(event);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return this.f10128OooO0Oo;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (this.f10131OooO0oO) {
            throw new IllegalStateException("Dialog finish released can not be show again, please create new dialog ");
        }
        super.show();
        this.f10128OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }
}
