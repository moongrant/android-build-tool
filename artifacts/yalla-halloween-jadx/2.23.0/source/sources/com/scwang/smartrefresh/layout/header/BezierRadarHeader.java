package com.scwang.smartrefresh.layout.header;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import o0OO0o.OooO;
import o0OO0o.OooOOO0;
import p333o0OO0o0o.OooOOO;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class BezierRadarHeader extends InternalAbstract implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f21428OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f21429OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f21430OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f21431OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f21432OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f21433OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Paint f21434OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Path f21435OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f21436OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f21437OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f21438OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f21439OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f21440OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f21441OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final float f21442OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f21443OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f21444OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f21445OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f21446OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f21447OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AnimatorSet f21448OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RectF f21449OooOoo0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21450OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f21450OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21450OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte f21451OooO0Oo;

        public OooO0O0(byte b) {
            this.f21451OooO0Oo = b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BezierRadarHeader bezierRadarHeader = BezierRadarHeader.this;
            byte b = this.f21451OooO0Oo;
            if (b == 0) {
                bezierRadarHeader.f21446OooOoO = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b) {
                if (bezierRadarHeader.f21432OooOO0O) {
                    valueAnimator.cancel();
                    return;
                }
                bezierRadarHeader.f21437OooOOOo = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
            } else if (2 == b) {
                bezierRadarHeader.f21440OooOOoo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b) {
                bezierRadarHeader.f21444OooOo0O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b) {
                bezierRadarHeader.f21445OooOo0o = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            bezierRadarHeader.invalidate();
        }
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO(int i, float f, int i2) {
        this.f21439OooOOo0 = i;
        invalidate();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p389o0OOoooO.o00O0OOO
    public final void OooO0OO(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        int i = OooO00o.f21450OooO00o[refreshState2.ordinal()];
        if (i == 1 || i == 2) {
            this.f21440OooOOoo = 1.0f;
            this.f21446OooOoO = 0.0f;
            this.f21444OooOo0O = 0.0f;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final int OooO0Oo(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        AnimatorSet animatorSet = this.f21448OooOoOO;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f21448OooOoOO.end();
            this.f21448OooOoOO = null;
        }
        int width = getWidth();
        int i = this.f21438OooOOo;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21441OooOo, (float) Math.sqrt((i * i) + (width * width)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0((byte) 3));
        valueAnimatorOfFloat.start();
        return 400;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0o(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        this.f21436OooOOOO = i - 1;
        this.f21432OooOO0O = false;
        OooOo00 oooOo00 = new OooOo00(1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(oooOo00);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0((byte) 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(oooOo00);
        valueAnimatorOfFloat2.addUpdateListener(new OooO0O0((byte) 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new OooO0O0((byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i3 = this.f21437OooOOOo;
        float f = i3;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, 0, -((int) (0.8f * f)), 0, -((int) (f * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new OooO0O0((byte) 1));
        valueAnimatorOfInt2.setInterpolator(new OooOo00(1));
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.f21448OooOoOO = animatorSet;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0o0(float f, int i, int i2, int i3, boolean z) {
        this.f21438OooOOo = i;
        if (z || this.f21432OooOO0O) {
            this.f21432OooOO0O = true;
            this.f21436OooOOOO = Math.min(i2, i);
            this.f21437OooOOOo = (int) (Math.max(0, i - i2) * 1.9f);
            this.f21443OooOo00 = f;
            invalidate();
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final boolean OooO0oO() {
        return this.f21433OooOO0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = isInEditMode() ? getHeight() : this.f21438OooOOo;
        Path path = this.f21435OooOOO0;
        path.reset();
        path.lineTo(0.0f, this.f21436OooOOOO);
        int i = this.f21439OooOOo0;
        float f = 2.0f;
        float f2 = i >= 0 ? i : width / 2.0f;
        int i2 = this.f21436OooOOOO;
        float f3 = width;
        path.quadTo(f2, this.f21437OooOOOo + i2, f3, i2);
        path.lineTo(f3, 0.0f);
        Paint paint = this.f21434OooOOO;
        paint.setColor(this.f21430OooO0oo);
        canvas.drawPath(path, paint);
        if (this.f21440OooOOoo > 0.0f) {
            paint.setColor(this.f21429OooO0oO);
            float f4 = height;
            float f5 = f4 / OooOo00.f43255OooO0O0;
            float f6 = 7.0f;
            float f7 = (f3 * 1.0f) / 7.0f;
            float f8 = this.f21443OooOo00;
            float f9 = (f7 * f8) - (f8 > 1.0f ? ((f8 - 1.0f) * f7) / f8 : 0.0f);
            float f10 = f4 - (f8 > 1.0f ? (((f8 - 1.0f) * f4) / 2.0f) / f8 : 0.0f);
            int i3 = 0;
            while (i3 < 7) {
                float f11 = (i3 + 1.0f) - 4.0f;
                paint.setAlpha((int) ((1.0d - (1.0d / Math.pow((((double) f5) / 800.0d) + 1.0d, 15.0d))) * ((double) (this.f21440OooOOoo * (1.0f - ((Math.abs(f11) / f6) * f)) * 255.0f))));
                float f12 = (1.0f - (1.0f / ((f5 / 10.0f) + 1.0f))) * this.f21442OooOo0;
                canvas.drawCircle((f11 * f9) + ((f3 / 2.0f) - (f12 / 2.0f)), f10 / 2.0f, f12, paint);
                i3++;
                f6 = 7.0f;
                f = 2.0f;
            }
            paint.setAlpha(255);
        }
        if (this.f21448OooOoOO != null || isInEditMode()) {
            float f13 = this.f21446OooOoO;
            float f14 = this.f21441OooOo * f13;
            float f15 = this.f21447OooOoO0 * f13;
            paint.setColor(this.f21429OooO0oO);
            paint.setStyle(Paint.Style.FILL);
            float f16 = f3 / 2.0f;
            float f17 = height / 2.0f;
            canvas.drawCircle(f16, f17, f14, paint);
            paint.setStyle(Paint.Style.STROKE);
            float f18 = f15 + f14;
            canvas.drawCircle(f16, f17, f18, paint);
            paint.setColor((this.f21430OooO0oo & 16777215) | 1426063360);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.f21449OooOoo0;
            rectF.set(f16 - f14, f17 - f14, f16 + f14, f14 + f17);
            canvas.drawArc(rectF, 270.0f, this.f21445OooOo0o, true, paint);
            paint.setStyle(Paint.Style.STROKE);
            rectF.set(f16 - f18, f17 - f18, f16 + f18, f17 + f18);
            canvas.drawArc(rectF, 270.0f, this.f21445OooOo0o, false, paint);
            paint.setStyle(Paint.Style.FILL);
        }
        if (this.f21444OooOo0O > 0.0f) {
            paint.setColor(this.f21429OooO0oO);
            canvas.drawCircle(f3 / 2.0f, height / 2.0f, this.f21444OooOo0O, paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f21448OooOoOO;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f21448OooOoOO.end();
            this.f21448OooOoOO = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0 && !this.f21428OooO) {
            this.f21430OooO0oo = iArr[0];
            this.f21428OooO = false;
        }
        if (iArr.length <= 1 || this.f21431OooOO0) {
            return;
        }
        this.f21429OooO0oO = iArr[1];
        this.f21431OooOO0 = false;
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21433OooOO0o = false;
        this.f21439OooOOo0 = -1;
        this.f21438OooOOo = 0;
        this.f21445OooOo0o = 0;
        this.f21441OooOo = 0.0f;
        this.f21447OooOoO0 = 0.0f;
        this.f21446OooOoO = 0.0f;
        this.f21449OooOoo0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f21483OooO0o0 = o0OO0oO0.OooO0O0.f43239OooO0o0;
        this.f21435OooOOO0 = new Path();
        Paint paint = new Paint();
        this.f21434OooOOO = paint;
        paint.setAntiAlias(true);
        this.f21442OooOo0 = OooOo00.OooO0OO(7.0f);
        this.f21441OooOo = OooOo00.OooO0OO(20.0f);
        this.f21447OooOoO0 = OooOo00.OooO0OO(7.0f);
        paint.setStrokeWidth(OooOo00.OooO0OO(3.0f));
        setMinimumHeight(OooOo00.OooO0OO(100.0f));
        if (isInEditMode()) {
            this.f21436OooOOOO = 1000;
            this.f21446OooOoO = 1.0f;
            this.f21445OooOo0o = 270;
        } else {
            this.f21446OooOoO = 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOOO.BezierRadarHeader);
        this.f21433OooOO0o = typedArrayObtainStyledAttributes.getBoolean(OooOOO.BezierRadarHeader_srlEnableHorizontalDrag, false);
        int i = OooOOO.BezierRadarHeader_srlAccentColor;
        this.f21429OooO0oO = typedArrayObtainStyledAttributes.getColor(i, -1);
        this.f21431OooOO0 = true;
        int i2 = OooOOO.BezierRadarHeader_srlPrimaryColor;
        this.f21430OooO0oo = typedArrayObtainStyledAttributes.getColor(i2, -14540254);
        this.f21428OooO = true;
        this.f21431OooOO0 = typedArrayObtainStyledAttributes.hasValue(i);
        this.f21428OooO = typedArrayObtainStyledAttributes.hasValue(i2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
