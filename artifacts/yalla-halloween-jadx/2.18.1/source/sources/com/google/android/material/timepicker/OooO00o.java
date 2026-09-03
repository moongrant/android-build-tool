package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f18071OooO00o;

    public OooO00o(TimePickerView timePickerView) {
        this.f18071OooO00o = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f18071OooO00o;
        int i = TimePickerView.f18081Oooo0oo;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
