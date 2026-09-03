package p119o00O0OoO;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import o00O0OoO.o00oO0o.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f36589OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f36590OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f36591OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScaleGestureDetector f36592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public VelocityTracker f36593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f36594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f36595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f36596OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f36597OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOo f36598OooOO0;

    public OooOo00(Context context, o00oO0o.OooO00o oooO00o) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f36589OooO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f36597OooO0oo = viewConfiguration.getScaledTouchSlop();
        this.f36598OooOO0 = oooO00o;
        this.f36592OooO0OO = new ScaleGestureDetector(context, new OooOOOO(this));
    }

    public final void OooO00o(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        int iRound;
        int i;
        int iRound2;
        int i2;
        float x3;
        float y3;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            OooOo oooOo = this.f36598OooOO0;
            if (action == 1) {
                this.f36590OooO00o = -1;
                if (this.f36595OooO0o0 && this.f36593OooO0Oo != null) {
                    try {
                        x2 = motionEvent.getX(this.f36591OooO0O0);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f36594OooO0o = x2;
                    try {
                        y2 = motionEvent.getY(this.f36591OooO0O0);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.f36596OooO0oO = y2;
                    this.f36593OooO0Oo.addMovement(motionEvent);
                    this.f36593OooO0Oo.computeCurrentVelocity(1000);
                    float xVelocity = this.f36593OooO0Oo.getXVelocity();
                    float yVelocity = this.f36593OooO0Oo.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f36589OooO) {
                        o00oO0o o00oo0o2 = o00oO0o.this;
                        o00oO0o.OooOO0 oooOO1 = o00oo0o2.new OooOO0(o00oo0o2.f36606OooOO0O.getContext());
                        o00oo0o2.f36616OooOo0 = oooOO1;
                        ImageView imageView = o00oo0o2.f36606OooOO0O;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
                        int i3 = (int) (-xVelocity);
                        int i4 = (int) (-yVelocity);
                        RectF rectFOooO0OO = o00oo0o2.OooO0OO();
                        if (rectFOooO0OO != null) {
                            int iRound3 = Math.round(-rectFOooO0OO.left);
                            float f = width;
                            if (f < rectFOooO0OO.width()) {
                                iRound = Math.round(rectFOooO0OO.width() - f);
                                i = 0;
                            } else {
                                iRound = iRound3;
                                i = iRound;
                            }
                            int iRound4 = Math.round(-rectFOooO0OO.top);
                            float f2 = height;
                            if (f2 < rectFOooO0OO.height()) {
                                iRound2 = Math.round(rectFOooO0OO.height() - f2);
                                i2 = 0;
                            } else {
                                iRound2 = iRound4;
                                i2 = iRound2;
                            }
                            oooOO1.f36633OooO0o0 = iRound3;
                            oooOO1.f36632OooO0o = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                oooOO1.f36631OooO0Oo.fling(iRound3, iRound4, i3, i4, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        imageView.post(o00oo0o2.f36616OooOo0);
                    }
                }
                VelocityTracker velocityTracker = this.f36593OooO0Oo;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f36593OooO0Oo = null;
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.f36591OooO0O0);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.f36591OooO0O0);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f36594OooO0o;
                float f4 = y3 - this.f36596OooO0oO;
                if (!this.f36595OooO0o0) {
                    this.f36595OooO0o0 = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.f36597OooO0oo);
                }
                if (this.f36595OooO0o0) {
                    o00oO0o o00oo0o3 = o00oO0o.this;
                    if (!o00oo0o3.f36609OooOOO0.f36592OooO0OO.isInProgress()) {
                        o00oo0o3.f36611OooOOOo.postTranslate(f3, f4);
                        o00oo0o3.OooO00o();
                        ViewParent parent = o00oo0o3.f36606OooOO0O.getParent();
                        if (o00oo0o3.f36599OooO && !o00oo0o3.f36609OooOOO0.f36592OooO0OO.isInProgress() && !o00oo0o3.f36605OooOO0) {
                            int i5 = o00oo0o3.f36618OooOo0O;
                            if ((i5 == 2 || ((i5 == 0 && f3 >= 1.0f) || (i5 == 1 && f3 <= -1.0f))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f36594OooO0o = x3;
                    this.f36596OooO0oO = y3;
                    VelocityTracker velocityTracker2 = this.f36593OooO0Oo;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f36590OooO00o = -1;
                VelocityTracker velocityTracker3 = this.f36593OooO0Oo;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f36593OooO0Oo = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f36590OooO00o) {
                    int i6 = action2 != 0 ? 0 : 1;
                    this.f36590OooO00o = motionEvent.getPointerId(i6);
                    this.f36594OooO0o = motionEvent.getX(i6);
                    this.f36596OooO0oO = motionEvent.getY(i6);
                }
            }
        } else {
            this.f36590OooO00o = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f36593OooO0Oo = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.f36591OooO0O0);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f36594OooO0o = x;
            try {
                y = motionEvent.getY(this.f36591OooO0O0);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.f36596OooO0oO = y;
            this.f36595OooO0o0 = false;
        }
        int i7 = this.f36590OooO00o;
        this.f36591OooO0O0 = motionEvent.findPointerIndex(i7 != -1 ? i7 : 0);
    }
}
