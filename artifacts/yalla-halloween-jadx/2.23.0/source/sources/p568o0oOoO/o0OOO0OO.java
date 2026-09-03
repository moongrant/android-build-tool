package p568o0oOoO;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0OO implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return ((float) (Math.cos((((double) (f * 2.0f)) * 3.141592653589793d) + 3.141592653589793d) / 2.0d)) + 0.5f;
    }
}
