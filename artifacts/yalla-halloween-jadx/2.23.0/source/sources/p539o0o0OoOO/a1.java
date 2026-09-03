package p539o0o0OoOO;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.view.FixedHLinearLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FixedHLinearLayout f55427OooO0Oo;

    public a1(FixedHLinearLayout fixedHLinearLayout) {
        this.f55427OooO0Oo = fixedHLinearLayout;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f55427OooO0Oo.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f55427OooO0Oo.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        float fAbs = Math.abs(rawX);
        float fAbs2 = Math.abs(rawY);
        FixedHLinearLayout fixedHLinearLayout = this.f55427OooO0Oo;
        if (fAbs > fAbs2) {
            fixedHLinearLayout.getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            fixedHLinearLayout.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
