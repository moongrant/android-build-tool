package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o0OO00O implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final View f5446Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f5447Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f5448Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f5449Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f5450OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO0O0 f5451OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO00o f5452OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f5453OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int[] f5454OoooOO0 = new int[2];

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = o0OO00O.this.f5446Oooo.getParent();
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
            o0OO00O o0oo00o2 = o0OO00O.this;
            o0oo00o2.OooO00o();
            View view = o0oo00o2.f5446Oooo;
            if (view.isEnabled() && !view.isLongClickable() && o0oo00o2.OooO0OO()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                o0oo00o2.f5453OoooO0O = true;
            }
        }
    }

    public o0OO00O(View view) {
        this.f5446Oooo = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5447Oooo0o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5448Oooo0oO = tapTimeout;
        this.f5449Oooo0oo = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void OooO00o() {
        OooO0O0 oooO0O0 = this.f5451OoooO0;
        if (oooO0O0 != null) {
            this.f5446Oooo.removeCallbacks(oooO0O0);
        }
        OooO00o oooO00o = this.f5452OoooO00;
        if (oooO00o != null) {
            this.f5446Oooo.removeCallbacks(oooO00o);
        }
    }

    public abstract p015OooOoO.o00Oo0 OooO0O0();

    public abstract boolean OooO0OO();

    public boolean OooO0Oo() {
        p015OooOoO.o00Oo0 o00oo0OooO0O0 = OooO0O0();
        if (o00oo0OooO0O0 == null || !o00oo0OooO0O0.OooO0O0()) {
            return true;
        }
        o00oo0OooO0O0.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        o0OOO0o o0ooo0o2;
        boolean z4 = this.f5453OoooO0O;
        if (z4) {
            View view2 = this.f5446Oooo;
            p015OooOoO.o00Oo0 o00oo0OooO0O0 = OooO0O0();
            if (o00oo0OooO0O0 == null || !o00oo0OooO0O0.OooO0O0() || (o0ooo0o2 = (o0OOO0o) o00oo0OooO0O0.OooOO0()) == null || !o0ooo0o2.isShown()) {
                z3 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f5454OoooOO0;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.f5454OoooOO0;
                o0ooo0o2.getLocationOnScreen(iArr2);
                motionEventObtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean zOooO0O0 = o0ooo0o2.OooO0O0(motionEventObtainNoHistory, this.f5450OoooO);
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
            View view3 = this.f5446Oooo;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f5450OoooO = motionEvent.getPointerId(0);
                    if (this.f5452OoooO00 == null) {
                        this.f5452OoooO00 = new OooO00o();
                    }
                    view3.postDelayed(this.f5452OoooO00, this.f5448Oooo0oO);
                    if (this.f5451OoooO0 == null) {
                        this.f5451OoooO0 = new OooO0O0();
                    }
                    view3.postDelayed(this.f5451OoooO0, this.f5449Oooo0oo);
                } else if (actionMasked2 == 1) {
                    OooO00o();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5450OoooO);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f5447Oooo0o;
                        float f2 = -f;
                        if (!(x >= f2 && y >= f2 && x < ((float) (view3.getRight() - view3.getLeft())) + f && y < ((float) (view3.getBottom() - view3.getTop())) + f)) {
                            OooO00o();
                            view3.getParent().requestDisallowInterceptTouchEvent(true);
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
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                this.f5446Oooo.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f5453OoooO0O = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5453OoooO0O = false;
        this.f5450OoooO = -1;
        OooO00o oooO00o = this.f5452OoooO00;
        if (oooO00o != null) {
            this.f5446Oooo.removeCallbacks(oooO00o);
        }
    }
}
