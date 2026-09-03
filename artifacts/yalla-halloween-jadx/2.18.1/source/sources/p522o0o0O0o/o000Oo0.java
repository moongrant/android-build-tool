package p522o0o0O0o;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 {
    @NotNull
    public static final ObjectAnimator OooO00o(@NotNull View view, @NotNull float... values) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "TranslationY", Arrays.copyOf(values, values.length));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(this, \"TranslationY\", *values)");
        return objectAnimatorOfFloat;
    }
}
