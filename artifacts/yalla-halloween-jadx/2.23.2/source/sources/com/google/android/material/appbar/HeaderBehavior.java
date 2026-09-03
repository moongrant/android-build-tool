package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OverScroller f15766OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15767OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15768OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15769OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f15770OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public VelocityTracker f15771OooO0oo;

    @Nullable
    private Runnable flingRunnable;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final CoordinatorLayout f15772OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final V f15774OooO0o0;

        public OooO00o(CoordinatorLayout coordinatorLayout, V v) {
            this.f15772OooO0Oo = coordinatorLayout;
            this.f15774OooO0o0 = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeaderBehavior headerBehavior;
            OverScroller overScroller;
            V v = this.f15774OooO0o0;
            if (v == null || (overScroller = (headerBehavior = HeaderBehavior.this).f15766OooO0OO) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f15772OooO0Oo;
            if (!zComputeScrollOffset) {
                headerBehavior.OooOoO(v, coordinatorLayout);
                return;
            }
            headerBehavior.OooOoo0(coordinatorLayout, v, headerBehavior.f15766OooO0OO.getCurrY());
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOO0(v, this);
        }
    }

    public HeaderBehavior() {
        this.f15769OooO0o0 = -1;
        this.f15770OooO0oO = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f15770OooO0oO < 0) {
            this.f15770OooO0oO = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f15767OooO0Oo) {
            int i = this.f15769OooO0o0;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f15768OooO0o) > this.f15770OooO0oO) {
                this.f15768OooO0o = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f15769OooO0o0 = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = OooOo0o(v) && coordinatorLayout.OooOOO(v, x, y2);
            this.f15767OooO0Oo = z;
            if (z) {
                this.f15768OooO0o = y2;
                this.f15769OooO0o0 = motionEvent.getPointerId(0);
                if (this.f15771OooO0oo == null) {
                    this.f15771OooO0oo = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f15766OooO0OO;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f15766OooO0OO.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f15771OooO0oo;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f15769OooO0o0);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.f15768OooO0o - y;
                this.f15768OooO0o = y;
                OooOoOO(coordinatorLayout, v, OooOo0() - i, OooOo(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f15769OooO0o0 = motionEvent.getPointerId(i2);
                    this.f15768OooO0o = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.f15771OooO0oo;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f15767OooO0Oo || z;
        }
        VelocityTracker velocityTracker3 = this.f15771OooO0oo;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f15771OooO0oo.computeCurrentVelocity(1000);
            float yVelocity = this.f15771OooO0oo.getYVelocity(this.f15769OooO0o0);
            int i3 = -OooOoO0(v);
            Runnable runnable = this.flingRunnable;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.flingRunnable = null;
            }
            if (this.f15766OooO0OO == null) {
                this.f15766OooO0OO = new OverScroller(v.getContext());
            }
            this.f15766OooO0OO.fling(0, OooOo00(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.f15766OooO0OO.computeScrollOffset()) {
                OooO00o oooO00o = new OooO00o(coordinatorLayout, v);
                this.flingRunnable = oooO00o;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOO0(v, oooO00o);
            } else {
                OooOoO(v, coordinatorLayout);
            }
            z = true;
        }
        this.f15767OooO0Oo = false;
        this.f15769OooO0o0 = -1;
        velocityTracker = this.f15771OooO0oo;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15771OooO0oo = null;
        }
        velocityTracker2 = this.f15771OooO0oo;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f15767OooO0Oo) {
            return true;
        }
        z = false;
        this.f15767OooO0Oo = false;
        this.f15769OooO0o0 = -1;
        velocityTracker = this.f15771OooO0oo;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15771OooO0oo = null;
        }
        velocityTracker2 = this.f15771OooO0oo;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f15767OooO0Oo) {
            return true;
        }
    }

    public int OooOo(@NonNull V v) {
        return -v.getHeight();
    }

    public boolean OooOo0o(V v) {
        return false;
    }

    public void OooOoO(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int OooOoO0(@NonNull V v) {
        return v.getHeight();
    }

    public int OooOoOO(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iOooO0O0;
        int iOooOo00 = OooOo00();
        if (i2 == 0 || iOooOo00 < i2 || iOooOo00 > i3 || iOooOo00 == (iOooO0O0 = o0000O00.OooO00o.OooO0O0(i, i2, i3))) {
            return 0;
        }
        o000oOoO o000oooo2 = this.f15807OooO00o;
        if (o000oooo2 != null) {
            o000oooo2.OooO0O0(iOooO0O0);
        } else {
            this.f15808OooO0O0 = iOooO0O0;
        }
        return iOooOo00 - iOooO0O0;
    }

    public final void OooOoo0(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOoOO(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15769OooO0o0 = -1;
        this.f15770OooO0oO = -1;
    }
}
