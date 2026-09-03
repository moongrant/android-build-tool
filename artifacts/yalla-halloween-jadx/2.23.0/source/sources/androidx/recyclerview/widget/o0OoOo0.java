package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p579o0oOoo.oOO0Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends RecyclerView.OooOo implements RecyclerView.Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f7824OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f7828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f7829OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f7830OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f7831OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f7832OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f7833OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f7834OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final OooO0o f7837OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f7838OooOOOO;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f7840OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f7841OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public androidx.core.view.Oooo0 f7843OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList f7844OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public VelocityTracker f7845OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ArrayList f7846OooOo0O;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO f7849OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Rect f7850OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f7851OooOoo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f7825OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f7826OooO0O0 = new float[2];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public RecyclerView.o0O0O00 f7827OooO0OO = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f7835OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f7836OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayList f7839OooOOOo = new ArrayList();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO00o f7842OooOOoo = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f7847OooOo0o = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0O0 f7848OooOoO = new OooO0O0();

    public class OooO extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7852OooO0Oo = true;

        public OooO() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            o0OoOo0 o0oooo0;
            View viewOooO0oo;
            RecyclerView.o0O0O00 childViewHolder;
            int i;
            if (!this.f7852OooO0Oo || (viewOooO0oo = (o0oooo0 = o0OoOo0.this).OooO0oo(motionEvent)) == null || (childViewHolder = o0oooo0.f7840OooOOo.getChildViewHolder(viewOooO0oo)) == null) {
                return;
            }
            RecyclerView recyclerView = o0oooo0.f7840OooOOo;
            OooO0o oooO0o = o0oooo0.f7837OooOOO0;
            int iOooO0O0 = oooO0o.OooO0O0(recyclerView, childViewHolder);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            int iOooO0Oo = ViewCompat.OooO.OooO0Oo(recyclerView);
            int i2 = iOooO0O0 & 3158064;
            if (i2 != 0) {
                int i3 = iOooO0O0 & (~i2);
                if (iOooO0Oo == 0) {
                    i = i2 >> 2;
                } else {
                    int i4 = i2 >> 1;
                    i3 |= (-3158065) & i4;
                    i = (i4 & 3158064) >> 2;
                }
                iOooO0O0 = i3 | i;
            }
            if ((16711680 & iOooO0O0) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i5 = o0oooo0.f7835OooOO0o;
                if (pointerId == i5) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i5);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    o0oooo0.f7828OooO0Oo = x;
                    o0oooo0.f7830OooO0o0 = y;
                    o0oooo0.f7824OooO = 0.0f;
                    o0oooo0.f7832OooO0oo = 0.0f;
                    if (oooO0o.OooO0Oo()) {
                        o0oooo0.OooOOO0(childViewHolder, 2);
                    }
                }
            }
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        @Override // java.lang.Runnable
        public final void run() {
            int iOooO0OO;
            int iOooO0OO2;
            int i;
            o0OoOo0 o0oooo0 = o0OoOo0.this;
            if (o0oooo0.f7827OooO0OO != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = o0oooo0.f7851OooOoo0;
                long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                RecyclerView.Oooo000 layoutManager = o0oooo0.f7840OooOOo.getLayoutManager();
                if (o0oooo0.f7850OooOoOO == null) {
                    o0oooo0.f7850OooOoOO = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(o0oooo0.f7827OooO0OO.itemView, o0oooo0.f7850OooOoOO);
                boolean z = false;
                if (layoutManager.canScrollHorizontally()) {
                    int i2 = (int) (o0oooo0.f7833OooOO0 + o0oooo0.f7832OooO0oo);
                    iOooO0OO = (i2 - o0oooo0.f7850OooOoOO.left) - o0oooo0.f7840OooOOo.getPaddingLeft();
                    float f = o0oooo0.f7832OooO0oo;
                    if ((f >= 0.0f || iOooO0OO >= 0) && (f <= 0.0f || (iOooO0OO = ((o0oooo0.f7827OooO0OO.itemView.getWidth() + i2) + o0oooo0.f7850OooOoOO.right) - (o0oooo0.f7840OooOOo.getWidth() - o0oooo0.f7840OooOOo.getPaddingRight())) <= 0)) {
                        iOooO0OO = 0;
                    }
                } else {
                    iOooO0OO = 0;
                }
                if (layoutManager.canScrollVertically()) {
                    int i3 = (int) (o0oooo0.f7834OooOO0O + o0oooo0.f7824OooO);
                    int paddingTop = (i3 - o0oooo0.f7850OooOoOO.top) - o0oooo0.f7840OooOOo.getPaddingTop();
                    float f2 = o0oooo0.f7824OooO;
                    if ((f2 >= 0.0f || paddingTop >= 0) && (f2 <= 0.0f || (paddingTop = ((o0oooo0.f7827OooO0OO.itemView.getHeight() + i3) + o0oooo0.f7850OooOoOO.bottom) - (o0oooo0.f7840OooOOo.getHeight() - o0oooo0.f7840OooOOo.getPaddingBottom())) <= 0)) {
                        iOooO0OO2 = 0;
                    } else {
                        iOooO0OO2 = paddingTop;
                    }
                } else {
                    iOooO0OO2 = 0;
                }
                if (iOooO0OO != 0) {
                    OooO0o oooO0o = o0oooo0.f7837OooOOO0;
                    RecyclerView recyclerView = o0oooo0.f7840OooOOo;
                    int width = o0oooo0.f7827OooO0OO.itemView.getWidth();
                    o0oooo0.f7840OooOOo.getWidth();
                    iOooO0OO = oooO0o.OooO0OO(recyclerView, width, iOooO0OO, j2);
                }
                int i4 = iOooO0OO;
                if (iOooO0OO2 != 0) {
                    OooO0o oooO0o2 = o0oooo0.f7837OooOOO0;
                    RecyclerView recyclerView2 = o0oooo0.f7840OooOOo;
                    int height = o0oooo0.f7827OooO0OO.itemView.getHeight();
                    o0oooo0.f7840OooOOo.getHeight();
                    i = i4;
                    iOooO0OO2 = oooO0o2.OooO0OO(recyclerView2, height, iOooO0OO2, j2);
                } else {
                    i = i4;
                }
                if (i == 0 && iOooO0OO2 == 0) {
                    o0oooo0.f7851OooOoo0 = Long.MIN_VALUE;
                } else {
                    if (o0oooo0.f7851OooOoo0 == Long.MIN_VALUE) {
                        o0oooo0.f7851OooOoo0 = jCurrentTimeMillis;
                    }
                    o0oooo0.f7840OooOOo.scrollBy(i, iOooO0OO2);
                    z = true;
                }
                if (z) {
                    RecyclerView.o0O0O00 o0o0o00 = o0oooo0.f7827OooO0OO;
                    if (o0o0o00 != null) {
                        o0oooo0.OooOO0O(o0o0o00);
                    }
                    o0oooo0.f7840OooOOo.removeCallbacks(o0oooo0.f7842OooOOoo);
                    RecyclerView recyclerView3 = o0oooo0.f7840OooOOo;
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    ViewCompat.OooO0o.OooOOO0(recyclerView3, this);
                }
            }
        }
    }

    public class OooO0O0 implements RecyclerView.o0OoOo0 {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
        public final void OooO00o(boolean z) {
            if (z) {
                o0OoOo0.this.OooOOO0(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
        public final void OooO0O0(@NonNull MotionEvent motionEvent) {
            o0OoOo0 o0oooo0 = o0OoOo0.this;
            o0oooo0.f7843OooOo.f5331OooO00o.f5332OooO00o.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = o0oooo0.f7845OooOo00;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o0oooo0.f7835OooOO0o == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(o0oooo0.f7835OooOO0o);
            if (iFindPointerIndex >= 0) {
                o0oooo0.OooO0o0(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.o0O0O00 o0o0o00 = o0oooo0.f7827OooO0OO;
            if (o0o0o00 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        o0oooo0.OooOOO(o0oooo0.f7838OooOOOO, iFindPointerIndex, motionEvent);
                        o0oooo0.OooOO0O(o0o0o00);
                        RecyclerView recyclerView = o0oooo0.f7840OooOOo;
                        OooO00o oooO00o = o0oooo0.f7842OooOOoo;
                        recyclerView.removeCallbacks(oooO00o);
                        oooO00o.run();
                        o0oooo0.f7840OooOOo.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == o0oooo0.f7835OooOO0o) {
                        o0oooo0.f7835OooOO0o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o0oooo0.OooOOO(o0oooo0.f7838OooOOOO, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = o0oooo0.f7845OooOo00;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            o0oooo0.OooOOO0(null, 0);
            o0oooo0.f7835OooOO0o = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
        public final boolean OooO0OO(@NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            o0OoOo0 o0oooo0 = o0OoOo0.this;
            o0oooo0.f7843OooOo.f5331OooO00o.f5332OooO00o.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            OooOO0 oooOO1 = null;
            if (actionMasked == 0) {
                o0oooo0.f7835OooOO0o = motionEvent.getPointerId(0);
                o0oooo0.f7828OooO0Oo = motionEvent.getX();
                o0oooo0.f7830OooO0o0 = motionEvent.getY();
                VelocityTracker velocityTracker = o0oooo0.f7845OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                o0oooo0.f7845OooOo00 = VelocityTracker.obtain();
                if (o0oooo0.f7827OooO0OO == null) {
                    ArrayList arrayList = o0oooo0.f7839OooOOOo;
                    if (!arrayList.isEmpty()) {
                        View viewOooO0oo = o0oooo0.OooO0oo(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            OooOO0 oooOO2 = (OooOO0) arrayList.get(size);
                            if (oooOO2.f7866OooO0oo.itemView == viewOooO0oo) {
                                oooOO1 = oooOO2;
                                break;
                            }
                        }
                    }
                    if (oooOO1 != null) {
                        o0oooo0.f7828OooO0Oo -= oooOO1.f7869OooOO0o;
                        o0oooo0.f7830OooO0o0 -= oooOO1.f7871OooOOO0;
                        RecyclerView.o0O0O00 o0o0o00 = oooOO1.f7866OooO0oo;
                        o0oooo0.OooO0oO(o0o0o00, true);
                        if (o0oooo0.f7825OooO00o.remove(o0o0o00.itemView)) {
                            o0oooo0.f7837OooOOO0.getClass();
                            OooO0o.OooO00o(o0o0o00);
                        }
                        o0oooo0.OooOOO0(o0o0o00, oooOO1.f7861OooO);
                        o0oooo0.OooOOO(o0oooo0.f7838OooOOOO, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o0oooo0.f7835OooOO0o = -1;
                o0oooo0.OooOOO0(null, 0);
            } else {
                int i = o0oooo0.f7835OooOO0o;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    o0oooo0.OooO0o0(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = o0oooo0.f7845OooOo00;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return o0oooo0.f7827OooO0OO != null;
        }
    }

    public class OooO0OO extends OooOO0 {

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.o0O0O00 f7856OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f7857OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RecyclerView.o0O0O00 o0o0o00, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.o0O0O00 o0o0o01) {
            super(o0o0o00, i2, f, f2, f3, f4);
            this.f7857OooOOo0 = i3;
            this.f7856OooOOo = o0o0o01;
        }

        @Override // androidx.recyclerview.widget.o0OoOo0.OooOO0, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f7870OooOOO) {
                return;
            }
            int i = this.f7857OooOOo0;
            RecyclerView.o0O0O00 o0o0o00 = this.f7856OooOOo;
            o0OoOo0 o0oooo0 = o0OoOo0.this;
            if (i <= 0) {
                o0oooo0.f7837OooOOO0.getClass();
                OooO0o.OooO00o(o0o0o00);
            } else {
                o0oooo0.f7825OooO00o.add(o0o0o00.itemView);
                this.f7868OooOO0O = true;
                if (i > 0) {
                    o0oooo0.f7840OooOOo.post(new o00O0O(o0oooo0, this, i));
                }
            }
            View view = o0oooo0.f7847OooOo0o;
            View view2 = o0o0o00.itemView;
            if (view == view2) {
                o0oooo0.OooOO0o(view2);
            }
        }
    }

    public static abstract class OooO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f7859OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7860OooO00o = -1;

        public class OooO00o implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        public class OooO0O0 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        static {
            new OooO00o();
            f7859OooO0O0 = new OooO0O0();
        }

        public static void OooO00o(@NonNull RecyclerView.o0O0O00 o0o0o00) {
            View view = o0o0o00.itemView;
            int i = o000OO0O.OooO0OO.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOOO.OooOOoo(view, fFloatValue);
            }
            view.setTag(i, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public static void OooO0o0(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0O0O00 o0o0o00, float f, float f2, boolean z) {
            View view = o0o0o00.itemView;
            if (z && view.getTag(o000OO0O.OooO0OO.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                Float fValueOf = Float.valueOf(ViewCompat.OooOOO.OooO(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != view) {
                        WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                        float fOooO = ViewCompat.OooOOO.OooO(childAt);
                        if (fOooO > f3) {
                            f3 = fOooO;
                        }
                    }
                }
                ViewCompat.OooOOO.OooOOoo(view, f3 + 1.0f);
                view.setTag(o000OO0O.OooO0OO.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public abstract int OooO0O0(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0O0O00 o0o0o00);

        public final int OooO0OO(@NonNull RecyclerView recyclerView, int i, int i2, long j) {
            if (this.f7860OooO00o == -1) {
                this.f7860OooO00o = recyclerView.getResources().getDimensionPixelSize(o000OO0O.OooO0O0.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (f7859OooO0O0.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f7860OooO00o);
            float f = j <= 2000 ? j / 2000.0f : 1.0f;
            int i3 = (int) (f * f * f * f * f * interpolation);
            if (i3 == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return i3;
        }

        public abstract boolean OooO0Oo();

        public abstract boolean OooO0o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0O0O00 o0o0o00, @NonNull RecyclerView.o0O0O00 o0o0o01);

        public abstract void OooO0oO(@NonNull RecyclerView.o0O0O00 o0o0o00);
    }

    @VisibleForTesting
    public static class OooOO0 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f7861OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f7862OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f7863OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f7864OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f7865OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final RecyclerView.o0O0O00 f7866OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @VisibleForTesting
        public final ValueAnimator f7867OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f7868OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f7869OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f7871OooOOO0;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public float f7873OooOOOo;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f7870OooOOO = false;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f7872OooOOOO = false;

        public OooOO0(RecyclerView.o0O0O00 o0o0o00, int i, float f, float f2, float f3, float f4) {
            this.f7861OooO = i;
            this.f7866OooO0oo = o0o0o00;
            this.f7862OooO0Oo = f;
            this.f7864OooO0o0 = f2;
            this.f7863OooO0o = f3;
            this.f7865OooO0oO = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7867OooOO0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new o00Oo0(this));
            valueAnimatorOfFloat.setTarget(o0o0o00.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f7873OooOOOo = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f7873OooOOOo = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f7872OooOOOO) {
                this.f7866OooO0oo.setIsRecyclable(true);
            }
            this.f7872OooOOOO = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public interface OooOO0O {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2);
    }

    public o0OoOo0(@NonNull oOO0Oo00 ooo0oo00) {
        this.f7837OooOOO0 = ooo0oo00;
    }

    public static boolean OooOO0(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void OooO(float[] fArr) {
        if ((this.f7838OooOOOO & 12) != 0) {
            fArr[0] = (this.f7833OooOO0 + this.f7832OooO0oo) - this.f7827OooO0OO.itemView.getLeft();
        } else {
            fArr[0] = this.f7827OooO0OO.itemView.getTranslationX();
        }
        if ((this.f7838OooOOOO & 3) != 0) {
            fArr[1] = (this.f7834OooOO0O + this.f7824OooO) - this.f7827OooO0OO.itemView.getTop();
        } else {
            fArr[1] = this.f7827OooO0OO.itemView.getTranslationY();
        }
    }

    public final int OooO0Oo(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f7832OooO0oo > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f7845OooOo00;
        OooO0o oooO0o = this.f7837OooOOO0;
        if (velocityTracker != null && this.f7835OooOO0o > -1) {
            float f = this.f7831OooO0oO;
            oooO0o.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f7845OooOo00.getXVelocity(this.f7835OooOO0o);
            float yVelocity = this.f7845OooOo00.getYVelocity(this.f7835OooOO0o);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f7829OooO0o && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f7840OooOOo.getWidth();
        oooO0o.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f7832OooO0oo) <= f2) {
            return 0;
        }
        return i2;
    }

    public final int OooO0o(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f7824OooO > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f7845OooOo00;
        OooO0o oooO0o = this.f7837OooOOO0;
        if (velocityTracker != null && this.f7835OooOO0o > -1) {
            float f = this.f7831OooO0oO;
            oooO0o.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f7845OooOo00.getXVelocity(this.f7835OooOO0o);
            float yVelocity = this.f7845OooOo00.getYVelocity(this.f7835OooOO0o);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f7829OooO0o && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f7840OooOOo.getHeight();
        oooO0o.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f7824OooO) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    public final void OooO0o0(int i, int i2, MotionEvent motionEvent) {
        RecyclerView.o0O0O00 childViewHolder;
        int i3;
        View viewOooO0oo;
        if (this.f7827OooO0OO == null && i == 2 && this.f7836OooOOO != 2) {
            OooO0o oooO0o = this.f7837OooOOO0;
            oooO0o.getClass();
            if ((!(oooO0o instanceof oOO0Oo00)) && this.f7840OooOOo.getScrollState() != 1) {
                RecyclerView.Oooo000 layoutManager = this.f7840OooOOo.getLayoutManager();
                int i4 = this.f7835OooOO0o;
                if (i4 == -1) {
                    childViewHolder = null;
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                    float x = motionEvent.getX(iFindPointerIndex) - this.f7828OooO0Oo;
                    float y = motionEvent.getY(iFindPointerIndex) - this.f7830OooO0o0;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.f7841OooOOo0;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewOooO0oo = OooO0oo(motionEvent)) != null))) {
                        childViewHolder = this.f7840OooOOo.getChildViewHolder(viewOooO0oo);
                    } else {
                        childViewHolder = null;
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                RecyclerView recyclerView = this.f7840OooOOo;
                int iOooO0O0 = oooO0o.OooO0O0(recyclerView, childViewHolder);
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                int iOooO0Oo = ViewCompat.OooO.OooO0Oo(recyclerView);
                int i5 = iOooO0O0 & 3158064;
                if (i5 != 0) {
                    int i6 = iOooO0O0 & (~i5);
                    if (iOooO0Oo == 0) {
                        i3 = i5 >> 2;
                    } else {
                        int i7 = i5 >> 1;
                        i6 |= (-3158065) & i7;
                        i3 = (i7 & 3158064) >> 2;
                    }
                    iOooO0O0 = i6 | i3;
                }
                int i8 = (iOooO0O0 & 65280) >> 8;
                if (i8 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f7828OooO0Oo;
                float f3 = y2 - this.f7830OooO0o0;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.f7841OooOOo0;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (i8 & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (i8 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (i8 & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (i8 & 2) == 0) {
                            return;
                        }
                    }
                    this.f7824OooO = 0.0f;
                    this.f7832OooO0oo = 0.0f;
                    this.f7835OooOO0o = motionEvent.getPointerId(0);
                    OooOOO0(childViewHolder, 1);
                }
            }
        }
    }

    public final void OooO0oO(RecyclerView.o0O0O00 o0o0o00, boolean z) {
        OooOO0 oooOO1;
        ArrayList arrayList = this.f7839OooOOOo;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                oooOO1 = (OooOO0) arrayList.get(size);
            }
        } while (oooOO1.f7866OooO0oo != o0o0o00);
        oooOO1.f7870OooOOO |= z;
        if (!oooOO1.f7872OooOOOO) {
            oooOO1.f7867OooOO0.cancel();
        }
        arrayList.remove(size);
    }

    public final View OooO0oo(MotionEvent motionEvent) {
        OooOO0 oooOO1;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.o0O0O00 o0o0o00 = this.f7827OooO0OO;
        if (o0o0o00 != null) {
            View view2 = o0o0o00.itemView;
            if (OooOO0(view2, x, y, this.f7833OooOO0 + this.f7832OooO0oo, this.f7834OooOO0O + this.f7824OooO)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f7839OooOOOo;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return this.f7840OooOOo.findChildViewUnder(x, y);
            }
            oooOO1 = (OooOO0) arrayList.get(size);
            view = oooOO1.f7866OooO0oo.itemView;
        } while (!OooOO0(view, x, y, oooOO1.f7869OooOO0o, oooOO1.f7871OooOOO0));
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0O(RecyclerView.o0O0O00 o0o0o00) {
        ArrayList arrayList;
        int i;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        char c;
        if (!this.f7840OooOOo.isLayoutRequested() && this.f7836OooOOO == 2) {
            OooO0o oooO0o = this.f7837OooOOO0;
            oooO0o.getClass();
            int i2 = (int) (this.f7833OooOO0 + this.f7832OooO0oo);
            int i3 = (int) (this.f7834OooOO0O + this.f7824OooO);
            if (Math.abs(i3 - o0o0o00.itemView.getTop()) >= o0o0o00.itemView.getHeight() * 0.5f || Math.abs(i2 - o0o0o00.itemView.getLeft()) >= o0o0o00.itemView.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f7844OooOo0;
                if (arrayList2 == null) {
                    this.f7844OooOo0 = new ArrayList();
                    this.f7846OooOo0O = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f7846OooOo0O.clear();
                }
                int iRound = Math.round(this.f7833OooOO0 + this.f7832OooO0oo) - 0;
                int iRound2 = Math.round(this.f7834OooOO0O + this.f7824OooO) - 0;
                int width = o0o0o00.itemView.getWidth() + iRound + 0;
                int height = o0o0o00.itemView.getHeight() + iRound2 + 0;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                RecyclerView.Oooo000 layoutManager = this.f7840OooOOo.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = layoutManager.getChildAt(i6);
                    if (childAt != o0o0o00.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        RecyclerView.o0O0O00 childViewHolder = this.f7840OooOOo.getChildViewHolder(childAt);
                        c = 2;
                        int iAbs5 = Math.abs(i4 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int iAbs6 = Math.abs(i5 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                        int size = this.f7844OooOo0.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size) {
                            int i10 = size;
                            if (i7 <= ((Integer) this.f7846OooOo0O.get(i8)).intValue()) {
                                break;
                            }
                            i9++;
                            i8++;
                            size = i10;
                        }
                        this.f7844OooOo0.add(i9, childViewHolder);
                        this.f7846OooOo0O.add(i9, Integer.valueOf(i7));
                    } else {
                        c = 2;
                    }
                    i6++;
                    iRound = iRound;
                    iRound2 = iRound2;
                    width = width;
                }
                ArrayList arrayList3 = this.f7844OooOo0;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = o0o0o00.itemView.getWidth() + i2;
                int height2 = o0o0o00.itemView.getHeight() + i3;
                int left2 = i2 - o0o0o00.itemView.getLeft();
                int top2 = i3 - o0o0o00.itemView.getTop();
                int size2 = arrayList3.size();
                int i11 = -1;
                RecyclerView.o0O0O00 o0o0o01 = null;
                int i12 = 0;
                while (i12 < size2) {
                    RecyclerView.o0O0O00 o0o0o02 = (RecyclerView.o0O0O00) arrayList3.get(i12);
                    if (left2 <= 0 || (right = o0o0o02.itemView.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                        i = width2;
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                        if (o0o0o02.itemView.getRight() > o0o0o00.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                            i11 = iAbs4;
                            o0o0o01 = o0o0o02;
                        }
                    }
                    if (left2 < 0 && (left = o0o0o02.itemView.getLeft() - i2) > 0 && o0o0o02.itemView.getLeft() < o0o0o00.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                        i11 = iAbs3;
                        o0o0o01 = o0o0o02;
                    }
                    if (top2 < 0 && (top = o0o0o02.itemView.getTop() - i3) > 0 && o0o0o02.itemView.getTop() < o0o0o00.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                        i11 = iAbs2;
                        o0o0o01 = o0o0o02;
                    }
                    if (top2 > 0 && (bottom = o0o0o02.itemView.getBottom() - height2) < 0 && o0o0o02.itemView.getBottom() > o0o0o00.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                        i11 = iAbs;
                        o0o0o01 = o0o0o02;
                    }
                    i12++;
                    arrayList3 = arrayList;
                    width2 = i;
                }
                if (o0o0o01 == null) {
                    this.f7844OooOo0.clear();
                    this.f7846OooOo0O.clear();
                    return;
                }
                int absoluteAdapterPosition = o0o0o01.getAbsoluteAdapterPosition();
                o0o0o00.getAbsoluteAdapterPosition();
                if (oooO0o.OooO0o(this.f7840OooOOo, o0o0o00, o0o0o01)) {
                    RecyclerView recyclerView = this.f7840OooOOo;
                    RecyclerView.Oooo000 layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 instanceof OooOO0O) {
                        ((OooOO0O) layoutManager2).prepareForDrop(o0o0o00.itemView, o0o0o01.itemView, i2, i3);
                        return;
                    }
                    if (layoutManager2.canScrollHorizontally()) {
                        if (layoutManager2.getDecoratedLeft(o0o0o01.itemView) <= recyclerView.getPaddingLeft()) {
                            recyclerView.scrollToPosition(absoluteAdapterPosition);
                        }
                        if (layoutManager2.getDecoratedRight(o0o0o01.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.scrollToPosition(absoluteAdapterPosition);
                        }
                    }
                    if (layoutManager2.canScrollVertically()) {
                        if (layoutManager2.getDecoratedTop(o0o0o01.itemView) <= recyclerView.getPaddingTop()) {
                            recyclerView.scrollToPosition(absoluteAdapterPosition);
                        }
                        if (layoutManager2.getDecoratedBottom(o0o0o01.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.scrollToPosition(absoluteAdapterPosition);
                        }
                    }
                }
            }
        }
    }

    public final void OooOO0o(View view) {
        if (view == this.f7847OooOo0o) {
            this.f7847OooOo0o = null;
        }
    }

    public final void OooOOO(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f7828OooO0Oo;
        this.f7832OooO0oo = f;
        this.f7824OooO = y - this.f7830OooO0o0;
        if ((i & 4) == 0) {
            this.f7832OooO0oo = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f7832OooO0oo = Math.min(0.0f, this.f7832OooO0oo);
        }
        if ((i & 1) == 0) {
            this.f7824OooO = Math.max(0.0f, this.f7824OooO);
        }
        if ((i & 2) == 0) {
            this.f7824OooO = Math.min(0.0f, this.f7824OooO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[PHI: r1 r2
      0x00b3: PHI (r1v18 int) = (r1v15 int), (r1v19 int) binds: [B:61:0x00e4, B:43:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r2v29 int) = (r2v24 int), (r2v32 int) binds: [B:61:0x00e4, B:43:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[PHI: r1 r2
      0x00b6: PHI (r1v16 int) = (r1v15 int), (r1v19 int) binds: [B:61:0x00e4, B:43:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r2v25 int) = (r2v24 int), (r2v32 int) binds: [B:61:0x00e4, B:43:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    public final void OooOOO0(@Nullable RecyclerView.o0O0O00 o0o0o00, int i) {
        OooO0o oooO0o;
        int i2;
        boolean z;
        OooO0o oooO0o2;
        boolean z2;
        boolean z3;
        int i3;
        RecyclerView.o0O0O00 o0o0o01;
        int iOooO0o;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float fSignum;
        float fSignum2;
        int i10;
        long j;
        if (o0o0o00 == this.f7827OooO0OO && i == this.f7836OooOOO) {
            return;
        }
        this.f7851OooOoo0 = Long.MIN_VALUE;
        int i11 = this.f7836OooOOO;
        OooO0oO(o0o0o00, true);
        this.f7836OooOOO = i;
        if (i == 2) {
            if (o0o0o00 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f7847OooOo0o = o0o0o00.itemView;
        }
        int i12 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.o0O0O00 o0o0o02 = this.f7827OooO0OO;
        OooO0o oooO0o3 = this.f7837OooOOO0;
        if (o0o0o02 != null) {
            if (o0o0o02.itemView.getParent() != null) {
                if (i11 == 2) {
                    i4 = 0;
                } else {
                    if (this.f7836OooOOO == 2) {
                        iOooO0o = 0;
                    } else {
                        int iOooO0O0 = oooO0o3.OooO0O0(this.f7840OooOOo, o0o0o02);
                        RecyclerView recyclerView = this.f7840OooOOo;
                        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(recyclerView);
                        int i13 = iOooO0O0 & 3158064;
                        if (i13 == 0) {
                            i6 = iOooO0O0;
                        } else {
                            int i14 = (~i13) & iOooO0O0;
                            if (iOooO0Oo == 0) {
                                i5 = i13 >> 2;
                            } else {
                                int i15 = i13 >> 1;
                                i14 |= i15 & (-3158065);
                                i5 = (i15 & 3158064) >> 2;
                            }
                            i6 = i5 | i14;
                        }
                        int i16 = (i6 & 65280) >> 8;
                        if (i16 == 0) {
                            iOooO0o = 0;
                        } else {
                            int i17 = (iOooO0O0 & 65280) >> 8;
                            if (Math.abs(this.f7832OooO0oo) > Math.abs(this.f7824OooO)) {
                                iOooO0o = OooO0Oo(i16);
                                if (iOooO0o <= 0) {
                                    iOooO0o = OooO0o(i16);
                                    if (iOooO0o <= 0) {
                                        iOooO0o = 0;
                                    }
                                } else if ((i17 & iOooO0o) == 0) {
                                    int iOooO0Oo2 = ViewCompat.OooO.OooO0Oo(this.f7840OooOOo);
                                    i7 = iOooO0o & 789516;
                                    if (i7 != 0) {
                                        i8 = iOooO0o & (~i7);
                                        if (iOooO0Oo2 == 0) {
                                            i9 = i7 << 2;
                                        } else {
                                            int i18 = i7 << 1;
                                            i8 |= i18 & (-789517);
                                            i9 = (i18 & 789516) << 2;
                                        }
                                        iOooO0o = i9 | i8;
                                    }
                                }
                            } else {
                                iOooO0o = OooO0o(i16);
                                if (iOooO0o <= 0) {
                                    iOooO0o = OooO0Oo(i16);
                                    if (iOooO0o <= 0) {
                                        iOooO0o = 0;
                                    } else if ((i17 & iOooO0o) == 0) {
                                        int iOooO0Oo3 = ViewCompat.OooO.OooO0Oo(this.f7840OooOOo);
                                        i7 = iOooO0o & 789516;
                                        if (i7 != 0) {
                                            i8 = iOooO0o & (~i7);
                                            if (iOooO0Oo3 == 0) {
                                                i9 = i7 << 2;
                                            } else {
                                                int i19 = i7 << 1;
                                                i8 |= i19 & (-789517);
                                                i9 = (i19 & 789516) << 2;
                                            }
                                            iOooO0o = i9 | i8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = iOooO0o;
                }
                VelocityTracker velocityTracker = this.f7845OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f7845OooOo00 = null;
                }
                if (i4 == 1 || i4 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f7824OooO) * this.f7840OooOOo.getHeight();
                } else if (i4 == 4 || i4 == 8 || i4 == 16 || i4 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f7832OooO0oo) * this.f7840OooOOo.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i11 == 2) {
                    i10 = 8;
                } else {
                    i10 = i4 > 0 ? 2 : 4;
                }
                float[] fArr = this.f7826OooO0O0;
                OooO(fArr);
                int i20 = i10;
                oooO0o = oooO0o3;
                i2 = 8;
                OooO0OO oooO0OO = new OooO0OO(o0o0o02, i10, i11, fArr[0], fArr[1], fSignum, fSignum2, i4, o0o0o02);
                RecyclerView recyclerView2 = this.f7840OooOOo;
                oooO0o.getClass();
                RecyclerView.ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    j = i20 == 8 ? 200L : 250L;
                } else {
                    j = i20 == 8 ? itemAnimator.f7630OooO0o0 : itemAnimator.f7628OooO0Oo;
                }
                ValueAnimator valueAnimator = oooO0OO.f7867OooOO0;
                valueAnimator.setDuration(j);
                this.f7839OooOOOo.add(oooO0OO);
                o0o0o02.setIsRecyclable(false);
                valueAnimator.start();
                o0o0o01 = null;
                z = true;
            } else {
                oooO0o = oooO0o3;
                i2 = 8;
                OooOO0o(o0o0o02.itemView);
                oooO0o.getClass();
                OooO0o.OooO00o(o0o0o02);
                o0o0o01 = null;
                z = false;
            }
            this.f7827OooO0OO = o0o0o01;
        } else {
            oooO0o = oooO0o3;
            i2 = 8;
            z = false;
        }
        if (o0o0o00 != null) {
            RecyclerView recyclerView3 = this.f7840OooOOo;
            oooO0o2 = oooO0o;
            int iOooO0O1 = oooO0o2.OooO0O0(recyclerView3, o0o0o00);
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            int iOooO0Oo4 = ViewCompat.OooO.OooO0Oo(recyclerView3);
            int i21 = iOooO0O1 & 3158064;
            if (i21 == 0) {
                z3 = true;
            } else {
                int i22 = iOooO0O1 & (~i21);
                if (iOooO0Oo4 == 0) {
                    i3 = i21 >> 2;
                    z3 = true;
                } else {
                    z3 = true;
                    int i23 = i21 >> 1;
                    i22 |= i23 & (-3158065);
                    i3 = (i23 & 3158064) >> 2;
                }
                iOooO0O1 = i22 | i3;
            }
            this.f7838OooOOOO = (iOooO0O1 & i12) >> (this.f7836OooOOO * i2);
            this.f7833OooOO0 = o0o0o00.itemView.getLeft();
            this.f7834OooOO0O = o0o0o00.itemView.getTop();
            this.f7827OooO0OO = o0o0o00;
            if (i == 2) {
                z2 = false;
                o0o0o00.itemView.performHapticFeedback(0);
            } else {
                z2 = false;
            }
        } else {
            oooO0o2 = oooO0o;
            z2 = false;
            z3 = true;
        }
        ViewParent parent = this.f7840OooOOo.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f7827OooO0OO != null ? z3 : z2);
        }
        if (!z) {
            this.f7840OooOOo.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        oooO0o2.getClass();
        this.f7840OooOOo.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo0
    public final void onChildViewAttachedToWindow(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo0
    public final void onChildViewDetachedFromWindow(@NonNull View view) {
        OooOO0o(view);
        RecyclerView.o0O0O00 childViewHolder = this.f7840OooOOo.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.o0O0O00 o0o0o00 = this.f7827OooO0OO;
        if (o0o0o00 != null && childViewHolder == o0o0o00) {
            OooOOO0(null, 0);
            return;
        }
        OooO0oO(childViewHolder, false);
        if (this.f7825OooO00o.remove(childViewHolder.itemView)) {
            this.f7837OooOOO0.getClass();
            OooO0o.OooO00o(childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        float f;
        float f2;
        if (this.f7827OooO0OO != null) {
            float[] fArr = this.f7826OooO0O0;
            OooO(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        RecyclerView.o0O0O00 o0o0o00 = this.f7827OooO0OO;
        ArrayList arrayList = this.f7839OooOOOo;
        this.f7837OooOOO0.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            float f3 = oooOO1.f7862OooO0Oo;
            float f4 = oooOO1.f7863OooO0o;
            RecyclerView.o0O0O00 o0o0o01 = oooOO1.f7866OooO0oo;
            if (f3 == f4) {
                oooOO1.f7869OooOO0o = o0o0o01.itemView.getTranslationX();
            } else {
                oooOO1.f7869OooOO0o = OooOo.OooO0o.OooO00o(f4, f3, oooOO1.f7873OooOOOo, f3);
            }
            float f5 = oooOO1.f7864OooO0o0;
            float f6 = oooOO1.f7865OooO0oO;
            if (f5 == f6) {
                oooOO1.f7871OooOOO0 = o0o0o01.itemView.getTranslationY();
            } else {
                oooOO1.f7871OooOOO0 = OooOo.OooO0o.OooO00o(f6, f5, oooOO1.f7873OooOOOo, f5);
            }
            int iSave = canvas.save();
            OooO0o.OooO0o0(recyclerView, o0o0o01, oooOO1.f7869OooOO0o, oooOO1.f7871OooOOO0, false);
            canvas.restoreToCount(iSave);
        }
        if (o0o0o00 != null) {
            int iSave2 = canvas.save();
            OooO0o.OooO0o0(recyclerView, o0o0o00, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        boolean z = false;
        if (this.f7827OooO0OO != null) {
            float[] fArr = this.f7826OooO0O0;
            OooO(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        RecyclerView.o0O0O00 o0o0o00 = this.f7827OooO0OO;
        ArrayList arrayList = this.f7839OooOOOo;
        this.f7837OooOOO0.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            int iSave = canvas.save();
            View view = oooOO1.f7866OooO0oo.itemView;
            canvas.restoreToCount(iSave);
        }
        if (o0o0o00 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            OooOO0 oooOO2 = (OooOO0) arrayList.get(i2);
            boolean z2 = oooOO2.f7872OooOOOO;
            if (z2 && !oooOO2.f7868OooOO0O) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
