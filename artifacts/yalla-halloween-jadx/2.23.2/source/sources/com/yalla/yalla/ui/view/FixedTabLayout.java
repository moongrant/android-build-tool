package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public class FixedTabLayout extends TabLayout {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public GestureDetector f29863Ooooo00;

    public class OooO00o implements GestureDetector.OnGestureListener {
        public OooO00o() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            FixedTabLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            FixedTabLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
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
            FixedTabLayout fixedTabLayout = FixedTabLayout.this;
            if (fAbs > fAbs2) {
                fixedTabLayout.getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                fixedTabLayout.getParent().requestDisallowInterceptTouchEvent(true);
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

    public FixedTabLayout(Context context) {
        super(context);
        OooOOO();
    }

    public final void OooOOO() {
        this.f29863Ooooo00 = new GestureDetector(getContext(), new OooO00o());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f29863Ooooo00.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public FixedTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO();
    }

    public FixedTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooOOO();
    }
}
