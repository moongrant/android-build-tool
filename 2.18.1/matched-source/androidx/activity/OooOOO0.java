package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p091o000o00o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO0 extends Dialog implements LifecycleOwner, OooOOOO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public LifecycleRegistry f4329Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OnBackPressedDispatcher f4330Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OooOOO0(@NotNull Context context, @StyleRes int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f4330Oooo0oO = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.OooOO0O
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        OooOOO0.OooO0O0((OooOOO0) this);
                        return;
                    default:
                        o00000O0 o00000o1 = (o00000O0) this;
                        synchronized (o00000o1) {
                            o00000o1.f29132OooO0o = false;
                            o00000O0.OooO0O0 oooO0O0 = o00000o1.f29135OooO0oo;
                            synchronized (oooO0O0) {
                                Arrays.fill(oooO0O0.f29143OooO0O0, false);
                                oooO0O0.f29145OooO0Oo = true;
                                break;
                            }
                        }
                        return;
                }
            }
        });
    }

    public static void OooO0O0(OooOOO0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    public final void OooO0o() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        ViewTreeLifecycleOwner.set(window.getDecorView(), this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView.setTag(OooOo00.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final LifecycleRegistry OooO0o0() {
        LifecycleRegistry lifecycleRegistry = this.f4329Oooo0o;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.f4329Oooo0o = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0o();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return OooO0o0();
    }

    @Override // androidx.activity.OooOOOO
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f4330Oooo0oO;
    }

    @Override // android.app.Dialog
    @CallSuper
    public final void onBackPressed() {
        this.f4330Oooo0oO.OooO0O0();
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        OooO0o0().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStart() {
        super.onStart();
        OooO0o0().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStop() {
        OooO0o0().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.f4329Oooo0o = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        OooO0o();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0o();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0o();
        super.setContentView(view, layoutParams);
    }
}
