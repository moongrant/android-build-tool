package p133o00OO00o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f31281Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f31282Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f31283Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f31284Oooo0oo;

    public o00Oo0(o0OoOo0 o0oooo1, RecyclerView.oo0o0Oo oo0o0oo, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31281Oooo = o0oooo1;
        this.f31282Oooo0o = oo0o0oo;
        this.f31283Oooo0oO = view;
        this.f31284Oooo0oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f31283Oooo0oO.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31284Oooo0oo.setListener(null);
        this.f31281Oooo.OooO0oo(this.f31282Oooo0o);
        this.f31281Oooo.f31319OooOO0O.remove(this.f31282Oooo0o);
        this.f31281Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f31281Oooo);
    }
}
