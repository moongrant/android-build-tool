package com.common.support.imagepicker.crop.widget;

import OooOo.OooO0o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Keep;
import com.common.support.imagepicker.crop.YLCrop;
import com.common.support.imagepicker.crop.config.CropConfig;
import com.common.support.imagepicker.crop.utils.ResourceUtil;

/* JADX INFO: loaded from: classes2.dex */
class CropAreaView extends View {
    private Control activeControl;
    private RectF actualRect;
    private Animator animator;
    private RectF bottomEdge;
    private RectF bottomLeftCorner;
    private float bottomPadding;
    private RectF bottomRightCorner;
    private Bitmap circleBitmap;
    private CropConfig config;
    private Paint dimPaint;
    private float frameAlpha;
    private Paint framePaint;
    private boolean frameVisible;
    private boolean freeform;
    private Animator gridAnimator;
    private float gridProgress;
    private GridType gridType;
    private Paint handlePaint;
    private AccelerateDecelerateInterpolator interpolator;
    private boolean isDragging;
    private long lastUpdateTime;
    private RectF leftEdge;
    private Paint linePaint;
    private AreaViewListener listener;
    private float lockAspectRatio;
    private float minWidth;
    private GridType previousGridType;
    private int previousX;
    private int previousY;
    private RectF rightEdge;
    private float sidePadding;
    private RectF targetRect;
    private RectF tempRect;
    private RectF topEdge;
    private RectF topLeftCorner;
    private float topPadding;
    private RectF topRightCorner;

    /* JADX INFO: renamed from: com.common.support.imagepicker.crop.widget.CropAreaView$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control;

        static {
            int[] iArr = new int[Control.values().length];
            $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control = iArr;
            try {
                iArr[Control.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[Control.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface AreaViewListener {
        void onAreaChange();

        void onAreaChangeBegan();

        void onAreaChangeEnded();
    }

    public enum Control {
        NONE,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        LEFT,
        BOTTOM,
        RIGHT
    }

    public enum GridType {
        NONE,
        MINOR,
        MAJOR
    }

    public CropAreaView(Context context) {
        super(context);
        this.topLeftCorner = new RectF();
        this.topRightCorner = new RectF();
        this.bottomLeftCorner = new RectF();
        this.bottomRightCorner = new RectF();
        this.topEdge = new RectF();
        this.leftEdge = new RectF();
        this.bottomEdge = new RectF();
        this.rightEdge = new RectF();
        this.actualRect = new RectF();
        this.tempRect = new RectF();
        this.frameAlpha = 1.0f;
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.freeform = true;
        this.targetRect = new RectF();
        this.frameVisible = true;
        this.sidePadding = ResourceUtil.dp(16);
        this.topPadding = ResourceUtil.dp(48);
        this.minWidth = ResourceUtil.dp(32);
        this.gridType = GridType.NONE;
        CropConfig mCropConfig = YLCrop.INSTANCE.getMCropConfig();
        this.config = mCropConfig;
        if (mCropConfig != null && mCropConfig.getShadowBackgroundColor() != 0) {
            Paint paint = new Paint();
            this.dimPaint = paint;
            paint.setColor(this.config.getShadowBackgroundColor());
        }
        CropConfig cropConfig = this.config;
        if (cropConfig != null && cropConfig.getShowCropFrame()) {
            Paint paint2 = new Paint();
            this.linePaint = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.linePaint.setColor(this.config.getCropColor());
            this.linePaint.setStrokeWidth(ResourceUtil.dp(1));
        }
        CropConfig cropConfig2 = this.config;
        if (cropConfig2 != null && cropConfig2.getScaleEnabled()) {
            Paint paint3 = new Paint();
            this.handlePaint = paint3;
            paint3.setStyle(Paint.Style.FILL);
            this.handlePaint.setColor(this.config.getCropColor());
        }
        Paint paint4 = new Paint();
        this.framePaint = paint4;
        paint4.setStyle(Paint.Style.FILL);
        CropConfig cropConfig3 = this.config;
        if (cropConfig3 == null || cropConfig3.getCropColor() == 0) {
            return;
        }
        this.framePaint.setColor(this.config.getCropColor());
    }

    private void constrainRectByHeight(RectF rectF, float f) {
        float fHeight = rectF.height();
        rectF.right = rectF.left + (f * fHeight);
        rectF.bottom = rectF.top + fHeight;
    }

    private void constrainRectByWidth(RectF rectF, float f) {
        float fWidth = rectF.width();
        rectF.right = rectF.left + fWidth;
        rectF.bottom = rectF.top + (fWidth / f);
    }

    @Keep
    private float getGridProgress() {
        return this.gridProgress;
    }

    private float getStatusBarHeight() {
        return this.topPadding;
    }

    @Keep
    private void setCropBottom(float f) {
        this.actualRect.bottom = f;
        invalidate();
    }

    @Keep
    private void setCropLeft(float f) {
        this.actualRect.left = f;
        invalidate();
    }

    @Keep
    private void setCropRight(float f) {
        this.actualRect.right = f;
        invalidate();
    }

    @Keep
    private void setCropTop(float f) {
        this.actualRect.top = f;
        invalidate();
    }

    @Keep
    private void setGridProgress(float f) {
        this.gridProgress = f;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0068  */
    public void calculateRect(RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float statusBarHeight = getStatusBarHeight();
        float measuredHeight = (getMeasuredHeight() - this.bottomPadding) - statusBarHeight;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float fMin = Math.min(getMeasuredWidth(), measuredHeight) - (this.sidePadding * 2.0f);
        float measuredWidth2 = getMeasuredWidth();
        float f6 = this.sidePadding;
        float f7 = measuredWidth2 - (f6 * 2.0f);
        float f8 = measuredHeight - (f6 * 2.0f);
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f9 = (measuredHeight / 2.0f) + statusBarHeight;
        if (Math.abs(1.0f - f) < 1.0E-4d) {
            float f10 = fMin / 2.0f;
            f5 = measuredWidth3 - f10;
            f4 = f9 - f10;
            f2 = measuredWidth3 + f10;
            f3 = f9 + f10;
        } else if (f - measuredWidth <= 1.0E-4d) {
            float f11 = f8 * f;
            if (f11 > f7) {
                float f12 = f7 / 2.0f;
                float f13 = measuredWidth3 - f12;
                float f14 = (f7 / f) / 2.0f;
                float f15 = f9 - f14;
                f2 = measuredWidth3 + f12;
                f3 = f9 + f14;
                f4 = f15;
                f5 = f13;
            } else {
                float f16 = f11 / 2.0f;
                f5 = measuredWidth3 - f16;
                float f17 = f8 / 2.0f;
                float f18 = f9 - f17;
                f2 = measuredWidth3 + f16;
                f3 = f9 + f17;
                f4 = f18;
            }
        } else {
            float f19 = f7 / 2.0f;
            float f110 = measuredWidth3 - f19;
            float f111 = (f7 / f) / 2.0f;
            float f112 = f9 - f111;
            f2 = measuredWidth3 + f19;
            f3 = f9 + f111;
            f4 = f112;
            f5 = f110;
        }
        rectF.set(f5, f4, f2, f3);
    }

    public void fill(final RectF rectF, Animator animator, boolean z) {
        if (!z) {
            setActualRect(rectF);
            return;
        }
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.cancel();
            this.animator = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.animator = animatorSet;
        animatorSet.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "cropLeft", rectF.left);
        objectAnimatorOfFloat.setInterpolator(this.interpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "cropTop", rectF.top);
        objectAnimatorOfFloat2.setInterpolator(this.interpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "cropRight", rectF.right);
        objectAnimatorOfFloat3.setInterpolator(this.interpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "cropBottom", rectF.bottom);
        objectAnimatorOfFloat4.setInterpolator(this.interpolator);
        animator.setInterpolator(this.interpolator);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, animator);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.common.support.imagepicker.crop.widget.CropAreaView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator3) {
                CropAreaView.this.setActualRect(rectF);
                CropAreaView.this.animator = null;
            }
        });
        animatorSet.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.actualRect;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    @Keep
    public float getCropBottom() {
        return this.actualRect.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.actualRect;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.actualRect;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.actualRect;
        return rectF.bottom - rectF.top;
    }

    @Keep
    public float getCropLeft() {
        return this.actualRect.left;
    }

    public void getCropRect(RectF rectF) {
        rectF.set(this.actualRect);
    }

    @Keep
    public float getCropRight() {
        return this.actualRect.right;
    }

    @Keep
    public float getCropTop() {
        return this.actualRect.top;
    }

    public float getCropWidth() {
        RectF rectF = this.actualRect;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.interpolator;
    }

    public float getLockAspectRatio() {
        return this.lockAspectRatio;
    }

    public RectF getTargetRectToFill() {
        return getTargetRectToFill(getAspectRatio());
    }

    public boolean isDragging() {
        return this.isDragging;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int iDp = ResourceUtil.dp(2);
        int iDp2 = ResourceUtil.dp(16);
        int iDp3 = ResourceUtil.dp(3);
        RectF rectF = this.actualRect;
        float f = rectF.left;
        int i5 = ((int) f) - iDp;
        float f2 = rectF.top;
        int i6 = ((int) f2) - iDp;
        int i7 = iDp * 2;
        int i8 = ((int) (rectF.right - f)) + i7;
        int i9 = ((int) (rectF.bottom - f2)) + i7;
        if (this.dimPaint != null) {
            float f3 = i6 + iDp;
            canvas.drawRect(0.0f, 0.0f, getWidth(), f3, this.dimPaint);
            float f4 = (i6 + i9) - iDp;
            canvas.drawRect(0.0f, f3, i5 + iDp, f4, this.dimPaint);
            canvas.drawRect((i5 + i8) - iDp, f3, getWidth(), f4, this.dimPaint);
            canvas.drawRect(0.0f, f4, getWidth(), getHeight(), this.dimPaint);
        }
        if (this.frameVisible) {
            int i10 = iDp3 - iDp;
            int i11 = iDp3 * 2;
            int i12 = i8 - i11;
            int i13 = i9 - i11;
            GridType gridType = this.gridType;
            if (gridType == GridType.NONE && this.gridProgress > 0.0f) {
                gridType = this.previousGridType;
            }
            Paint paint = this.linePaint;
            if (paint != null) {
                paint.setAlpha((int) (this.gridProgress * 178.0f * this.frameAlpha));
            }
            this.framePaint.setAlpha((int) (this.frameAlpha * 178.0f));
            Paint paint2 = this.handlePaint;
            if (paint2 != null) {
                paint2.setAlpha((int) (this.frameAlpha * 255.0f));
            }
            if (this.linePaint != null) {
                int i14 = 0;
                while (true) {
                    int i15 = 3;
                    if (i14 >= 3) {
                        break;
                    }
                    if (gridType == GridType.MINOR) {
                        int i16 = 1;
                        while (i16 < 4) {
                            if (i14 != 2 || i16 != i15) {
                                int i17 = i5 + iDp3;
                                int i18 = i12 / 3;
                                float f5 = (i18 * i14) + ((i18 / 3) * i16) + i17;
                                int i19 = i6 + iDp3;
                                canvas.drawLine(f5, i19, f5, i19 + i13, this.linePaint);
                                int i20 = i13 / 3;
                                float f6 = (i20 * i14) + ((i20 / 3) * i16) + i19;
                                canvas.drawLine(i17, f6, i17 + i12, f6, this.linePaint);
                            }
                            i16++;
                            iDp2 = iDp2;
                            i9 = i9;
                            iDp = iDp;
                            i8 = i8;
                            i15 = 3;
                        }
                        i = iDp;
                        i2 = iDp2;
                        i3 = i9;
                        i4 = i8;
                    } else {
                        i = iDp;
                        i2 = iDp2;
                        i3 = i9;
                        i4 = i8;
                        if (gridType == GridType.MAJOR && i14 > 0) {
                            int i21 = i5 + iDp3;
                            float f7 = ((i12 / 3) * i14) + i21;
                            int i22 = i6 + iDp3;
                            canvas.drawLine(f7, i22, f7, i22 + i13, this.linePaint);
                            float f8 = ((i13 / 3) * i14) + i22;
                            canvas.drawLine(i21, f8, i21 + i12, f8, this.linePaint);
                        }
                    }
                    i14++;
                    iDp2 = i2;
                    i9 = i3;
                    iDp = i;
                    i8 = i4;
                }
            }
            int i23 = iDp;
            int i24 = iDp2;
            int i25 = i9;
            int i26 = i5 + i10;
            float f9 = i26;
            int i27 = i6 + i10;
            float f10 = i27;
            int i28 = i5 + i8;
            int i29 = i28 - i10;
            float f11 = i29;
            canvas.drawRect(f9, f10, f11, i27 + i23, this.framePaint);
            int i30 = i6 + i25;
            int i31 = i30 - i10;
            float f12 = i31;
            canvas.drawRect(f9, f10, i26 + i23, f12, this.framePaint);
            canvas.drawRect(f9, i31 - i23, f11, f12, this.framePaint);
            canvas.drawRect(i29 - i23, f10, f11, f12, this.framePaint);
            Paint paint3 = this.handlePaint;
            if (paint3 != null) {
                float f13 = i5;
                float f14 = i6;
                float f15 = i5 + i24;
                float f16 = i6 + iDp3;
                canvas.drawRect(f13, f14, f15, f16, paint3);
                float f17 = i5 + iDp3;
                float f18 = i6 + i24;
                canvas.drawRect(f13, f14, f17, f18, this.handlePaint);
                float f19 = i28 - i24;
                float f20 = i28;
                canvas.drawRect(f19, f14, f20, f16, this.handlePaint);
                float f21 = i28 - iDp3;
                canvas.drawRect(f21, f14, f20, f18, this.handlePaint);
                float f22 = i30 - iDp3;
                float f23 = i30;
                canvas.drawRect(f13, f22, f15, f23, this.handlePaint);
                float f24 = i30 - i24;
                canvas.drawRect(f13, f24, f17, f23, this.handlePaint);
                canvas.drawRect(f19, f22, f20, f23, this.handlePaint);
                canvas.drawRect(f21, f24, f20, f23, this.handlePaint);
            }
            if (this.frameAlpha < 1.0f) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                this.lastUpdateTime = jElapsedRealtime;
                float f25 = (j / 180.0f) + this.frameAlpha;
                this.frameAlpha = f25;
                if (f25 > 1.0f) {
                    this.frameAlpha = 1.0f;
                }
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CropConfig cropConfig = this.config;
        if (cropConfig == null || !cropConfig.getScaleEnabled()) {
            return false;
        }
        int x = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float statusBarHeight = getStatusBarHeight();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!this.freeform) {
                this.activeControl = Control.NONE;
                return false;
            }
            float f = x;
            float f2 = y;
            if (this.topLeftCorner.contains(f, f2)) {
                this.activeControl = Control.TOP_LEFT;
            } else if (this.topRightCorner.contains(f, f2)) {
                this.activeControl = Control.TOP_RIGHT;
            } else if (this.bottomLeftCorner.contains(f, f2)) {
                this.activeControl = Control.BOTTOM_LEFT;
            } else if (this.bottomRightCorner.contains(f, f2)) {
                this.activeControl = Control.BOTTOM_RIGHT;
            } else if (this.leftEdge.contains(f, f2)) {
                this.activeControl = Control.LEFT;
            } else if (this.topEdge.contains(f, f2)) {
                this.activeControl = Control.TOP;
            } else if (this.rightEdge.contains(f, f2)) {
                this.activeControl = Control.RIGHT;
            } else {
                if (!this.bottomEdge.contains(f, f2)) {
                    this.activeControl = Control.NONE;
                    return false;
                }
                this.activeControl = Control.BOTTOM;
            }
            this.previousX = x;
            this.previousY = y;
            setGridType(GridType.MAJOR, false);
            this.isDragging = true;
            AreaViewListener areaViewListener = this.listener;
            if (areaViewListener != null) {
                areaViewListener.onAreaChangeBegan();
            }
            return true;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.isDragging = false;
            Control control = this.activeControl;
            Control control2 = Control.NONE;
            if (control == control2) {
                return false;
            }
            this.activeControl = control2;
            AreaViewListener areaViewListener2 = this.listener;
            if (areaViewListener2 != null) {
                areaViewListener2.onAreaChangeEnded();
            }
            return true;
        }
        if (actionMasked != 2 || this.activeControl == Control.NONE) {
            return false;
        }
        this.tempRect.set(this.actualRect);
        float f3 = x - this.previousX;
        float f4 = y - this.previousY;
        this.previousX = x;
        this.previousY = y;
        boolean z = Math.abs(f3) > Math.abs(f4);
        switch (AnonymousClass3.$SwitchMap$com$common$support$imagepicker$crop$widget$CropAreaView$Control[this.activeControl.ordinal()]) {
            case 1:
                RectF rectF = this.tempRect;
                rectF.left += f3;
                rectF.top += f4;
                if (this.lockAspectRatio > 0.0f) {
                    float fWidth = rectF.width();
                    float fHeight = this.tempRect.height();
                    if (z) {
                        constrainRectByWidth(this.tempRect, this.lockAspectRatio);
                    } else {
                        constrainRectByHeight(this.tempRect, this.lockAspectRatio);
                    }
                    float fWidth2 = this.tempRect.width() - fWidth;
                    RectF rectF2 = this.tempRect;
                    rectF2.left -= fWidth2;
                    rectF2.right -= fWidth2;
                    float fHeight2 = rectF2.height() - fHeight;
                    RectF rectF3 = this.tempRect;
                    rectF3.top -= fHeight2;
                    rectF3.bottom -= fHeight2;
                }
                break;
            case 2:
                RectF rectF4 = this.tempRect;
                rectF4.right += f3;
                rectF4.top += f4;
                if (this.lockAspectRatio > 0.0f) {
                    float fHeight3 = rectF4.height();
                    if (z) {
                        constrainRectByWidth(this.tempRect, this.lockAspectRatio);
                    } else {
                        constrainRectByHeight(this.tempRect, this.lockAspectRatio);
                    }
                    float fHeight4 = this.tempRect.height() - fHeight3;
                    RectF rectF5 = this.tempRect;
                    rectF5.top -= fHeight4;
                    rectF5.bottom -= fHeight4;
                }
                break;
            case 3:
                RectF rectF6 = this.tempRect;
                rectF6.left += f3;
                rectF6.bottom += f4;
                if (this.lockAspectRatio > 0.0f) {
                    float fWidth3 = rectF6.width();
                    if (z) {
                        constrainRectByWidth(this.tempRect, this.lockAspectRatio);
                    } else {
                        constrainRectByHeight(this.tempRect, this.lockAspectRatio);
                    }
                    float fWidth4 = this.tempRect.width() - fWidth3;
                    RectF rectF7 = this.tempRect;
                    rectF7.left -= fWidth4;
                    rectF7.right -= fWidth4;
                }
                break;
            case 4:
                RectF rectF8 = this.tempRect;
                rectF8.right += f3;
                rectF8.bottom += f4;
                float f5 = this.lockAspectRatio;
                if (f5 > 0.0f) {
                    if (!z) {
                        constrainRectByHeight(rectF8, f5);
                    } else {
                        constrainRectByWidth(rectF8, f5);
                    }
                }
                break;
            case 5:
                RectF rectF9 = this.tempRect;
                rectF9.top += f4;
                float f6 = this.lockAspectRatio;
                if (f6 > 0.0f) {
                    constrainRectByHeight(rectF9, f6);
                }
                break;
            case 6:
                RectF rectF10 = this.tempRect;
                rectF10.left += f3;
                float f7 = this.lockAspectRatio;
                if (f7 > 0.0f) {
                    constrainRectByWidth(rectF10, f7);
                }
                break;
            case 7:
                RectF rectF11 = this.tempRect;
                rectF11.right += f3;
                float f8 = this.lockAspectRatio;
                if (f8 > 0.0f) {
                    constrainRectByWidth(rectF11, f8);
                }
                break;
            case 8:
                RectF rectF12 = this.tempRect;
                rectF12.bottom += f4;
                float f9 = this.lockAspectRatio;
                if (f9 > 0.0f) {
                    constrainRectByHeight(rectF12, f9);
                }
                break;
        }
        RectF rectF13 = this.tempRect;
        float f10 = rectF13.left;
        float f11 = this.sidePadding;
        if (f10 < f11) {
            float f12 = this.lockAspectRatio;
            if (f12 > 0.0f) {
                rectF13.bottom = ((rectF13.right - f11) / f12) + rectF13.top;
            }
            rectF13.left = f11;
        } else if (rectF13.right > getWidth() - this.sidePadding) {
            this.tempRect.right = getWidth() - this.sidePadding;
            if (this.lockAspectRatio > 0.0f) {
                RectF rectF14 = this.tempRect;
                rectF14.bottom = (rectF14.width() / this.lockAspectRatio) + rectF14.top;
            }
        }
        float f13 = this.sidePadding;
        float f14 = statusBarHeight + f13;
        float f15 = this.bottomPadding + f13;
        RectF rectF15 = this.tempRect;
        if (rectF15.top < f14) {
            float f16 = this.lockAspectRatio;
            if (f16 > 0.0f) {
                rectF15.right = OooO0o.OooO00o(rectF15.bottom, f14, f16, rectF15.left);
            }
            rectF15.top = f14;
        } else if (rectF15.bottom > getHeight() - f15) {
            this.tempRect.bottom = getHeight() - f15;
            if (this.lockAspectRatio > 0.0f) {
                RectF rectF16 = this.tempRect;
                rectF16.right = (rectF16.height() * this.lockAspectRatio) + rectF16.left;
            }
        }
        float fWidth5 = this.tempRect.width();
        float f17 = this.minWidth;
        if (fWidth5 < f17) {
            RectF rectF17 = this.tempRect;
            rectF17.right = rectF17.left + f17;
        }
        float fHeight5 = this.tempRect.height();
        float f18 = this.minWidth;
        if (fHeight5 < f18) {
            RectF rectF18 = this.tempRect;
            rectF18.bottom = rectF18.top + f18;
        }
        float f19 = this.lockAspectRatio;
        if (f19 > 0.0f) {
            if (f19 < 1.0f) {
                float fWidth6 = this.tempRect.width();
                float f20 = this.minWidth;
                if (fWidth6 <= f20) {
                    RectF rectF19 = this.tempRect;
                    rectF19.right = rectF19.left + f20;
                    rectF19.bottom = (rectF19.width() / this.lockAspectRatio) + rectF19.top;
                }
            } else {
                float fHeight6 = this.tempRect.height();
                float f21 = this.minWidth;
                if (fHeight6 <= f21) {
                    RectF rectF20 = this.tempRect;
                    rectF20.bottom = rectF20.top + f21;
                    rectF20.right = (rectF20.height() * this.lockAspectRatio) + rectF20.left;
                }
            }
        }
        setActualRect(this.tempRect);
        AreaViewListener areaViewListener3 = this.listener;
        if (areaViewListener3 != null) {
            areaViewListener3.onAreaChange();
        }
        return true;
    }

    public void resetAnimator() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
            this.animator = null;
        }
    }

    public void setActualRect(float f) {
        calculateRect(this.actualRect, f);
        updateTouchAreas();
        invalidate();
    }

    public void setBitmap(int i, int i2, boolean z, boolean z2) {
        this.freeform = z2;
        float f = z ? i2 / i : i / i2;
        if (!z2) {
            f = 1.0f;
            this.lockAspectRatio = 1.0f;
        }
        setActualRect(f);
    }

    public void setBottomPadding(float f) {
        this.bottomPadding = f;
    }

    public void setFrameVisibility(boolean z, boolean z2) {
        this.frameVisible = z;
        if (!z) {
            this.frameAlpha = 1.0f;
            return;
        }
        this.frameAlpha = z2 ? 0.0f : 1.0f;
        this.lastUpdateTime = SystemClock.elapsedRealtime();
        invalidate();
    }

    public void setFreeform(boolean z) {
        this.freeform = z;
    }

    public void setGridType(GridType gridType, boolean z) {
        Animator animator = this.gridAnimator;
        if (animator != null && (!z || this.gridType != gridType)) {
            animator.cancel();
            this.gridAnimator = null;
        }
        GridType gridType2 = this.gridType;
        if (gridType2 == gridType) {
            return;
        }
        this.previousGridType = gridType2;
        this.gridType = gridType;
        GridType gridType3 = GridType.NONE;
        float f = gridType == gridType3 ? 0.0f : 1.0f;
        if (!z) {
            this.gridProgress = f;
            invalidate();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.gridProgress, f);
        this.gridAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.gridAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.common.support.imagepicker.crop.widget.CropAreaView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                CropAreaView.this.gridAnimator = null;
            }
        });
        if (gridType == gridType3) {
            this.gridAnimator.setStartDelay(1800L);
        }
        this.gridAnimator.start();
    }

    public void setIsVideo(boolean z) {
        this.minWidth = ResourceUtil.dp(z ? 64 : 32);
    }

    public void setListener(AreaViewListener areaViewListener) {
        this.listener = areaViewListener;
    }

    public void setLockedAspectRatio(float f) {
        this.lockAspectRatio = f;
    }

    public void setSidePadding(float f) {
        this.sidePadding = f;
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
    }

    public void updateTouchAreas() {
        int iDp = ResourceUtil.dp(16);
        RectF rectF = this.topLeftCorner;
        RectF rectF2 = this.actualRect;
        float f = rectF2.left;
        float f2 = iDp;
        float f3 = rectF2.top;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        RectF rectF3 = this.topRightCorner;
        RectF rectF4 = this.actualRect;
        float f4 = rectF4.right;
        float f5 = rectF4.top;
        rectF3.set(f4 - f2, f5 - f2, f4 + f2, f5 + f2);
        RectF rectF5 = this.bottomLeftCorner;
        RectF rectF6 = this.actualRect;
        float f6 = rectF6.left;
        float f7 = rectF6.bottom;
        rectF5.set(f6 - f2, f7 - f2, f6 + f2, f7 + f2);
        RectF rectF7 = this.bottomRightCorner;
        RectF rectF8 = this.actualRect;
        float f8 = rectF8.right;
        float f9 = rectF8.bottom;
        rectF7.set(f8 - f2, f9 - f2, f8 + f2, f9 + f2);
        RectF rectF9 = this.topEdge;
        RectF rectF10 = this.actualRect;
        float f10 = rectF10.left + f2;
        float f11 = rectF10.top;
        rectF9.set(f10, f11 - f2, rectF10.right - f2, f11 + f2);
        RectF rectF11 = this.leftEdge;
        RectF rectF12 = this.actualRect;
        float f12 = rectF12.left;
        rectF11.set(f12 - f2, rectF12.top + f2, f12 + f2, rectF12.bottom - f2);
        RectF rectF13 = this.rightEdge;
        RectF rectF14 = this.actualRect;
        float f13 = rectF14.right;
        rectF13.set(f13 - f2, rectF14.top + f2, f13 + f2, rectF14.bottom - f2);
        RectF rectF15 = this.bottomEdge;
        RectF rectF16 = this.actualRect;
        float f14 = rectF16.left + f2;
        float f15 = rectF16.bottom;
        rectF15.set(f14, f15 - f2, rectF16.right - f2, f15 + f2);
    }

    public RectF getTargetRectToFill(float f) {
        calculateRect(this.targetRect, f);
        return this.targetRect;
    }

    public void setActualRect(RectF rectF) {
        this.actualRect.set(rectF);
        updateTouchAreas();
        invalidate();
    }
}
