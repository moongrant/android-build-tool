package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class FixedLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public GestureDetector f29857OooO0Oo;

    public class OooO00o implements GestureDetector.OnGestureListener {
        public OooO00o() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            FixedLinearLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            FixedLinearLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
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
            FixedLinearLayout fixedLinearLayout = FixedLinearLayout.this;
            if (fAbs > fAbs2) {
                fixedLinearLayout.getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                fixedLinearLayout.getParent().requestDisallowInterceptTouchEvent(true);
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

    public FixedLinearLayout(Context context) {
        super(context);
        OooO00o();
    }

    public final void OooO00o() {
        this.f29857OooO0Oo = new GestureDetector(getContext(), new OooO00o());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f29857OooO0Oo.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public FixedLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o();
    }

    public FixedLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o();
    }
}
