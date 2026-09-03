package p522o0o0O0o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {
    public static final void OooO00o(@NotNull final View view, @Nullable final Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 0.9f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o0O0o.o0000
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator1) {
                View this_replyChatItemHint = view;
                Function1 function2 = function1;
                Intrinsics.checkNotNullParameter(this_replyChatItemHint, "$this_replyChatItemHint");
                Intrinsics.checkNotNullParameter(valueAnimator1, "valueAnimator1");
                Object animatedValue = valueAnimator1.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this_replyChatItemHint.setScaleX(((Float) animatedValue).floatValue());
                Object animatedValue2 = valueAnimator1.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this_replyChatItemHint.setScaleY(((Float) animatedValue2).floatValue());
                if (function2 != null) {
                    function2.invoke(Float.valueOf(valueAnimator1.getAnimatedFraction()));
                }
            }
        });
        valueAnimatorOfFloat.start();
    }
}
