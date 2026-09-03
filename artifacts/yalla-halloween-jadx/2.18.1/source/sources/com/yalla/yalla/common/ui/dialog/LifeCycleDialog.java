package com.yalla.yalla.common.ui.dialog;

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
import com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public class LifeCycleDialog extends Dialog implements LifecycleOwner {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f20873Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f20874Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public WeakReference<Lifecycle> f20875Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final AnonymousClass1 f20876Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.yalla.yalla.common.ui.dialog.LifeCycleDialog$1] */
    public LifeCycleDialog(@NotNull Context context, int i) {
        Activity activity;
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.f20874Oooo0o = lifecycleRegistry;
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.f20876Oooo0oo = new DefaultLifeCycleObserver() { // from class: com.yalla.yalla.common.ui.dialog.LifeCycleDialog.1
            @Override // com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onDestroy() {
                Lifecycle lifecycle;
                if (LifeCycleDialog.this.isShowing()) {
                    LifeCycleDialog.this.dismiss();
                    LifeCycleDialog.this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                }
                LifeCycleDialog lifeCycleDialog = LifeCycleDialog.this;
                if (lifeCycleDialog.f20874Oooo0o.getCurrentState() != Lifecycle.State.DESTROYED) {
                    lifeCycleDialog.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                }
                WeakReference<Lifecycle> weakReference = lifeCycleDialog.f20875Oooo0oO;
                if (weakReference != null) {
                    weakReference.clear();
                }
                Object context2 = lifeCycleDialog.getContext();
                LifecycleOwner lifecycleOwner = context2 instanceof LifecycleOwner ? (LifecycleOwner) context2 : null;
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.removeObserver(lifeCycleDialog.f20876Oooo0oo);
                }
                lifeCycleDialog.f20873Oooo = true;
            }

            @Override // com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onPause() {
                if (LifeCycleDialog.this.isShowing()) {
                    LifeCycleDialog.this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                }
            }

            @Override // com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onResume() {
                if (LifeCycleDialog.this.isShowing()) {
                    LifeCycleDialog.this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                }
            }

            @Override // com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onStart() {
                if (LifeCycleDialog.this.isShowing()) {
                    LifeCycleDialog.this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_START);
                }
            }

            @Override // com.app.base.mixedroom.room_bottom.DefaultLifeCycleObserver
            public final void onStop() {
                if (LifeCycleDialog.this.isShowing()) {
                    LifeCycleDialog.this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
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
                Intrinsics.checkNotNullExpressionValue(context, "c.baseContext");
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
            }
        }
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        if (lifecycleOwner != null) {
            WeakReference<Lifecycle> weakReference = new WeakReference<>(lifecycleOwner.getLifecycle());
            this.f20875Oooo0oO = weakReference;
            Lifecycle lifecycle = weakReference.get();
            if (lifecycle != null) {
                lifecycle.addObserver(this.f20876Oooo0oo);
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
        this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return this.f20874Oooo0o;
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.f20873Oooo) {
            throw new IllegalStateException("Dialog finish released can not be show again, please create new dialog ");
        }
        super.show();
        this.f20874Oooo0o.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }
}
