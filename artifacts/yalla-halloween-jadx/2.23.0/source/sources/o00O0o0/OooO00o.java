package o00O0o0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.billy.android.swipe.OooOOO0;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import p122o00O0o0O.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final InterpolatorC0422OooO00o f36672OooOOo = new InterpolatorC0422OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36673OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f36675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36676OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float[] f36678OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f36679OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f36680OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float[] f36681OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public VelocityTracker f36682OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f36683OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f36684OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOOO0 f36685OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OverScroller f36686OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ViewGroup f36687OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f36688OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f36689OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f36674OooO00o = 600;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36677OooO0Oo = -1;

    /* JADX INFO: renamed from: o00O0o0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class InterpolatorC0422OooO00o implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public OooO00o(Context context, ViewGroup viewGroup, OooOOO0 oooOOO0) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (oooOOO0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f36687OooOOOO = viewGroup;
        this.f36685OooOOO = oooOOO0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f36676OooO0OO = viewConfiguration.getScaledTouchSlop();
        this.f36683OooOO0O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f36684OooOO0o = viewConfiguration.getScaledMinimumFlingVelocity();
        InterpolatorC0422OooO00o interpolatorC0422OooO00o = f36672OooOOo;
        if (this.f36686OooOOO0 != null) {
            OooO00o();
            int i = this.f36675OooO0O0;
            if (i == 2 || i == 3) {
                int currX = this.f36686OooOOO0.getCurrX();
                int currY = this.f36686OooOOO0.getCurrY();
                this.f36686OooOOO0.abortAnimation();
                int currX2 = this.f36686OooOOO0.getCurrX();
                int currY2 = this.f36686OooOOO0.getCurrY();
                oooOOO0.OooOOO(currX2, currY2, currX2 - currX, currY2 - currY);
            }
            OooOOO0(0);
            this.f36686OooOOO0 = null;
        }
        this.f36686OooOOO0 = new OverScroller(context, interpolatorC0422OooO00o);
    }

    public final void OooO(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0 && this.f36675OooO0O0 != 1) {
            OooO00o();
        }
        if (this.f36682OooOO0 == null) {
            this.f36682OooOO0 = VelocityTracker.obtain();
        }
        this.f36682OooOO0.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            OooOO0O(x, y, pointerId);
            int i3 = this.f36675OooO0O0;
            if (i3 != 1) {
                OooOOo0(pointerId, i3 == 2 || i3 == 3, x, y, 0.0f, 0.0f);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f36675OooO0O0 == 1) {
                OooOO0();
            }
            OooO00o();
            return;
        }
        if (actionMasked == 2) {
            if (this.f36675OooO0O0 == 1) {
                if (OooO0oO(this.f36677OooO0Oo) && (iFindPointerIndex = motionEvent.findPointerIndex(this.f36677OooO0Oo)) >= 0) {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f36680OooO0oO;
                    int i4 = this.f36677OooO0Oo;
                    int i5 = (int) (x2 - fArr[i4]);
                    int i6 = (int) (y2 - this.f36681OooO0oo[i4]);
                    OooO0o(this.f36688OooOOOo + i5, this.f36689OooOOo0 + i6, i5, i6);
                    OooOO0o(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 0; i7 < pointerCount; i7++) {
                int pointerId2 = motionEvent.getPointerId(i7);
                if (OooO0oO(pointerId2)) {
                    float x3 = motionEvent.getX(i7);
                    float y3 = motionEvent.getY(i7);
                    float f = this.f36679OooO0o0[pointerId2];
                    float f2 = this.f36678OooO0o[pointerId2];
                    float f3 = x3 - f;
                    float f4 = y3 - f2;
                    if (OooO0O0(f3, f4) && OooOOo0(pointerId2, false, f, f2, f3, f4)) {
                        break;
                    }
                }
            }
            OooOO0o(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f36675OooO0O0 == 1) {
                OooO0o0(0.0f, 0.0f);
            }
            OooO00o();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            OooOO0O(x4, y4, pointerId3);
            if (this.f36675OooO0O0 == 1) {
                OooOOo0(pointerId3, true, x4, y4, 0.0f, 0.0f);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f36675OooO0O0 == 1 && pointerId4 == this.f36677OooO0Oo) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f36677OooO0Oo && OooO0oO(pointerId5)) {
                    float f5 = this.f36679OooO0o0[pointerId5];
                    if (OooOOo0(pointerId5, true, f5, f5, 0.0f, 0.0f)) {
                        i = this.f36677OooO0Oo;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                OooOO0();
            }
        }
        OooO0OO(pointerId4);
    }

    public final void OooO00o() {
        this.f36677OooO0Oo = -1;
        float[] fArr = this.f36679OooO0o0;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f36678OooO0o, 0.0f);
            Arrays.fill(this.f36680OooO0oO, 0.0f);
            Arrays.fill(this.f36681OooO0oo, 0.0f);
            this.f36673OooO = 0;
        }
        VelocityTracker velocityTracker = this.f36682OooOO0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36682OooOO0 = null;
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        OooOOO0 oooOOO0 = this.f36685OooOOO;
        boolean z = oooOOO0.OooO0o(f) > 0;
        boolean z2 = oooOOO0.OooO0oo(f2) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f36676OooO0OO;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f36676OooO0OO);
        }
        return z2 && Math.abs(f2) > ((float) this.f36676OooO0OO);
    }

    public final void OooO0OO(int i) {
        float[] fArr = this.f36679OooO0o0;
        if (fArr != null) {
            int i2 = this.f36673OooO;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f36678OooO0o[i] = 0.0f;
                this.f36680OooO0oO[i] = 0.0f;
                this.f36681OooO0oo[i] = 0.0f;
                this.f36673OooO = (~i3) & i2;
            }
        }
    }

    public final int OooO0Oo(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f36687OooOOOO.getWidth();
        float f = width >> 1;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) ((Math.abs(i) / i3) * this.f36674OooO00o), this.f36674OooO00o);
    }

    public final void OooO0o(int i, int i2, int i3, int i4) {
        int i5 = this.f36688OooOOOo;
        int i6 = this.f36689OooOOo0;
        OooOOO0 oooOOO0 = this.f36685OooOOO;
        if (i3 != 0) {
            i = oooOOO0.OooO0OO(i);
            this.f36688OooOOOo = i;
        }
        if (i4 != 0) {
            i2 = oooOOO0.OooO0Oo(i2);
            this.f36689OooOOo0 = i2;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        oooOOO0.OooOOO(i, i2, i - i5, i2 - i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o0(float f, float f2) {
        OooOOO0 oooOOO0 = this.f36685OooOOO;
        ViewParent parent = oooOOO0.f9798OooO00o.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        for (OooO0OO oooO0OO : oooOOO0.f9814OooOOo0) {
            if (oooO0OO != null) {
                oooO0OO.OooO0OO(oooOOO0.f9798OooO00o, oooOOO0.f9807OooOO0O);
            }
        }
        float f3 = oooOOO0.f9807OooOO0O;
        int i = oooOOO0.f9812OooOOOo;
        if (f3 < 1.0f || (i & 4) != 4) {
            int i2 = i & 3;
            if (i2 == 1) {
                if (f3 >= 1.0f) {
                    oooOOO0.OooOO0o();
                }
                oooOOO0.OooOOOO(0.0f);
            } else if (i2 == 2) {
                oooOOO0.OooOOOO(1.0f);
            } else if (i2 == 3) {
                boolean z = (r7 = oooOOO0.f9799OooO0O0) != 1 ? true : true;
                oooOOO0.OooOOOO(z ? 1.0f : 0.0f);
            }
        } else {
            oooOOO0.OooOOOO(1.0f);
        }
        if (this.f36675OooO0O0 == 1) {
            OooOOO0(0);
        }
    }

    public final boolean OooO0oO(int i) {
        if ((this.f36673OooO & (1 << i)) != 0) {
            return true;
        }
        Log.e("SwipeHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  SwipeHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void OooO0oo(int i, int i2, int[] iArr, boolean z) {
        int iOooO0OO;
        int iOooO0Oo;
        if (this.f36675OooO0O0 == 0) {
            OooOOo(z ? -3 : -2, false, 0.0f, 0.0f, i, i2, false);
            return;
        }
        int i3 = this.f36688OooOOOo;
        OooOOO0 oooOOO0 = this.f36685OooOOO;
        if (i3 == 0 && i == 0) {
            iOooO0OO = 0;
        } else {
            iOooO0OO = oooOOO0.OooO0OO(i3 + i);
            iArr[0] = iOooO0OO - this.f36688OooOOOo;
        }
        int i4 = this.f36689OooOOo0;
        if (i4 == 0 && i2 == 0) {
            iOooO0Oo = 0;
        } else {
            iOooO0Oo = oooOOO0.OooO0Oo(i4 + i2);
            iArr[1] = iOooO0Oo - this.f36689OooOOo0;
        }
        if (this.f36688OooOOOo != 0 || this.f36689OooOOo0 != 0 || iArr[0] != 0 || iArr[1] != 0) {
            OooO0o(iOooO0OO, iOooO0Oo, iArr[0], iArr[1]);
        } else {
            this.f36677OooO0Oo = -1;
            OooOOO0(0);
        }
    }

    public final void OooOO0() {
        VelocityTracker velocityTracker = this.f36682OooOO0;
        float f = this.f36683OooOO0O;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f36682OooOO0.getXVelocity(this.f36677OooO0Oo);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f36684OooOO0o;
        float f3 = 0.0f;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f36682OooOO0.getYVelocity(this.f36677OooO0Oo);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f2) {
            if (fAbs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        OooO0o0(xVelocity, f3);
    }

    public final void OooOO0O(float f, float f2, int i) {
        float[] fArr = this.f36679OooO0o0;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f36678OooO0o;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f36680OooO0oO;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f36681OooO0oo;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            this.f36679OooO0o0 = fArr2;
            this.f36678OooO0o = fArr3;
            this.f36680OooO0oO = fArr4;
            this.f36681OooO0oo = fArr5;
        }
        float[] fArr9 = this.f36679OooO0o0;
        this.f36680OooO0oO[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f36678OooO0o;
        this.f36681OooO0oo[i] = f2;
        fArr10[i] = f2;
        this.f36673OooO |= 1 << i;
    }

    public final void OooOO0o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (OooO0oO(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f36680OooO0oO[pointerId] = x;
                this.f36681OooO0oo[pointerId] = y;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    public final boolean OooOOO(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO00o();
        }
        if (this.f36682OooOO0 == null) {
            this.f36682OooOO0 = VelocityTracker.obtain();
        }
        this.f36682OooOO0.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            OooOO0O(x, y, pointerId);
            int i = this.f36675OooO0O0;
            if (i == 2 || i == 3) {
                OooOOo0(pointerId, true, x, y, 0.0f, 0.0f);
            }
        } else if (actionMasked == 1) {
            OooO00o();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                OooO00o();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                OooOO0O(x2, y2, pointerId2);
                int i2 = this.f36675OooO0O0;
                if (i2 == 2 || i2 == 3) {
                    OooOOo0(pointerId2, true, x2, y2, 0.0f, 0.0f);
                }
            } else if (actionMasked == 6) {
                OooO0OO(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f36679OooO0o0 != null && this.f36678OooO0o != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                int pointerId3 = motionEvent.getPointerId(i3);
                if (OooO0oO(pointerId3)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f = this.f36679OooO0o0[pointerId3];
                    float f2 = this.f36678OooO0o[pointerId3];
                    float f3 = x3 - f;
                    float f4 = y3 - f2;
                    boolean zOooO0O0 = OooO0O0(f3, f4);
                    if (zOooO0O0) {
                        OooOOO0 oooOOO0 = this.f36685OooOOO;
                        int iOooO0o = oooOOO0.OooO0o(f3);
                        int iOooO0oo = oooOOO0.OooO0oo(f4);
                        if (iOooO0o != 0 || iOooO0oo != 0) {
                            if (zOooO0O0 && OooOOo0(pointerId3, false, f, f2, f3, f4)) {
                                break;
                            }
                        }
                    } else if (zOooO0O0) {
                        continue;
                    }
                }
            }
            OooOO0o(motionEvent);
        }
        return this.f36675OooO0O0 == 1;
    }

    public final void OooOOO0(int i) {
        if (this.f36675OooO0O0 != i) {
            this.f36675OooO0O0 = i;
            OooOOO0 oooOOO0 = this.f36685OooOOO;
            CopyOnWriteArrayList<OooO0OO> copyOnWriteArrayList = oooOOO0.f9814OooOOo0;
            for (OooO0OO oooO0OO : copyOnWriteArrayList) {
                if (oooO0OO != null) {
                    oooO0OO.OooO0o();
                }
            }
            if (i == 0) {
                float f = oooOOO0.f9807OooOO0O;
                if (f >= 1.0f) {
                    oooOOO0.OooOO0o();
                    return;
                }
                if (f <= 0.0f) {
                    for (OooO0OO oooO0OO2 : copyOnWriteArrayList) {
                        if (oooO0OO2 != null) {
                            oooO0OO2.OooO0o0(oooOOO0.f9799OooO0O0);
                        }
                    }
                    oooOOO0.f9799OooO0O0 = 0;
                }
            }
        }
    }

    public final boolean OooOOOO(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = this.f36688OooOOOo;
        int i6 = this.f36689OooOOo0;
        int i7 = i - i5;
        int i8 = i2 - i6;
        this.f36686OooOOO0.abortAnimation();
        OooOOO0 oooOOO0 = this.f36685OooOOO;
        if (i7 == 0 && i8 == 0) {
            OooOOO0(2);
            oooOOO0.OooOOO(i, i2, i7, i8);
            OooOOO0(0);
            return false;
        }
        int i9 = (int) this.f36684OooOO0o;
        int i10 = (int) this.f36683OooOO0O;
        int iAbs = Math.abs(i3);
        if (iAbs < i9) {
            i3 = 0;
        } else if (iAbs > i10) {
            i3 = i3 > 0 ? i10 : -i10;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i10) {
            i4 = i4 > 0 ? i10 : -i10;
        }
        int iAbs3 = Math.abs(i7);
        int iAbs4 = Math.abs(i8);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i11 = iAbs5 + iAbs6;
        int i12 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i11;
        } else {
            f = iAbs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i11;
        } else {
            f3 = iAbs4;
            f4 = i12;
        }
        this.f36686OooOOO0.startScroll(i5, i6, i7, i8, (int) ((OooO0Oo(i8, i4, oooOOO0.OooO0oo(i8)) * (f3 / f4)) + (OooO0Oo(i7, i3, oooOOO0.OooO0o(i7)) * f5)));
        OooOOO0(2);
        return true;
    }

    public final boolean OooOOOo(int i, int i2) {
        VelocityTracker velocityTracker = this.f36682OooOO0;
        boolean zOooOOOO = velocityTracker != null ? OooOOOO(i, i2, (int) velocityTracker.getXVelocity(this.f36677OooO0Oo), (int) this.f36682OooOO0.getYVelocity(this.f36677OooO0Oo)) : OooOOOO(i, i2, 0, 0);
        this.f36677OooO0Oo = -1;
        return zOooOOOO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    public final boolean OooOOo(int i, boolean z, float f, float f2, float f3, float f4, boolean z2) {
        boolean z3;
        if (this.f36677OooO0Oo == i) {
            return true;
        }
        OooOOO0 oooOOO0 = this.f36685OooOOO;
        if (!z && this.f36675OooO0O0 != 2) {
            int iOooO00o = oooOOO0.OooO00o(i, f, f2, f3, f4);
            z3 = iOooO00o != 0;
            if (z3) {
                oooOOO0.f9799OooO0O0 = iOooO00o;
            }
        } else if (oooOOO0.OooO(i, oooOOO0.f9799OooO0O0)) {
            z3 = false;
        } else {
            int i2 = oooOOO0.f9799OooO0O0;
            if (i2 != 0 && (oooOOO0.f9810OooOOO0 & i2) == i2) {
                if (i2 != 0 && (oooOOO0.f9809OooOOO & i2) == i2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
        }
        if (!z3) {
            return false;
        }
        this.f36677OooO0Oo = i;
        if (i >= 0) {
            float[] fArr = this.f36679OooO0o0;
            if (i < fArr.length) {
                float[] fArr2 = this.f36678OooO0o;
                if (i < fArr2.length) {
                    float f5 = fArr[i];
                    float f6 = fArr2[i];
                }
            }
        }
        oooOOO0.OooOOO0();
        this.f36688OooOOOo = oooOOO0.OooO0OO(0);
        this.f36689OooOOo0 = oooOOO0.OooO0Oo(0);
        OooOOO0(z2 ? 1 : 3);
        return true;
    }

    public final boolean OooOOo0(int i, boolean z, float f, float f2, float f3, float f4) {
        return OooOOo(i, z, f, f2, f3, f4, true);
    }
}
