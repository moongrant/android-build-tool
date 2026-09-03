package o000O0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<View> f28117OooO00o;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000OO f28118Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ View f28119Oooo0oO;

        public OooO00o(o00000OO o00000oo2, View view) {
            this.f28118Oooo0o = o00000oo2;
            this.f28119Oooo0oO = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f28118Oooo0o.OooO0OO(this.f28119Oooo0oO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f28118Oooo0o.OooO00o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f28118Oooo0o.OooO0O0();
        }
    }

    @RequiresApi(19)
    public static class OooO0O0 {
        @DoNotInline
        public static ViewPropertyAnimator OooO00o(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public o00000O(View view) {
        this.f28117OooO00o = new WeakReference<>(view);
    }

    @NonNull
    public final o00000O OooO00o(float f) {
        View view = this.f28117OooO00o.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final void OooO0O0() {
        View view = this.f28117OooO00o.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @NonNull
    public final o00000O OooO0OO(long j) {
        View view = this.f28117OooO00o.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @NonNull
    public final o00000O OooO0Oo(@Nullable o00000OO o00000oo2) {
        View view = this.f28117OooO00o.get();
        if (view != null) {
            OooO0o0(view, o00000oo2);
        }
        return this;
    }

    @NonNull
    public final o00000O OooO0o(@Nullable final o0000 o0000Var) {
        final View view = this.f28117OooO00o.get();
        if (view != null) {
            OooO0O0.OooO00o(view.animate(), o0000Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o000O0O0.o00000O0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ((View) ((androidx.appcompat.app.oo000o.OooO0OO) o0000Var).f4603OooO00o.f4580OooO0Oo.getParent()).invalidate();
                }
            } : null);
        }
        return this;
    }

    public final void OooO0o0(View view, o00000OO o00000oo2) {
        if (o00000oo2 != null) {
            view.animate().setListener(new OooO00o(o00000oo2, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public final o00000O OooO0oO(float f) {
        View view = this.f28117OooO00o.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
