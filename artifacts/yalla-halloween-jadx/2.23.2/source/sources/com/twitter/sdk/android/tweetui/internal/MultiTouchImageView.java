package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.MultiTouchImageView;

/* JADX INFO: loaded from: classes2.dex */
public class MultiTouchImageView extends ImageView implements com.twitter.sdk.android.tweetui.internal.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f21873OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RectF f21874OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ScaleGestureDetector f21875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Matrix f21876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final GestureDetector f21877OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Matrix f21878OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Matrix f21879OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final RectF f21880OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float[] f21881OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f21882OooOO0o;

    public class OooO00o extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public OooO00o() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
            multiTouchImageView.f21879OooO0oo.postScale(scaleFactor, scaleFactor, focusX, focusY);
            multiTouchImageView.OooO0OO();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
            if (multiTouchImageView.getScale() < 1.0f) {
                multiTouchImageView.f21879OooO0oo.reset();
                multiTouchImageView.OooO0OO();
            }
        }
    }

    public class OooO0O0 extends GestureDetector.SimpleOnGestureListener {
        public OooO0O0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
            if (multiTouchImageView.getScale() > 1.0f) {
                multiTouchImageView.OooO0O0(multiTouchImageView.getScale(), 1.0f, motionEvent.getX(), motionEvent.getY());
                return true;
            }
            multiTouchImageView.OooO0O0(multiTouchImageView.getScale(), 2.0f, motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            ViewParent parent;
            MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
            multiTouchImageView.f21879OooO0oo.postTranslate(-f, -f2);
            multiTouchImageView.OooO0OO();
            if (!multiTouchImageView.f21882OooOO0o || multiTouchImageView.f21875OooO0Oo.isInProgress() || (parent = multiTouchImageView.getParent()) == null) {
                return true;
            }
            parent.requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    public MultiTouchImageView(Context context) {
        this(context, null);
    }

    @Override // com.twitter.sdk.android.tweetui.internal.OooO00o.OooO0O0
    public final boolean OooO00o() {
        return getScale() == 1.0f;
    }

    public final void OooO0O0(float f, float f2, final float f3, final float f4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OOOo00.OooOO0O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = MultiTouchImageView.f21873OooOOO0;
                MultiTouchImageView multiTouchImageView = this.f42885OooO0Oo;
                multiTouchImageView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() / multiTouchImageView.getScale();
                multiTouchImageView.f21879OooO0oo.postScale(fFloatValue, fFloatValue, f3, f4);
                multiTouchImageView.OooO0OO();
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    public final void OooO0OO() {
        float f;
        float fHeight;
        float f2;
        float f3;
        float fWidth;
        float f4;
        Matrix drawMatrix = getDrawMatrix();
        Drawable drawable = getDrawable();
        RectF rectF = this.f21880OooOO0;
        float f5 = 0.0f;
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawMatrix.mapRect(rectF);
        }
        float fHeight2 = rectF.height();
        RectF rectF2 = this.f21874OooO;
        if (fHeight2 > rectF2.height()) {
            float f6 = rectF.top;
            if (f6 > 0.0f) {
                f = -f6;
            } else if (rectF.bottom < rectF2.height()) {
                fHeight = rectF2.height();
                f2 = rectF.bottom;
            } else {
                f = 0.0f;
            }
            if (rectF.width() <= rectF2.width()) {
                f3 = rectF.left;
                if (f3 > 0.0f) {
                    this.f21882OooOO0o = true;
                    f5 = -f3;
                } else if (rectF.right < rectF2.width()) {
                    this.f21882OooOO0o = true;
                    fWidth = rectF2.width();
                    f4 = rectF.right;
                } else {
                    this.f21882OooOO0o = false;
                }
                this.f21879OooO0oo.postTranslate(f5, f);
                setScaleType(ImageView.ScaleType.MATRIX);
                setImageMatrix(getDrawMatrix());
            }
            this.f21882OooOO0o = true;
            fWidth = (rectF2.width() - rectF.width()) / 2.0f;
            f4 = rectF.left;
            f5 = fWidth - f4;
            this.f21879OooO0oo.postTranslate(f5, f);
            setScaleType(ImageView.ScaleType.MATRIX);
            setImageMatrix(getDrawMatrix());
        }
        fHeight = (rectF2.height() - rectF.height()) / 2.0f;
        f2 = rectF.top;
        f = fHeight - f2;
        if (rectF.width() <= rectF2.width()) {
            f3 = rectF.left;
            if (f3 > 0.0f) {
                this.f21882OooOO0o = true;
                f5 = -f3;
            } else if (rectF.right < rectF2.width()) {
                this.f21882OooOO0o = true;
                fWidth = rectF2.width();
                f4 = rectF.right;
            } else {
                this.f21882OooOO0o = false;
            }
            this.f21879OooO0oo.postTranslate(f5, f);
            setScaleType(ImageView.ScaleType.MATRIX);
            setImageMatrix(getDrawMatrix());
        }
        this.f21882OooOO0o = true;
        fWidth = (rectF2.width() - rectF.width()) / 2.0f;
        f4 = rectF.left;
        f5 = fWidth - f4;
        this.f21879OooO0oo.postTranslate(f5, f);
        setScaleType(ImageView.ScaleType.MATRIX);
        setImageMatrix(getDrawMatrix());
    }

    public Matrix getDrawMatrix() {
        Matrix matrix = this.f21876OooO0o;
        matrix.set(this.f21878OooO0oO);
        matrix.postConcat(this.f21879OooO0oo);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.f21879OooO0oo;
        float[] fArr = this.f21881OooOO0O;
        matrix.getValues(fArr);
        return fArr[0];
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() > 0) {
            RectF rectF = this.f21874OooO;
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            Drawable drawable2 = getDrawable();
            RectF rectF2 = new RectF(0.0f, 0.0f, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            Matrix matrix = this.f21878OooO0oO;
            matrix.reset();
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
            OooO0OO();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable = getDrawable();
        if (!(drawable != null && drawable.getIntrinsicWidth() > 0)) {
            return false;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return (this.f21877OooO0o0.onTouchEvent(motionEvent) || this.f21875OooO0Oo.onTouchEvent(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21876OooO0o = new Matrix();
        this.f21878OooO0oO = new Matrix();
        this.f21879OooO0oo = new Matrix();
        this.f21874OooO = new RectF();
        this.f21880OooOO0 = new RectF();
        this.f21881OooOO0O = new float[9];
        this.f21875OooO0Oo = new ScaleGestureDetector(context, new OooO00o());
        this.f21877OooO0o0 = new GestureDetector(context, new OooO0O0());
    }
}
