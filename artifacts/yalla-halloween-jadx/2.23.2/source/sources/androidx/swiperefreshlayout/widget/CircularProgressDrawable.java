package androidx.swiperefreshlayout.widget;

import OooOo.OooO0o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p064o0000oO0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final LinearInterpolator f11103OooOO0 = new LinearInterpolator();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooOO0 f11104OooOO0O = new OooOO0();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f11105OooOO0o = {-16777216};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f11106OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f11107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Resources f11108OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f11109OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ValueAnimator f11110OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f11111OooO0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int[] f11112OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RectF f11113OooO00o = new RectF();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Paint f11114OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Paint f11115OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Paint f11116OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f11117OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f11118OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f11119OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f11120OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f11121OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f11122OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f11123OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f11124OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f11125OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Path f11126OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public float f11127OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f11128OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f11129OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f11130OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f11131OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f11132OooOo00;

        public OooO00o() {
            Paint paint = new Paint();
            this.f11114OooO0O0 = paint;
            Paint paint2 = new Paint();
            this.f11115OooO0OO = paint2;
            Paint paint3 = new Paint();
            this.f11116OooO0Oo = paint3;
            this.f11118OooO0o0 = 0.0f;
            this.f11117OooO0o = 0.0f;
            this.f11119OooO0oO = 0.0f;
            this.f11120OooO0oo = 5.0f;
            this.f11127OooOOOo = 1.0f;
            this.f11132OooOo00 = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void OooO00o(int i) {
            this.f11121OooOO0 = i;
            this.f11131OooOo0 = this.f11112OooO[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ProgressDrawableSize {
    }

    public CircularProgressDrawable(@NonNull Context context) {
        context.getClass();
        this.f11108OooO0o = context.getResources();
        OooO00o oooO00o = new OooO00o();
        this.f11107OooO0Oo = oooO00o;
        oooO00o.f11112OooO = f11105OooOO0o;
        oooO00o.OooO00o(0);
        oooO00o.f11120OooO0oo = 2.5f;
        oooO00o.f11114OooO0O0.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new androidx.swiperefreshlayout.widget.OooO00o(this, oooO00o));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f11103OooOO0);
        valueAnimatorOfFloat.addListener(new OooO0O0(this, oooO00o));
        this.f11110OooO0oO = valueAnimatorOfFloat;
    }

    public static void OooO0Oo(float f, OooO00o oooO00o) {
        if (f <= 0.75f) {
            oooO00o.f11131OooOo0 = oooO00o.f11112OooO[oooO00o.f11121OooOO0];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = oooO00o.f11112OooO;
        int i = oooO00o.f11121OooOO0;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        oooO00o.f11131OooOo0 = (i7 + ((int) (f2 * ((i3 & 255) - i7)))) | ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8);
    }

    public final void OooO00o(float f, OooO00o oooO00o, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f11106OooO) {
            OooO0Oo(f, oooO00o);
            float fFloor = (float) (Math.floor(oooO00o.f11125OooOOO0 / 0.8f) + 1.0d);
            float f2 = oooO00o.f11122OooOO0O;
            float f3 = oooO00o.f11123OooOO0o;
            oooO00o.f11118OooO0o0 = (((f3 - 0.01f) - f2) * f) + f2;
            oooO00o.f11117OooO0o = f3;
            float f4 = oooO00o.f11125OooOOO0;
            oooO00o.f11119OooO0oO = OooO0o.OooO00o(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = oooO00o.f11125OooOOO0;
            OooOO0 oooOO1 = f11104OooOO0O;
            if (f < 0.5f) {
                interpolation = oooO00o.f11122OooOO0O;
                interpolation2 = (oooOO1.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = oooO00o.f11122OooOO0O + 0.79f;
                interpolation = f6 - (((1.0f - oooOO1.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f11111OooO0oo) * 216.0f;
            oooO00o.f11118OooO0o0 = interpolation;
            oooO00o.f11117OooO0o = interpolation2;
            oooO00o.f11119OooO0oO = f7;
            this.f11109OooO0o0 = f8;
        }
    }

    public final void OooO0O0(float f, float f2, float f3, float f4) {
        float f5 = this.f11108OooO0o.getDisplayMetrics().density;
        float f6 = f2 * f5;
        OooO00o oooO00o = this.f11107OooO0Oo;
        oooO00o.f11120OooO0oo = f6;
        oooO00o.f11114OooO0O0.setStrokeWidth(f6);
        oooO00o.f11129OooOOo0 = f * f5;
        oooO00o.OooO00o(0);
        oooO00o.f11128OooOOo = (int) (f3 * f5);
        oooO00o.f11130OooOOoo = (int) (f4 * f5);
    }

    public final void OooO0OO(int i) {
        if (i == 0) {
            OooO0O0(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            OooO0O0(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f11109OooO0o0, bounds.exactCenterX(), bounds.exactCenterY());
        OooO00o oooO00o = this.f11107OooO0Oo;
        RectF rectF = oooO00o.f11113OooO00o;
        float f = oooO00o.f11129OooOOo0;
        float fMin = (oooO00o.f11120OooO0oo / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((oooO00o.f11128OooOOo * oooO00o.f11127OooOOOo) / 2.0f, oooO00o.f11120OooO0oo / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = oooO00o.f11118OooO0o0;
        float f3 = oooO00o.f11119OooO0oO;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((oooO00o.f11117OooO0o + f3) * 360.0f) - f4;
        Paint paint = oooO00o.f11114OooO0O0;
        paint.setColor(oooO00o.f11131OooOo0);
        paint.setAlpha(oooO00o.f11132OooOo00);
        float f6 = oooO00o.f11120OooO0oo / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, oooO00o.f11116OooO0Oo);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        if (oooO00o.f11124OooOOO) {
            Path path = oooO00o.f11126OooOOOO;
            if (path == null) {
                Path path2 = new Path();
                oooO00o.f11126OooOOOO = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (oooO00o.f11128OooOOo * oooO00o.f11127OooOOOo) / 2.0f;
            oooO00o.f11126OooOOOO.moveTo(0.0f, 0.0f);
            oooO00o.f11126OooOOOO.lineTo(oooO00o.f11128OooOOo * oooO00o.f11127OooOOOo, 0.0f);
            Path path3 = oooO00o.f11126OooOOOO;
            float f9 = oooO00o.f11128OooOOo;
            float f10 = oooO00o.f11127OooOOOo;
            path3.lineTo((f9 * f10) / 2.0f, oooO00o.f11130OooOOoo * f10);
            oooO00o.f11126OooOOOO.offset((rectF.centerX() + fMin2) - f8, (oooO00o.f11120OooO0oo / 2.0f) + rectF.centerY());
            oooO00o.f11126OooOOOO.close();
            Paint paint2 = oooO00o.f11115OooO0OO;
            paint2.setColor(oooO00o.f11131OooOo0);
            paint2.setAlpha(oooO00o.f11132OooOo00);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(oooO00o.f11126OooOOOO, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11107OooO0Oo.f11132OooOo00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f11110OooO0oO.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f11107OooO0Oo.f11132OooOo00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11107OooO0Oo.f11114OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f11110OooO0oO.cancel();
        OooO00o oooO00o = this.f11107OooO0Oo;
        float f = oooO00o.f11118OooO0o0;
        oooO00o.f11122OooOO0O = f;
        float f2 = oooO00o.f11117OooO0o;
        oooO00o.f11123OooOO0o = f2;
        oooO00o.f11125OooOOO0 = oooO00o.f11119OooO0oO;
        if (f2 != f) {
            this.f11106OooO = true;
            this.f11110OooO0oO.setDuration(666L);
            this.f11110OooO0oO.start();
            return;
        }
        oooO00o.OooO00o(0);
        oooO00o.f11122OooOO0O = 0.0f;
        oooO00o.f11123OooOO0o = 0.0f;
        oooO00o.f11125OooOOO0 = 0.0f;
        oooO00o.f11118OooO0o0 = 0.0f;
        oooO00o.f11117OooO0o = 0.0f;
        oooO00o.f11119OooO0oO = 0.0f;
        this.f11110OooO0oO.setDuration(1332L);
        this.f11110OooO0oO.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f11110OooO0oO.cancel();
        this.f11109OooO0o0 = 0.0f;
        OooO00o oooO00o = this.f11107OooO0Oo;
        if (oooO00o.f11124OooOOO) {
            oooO00o.f11124OooOOO = false;
        }
        oooO00o.OooO00o(0);
        oooO00o.f11122OooOO0O = 0.0f;
        oooO00o.f11123OooOO0o = 0.0f;
        oooO00o.f11125OooOOO0 = 0.0f;
        oooO00o.f11118OooO0o0 = 0.0f;
        oooO00o.f11117OooO0o = 0.0f;
        oooO00o.f11119OooO0oO = 0.0f;
        invalidateSelf();
    }
}
