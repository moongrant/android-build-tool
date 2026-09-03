package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p439o0OoOOo0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public double f20145Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20146Oooo0oO;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int i4;
        int measuredWidth;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f20146Oooo0oO == 0) {
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                measuredWidth = View.MeasureSpec.getSize(i);
            } else {
                super.onMeasure(i, i2);
                measuredWidth = getMeasuredWidth();
            }
            i4 = measuredWidth - paddingRight;
            i3 = (int) (((double) i4) / this.f20145Oooo0o);
        } else {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                measuredHeight = View.MeasureSpec.getSize(i2);
            } else {
                super.onMeasure(i, i2);
                measuredHeight = getMeasuredHeight();
            }
            i3 = measuredHeight - paddingTop;
            i4 = (int) (((double) i3) * this.f20145Oooo0o);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4 + paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(i3 + paddingTop, 1073741824));
    }

    public void setAspectRatio(double d) {
        this.f20145Oooo0o = d;
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i, o00O000.AspectRatioFrameLayout);
        try {
            this.f20145Oooo0o = typedArrayObtainStyledAttributes.getFloat(o00O000.AspectRatioFrameLayout_tw__frame_layout_aspect_ratio, 1.0f);
            this.f20146Oooo0oO = typedArrayObtainStyledAttributes.getInt(o00O000.AspectRatioFrameLayout_tw__frame_layout_dimension_to_adjust, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
