package p143o00OOooo;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.internal.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f37528OooO0Oo;

    public OooOOOO(ConstraintLayout constraintLayout) {
        this.f37528OooO0Oo = constraintLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f37528OooO0Oo.setBackgroundColor(Color.parseColor(OooO0o.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue())));
    }
}
