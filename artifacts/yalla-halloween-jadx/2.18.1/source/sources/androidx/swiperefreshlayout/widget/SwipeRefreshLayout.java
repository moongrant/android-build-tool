package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import androidx.core.widget.OooOOO;
import com.yalla.yalla.ui.activity.user.MedalRankActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import o000O0O0.Oooo0;
import o000O0O0.o00000O;
import o000O0O0.o000oOoO;
import o000O0O0.o00Oo0;
import o000O0O0.o00Ooo;
import p098o000o0oO.o0OOO0o;
import p098o000o0oO.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements o00Oo0, Oooo0 {

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public static final int[] f9388o0ooOOo = {R.attr.enabled};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f9389Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f9390Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooOOO0 f9391Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f9392Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o000oOoO f9393OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f9394OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f9395OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o00Ooo f9396OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int[] f9397OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f9398OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f9399OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f9400OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f9401OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f9402OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f9403Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f9404Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final DecelerateInterpolator f9405OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o0ooOOo f9406OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f9407OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f9408Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f9409Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f9410OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f9411Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int[] f9412o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public OooO0O0 f9413o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public OooO0OO f9414o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public OooO0OO f9415o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f9416o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final OooO f9417o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public OooO00o f9418o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f9419o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public CircularProgressDrawable f9420o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final OooOO0 f9421o0ooOO0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public OooOO0O f9422oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public o0OOO0o f9423ooOO;

    public class OooO extends Animation {
        public OooO() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = swipeRefreshLayout.f9410OoooooO - Math.abs(swipeRefreshLayout.f9408Oooooo);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f9409Oooooo0;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout2.f9406OooooOO.getTop());
            CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.f9420o0OoOo0;
            float f2 = 1.0f - f;
            CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f9358Oooo0o;
            if (f2 != oooO00o.f9378OooOOOo) {
                oooO00o.f9378OooOOOo = f2;
            }
            circularProgressDrawable.invalidateSelf();
        }
    }

    public class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            OooOOO0 oooOOO0;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f9392Oooo0oo) {
                swipeRefreshLayout.OooO0oO();
                return;
            }
            swipeRefreshLayout.f9420o0OoOo0.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            SwipeRefreshLayout.this.f9420o0OoOo0.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f9416o00o0O && (oooOOO0 = swipeRefreshLayout2.f9391Oooo0oO) != null) {
                MedalRankActivity medalRankActivity = MedalRankActivity.this;
                int i = MedalRankActivity.f23334OooooO0;
                medalRankActivity.OooOoO();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f9400OoooOo0 = swipeRefreshLayout3.f9406OooooOO.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class OooO0O0 extends Animation {
        public OooO0O0() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    public class OooO0OO extends Animation {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f9427Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f9428Oooo0oO;

        public OooO0OO(int i, int i2) {
            this.f9427Oooo0o = i;
            this.f9428Oooo0oO = i2;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.f9420o0OoOo0;
            int i = this.f9427Oooo0o;
            circularProgressDrawable.setAlpha((int) (((this.f9428Oooo0oO - i) * f) + i));
        }
    }

    public class OooO0o implements Animation.AnimationListener {
        public OooO0o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.OooOOo0(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class OooOO0 extends Animation {
        public OooOO0() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.OooO0o0(f);
        }
    }

    public interface OooOO0O {
        boolean OooO00o();
    }

    public interface OooOOO0 {
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.f9406OooooOO.getBackground().setAlpha(i);
        this.f9420o0OoOo0.setAlpha(i);
    }

    public final Animation OooO(int i, int i2) {
        OooO0OO oooO0OO = new OooO0OO(i, i2);
        oooO0OO.setDuration(300L);
        o0ooOOo o0ooooo2 = this.f9406OooooOO;
        o0ooooo2.f29319Oooo0o = null;
        o0ooooo2.clearAnimation();
        this.f9406OooooOO.startAnimation(oooO0OO);
        return oooO0OO;
    }

    public final boolean OooO00o() {
        OooOO0O oooOO0O = this.f9422oo000o;
        if (oooOO0O != null) {
            return oooOO0O.OooO00o();
        }
        View view = this.f9390Oooo0o;
        return view instanceof ListView ? OooOOO.OooO00o((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void OooO0O0() {
        if (this.f9390Oooo0o == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f9406OooooOO)) {
                    this.f9390Oooo0o = childAt;
                    return;
                }
            }
        }
    }

    public final void OooO0OO(float f) {
        if (f > this.f9395OoooO00) {
            OooO0oo(true, true);
            return;
        }
        this.f9392Oooo0oo = false;
        CircularProgressDrawable circularProgressDrawable = this.f9420o0OoOo0;
        CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f9358Oooo0o;
        oooO00o.f9369OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9368OooO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        circularProgressDrawable.invalidateSelf();
        OooO0o oooO0o = new OooO0o();
        this.f9409Oooooo0 = this.f9400OoooOo0;
        this.f9421o0ooOO0.reset();
        this.f9421o0ooOO0.setDuration(200L);
        this.f9421o0ooOO0.setInterpolator(this.f9405OooooO0);
        o0ooOOo o0ooooo2 = this.f9406OooooOO;
        o0ooooo2.f29319Oooo0o = oooO0o;
        o0ooooo2.clearAnimation();
        this.f9406OooooOO.startAnimation(this.f9421o0ooOO0);
        CircularProgressDrawable circularProgressDrawable2 = this.f9420o0OoOo0;
        circularProgressDrawable2.f9358Oooo0o.OooO0O0(false);
        circularProgressDrawable2.invalidateSelf();
    }

    public final void OooO0Oo(float f) {
        CircularProgressDrawable circularProgressDrawable = this.f9420o0OoOo0;
        circularProgressDrawable.f9358Oooo0o.OooO0O0(true);
        circularProgressDrawable.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f9395OoooO00));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f9395OoooO00;
        int i = this.f9411Ooooooo;
        if (i <= 0) {
            i = this.f9410OoooooO;
        }
        float f2 = i;
        double dMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f9408Oooooo + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f9406OooooOO.getVisibility() != 0) {
            this.f9406OooooOO.setVisibility(0);
        }
        this.f9406OooooOO.setScaleX(1.0f);
        this.f9406OooooOO.setScaleY(1.0f);
        if (f < this.f9395OoooO00) {
            if (this.f9420o0OoOo0.f9358Oooo0o.f9383OooOo00 > 76) {
                OooO0OO oooO0OO = this.f9414o00Oo0;
                if (!((oooO0OO == null || !oooO0OO.hasStarted() || oooO0OO.hasEnded()) ? false : true)) {
                    this.f9414o00Oo0 = (OooO0OO) OooO(this.f9420o0OoOo0.f9358Oooo0o.f9383OooOo00, 76);
                }
            }
        } else if (this.f9420o0OoOo0.f9358Oooo0o.f9383OooOo00 < 255) {
            OooO0OO oooO0OO2 = this.f9415o00Ooo;
            if (!((oooO0OO2 == null || !oooO0OO2.hasStarted() || oooO0OO2.hasEnded()) ? false : true)) {
                this.f9415o00Ooo = (OooO0OO) OooO(this.f9420o0OoOo0.f9358Oooo0o.f9383OooOo00, KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        CircularProgressDrawable circularProgressDrawable2 = this.f9420o0OoOo0;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable2.f9358Oooo0o;
        oooO00o.f9369OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO00o.f9368OooO0o = fMin2;
        circularProgressDrawable2.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable3 = this.f9420o0OoOo0;
        float fMin3 = Math.min(1.0f, fMax);
        CircularProgressDrawable.OooO00o oooO00o2 = circularProgressDrawable3.f9358Oooo0o;
        if (fMin3 != oooO00o2.f9378OooOOOo) {
            oooO00o2.f9378OooOOOo = fMin3;
        }
        circularProgressDrawable3.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable4 = this.f9420o0OoOo0;
        circularProgressDrawable4.f9358Oooo0o.f9370OooO0oO = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        circularProgressDrawable4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f9400OoooOo0);
    }

    public final void OooO0o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9404Ooooo0o) {
            this.f9404Ooooo0o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public final void OooO0o0(float f) {
        int i = this.f9409Oooooo0;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f9408Oooooo - i) * f))) - this.f9406OooooOO.getTop());
    }

    public final void OooO0oO() {
        this.f9406OooooOO.clearAnimation();
        this.f9420o0OoOo0.stop();
        this.f9406OooooOO.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.f9408Oooooo - this.f9400OoooOo0);
        this.f9400OoooOo0 = this.f9406OooooOO.getTop();
    }

    public final void OooO0oo(boolean z, boolean z2) {
        if (this.f9392Oooo0oo != z) {
            this.f9416o00o0O = z2;
            OooO0O0();
            this.f9392Oooo0oo = z;
            if (!z) {
                OooOOo0(this.f9418o00oO0o);
                return;
            }
            int i = this.f9400OoooOo0;
            OooO00o oooO00o = this.f9418o00oO0o;
            this.f9409Oooooo0 = i;
            this.f9417o00oO0O.reset();
            this.f9417o00oO0O.setDuration(200L);
            this.f9417o00oO0O.setInterpolator(this.f9405OooooO0);
            if (oooO00o != null) {
                this.f9406OooooOO.f29319Oooo0o = oooO00o;
            }
            this.f9406OooooOO.clearAnimation();
            this.f9406OooooOO.startAnimation(this.f9417o00oO0O);
        }
    }

    public final void OooOOOo(float f) {
        float f2 = this.f9402OoooOoo;
        float f3 = f - f2;
        int i = this.f9389Oooo;
        if (f3 <= i || this.f9403Ooooo00) {
            return;
        }
        this.f9401OoooOoO = f2 + i;
        this.f9403Ooooo00 = true;
        this.f9420o0OoOo0.setAlpha(76);
    }

    public final void OooOOo0(Animation.AnimationListener animationListener) {
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f9413o00O0O = oooO0O0;
        oooO0O0.setDuration(150L);
        o0ooOOo o0ooooo2 = this.f9406OooooOO;
        o0ooooo2.f29319Oooo0o = animationListener;
        o0ooooo2.clearAnimation();
        this.f9406OooooOO.startAnimation(this.f9413o00O0O);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f9393OoooO.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f9393OoooO.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f9393OoooO.OooO0OO(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f9393OoooO.OooO0o(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f9407OooooOo;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o00Ooo o00ooo2 = this.f9396OoooO0O;
        return o00ooo2.f28129OooO0O0 | o00ooo2.f28128OooO00o;
    }

    public int getProgressCircleDiameter() {
        return this.f9419o00ooo;
    }

    public int getProgressViewEndOffset() {
        return this.f9410OoooooO;
    }

    public int getProgressViewStartOffset() {
        return this.f9408Oooooo;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9393OoooO.OooO(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9393OoooO.f28126OooO0Oo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0oO();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OooO0O0();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || OooO00o() || this.f9392Oooo0oo || this.f9398OoooOOO) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f9408Oooooo - this.f9406OooooOO.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f9404Ooooo0o = pointerId;
            this.f9403Ooooo00 = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f9402OoooOoo = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f9403Ooooo00 = false;
            this.f9404Ooooo0o = -1;
        } else if (actionMasked == 2) {
            int i = this.f9404Ooooo0o;
            if (i == -1) {
                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            OooOOOo(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f9403Ooooo00 = false;
            this.f9404Ooooo0o = -1;
        } else if (actionMasked == 6) {
            OooO0o(motionEvent);
        }
        return this.f9403Ooooo00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f9390Oooo0o == null) {
            OooO0O0();
        }
        View view = this.f9390Oooo0o;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f9406OooooOO.getMeasuredWidth();
        int measuredHeight2 = this.f9406OooooOO.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f9400OoooOo0;
        this.f9406OooooOO.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9390Oooo0o == null) {
            OooO0O0();
        }
        View view = this.f9390Oooo0o;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f9406OooooOO.measure(View.MeasureSpec.makeMeasureSpec(this.f9419o00ooo, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9419o00ooo, 1073741824));
        this.f9407OooooOo = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f9406OooooOO) {
                this.f9407OooooOo = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f9394OoooO0;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f9394OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    this.f9394OoooO0 = f - f2;
                    iArr[1] = i2;
                }
                OooO0Oo(this.f9394OoooO0);
            }
        }
        int[] iArr2 = this.f9397OoooOO0;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f9412o000oOoO);
        int i5 = i4 + this.f9412o000oOoO[1];
        if (i5 >= 0 || OooO00o()) {
            return;
        }
        float fAbs = this.f9394OoooO0 + Math.abs(i5);
        this.f9394OoooO0 = fAbs;
        OooO0Oo(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f9396OoooO0O.OooO00o(i, 0);
        startNestedScroll(i & 2);
        this.f9394OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f9398OoooOOO = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f9392Oooo0oo || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f9396OoooO0O.OooO0O0(0);
        this.f9398OoooOOO = false;
        float f = this.f9394OoooO0;
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            OooO0OO(f);
            this.f9394OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || OooO00o() || this.f9392Oooo0oo || this.f9398OoooOOO) {
            return false;
        }
        if (actionMasked == 0) {
            this.f9404Ooooo0o = motionEvent.getPointerId(0);
            this.f9403Ooooo00 = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9404Ooooo0o);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f9403Ooooo00) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f9401OoooOoO) * 0.5f;
                    this.f9403Ooooo00 = false;
                    OooO0OO(y);
                }
                this.f9404Ooooo0o = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f9404Ooooo0o);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                OooOOOo(y2);
                if (this.f9403Ooooo00) {
                    float f = (y2 - this.f9401OoooOoO) * 0.5f;
                    if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        return false;
                    }
                    OooO0Oo(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f9404Ooooo0o = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    OooO0o(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f9390Oooo0o;
        if (view != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (!ViewCompat.OooOOO.OooOOOo(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f9406OooooOO.setScaleX(f);
        this.f9406OooooOO.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        OooO0O0();
        CircularProgressDrawable circularProgressDrawable = this.f9420o0OoOo0;
        CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f9358Oooo0o;
        oooO00o.f9363OooO = iArr;
        oooO00o.OooO00o(0);
        circularProgressDrawable.f9358Oooo0o.OooO00o(0);
        circularProgressDrawable.invalidateSelf();
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = o000O000.OooO00o.OooO0O0(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f9395OoooO00 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        OooO0oO();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f9393OoooO.OooOO0(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OooOO0O oooOO0O) {
        this.f9422oo000o = oooOO0O;
    }

    public void setOnRefreshListener(@Nullable OooOOO0 oooOOO0) {
        this.f9391Oooo0oO = oooOOO0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.f9406OooooOO.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(o000O000.OooO00o.OooO0O0(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f9392Oooo0oo == z) {
            OooO0oo(z, false);
            return;
        }
        this.f9392Oooo0oo = z;
        setTargetOffsetTopAndBottom((this.f9410OoooooO + this.f9408Oooooo) - this.f9400OoooOo0);
        this.f9416o00o0O = false;
        OooO00o oooO00o = this.f9418o00oO0o;
        this.f9406OooooOO.setVisibility(0);
        this.f9420o0OoOo0.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        o0OOO0o o0ooo0o2 = new o0OOO0o(this);
        this.f9423ooOO = o0ooo0o2;
        o0ooo0o2.setDuration(this.f9399OoooOOo);
        if (oooO00o != null) {
            this.f9406OooooOO.f29319Oooo0o = oooO00o;
        }
        this.f9406OooooOO.clearAnimation();
        this.f9406OooooOO.startAnimation(this.f9423ooOO);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f9419o00ooo = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f9419o00ooo = (int) (displayMetrics.density * 40.0f);
            }
            this.f9406OooooOO.setImageDrawable(null);
            this.f9420o0OoOo0.OooO0OO(i);
            this.f9406OooooOO.setImageDrawable(this.f9420o0OoOo0);
        }
    }

    public void setSlingshotDistance(@Px int i) {
        this.f9411Ooooooo = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f9406OooooOO.bringToFront();
        ViewCompat.OooOOOo(this.f9406OooooOO, i);
        this.f9400OoooOo0 = this.f9406OooooOO.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f9393OoooO.OooOO0o(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f9393OoooO.OooOOO0(0);
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9392Oooo0oo = false;
        this.f9395OoooO00 = -1.0f;
        this.f9397OoooOO0 = new int[2];
        this.f9412o000oOoO = new int[2];
        this.f9404Ooooo0o = -1;
        this.f9407OooooOo = -1;
        this.f9418o00oO0o = new OooO00o();
        this.f9417o00oO0O = new OooO();
        this.f9421o0ooOO0 = new OooOO0();
        this.f9389Oooo = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f9399OoooOOo = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f9405OooooO0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f9419o00ooo = (int) (displayMetrics.density * 40.0f);
        this.f9406OooooOO = new o0ooOOo(getContext());
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.f9420o0OoOo0 = circularProgressDrawable;
        circularProgressDrawable.OooO0OO(1);
        this.f9406OooooOO.setImageDrawable(this.f9420o0OoOo0);
        this.f9406OooooOO.setVisibility(8);
        addView(this.f9406OooooOO);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f9410OoooooO = i;
        this.f9395OoooO00 = i;
        this.f9396OoooO0O = new o00Ooo();
        this.f9393OoooO = new o000oOoO(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f9419o00ooo;
        this.f9400OoooOo0 = i2;
        this.f9408Oooooo = i2;
        OooO0o0(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9388o0ooOOo);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
