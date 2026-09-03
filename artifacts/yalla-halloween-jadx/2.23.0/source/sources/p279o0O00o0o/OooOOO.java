package p279o0O00o0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f41824OooO0Oo;

    public OooOOO(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f41824OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f41824OooO0Oo.OooO0OO();
    }
}
