package p347o0OOOOoo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f43675OooO0Oo;

    public Oooo000(View view) {
        this.f43675OooO0Oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f43675OooO0Oo;
        view.setVisibility(4);
        view.setAlpha(1.0f);
    }
}
