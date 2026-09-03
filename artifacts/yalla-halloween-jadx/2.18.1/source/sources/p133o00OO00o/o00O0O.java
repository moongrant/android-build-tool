package p133o00OO00o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f31277Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f31278Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f31279Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f31280Oooo0oo;

    public o00O0O(o0OoOo0 o0oooo1, RecyclerView.oo0o0Oo oo0o0oo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31277Oooo = o0oooo1;
        this.f31278Oooo0o = oo0o0oo;
        this.f31279Oooo0oO = viewPropertyAnimator;
        this.f31280Oooo0oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31279Oooo0oO.setListener(null);
        this.f31280Oooo0oo.setAlpha(1.0f);
        this.f31277Oooo.OooO0oo(this.f31278Oooo0o);
        this.f31277Oooo.f31322OooOOO0.remove(this.f31278Oooo0o);
        this.f31277Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f31277Oooo);
    }
}
