package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f8923Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f8924Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f8925Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f8926Oooo0oo;

    public OooOO0O(OooOO0 oooOO1, RecyclerView.oo0o0Oo oo0o0oo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f8923Oooo = oooOO1;
        this.f8924Oooo0o = oo0o0oo;
        this.f8925Oooo0oO = viewPropertyAnimator;
        this.f8926Oooo0oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8925Oooo0oO.setListener(null);
        this.f8926Oooo0oo.setAlpha(1.0f);
        this.f8923Oooo.OooO0oo(this.f8924Oooo0o);
        this.f8923Oooo.f8905OooOOo0.remove(this.f8924Oooo0o);
        this.f8923Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f8923Oooo);
    }
}
