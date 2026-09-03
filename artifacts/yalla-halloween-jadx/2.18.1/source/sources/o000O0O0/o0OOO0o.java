package o000O0O0;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final View f28131Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ViewTreeObserver f28132Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Runnable f28133Oooo0oo;

    public o0OOO0o(View view, Runnable runnable) {
        this.f28131Oooo0o = view;
        this.f28132Oooo0oO = view.getViewTreeObserver();
        this.f28133Oooo0oo = runnable;
    }

    @NonNull
    public static o0OOO0o OooO00o(@NonNull View view, @NonNull Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        o0OOO0o o0ooo0o2 = new o0OOO0o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(o0ooo0o2);
        view.addOnAttachStateChangeListener(o0ooo0o2);
        return o0ooo0o2;
    }

    public final void OooO0O0() {
        if (this.f28132Oooo0oO.isAlive()) {
            this.f28132Oooo0oO.removeOnPreDrawListener(this);
        } else {
            this.f28131Oooo0o.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f28131Oooo0o.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        OooO0O0();
        this.f28133Oooo0oo.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        this.f28132Oooo0oO = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NonNull View view) {
        OooO0O0();
    }
}
