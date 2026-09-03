package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class FixedScrollView extends ScrollView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public GestureDetector f29861OooO0Oo;

    public class OooO00o implements GestureDetector.OnGestureListener {
        public OooO00o() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            FixedScrollView.this.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            FixedScrollView.this.getParent().requestDisallowInterceptTouchEvent(true);
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
            FixedScrollView fixedScrollView = FixedScrollView.this;
            if (fAbs > fAbs2) {
                fixedScrollView.getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                fixedScrollView.getParent().requestDisallowInterceptTouchEvent(true);
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

    public FixedScrollView(Context context) {
        super(context);
        OooO00o();
    }

    public final void OooO00o() {
        this.f29861OooO0Oo = new GestureDetector(getContext(), new OooO00o());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f29861OooO0Oo.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public FixedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o();
    }

    public FixedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o();
    }
}
