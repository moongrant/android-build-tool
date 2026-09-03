package p539o0o0OoOO;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ImageView f55573OooO0Oo;

    public j0(ImageView imageView) {
        this.f55573OooO0Oo = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = (float[]) valueAnimator.getAnimatedValue();
        float f = fArr[0];
        ImageView imageView = this.f55573OooO0Oo;
        imageView.setTranslationX(f);
        imageView.setTranslationY(fArr[1]);
    }
}
