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
import p119o00O0OoO.Oooo0;
import p119o00O0OoO.Oooo000;
import p119o00O0OoO.o000oOoO;
import p119o00O0OoO.o00O0O;
import p119o00O0OoO.o00Oo0;
import p119o00O0OoO.o00Ooo;
import p119o00O0OoO.o00oO0o;
import p119o00O0OoO.o0OoOo0;
import p119o00O0OoO.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00oO0o f9793OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView.ScaleType f9794OooO0o0;

    public PhotoView(Context context) {
        this(context, null);
    }

    public o00oO0o getAttacher() {
        return this.f9793OooO0Oo;
    }

    public RectF getDisplayRect() {
        return this.f9793OooO0Oo.OooO0OO();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f9793OooO0Oo.f36610OooOOOO;
    }

    public float getMaximumScale() {
        return this.f9793OooO0Oo.f36604OooO0oo;
    }

    public float getMediumScale() {
        return this.f9793OooO0Oo.f36603OooO0oO;
    }

    public float getMinimumScale() {
        return this.f9793OooO0Oo.f36601OooO0o;
    }

    public float getScale() {
        return this.f9793OooO0Oo.OooO0o();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f9793OooO0Oo.f36615OooOo;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f9793OooO0Oo.f36599OooO = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f9793OooO0Oo.OooO0oo();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0oo();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0oo();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0oo();
        }
    }

    public void setMaximumScale(float f) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        oo000o.OooO00o(o00oo0o2.f36601OooO0o, o00oo0o2.f36603OooO0oO, f);
        o00oo0o2.f36604OooO0oo = f;
    }

    public void setMediumScale(float f) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        oo000o.OooO00o(o00oo0o2.f36601OooO0o, f, o00oo0o2.f36604OooO0oo);
        o00oo0o2.f36603OooO0oO = f;
    }

    public void setMinimumScale(float f) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        oo000o.OooO00o(f, o00oo0o2.f36603OooO0oO, o00oo0o2.f36604OooO0oo);
        o00oo0o2.f36601OooO0o = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9793OooO0Oo.f36614OooOOoo = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f9793OooO0Oo.f36607OooOO0o.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9793OooO0Oo.f36617OooOo00 = onLongClickListener;
    }

    public void setOnMatrixChangeListener(Oooo000 oooo000) {
        this.f9793OooO0Oo.getClass();
    }

    public void setOnOutsidePhotoTapListener(Oooo0 oooo0) {
        this.f9793OooO0Oo.getClass();
    }

    public void setOnPhotoTapListener(o000oOoO o000oooo2) {
        this.f9793OooO0Oo.getClass();
    }

    public void setOnScaleChangeListener(o0OoOo0 o0oooo0) {
        this.f9793OooO0Oo.getClass();
    }

    public void setOnSingleFlingListener(o00O0O o00o0o2) {
        this.f9793OooO0Oo.getClass();
    }

    public void setOnViewDragListener(o00Oo0 o00oo1) {
        this.f9793OooO0Oo.getClass();
    }

    public void setOnViewTapListener(o00Ooo o00ooo2) {
        this.f9793OooO0Oo.getClass();
    }

    public void setRotationBy(float f) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        o00oo0o2.f36611OooOOOo.postRotate(f % 360.0f);
        o00oo0o2.OooO00o();
    }

    public void setRotationTo(float f) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        o00oo0o2.f36611OooOOOo.setRotate(f % 360.0f);
        o00oo0o2.OooO00o();
    }

    public void setScale(float f) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        ImageView imageView = o00oo0o2.f36606OooOO0O;
        o00oo0o2.OooO0oO(f, imageView.getRight() / 2, imageView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        if (o00oo0o2 == null) {
            this.f9794OooO0o0 = scaleType;
            return;
        }
        o00oo0o2.getClass();
        if (scaleType == null) {
            z = false;
        } else {
            if (oo000o.OooO00o.f36635OooO00o[scaleType.ordinal()] == 1) {
                throw new IllegalStateException("Matrix scale type is not supported");
            }
            z = true;
        }
        if (!z || scaleType == o00oo0o2.f36615OooOo) {
            return;
        }
        o00oo0o2.f36615OooOo = scaleType;
        o00oo0o2.OooO0oo();
    }

    public void setZoomTransitionDuration(int i) {
        this.f9793OooO0Oo.f36602OooO0o0 = i;
    }

    public void setZoomable(boolean z) {
        o00oO0o o00oo0o2 = this.f9793OooO0Oo;
        o00oo0o2.f36619OooOo0o = z;
        o00oo0o2.OooO0oo();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9793OooO0Oo = new o00oO0o(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f9794OooO0o0;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f9794OooO0o0 = null;
        }
    }
}
