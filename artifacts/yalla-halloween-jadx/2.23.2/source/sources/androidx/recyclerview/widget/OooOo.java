package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.OooO0o f10649OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f10650OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10651OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f10652OooO0oO;

    public OooOo(OooOO0O oooOO0O, OooOO0O.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f10652OooO0oO = oooOO0O;
        this.f10649OooO0Oo = oooO0o;
        this.f10651OooO0o0 = viewPropertyAnimator;
        this.f10650OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10651OooO0o0.setListener(null);
        View view = this.f10650OooO0o;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        OooOO0O.OooO0o oooO0o = this.f10649OooO0Oo;
        RecyclerView.o0O0O00 o0o0o00 = oooO0o.f10630OooO0O0;
        OooOO0O oooOO0O = this.f10652OooO0oO;
        oooOO0O.OooO0oo(o0o0o00);
        oooOO0O.f10616OooOOo.remove(oooO0o.f10630OooO0O0);
        oooOO0O.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.o0O0O00 o0o0o00 = this.f10649OooO0Oo.f10630OooO0O0;
        this.f10652OooO0oO.getClass();
    }
}
