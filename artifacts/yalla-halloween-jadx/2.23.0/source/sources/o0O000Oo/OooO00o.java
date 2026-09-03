package o0O000Oo;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f41652OooO0Oo;

    public OooO00o(BottomSheetBehavior bottomSheetBehavior) {
        this.f41652OooO0Oo = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MaterialShapeDrawable materialShapeDrawable = this.f41652OooO0Oo.f16431OooO;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOOO(fFloatValue);
        }
    }
}
