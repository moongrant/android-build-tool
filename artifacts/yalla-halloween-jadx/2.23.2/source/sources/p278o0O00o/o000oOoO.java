package p278o0O00o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f41043OooO0Oo;

    public o000oOoO(BaseTransientBottomBar baseTransientBottomBar) {
        this.f41043OooO0Oo = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f41043OooO0Oo.OooO0Oo();
    }
}
