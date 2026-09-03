package com.yalla.yalla.ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.ui.view.SonicView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/view/SonicView;", "Landroid/view/View;", "Landroid/view/animation/AccelerateInterpolator;", "OooOO0O", "Landroid/view/animation/AccelerateInterpolator;", "getInterpolator", "()Landroid/view/animation/AccelerateInterpolator;", "interpolator", "Lcom/yalla/yalla/ui/view/SonicView$SonicType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OooOO0o", "Lcom/yalla/yalla/ui/view/SonicView$SonicType;", "getSonicType", "()Lcom/yalla/yalla/ui/view/SonicView$SonicType;", "setSonicType", "(Lcom/yalla/yalla/ui/view/SonicView$SonicType;)V", "sonicType", "Landroid/animation/ValueAnimator;", "OooOOO0", "Lkotlin/Lazy;", "getDefaultAnimator", "()Landroid/animation/ValueAnimator;", "defaultAnimator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "SonicType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SonicView extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f30677OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Paint f30678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f30679OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f30680OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f30681OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f30682OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Animation f30683OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AccelerateInterpolator interpolator;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SonicType sonicType;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f30686OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy defaultAnimator;

    public static final class OooO00o implements Animator.AnimatorListener {
        public OooO00o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            o000OO00.OooO0OO(SonicView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            o000OO00.OooOOOO(SonicView.this);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SonicType.values().length];
            try {
                iArr[SonicType.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SonicType.VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SonicType.MagicSound.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ValueAnimator> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ValueAnimator invoke() {
            final ValueAnimator valueAnimator = new ValueAnimator();
            final SonicView sonicView = SonicView.this;
            valueAnimator.setFloatValues(0.0f, sonicView.f30681OooO0oO);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o0OoOO.w2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator it) {
                    SonicView this$0 = sonicView;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ValueAnimator this_apply = valueAnimator;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object animatedValue = this_apply.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    this$0.f30679OooO0o = ((Float) animatedValue).floatValue();
                    this$0.postInvalidate();
                }
            });
            valueAnimator.setDuration(4000L);
            valueAnimator.setRepeatCount(0);
            valueAnimator.setInterpolator(new LinearInterpolator());
            return valueAnimator;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/view/SonicView$SonicType;", "", "Default", "VIP", "MagicSound", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum SonicType {
        Default,
        VIP,
        MagicSound
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f30678OooO0Oo = paint;
        int i = oO00O0o.color_white;
        this.f30680OooO0o0 = o0000.OooO00o(i);
        this.f30681OooO0oO = 100.0f;
        this.f30682OooO0oo = o0000O0.OooO00o((float) 24.8d);
        this.f30677OooO = Float.MIN_VALUE;
        this.f30683OooOO0 = AnimationUtils.loadAnimation(context, oO000o00.room_mic_view);
        this.interpolator = new AccelerateInterpolator();
        this.sonicType = SonicType.Default;
        this.defaultAnimator = LazyKt.lazy(new OooO0OO());
        o000OO00.OooO0OO(this);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        setLayerType(1, paint);
        ValueAnimator defaultAnimator = getDefaultAnimator();
        Intrinsics.checkNotNull(defaultAnimator, "null cannot be cast to non-null type android.animation.Animator");
        defaultAnimator.addListener(new OooO00o());
        this.f30680OooO0o0 = o0000.OooO00o(i);
    }

    private final ValueAnimator getDefaultAnimator() {
        return (ValueAnimator) this.defaultAnimator.getValue();
    }

    @NotNull
    public final AccelerateInterpolator getInterpolator() {
        return this.interpolator;
    }

    @NotNull
    public final SonicType getSonicType() {
        return this.sonicType;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f30686OooOOO) {
            canvas.drawColor(0);
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = this.f30678OooO0Oo;
        paint.setColor(this.f30680OooO0o0);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = 1;
        float fOooO00o = o0000O0.OooO00o(f);
        float f2 = this.f30682OooO0oo;
        canvas.drawCircle(width, height, fOooO00o + f2, paint);
        float width2 = ((getWidth() / 2.0f) - f2) / 2.0f;
        this.f30677OooO = width2;
        float fOooO00o2 = OooOo.OooO0o.OooO00o((getWidth() / 2.0f) + (width2 * 3), f2, this.f30679OooO0o / this.f30681OooO0oO, f2);
        float width3 = f - ((fOooO00o2 - f2) / ((getWidth() / 2.0f) - f2));
        for (int i = 0; i < 4; i++) {
            float f3 = 255;
            paint.setColor((Math.min(255, Math.max(0, (int) (width3 * f3))) << 24) + (this.f30680OooO0o0 & 16777215));
            if (fOooO00o2 <= ((float) getWidth()) / 2.0f && f2 <= fOooO00o2) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, fOooO00o2, paint);
            }
            fOooO00o2 -= this.f30677OooO;
            width3 = f - ((fOooO00o2 - f2) / ((getWidth() / 2.0f) - f2));
            paint.setColor((Math.min(255, Math.max(0, (int) (f3 * width3))) << 24) + (this.f30680OooO0o0 & 16777215));
        }
    }

    public final void setSonicType(@NotNull SonicType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SonicType sonicType = this.sonicType;
        if (value == sonicType) {
            return;
        }
        this.f30686OooOOO = true;
        int[] iArr = OooO0O0.$EnumSwitchMapping$0;
        int i = iArr[sonicType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Animation animation = this.f30683OooOO0;
                if (animation.hasStarted() || !animation.hasEnded()) {
                    clearAnimation();
                }
            } else if (i == 3 && !getDefaultAnimator().isRunning()) {
                getDefaultAnimator().cancel();
            }
        } else if (getDefaultAnimator().isRunning()) {
            getDefaultAnimator().cancel();
        }
        invalidate();
        int i2 = iArr[value.ordinal()];
        if (i2 == 1) {
            this.f30680OooO0o0 = o0000.OooO00o(oO00O0o.color_white);
            setBackgroundResource(0);
        } else if (i2 == 2) {
            this.f30680OooO0o0 = o0000.OooO00o(oO00O0o.color_white);
            setBackground(o0000.OooO0O0(oOo00OO0.room_mic_view));
        } else if (i2 == 3) {
            this.f30680OooO0o0 = o0000.OooO00o(oO00O0o.color_FF006E);
            setBackgroundResource(0);
        }
        this.sonicType = value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SonicView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
