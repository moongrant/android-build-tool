package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.o0O0O00 f7541OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f7542OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7543OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f7544OooO0oO;

    public OooOO0O(View view, ViewPropertyAnimator viewPropertyAnimator, OooOO0 oooOO1, RecyclerView.o0O0O00 o0o0o00) {
        this.f7544OooO0oO = oooOO1;
        this.f7541OooO0Oo = o0o0o00;
        this.f7543OooO0o0 = viewPropertyAnimator;
        this.f7542OooO0o = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7543OooO0o0.setListener(null);
        this.f7542OooO0o.setAlpha(1.0f);
        OooOO0 oooOO1 = this.f7544OooO0oO;
        RecyclerView.o0O0O00 o0o0o00 = this.f7541OooO0Oo;
        oooOO1.OooO0oo(o0o0o00);
        oooOO1.f7523OooOOo0.remove(o0o0o00);
        oooOO1.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7544OooO0oO.getClass();
    }
}
