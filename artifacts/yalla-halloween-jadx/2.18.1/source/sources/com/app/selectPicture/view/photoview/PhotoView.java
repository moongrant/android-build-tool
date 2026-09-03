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
import java.util.Objects;
import p208o00o0oO0.o000;
import p208o00o0oO0.o0000O;
import p208o00o0oO0.o0000OO0;
import p208o00o0oO0.o000O00;
import p208o00o0oO0.o000O000;
import p208o00o0oO0.o000O00O;
import p208o00o0oO0.o000O0o;
import p208o00o0oO0.o000OO;
import p208o00o0oO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o000O00O f12335Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageView.ScaleType f12336OoooO00;

    public PhotoView(Context context) {
        this(context, null);
    }

    public o000O00O getAttacher() {
        return this.f12335Oooo;
    }

    public RectF getDisplayRect() {
        return this.f12335Oooo.OooO0OO();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f12335Oooo.f33316OoooOOo;
    }

    public float getMaximumScale() {
        return this.f12335Oooo.f33312OoooO00;
    }

    public float getMediumScale() {
        return this.f12335Oooo.f33306Oooo;
    }

    public float getMinimumScale() {
        return this.f12335Oooo.f33309Oooo0oo;
    }

    public float getScale() {
        return this.f12335Oooo.OooO0oo();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f12335Oooo.f33331o00Oo0;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f12335Oooo.f33311OoooO0 = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f12335Oooo.OooOO0o();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        o000O00O o000o00o2 = this.f12335Oooo;
        if (o000o00o2 != null) {
            o000o00o2.OooOO0o();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        o000O00O o000o00o2 = this.f12335Oooo;
        if (o000o00o2 != null) {
            o000o00o2.OooOO0o();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o000O00O o000o00o2 = this.f12335Oooo;
        if (o000o00o2 != null) {
            o000o00o2.OooOO0o();
        }
    }

    public void setMaximumScale(float f) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000O00.OooO00o(o000o00o2.f33309Oooo0oo, o000o00o2.f33306Oooo, f);
        o000o00o2.f33312OoooO00 = f;
    }

    public void setMediumScale(float f) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000O00.OooO00o(o000o00o2.f33309Oooo0oo, f, o000o00o2.f33312OoooO00);
        o000o00o2.f33306Oooo = f;
    }

    public void setMinimumScale(float f) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000O00.OooO00o(f, o000o00o2.f33306Oooo, o000o00o2.f33312OoooO00);
        o000o00o2.f33309Oooo0oo = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12335Oooo.f33324OooooOo = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f12335Oooo.f33314OoooOO0.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12335Oooo.f33326Oooooo0 = onLongClickListener;
    }

    public void setOnMatrixChangeListener(o000OO o000oo2) {
        this.f12335Oooo.f33320Ooooo00 = o000oo2;
    }

    public void setOnOutsidePhotoTapListener(o0000O o0000o2) {
        this.f12335Oooo.f33322OooooO0 = o0000o2;
    }

    public void setOnPhotoTapListener(o0000OO0 o0000oo1) {
        this.f12335Oooo.f33321Ooooo0o = o0000oo1;
    }

    public void setOnScaleChangeListener(o000 o000Var) {
        this.f12335Oooo.f33325Oooooo = o000Var;
    }

    public void setOnSingleFlingListener(o000O000 o000o001) {
        this.f12335Oooo.f33327OoooooO = o000o001;
    }

    public void setOnViewDragListener(o000O0o o000o0o2) {
        this.f12335Oooo.f33328Ooooooo = o000o0o2;
    }

    public void setOnViewTapListener(o000Oo0 o000oo1) {
        this.f12335Oooo.f33323OooooOO = o000oo1;
    }

    public void setRotationBy(float f) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000o00o2.f33317OoooOo0.postRotate(f % 360.0f);
        o000o00o2.OooO00o();
    }

    public void setRotationTo(float f) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000o00o2.f33317OoooOo0.setRotate(f % 360.0f);
        o000o00o2.OooO00o();
    }

    public void setScale(float f) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000o00o2.OooOO0O(f, o000o00o2.f33310OoooO.getRight() / 2, o000o00o2.f33310OoooO.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        o000O00O o000o00o2 = this.f12335Oooo;
        if (o000o00o2 == null) {
            this.f12336OoooO00 = scaleType;
            return;
        }
        Objects.requireNonNull(o000o00o2);
        boolean z = true;
        if (scaleType == null) {
            z = false;
        } else if (o000O00.OooO00o.f33305OooO00o[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (!z || scaleType == o000o00o2.f33331o00Oo0) {
            return;
        }
        o000o00o2.f33331o00Oo0 = scaleType;
        o000o00o2.OooOO0o();
    }

    public void setZoomTransitionDuration(int i) {
        this.f12335Oooo.f33308Oooo0oO = i;
    }

    public void setZoomable(boolean z) {
        o000O00O o000o00o2 = this.f12335Oooo;
        o000o00o2.f33330o00O0O = z;
        o000o00o2.OooOO0o();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12335Oooo = new o000O00O(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f12336OoooO00;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f12336OoooO00 = null;
        }
    }
}
