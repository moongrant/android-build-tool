package com.common.support.imagepicker.crop.widget;

import OooOo.OooO0o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.common.support.imagepicker.crop.entites.CropInfo;
import com.common.support.imagepicker.crop.entites.CropRatioEntity;
import com.common.support.imagepicker.crop.utils.ResourceUtil;

/* JADX INFO: loaded from: classes2.dex */
public class CropView extends FrameLayout implements CropAreaView.AreaViewListener, CropGestureDetector.CropGestureListener {
    private static final float EPSILON = 1.0E-5f;
    private static final float MAX_SCALE = 5.0f;
    private static final int RESULT_SIDE = 1280;
    public boolean animating;
    private CropAreaView areaView;
    private float bottomPadding;
    public Matrix cropMatrix;
    RectF cropRect;
    private CropGestureDetector detector;
    private boolean freeform;
    private Matrix imageMatrix;
    private RectF initialAreaRect;
    private boolean isVisible;
    private CropViewListener listener;
    private BaseMediaCanvasLayout mMediaCanvasCrop;
    public Matrix previewMatrix;
    private RectF previousAreaRect;
    private float rotationStartScale;
    RectF sizeRect;
    public CropState state;
    private Matrix tempMatrix;
    private CropRectangle tempRect;
    private float topPadding;
    public boolean touching;
    float[] values;

    public static class CropRectangle {
        float[] coords = new float[8];

        public void applyMatrix(Matrix matrix) {
            matrix.mapPoints(this.coords);
        }

        public void getRect(RectF rectF) {
            float[] fArr = this.coords;
            rectF.set(fArr[0], fArr[1], fArr[2], fArr[7]);
        }

        public void setRect(RectF rectF) {
            float[] fArr = this.coords;
            float f = rectF.left;
            fArr[0] = f;
            float f2 = rectF.top;
            fArr[1] = f2;
            float f3 = rectF.right;
            fArr[2] = f3;
            fArr[3] = f2;
            fArr[4] = f3;
            float f4 = rectF.bottom;
            fArr[5] = f4;
            fArr[6] = f;
            fArr[7] = f4;
        }
    }

    public class CropState {
        private float baseRotation;
        private float height;
        private Matrix matrix;
        private float minimumScale;
        private boolean mirrored;
        private float orientation;
        private float rotation;
        private float scale;
        private float width;
        private float x;
        private float y;

        public /* synthetic */ CropState(CropView cropView, int i, int i2) {
            this(i, i2, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBaseRotation() {
            return this.baseRotation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getConcatMatrix(Matrix matrix) {
            matrix.postConcat(this.matrix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getHeight() {
            return this.height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Matrix getMatrix() {
            Matrix matrix = new Matrix();
            matrix.set(this.matrix);
            return matrix;
        }

        private float getMinimumScale() {
            return this.minimumScale;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getOrientation() {
            return this.orientation + this.baseRotation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getOrientationOnly() {
            return (int) this.orientation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getOrientedHeight() {
            return (this.orientation + this.baseRotation) % 180.0f != 0.0f ? this.width : this.height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getOrientedWidth() {
            return (this.orientation + this.baseRotation) % 180.0f != 0.0f ? this.height : this.width;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRotation() {
            return this.rotation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getScale() {
            return this.scale;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getWidth() {
            return this.width;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getX() {
            return this.x;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getY() {
            return this.y;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasChanges() {
            return Math.abs(this.x) > CropView.EPSILON || Math.abs(this.y) > CropView.EPSILON || Math.abs(this.scale - this.minimumScale) > CropView.EPSILON || Math.abs(this.rotation) > CropView.EPSILON || Math.abs(this.orientation) > CropView.EPSILON;
        }

        private boolean isMirrored() {
            return this.mirrored;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mirror() {
            this.mirrored = !this.mirrored;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset(CropAreaView cropAreaView, float f, boolean z) {
            this.matrix.reset();
            this.x = 0.0f;
            this.y = 0.0f;
            this.rotation = 0.0f;
            this.orientation = f;
            updateMinimumScale();
            float f2 = this.minimumScale;
            this.scale = f2;
            this.matrix.postScale(f2, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rotate(float f, float f2, float f3) {
            this.rotation += f;
            this.matrix.postRotate(f, f2, f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void scale(float f, float f2, float f3) {
            this.scale *= f;
            this.matrix.postScale(f, f, f2, f3);
        }

        private void setScale(float f, float f2, float f3) {
            this.scale = f;
            this.matrix.reset();
            this.matrix.setScale(f, f, f2, f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void translate(float f, float f2) {
            this.x += f;
            this.y += f2;
            this.matrix.postTranslate(f, f2);
        }

        private void update(int i, int i2) {
            float f = i;
            this.scale *= this.width / f;
            this.width = f;
            this.height = i2;
            updateMinimumScale();
            this.matrix.getValues(CropView.this.values);
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f2 = this.scale;
            matrix.postScale(f2, f2);
            Matrix matrix2 = this.matrix;
            float[] fArr = CropView.this.values;
            matrix2.postTranslate(fArr[2], fArr[5]);
            CropView.this.updateMatrix();
        }

        private void updateMinimumScale() {
            float f = this.orientation;
            float f2 = this.baseRotation;
            float f3 = (f + f2) % 180.0f != 0.0f ? this.height : this.width;
            float f4 = (f + f2) % 180.0f != 0.0f ? this.width : this.height;
            if (CropView.this.freeform) {
                this.minimumScale = CropView.this.areaView.getCropWidth() / f3;
            } else {
                this.minimumScale = Math.max(CropView.this.areaView.getCropWidth() / f3, CropView.this.areaView.getCropHeight() / f4);
            }
        }

        public void copy(CropState cropState) {
            this.width = cropState.width;
            this.height = cropState.height;
            this.x = cropState.x;
            this.y = cropState.y;
            this.scale = cropState.scale;
            this.minimumScale = cropState.minimumScale;
            this.baseRotation = cropState.baseRotation;
            this.orientation = cropState.orientation;
            this.rotation = cropState.rotation;
            this.mirrored = cropState.mirrored;
            this.matrix.set(cropState.matrix);
        }

        public CropState(CropState cropState) {
            copy(cropState);
        }

        private CropState(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.x = 0.0f;
            this.y = 0.0f;
            this.scale = 1.0f;
            this.baseRotation = i3;
            this.rotation = 0.0f;
            this.matrix = new Matrix();
        }
    }

    public interface CropViewListener {
        void onAreaChangeBegin();

        void onAreaChangeEnd();

        void onAspectLock(boolean z);

        void onChange(boolean z);

        void onDrag();

        void onScale();

        void onTapUp();

        void onUpdate();
    }

    public CropView(Context context) {
        this(context, null);
    }

    private void fillAreaView(RectF rectF, boolean z) {
        final float scale;
        final boolean z2;
        if (this.state == null) {
            return;
        }
        final float[] fArr = {1.0f};
        float fMax = Math.max(rectF.width() / this.areaView.getCropWidth(), rectF.height() / this.areaView.getCropHeight());
        if (this.state.getScale() * fMax > MAX_SCALE) {
            z2 = true;
            scale = MAX_SCALE / this.state.getScale();
        } else {
            scale = fMax;
            z2 = false;
        }
        float statusBarHeight = getStatusBarHeight();
        final float orientedWidth = this.state.getOrientedWidth() * ((rectF.centerX() - (getWidth() / 2.0f)) / this.areaView.getCropWidth());
        final float orientedHeight = this.state.getOrientedHeight() * ((rectF.centerY() - (((getHeight() - this.bottomPadding) + statusBarHeight) / 2.0f)) / this.areaView.getCropHeight());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.common.support.imagepicker.crop.widget.OooO0O0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13590OooO0Oo.lambda$fillAreaView$0(scale, fArr, orientedWidth, orientedHeight, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.common.support.imagepicker.crop.widget.CropView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z2) {
                    CropView.this.fitContentInBounds(false, false, true);
                }
            }
        });
        this.areaView.fill(rectF, valueAnimatorOfFloat, true);
        this.initialAreaRect.set(rectF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fitContentInBounds(boolean z, boolean z2, boolean z3) {
        fitContentInBounds(z, z2, z3, false);
    }

    private float fitScale(RectF rectF, float f, float f2) {
        float fWidth = rectF.width() * f2;
        float fHeight = rectF.height() * f2;
        float fWidth2 = (rectF.width() - fWidth) / 2.0f;
        float fHeight2 = (rectF.height() - fHeight) / 2.0f;
        float f3 = rectF.left;
        float f4 = rectF.top;
        rectF.set(f3 + fWidth2, f4 + fHeight2, f3 + fWidth2 + fWidth, f4 + fHeight2 + fHeight);
        return f * f2;
    }

    private void fitTranslation(RectF rectF, RectF rectF2, PointF pointF, float f) {
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = rectF2.right;
        float f5 = rectF2.bottom;
        float f6 = rectF.left;
        if (f6 > f2) {
            f4 += f6 - f2;
            f2 = f6;
        }
        float f7 = rectF.top;
        if (f7 > f3) {
            f5 += f7 - f3;
            f3 = f7;
        }
        float f8 = rectF.right;
        if (f8 < f4) {
            f2 += f8 - f4;
        }
        float f9 = rectF.bottom;
        if (f9 < f5) {
            f3 += f9 - f5;
        }
        float fCenterX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f2);
        float fCenterY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f3);
        double d = f;
        double d2 = 1.5707963267948966d - d;
        double d3 = fCenterX;
        float fSin = (float) (Math.sin(d2) * d3);
        float fCos = (float) (Math.cos(d2) * d3);
        double d4 = d + 1.5707963267948966d;
        double d5 = fCenterY;
        pointF.set(pointF.x + fSin + ((float) (Math.cos(d4) * d5)), pointF.y + fCos + ((float) (Math.sin(d4) * d5)));
    }

    private int getCurrentHeight() {
        BaseMediaCanvasLayout baseMediaCanvasLayout = this.mMediaCanvasCrop;
        if (baseMediaCanvasLayout != null) {
            return baseMediaCanvasLayout.getContentHeight();
        }
        return 1;
    }

    private int getCurrentWidth() {
        BaseMediaCanvasLayout baseMediaCanvasLayout = this.mMediaCanvasCrop;
        if (baseMediaCanvasLayout != null) {
            return baseMediaCanvasLayout.getContentWidth();
        }
        return 1;
    }

    private float getStatusBarHeight() {
        return this.topPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillAreaView$0(float f, float[] fArr, float f2, float f3, ValueAnimator valueAnimator) {
        float fOooO00o = OooO0o.OooO00o(f, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        float f4 = fArr[0];
        float f5 = fOooO00o / f4;
        fArr[0] = f4 * f5;
        this.state.scale(f5, f2, f3);
        updateMatrix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fitContentInBounds$1(float f, float[] fArr, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f4 = fArr[1];
        float f5 = (f * fFloatValue) - f4;
        fArr[1] = f4 + f5;
        float f6 = fArr[2];
        float f7 = (f2 * fFloatValue) - f6;
        fArr[2] = f6 + f7;
        CropState cropState = this.state;
        float f8 = fArr[0];
        cropState.translate(f5 * f8, f7 * f8);
        float f9 = fArr[0];
        float f10 = (((f3 - 1.0f) * fFloatValue) + 1.0f) / f9;
        fArr[0] = f9 * f10;
        this.state.scale(f10, 0.0f, 0.0f);
        updateMatrix();
    }

    private void resetRotationStartScale() {
        this.rotationStartScale = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMatrix() {
        CropViewListener cropViewListener;
        this.previewMatrix.reset();
        if (this.state.getBaseRotation() == 90.0f || this.state.getBaseRotation() == 270.0f) {
            this.previewMatrix.postTranslate((-this.state.getHeight()) / 2.0f, (-this.state.getWidth()) / 2.0f);
        } else {
            this.previewMatrix.postTranslate((-this.state.getWidth()) / 2.0f, (-this.state.getHeight()) / 2.0f);
        }
        this.previewMatrix.postRotate(this.state.getOrientationOnly());
        this.state.getConcatMatrix(this.previewMatrix);
        this.previewMatrix.postTranslate(this.areaView.getCropCenterX(), this.areaView.getCropCenterY());
        BaseMediaCanvasLayout baseMediaCanvasLayout = this.mMediaCanvasCrop;
        if (baseMediaCanvasLayout != null) {
            baseMediaCanvasLayout.setCropPreviewMatrix(this.previewMatrix);
            float fMin = Math.min(this.mMediaCanvasCrop.getWidth() / this.areaView.getCropWidth(), this.mMediaCanvasCrop.getHeight() / this.areaView.getCropHeight());
            float width = (this.mMediaCanvasCrop.getWidth() / 2.0f) - this.areaView.getCropCenterX();
            float height = (this.mMediaCanvasCrop.getHeight() / 2.0f) - this.areaView.getCropCenterY();
            this.cropMatrix.set(this.previewMatrix);
            this.cropMatrix.postTranslate(width, height);
            this.cropMatrix.postScale(fMin, fMin, this.mMediaCanvasCrop.getWidth() / 2.0f, this.mMediaCanvasCrop.getHeight() / 2.0f);
            this.mMediaCanvasCrop.calculateImageMatrix(this.imageMatrix, this.areaView.getCropWidth(), this.areaView.getCropHeight());
            this.imageMatrix.invert(this.tempMatrix);
            this.cropMatrix.postConcat(this.tempMatrix);
        }
        if ((!this.freeform || this.isVisible) && (cropViewListener = this.listener) != null) {
            cropViewListener.onUpdate();
        }
        invalidate();
    }

    public RectF calculateBoundingBox(float f, float f2, float f3) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Matrix matrix = new Matrix();
        matrix.postRotate(f3, f / 2.0f, f2 / 2.0f);
        matrix.mapRect(rectF);
        return rectF;
    }

    public void changeLockRatio(float f) {
        this.areaView.resetAnimator();
        resetRotationStartScale();
        float orientation = (this.state.getOrientation() - this.state.getBaseRotation()) % 360.0f;
        this.areaView.setLockedAspectRatio(f);
        CropAreaView cropAreaView = this.areaView;
        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
        this.state.reset(this.areaView, orientation, this.freeform);
        updateMatrix();
        boolean z = false;
        fitContentInBounds(true, false, false);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            if (orientation == 0.0f && this.areaView.getLockAspectRatio() == 0.0f && !this.state.mirrored) {
                z = true;
            }
            cropViewListener.onChange(z);
            this.listener.onAspectLock(true);
        }
    }

    public RectF getActualRect() {
        this.areaView.getCropRect(this.cropRect);
        return this.cropRect;
    }

    public float getCropHeight() {
        return this.areaView.getCropHeight();
    }

    public float getCropLeft() {
        return this.areaView.getCropLeft();
    }

    public float getCropTop() {
        return this.areaView.getCropTop();
    }

    public float getCropWidth() {
        return this.areaView.getCropWidth();
    }

    public void hide() {
        this.areaView.setFrameVisibility(false, false);
        this.areaView.invalidate();
        onHide();
    }

    public boolean isReady() {
        return (this.detector.isScaling() || this.detector.isDragging() || this.areaView.isDragging()) ? false : true;
    }

    public boolean mirror() {
        CropState cropState = this.state;
        boolean z = false;
        if (cropState == null) {
            return false;
        }
        cropState.mirror();
        updateMatrix();
        if (this.listener != null) {
            float orientation = (this.state.getOrientation() - this.state.getBaseRotation()) % 360.0f;
            CropViewListener cropViewListener = this.listener;
            if (!this.state.hasChanges() && orientation == 0.0f && this.areaView.getLockAspectRatio() == 0.0f && !this.state.mirrored) {
                z = true;
            }
            cropViewListener.onChange(z);
        }
        return this.state.mirrored;
    }

    @Override // com.common.support.imagepicker.crop.widget.CropAreaView.AreaViewListener
    public void onAreaChange() {
        this.areaView.setGridType(CropAreaView.GridType.MAJOR, false);
        float fCenterX = this.previousAreaRect.centerX() - this.areaView.getCropCenterX();
        float fCenterY = this.previousAreaRect.centerY() - this.areaView.getCropCenterY();
        CropState cropState = this.state;
        if (cropState != null) {
            cropState.translate(fCenterX, fCenterY);
        }
        updateMatrix();
        this.areaView.getCropRect(this.previousAreaRect);
        fitContentInBounds(true, false, false);
    }

    @Override // com.common.support.imagepicker.crop.widget.CropAreaView.AreaViewListener
    public void onAreaChangeBegan() {
        this.areaView.getCropRect(this.previousAreaRect);
        resetRotationStartScale();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onAreaChangeBegin();
            this.listener.onChange(false);
        }
    }

    @Override // com.common.support.imagepicker.crop.widget.CropAreaView.AreaViewListener
    public void onAreaChangeEnded() {
        this.areaView.setGridType(CropAreaView.GridType.NONE, true);
        fillAreaView(this.areaView.getTargetRectToFill(), false);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onAreaChangeEnd();
        }
    }

    @Override // com.common.support.imagepicker.crop.widget.CropGestureDetector.CropGestureListener
    public void onDrag(float f, float f2) {
        if (this.animating) {
            return;
        }
        this.areaView.setGridType(CropAreaView.GridType.MAJOR, false);
        this.state.translate(f, f2);
        updateMatrix();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onDrag();
        }
    }

    @Override // com.common.support.imagepicker.crop.widget.CropGestureDetector.CropGestureListener
    public void onFling(float f, float f2, float f3, float f4) {
    }

    public void onHide() {
        this.mMediaCanvasCrop = null;
        this.isVisible = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onRotationBegan() {
        this.areaView.setGridType(CropAreaView.GridType.MINOR, false);
        if (this.rotationStartScale < EPSILON) {
            this.rotationStartScale = this.state.getScale();
        }
    }

    public void onRotationEnded() {
        this.areaView.setGridType(CropAreaView.GridType.NONE, true);
    }

    @Override // com.common.support.imagepicker.crop.widget.CropGestureDetector.CropGestureListener
    public void onScale(float f, float f2, float f3) {
        if (this.animating) {
            return;
        }
        this.areaView.setGridType(CropAreaView.GridType.MAJOR, false);
        if (this.state.getScale() * f > MAX_SCALE) {
            f = MAX_SCALE / this.state.getScale();
        }
        this.state.scale(f, this.state.getOrientedWidth() * ((f2 - (getWidth() / 2.0f)) / this.areaView.getCropWidth()), this.state.getOrientedHeight() * ((f3 - (((getHeight() - this.bottomPadding) - getStatusBarHeight()) / 2.0f)) / this.areaView.getCropHeight()));
        updateMatrix();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onScale();
        }
    }

    public void onScrollChangeBegan() {
        if (this.animating) {
            return;
        }
        this.areaView.setGridType(CropAreaView.GridType.NONE, false);
        resetRotationStartScale();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(false);
        }
    }

    public void onScrollChangeEnded() {
        this.areaView.setGridType(CropAreaView.GridType.NONE, true);
        fitContentInBounds(true, false, true);
    }

    public void onShow() {
        this.isVisible = true;
    }

    @Override // com.common.support.imagepicker.crop.widget.CropGestureDetector.CropGestureListener
    public void onTapUp() {
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onTapUp();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.animating) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touching = true;
        } else if (action == 1 || action == 3) {
            this.touching = false;
        }
        if (this.areaView.onTouchEvent(motionEvent)) {
            return true;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            onScrollChangeBegan();
        } else if (action2 == 1 || action2 == 3) {
            onScrollChangeEnded();
        }
        try {
            return this.detector.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void postRotation(float f) {
        this.state.rotate(f, 0.0f, 0.0f);
        fitContentInBounds(true, true, false);
    }

    public void reset() {
        this.areaView.resetAnimator();
        this.areaView.setBitmap(getCurrentWidth(), getCurrentHeight(), this.state.getBaseRotation() % 180.0f != 0.0f, this.freeform);
        this.areaView.setLockedAspectRatio(this.freeform ? 0.0f : 1.0f);
        this.state.reset(this.areaView, 0.0f, this.freeform);
        this.state.mirrored = false;
        this.areaView.getCropRect(this.initialAreaRect);
        updateMatrix();
        resetRotationStartScale();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(true);
            this.listener.onAspectLock(false);
        }
    }

    public boolean rotate90Degrees() {
        if (this.state == null) {
            return false;
        }
        this.areaView.resetAnimator();
        resetRotationStartScale();
        float orientation = ((this.state.getOrientation() - this.state.getBaseRotation()) - 90.0f) % 360.0f;
        boolean z = this.freeform;
        if (!z || this.areaView.getLockAspectRatio() <= 0.0f) {
            this.areaView.setBitmap(getCurrentWidth(), getCurrentHeight(), (this.state.getBaseRotation() + orientation) % 180.0f != 0.0f, this.freeform);
        } else {
            CropAreaView cropAreaView = this.areaView;
            cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
            CropAreaView cropAreaView2 = this.areaView;
            cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
            z = false;
        }
        this.state.reset(this.areaView, orientation, z);
        updateMatrix();
        fitContentInBounds(true, false, false);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(orientation == 0.0f && this.areaView.getLockAspectRatio() == 0.0f && !this.state.mirrored);
        }
        return this.state.getOrientationOnly() != 0;
    }

    public float scaleWidthToMaxSize(RectF rectF, RectF rectF2) {
        float fWidth = rectF2.width();
        if (((float) Math.floor((rectF.height() * fWidth) / rectF.width())) <= rectF2.height()) {
            return fWidth;
        }
        return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
    }

    public void setAreaSidePadding(float f) {
        this.areaView.setSidePadding(f);
    }

    public void setAspectRatio(float f) {
        this.areaView.setActualRect(f);
    }

    public void setBitmap(BaseMediaCanvasLayout baseMediaCanvasLayout, @Nullable final CropInfo cropInfo, @Nullable final CropRatioEntity cropRatioEntity, final Runnable runnable) {
        this.mMediaCanvasCrop = baseMediaCanvasLayout;
        this.freeform = true;
        this.areaView.setIsVideo(false);
        if (baseMediaCanvasLayout == null) {
            this.state = null;
            runnable.run();
        } else {
            this.state = new CropState(this, getCurrentWidth(), getCurrentHeight());
            this.areaView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.common.support.imagepicker.crop.widget.CropView.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    CropInfo cropInfo2 = cropInfo;
                    CropState restoreState = cropInfo2 != null ? cropInfo2.getRestoreState() : null;
                    CropView.this.reset();
                    CropInfo cropInfo3 = cropInfo;
                    boolean z = true;
                    if (cropInfo3 != null) {
                        if (cropInfo3.getLockedRatio() != null) {
                            CropView.this.areaView.setLockedAspectRatio((cropInfo.getLockedRatio().getWidth() * 1.0f) / cropInfo.getLockedRatio().getHeight());
                            CropView.this.areaView.setActualRect(CropView.this.areaView.getLockAspectRatio());
                            if (CropView.this.listener != null) {
                                CropView.this.listener.onAspectLock(true);
                            }
                        } else if (cropInfo.getCropRatio() != null) {
                            CropView.this.areaView.setActualRect((cropInfo.getCropRatio().getWidth() * 1.0f) / cropInfo.getCropRatio().getHeight());
                        }
                        if (restoreState != null) {
                            CropView.this.state.copy(restoreState);
                        } else {
                            CropView.this.state.mirrored = false;
                            CropView.this.state.rotate(0.0f, 0.0f, 0.0f);
                            CropView.this.state.translate(0.0f, 0.0f);
                            CropView.this.state.scale(0.0f, 0.0f, 0.0f);
                        }
                        CropView.this.updateMatrix();
                        if (CropView.this.listener != null) {
                            CropView.this.listener.onChange(false);
                        }
                    }
                    CropRatioEntity cropRatioEntity2 = cropRatioEntity;
                    if (cropRatioEntity2 != null) {
                        CropView.this.setLockedAspectRatio((cropRatioEntity2.getWidth() * 1.0f) / cropRatioEntity.getHeight());
                        z = false;
                    }
                    CropView.this.areaView.setFreeform(z);
                    CropView.this.areaView.getViewTreeObserver().removeOnPreDrawListener(this);
                    runnable.run();
                    return false;
                }
            });
        }
    }

    public void setBottomPadding(float f) {
        this.bottomPadding = f;
        this.areaView.setBottomPadding(f);
    }

    public void setFreeform(boolean z) {
        this.areaView.setFreeform(z);
    }

    public void setListener(CropViewListener cropViewListener) {
        this.listener = cropViewListener;
    }

    public void setLockedAspectRatio(float f) {
        this.areaView.setLockedAspectRatio(f);
        RectF rectF = new RectF();
        this.areaView.calculateRect(rectF, f);
        fillAreaView(rectF, true);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(false);
            this.listener.onAspectLock(true);
        }
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.state.rotate(f - this.state.getRotation(), 0.0f, 0.0f);
        fitContentInBounds(true, true, false);
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
        this.areaView.setTopPadding(f);
    }

    public void show() {
        this.areaView.setFrameVisibility(true, true);
        this.areaView.invalidate();
        onShow();
    }

    public void updateLayout() {
        CropState cropState;
        float cropWidth = this.areaView.getCropWidth();
        if (cropWidth == 0.0f || (cropState = this.state) == null) {
            return;
        }
        this.areaView.calculateRect(this.initialAreaRect, cropState.getWidth() / this.state.getHeight());
        CropAreaView cropAreaView = this.areaView;
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        this.areaView.getCropRect(this.previousAreaRect);
        this.state.scale(this.areaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        updateMatrix();
    }

    public void willShow() {
        this.areaView.setFrameVisibility(true, false);
        this.areaView.invalidate();
    }

    public CropView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.imageMatrix = new Matrix();
        this.values = new float[9];
        this.cropRect = new RectF();
        this.sizeRect = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        this.previousAreaRect = new RectF();
        this.initialAreaRect = new RectF();
        this.previewMatrix = new Matrix();
        this.cropMatrix = new Matrix();
        this.tempRect = new CropRectangle();
        this.tempMatrix = new Matrix();
        this.animating = false;
        this.touching = false;
        this.topPadding = ResourceUtil.dp(48);
        CropGestureDetector cropGestureDetector = new CropGestureDetector(context);
        this.detector = cropGestureDetector;
        cropGestureDetector.setOnGestureListener(this);
        CropAreaView cropAreaView = new CropAreaView(context);
        this.areaView = cropAreaView;
        cropAreaView.setListener(this);
        addView(this.areaView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fitContentInBounds(final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        float fFitScale;
        if (this.state == null) {
            return;
        }
        float cropWidth = this.areaView.getCropWidth();
        float cropHeight = this.areaView.getCropHeight();
        float orientedWidth = this.state.getOrientedWidth();
        float orientedHeight = this.state.getOrientedHeight();
        float rotation = this.state.getRotation();
        float radians = (float) Math.toRadians(rotation);
        RectF rectFCalculateBoundingBox = calculateBoundingBox(cropWidth, cropHeight, rotation);
        RectF rectF = new RectF(0.0f, 0.0f, orientedWidth, orientedHeight);
        float scale = this.state.getScale();
        this.tempRect.setRect(rectF);
        Matrix matrix = this.state.getMatrix();
        matrix.preTranslate(((cropWidth - orientedWidth) / 2.0f) / scale, ((cropHeight - orientedHeight) / 2.0f) / scale);
        this.tempMatrix.reset();
        this.tempMatrix.setTranslate(rectF.centerX(), rectF.centerY());
        Matrix matrix2 = this.tempMatrix;
        matrix2.setConcat(matrix2, matrix);
        this.tempMatrix.preTranslate(-rectF.centerX(), -rectF.centerY());
        this.tempRect.applyMatrix(this.tempMatrix);
        this.tempMatrix.reset();
        this.tempMatrix.preRotate(-rotation, orientedWidth / 2.0f, orientedHeight / 2.0f);
        this.tempRect.applyMatrix(this.tempMatrix);
        this.tempRect.getRect(rectF);
        PointF pointF = new PointF(this.state.getX(), this.state.getY());
        if (!rectF.contains(rectFCalculateBoundingBox)) {
            fFitScale = (!z || (rectFCalculateBoundingBox.width() <= rectF.width() && rectFCalculateBoundingBox.height() <= rectF.height())) ? scale : fitScale(rectF, scale, rectFCalculateBoundingBox.width() / scaleWidthToMaxSize(rectFCalculateBoundingBox, rectF));
            fitTranslation(rectF, rectFCalculateBoundingBox, pointF, radians);
        } else if (!z2 || this.rotationStartScale <= 0.0f) {
            fFitScale = scale;
        } else {
            float fWidth = rectFCalculateBoundingBox.width() / scaleWidthToMaxSize(rectFCalculateBoundingBox, rectF);
            if (this.state.getScale() * fWidth < this.rotationStartScale) {
                fWidth = 1.0f;
            }
            fFitScale = fitScale(rectF, scale, fWidth);
            fitTranslation(rectF, rectFCalculateBoundingBox, pointF, radians);
        }
        final float x = pointF.x - this.state.getX();
        final float y = pointF.y - this.state.getY();
        if (!z3) {
            this.state.translate(x, y);
            this.state.scale(fFitScale / scale, 0.0f, 0.0f);
            updateMatrix();
            return;
        }
        final float f = fFitScale / scale;
        if (Math.abs(f - 1.0f) >= EPSILON || Math.abs(x) >= EPSILON || Math.abs(y) >= EPSILON) {
            this.animating = true;
            final float[] fArr = {1.0f, 0.0f, 0.0f};
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.common.support.imagepicker.crop.widget.OooO00o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f13585OooO0Oo.lambda$fitContentInBounds$1(x, fArr, y, f, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.common.support.imagepicker.crop.widget.CropView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    CropView cropView = CropView.this;
                    cropView.animating = false;
                    if (z4) {
                        return;
                    }
                    cropView.fitContentInBounds(z, z2, z3, true);
                }
            });
            valueAnimatorOfFloat.setInterpolator(this.areaView.getInterpolator());
            valueAnimatorOfFloat.setDuration(z4 ? 100L : 200L);
            valueAnimatorOfFloat.start();
        }
    }
}
