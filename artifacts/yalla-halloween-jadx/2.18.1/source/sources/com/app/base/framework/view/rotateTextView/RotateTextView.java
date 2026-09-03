package com.app.base.framework.view.rotateTextView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class RotateTextView extends TextView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f11746Oooo0o;

    public RotateTextView(Context context) {
        super(context);
        this.f11746Oooo0o = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        canvas.rotate(this.f11746Oooo0o, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setDegrees(int i) {
        this.f11746Oooo0o = i;
    }

    public RotateTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11746Oooo0o = 0;
    }
}
