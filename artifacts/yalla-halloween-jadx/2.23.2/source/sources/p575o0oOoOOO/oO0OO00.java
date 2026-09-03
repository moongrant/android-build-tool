package p575o0oOoOOO;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return ((float) (Math.cos((((double) (f * 2.0f)) * 3.141592653589793d) + 3.141592653589793d) / 2.0d)) + 0.5f;
    }
}
