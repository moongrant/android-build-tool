package p279o0O00o0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f41827OooO0Oo;

    public OooOo00(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f41827OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f41827OooO0Oo.OooO0OO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f41827OooO0Oo;
        o0OoOo0 o0oooo0 = baseTransientBottomBar.f17798OooOO0;
        int i = baseTransientBottomBar.f17791OooO0O0;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) o0oooo0;
        snackbarContentLayout.f17843OooO0Oo.setAlpha(1.0f);
        long j = i;
        ViewPropertyAnimator duration = snackbarContentLayout.f17843OooO0Oo.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f17844OooO0o;
        long j2 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.f17845OooO0o0.getVisibility() == 0) {
            snackbarContentLayout.f17845OooO0o0.setAlpha(1.0f);
            snackbarContentLayout.f17845OooO0o0.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
