package p392o0OOoooO;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0O0 extends o00O0OO0 implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ValueAnimator f43598OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43596OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f43595OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f43597OooO0oO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Path f43594OooO = new Path();

    public oo0o0O0() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f43598OooO0oo = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f = iWidth;
        float fMax = Math.max(1.0f, f / 22.0f);
        int i = this.f43596OooO0o0;
        Path path = this.f43594OooO;
        if (i != iWidth || this.f43595OooO0o != iHeight) {
            path.reset();
            float f2 = f - fMax;
            float f3 = iHeight / 2.0f;
            path.addCircle(f2, f3, fMax, Path.Direction.CW);
            float f4 = f - (5.0f * fMax);
            path.addRect(f4, f3 - fMax, f2, f3 + fMax, Path.Direction.CW);
            path.addCircle(f4, f3, fMax, Path.Direction.CW);
            this.f43596OooO0o0 = iWidth;
            this.f43595OooO0o = iHeight;
        }
        canvas.save();
        float f5 = f / 2.0f;
        float f6 = iHeight / 2.0f;
        canvas.rotate(this.f43597OooO0oO, f5, f6);
        for (int i2 = 0; i2 < 12; i2++) {
            Paint paint = this.f43593OooO0Oo;
            paint.setAlpha((i2 + 5) * 17);
            canvas.rotate(30.0f, f5, f6);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f43598OooO0oo.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f43597OooO0oO = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.f43598OooO0oo;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.addUpdateListener(this);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ValueAnimator valueAnimator = this.f43598OooO0oo;
        if (valueAnimator.isRunning()) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
    }
}
