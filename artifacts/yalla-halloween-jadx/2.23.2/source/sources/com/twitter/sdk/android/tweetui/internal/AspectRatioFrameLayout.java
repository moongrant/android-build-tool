package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.twitter.sdk.android.tweetui.o000000O;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes2.dex */
public class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f21867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f21868OooO0o0;

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
        if (this.f21868OooO0o0 == 0) {
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                measuredWidth = View.MeasureSpec.getSize(i);
            } else {
                super.onMeasure(i, i2);
                measuredWidth = getMeasuredWidth();
            }
            i4 = measuredWidth - paddingRight;
            i3 = (int) (((double) i4) / this.f21867OooO0Oo);
        } else {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                measuredHeight = View.MeasureSpec.getSize(i2);
            } else {
                super.onMeasure(i, i2);
                measuredHeight = getMeasuredHeight();
            }
            i3 = measuredHeight - paddingTop;
            i4 = (int) (((double) i3) * this.f21867OooO0Oo);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4 + paddingRight, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(i3 + paddingTop, Pow2.MAX_POW2));
    }

    public void setAspectRatio(double d) {
        this.f21867OooO0Oo = d;
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i, o000000O.AspectRatioFrameLayout);
        try {
            this.f21867OooO0Oo = typedArrayObtainStyledAttributes.getFloat(o000000O.AspectRatioFrameLayout_tw__frame_layout_aspect_ratio, 1.0f);
            this.f21868OooO0o0 = typedArrayObtainStyledAttributes.getInt(o000000O.AspectRatioFrameLayout_tw__frame_layout_dimension_to_adjust, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
