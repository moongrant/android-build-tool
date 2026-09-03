package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f10639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f10640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10641OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f10642OooO0oO;

    public OooOOO0(View view, ViewPropertyAnimator viewPropertyAnimator, OooOO0O oooOO0O, RecyclerView.o0O0O00 o0o0o00) {
        this.f10642OooO0oO = oooOO0O;
        this.f10639OooO0Oo = o0o0o00;
        this.f10641OooO0o0 = viewPropertyAnimator;
        this.f10640OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10641OooO0o0.setListener(null);
        this.f10640OooO0o.setAlpha(1.0f);
        OooOO0O oooOO0O = this.f10642OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f10639OooO0Oo;
        oooOO0O.OooO0oo(o0o0o00);
        oooOO0O.f10617OooOOo0.remove(o0o0o00);
        oooOO0O.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10642OooO0oO.getClass();
    }
}
