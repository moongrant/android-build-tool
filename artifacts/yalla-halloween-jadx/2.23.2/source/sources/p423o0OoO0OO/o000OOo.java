package p423o0OoO0OO;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p509o0o00ooO.w1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo {
    public static final void OooO00o(@NotNull final ViewGroup viewGroup, @Nullable final w1.OooOO0 oooOO1) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 0.9f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoO0OO.o0O0O00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator1) {
                View this_replyChatItemHint = viewGroup;
                Intrinsics.checkNotNullParameter(this_replyChatItemHint, "$this_replyChatItemHint");
                Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
                Object animatedValue = valueAnimator1.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this_replyChatItemHint.setScaleX(((Float) animatedValue).floatValue());
                Object animatedValue2 = valueAnimator1.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this_replyChatItemHint.setScaleY(((Float) animatedValue2).floatValue());
                Function1 function1 = oooOO1;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(valueAnimator1.getAnimatedFraction()));
                }
            }
        });
        valueAnimatorOfFloat.start();
    }
}
