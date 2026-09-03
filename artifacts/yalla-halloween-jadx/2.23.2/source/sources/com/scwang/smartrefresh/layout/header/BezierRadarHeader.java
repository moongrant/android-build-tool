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
import o0OO0o.OooO0o;
import o0OO0oO0.OooO;
import o0OO0oO0.OooOOO0;
import p339o0OO0oo0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public class BezierRadarHeader extends InternalAbstract implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f20955OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f20956OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f20957OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f20958OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f20959OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f20960OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Paint f20961OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Path f20962OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f20963OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f20964OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f20965OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f20966OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f20967OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f20968OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final float f20969OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f20970OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f20971OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f20972OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f20973OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f20974OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AnimatorSet f20975OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RectF f20976OooOoo0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20977OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f20977OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20977OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte f20978OooO0Oo;

        public OooO0O0(byte b) {
            this.f20978OooO0Oo = b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BezierRadarHeader bezierRadarHeader = BezierRadarHeader.this;
            byte b = this.f20978OooO0Oo;
            if (b == 0) {
                bezierRadarHeader.f20973OooOoO = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b) {
                if (bezierRadarHeader.f20959OooOO0O) {
                    valueAnimator.cancel();
                    return;
                }
                bezierRadarHeader.f20964OooOOOo = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
            } else if (2 == b) {
                bezierRadarHeader.f20967OooOOoo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b) {
                bezierRadarHeader.f20971OooOo0O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b) {
                bezierRadarHeader.f20972OooOo0o = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            bezierRadarHeader.invalidate();
        }
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final void OooO(int i, float f, int i2) {
        this.f20966OooOOo0 = i;
        invalidate();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p338o0OO0oOo.o000oOoO
    public final void OooO00o(@NonNull OooOOO0 oooOOO0, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        int i = OooO00o.f20977OooO00o[refreshState2.ordinal()];
        if (i == 1 || i == 2) {
            this.f20967OooOOoo = 1.0f;
            this.f20973OooOoO = 0.0f;
            this.f20971OooOo0O = 0.0f;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final int OooO0OO(@NonNull SmartRefreshLayout smartRefreshLayout, boolean z) {
        AnimatorSet animatorSet = this.f20975OooOoOO;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f20975OooOoOO.end();
            this.f20975OooOoOO = null;
        }
        int width = getWidth();
        int i = this.f20965OooOOo;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20968OooOo, (float) Math.sqrt((i * i) + (width * width)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0((byte) 3));
        valueAnimatorOfFloat.start();
        return 400;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final void OooO0Oo(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        this.f20963OooOOOO = i - 1;
        this.f20959OooOO0O = false;
        OooOOOO oooOOOO = new OooOOOO(1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(oooOOOO);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0((byte) 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(oooOOOO);
        valueAnimatorOfFloat2.addUpdateListener(new OooO0O0((byte) 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new OooO0O0((byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i3 = this.f20964OooOOOo;
        float f = i3;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, 0, -((int) (0.8f * f)), 0, -((int) (f * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new OooO0O0((byte) 1));
        valueAnimatorOfInt2.setInterpolator(new OooOOOO(1));
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.f20975OooOoOO = animatorSet;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final void OooO0o(float f, int i, int i2, int i3, boolean z) {
        this.f20965OooOOo = i;
        if (z || this.f20959OooOO0O) {
            this.f20959OooOO0O = true;
            this.f20963OooOOOO = Math.min(i2, i);
            this.f20964OooOOOo = (int) (Math.max(0, i - i2) * 1.9f);
            this.f20970OooOo00 = f;
            invalidate();
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    public final boolean OooO0oO() {
        return this.f20960OooOO0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = isInEditMode() ? getHeight() : this.f20965OooOOo;
        Path path = this.f20962OooOOO0;
        path.reset();
        path.lineTo(0.0f, this.f20963OooOOOO);
        int i = this.f20966OooOOo0;
        float f = 2.0f;
        float f2 = i >= 0 ? i : width / 2.0f;
        int i2 = this.f20963OooOOOO;
        float f3 = width;
        path.quadTo(f2, this.f20964OooOOOo + i2, f3, i2);
        path.lineTo(f3, 0.0f);
        Paint paint = this.f20961OooOOO;
        paint.setColor(this.f20957OooO0oo);
        canvas.drawPath(path, paint);
        if (this.f20967OooOOoo > 0.0f) {
            paint.setColor(this.f20956OooO0oO);
            float f4 = height;
            float f5 = f4 / OooOOOO.f42525OooO0O0;
            float f6 = 7.0f;
            float f7 = (f3 * 1.0f) / 7.0f;
            float f8 = this.f20970OooOo00;
            float f9 = (f7 * f8) - (f8 > 1.0f ? ((f8 - 1.0f) * f7) / f8 : 0.0f);
            float f10 = f4 - (f8 > 1.0f ? (((f8 - 1.0f) * f4) / 2.0f) / f8 : 0.0f);
            int i3 = 0;
            while (i3 < 7) {
                float f11 = (i3 + 1.0f) - 4.0f;
                paint.setAlpha((int) ((1.0d - (1.0d / Math.pow((((double) f5) / 800.0d) + 1.0d, 15.0d))) * ((double) (this.f20967OooOOoo * (1.0f - ((Math.abs(f11) / f6) * f)) * 255.0f))));
                float f12 = (1.0f - (1.0f / ((f5 / 10.0f) + 1.0f))) * this.f20969OooOo0;
                canvas.drawCircle((f11 * f9) + ((f3 / 2.0f) - (f12 / 2.0f)), f10 / 2.0f, f12, paint);
                i3++;
                f6 = 7.0f;
                f = 2.0f;
            }
            paint.setAlpha(255);
        }
        if (this.f20975OooOoOO != null || isInEditMode()) {
            float f13 = this.f20973OooOoO;
            float f14 = this.f20968OooOo * f13;
            float f15 = this.f20974OooOoO0 * f13;
            paint.setColor(this.f20956OooO0oO);
            paint.setStyle(Paint.Style.FILL);
            float f16 = f3 / 2.0f;
            float f17 = height / 2.0f;
            canvas.drawCircle(f16, f17, f14, paint);
            paint.setStyle(Paint.Style.STROKE);
            float f18 = f15 + f14;
            canvas.drawCircle(f16, f17, f18, paint);
            paint.setColor((this.f20957OooO0oo & 16777215) | 1426063360);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.f20976OooOoo0;
            rectF.set(f16 - f14, f17 - f14, f16 + f14, f14 + f17);
            canvas.drawArc(rectF, 270.0f, this.f20972OooOo0o, true, paint);
            paint.setStyle(Paint.Style.STROKE);
            rectF.set(f16 - f18, f17 - f18, f16 + f18, f17 + f18);
            canvas.drawArc(rectF, 270.0f, this.f20972OooOo0o, false, paint);
            paint.setStyle(Paint.Style.FILL);
        }
        if (this.f20971OooOo0O > 0.0f) {
            paint.setColor(this.f20956OooO0oO);
            canvas.drawCircle(f3 / 2.0f, height / 2.0f, this.f20971OooOo0O, paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f20975OooOoOO;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f20975OooOoOO.end();
            this.f20975OooOoOO = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0oO0.OooOO0
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0 && !this.f20955OooO) {
            this.f20957OooO0oo = iArr[0];
            this.f20955OooO = false;
        }
        if (iArr.length <= 1 || this.f20958OooOO0) {
            return;
        }
        this.f20956OooO0oO = iArr[1];
        this.f20958OooOO0 = false;
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20960OooOO0o = false;
        this.f20966OooOOo0 = -1;
        this.f20965OooOOo = 0;
        this.f20972OooOo0o = 0;
        this.f20968OooOo = 0.0f;
        this.f20974OooOoO0 = 0.0f;
        this.f20973OooOoO = 0.0f;
        this.f20976OooOoo0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f21010OooO0o0 = o0OO0oO.OooO0O0.f42506OooO0o0;
        this.f20962OooOOO0 = new Path();
        Paint paint = new Paint();
        this.f20961OooOOO = paint;
        paint.setAntiAlias(true);
        this.f20969OooOo0 = OooOOOO.OooO0OO(7.0f);
        this.f20968OooOo = OooOOOO.OooO0OO(20.0f);
        this.f20974OooOoO0 = OooOOOO.OooO0OO(7.0f);
        paint.setStrokeWidth(OooOOOO.OooO0OO(3.0f));
        setMinimumHeight(OooOOOO.OooO0OO(100.0f));
        if (isInEditMode()) {
            this.f20963OooOOOO = 1000;
            this.f20973OooOoO = 1.0f;
            this.f20972OooOo0o = 270;
        } else {
            this.f20973OooOoO = 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.BezierRadarHeader);
        this.f20960OooOO0o = typedArrayObtainStyledAttributes.getBoolean(OooO0o.BezierRadarHeader_srlEnableHorizontalDrag, false);
        int i = OooO0o.BezierRadarHeader_srlAccentColor;
        this.f20956OooO0oO = typedArrayObtainStyledAttributes.getColor(i, -1);
        this.f20958OooOO0 = true;
        int i2 = OooO0o.BezierRadarHeader_srlPrimaryColor;
        this.f20957OooO0oo = typedArrayObtainStyledAttributes.getColor(i2, -14540254);
        this.f20955OooO = true;
        this.f20958OooOO0 = typedArrayObtainStyledAttributes.hasValue(i);
        this.f20955OooO = typedArrayObtainStyledAttributes.hasValue(i2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
