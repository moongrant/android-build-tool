package p348o0OOO0oO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f38180Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f38181Oooo0oO;

    public OooO(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f38181Oooo0oO = baseTransientBottomBar;
        this.f38180Oooo0o = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38181Oooo0oO.OooO0o0();
    }
}
