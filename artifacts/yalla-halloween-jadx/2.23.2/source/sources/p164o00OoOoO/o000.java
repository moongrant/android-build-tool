package p164o00OoOoO;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import o00OoOoO.o000O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f38108OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f38109OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f38110OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScaleGestureDetector f38111OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public VelocityTracker f38112OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f38113OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f38114OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f38115OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f38116OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000O000 f38117OooOO0;

    public o000(Context context, o000O.OooO00o oooO00o) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f38108OooO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f38116OooO0oo = viewConfiguration.getScaledTouchSlop();
        this.f38117OooOO0 = oooO00o;
        this.f38111OooO0OO = new ScaleGestureDetector(context, new o0000OO0(this));
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
            o000O000 o000o001 = this.f38117OooOO0;
            if (action == 1) {
                this.f38109OooO00o = -1;
                if (this.f38114OooO0o0 && this.f38112OooO0Oo != null) {
                    try {
                        x2 = motionEvent.getX(this.f38110OooO0O0);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f38113OooO0o = x2;
                    try {
                        y2 = motionEvent.getY(this.f38110OooO0O0);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.f38115OooO0oO = y2;
                    this.f38112OooO0Oo.addMovement(motionEvent);
                    this.f38112OooO0Oo.computeCurrentVelocity(1000);
                    float xVelocity = this.f38112OooO0Oo.getXVelocity();
                    float yVelocity = this.f38112OooO0Oo.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f38108OooO) {
                        o000O o000o = o000O.this;
                        o000O.OooOO0 oooOO1 = o000o.new OooOO0(o000o.f38126OooOO0O.getContext());
                        o000o.f38136OooOo0 = oooOO1;
                        ImageView imageView = o000o.f38126OooOO0O;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
                        int i3 = (int) (-xVelocity);
                        int i4 = (int) (-yVelocity);
                        RectF rectFOooO0OO = o000o.OooO0OO();
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
                            oooOO1.f38153OooO0o0 = iRound3;
                            oooOO1.f38152OooO0o = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                oooOO1.f38151OooO0Oo.fling(iRound3, iRound4, i3, i4, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        imageView.post(o000o.f38136OooOo0);
                    }
                }
                VelocityTracker velocityTracker = this.f38112OooO0Oo;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f38112OooO0Oo = null;
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.f38110OooO0O0);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.f38110OooO0O0);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f38113OooO0o;
                float f4 = y3 - this.f38115OooO0oO;
                if (!this.f38114OooO0o0) {
                    this.f38114OooO0o0 = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.f38116OooO0oo);
                }
                if (this.f38114OooO0o0) {
                    o000O o000o2 = o000O.this;
                    if (!o000o2.f38129OooOOO0.f38111OooO0OO.isInProgress()) {
                        o000o2.f38131OooOOOo.postTranslate(f3, f4);
                        o000o2.OooO00o();
                        ViewParent parent = o000o2.f38126OooOO0O.getParent();
                        if (o000o2.f38119OooO && !o000o2.f38129OooOOO0.f38111OooO0OO.isInProgress() && !o000o2.f38125OooOO0) {
                            int i5 = o000o2.f38138OooOo0O;
                            if ((i5 == 2 || ((i5 == 0 && f3 >= 1.0f) || (i5 == 1 && f3 <= -1.0f))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f38113OooO0o = x3;
                    this.f38115OooO0oO = y3;
                    VelocityTracker velocityTracker2 = this.f38112OooO0Oo;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f38109OooO00o = -1;
                VelocityTracker velocityTracker3 = this.f38112OooO0Oo;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f38112OooO0Oo = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f38109OooO00o) {
                    int i6 = action2 != 0 ? 0 : 1;
                    this.f38109OooO00o = motionEvent.getPointerId(i6);
                    this.f38113OooO0o = motionEvent.getX(i6);
                    this.f38115OooO0oO = motionEvent.getY(i6);
                }
            }
        } else {
            this.f38109OooO00o = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f38112OooO0Oo = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.f38110OooO0O0);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f38113OooO0o = x;
            try {
                y = motionEvent.getY(this.f38110OooO0O0);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.f38115OooO0oO = y;
            this.f38114OooO0o0 = false;
        }
        int i7 = this.f38109OooO00o;
        this.f38110OooO0O0 = motionEvent.findPointerIndex(i7 != -1 ? i7 : 0);
    }
}
