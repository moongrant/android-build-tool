package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class OverlayImageView extends ImageView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f20173Oooo0o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable f20174OooO00o;

        public OooO00o(Drawable drawable) {
            this.f20174OooO00o = drawable;
        }
    }

    public OverlayImageView(Context context) {
        super(context);
        this.f20173Oooo0o = new OooO00o(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO00o oooO00o = this.f20173Oooo0o;
        int[] drawableState = getDrawableState();
        Drawable drawable = oooO00o.f20174OooO00o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        oooO00o.f20174OooO00o.setState(drawableState);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f20173Oooo0o.f20174OooO00o) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f20173Oooo0o.f20174OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO00o oooO00o = this.f20173Oooo0o;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = oooO00o.f20174OooO00o;
        if (drawable != null) {
            drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f20173Oooo0o.f20174OooO00o;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setOverlayDrawable(Drawable drawable) {
        OooO00o oooO00o = this.f20173Oooo0o;
        Drawable drawable2 = oooO00o.f20174OooO00o;
        if (drawable != drawable2) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(oooO00o.f20174OooO00o);
            }
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.f20173Oooo0o = new OooO00o(drawable);
            int[] drawableState = getDrawableState();
            if (drawable != null && drawable.isStateful()) {
                drawable.setState(drawableState);
            }
            requestLayout();
        }
    }

    public OverlayImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20173Oooo0o = new OooO00o(null);
    }
}
