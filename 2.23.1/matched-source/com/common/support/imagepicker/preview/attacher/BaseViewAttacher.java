package com.common.support.imagepicker.preview.attacher;

import OooOo.OooO0o;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import p031OoooO0.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static final float DEFAULT_MAX_SCALE = 3.0f;
    private static final float DEFAULT_MID_SCALE = 2.0f;
    private static final float DEFAULT_MIN_SCALE = 1.0f;
    private static final int DEFAULT_ZOOM_DURATION = 200;
    private static final int HORIZONTAL_EDGE_BOTH = 2;
    private static final int HORIZONTAL_EDGE_LEFT = 0;
    private static final int HORIZONTAL_EDGE_NONE = -1;
    private static final int HORIZONTAL_EDGE_RIGHT = 1;
    private static final int SINGLE_TOUCH = 1;
    private static final int SIXTY_FPS_INTERVAL = 16;
    private static final int VERTICAL_EDGE_BOTH = 2;
    private static final int VERTICAL_EDGE_BOTTOM = 1;
    private static final int VERTICAL_EDGE_NONE = -1;
    private static final int VERTICAL_EDGE_TOP = 0;
    private float mBaseRotation;
    private FlingRunnable mCurrentFlingRunnable;
    private GestureDetector mGestureDetector;
    private View.OnLongClickListener mLongClickListener;
    private OnMatrixChangedListener mMatrixChangeListener;
    private View.OnClickListener mOnClickListener;
    private OnViewDragListener mOnViewDragListener;
    private OnOutsidePhotoTapListener mOutsidePhotoTapListener;
    private OnPhotoTapListener mPhotoTapListener;
    private OnScaleChangedListener mScaleChangeListener;
    private CustomGestureDetector mScaleDragDetector;
    private OnSingleFlingListener mSingleFlingListener;
    private View mView;
    private OnViewTapListener mViewTapListener;
    private Interpolator mInterpolator = new AccelerateDecelerateInterpolator();
    private int mZoomDuration = 200;
    private float mMinScale = 1.0f;
    private float mMidScale = DEFAULT_MID_SCALE;
    private float mMaxScale = DEFAULT_MAX_SCALE;
    private boolean mAllowParentInterceptOnEdge = true;
    private boolean mBlockParentIntercept = false;
    private final Matrix mBaseMatrix = new Matrix();
    private final Matrix mDrawMatrix = new Matrix();
    private final Matrix mSuppMatrix = new Matrix();
    private final RectF mDisplayRect = new RectF();
    private final float[] mMatrixValues = new float[9];
    private int mHorizontalScrollEdge = 2;
    private int mVerticalScrollEdge = 2;
    private boolean mZoomEnabled = true;
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;
    private OnGestureListener onGestureListener = new OnGestureListener() { // from class: com.common.support.imagepicker.preview.attacher.BaseViewAttacher.1
        @Override // com.common.support.imagepicker.preview.attacher.OnGestureListener
        public void onDrag(float f, float f2) {
            if (BaseViewAttacher.this.mScaleDragDetector.isScaling()) {
                return;
            }
            if (BaseViewAttacher.this.mOnViewDragListener != null) {
                BaseViewAttacher.this.mOnViewDragListener.onDrag(f, f2);
            }
            BaseViewAttacher.this.mSuppMatrix.postTranslate(f, f2);
            BaseViewAttacher.this.checkAndDisplayMatrix();
            ViewParent parent = BaseViewAttacher.this.mView.getParent();
            if (!BaseViewAttacher.this.mAllowParentInterceptOnEdge || BaseViewAttacher.this.mScaleDragDetector.isScaling() || BaseViewAttacher.this.mBlockParentIntercept) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (Math.abs(f) > Math.abs(f2)) {
                if (BaseViewAttacher.this.mHorizontalScrollEdge == 2 || ((BaseViewAttacher.this.mHorizontalScrollEdge == 0 && f >= 1.0f) || (BaseViewAttacher.this.mHorizontalScrollEdge == 1 && f <= -1.0f))) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    return;
                } else {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
            }
            if (BaseViewAttacher.this.mVerticalScrollEdge == 2 || ((BaseViewAttacher.this.mVerticalScrollEdge == 0 && f2 >= 1.0f) || (BaseViewAttacher.this.mVerticalScrollEdge == 1 && f2 <= -1.0f))) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.common.support.imagepicker.preview.attacher.OnGestureListener
        public void onFling(float f, float f2, float f3, float f4) {
            BaseViewAttacher baseViewAttacher = BaseViewAttacher.this;
            baseViewAttacher.mCurrentFlingRunnable = baseViewAttacher.new FlingRunnable(baseViewAttacher.mView.getContext());
            FlingRunnable flingRunnable = BaseViewAttacher.this.mCurrentFlingRunnable;
            BaseViewAttacher baseViewAttacher2 = BaseViewAttacher.this;
            int viewWidth = baseViewAttacher2.getViewWidth(baseViewAttacher2.mView);
            BaseViewAttacher baseViewAttacher3 = BaseViewAttacher.this;
            flingRunnable.fling(viewWidth, baseViewAttacher3.getViewHeight(baseViewAttacher3.mView), (int) f3, (int) f4);
            BaseViewAttacher.this.mView.post(BaseViewAttacher.this.mCurrentFlingRunnable);
        }

        @Override // com.common.support.imagepicker.preview.attacher.OnGestureListener
        public void onScale(float f, float f2, float f3) {
            if (BaseViewAttacher.this.getScale() < BaseViewAttacher.this.mMaxScale || f < 1.0f) {
                if (BaseViewAttacher.this.mScaleChangeListener != null) {
                    BaseViewAttacher.this.mScaleChangeListener.onScaleChange(f, f2, f3);
                }
                BaseViewAttacher.this.mSuppMatrix.postScale(f, f, f2, f3);
                BaseViewAttacher.this.checkAndDisplayMatrix();
            }
        }
    };

    /* JADX INFO: renamed from: com.common.support.imagepicker.preview.attacher.BaseViewAttacher$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class AnimatedZoomRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime = System.currentTimeMillis();
        private final float mZoomEnd;
        private final float mZoomStart;

        public AnimatedZoomRunnable(float f, float f2, float f3, float f4) {
            this.mFocalX = f3;
            this.mFocalY = f4;
            this.mZoomStart = f;
            this.mZoomEnd = f2;
        }

        private float interpolate() {
            return BaseViewAttacher.this.mInterpolator.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.mStartTime) * 1.0f) / BaseViewAttacher.this.mZoomDuration));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fInterpolate = interpolate();
            float f = this.mZoomStart;
            BaseViewAttacher.this.onGestureListener.onScale(OooO0o.OooO00o(this.mZoomEnd, f, fInterpolate, f) / BaseViewAttacher.this.getScale(), this.mFocalX, this.mFocalY);
            if (fInterpolate < 1.0f) {
                BaseViewAttacher.this.mView.postDelayed(this, 16L);
            }
        }
    }

    public class FlingRunnable implements Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final OverScroller mScroller;

        public FlingRunnable(Context context) {
            this.mScroller = new OverScroller(context);
        }

        public void cancelFling() {
            this.mScroller.forceFinished(true);
        }

        public void fling(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF displayRect = BaseViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int iRound3 = Math.round(-displayRect.left);
            float f = i;
            if (f < displayRect.width()) {
                iRound = Math.round(displayRect.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-displayRect.top);
            float f2 = i2;
            if (f2 < displayRect.height()) {
                iRound2 = Math.round(displayRect.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.mCurrentX = iRound3;
            this.mCurrentY = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.mScroller.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                BaseViewAttacher.this.mSuppMatrix.postTranslate(this.mCurrentX - currX, this.mCurrentY - currY);
                BaseViewAttacher.this.checkAndDisplayMatrix();
                this.mCurrentX = currX;
                this.mCurrentY = currY;
                BaseViewAttacher.this.mView.postDelayed(this, 16L);
            }
        }
    }

    public BaseViewAttacher(View view) {
        this.mView = view;
        view.setOnTouchListener(this);
        view.addOnLayoutChangeListener(this);
        if (view.isInEditMode()) {
            return;
        }
        this.mBaseRotation = 0.0f;
        this.mScaleDragDetector = new CustomGestureDetector(view.getContext(), this.onGestureListener);
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.common.support.imagepicker.preview.attacher.BaseViewAttacher.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (BaseViewAttacher.this.mSingleFlingListener == null || BaseViewAttacher.this.getScale() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return BaseViewAttacher.this.mSingleFlingListener.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (BaseViewAttacher.this.mLongClickListener != null) {
                    BaseViewAttacher.this.mLongClickListener.onLongClick(BaseViewAttacher.this.mView);
                }
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.common.support.imagepicker.preview.attacher.BaseViewAttacher.3
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                try {
                    float scale = BaseViewAttacher.this.getScale();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (scale > 1.0f) {
                        BaseViewAttacher baseViewAttacher = BaseViewAttacher.this;
                        baseViewAttacher.setScale(baseViewAttacher.getMinimumScale(), x, y, true);
                    } else {
                        BaseViewAttacher baseViewAttacher2 = BaseViewAttacher.this;
                        baseViewAttacher2.setScale(baseViewAttacher2.getMediumScale(), x, y, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (BaseViewAttacher.this.mOnClickListener != null) {
                    BaseViewAttacher.this.mOnClickListener.onClick(BaseViewAttacher.this.mView);
                }
                RectF displayRect = BaseViewAttacher.this.getDisplayRect();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (BaseViewAttacher.this.mViewTapListener != null) {
                    BaseViewAttacher.this.mViewTapListener.onViewTap(BaseViewAttacher.this.mView, x, y);
                }
                if (displayRect == null) {
                    return false;
                }
                if (!displayRect.contains(x, y)) {
                    if (BaseViewAttacher.this.mOutsidePhotoTapListener == null) {
                        return false;
                    }
                    BaseViewAttacher.this.mOutsidePhotoTapListener.onOutsidePhotoTap(BaseViewAttacher.this.mView);
                    return false;
                }
                float fWidth = (x - displayRect.left) / displayRect.width();
                float fHeight = (y - displayRect.top) / displayRect.height();
                if (BaseViewAttacher.this.mPhotoTapListener == null) {
                    return true;
                }
                BaseViewAttacher.this.mPhotoTapListener.onPhotoTap(BaseViewAttacher.this.mView, fWidth, fHeight);
                return true;
            }
        });
    }

    private void cancelFling() {
        FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private boolean checkMatrixBounds() {
        float f;
        RectF displayRect = getDisplayRect(getDrawMatrix());
        if (displayRect == null) {
            return false;
        }
        float fHeight = displayRect.height();
        float fWidth = displayRect.width();
        float viewHeight = getViewHeight(this.mView);
        float f2 = 0.0f;
        if (fHeight <= viewHeight) {
            int i = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            f = ((viewHeight - fHeight) / DEFAULT_MID_SCALE) - displayRect.top;
            this.mVerticalScrollEdge = 2;
        } else {
            float f3 = displayRect.top;
            if (f3 > 0.0f) {
                this.mVerticalScrollEdge = 0;
                f = -f3;
            } else {
                float f4 = displayRect.bottom;
                if (f4 < viewHeight) {
                    this.mVerticalScrollEdge = 1;
                    f = viewHeight - f4;
                } else {
                    this.mVerticalScrollEdge = -1;
                    f = 0.0f;
                }
            }
        }
        float viewWidth = getViewWidth(this.mView);
        if (fWidth <= viewWidth) {
            int i2 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            f2 = ((viewWidth - fWidth) / DEFAULT_MID_SCALE) - displayRect.left;
            this.mHorizontalScrollEdge = 2;
        } else {
            float f5 = displayRect.left;
            if (f5 > 0.0f) {
                this.mHorizontalScrollEdge = 0;
                f2 = -f5;
            } else {
                float f6 = displayRect.right;
                if (f6 < viewWidth) {
                    f2 = viewWidth - f6;
                    this.mHorizontalScrollEdge = 1;
                } else {
                    this.mHorizontalScrollEdge = -1;
                }
            }
        }
        this.mSuppMatrix.postTranslate(f2, f);
        return true;
    }

    private void checkZoomLevels(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    private Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    private float getValue(Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getViewHeight(View view) {
        return (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getViewWidth(View view) {
        return (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    private boolean isSupportedScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }

    private void resetMatrix() {
        this.mSuppMatrix.reset();
        setRotationBy(this.mBaseRotation);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    private void setImageViewMatrix(Matrix matrix) {
        RectF displayRect;
        applyMatrix(matrix);
        if (this.mMatrixChangeListener == null || (displayRect = getDisplayRect(matrix)) == null) {
            return;
        }
        this.mMatrixChangeListener.onMatrixChanged(displayRect);
    }

    private void updateBaseMatrix() {
        float viewWidth = getViewWidth(this.mView);
        float viewHeight = getViewHeight(this.mView);
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        this.mBaseMatrix.reset();
        float f = contentWidth;
        float f2 = viewWidth / f;
        float f3 = contentHeight;
        float f4 = viewHeight / f3;
        ImageView.ScaleType scaleType = this.mScaleType;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.mBaseMatrix.postTranslate((viewWidth - f) / DEFAULT_MID_SCALE, (viewHeight - f3) / DEFAULT_MID_SCALE);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            this.mBaseMatrix.postScale(fMax, fMax);
            this.mBaseMatrix.postTranslate(o00Ooo.OooO00o(f, fMax, viewWidth, DEFAULT_MID_SCALE), (viewHeight - (f3 * fMax)) / DEFAULT_MID_SCALE);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            this.mBaseMatrix.postScale(fMin, fMin);
            this.mBaseMatrix.postTranslate(o00Ooo.OooO00o(f, fMin, viewWidth, DEFAULT_MID_SCALE), (viewHeight - (f3 * fMin)) / DEFAULT_MID_SCALE);
        } else if (scaleType == ImageView.ScaleType.FIT_START) {
            this.mBaseMatrix.postScale(f2, f2);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, viewWidth, viewHeight);
            if (((int) this.mBaseRotation) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i == 2) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 3) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    public abstract void applyMatrix(Matrix matrix);

    public abstract int getContentHeight();

    public abstract int getContentWidth();

    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public Matrix getImageMatrix() {
        return this.mDrawMatrix;
    }

    public float getMaximumScale() {
        return this.mMaxScale;
    }

    public float getMediumScale() {
        return this.mMidScale;
    }

    public float getMinimumScale() {
        return this.mMinScale;
    }

    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) Math.pow(getValue(this.mSuppMatrix, 3), 2.0d)));
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.mSuppMatrix);
    }

    @Deprecated
    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public boolean isZoomable() {
        return this.mZoomEnabled;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 - i4 <= 0 || i3 - i <= 0) {
            return;
        }
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        updateBaseMatrix();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        CustomGestureDetector customGestureDetector;
        boolean z2;
        GestureDetector gestureDetector;
        boolean zIsScaling;
        boolean zIsDragging;
        boolean z3;
        boolean z4;
        RectF displayRect;
        if (!this.mZoomEnabled || getContentWidth() <= 0 || getContentHeight() <= 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (getScale() < this.mMinScale) {
                    RectF displayRect2 = getDisplayRect();
                    if (displayRect2 != null) {
                        view.post(new AnimatedZoomRunnable(getScale(), this.mMinScale, displayRect2.centerX(), displayRect2.centerY()));
                        vibrateByTouchUp();
                        z = true;
                    }
                } else if (getScale() > this.mMidScale && (displayRect = getDisplayRect()) != null) {
                    view.post(new AnimatedZoomRunnable(getScale(), this.mMidScale, displayRect.centerX(), displayRect.centerY()));
                    vibrateByTouchUp();
                    z = true;
                }
            }
            customGestureDetector = this.mScaleDragDetector;
            if (customGestureDetector != null) {
                zIsScaling = customGestureDetector.isScaling();
                zIsDragging = this.mScaleDragDetector.isDragging();
                boolean zOnTouchEvent = this.mScaleDragDetector.onTouchEvent(motionEvent);
                if (!zIsScaling || this.mScaleDragDetector.isScaling()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!zIsDragging || this.mScaleDragDetector.isDragging()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.mBlockParentIntercept = (!z3 && z4) || motionEvent.getPointerCount() > 1;
                z2 = zOnTouchEvent;
            } else {
                z2 = z;
            }
            gestureDetector = this.mGestureDetector;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        cancelFling();
        z = false;
        customGestureDetector = this.mScaleDragDetector;
        if (customGestureDetector != null) {
            zIsScaling = customGestureDetector.isScaling();
            zIsDragging = this.mScaleDragDetector.isDragging();
            boolean zOnTouchEvent2 = this.mScaleDragDetector.onTouchEvent(motionEvent);
            if (zIsScaling) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (zIsDragging) {
                z4 = false;
            } else {
                z4 = false;
            }
            this.mBlockParentIntercept = (!z3 && z4) || motionEvent.getPointerCount() > 1;
            z2 = zOnTouchEvent2;
        } else {
            z2 = z;
        }
        gestureDetector = this.mGestureDetector;
        return gestureDetector == null ? z2 : z2;
    }

    public void reset() {
        resetMatrix();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.mAllowParentInterceptOnEdge = z;
    }

    public void setBaseRotation(float f) {
        this.mBaseRotation = f % 360.0f;
        update();
        setRotationBy(this.mBaseRotation);
        checkAndDisplayMatrix();
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        this.mSuppMatrix.set(matrix);
        checkAndDisplayMatrix();
        return true;
    }

    public void setMaximumScale(float f) {
        checkZoomLevels(this.mMinScale, this.mMidScale, f);
        this.mMaxScale = f;
    }

    public void setMediumScale(float f) {
        checkZoomLevels(this.mMinScale, f, this.mMaxScale);
        this.mMidScale = f;
    }

    public void setMinimumScale(float f) {
        checkZoomLevels(f, this.mMidScale, this.mMaxScale);
        this.mMinScale = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.mMatrixChangeListener = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.mOutsidePhotoTapListener = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.mScaleChangeListener = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.mSingleFlingListener = onSingleFlingListener;
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.mOnViewDragListener = onViewDragListener;
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    public void setRotationBy(float f) {
        this.mSuppMatrix.postRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setRotationTo(float f) {
        this.mSuppMatrix.setRotate(f % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setScale(float f) {
        setScale(f, false);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        checkZoomLevels(f, f2, f3);
        this.mMinScale = f;
        this.mMidScale = f2;
        this.mMaxScale = f3;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!isSupportedScaleType(scaleType) || scaleType == this.mScaleType) {
            return;
        }
        this.mScaleType = scaleType;
        update();
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setZoomTransitionDuration(int i) {
        this.mZoomDuration = i;
    }

    public void setZoomable(boolean z) {
        this.mZoomEnabled = z;
        update();
    }

    public void update() {
        if (this.mZoomEnabled) {
            updateBaseMatrix();
        } else {
            resetMatrix();
        }
    }

    public void vibrateByTouchUp() {
    }

    public void setScale(float f, boolean z) {
        setScale(f, this.mView.getRight() / DEFAULT_MID_SCALE, this.mView.getBottom() / DEFAULT_MID_SCALE, z);
    }

    public RectF getDisplayRect(Matrix matrix) {
        this.mDisplayRect.set(0.0f, 0.0f, getContentWidth(), getContentHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        if (f < this.mMinScale || f > this.mMaxScale) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.mView.post(new AnimatedZoomRunnable(getScale(), f, f2, f3));
        } else {
            this.mSuppMatrix.setScale(f, f, f2, f3);
            checkAndDisplayMatrix();
        }
    }
}
