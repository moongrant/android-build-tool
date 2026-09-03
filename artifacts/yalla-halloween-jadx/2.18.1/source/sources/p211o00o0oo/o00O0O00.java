package p211o00o0oo;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import p209o00o0oOO.o00O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final OooO00o f33369OooOOo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33370OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f33372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33373OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float[] f33375OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f33376OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f33377OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float[] f33378OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public VelocityTracker f33379OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33380OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33381OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00O00o0 f33382OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OverScroller f33383OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ViewGroup f33384OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f33385OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f33386OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f33371OooO00o = 600;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33374OooO0Oo = -1;

    public static class OooO00o implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public o00O0O00(Context context, ViewGroup viewGroup, o00O00o0 o00o00o1) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (o00o00o1 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f33384OooOOOO = viewGroup;
        this.f33382OooOOO = o00o00o1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f33373OooO0OO = viewConfiguration.getScaledTouchSlop();
        this.f33380OooOO0O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f33381OooOO0o = viewConfiguration.getScaledMinimumFlingVelocity();
        OooO00o oooO00o = f33369OooOOo;
        if (this.f33383OooOOO0 != null) {
            OooO00o();
            int i = this.f33372OooO0O0;
            if (i == 2 || i == 3) {
                int currX = this.f33383OooOOO0.getCurrX();
                int currY = this.f33383OooOOO0.getCurrY();
                this.f33383OooOOO0.abortAnimation();
                int currX2 = this.f33383OooOOO0.getCurrX();
                int currY2 = this.f33383OooOOO0.getCurrY();
                o00o00o1.OooOo00(currX2, currY2, currX2 - currX, currY2 - currY);
            }
            OooOOO(0);
            this.f33383OooOOO0 = null;
        }
        this.f33383OooOOO0 = new OverScroller(context, oooO00o);
    }

    public final boolean OooO(int i, int i2, int[] iArr, boolean z) {
        int iOooO0Oo;
        int iOooO0o0;
        if (this.f33372OooO0O0 == 0) {
            return OooOOoo(z ? -3 : -2, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i, i2, false);
        }
        int i3 = this.f33385OooOOOo;
        if (i3 == 0 && i == 0) {
            iOooO0Oo = 0;
        } else {
            iOooO0Oo = this.f33382OooOOO.OooO0Oo(i3 + i);
            iArr[0] = iOooO0Oo - this.f33385OooOOOo;
        }
        int i4 = this.f33386OooOOo0;
        if (i4 == 0 && i2 == 0) {
            iOooO0o0 = 0;
        } else {
            iOooO0o0 = this.f33382OooOOO.OooO0o0(i4 + i2);
            iArr[1] = iOooO0o0 - this.f33386OooOOo0;
        }
        if (this.f33385OooOOOo != 0 || this.f33386OooOOo0 != 0 || iArr[0] != 0 || iArr[1] != 0) {
            OooO0oO(iOooO0Oo, iOooO0o0, iArr[0], iArr[1]);
            return true;
        }
        this.f33374OooO0Oo = -1;
        OooOOO(0);
        return false;
    }

    public final void OooO00o() {
        this.f33374OooO0Oo = -1;
        float[] fArr = this.f33376OooO0o0;
        if (fArr != null) {
            Arrays.fill(fArr, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f33375OooO0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f33377OooO0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f33378OooO0oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f33370OooO = 0;
        }
        VelocityTracker velocityTracker = this.f33379OooOO0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33379OooOO0 = null;
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        boolean z = this.f33382OooOOO.OooO0oO(f) > 0;
        boolean z2 = this.f33382OooOOO.OooO(f2) > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f33373OooO0OO;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f33373OooO0OO);
        }
        return z2 && Math.abs(f2) > ((float) this.f33373OooO0OO);
    }

    public final float OooO0OO(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (fAbs > f3) {
            return f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? f3 : -f3;
        }
        return f;
    }

    public final void OooO0Oo(int i) {
        float[] fArr = this.f33376OooO0o0;
        if (fArr != null) {
            int i2 = this.f33370OooO;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f33375OooO0o[i] = 0.0f;
                this.f33377OooO0oO[i] = 0.0f;
                this.f33378OooO0oo[i] = 0.0f;
                this.f33370OooO = (~i3) & i2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void OooO0o(float f, float f2) {
        o00O00o0 o00o00o1 = this.f33382OooOOO;
        ViewParent parent = o00o00o1.f33351OooO00o.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        for (p213o00o0ooo.o00O0O00 o00o0o01 : o00o00o1.f33364OooOOOO) {
            if (o00o0o01 != null) {
                o00o0o01.OooO0Oo(o00o00o1.f33351OooO00o, o00o00o1.f33360OooOO0O);
            }
        }
        if (o00o00o1.f33360OooOO0O >= 1.0f) {
            o00o00o1.OooOOo();
        }
        o00o00o1.OooOo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        if (this.f33372OooO0O0 == 1) {
            OooOOO(0);
        }
    }

    public final int OooO0o0(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f33384OooOOOO.getWidth();
        float f = width >> 1;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) ((Math.abs(i) / i3) * this.f33371OooO00o), this.f33371OooO00o);
    }

    public final void OooO0oO(int i, int i2, int i3, int i4) {
        int i5 = this.f33385OooOOOo;
        int i6 = this.f33386OooOOo0;
        if (i3 != 0) {
            i = this.f33382OooOOO.OooO0Oo(i);
            this.f33385OooOOOo = i;
        }
        if (i4 != 0) {
            i2 = this.f33382OooOOO.OooO0o0(i2);
            this.f33386OooOOo0 = i2;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f33382OooOOO.OooOo00(i, i2, i - i5, i2 - i6);
    }

    public final boolean OooO0oo(int i) {
        if ((this.f33370OooO & (1 << i)) != 0) {
            return true;
        }
        Log.e("SwipeHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  SwipeHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void OooOO0(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0 && this.f33372OooO0O0 != 1) {
            OooO00o();
        }
        if (this.f33379OooOO0 == null) {
            this.f33379OooOO0 = VelocityTracker.obtain();
        }
        this.f33379OooOO0.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            OooOO0o(x, y, pointerId);
            int i3 = this.f33372OooO0O0;
            if (i3 != 1) {
                OooOOo(pointerId, i3 == 2 || i3 == 3, x, y, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f33372OooO0O0 == 1) {
                OooOO0O();
            }
            OooO00o();
            return;
        }
        if (actionMasked == 2) {
            if (this.f33372OooO0O0 == 1) {
                if (OooO0oo(this.f33374OooO0Oo) && (iFindPointerIndex = motionEvent.findPointerIndex(this.f33374OooO0Oo)) >= 0) {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f33377OooO0oO;
                    int i4 = this.f33374OooO0Oo;
                    int i5 = (int) (x2 - fArr[i4]);
                    int i6 = (int) (y2 - this.f33378OooO0oo[i4]);
                    OooO0oO(this.f33385OooOOOo + i5, this.f33386OooOOo0 + i6, i5, i6);
                    OooOOO0(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 0; i7 < pointerCount; i7++) {
                int pointerId2 = motionEvent.getPointerId(i7);
                if (OooO0oo(pointerId2)) {
                    float x3 = motionEvent.getX(i7);
                    float y3 = motionEvent.getY(i7);
                    float f = this.f33376OooO0o0[pointerId2];
                    float f2 = this.f33375OooO0o[pointerId2];
                    float f3 = x3 - f;
                    float f4 = y3 - f2;
                    if (OooO0O0(f3, f4) && OooOOo(pointerId2, false, f, f2, f3, f4)) {
                        break;
                    }
                }
            }
            OooOOO0(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f33372OooO0O0 == 1) {
                OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            OooO00o();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            OooOO0o(x4, y4, pointerId3);
            if (this.f33372OooO0O0 == 1) {
                OooOOo(pointerId3, true, x4, y4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f33372OooO0O0 == 1 && pointerId4 == this.f33374OooO0Oo) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f33374OooO0Oo && OooO0oo(pointerId5)) {
                    float[] fArr2 = this.f33376OooO0o0;
                    if (OooOOo(pointerId5, true, fArr2[pointerId5], fArr2[pointerId5], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                        i = this.f33374OooO0Oo;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                OooOO0O();
            }
        }
        OooO0Oo(pointerId4);
    }

    public final void OooOO0O() {
        this.f33379OooOO0.computeCurrentVelocity(1000, this.f33380OooOO0O);
        OooO0o(OooO0OO(this.f33379OooOO0.getXVelocity(this.f33374OooO0Oo), this.f33381OooOO0o, this.f33380OooOO0O), OooO0OO(this.f33379OooOO0.getYVelocity(this.f33374OooO0Oo), this.f33381OooOO0o, this.f33380OooOO0O));
    }

    public final void OooOO0o(float f, float f2, int i) {
        float[] fArr = this.f33376OooO0o0;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f33375OooO0o;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f33377OooO0oO;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f33378OooO0oo;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            this.f33376OooO0o0 = fArr2;
            this.f33375OooO0o = fArr3;
            this.f33377OooO0oO = fArr4;
            this.f33378OooO0oo = fArr5;
        }
        float[] fArr9 = this.f33376OooO0o0;
        this.f33377OooO0oO[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f33375OooO0o;
        this.f33378OooO0oo[i] = f2;
        fArr10[i] = f2;
        this.f33370OooO |= 1 << i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void OooOOO(int i) {
        if (this.f33372OooO0O0 != i) {
            this.f33372OooO0O0 = i;
            o00O00o0 o00o00o1 = this.f33382OooOOO;
            for (p213o00o0ooo.o00O0O00 o00o0o01 : o00o00o1.f33364OooOOOO) {
                if (o00o0o01 != null) {
                    o00o0o01.OooO0oo();
                }
            }
            if (i == 0) {
                float f = o00o00o1.f33360OooOO0O;
                if (f >= 1.0f) {
                    o00o00o1.OooOOo();
                    return;
                }
                if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    for (p213o00o0ooo.o00O0O00 o00o0o02 : o00o00o1.f33364OooOOOO) {
                        if (o00o0o02 != null) {
                            o00o0o02.OooO0oO(o00o00o1.f33352OooO0O0);
                        }
                    }
                    o00o00o1.f33352OooO0O0 = 0;
                }
            }
        }
    }

    public final void OooOOO0(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (OooO0oo(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f33377OooO0oO[pointerId] = x;
                this.f33378OooO0oo[pointerId] = y;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    public final boolean OooOOOO(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO00o();
        }
        if (this.f33379OooOO0 == null) {
            this.f33379OooOO0 = VelocityTracker.obtain();
        }
        this.f33379OooOO0.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            OooOO0o(x, y, pointerId);
            int i = this.f33372OooO0O0;
            if (i == 2 || i == 3) {
                OooOOo(pointerId, true, x, y, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
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
                OooOO0o(x2, y2, pointerId2);
                int i2 = this.f33372OooO0O0;
                if (i2 == 2 || i2 == 3) {
                    OooOOo(pointerId2, true, x2, y2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
            } else if (actionMasked == 6) {
                OooO0Oo(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f33376OooO0o0 != null && this.f33375OooO0o != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i3 = 0; i3 < pointerCount; i3++) {
                int pointerId3 = motionEvent.getPointerId(i3);
                if (OooO0oo(pointerId3)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f = this.f33376OooO0o0[pointerId3];
                    float f2 = this.f33375OooO0o[pointerId3];
                    float f3 = x3 - f;
                    float f4 = y3 - f2;
                    boolean zOooO0O0 = OooO0O0(f3, f4);
                    if (zOooO0O0) {
                        int iOooO0oO = this.f33382OooOOO.OooO0oO(f3);
                        int iOooO = this.f33382OooOOO.OooO(f4);
                        if (iOooO0oO != 0 || iOooO != 0) {
                            if (zOooO0O0 && OooOOo(pointerId3, false, f, f2, f3, f4)) {
                                break;
                            }
                        }
                    } else if (zOooO0O0) {
                        continue;
                    }
                }
            }
            OooOOO0(motionEvent);
        }
        return this.f33372OooO0O0 == 1;
    }

    public final boolean OooOOOo(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = this.f33385OooOOOo;
        int i6 = this.f33386OooOOo0;
        int i7 = i - i5;
        int i8 = i2 - i6;
        this.f33383OooOOO0.abortAnimation();
        if (i7 == 0 && i8 == 0) {
            OooOOO(2);
            this.f33382OooOOO.OooOo00(i, i2, i7, i8);
            OooOOO(0);
            return false;
        }
        int i9 = (int) this.f33381OooOO0o;
        int i10 = (int) this.f33380OooOO0O;
        int iAbs = Math.abs(i3);
        if (iAbs < i9) {
            i3 = 0;
        } else if (iAbs > i10) {
            i3 = i3 > 0 ? i10 : -i10;
        }
        int i11 = (int) this.f33381OooOO0o;
        int i12 = (int) this.f33380OooOO0O;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i11) {
            i4 = 0;
        } else if (iAbs2 > i12) {
            i4 = i4 > 0 ? i12 : -i12;
        }
        int iAbs3 = Math.abs(i7);
        int iAbs4 = Math.abs(i8);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i13 = iAbs5 + iAbs6;
        int i14 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i13;
        } else {
            f = iAbs3;
            f2 = i14;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i13;
        } else {
            f3 = iAbs4;
            f4 = i14;
        }
        this.f33383OooOOO0.startScroll(i5, i6, i7, i8, (int) ((OooO0o0(i8, i4, this.f33382OooOOO.OooO(i8)) * (f3 / f4)) + (OooO0o0(i7, i3, this.f33382OooOOO.OooO0oO(i7)) * f5)));
        OooOOO(2);
        return true;
    }

    public final boolean OooOOo(int i, boolean z, float f, float f2, float f3, float f4) {
        return OooOOoo(i, z, f, f2, f3, f4, true);
    }

    public final boolean OooOOo0(int i, int i2) {
        VelocityTracker velocityTracker = this.f33379OooOO0;
        boolean zOooOOOo = velocityTracker != null ? OooOOOo(i, i2, (int) velocityTracker.getXVelocity(this.f33374OooO0Oo), (int) this.f33379OooOO0.getYVelocity(this.f33374OooO0Oo)) : OooOOOo(i, i2, 0, 0);
        this.f33374OooO0Oo = -1;
        return zOooOOOo;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    public final boolean OooOOoo(int i, boolean z, float f, float f2, float f3, float f4, boolean z2) {
        boolean z3;
        if (this.f33374OooO0Oo == i) {
            return true;
        }
        if (z || this.f33372OooO0O0 == 2) {
            o00O00o0 o00o00o1 = this.f33382OooOOO;
            if (o00o00o1.OooOOO0(i, o00o00o1.f33352OooO0O0)) {
                z3 = false;
            } else {
                int i2 = o00o00o1.f33352OooO0O0;
                if (!(i2 != 0 && (o00o00o1.f33363OooOOO0 & i2) == i2) || o00o00o1.OooOO0O(i2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
        } else {
            o00O00o0 o00o00o2 = this.f33382OooOOO;
            int iOooO0O0 = o00o00o2.OooO0O0(i, f, f2, f3, f4);
            z3 = iOooO0O0 != 0;
            if (z3) {
                o00o00o2.f33352OooO0O0 = iOooO0O0;
            }
        }
        if (!z3) {
            return false;
        }
        this.f33374OooO0Oo = i;
        if (i >= 0) {
            float[] fArr = this.f33376OooO0o0;
            if (i < fArr.length) {
                float[] fArr2 = this.f33375OooO0o;
                if (i < fArr2.length) {
                    float f5 = fArr[i];
                    float f6 = fArr2[i];
                }
            }
        }
        this.f33382OooOOO.OooOOoo();
        this.f33385OooOOOo = this.f33382OooOOO.OooO0Oo(0);
        this.f33386OooOOo0 = this.f33382OooOOO.OooO0o0(0);
        OooOOO(z2 ? 1 : 3);
        return true;
    }
}
