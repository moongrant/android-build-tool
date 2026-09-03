package com.app.base.view;

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
import com.app.base.view.SonicView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/app/base/view/SonicView;", "Landroid/view/View;", "Landroid/view/animation/AccelerateInterpolator;", "OoooO", "Landroid/view/animation/AccelerateInterpolator;", "getInterpolator", "()Landroid/view/animation/AccelerateInterpolator;", "interpolator", "Lcom/app/base/view/SonicView$SonicType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OoooOO0", "Lcom/app/base/view/SonicView$SonicType;", "getSonicType", "()Lcom/app/base/view/SonicView$SonicType;", "setSonicType", "(Lcom/app/base/view/SonicView$SonicType;)V", "sonicType", "Landroid/animation/ValueAnimator;", "o000oOoO", "Lkotlin/Lazy;", "getDefaultAnimator", "()Landroid/animation/ValueAnimator;", "defaultAnimator", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "SonicType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SonicView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f12100Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Paint f12101Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12102Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f12103Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AccelerateInterpolator interpolator;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f12105OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f12106OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Animation f12107OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SonicType sonicType;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f12109OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy defaultAnimator;

    public static final class OooO00o implements Animator.AnimatorListener {
        public OooO00o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Nullable Animator animator) {
            oOO00O.OooO0O0(SonicView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Nullable Animator animator) {
            oOO00O.OooO(SonicView.this);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SonicType.values().length];
            iArr[SonicType.Default.ordinal()] = 1;
            iArr[SonicType.VIP.ordinal()] = 2;
            iArr[SonicType.MagicSound.ordinal()] = 3;
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
            valueAnimator.setFloatValues(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, sonicView.f12100Oooo);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o00OooOo.o0OO
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SonicView this$0 = sonicView;
                    ValueAnimator this_apply = valueAnimator;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    Object animatedValue = this_apply.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    this$0.f12103Oooo0oo = ((Float) animatedValue).floatValue();
                    this$0.postInvalidate();
                }
            });
            valueAnimator.setDuration(4000L);
            valueAnimator.setRepeatCount(0);
            valueAnimator.setInterpolator(new LinearInterpolator());
            return valueAnimator;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/base/view/SonicView$SonicType;", "", "Default", "VIP", "MagicSound", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
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
        this.f12101Oooo0o = paint;
        this.f12102Oooo0oO = o000O0O0.OooO00o(R.color.color_white);
        this.f12100Oooo = 100.0f;
        this.f12106OoooO00 = OooOo00.OooO00o(24.8f);
        this.f12105OoooO0 = Float.MIN_VALUE;
        this.f12107OoooO0O = AnimationUtils.loadAnimation(context, R.anim.room_mic_view);
        this.interpolator = new AccelerateInterpolator();
        this.sonicType = SonicType.Default;
        this.defaultAnimator = LazyKt.lazy(new OooO0OO());
        oOO00O.OooO0O0(this);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        setLayerType(1, paint);
        ValueAnimator defaultAnimator = getDefaultAnimator();
        Intrinsics.checkNotNull(defaultAnimator, "null cannot be cast to non-null type android.animation.Animator");
        defaultAnimator.addListener(new OooO00o());
        this.f12102Oooo0oO = o000O0O0.OooO00o(R.color.color_white);
    }

    private final ValueAnimator getDefaultAnimator() {
        return (ValueAnimator) this.defaultAnimator.getValue();
    }

    public final void OooO00o() {
        this.f12109OoooOOO = true;
        int i = OooO0O0.$EnumSwitchMapping$0[this.sonicType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !getDefaultAnimator().isRunning()) {
                    getDefaultAnimator().cancel();
                }
            } else if (this.f12107OoooO0O.hasStarted() || !this.f12107OoooO0O.hasEnded()) {
                clearAnimation();
            }
        } else if (getDefaultAnimator().isRunning()) {
            getDefaultAnimator().cancel();
        }
        invalidate();
    }

    public final int OooO0O0(int i, float f) {
        return (Math.min(KotlinVersion.MAX_COMPONENT_VALUE, Math.max(0, (int) (f * KotlinVersion.MAX_COMPONENT_VALUE))) << 24) + (i & 16777215);
    }

    public final void OooO0OO() {
        this.f12109OoooOOO = false;
        int i = OooO0O0.$EnumSwitchMapping$0[this.sonicType.ordinal()];
        if (i == 1) {
            if (getDefaultAnimator().isRunning()) {
                return;
            }
            getDefaultAnimator().start();
        } else {
            if (i != 2) {
                if (i == 3 && !getDefaultAnimator().isRunning()) {
                    getDefaultAnimator().start();
                    return;
                }
                return;
            }
            if (!this.f12107OoooO0O.hasStarted() || this.f12107OoooO0O.hasEnded()) {
                startAnimation(this.f12107OoooO0O);
            }
        }
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
    public final void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12109OoooOOO) {
            if (canvas != null) {
                canvas.drawColor(0);
                return;
            }
            return;
        }
        if (canvas != null) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        }
        this.f12101Oooo0o.setColor(this.f12102Oooo0oO);
        if (canvas != null) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f12106OoooO00 + OooOo00.OooO00o(1), this.f12101Oooo0o);
        }
        float width = ((getWidth() / 2.0f) - this.f12106OoooO00) / 2.0f;
        this.f12105OoooO0 = width;
        float width2 = (getWidth() / 2.0f) + (width * 3);
        float f = this.f12103Oooo0oo / this.f12100Oooo;
        float f2 = this.f12106OoooO00;
        float fOooO00o = Oooo000.OooO00o.OooO00o(width2, f2, f, f2);
        float f3 = 1;
        float width3 = f3 - ((fOooO00o - f2) / ((getWidth() / 2.0f) - this.f12106OoooO00));
        for (int i = 0; i < 4; i++) {
            this.f12101Oooo0o.setColor(OooO0O0(this.f12102Oooo0oO, width3));
            if ((fOooO00o <= ((float) getWidth()) / 2.0f && this.f12106OoooO00 <= fOooO00o) && canvas != null) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, fOooO00o, this.f12101Oooo0o);
            }
            fOooO00o -= this.f12105OoooO0;
            width3 = f3 - ((fOooO00o - this.f12106OoooO00) / ((getWidth() / 2.0f) - this.f12106OoooO00));
            this.f12101Oooo0o.setColor(OooO0O0(this.f12102Oooo0oO, width3));
        }
    }

    public final void setSonicType(@NotNull SonicType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value == this.sonicType) {
            return;
        }
        OooO00o();
        int i = OooO0O0.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1) {
            this.f12102Oooo0oO = o000O0O0.OooO00o(R.color.color_white);
            setBackgroundResource(0);
        } else if (i == 2) {
            this.f12102Oooo0oO = o000O0O0.OooO00o(R.color.color_white);
            setBackground(OooOOO.OooO0O0(R.drawable.room_mic_view));
        } else if (i == 3) {
            this.f12102Oooo0oO = o000O0O0.OooO00o(R.color.color_FF006E);
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
