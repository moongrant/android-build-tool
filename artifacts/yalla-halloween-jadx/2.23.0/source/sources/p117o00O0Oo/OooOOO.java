package p117o00O0Oo;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f36574OooO0Oo;

    public OooOOO(ConstraintLayout constraintLayout) {
        this.f36574OooO0Oo = constraintLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f36574OooO0Oo.setBackgroundColor(Color.parseColor(OooOo00.OooO00o(((Float) valueAnimator.getAnimatedValue()).floatValue())));
    }
}
