package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f10643OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f10644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f10645OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f10646OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f10647OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10648OooO0oo;

    public OooOOOO(OooOO0O oooOO0O, RecyclerView.o0O0O00 o0o0o00, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10643OooO = oooOO0O;
        this.f10644OooO0Oo = o0o0o00;
        this.f10646OooO0o0 = i;
        this.f10645OooO0o = view;
        this.f10647OooO0oO = i2;
        this.f10648OooO0oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f10646OooO0o0;
        View view = this.f10645OooO0o;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f10647OooO0oO != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10648OooO0oo.setListener(null);
        OooOO0O oooOO0O = this.f10643OooO;
        RecyclerView.o0O0O00 o0o0o00 = this.f10644OooO0Oo;
        oooOO0O.OooO0oo(o0o0o00);
        oooOO0O.f10615OooOOOo.remove(o0o0o00);
        oooOO0O.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10643OooO.getClass();
    }
}
