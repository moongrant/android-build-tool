package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f7545OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f7546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f7547OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f7548OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f7549OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7550OooO0oo;

    public OooOOO(OooOO0 oooOO1, RecyclerView.o0O0O00 o0o0o00, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7545OooO = oooOO1;
        this.f7546OooO0Oo = o0o0o00;
        this.f7548OooO0o0 = i;
        this.f7547OooO0o = view;
        this.f7549OooO0oO = i2;
        this.f7550OooO0oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f7548OooO0o0;
        View view = this.f7547OooO0o;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7549OooO0oO != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7550OooO0oo.setListener(null);
        OooOO0 oooOO1 = this.f7545OooO;
        RecyclerView.o0O0O00 o0o0o00 = this.f7546OooO0Oo;
        oooOO1.OooO0oo(o0o0o00);
        oooOO1.f7521OooOOOo.remove(o0o0o00);
        oooOO1.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7545OooO.getClass();
    }
}
