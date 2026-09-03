package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f8933Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f8934Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f8935Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f8936Oooo0oo;

    public OooOOO0(OooOO0 oooOO1, RecyclerView.oo0o0Oo oo0o0oo, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f8933Oooo = oooOO1;
        this.f8934Oooo0o = oo0o0oo;
        this.f8935Oooo0oO = view;
        this.f8936Oooo0oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f8935Oooo0oO.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8936Oooo0oo.setListener(null);
        this.f8933Oooo.OooO0oo(this.f8934Oooo0o);
        this.f8933Oooo.f8902OooOOOO.remove(this.f8934Oooo0o);
        this.f8933Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f8933Oooo);
    }
}
