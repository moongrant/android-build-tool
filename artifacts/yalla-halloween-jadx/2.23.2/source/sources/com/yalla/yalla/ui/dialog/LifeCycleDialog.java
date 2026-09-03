package com.yalla.yalla.ui.dialog;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.yalla.yalla.mixedroom.room_bottom.DefaultLifeCycleObserver;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "使用compose dialog")
public class LifeCycleDialog extends Dialog implements LifecycleOwner {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f27379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final AnonymousClass1 f27380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final WeakReference<Lifecycle> f27381OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f27382OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.yalla.yalla.ui.dialog.LifeCycleDialog$1] */
    public LifeCycleDialog(@NotNull Context context, int i) {
        Activity activity;
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.f27379OooO0Oo = lifecycleRegistry;
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.f27380OooO0o = new DefaultLifeCycleObserver() { // from class: com.yalla.yalla.ui.dialog.LifeCycleDialog.1
            @Override // com.yalla.yalla.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onDestroy() {
                Lifecycle lifecycle;
                LifeCycleDialog lifeCycleDialog = LifeCycleDialog.this;
                boolean zIsShowing = lifeCycleDialog.isShowing();
                LifecycleRegistry lifecycleRegistry2 = lifeCycleDialog.f27379OooO0Oo;
                if (zIsShowing) {
                    lifeCycleDialog.dismiss();
                    lifecycleRegistry2.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                }
                if (lifecycleRegistry2.getState() != Lifecycle.State.DESTROYED) {
                    lifecycleRegistry2.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                }
                WeakReference<Lifecycle> weakReference = lifeCycleDialog.f27381OooO0o0;
                if (weakReference != null) {
                    weakReference.clear();
                }
                Object context2 = lifeCycleDialog.getContext();
                LifecycleOwner lifecycleOwner = context2 instanceof LifecycleOwner ? (LifecycleOwner) context2 : null;
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.removeObserver(lifeCycleDialog.f27380OooO0o);
                }
                lifeCycleDialog.f27382OooO0oO = true;
            }

            @Override // com.yalla.yalla.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onPause() {
                LifeCycleDialog lifeCycleDialog = LifeCycleDialog.this;
                if (lifeCycleDialog.isShowing()) {
                    lifeCycleDialog.f27379OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                }
            }

            @Override // com.yalla.yalla.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onResume() {
                LifeCycleDialog lifeCycleDialog = LifeCycleDialog.this;
                if (lifeCycleDialog.isShowing()) {
                    lifeCycleDialog.f27379OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                }
            }

            @Override // com.yalla.yalla.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onStart() {
                LifeCycleDialog lifeCycleDialog = LifeCycleDialog.this;
                if (lifeCycleDialog.isShowing()) {
                    lifeCycleDialog.f27379OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_START);
                }
            }

            @Override // com.yalla.yalla.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onStop() {
                LifeCycleDialog lifeCycleDialog = LifeCycleDialog.this;
                if (lifeCycleDialog.isShowing()) {
                    lifeCycleDialog.f27379OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                }
            }
        };
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            if ((context instanceof Application) || (context instanceof Service)) {
                activity = null;
                break;
            }
            while (true) {
                if (context == null || !(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
            }
        }
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        if (lifecycleOwner != null) {
            WeakReference<Lifecycle> weakReference = new WeakReference<>(lifecycleOwner.getLifecycle());
            this.f27381OooO0o0 = weakReference;
            Lifecycle lifecycle = weakReference.get();
            if (lifecycle != null) {
                lifecycle.addObserver(this.f27380OooO0o);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        Lifecycle.Event event = Lifecycle.Event.ON_PAUSE;
        LifecycleRegistry lifecycleRegistry = this.f27379OooO0Oo;
        lifecycleRegistry.handleLifecycleEvent(event);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return this.f27379OooO0Oo;
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.f27382OooO0oO) {
            throw new IllegalStateException("Dialog finish released can not be show again, please create new dialog ");
        }
        super.show();
        this.f27379OooO0Oo.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }
}
