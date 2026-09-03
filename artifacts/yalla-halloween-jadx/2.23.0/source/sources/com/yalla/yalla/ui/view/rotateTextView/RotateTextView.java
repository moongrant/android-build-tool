package com.yalla.yalla.ui.view.rotateTextView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public class RotateTextView extends TextView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f31338OooO0Oo;

    public RotateTextView(Context context) {
        super(context);
        this.f31338OooO0Oo = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        canvas.rotate(this.f31338OooO0Oo, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setDegrees(int i) {
        this.f31338OooO0Oo = i;
    }

    public RotateTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31338OooO0Oo = 0;
    }
}
