package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p617o0oo0o.o00O0000;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends RecyclerView.OooOo implements RecyclerView.Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f9207OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f9211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f9212OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f9213OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f9214OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f9215OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f9216OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f9217OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public OooO0o f9220OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f9221OooOOOO;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f9223OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f9224OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public List<RecyclerView.oo0o0Oo> f9227OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public VelocityTracker f9228OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public List<Integer> f9229OooOo0O;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO f9231OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public o000O0O0.OooO0OO f9232OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f9234OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Rect f9235OooOoo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<View> f9208OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f9209OooO0O0 = new float[2];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public RecyclerView.oo0o0Oo f9210OooO0OO = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f9218OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f9219OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @VisibleForTesting
    public List<OooOO0> f9222OooOOOo = new ArrayList();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO00o f9225OooOOoo = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f9230OooOo0o = null;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f9226OooOo = -1;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0O0 f9233OooOoOO = new OooO0O0();

    public class OooO extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f9236OooO00o = true;

        public OooO() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            View viewOooO0oo;
            RecyclerView.oo0o0Oo childViewHolder;
            if (!this.f9236OooO00o || (viewOooO0oo = o0OoOo0.this.OooO0oo(motionEvent)) == null || (childViewHolder = o0OoOo0.this.f9223OooOOo.getChildViewHolder(viewOooO0oo)) == null) {
                return;
            }
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            if ((o0oooo1.f9220OooOOO0.OooO0Oo(o0oooo1.f9223OooOOo, childViewHolder) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = o0OoOo0.this.f9218OooOO0o;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    o0OoOo0 o0oooo2 = o0OoOo0.this;
                    o0oooo2.f9211OooO0Oo = x;
                    o0oooo2.f9213OooO0o0 = y;
                    o0oooo2.f9207OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    o0oooo2.f9215OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    if (o0oooo2.f9220OooOOO0.OooO0oO()) {
                        o0OoOo0.this.OooOOO0(childViewHolder, 2);
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
            int iOooO0o;
            int iOooO0o2;
            int i;
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            if (o0oooo1.f9210OooO0OO != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = o0oooo1.f9234OooOoo;
                long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                RecyclerView.Oooo000 layoutManager = o0oooo1.f9223OooOOo.getLayoutManager();
                if (o0oooo1.f9235OooOoo0 == null) {
                    o0oooo1.f9235OooOoo0 = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(o0oooo1.f9210OooO0OO.itemView, o0oooo1.f9235OooOoo0);
                boolean z = false;
                if (layoutManager.canScrollHorizontally()) {
                    int i2 = (int) (o0oooo1.f9216OooOO0 + o0oooo1.f9215OooO0oo);
                    iOooO0o = (i2 - o0oooo1.f9235OooOoo0.left) - o0oooo1.f9223OooOOo.getPaddingLeft();
                    float f = o0oooo1.f9215OooO0oo;
                    if ((f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || iOooO0o >= 0) && (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (iOooO0o = ((o0oooo1.f9210OooO0OO.itemView.getWidth() + i2) + o0oooo1.f9235OooOoo0.right) - (o0oooo1.f9223OooOOo.getWidth() - o0oooo1.f9223OooOOo.getPaddingRight())) <= 0)) {
                        iOooO0o = 0;
                    }
                } else {
                    iOooO0o = 0;
                }
                if (layoutManager.canScrollVertically()) {
                    int i3 = (int) (o0oooo1.f9217OooOO0O + o0oooo1.f9207OooO);
                    int paddingTop = (i3 - o0oooo1.f9235OooOoo0.top) - o0oooo1.f9223OooOOo.getPaddingTop();
                    float f2 = o0oooo1.f9207OooO;
                    if ((f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || paddingTop >= 0) && (f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || (paddingTop = ((o0oooo1.f9210OooO0OO.itemView.getHeight() + i3) + o0oooo1.f9235OooOoo0.bottom) - (o0oooo1.f9223OooOOo.getHeight() - o0oooo1.f9223OooOOo.getPaddingBottom())) <= 0)) {
                        iOooO0o2 = 0;
                    } else {
                        iOooO0o2 = paddingTop;
                    }
                } else {
                    iOooO0o2 = 0;
                }
                if (iOooO0o != 0) {
                    OooO0o oooO0o = o0oooo1.f9220OooOOO0;
                    RecyclerView recyclerView = o0oooo1.f9223OooOOo;
                    int width = o0oooo1.f9210OooO0OO.itemView.getWidth();
                    o0oooo1.f9223OooOOo.getWidth();
                    iOooO0o = oooO0o.OooO0o(recyclerView, width, iOooO0o, j2);
                }
                int i4 = iOooO0o;
                if (iOooO0o2 != 0) {
                    OooO0o oooO0o2 = o0oooo1.f9220OooOOO0;
                    RecyclerView recyclerView2 = o0oooo1.f9223OooOOo;
                    int height = o0oooo1.f9210OooO0OO.itemView.getHeight();
                    o0oooo1.f9223OooOOo.getHeight();
                    i = i4;
                    iOooO0o2 = oooO0o2.OooO0o(recyclerView2, height, iOooO0o2, j2);
                } else {
                    i = i4;
                }
                if (i == 0 && iOooO0o2 == 0) {
                    o0oooo1.f9234OooOoo = Long.MIN_VALUE;
                } else {
                    if (o0oooo1.f9234OooOoo == Long.MIN_VALUE) {
                        o0oooo1.f9234OooOoo = jCurrentTimeMillis;
                    }
                    o0oooo1.f9223OooOOo.scrollBy(i, iOooO0o2);
                    z = true;
                }
                if (z) {
                    o0OoOo0 o0oooo2 = o0OoOo0.this;
                    RecyclerView.oo0o0Oo oo0o0oo = o0oooo2.f9210OooO0OO;
                    if (oo0o0oo != null) {
                        o0oooo2.OooOO0O(oo0o0oo);
                    }
                    o0OoOo0 o0oooo3 = o0OoOo0.this;
                    o0oooo3.f9223OooOOo.removeCallbacks(o0oooo3.f9225OooOOoo);
                    RecyclerView recyclerView3 = o0OoOo0.this.f9223OooOOo;
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOOO0(recyclerView3, this);
                }
            }
        }
    }

    public class OooO0O0 implements RecyclerView.o0OoOo0 {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
        public final void OooO00o(@NonNull MotionEvent motionEvent) {
            o0OoOo0.this.f9232OooOoO0.f28104OooO00o.f28105OooO00o.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = o0OoOo0.this.f9228OooOo00;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o0OoOo0.this.f9218OooOO0o == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(o0OoOo0.this.f9218OooOO0o);
            if (iFindPointerIndex >= 0) {
                o0OoOo0.this.OooO0o0(actionMasked, motionEvent, iFindPointerIndex);
            }
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            RecyclerView.oo0o0Oo oo0o0oo = o0oooo1.f9210OooO0OO;
            if (oo0o0oo == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        o0oooo1.OooOOO(motionEvent, o0oooo1.f9221OooOOOO, iFindPointerIndex);
                        o0OoOo0.this.OooOO0O(oo0o0oo);
                        o0OoOo0 o0oooo2 = o0OoOo0.this;
                        o0oooo2.f9223OooOOo.removeCallbacks(o0oooo2.f9225OooOOoo);
                        o0OoOo0.this.f9225OooOOoo.run();
                        o0OoOo0.this.f9223OooOOo.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    o0OoOo0 o0oooo3 = o0OoOo0.this;
                    if (pointerId == o0oooo3.f9218OooOO0o) {
                        o0oooo3.f9218OooOO0o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o0OoOo0 o0oooo4 = o0OoOo0.this;
                        o0oooo4.OooOOO(motionEvent, o0oooo4.f9221OooOOOO, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = o0oooo1.f9228OooOo00;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            o0OoOo0.this.OooOOO0(null, 0);
            o0OoOo0.this.f9218OooOO0o = -1;
        }

        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.List<android.view.View>] */
        /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
        public final boolean OooO0O0(@NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            o0OoOo0.this.f9232OooOoO0.f28104OooO00o.f28105OooO00o.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            OooOO0 oooOO1 = null;
            if (actionMasked == 0) {
                o0OoOo0.this.f9218OooOO0o = motionEvent.getPointerId(0);
                o0OoOo0.this.f9211OooO0Oo = motionEvent.getX();
                o0OoOo0.this.f9213OooO0o0 = motionEvent.getY();
                o0OoOo0 o0oooo1 = o0OoOo0.this;
                VelocityTracker velocityTracker = o0oooo1.f9228OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                o0oooo1.f9228OooOo00 = VelocityTracker.obtain();
                o0OoOo0 o0oooo2 = o0OoOo0.this;
                if (o0oooo2.f9210OooO0OO == null) {
                    if (!o0oooo2.f9222OooOOOo.isEmpty()) {
                        View viewOooO0oo = o0oooo2.OooO0oo(motionEvent);
                        for (int size = o0oooo2.f9222OooOOOo.size() - 1; size >= 0; size--) {
                            OooOO0 oooOO2 = (OooOO0) o0oooo2.f9222OooOOOo.get(size);
                            if (oooOO2.f9252OoooO00.itemView == viewOooO0oo) {
                                oooOO1 = oooOO2;
                                break;
                            }
                        }
                    }
                    if (oooOO1 != null) {
                        o0OoOo0 o0oooo3 = o0OoOo0.this;
                        o0oooo3.f9211OooO0Oo -= oooOO1.f9254OoooOO0;
                        o0oooo3.f9213OooO0o0 -= oooOO1.f9258o000oOoO;
                        o0oooo3.OooO0oO(oooOO1.f9252OoooO00, true);
                        if (o0OoOo0.this.f9208OooO00o.remove(oooOO1.f9252OoooO00.itemView)) {
                            o0OoOo0.this.f9220OooOOO0.OooO00o(oooOO1.f9252OoooO00);
                        }
                        o0OoOo0.this.OooOOO0(oooOO1.f9252OoooO00, oooOO1.f9251OoooO0);
                        o0OoOo0 o0oooo4 = o0OoOo0.this;
                        o0oooo4.OooOOO(motionEvent, o0oooo4.f9221OooOOOO, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o0OoOo0 o0oooo5 = o0OoOo0.this;
                o0oooo5.f9218OooOO0o = -1;
                o0oooo5.OooOOO0(null, 0);
            } else {
                int i = o0OoOo0.this.f9218OooOO0o;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    o0OoOo0.this.OooO0o0(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = o0OoOo0.this.f9228OooOo00;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return o0OoOo0.this.f9210OooO0OO != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
        public final void OooO0OO(boolean z) {
            if (z) {
                o0OoOo0.this.OooOOO0(null, 0);
            }
        }
    }

    public class OooO0OO extends OooOO0 {

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ int f9240OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.oo0o0Oo f9241OoooOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RecyclerView.oo0o0Oo oo0o0oo, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.oo0o0Oo oo0o0oo2) {
            super(oo0o0oo, i2, f, f2, f3, f4);
            this.f9240OoooOoO = i3;
            this.f9241OoooOoo = oo0o0oo2;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<android.view.View>] */
        @Override // androidx.recyclerview.widget.o0OoOo0.OooOO0, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f9255OoooOOO) {
                return;
            }
            if (this.f9240OoooOoO <= 0) {
                o0OoOo0.this.f9220OooOOO0.OooO00o(this.f9241OoooOoo);
            } else {
                o0OoOo0.this.f9208OooO00o.add(this.f9241OoooOoo.itemView);
                this.f9250OoooO = true;
                int i = this.f9240OoooOoO;
                if (i > 0) {
                    o0OoOo0 o0oooo1 = o0OoOo0.this;
                    o0oooo1.f9223OooOOo.post(new o00O0O(o0oooo1, this, i));
                }
            }
            o0OoOo0 o0oooo2 = o0OoOo0.this;
            View view = o0oooo2.f9230OooOo0o;
            View view2 = this.f9241OoooOoo.itemView;
            if (view == view2) {
                o0oooo2.OooOO0o(view2);
            }
        }
    }

    public static abstract class OooO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f9243OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f9244OooO0OO = new OooO0O0();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9245OooO00o = -1;

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

        public static int OooO0OO(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public abstract boolean OooO(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.oo0o0Oo oo0o0oo, @NonNull RecyclerView.oo0o0Oo oo0o0oo2);

        public final void OooO00o(@NonNull RecyclerView.oo0o0Oo oo0o0oo) {
            View view = oo0o0oo.itemView;
            int i = p090o000o00O.o0OoOo0.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO.OooOOoo(view, fFloatValue);
            }
            view.setTag(i, null);
            view.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            view.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }

        public final int OooO0O0(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public final int OooO0Oo(RecyclerView recyclerView, RecyclerView.oo0o0Oo oo0o0oo) {
            int iOooO0o0 = OooO0o0(recyclerView, oo0o0oo);
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return OooO0O0(iOooO0o0, ViewCompat.OooO.OooO0Oo(recyclerView));
        }

        public final int OooO0o(@NonNull RecyclerView recyclerView, int i, int i2, long j) {
            if (this.f9245OooO00o == -1) {
                this.f9245OooO00o = recyclerView.getResources().getDimensionPixelSize(p090o000o00O.o000oOoO.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (f9243OooO0O0.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f9244OooO0OO.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f9245OooO00o)));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public abstract int OooO0o0(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.oo0o0Oo oo0o0oo);

        public abstract boolean OooO0oO();

        public final void OooO0oo(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.oo0o0Oo oo0o0oo, float f, float f2, boolean z) {
            View view = oo0o0oo.itemView;
            if (z && view.getTag(p090o000o00O.o0OoOo0.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                Float fValueOf = Float.valueOf(ViewCompat.OooOOO.OooO(view));
                int childCount = recyclerView.getChildCount();
                float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != view) {
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                        float fOooO = ViewCompat.OooOOO.OooO(childAt);
                        if (fOooO > f3) {
                            f3 = fOooO;
                        }
                    }
                }
                ViewCompat.OooOOO.OooOOoo(view, f3 + 1.0f);
                view.setTag(p090o000o00O.o0OoOo0.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public abstract void OooOO0(@NonNull RecyclerView.oo0o0Oo oo0o0oo);
    }

    @VisibleForTesting
    public static class OooOO0 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final float f9246Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final float f9247Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final float f9248Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final float f9249Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public boolean f9250OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f9251OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final RecyclerView.oo0o0Oo f9252OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @VisibleForTesting
        public final ValueAnimator f9253OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public float f9254OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public boolean f9255OoooOOO = false;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public boolean f9256OoooOOo = false;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public float f9257OoooOo0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public float f9258o000oOoO;

        public OooOO0(RecyclerView.oo0o0Oo oo0o0oo, int i, float f, float f2, float f3, float f4) {
            this.f9251OoooO0 = i;
            this.f9252OoooO00 = oo0o0oo;
            this.f9247Oooo0o = f;
            this.f9248Oooo0oO = f2;
            this.f9249Oooo0oo = f3;
            this.f9246Oooo = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            this.f9253OoooO0O = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new o00Oo0(this));
            valueAnimatorOfFloat.setTarget(oo0o0oo.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f9257OoooOo0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f9257OoooOo0 = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f9256OoooOOo) {
                this.f9252OoooO00.setIsRecyclable(true);
            }
            this.f9256OoooOOo = true;
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

    public o0OoOo0(@NonNull OooO0o oooO0o) {
        this.f9220OooOOO0 = oooO0o;
    }

    public static boolean OooOO0(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void OooO(float[] fArr) {
        if ((this.f9221OooOOOO & 12) != 0) {
            fArr[0] = (this.f9216OooOO0 + this.f9215OooO0oo) - this.f9210OooO0OO.itemView.getLeft();
        } else {
            fArr[0] = this.f9210OooO0OO.itemView.getTranslationX();
        }
        if ((this.f9221OooOOOO & 3) != 0) {
            fArr[1] = (this.f9217OooOO0O + this.f9207OooO) - this.f9210OooO0OO.itemView.getTop();
        } else {
            fArr[1] = this.f9210OooO0OO.itemView.getTranslationY();
        }
    }

    public final int OooO0Oo(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f9215OooO0oo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 8 : 4;
        VelocityTracker velocityTracker = this.f9228OooOo00;
        if (velocityTracker != null && this.f9218OooOO0o > -1) {
            OooO0o oooO0o = this.f9220OooOOO0;
            float f = this.f9214OooO0oO;
            Objects.requireNonNull(oooO0o);
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f9228OooOo00.getXVelocity(this.f9218OooOO0o);
            float yVelocity = this.f9228OooOo00.getYVelocity(this.f9218OooOO0o);
            int i3 = xVelocity > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3) {
                OooO0o oooO0o2 = this.f9220OooOOO0;
                float f2 = this.f9212OooO0o;
                Objects.requireNonNull(oooO0o2);
                if (fAbs >= f2 && fAbs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
        }
        float width = this.f9223OooOOo.getWidth();
        Objects.requireNonNull(this.f9220OooOOO0);
        float f3 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f9215OooO0oo) <= f3) {
            return 0;
        }
        return i2;
    }

    public final int OooO0o(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f9207OooO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 2 : 1;
        VelocityTracker velocityTracker = this.f9228OooOo00;
        if (velocityTracker != null && this.f9218OooOO0o > -1) {
            OooO0o oooO0o = this.f9220OooOOO0;
            float f = this.f9214OooO0oO;
            Objects.requireNonNull(oooO0o);
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f9228OooOo00.getXVelocity(this.f9218OooOO0o);
            float yVelocity = this.f9228OooOo00.getYVelocity(this.f9218OooOO0o);
            int i3 = yVelocity > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2) {
                OooO0o oooO0o2 = this.f9220OooOOO0;
                float f2 = this.f9212OooO0o;
                Objects.requireNonNull(oooO0o2);
                if (fAbs >= f2 && fAbs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
        }
        float height = this.f9223OooOOo.getHeight();
        Objects.requireNonNull(this.f9220OooOOO0);
        float f3 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f9207OooO) <= f3) {
            return 0;
        }
        return i2;
    }

    public final void OooO0o0(int i, MotionEvent motionEvent, int i2) {
        int iOooO0Oo;
        View viewOooO0oo;
        if (this.f9210OooO0OO == null && i == 2 && this.f9219OooOOO != 2) {
            OooO0o oooO0o = this.f9220OooOOO0;
            Objects.requireNonNull(oooO0o);
            if ((!(oooO0o instanceof o00O0000)) && this.f9223OooOOo.getScrollState() != 1) {
                RecyclerView.Oooo000 layoutManager = this.f9223OooOOo.getLayoutManager();
                int i3 = this.f9218OooOO0o;
                RecyclerView.oo0o0Oo childViewHolder = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.f9211OooO0Oo;
                    float y = motionEvent.getY(iFindPointerIndex) - this.f9213OooO0o0;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.f9224OooOOo0;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewOooO0oo = OooO0oo(motionEvent)) != null))) {
                        childViewHolder = this.f9223OooOOo.getChildViewHolder(viewOooO0oo);
                    }
                }
                if (childViewHolder == null || (iOooO0Oo = (this.f9220OooOOO0.OooO0Oo(this.f9223OooOOo, childViewHolder) & 65280) >> 8) == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f9211OooO0Oo;
                float f3 = y2 - this.f9213OooO0o0;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.f9224OooOOo0;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (iOooO0Oo & 4) == 0) {
                            return;
                        }
                        if (f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (iOooO0Oo & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (iOooO0Oo & 1) == 0) {
                            return;
                        }
                        if (f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (iOooO0Oo & 2) == 0) {
                            return;
                        }
                    }
                    this.f9207OooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    this.f9215OooO0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    this.f9218OooOO0o = motionEvent.getPointerId(0);
                    OooOOO0(childViewHolder, 1);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    public final void OooO0oO(RecyclerView.oo0o0Oo oo0o0oo, boolean z) {
        OooOO0 oooOO1;
        int size = this.f9222OooOOOo.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                oooOO1 = (OooOO0) this.f9222OooOOOo.get(size);
            }
        } while (oooOO1.f9252OoooO00 != oo0o0oo);
        oooOO1.f9255OoooOOO |= z;
        if (!oooOO1.f9256OoooOOo) {
            oooOO1.f9253OoooO0O.cancel();
        }
        this.f9222OooOOOo.remove(size);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    public final View OooO0oo(MotionEvent motionEvent) {
        OooOO0 oooOO1;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.oo0o0Oo oo0o0oo = this.f9210OooO0OO;
        if (oo0o0oo != null) {
            View view2 = oo0o0oo.itemView;
            if (OooOO0(view2, x, y, this.f9216OooOO0 + this.f9215OooO0oo, this.f9217OooOO0O + this.f9207OooO)) {
                return view2;
            }
        }
        int size = this.f9222OooOOOo.size();
        do {
            size--;
            if (size < 0) {
                return this.f9223OooOOo.findChildViewUnder(x, y);
            }
            oooOO1 = (OooOO0) this.f9222OooOOOo.get(size);
            view = oooOO1.f9252OoooO00.itemView;
        } while (!OooOO0(view, x, y, oooOO1.f9254OoooOO0, oooOO1.f9258o000oOoO));
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.RecyclerView$oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList, java.util.List, java.util.List<androidx.recyclerview.widget.RecyclerView$oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.RecyclerView$oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.RecyclerView$oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.RecyclerView$oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.recyclerview.widget.RecyclerView$Oooo000] */
    public final void OooOO0O(RecyclerView.oo0o0Oo oo0o0oo) {
        ?? r2;
        ?? r16;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        ?? r17;
        int iAbs4;
        if (!this.f9223OooOOo.isLayoutRequested() && this.f9219OooOOO == 2) {
            Objects.requireNonNull(this.f9220OooOOO0);
            int i = (int) (this.f9216OooOO0 + this.f9215OooO0oo);
            int i2 = (int) (this.f9217OooOO0O + this.f9207OooO);
            if (Math.abs(i2 - oo0o0oo.itemView.getTop()) >= oo0o0oo.itemView.getHeight() * 0.5f || Math.abs(i - oo0o0oo.itemView.getLeft()) >= oo0o0oo.itemView.getWidth() * 0.5f) {
                ?? r3 = this.f9227OooOo0;
                if (r3 == 0) {
                    this.f9227OooOo0 = new ArrayList();
                    this.f9229OooOo0O = new ArrayList();
                } else {
                    r3.clear();
                    this.f9229OooOo0O.clear();
                }
                Objects.requireNonNull(this.f9220OooOOO0);
                int iRound = Math.round(this.f9216OooOO0 + this.f9215OooO0oo) - 0;
                int iRound2 = Math.round(this.f9217OooOO0O + this.f9207OooO) - 0;
                int width = oo0o0oo.itemView.getWidth() + iRound + 0;
                int height = oo0o0oo.itemView.getHeight() + iRound2 + 0;
                int i3 = (iRound + width) / 2;
                int i4 = (iRound2 + height) / 2;
                RecyclerView.Oooo000 layoutManager = this.f9223OooOOo.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i5 = 0;
                while (i5 < childCount) {
                    View childAt = layoutManager.getChildAt(i5);
                    if (childAt != oo0o0oo.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        RecyclerView.oo0o0Oo childViewHolder = this.f9223OooOOo.getChildViewHolder(childAt);
                        Objects.requireNonNull(this.f9220OooOOO0);
                        int iAbs5 = Math.abs(i3 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int iAbs6 = Math.abs(i4 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i6 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                        int size = this.f9227OooOo0.size();
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < size) {
                            int i9 = size;
                            if (i6 <= ((Integer) this.f9229OooOo0O.get(i7)).intValue()) {
                                break;
                            }
                            i8++;
                            i7++;
                            size = i9;
                        }
                        this.f9227OooOo0.add(i8, childViewHolder);
                        this.f9229OooOo0O.add(i8, Integer.valueOf(i6));
                    }
                    i5++;
                    iRound = iRound;
                    iRound2 = iRound2;
                }
                ?? r4 = this.f9227OooOo0;
                if (r4.size() == 0) {
                    return;
                }
                Objects.requireNonNull(this.f9220OooOOO0);
                int width2 = oo0o0oo.itemView.getWidth() + i;
                int height2 = oo0o0oo.itemView.getHeight() + i2;
                int left2 = i - oo0o0oo.itemView.getLeft();
                int top2 = i2 - oo0o0oo.itemView.getTop();
                int size2 = r4.size();
                RecyclerView.oo0o0Oo oo0o0oo2 = null;
                int i10 = 0;
                int i11 = -1;
                while (i10 < size2) {
                    RecyclerView.oo0o0Oo oo0o0oo3 = (RecyclerView.oo0o0Oo) r2.get(i10);
                    if (left2 <= 0 || (right = oo0o0oo3.itemView.getRight() - width2) >= 0) {
                        r2 = r4;
                        r2 = r4;
                        r16 = r2;
                    } else {
                        r17 = r2;
                        if (oo0o0oo3.itemView.getRight() > oo0o0oo.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                            r2 = r4;
                            r16 = r17;
                            r16 = r17;
                            i11 = iAbs4;
                            oo0o0oo2 = oo0o0oo3;
                            r16 = r17;
                        }
                    }
                    if (left2 < 0 && (left = oo0o0oo3.itemView.getLeft() - i) > 0 && oo0o0oo3.itemView.getLeft() < oo0o0oo.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                        i11 = iAbs3;
                        oo0o0oo2 = oo0o0oo3;
                    }
                    if (top2 < 0 && (top = oo0o0oo3.itemView.getTop() - i2) > 0 && oo0o0oo3.itemView.getTop() < oo0o0oo.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                        i11 = iAbs2;
                        oo0o0oo2 = oo0o0oo3;
                    }
                    if (top2 > 0 && (bottom = oo0o0oo3.itemView.getBottom() - height2) < 0 && oo0o0oo3.itemView.getBottom() > oo0o0oo.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                        i11 = iAbs;
                        oo0o0oo2 = oo0o0oo3;
                    }
                    i10++;
                    r2 = r16;
                }
                if (oo0o0oo2 == null) {
                    r2 = r4;
                    this.f9227OooOo0.clear();
                    this.f9229OooOo0O.clear();
                    return;
                }
                int absoluteAdapterPosition = oo0o0oo2.getAbsoluteAdapterPosition();
                oo0o0oo.getAbsoluteAdapterPosition();
                if (!this.f9220OooOOO0.OooO(this.f9223OooOOo, oo0o0oo, oo0o0oo2)) {
                    r2 = r4;
                    return;
                }
                OooO0o oooO0o = this.f9220OooOOO0;
                RecyclerView recyclerView = this.f9223OooOOo;
                Objects.requireNonNull(oooO0o);
                ?? layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 instanceof OooOO0O) {
                    r2 = r4;
                    ((OooOO0O) layoutManager2).prepareForDrop(oo0o0oo.itemView, oo0o0oo2.itemView, i, i2);
                    return;
                }
                if (layoutManager2.canScrollHorizontally()) {
                    if (layoutManager2.getDecoratedLeft(oo0o0oo2.itemView) <= recyclerView.getPaddingLeft()) {
                        r2 = r4;
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    r2 = r4;
                    if (layoutManager2.getDecoratedRight(oo0o0oo2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
                r2 = r4;
                if (layoutManager2.canScrollVertically()) {
                    if (layoutManager2.getDecoratedTop(oo0o0oo2.itemView) <= recyclerView.getPaddingTop()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedBottom(oo0o0oo2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
            }
        }
    }

    public final void OooOO0o(View view) {
        if (view == this.f9230OooOo0o) {
            this.f9230OooOo0o = null;
        }
    }

    public final void OooOOO(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f9211OooO0Oo;
        this.f9215OooO0oo = f;
        this.f9207OooO = y - this.f9213OooO0o0;
        if ((i & 4) == 0) {
            this.f9215OooO0oo = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f);
        }
        if ((i & 8) == 0) {
            this.f9215OooO0oo = Math.min(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f9215OooO0oo);
        }
        if ((i & 1) == 0) {
            this.f9207OooO = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f9207OooO);
        }
        if ((i & 2) == 0) {
            this.f9207OooO = Math.min(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f9207OooO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOOO0(@Nullable RecyclerView.oo0o0Oo oo0o0oo, int i) {
        boolean z;
        RecyclerView.oo0o0Oo oo0o0oo2;
        int iOooO0o;
        int i2;
        float fSignum;
        float fSignum2;
        int i3;
        long j;
        if (oo0o0oo == this.f9210OooO0OO && i == this.f9219OooOOO) {
            return;
        }
        this.f9234OooOoo = Long.MIN_VALUE;
        int i4 = this.f9219OooOOO;
        OooO0oO(oo0o0oo, true);
        this.f9219OooOOO = i;
        if (i == 2) {
            if (oo0o0oo == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f9230OooOo0o = oo0o0oo.itemView;
        }
        int i5 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.oo0o0Oo oo0o0oo3 = this.f9210OooO0OO;
        if (oo0o0oo3 != null) {
            if (oo0o0oo3.itemView.getParent() != null) {
                if (i4 == 2) {
                    i2 = 0;
                } else {
                    if (this.f9219OooOOO == 2) {
                        iOooO0o = 0;
                    } else {
                        int iOooO0o0 = this.f9220OooOOO0.OooO0o0(this.f9223OooOOo, oo0o0oo3);
                        OooO0o oooO0o = this.f9220OooOOO0;
                        RecyclerView recyclerView = this.f9223OooOOo;
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                        int iOooO0O0 = (oooO0o.OooO0O0(iOooO0o0, ViewCompat.OooO.OooO0Oo(recyclerView)) & 65280) >> 8;
                        if (iOooO0O0 == 0) {
                            iOooO0o = 0;
                        } else {
                            int i6 = (iOooO0o0 & 65280) >> 8;
                            if (Math.abs(this.f9215OooO0oo) > Math.abs(this.f9207OooO)) {
                                iOooO0o = OooO0Oo(iOooO0O0);
                                if (iOooO0o <= 0) {
                                    iOooO0o = OooO0o(iOooO0O0);
                                    if (iOooO0o <= 0) {
                                        iOooO0o = 0;
                                    }
                                } else if ((i6 & iOooO0o) == 0) {
                                    iOooO0o = OooO0o.OooO0OO(iOooO0o, ViewCompat.OooO.OooO0Oo(this.f9223OooOOo));
                                }
                            } else {
                                iOooO0o = OooO0o(iOooO0O0);
                                if (iOooO0o <= 0) {
                                    iOooO0o = OooO0Oo(iOooO0O0);
                                    if (iOooO0o <= 0) {
                                        iOooO0o = 0;
                                    } else if ((i6 & iOooO0o) == 0) {
                                        iOooO0o = OooO0o.OooO0OO(iOooO0o, ViewCompat.OooO.OooO0Oo(this.f9223OooOOo));
                                    }
                                }
                            }
                        }
                    }
                    i2 = iOooO0o;
                }
                VelocityTracker velocityTracker = this.f9228OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f9228OooOo00 = null;
                }
                if (i2 == 1 || i2 == 2) {
                    fSignum = Math.signum(this.f9207OooO) * this.f9223OooOOo.getHeight();
                    fSignum2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    fSignum2 = (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) ? Math.signum(this.f9215OooO0oo) * this.f9223OooOOo.getWidth() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    fSignum = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (i4 == 2) {
                    i3 = 8;
                } else {
                    i3 = i2 > 0 ? 2 : 4;
                }
                OooO(this.f9209OooO0O0);
                float[] fArr = this.f9209OooO0O0;
                int i7 = i3;
                OooO0OO oooO0OO = new OooO0OO(oo0o0oo3, i3, i4, fArr[0], fArr[1], fSignum2, fSignum, i2, oo0o0oo3);
                OooO0o oooO0o2 = this.f9220OooOOO0;
                RecyclerView recyclerView2 = this.f9223OooOOo;
                Objects.requireNonNull(oooO0o2);
                RecyclerView.ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    j = i7 == 8 ? 200L : 250L;
                } else {
                    j = i7 == 8 ? itemAnimator.f9013OooO0o0 : itemAnimator.f9011OooO0Oo;
                }
                oooO0OO.f9253OoooO0O.setDuration(j);
                this.f9222OooOOOo.add(oooO0OO);
                oo0o0oo3.setIsRecyclable(false);
                oooO0OO.f9253OoooO0O.start();
                oo0o0oo2 = null;
                z = true;
            } else {
                OooOO0o(oo0o0oo3.itemView);
                this.f9220OooOOO0.OooO00o(oo0o0oo3);
                oo0o0oo2 = null;
                z = false;
            }
            this.f9210OooO0OO = oo0o0oo2;
        } else {
            z = false;
        }
        if (oo0o0oo != null) {
            this.f9221OooOOOO = (this.f9220OooOOO0.OooO0Oo(this.f9223OooOOo, oo0o0oo) & i5) >> (this.f9219OooOOO * 8);
            this.f9216OooOO0 = oo0o0oo.itemView.getLeft();
            this.f9217OooOO0O = oo0o0oo.itemView.getTop();
            this.f9210OooO0OO = oo0o0oo;
            if (i == 2) {
                oo0o0oo.itemView.performHapticFeedback(0);
            }
        }
        ViewParent parent = this.f9223OooOOo.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f9210OooO0OO != null);
        }
        if (!z) {
            this.f9223OooOOo.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        Objects.requireNonNull(this.f9220OooOOO0);
        this.f9223OooOOo.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo0
    public final void onChildViewAttachedToWindow(@NonNull View view) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    @Override // androidx.recyclerview.widget.RecyclerView.Oooo0
    public final void onChildViewDetachedFromWindow(@NonNull View view) {
        OooOO0o(view);
        RecyclerView.oo0o0Oo childViewHolder = this.f9223OooOOo.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.oo0o0Oo oo0o0oo = this.f9210OooO0OO;
        if (oo0o0oo != null && childViewHolder == oo0o0oo) {
            OooOOO0(null, 0);
            return;
        }
        OooO0oO(childViewHolder, false);
        if (this.f9208OooO00o.remove(childViewHolder.itemView)) {
            this.f9220OooOOO0.OooO00o(childViewHolder);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        float f;
        float f2;
        this.f9226OooOo = -1;
        if (this.f9210OooO0OO != null) {
            OooO(this.f9209OooO0O0);
            float[] fArr = this.f9209OooO0O0;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        OooO0o oooO0o = this.f9220OooOOO0;
        RecyclerView.oo0o0Oo oo0o0oo = this.f9210OooO0OO;
        ?? r2 = this.f9222OooOOOo;
        Objects.requireNonNull(oooO0o);
        int size = r2.size();
        for (int i = 0; i < size; i++) {
            OooOO0 oooOO1 = (OooOO0) r2.get(i);
            float f4 = oooOO1.f9247Oooo0o;
            float f5 = oooOO1.f9249Oooo0oo;
            if (f4 == f5) {
                oooOO1.f9254OoooOO0 = oooOO1.f9252OoooO00.itemView.getTranslationX();
            } else {
                oooOO1.f9254OoooOO0 = Oooo000.OooO00o.OooO00o(f5, f4, oooOO1.f9257OoooOo0, f4);
            }
            float f6 = oooOO1.f9248Oooo0oO;
            float f7 = oooOO1.f9246Oooo;
            if (f6 == f7) {
                oooOO1.f9258o000oOoO = oooOO1.f9252OoooO00.itemView.getTranslationY();
            } else {
                oooOO1.f9258o000oOoO = Oooo000.OooO00o.OooO00o(f7, f6, oooOO1.f9257OoooOo0, f6);
            }
            int iSave = canvas.save();
            oooO0o.OooO0oo(recyclerView, oooOO1.f9252OoooO00, oooOO1.f9254OoooOO0, oooOO1.f9258o000oOoO, false);
            canvas.restoreToCount(iSave);
        }
        if (oo0o0oo != null) {
            int iSave2 = canvas.save();
            oooO0o.OooO0oo(recyclerView, oo0o0oo, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        boolean z = false;
        if (this.f9210OooO0OO != null) {
            OooO(this.f9209OooO0O0);
            float[] fArr = this.f9209OooO0O0;
            float f = fArr[0];
            float f2 = fArr[1];
        }
        OooO0o oooO0o = this.f9220OooOOO0;
        RecyclerView.oo0o0Oo oo0o0oo = this.f9210OooO0OO;
        ?? r3 = this.f9222OooOOOo;
        Objects.requireNonNull(oooO0o);
        int size = r3.size();
        for (int i = 0; i < size; i++) {
            OooOO0 oooOO1 = (OooOO0) r3.get(i);
            int iSave = canvas.save();
            View view = oooOO1.f9252OoooO00.itemView;
            canvas.restoreToCount(iSave);
        }
        if (oo0o0oo != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            OooOO0 oooOO2 = (OooOO0) r3.get(i2);
            boolean z2 = oooOO2.f9256OoooOOo;
            if (z2 && !oooOO2.f9250OoooO) {
                r3.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
