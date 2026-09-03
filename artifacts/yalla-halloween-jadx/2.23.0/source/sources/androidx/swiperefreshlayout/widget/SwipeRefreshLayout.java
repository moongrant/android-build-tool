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
import androidx.compose.animation.o000oOoO;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000000;
import androidx.core.view.o000O0Oo;
import androidx.core.view.o000OOo;
import androidx.core.view.o0OO00O;
import androidx.core.view.o0Oo0oo;
import androidx.core.widget.OooOOO0;
import com.yalla.yalla.ui.activity.user.MedalRankActivity;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;
import p377o0OOoOo.o0000O;
import p496o0o00o.o00O000;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements o000OOo, o0Oo0oo {

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final int[] f8043Oooo0o0 = {R.attr.enabled};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f8044OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f8045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f8046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOO0 f8047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f8049OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000000 f8050OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OO00O f8051OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int[] f8052OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f8053OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int[] f8054OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f8055OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8056OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f8057OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f8058OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f8059OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f8060OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final DecelerateInterpolator f8061OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f8062OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o000OOoO.OooO00o f8063OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f8064OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f8065OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f8066OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f8067OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o000OOoO.OooO0O0 f8068OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public CircularProgressDrawable f8069OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o000OOoO.OooO0OO f8070OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public o000OOoO.OooO0o f8071OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final OooO00o f8072Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public o000OOoO.OooO0o f8073Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f8074Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f8075Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO0OO f8076Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO0o f8077Oooo0OO;

    public interface OooO {
    }

    public class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            OooOO0 oooOO1;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f8046OooO0o) {
                swipeRefreshLayout.OooO0o();
                return;
            }
            swipeRefreshLayout.f8069OooOoo0.setAlpha(255);
            swipeRefreshLayout.f8069OooOoo0.start();
            if (swipeRefreshLayout.f8074Oooo00O && (oooOO1 = swipeRefreshLayout.f8047OooO0o0) != null) {
                int i = MedalRankActivity.f27113OooOo0O;
                MedalRankActivity medalRankActivity = MedalRankActivity.this;
                SwipeRefreshLayout swipeRefreshLayout2 = medalRankActivity.f27114OooOOo;
                if (!swipeRefreshLayout2.f8046OooO0o) {
                    swipeRefreshLayout2.setRefreshing(true);
                }
                com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44126Ooooo0o, oO00o000.OooO00o(), new o00O000(medalRankActivity, medalRankActivity));
            }
            swipeRefreshLayout.f8056OooOOOo = swipeRefreshLayout.f8063OooOo0O.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class OooO0O0 implements Animation.AnimationListener {
        public OooO0O0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            o000OOoO.OooO0OO oooO0OO = new o000OOoO.OooO0OO(swipeRefreshLayout);
            swipeRefreshLayout.f8070OooOooO = oooO0OO;
            oooO0OO.setDuration(150L);
            o000OOoO.OooO00o oooO00o = swipeRefreshLayout.f8063OooOo0O;
            oooO00o.f34897OooO0Oo = null;
            oooO00o.clearAnimation();
            swipeRefreshLayout.f8063OooOo0O.startAnimation(swipeRefreshLayout.f8070OooOooO);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class OooO0OO extends Animation {
        public OooO0OO() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            int iAbs = swipeRefreshLayout.f8065OooOoO - Math.abs(swipeRefreshLayout.f8066OooOoO0);
            int i = swipeRefreshLayout.f8060OooOo;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.f8063OooOo0O.getTop());
            CircularProgressDrawable circularProgressDrawable = swipeRefreshLayout.f8069OooOoo0;
            float f2 = 1.0f - f;
            CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f8013OooO0Oo;
            if (f2 != oooO00o.f8033OooOOOo) {
                oooO00o.f8033OooOOOo = f2;
            }
            circularProgressDrawable.invalidateSelf();
        }
    }

    public class OooO0o extends Animation {
        public OooO0o() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.OooO0o0(f);
        }
    }

    public interface OooOO0 {
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.f8063OooOo0O.getBackground().setAlpha(i);
        this.f8069OooOoo0.setAlpha(i);
    }

    public final boolean OooO00o() {
        View view = this.f8045OooO0Oo;
        return view instanceof ListView ? OooOOO0.OooO00o((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void OooO0O0() {
        if (this.f8045OooO0Oo == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f8063OooOo0O)) {
                    this.f8045OooO0Oo = childAt;
                    return;
                }
            }
        }
    }

    public final void OooO0OO(float f) {
        if (f > this.f8049OooO0oo) {
            OooO0oO(true, true);
            return;
        }
        this.f8046OooO0o = false;
        CircularProgressDrawable circularProgressDrawable = this.f8069OooOoo0;
        CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f8013OooO0Oo;
        oooO00o.f8024OooO0o0 = 0.0f;
        oooO00o.f8023OooO0o = 0.0f;
        circularProgressDrawable.invalidateSelf();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f8060OooOo = this.f8056OooOOOo;
        OooO0o oooO0o = this.f8077Oooo0OO;
        oooO0o.reset();
        oooO0o.setDuration(200L);
        oooO0o.setInterpolator(this.f8061OooOo0);
        o000OOoO.OooO00o oooO00o2 = this.f8063OooOo0O;
        oooO00o2.f34897OooO0Oo = oooO0O0;
        oooO00o2.clearAnimation();
        this.f8063OooOo0O.startAnimation(oooO0o);
        CircularProgressDrawable circularProgressDrawable2 = this.f8069OooOoo0;
        CircularProgressDrawable.OooO00o oooO00o3 = circularProgressDrawable2.f8013OooO0Oo;
        if (oooO00o3.f8030OooOOO) {
            oooO00o3.f8030OooOOO = false;
        }
        circularProgressDrawable2.invalidateSelf();
    }

    public final void OooO0Oo(float f) {
        CircularProgressDrawable circularProgressDrawable = this.f8069OooOoo0;
        CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f8013OooO0Oo;
        if (!oooO00o.f8030OooOOO) {
            oooO00o.f8030OooOOO = true;
        }
        circularProgressDrawable.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f8049OooO0oo));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f8049OooO0oo;
        int i = this.f8067OooOoOO;
        if (i <= 0) {
            i = this.f8065OooOoO;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f8066OooOoO0 + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f8063OooOo0O.getVisibility() != 0) {
            this.f8063OooOo0O.setVisibility(0);
        }
        this.f8063OooOo0O.setScaleX(1.0f);
        this.f8063OooOo0O.setScaleY(1.0f);
        if (f < this.f8049OooO0oo) {
            if (this.f8069OooOoo0.f8013OooO0Oo.f8038OooOo00 > 76) {
                o000OOoO.OooO0o oooO0o = this.f8071OooOooo;
                if (!((oooO0o == null || !oooO0o.hasStarted() || oooO0o.hasEnded()) ? false : true)) {
                    o000OOoO.OooO0o oooO0o2 = new o000OOoO.OooO0o(this, this.f8069OooOoo0.f8013OooO0Oo.f8038OooOo00, 76);
                    oooO0o2.setDuration(300L);
                    o000OOoO.OooO00o oooO00o2 = this.f8063OooOo0O;
                    oooO00o2.f34897OooO0Oo = null;
                    oooO00o2.clearAnimation();
                    this.f8063OooOo0O.startAnimation(oooO0o2);
                    this.f8071OooOooo = oooO0o2;
                }
            }
        } else if (this.f8069OooOoo0.f8013OooO0Oo.f8038OooOo00 < 255) {
            o000OOoO.OooO0o oooO0o3 = this.f8073Oooo000;
            if (!((oooO0o3 == null || !oooO0o3.hasStarted() || oooO0o3.hasEnded()) ? false : true)) {
                o000OOoO.OooO0o oooO0o4 = new o000OOoO.OooO0o(this, this.f8069OooOoo0.f8013OooO0Oo.f8038OooOo00, 255);
                oooO0o4.setDuration(300L);
                o000OOoO.OooO00o oooO00o3 = this.f8063OooOo0O;
                oooO00o3.f34897OooO0Oo = null;
                oooO00o3.clearAnimation();
                this.f8063OooOo0O.startAnimation(oooO0o4);
                this.f8073Oooo000 = oooO0o4;
            }
        }
        CircularProgressDrawable circularProgressDrawable2 = this.f8069OooOoo0;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        CircularProgressDrawable.OooO00o oooO00o4 = circularProgressDrawable2.f8013OooO0Oo;
        oooO00o4.f8024OooO0o0 = 0.0f;
        oooO00o4.f8023OooO0o = fMin2;
        circularProgressDrawable2.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable3 = this.f8069OooOoo0;
        float fMin3 = Math.min(1.0f, fMax);
        CircularProgressDrawable.OooO00o oooO00o5 = circularProgressDrawable3.f8013OooO0Oo;
        if (fMin3 != oooO00o5.f8033OooOOOo) {
            oooO00o5.f8033OooOOOo = fMin3;
        }
        circularProgressDrawable3.invalidateSelf();
        float fOooO00o = o000oOoO.OooO00o(fPow, 2.0f, (fMax * 0.4f) - 0.25f, 0.5f);
        CircularProgressDrawable circularProgressDrawable4 = this.f8069OooOoo0;
        circularProgressDrawable4.f8013OooO0Oo.f8025OooO0oO = fOooO00o;
        circularProgressDrawable4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f8056OooOOOo);
    }

    public final void OooO0o() {
        this.f8063OooOo0O.clearAnimation();
        this.f8069OooOoo0.stop();
        this.f8063OooOo0O.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f8066OooOoO0 - this.f8056OooOOOo);
        this.f8056OooOOOo = this.f8063OooOo0O.getTop();
    }

    public final void OooO0o0(float f) {
        int i = this.f8060OooOo;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f8066OooOoO0 - i) * f))) - this.f8063OooOo0O.getTop());
    }

    public final void OooO0oO(boolean z, boolean z2) {
        if (this.f8046OooO0o != z) {
            this.f8074Oooo00O = z2;
            OooO0O0();
            this.f8046OooO0o = z;
            OooO00o oooO00o = this.f8072Oooo0;
            if (!z) {
                o000OOoO.OooO0OO oooO0OO = new o000OOoO.OooO0OO(this);
                this.f8070OooOooO = oooO0OO;
                oooO0OO.setDuration(150L);
                o000OOoO.OooO00o oooO00o2 = this.f8063OooOo0O;
                oooO00o2.f34897OooO0Oo = oooO00o;
                oooO00o2.clearAnimation();
                this.f8063OooOo0O.startAnimation(this.f8070OooOooO);
                return;
            }
            this.f8060OooOo = this.f8056OooOOOo;
            OooO0OO oooO0OO2 = this.f8076Oooo0O0;
            oooO0OO2.reset();
            oooO0OO2.setDuration(200L);
            oooO0OO2.setInterpolator(this.f8061OooOo0);
            if (oooO00o != null) {
                this.f8063OooOo0O.f34897OooO0Oo = oooO00o;
            }
            this.f8063OooOo0O.clearAnimation();
            this.f8063OooOo0O.startAnimation(oooO0OO2);
        }
    }

    public final void OooO0oo(float f) {
        float f2 = this.f8057OooOOo;
        float f3 = f - f2;
        int i = this.f8048OooO0oO;
        if (f3 <= i || this.f8059OooOOoo) {
            return;
        }
        this.f8058OooOOo0 = f2 + i;
        this.f8059OooOOoo = true;
        this.f8069OooOoo0.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f8051OooOO0O.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f8051OooOO0O.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f8051OooOO0O.OooO0OO(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f8051OooOO0O.OooO0o0(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f8064OooOo0o;
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
        o000000 o000000Var = this.f8050OooOO0;
        return o000000Var.f5414OooO0O0 | o000000Var.f5413OooO00o;
    }

    public int getProgressCircleDiameter() {
        return this.f8075Oooo00o;
    }

    public int getProgressViewEndOffset() {
        return this.f8065OooOoO;
    }

    public int getProgressViewStartOffset() {
        return this.f8066OooOoO0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f8051OooOO0O.OooO0oo(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f8051OooOO0O.f5447OooO0Oo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0o();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OooO0O0();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || OooO00o() || this.f8046OooO0o || this.f8053OooOOO) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f8066OooOoO0 - this.f8063OooOo0O.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f8062OooOo00 = pointerId;
            this.f8059OooOOoo = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f8057OooOOo = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f8059OooOOoo = false;
            this.f8062OooOo00 = -1;
        } else if (actionMasked == 2) {
            int i = this.f8062OooOo00;
            if (i == -1) {
                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            OooO0oo(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f8059OooOOoo = false;
            this.f8062OooOo00 = -1;
        } else if (actionMasked == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.f8062OooOo00) {
                this.f8062OooOo00 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
            }
        }
        return this.f8059OooOOoo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f8045OooO0Oo == null) {
            OooO0O0();
        }
        View view = this.f8045OooO0Oo;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f8063OooOo0O.getMeasuredWidth();
        int measuredHeight2 = this.f8063OooOo0O.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f8056OooOOOo;
        this.f8063OooOo0O.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f8045OooO0Oo == null) {
            OooO0O0();
        }
        View view = this.f8045OooO0Oo;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), Pow2.MAX_POW2));
        this.f8063OooOo0O.measure(View.MeasureSpec.makeMeasureSpec(this.f8075Oooo00o, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(this.f8075Oooo00o, Pow2.MAX_POW2));
        this.f8064OooOo0o = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f8063OooOo0O) {
                this.f8064OooOo0o = i3;
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
            float f = this.f8044OooO;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f8044OooO = 0.0f;
                } else {
                    this.f8044OooO = f - f2;
                    iArr[1] = i2;
                }
                OooO0Oo(this.f8044OooO);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f8052OooOO0o;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f8054OooOOO0);
        int i5 = i4 + this.f8054OooOOO0[1];
        if (i5 >= 0 || OooO00o()) {
            return;
        }
        float fAbs = this.f8044OooO + Math.abs(i5);
        this.f8044OooO = fAbs;
        OooO0Oo(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f8050OooOO0.OooO00o(i, 0);
        startNestedScroll(i & 2);
        this.f8044OooO = 0.0f;
        this.f8053OooOOO = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f8046OooO0o || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f8050OooOO0.OooO0O0(0);
        this.f8053OooOOO = false;
        float f = this.f8044OooO;
        if (f > 0.0f) {
            OooO0OO(f);
            this.f8044OooO = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || OooO00o() || this.f8046OooO0o || this.f8053OooOOO) {
            return false;
        }
        if (actionMasked == 0) {
            this.f8062OooOo00 = motionEvent.getPointerId(0);
            this.f8059OooOOoo = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f8062OooOo00);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f8059OooOOoo) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f8058OooOOo0) * 0.5f;
                    this.f8059OooOOoo = false;
                    OooO0OO(y);
                }
                this.f8062OooOo00 = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f8062OooOo00);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                OooO0oo(y2);
                if (this.f8059OooOOoo) {
                    float f = (y2 - this.f8058OooOOo0) * 0.5f;
                    if (f <= 0.0f) {
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
                    this.f8062OooOo00 = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f8062OooOo00) {
                        this.f8062OooOo00 = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f8045OooO0Oo;
        if (view != null) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (!ViewCompat.OooOOO.OooOOOo(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f8063OooOo0O.setScaleX(f);
        this.f8063OooOo0O.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        OooO0O0();
        CircularProgressDrawable circularProgressDrawable = this.f8069OooOoo0;
        CircularProgressDrawable.OooO00o oooO00o = circularProgressDrawable.f8013OooO0Oo;
        oooO00o.f8018OooO = iArr;
        oooO00o.OooO00o(0);
        oooO00o.OooO00o(0);
        circularProgressDrawable.invalidateSelf();
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            Object obj = ContextCompat.f5271OooO00o;
            iArr2[i] = ContextCompat.OooO0o.OooO00o(context, i2);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f8049OooO0oo = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        OooO0o();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f8051OooOO0O.OooO(z);
    }

    public void setOnChildScrollUpCallback(@Nullable OooO oooO) {
    }

    public void setOnRefreshListener(@Nullable OooOO0 oooOO1) {
        this.f8047OooO0o0 = oooOO1;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.f8063OooOo0O.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5271OooO00o;
        setProgressBackgroundColorSchemeColor(ContextCompat.OooO0o.OooO00o(context, i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f8046OooO0o == z) {
            OooO0oO(z, false);
            return;
        }
        this.f8046OooO0o = z;
        setTargetOffsetTopAndBottom((this.f8065OooOoO + this.f8066OooOoO0) - this.f8056OooOOOo);
        this.f8074Oooo00O = false;
        this.f8063OooOo0O.setVisibility(0);
        this.f8069OooOoo0.setAlpha(255);
        o000OOoO.OooO0O0 oooO0O0 = new o000OOoO.OooO0O0(this);
        this.f8068OooOoo = oooO0O0;
        oooO0O0.setDuration(this.f8055OooOOOO);
        OooO00o oooO00o = this.f8072Oooo0;
        if (oooO00o != null) {
            this.f8063OooOo0O.f34897OooO0Oo = oooO00o;
        }
        this.f8063OooOo0O.clearAnimation();
        this.f8063OooOo0O.startAnimation(this.f8068OooOoo);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f8075Oooo00o = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f8075Oooo00o = (int) (displayMetrics.density * 40.0f);
            }
            this.f8063OooOo0O.setImageDrawable(null);
            this.f8069OooOoo0.OooO0OO(i);
            this.f8063OooOo0O.setImageDrawable(this.f8069OooOoo0);
        }
    }

    public void setSlingshotDistance(@Px int i) {
        this.f8067OooOoOO = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f8063OooOo0O.bringToFront();
        o000OOoO.OooO00o oooO00o = this.f8063OooOo0O;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        oooO00o.offsetTopAndBottom(i);
        this.f8056OooOOOo = this.f8063OooOo0O.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f8051OooOO0O.OooOO0(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f8051OooOO0O.OooOO0O(0);
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8046OooO0o = false;
        this.f8049OooO0oo = -1.0f;
        this.f8052OooOO0o = new int[2];
        this.f8054OooOOO0 = new int[2];
        this.f8062OooOo00 = -1;
        this.f8064OooOo0o = -1;
        this.f8072Oooo0 = new OooO00o();
        this.f8076Oooo0O0 = new OooO0OO();
        this.f8077Oooo0OO = new OooO0o();
        this.f8048OooO0oO = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f8055OooOOOO = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f8061OooOo0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f8075Oooo00o = (int) (displayMetrics.density * 40.0f);
        this.f8063OooOo0O = new o000OOoO.OooO00o(getContext());
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.f8069OooOoo0 = circularProgressDrawable;
        circularProgressDrawable.OooO0OO(1);
        this.f8063OooOo0O.setImageDrawable(this.f8069OooOoo0);
        this.f8063OooOo0O.setVisibility(8);
        addView(this.f8063OooOo0O);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f8065OooOoO = i;
        this.f8049OooO0oo = i;
        this.f8050OooOO0 = new o000000();
        this.f8051OooOO0O = new o0OO00O(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f8075Oooo00o;
        this.f8056OooOOOo = i2;
        this.f8066OooOoO0 = i2;
        OooO0o0(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8043Oooo0o0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
