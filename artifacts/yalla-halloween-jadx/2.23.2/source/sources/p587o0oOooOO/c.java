package p587o0oOooOO;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ImageView f56753OooO0Oo;

    public c(ImageView imageView) {
        this.f56753OooO0Oo = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = (float[]) valueAnimator.getAnimatedValue();
        float f = fArr[0];
        ImageView imageView = this.f56753OooO0Oo;
        imageView.setTranslationX(f);
        imageView.setTranslationY(fArr[1]);
    }
}
