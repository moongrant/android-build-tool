package p405o0Oo0OO0;

import android.animation.ValueAnimator;
import com.opensource.svgaplayer.SVGAImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f39052Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SVGAImageView f39053Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO f39054Oooo0oo;

    public OooOO0O(ValueAnimator valueAnimator, SVGAImageView sVGAImageView, OooO oooO) {
        this.f39052Oooo0o = valueAnimator;
        this.f39053Oooo0oO = sVGAImageView;
        this.f39054Oooo0oo = oooO;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        OooO oooO = this.f39054Oooo0oo;
        ValueAnimator animator = this.f39052Oooo0o;
        Intrinsics.checkExpressionValueIsNotNull(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        if (animatedValue == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        oooO.OooO0O0(((Integer) animatedValue).intValue());
        OooO0o f19425Oooo = this.f39053Oooo0oO.getF19425Oooo();
        if (f19425Oooo != null) {
            OooO oooO2 = this.f39054Oooo0oo;
            int i = oooO2.f39040OooO0O0;
            f19425Oooo.onStep(i, ((double) (i + 1)) / ((double) oooO2.f39043OooO0o0.f39069OooO0Oo));
        }
    }
}
