package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.OooO;
import com.google.android.material.snackbar.OooOO0O;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import p056o0000Oo0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o f15879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f15880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f15881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15884OooO0o0 = 2;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f15883OooO0o = 0.5f;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f15885OooO0oO = 0.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f15886OooO0oo = 0.5f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o f15878OooO = new OooO00o();

    public class OooO00o extends OooO0o.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f15887OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f15888OooO0O0 = -1;

        public OooO00o() {
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO(@NonNull View view, int i, int i2) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.f15885OooO0oO;
            float width2 = view.getWidth() * swipeDismissBehavior.f15886OooO0oo;
            float fAbs = Math.abs(i - this.f15887OooO00o);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO00o(@NonNull View view, int i) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
            int i2 = SwipeDismissBehavior.this.f15884OooO0o0;
            if (i2 == 0) {
                if (z) {
                    width = this.f15887OooO00o - view.getWidth();
                    width2 = this.f15887OooO00o;
                } else {
                    width = this.f15887OooO00o;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i2 != 1) {
                width = this.f15887OooO00o - view.getWidth();
                width2 = view.getWidth() + this.f15887OooO00o;
            } else if (z) {
                width = this.f15887OooO00o;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f15887OooO00o - view.getWidth();
                width2 = this.f15887OooO00o;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0O0(@NonNull View view, int i) {
            return view.getTop();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final int OooO0OO(@NonNull View view) {
            return view.getWidth();
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oO(int i, @NonNull View view) {
            this.f15888OooO0O0 = i;
            this.f15887OooO00o = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f15882OooO0Oo = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f15882OooO0Oo = false;
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooO0oo(int i) {
            OooO0O0 oooO0O0 = SwipeDismissBehavior.this.f15880OooO0O0;
            if (oooO0O0 != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((OooO) oooO0O0).f17348OooO00o;
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        OooOO0O.OooO0O0().OooO0Oo(baseTransientBottomBar.f17331OooOo00);
                        return;
                    }
                    return;
                }
                OooOO0O oooOO0OOooO0O0 = OooOO0O.OooO0O0();
                BaseTransientBottomBar.OooO0OO oooO0OO = baseTransientBottomBar.f17331OooOo00;
                synchronized (oooOO0OOooO0O0.f17355OooO00o) {
                    if (oooOO0OOooO0O0.OooO0OO(oooO0OO)) {
                        OooOO0O.OooO0OO oooO0OO2 = oooOO0OOooO0O0.f17357OooO0OO;
                        if (oooO0OO2.f17362OooO0OO) {
                            oooO0OO2.f17362OooO0OO = false;
                            oooOO0OOooO0O0.OooO0o(oooO0OO2);
                        }
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0052  */
        /* JADX WARN: Code duplicated, block: B:28:0x0054  */
        /* JADX WARN: Code duplicated, block: B:36:0x0066  */
        @Override // o0000Oo0.OooO0o.OooO0OO
        public final void OooOO0(@NonNull View view, float f, float f2) {
            boolean z;
            int i;
            OooO0O0 oooO0O0;
            this.f15888OooO0O0 = -1;
            int width = view.getWidth();
            boolean z2 = true;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f != 0.0f) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                boolean z3 = ViewCompat.OooO.OooO0Oo(view) == 1;
                int i2 = swipeDismissBehavior.f15884OooO0o0;
                if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z3 ? f < 0.0f : f > 0.0f) : !z3 ? f > 0.0f : f < 0.0f)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f15887OooO00o) >= Math.round(view.getWidth() * swipeDismissBehavior.f15883OooO0o)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                i = this.f15887OooO00o;
                z2 = false;
            } else if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f15887OooO00o;
                if (left < i3) {
                    i = this.f15887OooO00o - width;
                } else {
                    i = i3 + width;
                }
            } else {
                i = this.f15887OooO00o - width;
            }
            if (swipeDismissBehavior.f15879OooO00o.OooOo00(i, view.getTop())) {
                OooO0OO oooO0OO = new OooO0OO(view, z2);
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOO0(view, oooO0OO);
            } else {
                if (!z2 || (oooO0O0 = swipeDismissBehavior.f15880OooO0O0) == null) {
                    return;
                }
                ((OooO) oooO0O0).OooO00o(view);
            }
        }

        @Override // o0000Oo0.OooO0o.OooO0OO
        public final boolean OooOO0O(int i, View view) {
            int i2 = this.f15888OooO0O0;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.OooOo00(view);
        }
    }

    public interface OooO0O0 {
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f15890OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f15892OooO0o0;

        public OooO0OO(View view, boolean z) {
            this.f15890OooO0Oo = view;
            this.f15892OooO0o0 = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0O0 oooO0O0;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            OooO0o oooO0o = swipeDismissBehavior.f15879OooO00o;
            View view = this.f15890OooO0Oo;
            if (oooO0o != null && oooO0o.OooO0oo()) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOO0(view, this);
            } else {
                if (!this.f15892OooO0o0 || (oooO0O0 = swipeDismissBehavior.f15880OooO0O0) == null) {
                    return;
                }
                ((OooO) oooO0O0).OooO00o(view);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean zOooOOO = this.f15881OooO0OO;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zOooOOO = coordinatorLayout.OooOOO(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f15881OooO0OO = zOooOOO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f15881OooO0OO = false;
        }
        if (!zOooOOO) {
            return false;
        }
        if (this.f15879OooO00o == null) {
            this.f15879OooO00o = new OooO0o(coordinatorLayout.getContext(), coordinatorLayout, this.f15878OooO);
        }
        return !this.f15882OooO0Oo && this.f15879OooO00o.OooOo0(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(v) == 0) {
            ViewCompat.OooO0o.OooOOoo(v, 1);
            ViewCompat.OooOO0o(ZegoConstants.ErrorMask.RoomServerErrorMask, v);
            ViewCompat.OooO(0, v);
            if (OooOo00(v)) {
                ViewCompat.OooOOO0(v, o0O0O00.OooO00o.f33521OooOOO, null, new com.google.android.material.behavior.OooO00o(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f15879OooO00o == null) {
            return false;
        }
        if (this.f15882OooO0Oo && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f15879OooO00o.OooOOO(motionEvent);
        return true;
    }

    public boolean OooOo00(@NonNull View view) {
        return true;
    }
}
