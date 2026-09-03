package com.yalla.yalla.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes4.dex */
public class LineAnimView extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f29937OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f29938OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f29939OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f29940OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f29941OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Paint f29942OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f29943OooOO0;

    public LineAnimView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration((int) (((double) this.f29940OooO0o0) * this.f29939OooO0o));
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration((int) ((1.0d - this.f29939OooO0o) * ((double) this.f29940OooO0o0)));
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(this);
        animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
        setAlpha(1.0f);
        animatorSet.start();
    }

    public int getColor() {
        return this.f29941OooO0oO;
    }

    public int getDuration() {
        return this.f29940OooO0o0;
    }

    public float getProgress() {
        return this.f29938OooO0Oo;
    }

    public double getRatio() {
        return this.f29939OooO0o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f29942OooO0oo.setColor(this.f29941OooO0oO);
        if (1 == getLayoutDirection()) {
            this.f29937OooO = getWidth();
            this.f29943OooOO0 = (float) (((double) getWidth()) - ((((double) this.f29938OooO0Oo) / this.f29939OooO0o) * ((double) getWidth())));
        } else {
            this.f29937OooO = 0;
            this.f29943OooOO0 = (float) ((((double) this.f29938OooO0Oo) / this.f29939OooO0o) * ((double) getWidth()));
        }
        canvas.drawRect(this.f29937OooO, 0.0f, this.f29943OooOO0, getHeight(), this.f29942OooO0oo);
    }

    public void setColor(int i) {
        this.f29941OooO0oO = i;
    }

    public void setDuration(int i) {
        this.f29940OooO0o0 = i;
    }

    public void setProgress(float f) {
        this.f29938OooO0Oo = f;
        invalidate();
    }

    public void setRatio(double d) {
        this.f29939OooO0o = d;
    }

    public LineAnimView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineAnimView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29938OooO0Oo = 0.0f;
        this.f29940OooO0o0 = LogSeverity.EMERGENCY_VALUE;
        this.f29939OooO0o = 0.9d;
        this.f29941OooO0oO = -16777216;
        Paint paint = new Paint(1);
        this.f29942OooO0oo = paint;
        paint.setColor(this.f29941OooO0oO);
        this.f29942OooO0oo.setStrokeWidth(0.0f);
        this.f29942OooO0oo.setStrokeCap(Paint.Cap.ROUND);
        this.f29942OooO0oo.setStyle(Paint.Style.FILL);
    }
}
