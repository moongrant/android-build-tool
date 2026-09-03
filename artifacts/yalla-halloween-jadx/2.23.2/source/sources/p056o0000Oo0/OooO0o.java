package p056o0000Oo0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f33645OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int[] f33646OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f33647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f33648OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[] f33650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float[] f33651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f33652OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f33653OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int[] f33654OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int[] f33655OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f33656OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public VelocityTracker f33657OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33658OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f33659OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f33660OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f33661OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final OverScroller f33662OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f33663OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO0OO f33664OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f33665OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public View f33666OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final ViewGroup f33667OooOo0O;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33649OooO0OO = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f33668OooOo0o = new OooO0O0();

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
            OooO0o.this.OooOOoo(0);
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

        public void OooO0oO(int i, @NonNull View view) {
        }

        public abstract void OooO0oo(int i);

        public abstract void OooOO0(@NonNull View view, float f, float f2);

        public abstract boolean OooOO0O(int i, @NonNull View view);
    }

    public OooO0o(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull OooO0OO oooO0OO) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (oooO0OO == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f33667OooOo0O = viewGroup;
        this.f33664OooOOoo = oooO0OO;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f33661OooOOOo = i;
        this.f33660OooOOOO = i;
        this.f33648OooO0O0 = viewConfiguration.getScaledTouchSlop();
        this.f33659OooOOO0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f33658OooOOO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f33662OooOOo = new OverScroller(context, f33645OooOo);
    }

    public static OooO0o OooO(@NonNull ViewGroup viewGroup, float f, @NonNull OooO0OO oooO0OO) {
        OooO0o oooO0o = new OooO0o(viewGroup.getContext(), viewGroup, oooO0OO);
        oooO0o.f33648OooO0O0 = (int) ((1.0f / f) * oooO0o.f33648OooO0O0);
        return oooO0o;
    }

    public static boolean OooOOO0(@Nullable View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void OooO00o() {
        OooO0O0();
        if (this.f33647OooO00o == 2) {
            OverScroller overScroller = this.f33662OooOOo;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.f33664OooOOoo.OooO(this.f33666OooOo00, overScroller.getCurrX(), overScroller.getCurrY());
        }
        OooOOoo(0);
    }

    public final void OooO0O0() {
        this.f33649OooO0OO = -1;
        float[] fArr = this.f33650OooO0Oo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f33652OooO0o0, 0.0f);
            Arrays.fill(this.f33651OooO0o, 0.0f);
            Arrays.fill(this.f33653OooO0oO, 0.0f);
            Arrays.fill(this.f33654OooO0oo, 0);
            Arrays.fill(this.f33646OooO, 0);
            Arrays.fill(this.f33655OooOO0, 0);
            this.f33656OooOO0O = 0;
        }
        VelocityTracker velocityTracker = this.f33657OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33657OooOO0o = null;
        }
    }

    public final void OooO0OO(int i, @NonNull View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f33667OooOo0O;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f33666OooOo00 = view;
        this.f33649OooO0OO = i;
        this.f33664OooOOoo.OooO0oO(i, view);
        OooOOoo(1);
    }

    public final boolean OooO0Oo(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f33654OooO0oo[i] & i2) != i2 || (this.f33663OooOOo0 & i2) == 0 || (this.f33655OooOO0[i] & i2) == i2 || (this.f33646OooO[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f33648OooO0O0;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f33664OooOOoo.getClass();
        }
        return (this.f33646OooO[i] & i2) == 0 && fAbs > ((float) this.f33648OooO0O0);
    }

    public final void OooO0o(int i) {
        float[] fArr = this.f33650OooO0Oo;
        if (fArr != null) {
            int i2 = this.f33656OooOO0O;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f33652OooO0o0[i] = 0.0f;
                this.f33651OooO0o[i] = 0.0f;
                this.f33653OooO0oO[i] = 0.0f;
                this.f33654OooO0oo[i] = 0;
                this.f33646OooO[i] = 0;
                this.f33655OooOO0[i] = 0;
                this.f33656OooOO0O = (~i3) & i2;
            }
        }
    }

    public final boolean OooO0o0(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        OooO0OO oooO0OO = this.f33664OooOOoo;
        boolean z = oooO0OO.OooO0OO(view) > 0;
        boolean z2 = oooO0OO.OooO0Oo() > 0;
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.f33648OooO0O0;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f33648OooO0O0);
        }
        return z2 && Math.abs(f2) > ((float) this.f33648OooO0O0);
    }

    public final int OooO0oO(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f33667OooOo0O.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean OooO0oo() {
        if (this.f33647OooO00o == 2) {
            OverScroller overScroller = this.f33662OooOOo;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f33666OooOo00.getLeft();
            int top = currY - this.f33666OooOo00.getTop();
            if (left != 0) {
                View view = this.f33666OooOo00;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f33666OooOo00;
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f33664OooOOoo.OooO(this.f33666OooOo00, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f33667OooOo0O.post(this.f33668OooOo0o);
            }
        }
        return this.f33647OooO00o == 2;
    }

    @Nullable
    public final View OooOO0(int i, int i2) {
        ViewGroup viewGroup = this.f33667OooOo0O;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f33664OooOOoo.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean OooOO0O(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f33666OooOo00.getLeft();
        int top = this.f33666OooOo00.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f33662OooOOo;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            OooOOoo(0);
            return false;
        }
        View view = this.f33666OooOo00;
        int i8 = (int) this.f33658OooOOO;
        int i9 = (int) this.f33659OooOOO0;
        int iAbs = Math.abs(i3);
        if (iAbs < i8) {
            i3 = 0;
        } else if (iAbs > i9) {
            i3 = i3 > 0 ? i9 : -i9;
        }
        int i10 = (int) this.f33658OooOOO;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i10) {
            i4 = i7;
        } else if (iAbs2 > i9) {
            if (i4 > 0) {
                i4 = i9;
            } else {
                i7 = -i9;
                i4 = i7;
            }
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
        float f6 = f3 / f4;
        OooO0OO oooO0OO = this.f33664OooOOoo;
        overScroller.startScroll(left, top, i5, i6, (int) ((OooO0oO(i6, i4, oooO0OO.OooO0Oo()) * f6) + (OooO0oO(i5, i3, oooO0OO.OooO0OO(view)) * f5)));
        OooOOoo(2);
        return true;
    }

    public final boolean OooOO0o(int i) {
        if ((this.f33656OooOO0O & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void OooOOO(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO0O0();
        }
        if (this.f33657OooOO0o == null) {
            this.f33657OooOO0o = VelocityTracker.obtain();
        }
        this.f33657OooOO0o.addMovement(motionEvent);
        int i2 = 0;
        OooO0OO oooO0OO = this.f33664OooOOoo;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewOooOO0 = OooOO0((int) x, (int) y);
            OooOOo0(x, y, pointerId);
            OooOo0o(pointerId, viewOooOO0);
            if ((this.f33654OooO0oo[pointerId] & this.f33663OooOOo0) != 0) {
                oooO0OO.OooO0o();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f33647OooO00o == 1) {
                OooOOOO();
            }
            OooO0O0();
            return;
        }
        if (actionMasked == 2) {
            if (this.f33647OooO00o != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (OooOO0o(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x2 - this.f33650OooO0Oo[pointerId2];
                        float f2 = y2 - this.f33652OooO0o0[pointerId2];
                        OooOOOo(f, f2, pointerId2);
                        if (this.f33647OooO00o != 1) {
                            View viewOooOO1 = OooOO0((int) x2, (int) y2);
                            if (OooO0o0(viewOooOO1, f, f2) && OooOo0o(pointerId2, viewOooOO1)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                OooOOo(motionEvent);
                return;
            }
            if (OooOO0o(this.f33649OooO0OO)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f33649OooO0OO);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f33651OooO0o;
                int i3 = this.f33649OooO0OO;
                int i4 = (int) (x3 - fArr[i3]);
                int i5 = (int) (y3 - this.f33653OooO0oO[i3]);
                int left = this.f33666OooOo00.getLeft() + i4;
                int top = this.f33666OooOo00.getTop() + i5;
                int left2 = this.f33666OooOo00.getLeft();
                int top2 = this.f33666OooOo00.getTop();
                if (i4 != 0) {
                    left = oooO0OO.OooO00o(this.f33666OooOo00, left);
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    this.f33666OooOo00.offsetLeftAndRight(left - left2);
                }
                if (i5 != 0) {
                    top = oooO0OO.OooO0O0(this.f33666OooOo00, top);
                    WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                    this.f33666OooOo00.offsetTopAndBottom(top - top2);
                }
                if (i4 != 0 || i5 != 0) {
                    oooO0OO.OooO(this.f33666OooOo00, left, top);
                }
                OooOOo(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f33647OooO00o == 1) {
                this.f33665OooOo0 = true;
                oooO0OO.OooOO0(this.f33666OooOo00, 0.0f, 0.0f);
                this.f33665OooOo0 = false;
                if (this.f33647OooO00o == 1) {
                    OooOOoo(0);
                }
            }
            OooO0O0();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            OooOOo0(x4, y4, pointerId3);
            if (this.f33647OooO00o == 0) {
                OooOo0o(pointerId3, OooOO0((int) x4, (int) y4));
                if ((this.f33654OooO0oo[pointerId3] & this.f33663OooOOo0) != 0) {
                    oooO0OO.OooO0o();
                    return;
                }
                return;
            }
            if (OooOOO0(this.f33666OooOo00, (int) x4, (int) y4)) {
                OooOo0o(pointerId3, this.f33666OooOo00);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f33647OooO00o == 1 && pointerId4 == this.f33649OooO0OO) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f33649OooO0OO) {
                    View viewOooOO2 = OooOO0((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f33666OooOo00;
                    if (viewOooOO2 == view && OooOo0o(pointerId5, view)) {
                        i = this.f33649OooO0OO;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                OooOOOO();
            }
        }
        OooO0o(pointerId4);
    }

    public final void OooOOOO() {
        VelocityTracker velocityTracker = this.f33657OooOO0o;
        float f = this.f33659OooOOO0;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f33657OooOO0o.getXVelocity(this.f33649OooO0OO);
        float f2 = this.f33658OooOOO;
        float fAbs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f33657OooOO0o.getYVelocity(this.f33649OooO0OO);
        float f4 = this.f33658OooOOO;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f4) {
            if (fAbs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f33665OooOo0 = true;
        this.f33664OooOOoo.OooOO0(this.f33666OooOo00, xVelocity, f3);
        this.f33665OooOo0 = false;
        if (this.f33647OooO00o == 1) {
            OooOOoo(0);
        }
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
    /* JADX WARN: Type inference failed for: r3v3, types: [o0000Oo0.OooO0o$OooO0OO] */
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
    public final void OooOOOo(float f, float f2, int i) {
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
        int[] iArr = this.f33646OooO;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f33664OooOOoo.OooO0o0(r2, i);
    }

    public final void OooOOo(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (OooOO0o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f33651OooO0o[pointerId] = x;
                this.f33653OooO0oO[pointerId] = y;
            }
        }
    }

    public final void OooOOo0(float f, float f2, int i) {
        float[] fArr = this.f33650OooO0Oo;
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
                float[] fArr6 = this.f33652OooO0o0;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f33651OooO0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f33653OooO0oO;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f33654OooO0oo;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f33646OooO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f33655OooOO0;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f33650OooO0Oo = fArr2;
            this.f33652OooO0o0 = fArr3;
            this.f33651OooO0o = fArr4;
            this.f33653OooO0oO = fArr5;
            this.f33654OooO0oo = iArr;
            this.f33646OooO = iArr2;
            this.f33655OooOO0 = iArr3;
        }
        float[] fArr9 = this.f33650OooO0Oo;
        this.f33651OooO0o[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f33652OooO0o0;
        this.f33653OooO0oO[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f33654OooO0oo;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f33667OooOo0O;
        int i5 = i3 < viewGroup.getLeft() + this.f33660OooOOOO ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f33660OooOOOO) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f33660OooOOOO) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f33660OooOOOO) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f33656OooOO0O |= 1 << i;
    }

    public final void OooOOoo(int i) {
        this.f33667OooOo0O.removeCallbacks(this.f33668OooOo0o);
        if (this.f33647OooO00o != i) {
            this.f33647OooO00o = i;
            this.f33664OooOOoo.OooO0oo(i);
            if (this.f33647OooO00o == 0) {
                this.f33666OooOo00 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    public final boolean OooOo0(@NonNull MotionEvent motionEvent) {
        View viewOooOO0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO0O0();
        }
        if (this.f33657OooOO0o == null) {
            this.f33657OooOO0o = VelocityTracker.obtain();
        }
        this.f33657OooOO0o.addMovement(motionEvent);
        OooO0OO oooO0OO = this.f33664OooOOoo;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            OooOOo0(x, y, pointerId);
            View viewOooOO1 = OooOO0((int) x, (int) y);
            if (viewOooOO1 == this.f33666OooOo00 && this.f33647OooO00o == 2) {
                OooOo0o(pointerId, viewOooOO1);
            }
            if ((this.f33654OooO0oo[pointerId] & this.f33663OooOOo0) != 0) {
                oooO0OO.OooO0o();
            }
        } else if (actionMasked == 1) {
            OooO0O0();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                OooO0O0();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                OooOOo0(x2, y2, pointerId2);
                int i = this.f33647OooO00o;
                if (i == 0) {
                    if ((this.f33654OooO0oo[pointerId2] & this.f33663OooOOo0) != 0) {
                        oooO0OO.OooO0o();
                    }
                } else if (i == 2 && (viewOooOO0 = OooOO0((int) x2, (int) y2)) == this.f33666OooOo00) {
                    OooOo0o(pointerId2, viewOooOO0);
                }
            } else if (actionMasked == 6) {
                OooO0o(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f33650OooO0Oo != null && this.f33652OooO0o0 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId3 = motionEvent.getPointerId(i2);
                if (OooOO0o(pointerId3)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f33650OooO0Oo[pointerId3];
                    float f2 = y3 - this.f33652OooO0o0[pointerId3];
                    View viewOooOO2 = OooOO0((int) x3, (int) y3);
                    boolean z = viewOooOO2 != null && OooO0o0(viewOooOO2, f, f2);
                    if (!z) {
                        OooOOOo(f, f2, pointerId3);
                        if (this.f33647OooO00o != 1) {
                            break;
                        }
                    } else {
                        int left = viewOooOO2.getLeft();
                        int iOooO00o = oooO0OO.OooO00o(viewOooOO2, ((int) f) + left);
                        int top = viewOooOO2.getTop();
                        int iOooO0O0 = oooO0OO.OooO0O0(viewOooOO2, ((int) f2) + top);
                        int iOooO0OO = oooO0OO.OooO0OO(viewOooOO2);
                        int iOooO0Oo = oooO0OO.OooO0Oo();
                        if ((iOooO0OO == 0 || (iOooO0OO > 0 && iOooO00o == left)) && (iOooO0Oo == 0 || (iOooO0Oo > 0 && iOooO0O0 == top))) {
                            break;
                        }
                        OooOOOo(f, f2, pointerId3);
                        if (this.f33647OooO00o != 1 || (z && OooOo0o(pointerId3, viewOooOO2))) {
                            break;
                        }
                    }
                }
            }
            OooOOo(motionEvent);
        }
        return this.f33647OooO00o == 1;
    }

    public final boolean OooOo00(int i, int i2) {
        if (this.f33665OooOo0) {
            return OooOO0O(i, i2, (int) this.f33657OooOO0o.getXVelocity(this.f33649OooO0OO), (int) this.f33657OooOO0o.getYVelocity(this.f33649OooO0OO));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean OooOo0O(@NonNull View view, int i, int i2) {
        this.f33666OooOo00 = view;
        this.f33649OooO0OO = -1;
        boolean zOooOO0O = OooOO0O(i, i2, 0, 0);
        if (!zOooOO0O && this.f33647OooO00o == 0 && this.f33666OooOo00 != null) {
            this.f33666OooOo00 = null;
        }
        return zOooOO0O;
    }

    public final boolean OooOo0o(int i, View view) {
        if (view == this.f33666OooOo00 && this.f33649OooO0OO == i) {
            return true;
        }
        if (view == null || !this.f33664OooOOoo.OooOO0O(i, view)) {
            return false;
        }
        this.f33649OooO0OO = i;
        OooO0OO(i, view);
        return true;
    }
}
