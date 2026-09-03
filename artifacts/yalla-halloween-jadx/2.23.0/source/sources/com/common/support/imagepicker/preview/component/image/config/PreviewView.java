package com.common.support.imagepicker.preview.component.image.config;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.attacher.OnMatrixChangedListener;
import com.common.support.imagepicker.preview.attacher.OnOutsidePhotoTapListener;
import com.common.support.imagepicker.preview.attacher.OnPhotoTapListener;
import com.common.support.imagepicker.preview.attacher.OnScaleChangedListener;
import com.common.support.imagepicker.preview.attacher.OnSingleFlingListener;
import com.common.support.imagepicker.preview.attacher.OnViewDragListener;
import com.common.support.imagepicker.preview.attacher.OnViewTapListener;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0012\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\nH\u0016J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\nH\u0016J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\nH\u0016J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u000100H&J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000105H&J\u0012\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000107H&J\u0012\u00108\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u000109H&J\u0012\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010<H&J\u0012\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010?H&J\u0012\u0010@\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010AH&J\u0012\u0010B\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010CH&J\u0010\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\nH\u0016J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\nH\u0016J\u0010\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\nH\u0016J\u0018\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0014H\u0016J(\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0014H\u0016J \u0010L\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016J\u0010\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u000fH\u0016J\u0010\u0010O\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u001aH\u0016J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u0014H\u0016¨\u0006T"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/config/PreviewView;", "", "getDisplayMatrix", "", "matrix", "Landroid/graphics/Matrix;", "getDisplayRect", "Landroid/graphics/RectF;", "getImageMatrix", "getMaximumScale", "", "getMediumScale", "getMinimumScale", "getScale", "getScaleType", "Landroid/widget/ImageView$ScaleType;", "getSuppMatrix", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "isZoomable", "", "setAllowParentInterceptOnEdge", "allow", "setDisplayMatrix", "setFrame", "l", "", "t", "r", "b", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageResource", "resId", "setImageURI", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "setMaximumScale", "maximumScale", "setMediumScale", "mediumScale", "setMinimumScale", "minimumScale", "setOnClickListener", "Landroid/view/View$OnClickListener;", "setOnDoubleTapListener", "onDoubleTapListener", "Landroid/view/GestureDetector$OnDoubleTapListener;", "setOnLongClickListener", "Landroid/view/View$OnLongClickListener;", "setOnMatrixChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/imagepicker/preview/attacher/OnMatrixChangedListener;", "setOnOutsidePhotoTapListener", "Lcom/common/support/imagepicker/preview/attacher/OnOutsidePhotoTapListener;", "setOnPhotoTapListener", "Lcom/common/support/imagepicker/preview/attacher/OnPhotoTapListener;", "setOnScaleChangeListener", "onScaleChangedListener", "Lcom/common/support/imagepicker/preview/attacher/OnScaleChangedListener;", "setOnSingleFlingListener", "onSingleFlingListener", "Lcom/common/support/imagepicker/preview/attacher/OnSingleFlingListener;", "setOnViewDragListener", "Lcom/common/support/imagepicker/preview/attacher/OnViewDragListener;", "setOnViewTapListener", "Lcom/common/support/imagepicker/preview/attacher/OnViewTapListener;", "setRotationBy", "rotationDegree", "setRotationTo", "setScale", "scale", "animate", "focalX", "focalY", "setScaleLevels", "setScaleType", "scaleType", "setSuppMatrix", "setZoomTransitionDuration", "milliseconds", "setZoomable", "zoomable", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface PreviewView {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void getDisplayMatrix(@NotNull PreviewView previewView, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
        }

        @NotNull
        public static RectF getDisplayRect(@NotNull PreviewView previewView) {
            throw new UnsupportedOperationException("getImageMatrix() has not been overridden");
        }

        @NotNull
        public static Matrix getImageMatrix(@NotNull PreviewView previewView) {
            throw new UnsupportedOperationException("getImageMatrix() has not been overridden");
        }

        public static float getMaximumScale(@NotNull PreviewView previewView) {
            return 0.0f;
        }

        public static float getMediumScale(@NotNull PreviewView previewView) {
            return 0.0f;
        }

        public static float getMinimumScale(@NotNull PreviewView previewView) {
            return 0.0f;
        }

        public static float getScale(@NotNull PreviewView previewView) {
            return 0.0f;
        }

        @NotNull
        public static ImageView.ScaleType getScaleType(@NotNull PreviewView previewView) {
            throw new UnsupportedOperationException("getScaleType() has not been overridden");
        }

        public static void getSuppMatrix(@NotNull PreviewView previewView, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
        }

        public static boolean isZoomable(@NotNull PreviewView previewView) {
            return false;
        }

        public static void setAllowParentInterceptOnEdge(@NotNull PreviewView previewView, boolean z) {
        }

        public static boolean setDisplayMatrix(@NotNull PreviewView previewView, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            return false;
        }

        public static boolean setFrame(@NotNull PreviewView previewView, int i, int i2, int i3, int i4) {
            return false;
        }

        public static void setImageDrawable(@NotNull PreviewView previewView, @Nullable Drawable drawable) {
        }

        public static void setImageResource(@NotNull PreviewView previewView, int i) {
        }

        public static void setImageURI(@NotNull PreviewView previewView, @Nullable Uri uri) {
        }

        public static void setMaximumScale(@NotNull PreviewView previewView, float f) {
        }

        public static void setMediumScale(@NotNull PreviewView previewView, float f) {
        }

        public static void setMinimumScale(@NotNull PreviewView previewView, float f) {
        }

        public static void setOnClickListener(@NotNull PreviewView previewView, @NotNull View.OnClickListener l) {
            Intrinsics.checkNotNullParameter(l, "l");
        }

        public static void setOnLongClickListener(@NotNull PreviewView previewView, @NotNull View.OnLongClickListener l) {
            Intrinsics.checkNotNullParameter(l, "l");
        }

        public static void setRotationBy(@NotNull PreviewView previewView, float f) {
        }

        public static void setRotationTo(@NotNull PreviewView previewView, float f) {
        }

        public static void setScale(@NotNull PreviewView previewView, float f) {
        }

        public static void setScaleLevels(@NotNull PreviewView previewView, float f, float f2, float f3) {
        }

        public static void setScaleType(@NotNull PreviewView previewView, @NotNull ImageView.ScaleType scaleType) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        }

        public static boolean setSuppMatrix(@NotNull PreviewView previewView, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            return false;
        }

        public static void setZoomTransitionDuration(@NotNull PreviewView previewView, int i) {
        }

        public static void setZoomable(@NotNull PreviewView previewView, boolean z) {
        }

        public static void setScale(@NotNull PreviewView previewView, float f, float f2, float f3, boolean z) {
        }

        public static void setScale(@NotNull PreviewView previewView, float f, boolean z) {
        }
    }

    void getDisplayMatrix(@NotNull Matrix matrix);

    @NotNull
    RectF getDisplayRect();

    @NotNull
    Matrix getImageMatrix();

    float getMaximumScale();

    float getMediumScale();

    float getMinimumScale();

    float getScale();

    @NotNull
    ImageView.ScaleType getScaleType();

    void getSuppMatrix(@NotNull Matrix matrix);

    @NotNull
    BaseViewAttacher getViewAttacher();

    boolean isZoomable();

    void setAllowParentInterceptOnEdge(boolean allow);

    boolean setDisplayMatrix(@NotNull Matrix matrix);

    boolean setFrame(int l, int t, int r, int b);

    void setImageDrawable(@Nullable Drawable drawable);

    void setImageResource(int resId);

    void setImageURI(@Nullable Uri uri);

    void setMaximumScale(float maximumScale);

    void setMediumScale(float mediumScale);

    void setMinimumScale(float minimumScale);

    void setOnClickListener(@NotNull View.OnClickListener l);

    void setOnDoubleTapListener(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(@NotNull View.OnLongClickListener l);

    void setOnMatrixChangeListener(@Nullable OnMatrixChangedListener listener);

    void setOnOutsidePhotoTapListener(@Nullable OnOutsidePhotoTapListener listener);

    void setOnPhotoTapListener(@Nullable OnPhotoTapListener listener);

    void setOnScaleChangeListener(@Nullable OnScaleChangedListener onScaleChangedListener);

    void setOnSingleFlingListener(@Nullable OnSingleFlingListener onSingleFlingListener);

    void setOnViewDragListener(@Nullable OnViewDragListener listener);

    void setOnViewTapListener(@Nullable OnViewTapListener listener);

    void setRotationBy(float rotationDegree);

    void setRotationTo(float rotationDegree);

    void setScale(float scale);

    void setScale(float scale, float focalX, float focalY, boolean animate);

    void setScale(float scale, boolean animate);

    void setScaleLevels(float minimumScale, float mediumScale, float maximumScale);

    void setScaleType(@NotNull ImageView.ScaleType scaleType);

    boolean setSuppMatrix(@NotNull Matrix matrix);

    void setZoomTransitionDuration(int milliseconds);

    void setZoomable(boolean zoomable);
}
