package com.common.support.imagepicker.crop.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.crop.entites.CropRatioEntity;
import com.common.support.imagepicker.crop.utils.MatrixUtils;
import com.common.support.imagepicker.crop.utils.ResourceUtilKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\b&\u0018\u0000 52\u00020\u0001:\u00015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\b\u0010&\u001a\u00020\u001eH\u0002J\u0018\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u0006\u0010*\u001a\u00020\u001eJ\u0006\u0010+\u001a\u00020\u001eJ\b\u0010,\u001a\u00020\u001eH&J\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0013J\u0010\u0010/\u001a\u00020\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u00100\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011J\u0016\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020!J\b\u00104\u001a\u00020\u001eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0001X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/common/support/imagepicker/crop/widget/BaseMediaCanvasLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "canvasArea", "Landroid/graphics/RectF;", "cropAreaLayout", "getCropAreaLayout", "()Landroid/widget/FrameLayout;", "cropInfo", "Lcom/common/support/imagepicker/crop/entites/CropInfo;", "drawMatrix", "Landroid/graphics/Matrix;", "enableCropDisplay", "", "imageMatrix", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "matrixValue", "", "pointValue", "previewMatrix", "calculateImageMatrix", "", "matrix", "cropWidth", "", "cropHeight", "getCanvasArea", "getContentHeight", "getContentWidth", "init", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "resetMatrix", "resetScaleArea", "resetViewAttacher", "setCropDisplayEnabled", "enable", "setCropInfo", "setCropPreviewMatrix", "setScaleArea", "rect", "scale", "transformImageToFitCanvasArea", "Companion", "crop_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseMediaCanvasLayout extends FrameLayout {

    @NotNull
    private static final String TAG = "MediaCanvasCropLayout";

    @NotNull
    private final RectF canvasArea;

    @NotNull
    private final FrameLayout cropAreaLayout;

    @Nullable
    private CropInfo cropInfo;

    @NotNull
    private final Matrix drawMatrix;
    private boolean enableCropDisplay;

    @NotNull
    private final Matrix imageMatrix;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final float[] matrixValue;

    @NotNull
    private final float[] pointValue;

    @Nullable
    private Matrix previewMatrix;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMediaCanvasLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void init() {
        addView(this.cropAreaLayout, new FrameLayout.LayoutParams(-1, -1));
        this.cropAreaLayout.addView(this.imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void transformImageToFitCanvasArea() {
        float measuredWidth = this.imageView.getMeasuredWidth() / 2.0f;
        float measuredHeight = this.imageView.getMeasuredHeight() / 2.0f;
        float[] fArr = this.pointValue;
        fArr[0] = measuredWidth;
        fArr[1] = measuredHeight;
        Matrix matrix = this.previewMatrix;
        if (matrix == null) {
            matrix = this.drawMatrix;
        }
        matrix.mapPoints(fArr);
        matrix.getValues(this.matrixValue);
        float[] fArr2 = this.pointValue;
        float f = fArr2[0] - measuredWidth;
        float f2 = fArr2[1] - measuredHeight;
        MatrixUtils matrixUtils = MatrixUtils.INSTANCE;
        float scale = matrixUtils.getScale(this.matrixValue);
        float rotate = matrixUtils.getRotate(this.matrixValue);
        ImageView imageView = this.imageView;
        if (ResourceUtilKt.isRtlLayout()) {
            f = -f;
        }
        imageView.setTranslationX(f);
        this.imageView.setTranslationY(f2);
        this.imageView.setScaleX(scale);
        this.imageView.setScaleY(scale);
        this.imageView.setRotation(rotate);
    }

    public final void calculateImageMatrix(@NotNull Matrix matrix, float cropWidth, float cropHeight) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.imageView.getMeasuredWidth();
        int measuredHeight2 = this.imageView.getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float fMin = Math.min(f / cropWidth, f2 / cropHeight);
        float fMax = Math.max((cropWidth * fMin) / measuredWidth2, (cropHeight * fMin) / measuredHeight2);
        matrix.reset();
        matrix.postTranslate((measuredWidth - measuredWidth2) / 2.0f, (measuredHeight - measuredHeight2) / 2.0f);
        matrix.postScale(fMax, fMax, f / 2.0f, f2 / 2.0f);
    }

    @NotNull
    public final RectF getCanvasArea() {
        return this.canvasArea;
    }

    public final int getContentHeight() {
        return this.imageView.getMeasuredHeight();
    }

    public final int getContentWidth() {
        return this.imageView.getMeasuredWidth();
    }

    @NotNull
    public final FrameLayout getCropAreaLayout() {
        return this.cropAreaLayout;
    }

    @NotNull
    public final ImageView getImageView() {
        return this.imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f;
        float f2;
        float fMax;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.imageView.getMeasuredWidth();
        int measuredHeight2 = this.imageView.getMeasuredHeight();
        ImagePickerLogUtil.d(TAG, "onMeasure: bitmapWidth=" + measuredWidth2 + ", " + measuredHeight2);
        float f3 = (float) measuredWidth;
        float f4 = (float) measuredWidth2;
        float f5 = (float) measuredHeight;
        float f6 = (float) measuredHeight2;
        float fMin = Math.min(f3 / f4, f5 / f6);
        CropInfo cropInfo = this.cropInfo;
        if ((cropInfo != null ? cropInfo.getCropRatio() : null) != null) {
            CropInfo cropInfo2 = this.cropInfo;
            CropRatioEntity cropRatio = cropInfo2 != null ? cropInfo2.getCropRatio() : null;
            Intrinsics.checkNotNull(cropRatio);
            int width = cropRatio.getWidth();
            CropInfo cropInfo3 = this.cropInfo;
            CropRatioEntity cropRatio2 = cropInfo3 != null ? cropInfo3.getCropRatio() : null;
            Intrinsics.checkNotNull(cropRatio2);
            int height = cropRatio2.getHeight();
            ImagePickerLogUtil.d(TAG, "onMeasure: cropInfo=" + width + ", " + height);
            float f7 = (float) width;
            float f8 = (float) height;
            float fMin2 = Math.min(f3 / f7, f5 / f8);
            f2 = f7 * fMin2;
            f = f8 * fMin2;
            fMax = Math.max(f2 / f4, f / f6);
        } else {
            f = f6 * fMin;
            f2 = f4 * fMin;
            fMax = fMin;
        }
        ImagePickerLogUtil.d(TAG, "onMeasure: " + f2 + ", " + f);
        float f9 = (float) 2;
        float f10 = (f3 - f2) / f9;
        float f11 = (f5 - f) / f9;
        this.canvasArea.set(f10, f11, f2 + f10, f + f11);
        this.imageMatrix.reset();
        this.imageMatrix.postTranslate((measuredWidth - measuredWidth2) / 2.0f, (measuredHeight - measuredHeight2) / 2.0f);
        this.imageMatrix.postScale(fMax, fMax, f3 / 2.0f, f5 / 2.0f);
        this.drawMatrix.reset();
        CropInfo cropInfo4 = this.cropInfo;
        if (cropInfo4 != null) {
            Matrix matrix = this.drawMatrix;
            Intrinsics.checkNotNull(cropInfo4);
            matrix.postConcat(cropInfo4.getMatrix());
        }
        this.drawMatrix.postConcat(this.imageMatrix);
        transformImageToFitCanvasArea();
    }

    public final void resetMatrix() {
        this.drawMatrix.reset();
    }

    public final void resetScaleArea() {
        this.cropAreaLayout.setScaleX(1.0f);
        this.cropAreaLayout.setScaleY(1.0f);
        this.cropAreaLayout.setTranslationX(0.0f);
        this.cropAreaLayout.setTranslationY(0.0f);
    }

    public abstract void resetViewAttacher();

    public final void setCropDisplayEnabled(boolean enable) {
        this.enableCropDisplay = enable;
        this.cropAreaLayout.invalidate();
    }

    public final void setCropInfo(@Nullable CropInfo cropInfo) {
        this.cropInfo = cropInfo;
        requestLayout();
        this.cropAreaLayout.invalidate();
    }

    public final void setCropPreviewMatrix(@Nullable Matrix matrix) {
        this.enableCropDisplay = matrix == null;
        this.previewMatrix = matrix;
        transformImageToFitCanvasArea();
        this.cropAreaLayout.invalidate();
    }

    public final void setScaleArea(@NotNull RectF rect, float scale) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        FrameLayout frameLayout = this.cropAreaLayout;
        float fCenterX = rect.centerX() - (frameLayout.getWidth() / 2);
        float fCenterY = rect.centerY() - (frameLayout.getHeight() / 2);
        frameLayout.setScaleX(scale);
        frameLayout.setScaleY(scale);
        frameLayout.setTranslationX(fCenterX);
        frameLayout.setTranslationY(fCenterY);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMediaCanvasLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseMediaCanvasLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseMediaCanvasLayout(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageView = new ImageView(context);
        this.drawMatrix = new Matrix();
        this.imageMatrix = new Matrix();
        this.matrixValue = new float[9];
        this.pointValue = new float[2];
        this.enableCropDisplay = true;
        this.canvasArea = new RectF();
        this.cropAreaLayout = new FrameLayout(context) { // from class: com.common.support.imagepicker.crop.widget.BaseMediaCanvasLayout$cropAreaLayout$1
            @Override // android.view.ViewGroup, android.view.View
            public void dispatchDraw(@NotNull Canvas canvas) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                if (this.enableCropDisplay) {
                    canvas.save();
                    canvas.clipRect(this.canvasArea);
                }
                super.dispatchDraw(canvas);
                if (this.enableCropDisplay) {
                    canvas.restore();
                }
            }
        };
        init();
    }
}
