package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static float OooO00o(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f, f2, f3), f, f2, f3);
    }

    @NotNull
    public static VectorizedFloatAnimationSpec OooO0OO(FloatAnimationSpec floatAnimationSpec, @NotNull TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
