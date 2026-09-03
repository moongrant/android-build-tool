package p279o0O00o0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f41825OooO0Oo;

    public OooOOOO(BaseTransientBottomBar baseTransientBottomBar) {
        this.f41825OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f41825OooO0Oo.OooO0Oo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f41825OooO0Oo;
        o0OoOo0 o0oooo0 = baseTransientBottomBar.f17798OooOO0;
        int i = baseTransientBottomBar.f17792OooO0OO;
        int i2 = baseTransientBottomBar.f17790OooO00o;
        int i3 = i - i2;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) o0oooo0;
        snackbarContentLayout.f17843OooO0Oo.setAlpha(0.0f);
        long j = i2;
        ViewPropertyAnimator duration = snackbarContentLayout.f17843OooO0Oo.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f17844OooO0o;
        long j2 = i3;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.f17845OooO0o0.getVisibility() == 0) {
            snackbarContentLayout.f17845OooO0o0.setAlpha(0.0f);
            snackbarContentLayout.f17845OooO0o0.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
