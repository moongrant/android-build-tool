package p587o0oOooOO;

import android.animation.Animator;
import android.widget.ImageView;
import com.yalla.yalla.ui.view.BubbleView;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ImageView f56768OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BubbleView f56769OooO0o0;

    public d(BubbleView bubbleView, ImageView imageView) {
        this.f56769OooO0o0 = bubbleView;
        this.f56768OooO0Oo = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BubbleView bubbleView = this.f56769OooO0o0;
        ImageView imageView = this.f56768OooO0Oo;
        bubbleView.removeView(imageView);
        imageView.setImageDrawable(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
