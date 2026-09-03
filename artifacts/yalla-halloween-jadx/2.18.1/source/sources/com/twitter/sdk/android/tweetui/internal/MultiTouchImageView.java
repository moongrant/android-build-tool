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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class MultiTouchImageView extends ImageView implements com.twitter.sdk.android.tweetui.internal.OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final /* synthetic */ int f20151o000oOoO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Matrix f20152Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ScaleGestureDetector f20153Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final GestureDetector f20154Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Matrix f20155Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final float[] f20156OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final RectF f20157OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Matrix f20158OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final RectF f20159OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f20160OoooOO0;

    public class OooO00o extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public OooO00o() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            multiTouchImageView.f20158OoooO00.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            MultiTouchImageView.this.OooO0OO();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (MultiTouchImageView.this.getScale() < 1.0f) {
                MultiTouchImageView.this.f20158OoooO00.reset();
                MultiTouchImageView.this.OooO0OO();
            }
        }
    }

    public class OooO0O0 extends GestureDetector.SimpleOnGestureListener {
        public OooO0O0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (MultiTouchImageView.this.getScale() > 1.0f) {
                MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
                multiTouchImageView.OooO0O0(multiTouchImageView.getScale(), 1.0f, motionEvent.getX(), motionEvent.getY());
                return true;
            }
            MultiTouchImageView multiTouchImageView2 = MultiTouchImageView.this;
            multiTouchImageView2.OooO0O0(multiTouchImageView2.getScale(), 2.0f, motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            ViewParent parent;
            MultiTouchImageView.this.f20158OoooO00.postTranslate(-f, -f2);
            MultiTouchImageView.this.OooO0OO();
            MultiTouchImageView multiTouchImageView = MultiTouchImageView.this;
            if (!multiTouchImageView.f20160OoooOO0 || multiTouchImageView.f20153Oooo0o.isInProgress() || (parent = MultiTouchImageView.this.getParent()) == null) {
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
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOOo.o0000O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MultiTouchImageView multiTouchImageView = this.f40098Oooo0o;
                float f5 = f3;
                float f6 = f4;
                int i = MultiTouchImageView.f20151o000oOoO;
                Objects.requireNonNull(multiTouchImageView);
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() / multiTouchImageView.getScale();
                multiTouchImageView.f20158OoooO00.postScale(fFloatValue, fFloatValue, f5, f6);
                multiTouchImageView.OooO0OO();
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    public final void OooO0OO() {
        float f;
        float fHeight;
        float f2;
        float f3;
        float fWidth;
        float f4;
        Matrix drawMatrix = getDrawMatrix();
        Drawable drawable = getDrawable();
        float f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (drawable != null) {
            this.f20159OoooO0O.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawMatrix.mapRect(this.f20159OoooO0O);
        }
        RectF rectF = this.f20159OoooO0O;
        if (rectF.height() > this.f20157OoooO0.height()) {
            float f6 = rectF.top;
            if (f6 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f = -f6;
            } else if (rectF.bottom < this.f20157OoooO0.height()) {
                fHeight = this.f20157OoooO0.height();
                f2 = rectF.bottom;
            } else {
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (rectF.width() <= this.f20157OoooO0.width()) {
                f3 = rectF.left;
                if (f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    this.f20160OoooOO0 = true;
                    f5 = -f3;
                } else if (rectF.right < this.f20157OoooO0.width()) {
                    this.f20160OoooOO0 = true;
                    fWidth = this.f20157OoooO0.width();
                    f4 = rectF.right;
                } else {
                    this.f20160OoooOO0 = false;
                }
                this.f20158OoooO00.postTranslate(f5, f);
                setScaleType(ImageView.ScaleType.MATRIX);
                setImageMatrix(getDrawMatrix());
            }
            this.f20160OoooOO0 = true;
            fWidth = (this.f20157OoooO0.width() - rectF.width()) / 2.0f;
            f4 = rectF.left;
            f5 = fWidth - f4;
            this.f20158OoooO00.postTranslate(f5, f);
            setScaleType(ImageView.ScaleType.MATRIX);
            setImageMatrix(getDrawMatrix());
        }
        fHeight = (this.f20157OoooO0.height() - rectF.height()) / 2.0f;
        f2 = rectF.top;
        f = fHeight - f2;
        if (rectF.width() <= this.f20157OoooO0.width()) {
            f3 = rectF.left;
            if (f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f20160OoooOO0 = true;
                f5 = -f3;
            } else if (rectF.right < this.f20157OoooO0.width()) {
                this.f20160OoooOO0 = true;
                fWidth = this.f20157OoooO0.width();
                f4 = rectF.right;
            } else {
                this.f20160OoooOO0 = false;
            }
            this.f20158OoooO00.postTranslate(f5, f);
            setScaleType(ImageView.ScaleType.MATRIX);
            setImageMatrix(getDrawMatrix());
        }
        this.f20160OoooOO0 = true;
        fWidth = (this.f20157OoooO0.width() - rectF.width()) / 2.0f;
        f4 = rectF.left;
        f5 = fWidth - f4;
        this.f20158OoooO00.postTranslate(f5, f);
        setScaleType(ImageView.ScaleType.MATRIX);
        setImageMatrix(getDrawMatrix());
    }

    public Matrix getDrawMatrix() {
        this.f20155Oooo0oo.set(this.f20152Oooo);
        this.f20155Oooo0oo.postConcat(this.f20158OoooO00);
        return this.f20155Oooo0oo;
    }

    public float getScale() {
        this.f20158OoooO00.getValues(this.f20156OoooO);
        return this.f20156OoooO[0];
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() > 0) {
            this.f20157OoooO0.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            Drawable drawable2 = getDrawable();
            RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            this.f20152Oooo.reset();
            this.f20152Oooo.setRectToRect(rectF, this.f20157OoooO0, Matrix.ScaleToFit.CENTER);
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
        return (this.f20154Oooo0oO.onTouchEvent(motionEvent) || this.f20153Oooo0o.onTouchEvent(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20155Oooo0oo = new Matrix();
        this.f20152Oooo = new Matrix();
        this.f20158OoooO00 = new Matrix();
        this.f20157OoooO0 = new RectF();
        this.f20159OoooO0O = new RectF();
        this.f20156OoooO = new float[9];
        this.f20153Oooo0o = new ScaleGestureDetector(context, new OooO00o());
        this.f20154Oooo0oO = new GestureDetector(context, new OooO0O0());
    }
}
