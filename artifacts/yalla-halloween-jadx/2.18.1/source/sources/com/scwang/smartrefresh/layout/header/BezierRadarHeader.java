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
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;
import p411o0Oo0Ooo.oOo00OO0;
import p586o0oOoo00.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class BezierRadarHeader extends InternalAbstract implements ooOOOOoo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f19613Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f19614OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f19615OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f19616OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f19617OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f19618OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Paint f19619OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f19620OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f19621OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f19622OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f19623OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f19624Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f19625Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f19626OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f19627OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f19628OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f19629Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f19630Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public float f19631OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public AnimatorSet f19632Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Path f19633o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public RectF f19634o0OoOo0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19635OooO00o;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f19635OooO00o = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19635OooO00o[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public byte f19636Oooo0o;

        public OooO0O0(byte b) {
            this.f19636Oooo0o = b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            byte b = this.f19636Oooo0o;
            if (b == 0) {
                BezierRadarHeader.this.f19631OoooooO = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b) {
                BezierRadarHeader bezierRadarHeader = BezierRadarHeader.this;
                if (bezierRadarHeader.f19614OoooO) {
                    valueAnimator.cancel();
                    return;
                }
                bezierRadarHeader.f19621OoooOo0 = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
            } else if (2 == b) {
                BezierRadarHeader.this.f19624Ooooo00 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b) {
                BezierRadarHeader.this.f19627OooooOO = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b) {
                BezierRadarHeader.this.f19628OooooOo = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            BezierRadarHeader.this.invalidate();
        }
    }

    public BezierRadarHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO00o(@NonNull oO000Oo oo000oo, int i, int i2) {
        this.f19620OoooOOo = i - 1;
        this.f19614OoooO = false;
        float f = oOo00OO0.f39170OooO0O0;
        oOo00OO0 ooo00oo0 = new oOo00OO0(1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        valueAnimatorOfFloat.setInterpolator(ooo00oo0);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0((byte) 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        valueAnimatorOfFloat.setInterpolator(ooo00oo0);
        valueAnimatorOfFloat2.addUpdateListener(new OooO0O0((byte) 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new OooO0O0((byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i3 = this.f19621OoooOo0;
        float f2 = i3;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, 0, -((int) (0.8f * f2)), 0, -((int) (f2 * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new OooO0O0((byte) 1));
        valueAnimatorOfInt2.setInterpolator(new oOo00OO0(1));
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.f19632Ooooooo = animatorSet;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NonNull oO000Oo oo000oo, boolean z) {
        AnimatorSet animatorSet = this.f19632Ooooooo;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f19632Ooooooo.end();
            this.f19632Ooooooo = null;
        }
        int width = getWidth();
        int i = this.f19623OoooOoo;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f19630Oooooo0, (float) Math.sqrt((i * i) + (width * width)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0((byte) 3));
        valueAnimatorOfFloat.start();
        return ShopVehicleListModel.VehicleTagType_Vip400;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO0Oo(float f, int i, int i2) {
        this.f19622OoooOoO = i;
        invalidate();
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final boolean OooO0o0() {
        return this.f19618OoooOO0;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO0oO(boolean z, float f, int i, int i2, int i3) {
        this.f19623OoooOoo = i;
        if (z || this.f19614OoooO) {
            this.f19614OoooO = true;
            this.f19620OoooOOo = Math.min(i2, i);
            this.f19621OoooOo0 = (int) (Math.max(0, i - i2) * 1.9f);
            this.f19625Ooooo0o = f;
            invalidate();
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NonNull oO000Oo oo000oo, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        int i = OooO00o.f19635OooO00o[refreshState2.ordinal()];
        if (i == 1 || i == 2) {
            this.f19624Ooooo00 = 1.0f;
            this.f19631OoooooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f19627OooooOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = isInEditMode() ? getHeight() : this.f19623OoooOoo;
        this.f19633o000oOoO.reset();
        this.f19633o000oOoO.lineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f19620OoooOOo);
        Path path = this.f19633o000oOoO;
        int i = this.f19622OoooOoO;
        float f = 2.0f;
        float f2 = i >= 0 ? i : width / 2.0f;
        int i2 = this.f19620OoooOOo;
        float f3 = width;
        path.quadTo(f2, this.f19621OoooOo0 + i2, f3, i2);
        this.f19633o000oOoO.lineTo(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f19619OoooOOO.setColor(this.f19616OoooO00);
        canvas.drawPath(this.f19633o000oOoO, this.f19619OoooOOO);
        if (this.f19624Ooooo00 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f19619OoooOOO.setColor(this.f19613Oooo);
            float f4 = height;
            float f5 = f4 / oOo00OO0.f39170OooO0O0;
            float f6 = 7.0f;
            float f7 = (f3 * 1.0f) / 7.0f;
            float f8 = this.f19625Ooooo0o;
            float f9 = (f7 * f8) - (f8 > 1.0f ? ((f8 - 1.0f) * f7) / f8 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float f10 = f4 - (f8 > 1.0f ? (((f8 - 1.0f) * f4) / 2.0f) / f8 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            int i3 = 0;
            while (i3 < 7) {
                float f11 = (i3 + 1.0f) - 4.0f;
                this.f19619OoooOOO.setAlpha((int) ((1.0d - (1.0d / Math.pow((((double) f5) / 800.0d) + 1.0d, 15.0d))) * ((double) (this.f19624Ooooo00 * (1.0f - ((Math.abs(f11) / f6) * f)) * 255.0f))));
                float f12 = (1.0f - (1.0f / ((f5 / 10.0f) + 1.0f))) * this.f19626OooooO0;
                canvas.drawCircle((f9 * f11) + ((f3 / 2.0f) - (f12 / 2.0f)), f10 / 2.0f, f12, this.f19619OoooOOO);
                i3++;
                f6 = 7.0f;
                f = 2.0f;
            }
            this.f19619OoooOOO.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        }
        if (this.f19632Ooooooo != null || isInEditMode()) {
            float f13 = this.f19630Oooooo0;
            float f14 = this.f19631OoooooO;
            float f15 = f13 * f14;
            float f16 = this.f19629Oooooo * f14;
            this.f19619OoooOOO.setColor(this.f19613Oooo);
            this.f19619OoooOOO.setStyle(Paint.Style.FILL);
            float f17 = f3 / 2.0f;
            float f18 = height / 2.0f;
            canvas.drawCircle(f17, f18, f15, this.f19619OoooOOO);
            this.f19619OoooOOO.setStyle(Paint.Style.STROKE);
            float f19 = f16 + f15;
            canvas.drawCircle(f17, f18, f19, this.f19619OoooOOO);
            this.f19619OoooOOO.setColor((this.f19616OoooO00 & 16777215) | 1426063360);
            this.f19619OoooOOO.setStyle(Paint.Style.FILL);
            this.f19634o0OoOo0.set(f17 - f15, f18 - f15, f17 + f15, f15 + f18);
            canvas.drawArc(this.f19634o0OoOo0, 270.0f, this.f19628OooooOo, true, this.f19619OoooOOO);
            this.f19619OoooOOO.setStyle(Paint.Style.STROKE);
            this.f19634o0OoOo0.set(f17 - f19, f18 - f19, f17 + f19, f18 + f19);
            canvas.drawArc(this.f19634o0OoOo0, 270.0f, this.f19628OooooOo, false, this.f19619OoooOOO);
            this.f19619OoooOOO.setStyle(Paint.Style.FILL);
        }
        if (this.f19627OooooOO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f19619OoooOOO.setColor(this.f19613Oooo);
            canvas.drawCircle(f3 / 2.0f, height / 2.0f, this.f19627OooooOO, this.f19619OoooOOO);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f19632Ooooooo;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f19632Ooooooo.end();
            this.f19632Ooooooo = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0 && !this.f19615OoooO0) {
            this.f19616OoooO00 = iArr[0];
            this.f19615OoooO0 = false;
        }
        if (iArr.length <= 1 || this.f19617OoooO0O) {
            return;
        }
        this.f19613Oooo = iArr[1];
        this.f19617OoooO0O = false;
    }

    public BezierRadarHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19618OoooOO0 = false;
        this.f19622OoooOoO = -1;
        this.f19623OoooOoo = 0;
        this.f19628OooooOo = 0;
        this.f19630Oooooo0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f19629Oooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f19631OoooooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f19634o0OoOo0 = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f19667Oooo0oO = o0OoOo0.f39154OooO0o0;
        this.f19633o000oOoO = new Path();
        Paint paint = new Paint();
        this.f19619OoooOOO = paint;
        paint.setAntiAlias(true);
        this.f19626OooooO0 = oOo00OO0.OooO0OO(7.0f);
        this.f19630Oooooo0 = oOo00OO0.OooO0OO(20.0f);
        this.f19629Oooooo = oOo00OO0.OooO0OO(7.0f);
        this.f19619OoooOOO.setStrokeWidth(oOo00OO0.OooO0OO(3.0f));
        setMinimumHeight(oOo00OO0.OooO0OO(100.0f));
        if (isInEditMode()) {
            this.f19620OoooOOo = 1000;
            this.f19631OoooooO = 1.0f;
            this.f19628OooooOo = 270;
        } else {
            this.f19631OoooooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0Oo0oo.BezierRadarHeader);
        this.f19618OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.BezierRadarHeader_srlEnableHorizontalDrag, this.f19618OoooOO0);
        int i = o0Oo0oo.BezierRadarHeader_srlAccentColor;
        this.f19613Oooo = typedArrayObtainStyledAttributes.getColor(i, -1);
        this.f19617OoooO0O = true;
        int i2 = o0Oo0oo.BezierRadarHeader_srlPrimaryColor;
        this.f19616OoooO00 = typedArrayObtainStyledAttributes.getColor(i2, -14540254);
        this.f19615OoooO0 = true;
        this.f19617OoooO0O = typedArrayObtainStyledAttributes.hasValue(i);
        this.f19615OoooO0 = typedArrayObtainStyledAttributes.hasValue(i2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
