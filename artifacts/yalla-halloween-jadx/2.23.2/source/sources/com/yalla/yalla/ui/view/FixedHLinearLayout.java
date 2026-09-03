package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p587o0oOooOO.v;

/* JADX INFO: loaded from: classes4.dex */
public class FixedHLinearLayout extends LinearLayout {
    public FixedHLinearLayout(Context context) {
        super(context);
        new GestureDetector(getContext(), new v(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public FixedHLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        new GestureDetector(getContext(), new v(this));
    }

    public FixedHLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new GestureDetector(getContext(), new v(this));
    }
}
