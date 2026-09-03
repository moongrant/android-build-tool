package p438o0OoOOo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f40101Oooo0o;

    public o0000O0(View view) {
        this.f40101Oooo0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f40101Oooo0o.setVisibility(4);
        this.f40101Oooo0o.setAlpha(1.0f);
    }
}
