package p175o00OooOo;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o00 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ImageView f32704Oooo0o;

    public o0O00o00(ImageView imageView) {
        this.f32704Oooo0o = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = (float[]) valueAnimator.getAnimatedValue();
        this.f32704Oooo0o.setTranslationX(fArr[0]);
        this.f32704Oooo0o.setTranslationY(fArr[1]);
    }
}
