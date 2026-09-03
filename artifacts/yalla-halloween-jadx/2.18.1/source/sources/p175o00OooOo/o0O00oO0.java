package p175o00OooOo;

import android.animation.Animator;
import android.widget.ImageView;
import com.app.base.view.BubbleView;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00oO0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ImageView f32705Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BubbleView f32706Oooo0oO;

    public o0O00oO0(BubbleView bubbleView, ImageView imageView) {
        this.f32706Oooo0oO = bubbleView;
        this.f32705Oooo0o = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f32706Oooo0oO.removeView(this.f32705Oooo0o);
        this.f32705Oooo0o.setImageDrawable(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
