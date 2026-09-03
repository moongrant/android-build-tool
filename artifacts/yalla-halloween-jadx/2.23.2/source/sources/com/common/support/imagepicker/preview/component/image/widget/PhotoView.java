package com.common.support.imagepicker.preview.component.image.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.attacher.OnMatrixChangedListener;
import com.common.support.imagepicker.preview.attacher.OnOutsidePhotoTapListener;
import com.common.support.imagepicker.preview.attacher.OnPhotoTapListener;
import com.common.support.imagepicker.preview.attacher.OnScaleChangedListener;
import com.common.support.imagepicker.preview.attacher.OnSingleFlingListener;
import com.common.support.imagepicker.preview.attacher.OnViewDragListener;
import com.common.support.imagepicker.preview.attacher.OnViewTapListener;
import com.common.support.imagepicker.preview.component.image.config.PreviewView;

/* JADX INFO: loaded from: classes2.dex */
public class PhotoView extends AppCompatImageView implements PreviewView {
    private PhotoViewAttacher attacher;
    private ImageView.ScaleType pendingScaleType;

    public PhotoView(Context context) {
        this(context, null);
    }

    private void init() {
        this.attacher = new PhotoViewAttacher(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.pendingScaleType;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.pendingScaleType = null;
        }
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void getDisplayMatrix(@NonNull Matrix matrix) {
        this.attacher.getDisplayMatrix(matrix);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    @NonNull
    public RectF getDisplayRect() {
        return this.attacher.getDisplayRect();
    }

    @Override // android.widget.ImageView, com.common.support.imagepicker.preview.component.image.config.PreviewView
    @NonNull
    public Matrix getImageMatrix() {
        return this.attacher.getImageMatrix();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public float getMaximumScale() {
        return this.attacher.getMaximumScale();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public float getMediumScale() {
        return this.attacher.getMediumScale();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public float getMinimumScale() {
        return this.attacher.getMinimumScale();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public float getScale() {
        return this.attacher.getScale();
    }

    @Override // android.widget.ImageView, com.common.support.imagepicker.preview.component.image.config.PreviewView
    @NonNull
    public ImageView.ScaleType getScaleType() {
        return this.attacher.getScaleType();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void getSuppMatrix(@NonNull Matrix matrix) {
        this.attacher.getSuppMatrix(matrix);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    @NonNull
    public BaseViewAttacher getViewAttacher() {
        return this.attacher;
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public boolean isZoomable() {
        return this.attacher.isZoomable();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.attacher.setAllowParentInterceptOnEdge(z);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public boolean setDisplayMatrix(@NonNull Matrix matrix) {
        return this.attacher.setDisplayMatrix(matrix);
    }

    @Override // android.widget.ImageView, com.common.support.imagepicker.preview.component.image.config.PreviewView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.attacher.update();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        PhotoViewAttacher photoViewAttacher = this.attacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        PhotoViewAttacher photoViewAttacher = this.attacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        PhotoViewAttacher photoViewAttacher = this.attacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setMaximumScale(float f) {
        this.attacher.setMaximumScale(f);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setMediumScale(float f) {
        this.attacher.setMediumScale(f);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setMinimumScale(float f) {
        this.attacher.setMinimumScale(f);
    }

    @Override // android.view.View, com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnClickListener(@NonNull View.OnClickListener onClickListener) {
        this.attacher.setOnClickListener(onClickListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.attacher.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View, com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnLongClickListener(@NonNull View.OnLongClickListener onLongClickListener) {
        this.attacher.setOnLongClickListener(onLongClickListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.attacher.setOnMatrixChangeListener(onMatrixChangedListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.attacher.setOnOutsidePhotoTapListener(onOutsidePhotoTapListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.attacher.setOnPhotoTapListener(onPhotoTapListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.attacher.setOnScaleChangeListener(onScaleChangedListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.attacher.setOnSingleFlingListener(onSingleFlingListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.attacher.setOnViewDragListener(onViewDragListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.attacher.setOnViewTapListener(onViewTapListener);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setRotationBy(float f) {
        this.attacher.setRotationBy(f);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setRotationTo(float f) {
        this.attacher.setRotationTo(f);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setScale(float f) {
        this.attacher.setScale(f);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setScaleLevels(float f, float f2, float f3) {
        this.attacher.setScaleLevels(f, f2, f3);
    }

    @Override // android.widget.ImageView, com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setScaleType(@NonNull ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.attacher;
        if (photoViewAttacher == null) {
            this.pendingScaleType = scaleType;
        } else {
            photoViewAttacher.setScaleType(scaleType);
        }
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public boolean setSuppMatrix(@NonNull Matrix matrix) {
        return this.attacher.setDisplayMatrix(matrix);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setZoomTransitionDuration(int i) {
        this.attacher.setZoomTransitionDuration(i);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setZoomable(boolean z) {
        this.attacher.setZoomable(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setScale(float f, boolean z) {
        this.attacher.setScale(f, z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @Override // com.common.support.imagepicker.preview.component.image.config.PreviewView
    public void setScale(float f, float f2, float f3, boolean z) {
        this.attacher.setScale(f, f2, f3, z);
    }
}
