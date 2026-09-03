package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public class FixedTabLayout extends TabLayout {

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public GestureDetector f11986o000000o;

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
            if (Math.abs(motionEvent2.getRawX() - motionEvent.getRawX()) > Math.abs(motionEvent2.getRawY() - motionEvent.getRawY())) {
                FixedTabLayout.this.getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                FixedTabLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
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
        OooOOOo();
    }

    public final void OooOOOo() {
        this.f11986o000000o = new GestureDetector(getContext(), new OooO00o());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f11986o000000o.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public FixedTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOOo();
    }

    public FixedTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooOOOo();
    }
}
