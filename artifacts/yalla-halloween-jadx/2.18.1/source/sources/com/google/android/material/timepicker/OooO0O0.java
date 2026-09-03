package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f18072Oooo0o;

    public OooO0O0(GestureDetector gestureDetector) {
        this.f18072Oooo0o = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f18072Oooo0o.onTouchEvent(motionEvent);
        }
        return false;
    }
}
