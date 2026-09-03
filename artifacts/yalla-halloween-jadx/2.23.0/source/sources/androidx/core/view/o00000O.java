package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f5415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Runnable f5416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ViewTreeObserver f5417OooO0o0;

    public o00000O(View view, Runnable runnable) {
        this.f5415OooO0Oo = view;
        this.f5417OooO0o0 = view.getViewTreeObserver();
        this.f5416OooO0o = runnable;
    }

    @NonNull
    public static void OooO00o(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        o00000O o00000o = new o00000O(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(o00000o);
        view.addOnAttachStateChangeListener(o00000o);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f5417OooO0o0.isAlive();
        View view = this.f5415OooO0Oo;
        if (zIsAlive) {
            this.f5417OooO0o0.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f5416OooO0o.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        this.f5417OooO0o0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NonNull View view) {
        boolean zIsAlive = this.f5417OooO0o0.isAlive();
        View view2 = this.f5415OooO0Oo;
        if (zIsAlive) {
            this.f5417OooO0o0.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
