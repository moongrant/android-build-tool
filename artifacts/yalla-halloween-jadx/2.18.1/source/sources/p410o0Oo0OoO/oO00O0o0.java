package p410o0Oo0OoO;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00O0o0 extends oO0O0OoO implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ValueAnimator f39167OoooO00;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f39164Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f39165Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f39163Oooo = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Path f39166OoooO0 = new Path();

    public oO00O0o0() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f39167OoooO00 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f39167OoooO00.setInterpolator(null);
        this.f39167OoooO00.setRepeatCount(-1);
        this.f39167OoooO00.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f = iWidth;
        float fMax = Math.max(1.0f, f / 22.0f);
        if (this.f39164Oooo0oO != iWidth || this.f39165Oooo0oo != iHeight) {
            this.f39166OoooO0.reset();
            float f2 = f - fMax;
            float f3 = iHeight / 2.0f;
            this.f39166OoooO0.addCircle(f2, f3, fMax, Path.Direction.CW);
            float f4 = f - (5.0f * fMax);
            this.f39166OoooO0.addRect(f4, f3 - fMax, f2, f3 + fMax, Path.Direction.CW);
            this.f39166OoooO0.addCircle(f4, f3, fMax, Path.Direction.CW);
            this.f39164Oooo0oO = iWidth;
            this.f39165Oooo0oo = iHeight;
        }
        canvas.save();
        float f5 = f / 2.0f;
        float f6 = iHeight / 2.0f;
        canvas.rotate(this.f39163Oooo, f5, f6);
        for (int i = 0; i < 12; i++) {
            this.f39168Oooo0o.setAlpha((i + 5) * 17);
            canvas.rotate(30.0f, f5, f6);
            canvas.drawPath(this.f39166OoooO0, this.f39168Oooo0o);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f39167OoooO00.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f39163Oooo = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f39167OoooO00.isRunning()) {
            return;
        }
        this.f39167OoooO00.addUpdateListener(this);
        this.f39167OoooO00.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f39167OoooO00.isRunning()) {
            this.f39167OoooO00.removeAllListeners();
            this.f39167OoooO00.removeAllUpdateListeners();
            this.f39167OoooO00.cancel();
        }
    }
}
