package com.didichuxing.doraemonkit.kit.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class TouchProxy {

    public interface OnTouchEventListener {
        void onDown(int i, int i2);

        void onMove(int i, int i2, int i3, int i4);

        void onUp(int i, int i2);
    }

    public TouchProxy(OnTouchEventListener onTouchEventListener) {
    }

    public boolean onTouchEvent(View view, MotionEvent motionEvent) {
        return true;
    }

    public void setEventListener(OnTouchEventListener onTouchEventListener) {
    }
}
