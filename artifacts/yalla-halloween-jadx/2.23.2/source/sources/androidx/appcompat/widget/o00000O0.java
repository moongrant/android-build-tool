package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o00000O0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0O0 f3221OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f3222OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f3223OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f3224OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f3225OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f3226OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f3227OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f3228OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int[] f3229OooOO0o = new int[2];

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = o00000O0.this.f3225OooO0oO.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00000O0 o00000o1 = o00000O0.this;
            o00000o1.OooO00o();
            View view = o00000o1.f3225OooO0oO;
            if (view.isEnabled() && !view.isLongClickable() && o00000o1.OooO0OO()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                o00000o1.f3227OooOO0 = true;
            }
        }
    }

    public o00000O0(View view) {
        this.f3225OooO0oO = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3222OooO0Oo = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3224OooO0o0 = tapTimeout;
        this.f3223OooO0o = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void OooO00o() {
        OooO0O0 oooO0O0 = this.f3221OooO;
        View view = this.f3225OooO0oO;
        if (oooO0O0 != null) {
            view.removeCallbacks(oooO0O0);
        }
        OooO00o oooO00o = this.f3226OooO0oo;
        if (oooO00o != null) {
            view.removeCallbacks(oooO00o);
        }
    }

    public abstract p018OooOoo0.Oooo000 OooO0O0();

    public abstract boolean OooO0OO();

    public boolean OooO0Oo() {
        p018OooOoo0.Oooo000 oooo000OooO0O0 = OooO0O0();
        if (oooo000OooO0O0 == null || !oooo000OooO0O0.OooO00o()) {
            return true;
        }
        oooo000OooO0O0.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        o000000O o000000oOooOOO;
        boolean z4 = this.f3227OooOO0;
        View view2 = this.f3225OooO0oO;
        if (z4) {
            p018OooOoo0.Oooo000 oooo000OooO0O0 = OooO0O0();
            if (oooo000OooO0O0 == null || !oooo000OooO0O0.OooO00o() || (o000000oOooOOO = oooo000OooO0O0.OooOOO()) == null || !o000000oOooOOO.isShown()) {
                z3 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f3229OooOO0o;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                o000000oOooOOO.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zOooO0O0 = o000000oOooOOO.OooO0O0(motionEventObtainNoHistory, this.f3228OooOO0O);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zOooO0O0 && z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            z2 = z3 || !OooO0Oo();
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f3228OooOO0O = motionEvent.getPointerId(0);
                    if (this.f3226OooO0oo == null) {
                        this.f3226OooO0oo = new OooO00o();
                    }
                    view2.postDelayed(this.f3226OooO0oo, this.f3224OooO0o0);
                    if (this.f3221OooO == null) {
                        this.f3221OooO = new OooO0O0();
                    }
                    view2.postDelayed(this.f3221OooO, this.f3223OooO0o);
                } else if (actionMasked2 == 1) {
                    OooO00o();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f3228OooOO0O);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f3222OooO0Oo;
                        float f2 = -f;
                        if (!(x >= f2 && y >= f2 && x < ((float) (view2.getRight() - view2.getLeft())) + f && y < ((float) (view2.getBottom() - view2.getTop())) + f)) {
                            OooO00o();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = true;
                        }
                    }
                } else if (actionMasked2 == 3) {
                    OooO00o();
                }
                z = false;
            } else {
                z = false;
            }
            z2 = z && OooO0OO();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f3227OooOO0 = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3227OooOO0 = false;
        this.f3228OooOO0O = -1;
        OooO00o oooO00o = this.f3226OooO0oo;
        if (oooO00o != null) {
            this.f3225OooO0oO.removeCallbacks(oooO00o);
        }
    }
}
