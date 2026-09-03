package androidx.swiperefreshlayout.widget;

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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import kotlin.KotlinVersion;
import p077o000Oo.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ValueAnimator f9357Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f9358Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f9359Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Resources f9360Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f9361OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f9362OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final LinearInterpolator f9355OoooO0O = new LinearInterpolator();

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final OooO0OO f9354OoooO = new OooO0OO();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final int[] f9356OoooOO0 = {-16777216};

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int[] f9363OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RectF f9364OooO00o = new RectF();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Paint f9365OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Paint f9366OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Paint f9367OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f9368OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f9369OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f9370OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f9371OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f9372OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f9373OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f9374OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f9375OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f9376OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Path f9377OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public float f9378OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f9379OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f9380OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f9381OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f9382OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f9383OooOo00;

        public OooO00o() {
            Paint paint = new Paint();
            this.f9365OooO0O0 = paint;
            Paint paint2 = new Paint();
            this.f9366OooO0OO = paint2;
            Paint paint3 = new Paint();
            this.f9367OooO0Oo = paint3;
            this.f9369OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f9368OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f9370OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f9371OooO0oo = 5.0f;
            this.f9378OooOOOo = 1.0f;
            this.f9383OooOo00 = KotlinVersion.MAX_COMPONENT_VALUE;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void OooO00o(int i) {
            this.f9372OooOO0 = i;
            this.f9382OooOo0 = this.f9363OooO[i];
        }

        public final void OooO0O0(boolean z) {
            if (this.f9375OooOOO != z) {
                this.f9375OooOOO = z;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ProgressDrawableSize {
    }

    public CircularProgressDrawable(@NonNull Context context) {
        Objects.requireNonNull(context);
        this.f9360Oooo0oo = context.getResources();
        OooO00o oooO00o = new OooO00o();
        this.f9358Oooo0o = oooO00o;
        oooO00o.f9363OooO = f9356OoooOO0;
        oooO00o.OooO00o(0);
        oooO00o.f9371OooO0oo = 2.5f;
        oooO00o.f9365OooO0O0.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new androidx.swiperefreshlayout.widget.OooO00o(this, oooO00o));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f9355OoooO0O);
        valueAnimatorOfFloat.addListener(new OooO0O0(this, oooO00o));
        this.f9357Oooo = valueAnimatorOfFloat;
    }

    public final void OooO00o(float f, OooO00o oooO00o, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f9361OoooO0) {
            OooO0Oo(f, oooO00o);
            float fFloor = (float) (Math.floor(oooO00o.f9376OooOOO0 / 0.8f) + 1.0d);
            float f2 = oooO00o.f9373OooOO0O;
            float f3 = oooO00o.f9374OooOO0o;
            oooO00o.f9369OooO0o0 = (((f3 - 0.01f) - f2) * f) + f2;
            oooO00o.f9368OooO0o = f3;
            float f4 = oooO00o.f9376OooOOO0;
            oooO00o.f9370OooO0oO = Oooo000.OooO00o.OooO00o(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = oooO00o.f9376OooOOO0;
            if (f < 0.5f) {
                interpolation = oooO00o.f9373OooOO0O;
                interpolation2 = (f9354OoooO.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = oooO00o.f9373OooOO0O + 0.79f;
                interpolation = f6 - (((1.0f - f9354OoooO.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f9362OoooO00) * 216.0f;
            oooO00o.f9369OooO0o0 = interpolation;
            oooO00o.f9368OooO0o = interpolation2;
            oooO00o.f9370OooO0oO = f7;
            this.f9359Oooo0oO = f8;
        }
    }

    public final void OooO0O0(float f, float f2, float f3, float f4) {
        OooO00o oooO00o = this.f9358Oooo0o;
        float f5 = this.f9360Oooo0oo.getDisplayMetrics().density;
        float f6 = f2 * f5;
        oooO00o.f9371OooO0oo = f6;
        oooO00o.f9365OooO0O0.setStrokeWidth(f6);
        oooO00o.f9380OooOOo0 = f * f5;
        oooO00o.OooO00o(0);
        oooO00o.f9379OooOOo = (int) (f3 * f5);
        oooO00o.f9381OooOOoo = (int) (f4 * f5);
    }

    public final void OooO0OO(int i) {
        if (i == 0) {
            OooO0O0(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            OooO0O0(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void OooO0Oo(float f, OooO00o oooO00o) {
        if (f <= 0.75f) {
            oooO00o.f9382OooOo0 = oooO00o.f9363OooO[oooO00o.f9372OooOO0];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = oooO00o.f9363OooO;
        int i = oooO00o.f9372OooOO0;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = (i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = (i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = i2 & KotlinVersion.MAX_COMPONENT_VALUE;
        oooO00o.f9382OooOo0 = ((i4 + ((int) ((((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) - i7))));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f9359Oooo0oO, bounds.exactCenterX(), bounds.exactCenterY());
        OooO00o oooO00o = this.f9358Oooo0o;
        RectF rectF = oooO00o.f9364OooO00o;
        float f = oooO00o.f9380OooOOo0;
        float fMin = (oooO00o.f9371OooO0oo / 2.0f) + f;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((oooO00o.f9379OooOOo * oooO00o.f9378OooOOOo) / 2.0f, oooO00o.f9371OooO0oo / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = oooO00o.f9369OooO0o0;
        float f3 = oooO00o.f9370OooO0oO;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((oooO00o.f9368OooO0o + f3) * 360.0f) - f4;
        oooO00o.f9365OooO0O0.setColor(oooO00o.f9382OooOo0);
        oooO00o.f9365OooO0O0.setAlpha(oooO00o.f9383OooOo00);
        float f6 = oooO00o.f9371OooO0oo / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, oooO00o.f9367OooO0Oo);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, oooO00o.f9365OooO0O0);
        if (oooO00o.f9375OooOOO) {
            Path path = oooO00o.f9377OooOOOO;
            if (path == null) {
                Path path2 = new Path();
                oooO00o.f9377OooOOOO = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (oooO00o.f9379OooOOo * oooO00o.f9378OooOOOo) / 2.0f;
            oooO00o.f9377OooOOOO.moveTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            oooO00o.f9377OooOOOO.lineTo(oooO00o.f9379OooOOo * oooO00o.f9378OooOOOo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Path path3 = oooO00o.f9377OooOOOO;
            float f9 = oooO00o.f9379OooOOo;
            float f10 = oooO00o.f9378OooOOOo;
            path3.lineTo((f9 * f10) / 2.0f, oooO00o.f9381OooOOoo * f10);
            oooO00o.f9377OooOOOO.offset((rectF.centerX() + fMin2) - f8, (oooO00o.f9371OooO0oo / 2.0f) + rectF.centerY());
            oooO00o.f9377OooOOOO.close();
            oooO00o.f9366OooO0OO.setColor(oooO00o.f9382OooOo0);
            oooO00o.f9366OooO0OO.setAlpha(oooO00o.f9383OooOo00);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(oooO00o.f9377OooOOOO, oooO00o.f9366OooO0OO);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9358Oooo0o.f9383OooOo00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9357Oooo.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9358Oooo0o.f9383OooOo00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9358Oooo0o.f9365OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f9357Oooo.cancel();
        OooO00o oooO00o = this.f9358Oooo0o;
        float f = oooO00o.f9369OooO0o0;
        oooO00o.f9373OooOO0O = f;
        float f2 = oooO00o.f9368OooO0o;
        oooO00o.f9374OooOO0o = f2;
        oooO00o.f9376OooOOO0 = oooO00o.f9370OooO0oO;
        if (f2 != f) {
            this.f9361OoooO0 = true;
            this.f9357Oooo.setDuration(666L);
            this.f9357Oooo.start();
            return;
        }
        oooO00o.OooO00o(0);
        OooO00o oooO00o2 = this.f9358Oooo0o;
        oooO00o2.f9373OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o2.f9374OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o2.f9376OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o2.f9369OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o2.f9368OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o2.f9370OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9357Oooo.setDuration(1332L);
        this.f9357Oooo.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9357Oooo.cancel();
        this.f9359Oooo0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9358Oooo0o.OooO0O0(false);
        this.f9358Oooo0o.OooO00o(0);
        OooO00o oooO00o = this.f9358Oooo0o;
        oooO00o.f9373OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9374OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9376OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9369OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9368OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9370OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        invalidateSelf();
    }
}
