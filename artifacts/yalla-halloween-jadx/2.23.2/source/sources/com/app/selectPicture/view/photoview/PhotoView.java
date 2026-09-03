package com.app.selectPicture.view.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p164o00OoOoO.o000O;
import p164o00OoOoO.o000O0;
import p164o00OoOoO.o000O00;
import p164o00OoOoO.o000O00O;
import p164o00OoOoO.o000O0O0;
import p164o00OoOoO.o000O0Oo;
import p164o00OoOoO.o000O0o;
import p164o00OoOoO.o000OO0O;
import p164o00OoOoO.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000O f12884OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView.ScaleType f12885OooO0o0;

    public PhotoView(Context context) {
        this(context, null);
    }

    public o000O getAttacher() {
        return this.f12884OooO0Oo;
    }

    public RectF getDisplayRect() {
        return this.f12884OooO0Oo.OooO0OO();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f12884OooO0Oo.f38130OooOOOO;
    }

    public float getMaximumScale() {
        return this.f12884OooO0Oo.f38124OooO0oo;
    }

    public float getMediumScale() {
        return this.f12884OooO0Oo.f38123OooO0oO;
    }

    public float getMinimumScale() {
        return this.f12884OooO0Oo.f38121OooO0o;
    }

    public float getScale() {
        return this.f12884OooO0Oo.OooO0o();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f12884OooO0Oo.f38135OooOo;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f12884OooO0Oo.f38119OooO = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f12884OooO0Oo.OooO0oo();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        o000O o000o = this.f12884OooO0Oo;
        if (o000o != null) {
            o000o.OooO0oo();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        o000O o000o = this.f12884OooO0Oo;
        if (o000o != null) {
            o000o.OooO0oo();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o000O o000o = this.f12884OooO0Oo;
        if (o000o != null) {
            o000o.OooO0oo();
        }
    }

    public void setMaximumScale(float f) {
        o000O o000o = this.f12884OooO0Oo;
        o000O0O0.OooO00o(o000o.f38121OooO0o, o000o.f38123OooO0oO, f);
        o000o.f38124OooO0oo = f;
    }

    public void setMediumScale(float f) {
        o000O o000o = this.f12884OooO0Oo;
        o000O0O0.OooO00o(o000o.f38121OooO0o, f, o000o.f38124OooO0oo);
        o000o.f38123OooO0oO = f;
    }

    public void setMinimumScale(float f) {
        o000O o000o = this.f12884OooO0Oo;
        o000O0O0.OooO00o(f, o000o.f38123OooO0oO, o000o.f38124OooO0oo);
        o000o.f38121OooO0o = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12884OooO0Oo.f38134OooOOoo = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f12884OooO0Oo.f38127OooOO0o.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12884OooO0Oo.f38137OooOo00 = onLongClickListener;
    }

    public void setOnMatrixChangeListener(o000O0o o000o0o2) {
        this.f12884OooO0Oo.getClass();
    }

    public void setOnOutsidePhotoTapListener(o000Oo0 o000oo1) {
        this.f12884OooO0Oo.getClass();
    }

    public void setOnPhotoTapListener(o000O00 o000o01) {
        this.f12884OooO0Oo.getClass();
    }

    public void setOnScaleChangeListener(o000O00O o000o00o2) {
        this.f12884OooO0Oo.getClass();
    }

    public void setOnSingleFlingListener(o000O0 o000o0) {
        this.f12884OooO0Oo.getClass();
    }

    public void setOnViewDragListener(o000O0Oo o000o0oo2) {
        this.f12884OooO0Oo.getClass();
    }

    public void setOnViewTapListener(o000OO0O o000oo0o2) {
        this.f12884OooO0Oo.getClass();
    }

    public void setRotationBy(float f) {
        o000O o000o = this.f12884OooO0Oo;
        o000o.f38131OooOOOo.postRotate(f % 360.0f);
        o000o.OooO00o();
    }

    public void setRotationTo(float f) {
        o000O o000o = this.f12884OooO0Oo;
        o000o.f38131OooOOOo.setRotate(f % 360.0f);
        o000o.OooO00o();
    }

    public void setScale(float f) {
        o000O o000o = this.f12884OooO0Oo;
        ImageView imageView = o000o.f38126OooOO0O;
        o000o.OooO0oO(f, imageView.getRight() / 2, imageView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        o000O o000o = this.f12884OooO0Oo;
        if (o000o == null) {
            this.f12885OooO0o0 = scaleType;
            return;
        }
        o000o.getClass();
        if (scaleType == null) {
            z = false;
        } else {
            if (o000O0O0.OooO00o.f38155OooO00o[scaleType.ordinal()] == 1) {
                throw new IllegalStateException("Matrix scale type is not supported");
            }
            z = true;
        }
        if (!z || scaleType == o000o.f38135OooOo) {
            return;
        }
        o000o.f38135OooOo = scaleType;
        o000o.OooO0oo();
    }

    public void setZoomTransitionDuration(int i) {
        this.f12884OooO0Oo.f38122OooO0o0 = i;
    }

    public void setZoomable(boolean z) {
        o000O o000o = this.f12884OooO0Oo;
        o000o.f38139OooOo0o = z;
        o000o.OooO0oo();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12884OooO0Oo = new o000O(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f12885OooO0o0;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f12885OooO0o0 = null;
        }
    }
}
