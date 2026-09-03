package o0OO0o;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f37912Oooo0o;

    public OooO00o(BottomSheetBehavior bottomSheetBehavior) {
        this.f37912Oooo0o = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MaterialShapeDrawable materialShapeDrawable = this.f37912Oooo0o.f16602OooO0oo;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOo0(fFloatValue);
        }
    }
}
