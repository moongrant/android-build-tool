package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0.OooO0o f7555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f7556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7557OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f7558OooO0oO;

    public OooOOOO(OooOO0 oooOO1, OooOO0.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7558OooO0oO = oooOO1;
        this.f7555OooO0Oo = oooO0o;
        this.f7557OooO0o0 = viewPropertyAnimator;
        this.f7556OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7557OooO0o0.setListener(null);
        View view = this.f7556OooO0o;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        OooOO0.OooO0o oooO0o = this.f7555OooO0Oo;
        RecyclerView.o0O0O00 o0o0o00 = oooO0o.f7535OooO00o;
        OooOO0 oooOO1 = this.f7558OooO0oO;
        oooOO1.OooO0oo(o0o0o00);
        oooOO1.f7522OooOOo.remove(oooO0o.f7535OooO00o);
        oooOO1.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.o0O0O00 o0o0o00 = this.f7555OooO0Oo.f7535OooO00o;
        this.f7558OooO0oO.getClass();
    }
}
