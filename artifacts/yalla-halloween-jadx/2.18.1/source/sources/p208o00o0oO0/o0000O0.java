package p208o00o0oO0;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import kotlin.KotlinVersion;
import o00o0oO0.o000O00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f33294OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f33295OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f33296OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScaleGestureDetector f33297OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public VelocityTracker f33298OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f33299OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f33300OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33301OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f33302OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0000O0O f33303OooOO0;

    public class OooO00o implements ScaleGestureDetector.OnScaleGestureListener {
        public OooO00o() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            ((o000O00O.OooO00o) o0000O0.this.f33303OooOO0).OooO00o(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public o0000O0(Context context, o0000O0O o0000o0o2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f33294OooO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33302OooO0oo = viewConfiguration.getScaledTouchSlop();
        this.f33303OooOO0 = o0000o0o2;
        this.f33297OooO0OO = new ScaleGestureDetector(context, new OooO00o());
    }

    public final float OooO00o(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f33296OooO0O0);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float OooO0O0(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f33296OooO0O0);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public final boolean OooO0OO() {
        return this.f33297OooO0OO.isInProgress();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    public final void OooO0Oo(MotionEvent motionEvent) {
        int iRound;
        int i;
        int iRound2;
        int i2;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            if (action == 1) {
                this.f33295OooO00o = -1;
                if (this.f33300OooO0o0 && this.f33298OooO0Oo != null) {
                    this.f33299OooO0o = OooO00o(motionEvent);
                    this.f33301OooO0oO = OooO0O0(motionEvent);
                    this.f33298OooO0Oo.addMovement(motionEvent);
                    this.f33298OooO0Oo.computeCurrentVelocity(1000);
                    float xVelocity = this.f33298OooO0Oo.getXVelocity();
                    float yVelocity = this.f33298OooO0Oo.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f33294OooO) {
                        o000O00O.OooO00o oooO00o = (o000O00O.OooO00o) this.f33303OooOO0;
                        o000O00O o000o00o2 = o000O00O.this;
                        o000o00o2.f33333o0OoOo0 = o000o00o2.new OooOO0(o000o00o2.f33310OoooO.getContext());
                        o000O00O o000o00o3 = o000O00O.this;
                        o000O00O.OooOO0 oooOO1 = o000o00o3.f33333o0OoOo0;
                        int iOooO0oO = o000o00o3.OooO0oO(o000o00o3.f33310OoooO);
                        o000O00O o000o00o4 = o000O00O.this;
                        int iOooO0o = o000o00o4.OooO0o(o000o00o4.f33310OoooO);
                        int i3 = (int) (-xVelocity);
                        int i4 = (int) (-yVelocity);
                        RectF rectFOooO0OO = o000O00O.this.OooO0OO();
                        if (rectFOooO0OO != null) {
                            int iRound3 = Math.round(-rectFOooO0OO.left);
                            float f = iOooO0oO;
                            if (f < rectFOooO0OO.width()) {
                                iRound = Math.round(rectFOooO0OO.width() - f);
                                i = 0;
                            } else {
                                iRound = iRound3;
                                i = iRound;
                            }
                            int iRound4 = Math.round(-rectFOooO0OO.top);
                            float f2 = iOooO0o;
                            if (f2 < rectFOooO0OO.height()) {
                                iRound2 = Math.round(rectFOooO0OO.height() - f2);
                                i2 = 0;
                            } else {
                                iRound2 = iRound4;
                                i2 = iRound2;
                            }
                            oooOO1.f33347Oooo0oO = iRound3;
                            oooOO1.f33348Oooo0oo = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                oooOO1.f33346Oooo0o.fling(iRound3, iRound4, i3, i4, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        o000O00O o000o00o5 = o000O00O.this;
                        o000o00o5.f33310OoooO.post(o000o00o5.f33333o0OoOo0);
                    }
                }
                VelocityTracker velocityTracker = this.f33298OooO0Oo;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f33298OooO0Oo = null;
                }
            } else if (action == 2) {
                float fOooO00o = OooO00o(motionEvent);
                float fOooO0O0 = OooO0O0(motionEvent);
                float f3 = fOooO00o - this.f33299OooO0o;
                float f4 = fOooO0O0 - this.f33301OooO0oO;
                if (!this.f33300OooO0o0) {
                    this.f33300OooO0o0 = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.f33302OooO0oo);
                }
                if (this.f33300OooO0o0) {
                    o000O00O.OooO00o oooO00o2 = (o000O00O.OooO00o) this.f33303OooOO0;
                    if (!o000O00O.this.f33329o000oOoO.OooO0OO()) {
                        o000O0o o000o0o2 = o000O00O.this.f33328Ooooooo;
                        if (o000o0o2 != null) {
                            o000o0o2.OooO00o();
                        }
                        o000O00O.this.f33317OoooOo0.postTranslate(f3, f4);
                        o000O00O.this.OooO00o();
                        ViewParent parent = o000O00O.this.f33310OoooO.getParent();
                        o000O00O o000o00o6 = o000O00O.this;
                        if (o000o00o6.f33311OoooO0 && !o000o00o6.f33329o000oOoO.OooO0OO()) {
                            o000O00O o000o00o7 = o000O00O.this;
                            if (!o000o00o7.f33313OoooO0O) {
                                int i5 = o000o00o7.f33334ooOO;
                                if ((i5 == 2 || ((i5 == 0 && f3 >= 1.0f) || (i5 == 1 && f3 <= -1.0f))) && parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                            } else if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f33299OooO0o = fOooO00o;
                    this.f33301OooO0oO = fOooO0O0;
                    VelocityTracker velocityTracker2 = this.f33298OooO0Oo;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f33295OooO00o = -1;
                VelocityTracker velocityTracker3 = this.f33298OooO0Oo;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f33298OooO0Oo = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f33295OooO00o) {
                    int i6 = action2 != 0 ? 0 : 1;
                    this.f33295OooO00o = motionEvent.getPointerId(i6);
                    this.f33299OooO0o = motionEvent.getX(i6);
                    this.f33301OooO0oO = motionEvent.getY(i6);
                }
            }
        } else {
            this.f33295OooO00o = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f33298OooO0Oo = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f33299OooO0o = OooO00o(motionEvent);
            this.f33301OooO0oO = OooO0O0(motionEvent);
            this.f33300OooO0o0 = false;
        }
        int i7 = this.f33295OooO00o;
        this.f33296OooO0O0 = motionEvent.findPointerIndex(i7 != -1 ? i7 : 0);
    }
}
