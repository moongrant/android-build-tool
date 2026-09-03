package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f17717OooO0Oo;

    public OooO(GestureDetector gestureDetector) {
        this.f17717OooO0Oo = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f17717OooO0Oo.onTouchEvent(motionEvent);
        }
        return false;
    }
}
