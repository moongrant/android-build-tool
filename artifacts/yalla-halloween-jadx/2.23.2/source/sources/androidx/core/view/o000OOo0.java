package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<View> f5454OooO00o;

    @RequiresApi(19)
    public static class OooO00o {
        @DoNotInline
        public static ViewPropertyAnimator OooO00o(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public o000OOo0(View view) {
        this.f5454OooO00o = new WeakReference<>(view);
    }

    @NonNull
    public final void OooO00o(float f) {
        View view = this.f5454OooO00o.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void OooO0O0() {
        View view = this.f5454OooO00o.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @NonNull
    public final void OooO0OO(long j) {
        View view = this.f5454OooO00o.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    @NonNull
    public final void OooO0Oo(@Nullable o00 o00Var) {
        View view = this.f5454OooO00o.get();
        if (view != null) {
            if (o00Var != null) {
                view.animate().setListener(new o000OO00(o00Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    @NonNull
    public final void OooO0o0(float f) {
        View view = this.f5454OooO00o.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
