package p427o0OoO0o;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f39847OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int[] f39848OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39850OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[] f39852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float[] f39853OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f39854OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f39855OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int[] f39856OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int[] f39857OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f39858OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public VelocityTracker f39859OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f39860OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f39861OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f39862OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f39863OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OverScroller f39864OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f39865OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO0OO f39866OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f39867OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public View f39868OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final ViewGroup f39869OooOo0O;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39851OooO0OO = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f39870OooOo0o = new OooO0O0();

    public class OooO00o implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00000.this.OooOo0O(0);
        }
    }

    public static abstract class OooO0OO {
        public abstract void OooO(@NonNull View view, int i, int i2);

        public abstract int OooO00o(@NonNull View view, int i);

        public abstract int OooO0O0(@NonNull View view, int i);

        public int OooO0OO(@NonNull View view) {
            return 0;
        }

        public int OooO0Oo() {
            return 0;
        }

        public void OooO0o() {
        }

        public void OooO0o0(int i, int i2) {
        }

        public void OooO0oO(@NonNull View view, int i) {
        }

        public abstract void OooO0oo(int i);

        public abstract void OooOO0(@NonNull View view, float f, float f2);

        public abstract boolean OooOO0O(@NonNull View view, int i);
    }

    public o00000(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull OooO0OO oooO0OO) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (oooO0OO == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f39869OooOo0O = viewGroup;
        this.f39866OooOOoo = oooO0OO;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f39863OooOOOo = i;
        this.f39862OooOOOO = i;
        this.f39850OooO0O0 = viewConfiguration.getScaledTouchSlop();
        this.f39861OooOOO0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f39860OooOOO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f39864OooOOo = new OverScroller(context, f39847OooOo);
    }

    public static o00000 OooOO0(@NonNull ViewGroup viewGroup, float f, @NonNull OooO0OO oooO0OO) {
        o00000 o00000Var = new o00000(viewGroup.getContext(), viewGroup, oooO0OO);
        o00000Var.f39850OooO0O0 = (int) ((1.0f / f) * o00000Var.f39850OooO0O0);
        return o00000Var;
    }

    public final boolean OooO() {
        if (this.f39849OooO00o == 2) {
            boolean zComputeScrollOffset = this.f39864OooOOo.computeScrollOffset();
            int currX = this.f39864OooOOo.getCurrX();
            int currY = this.f39864OooOOo.getCurrY();
            int left = currX - this.f39868OooOo00.getLeft();
            int top = currY - this.f39868OooOo00.getTop();
            if (left != 0) {
                ViewCompat.OooOOOO(this.f39868OooOo00, left);
            }
            if (top != 0) {
                ViewCompat.OooOOOo(this.f39868OooOo00, top);
            }
            if (left != 0 || top != 0) {
                this.f39866OooOOoo.OooO(this.f39868OooOo00, currX, currY);
            }
            if (zComputeScrollOffset && currX == this.f39864OooOOo.getFinalX() && currY == this.f39864OooOOo.getFinalY()) {
                this.f39864OooOOo.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f39869OooOo0O.post(this.f39870OooOo0o);
            }
        }
        return this.f39849OooO00o == 2;
    }

    public final void OooO00o() {
        OooO0O0();
        if (this.f39849OooO00o == 2) {
            this.f39864OooOOo.getCurrX();
            this.f39864OooOOo.getCurrY();
            this.f39864OooOOo.abortAnimation();
            this.f39866OooOOoo.OooO(this.f39868OooOo00, this.f39864OooOOo.getCurrX(), this.f39864OooOOo.getCurrY());
        }
        OooOo0O(0);
    }

    public final void OooO0O0() {
        this.f39851OooO0OO = -1;
        float[] fArr = this.f39852OooO0Oo;
        if (fArr != null) {
            Arrays.fill(fArr, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f39854OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f39853OooO0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f39855OooO0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Arrays.fill(this.f39856OooO0oo, 0);
            Arrays.fill(this.f39848OooO, 0);
            Arrays.fill(this.f39857OooOO0, 0);
            this.f39858OooOO0O = 0;
        }
        VelocityTracker velocityTracker = this.f39859OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f39859OooOO0o = null;
        }
    }

    public final void OooO0OO(@NonNull View view, int i) {
        if (view.getParent() != this.f39869OooOo0O) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbOooO0o0.append(this.f39869OooOo0O);
            sbOooO0o0.append(")");
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        this.f39868OooOo00 = view;
        this.f39851OooO0OO = i;
        this.f39866OooOOoo.OooO0oO(view, i);
        OooOo0O(1);
    }

    public final boolean OooO0Oo(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f39856OooO0oo[i] & i2) != i2 || (this.f39865OooOOo0 & i2) == 0 || (this.f39857OooOO0[i] & i2) == i2 || (this.f39848OooO[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f39850OooO0O0;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            Objects.requireNonNull(this.f39866OooOOoo);
        }
        return (this.f39848OooO[i] & i2) == 0 && fAbs > ((float) this.f39850OooO0O0);
    }

    public final float OooO0o(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (fAbs > f3) {
            return f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? f3 : -f3;
        }
        return f;
    }

    public final boolean OooO0o0(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f39866OooOOoo.OooO0OO(view) > 0;
        boolean z2 = this.f39866OooOOoo.OooO0Oo() > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f39850OooO0O0;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f39850OooO0O0);
        }
        return z2 && Math.abs(f2) > ((float) this.f39850OooO0O0);
    }

    public final void OooO0oO(int i) {
        if (this.f39852OooO0Oo == null || !OooOOO(i)) {
            return;
        }
        this.f39852OooO0Oo[i] = 0.0f;
        this.f39854OooO0o0[i] = 0.0f;
        this.f39853OooO0o[i] = 0.0f;
        this.f39855OooO0oO[i] = 0.0f;
        this.f39856OooO0oo[i] = 0;
        this.f39848OooO[i] = 0;
        this.f39857OooOO0[i] = 0;
        this.f39858OooOO0O = (~(1 << i)) & this.f39858OooOO0O;
    }

    public final int OooO0oo(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f39869OooOo0O.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final void OooOO0O(float f, float f2) {
        this.f39867OooOo0 = true;
        this.f39866OooOOoo.OooOO0(this.f39868OooOo00, f, f2);
        this.f39867OooOo0 = false;
        if (this.f39849OooO00o == 1) {
            OooOo0O(0);
        }
    }

    @Nullable
    public final View OooOO0o(int i, int i2) {
        for (int childCount = this.f39869OooOo0O.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f39869OooOo0O;
            Objects.requireNonNull(this.f39866OooOOoo);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean OooOOO(int i) {
        return ((1 << i) & this.f39858OooOO0O) != 0;
    }

    public final boolean OooOOO0(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f39868OooOo00.getLeft();
        int top = this.f39868OooOo00.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f39864OooOOo.abortAnimation();
            OooOo0O(0);
            return false;
        }
        View view = this.f39868OooOo00;
        int i7 = (int) this.f39860OooOOO;
        int i8 = (int) this.f39861OooOOO0;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f39860OooOOO;
        int i10 = (int) this.f39861OooOOO0;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i10) {
            i4 = i4 > 0 ? i10 : -i10;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
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
        this.f39864OooOOo.startScroll(left, top, i5, i6, (int) ((OooO0oo(i6, i4, this.f39866OooOOoo.OooO0Oo()) * (f3 / f4)) + (OooO0oo(i5, i3, this.f39866OooOOoo.OooO0OO(view)) * f5)));
        OooOo0O(2);
        return true;
    }

    public final boolean OooOOOO(int i) {
        if (OooOOO(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final boolean OooOOOo(@Nullable View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void OooOOo() {
        this.f39859OooOO0o.computeCurrentVelocity(1000, this.f39861OooOOO0);
        OooOO0O(OooO0o(this.f39859OooOO0o.getXVelocity(this.f39851OooO0OO), this.f39860OooOOO, this.f39861OooOOO0), OooO0o(this.f39859OooOO0o.getYVelocity(this.f39851OooO0OO), this.f39860OooOOO, this.f39861OooOOO0));
    }

    public final void OooOOo0(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO0O0();
        }
        if (this.f39859OooOO0o == null) {
            this.f39859OooOO0o = VelocityTracker.obtain();
        }
        this.f39859OooOO0o.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewOooOO0o = OooOO0o((int) x, (int) y);
            OooOo00(x, y, pointerId);
            OooOoO(viewOooOO0o, pointerId);
            if ((this.f39856OooO0oo[pointerId] & this.f39865OooOOo0) != 0) {
                this.f39866OooOOoo.OooO0o();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f39849OooO00o == 1) {
                OooOOo();
            }
            OooO0O0();
            return;
        }
        if (actionMasked == 2) {
            if (this.f39849OooO00o != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (OooOOOO(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x2 - this.f39852OooO0Oo[pointerId2];
                        float f2 = y2 - this.f39854OooO0o0[pointerId2];
                        OooOOoo(f, f2, pointerId2);
                        if (this.f39849OooO00o != 1) {
                            View viewOooOO0o2 = OooOO0o((int) x2, (int) y2);
                            if (OooO0o0(viewOooOO0o2, f, f2) && OooOoO(viewOooOO0o2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                OooOo0(motionEvent);
                return;
            }
            if (OooOOOO(this.f39851OooO0OO)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f39851OooO0OO);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f39853OooO0o;
                int i3 = this.f39851OooO0OO;
                int i4 = (int) (x3 - fArr[i3]);
                int i5 = (int) (y3 - this.f39855OooO0oO[i3]);
                int left = this.f39868OooOo00.getLeft() + i4;
                int top = this.f39868OooOo00.getTop() + i5;
                int left2 = this.f39868OooOo00.getLeft();
                int top2 = this.f39868OooOo00.getTop();
                if (i4 != 0) {
                    left = this.f39866OooOOoo.OooO00o(this.f39868OooOo00, left);
                    ViewCompat.OooOOOO(this.f39868OooOo00, left - left2);
                }
                if (i5 != 0) {
                    top = this.f39866OooOOoo.OooO0O0(this.f39868OooOo00, top);
                    ViewCompat.OooOOOo(this.f39868OooOo00, top - top2);
                }
                if (i4 != 0 || i5 != 0) {
                    this.f39866OooOOoo.OooO(this.f39868OooOo00, left, top);
                }
                OooOo0(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f39849OooO00o == 1) {
                OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            OooO0O0();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            OooOo00(x4, y4, pointerId3);
            if (this.f39849OooO00o == 0) {
                OooOoO(OooOO0o((int) x4, (int) y4), pointerId3);
                if ((this.f39856OooO0oo[pointerId3] & this.f39865OooOOo0) != 0) {
                    this.f39866OooOOoo.OooO0o();
                    return;
                }
                return;
            }
            if (OooOOOo(this.f39868OooOo00, (int) x4, (int) y4)) {
                OooOoO(this.f39868OooOo00, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f39849OooO00o == 1 && pointerId4 == this.f39851OooO0OO) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f39851OooO0OO) {
                    View viewOooOO0o3 = OooOO0o((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f39868OooOo00;
                    if (viewOooOO0o3 == view && OooOoO(view, pointerId5)) {
                        i = this.f39851OooO0OO;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                OooOOo();
            }
        }
        OooO0oO(pointerId4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [o0OoO0o.o00000$OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOOoo(float f, float f2, int i) {
        int i2;
        boolean zOooO0Oo = OooO0Oo(f, f2, i, 1);
        ?? r0 = zOooO0Oo;
        if (OooO0Oo(f2, f, i, 4)) {
            r0 = (zOooO0Oo ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (OooO0Oo(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (OooO0Oo(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f39848OooO;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f39866OooOOoo.OooO0o0(r2, i);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    public final boolean OooOo(@NonNull MotionEvent motionEvent) {
        boolean z;
        View viewOooOO0o;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO0O0();
        }
        if (this.f39859OooOO0o == null) {
            this.f39859OooOO0o = VelocityTracker.obtain();
        }
        this.f39859OooOO0o.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                OooO0O0();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    OooO0O0();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x = motionEvent.getX(actionIndex);
                    float y = motionEvent.getY(actionIndex);
                    OooOo00(x, y, pointerId);
                    int i = this.f39849OooO00o;
                    if (i == 0) {
                        if ((this.f39856OooO0oo[pointerId] & this.f39865OooOOo0) != 0) {
                            this.f39866OooOOoo.OooO0o();
                        }
                    } else if (i == 2 && (viewOooOO0o = OooOO0o((int) x, (int) y)) == this.f39868OooOo00) {
                        OooOoO(viewOooOO0o, pointerId);
                    }
                } else if (actionMasked == 6) {
                    OooO0oO(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f39852OooO0Oo != null && this.f39854OooO0o0 != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (OooOOOO(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x2 - this.f39852OooO0Oo[pointerId2];
                        float f2 = y2 - this.f39854OooO0o0[pointerId2];
                        View viewOooOO0o2 = OooOO0o((int) x2, (int) y2);
                        boolean z2 = viewOooOO0o2 != null && OooO0o0(viewOooOO0o2, f, f2);
                        if (!z2) {
                            OooOOoo(f, f2, pointerId2);
                            if (this.f39849OooO00o != 1) {
                                break;
                            }
                        } else {
                            int left = viewOooOO0o2.getLeft();
                            int iOooO00o = this.f39866OooOOoo.OooO00o(viewOooOO0o2, ((int) f) + left);
                            int top = viewOooOO0o2.getTop();
                            int iOooO0O0 = this.f39866OooOOoo.OooO0O0(viewOooOO0o2, ((int) f2) + top);
                            int iOooO0OO = this.f39866OooOOoo.OooO0OO(viewOooOO0o2);
                            int iOooO0Oo = this.f39866OooOOoo.OooO0Oo();
                            if ((iOooO0OO == 0 || (iOooO0OO > 0 && iOooO00o == left)) && (iOooO0Oo == 0 || (iOooO0Oo > 0 && iOooO0O0 == top))) {
                                break;
                            }
                            OooOOoo(f, f2, pointerId2);
                            if (this.f39849OooO00o != 1 || (z2 && OooOoO(viewOooOO0o2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                OooOo0(motionEvent);
            }
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            z = false;
            int pointerId3 = motionEvent.getPointerId(0);
            OooOo00(x3, y3, pointerId3);
            View viewOooOO0o3 = OooOO0o((int) x3, (int) y3);
            if (viewOooOO0o3 == this.f39868OooOo00 && this.f39849OooO00o == 2) {
                OooOoO(viewOooOO0o3, pointerId3);
            }
            if ((this.f39856OooO0oo[pointerId3] & this.f39865OooOOo0) != 0) {
                this.f39866OooOOoo.OooO0o();
            }
        }
        if (this.f39849OooO00o == 1) {
            return true;
        }
        return z;
    }

    public final void OooOo0(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (OooOOOO(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f39853OooO0o[pointerId] = x;
                this.f39855OooO0oO[pointerId] = y;
            }
        }
    }

    public final void OooOo00(float f, float f2, int i) {
        float[] fArr = this.f39852OooO0Oo;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f39854OooO0o0;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f39853OooO0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f39855OooO0oO;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f39856OooO0oo;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f39848OooO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f39857OooOO0;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f39852OooO0Oo = fArr2;
            this.f39854OooO0o0 = fArr3;
            this.f39853OooO0o = fArr4;
            this.f39855OooO0oO = fArr5;
            this.f39856OooO0oo = iArr;
            this.f39848OooO = iArr2;
            this.f39857OooOO0 = iArr3;
        }
        float[] fArr9 = this.f39852OooO0Oo;
        this.f39853OooO0o[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f39854OooO0o0;
        this.f39855OooO0oO[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f39856OooO0oo;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.f39869OooOo0O.getLeft() + this.f39862OooOOOO ? 1 : 0;
        if (i4 < this.f39869OooOo0O.getTop() + this.f39862OooOOOO) {
            i5 |= 4;
        }
        if (i3 > this.f39869OooOo0O.getRight() - this.f39862OooOOOO) {
            i5 |= 2;
        }
        if (i4 > this.f39869OooOo0O.getBottom() - this.f39862OooOOOO) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f39858OooOO0O |= 1 << i;
    }

    public final void OooOo0O(int i) {
        this.f39869OooOo0O.removeCallbacks(this.f39870OooOo0o);
        if (this.f39849OooO00o != i) {
            this.f39849OooO00o = i;
            this.f39866OooOOoo.OooO0oo(i);
            if (this.f39849OooO00o == 0) {
                this.f39868OooOo00 = null;
            }
        }
    }

    public final boolean OooOo0o(int i, int i2) {
        if (this.f39867OooOo0) {
            return OooOOO0(i, i2, (int) this.f39859OooOO0o.getXVelocity(this.f39851OooO0OO), (int) this.f39859OooOO0o.getYVelocity(this.f39851OooO0OO));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean OooOoO(View view, int i) {
        if (view == this.f39868OooOo00 && this.f39851OooO0OO == i) {
            return true;
        }
        if (view == null || !this.f39866OooOOoo.OooOO0O(view, i)) {
            return false;
        }
        this.f39851OooO0OO = i;
        OooO0OO(view, i);
        return true;
    }

    public final boolean OooOoO0(@NonNull View view, int i, int i2) {
        this.f39868OooOo00 = view;
        this.f39851OooO0OO = -1;
        boolean zOooOOO0 = OooOOO0(i, i2, 0, 0);
        if (!zOooOOO0 && this.f39849OooO00o == 0 && this.f39868OooOo00 != null) {
            this.f39868OooOo00 = null;
        }
        return zOooOOO0;
    }
}
