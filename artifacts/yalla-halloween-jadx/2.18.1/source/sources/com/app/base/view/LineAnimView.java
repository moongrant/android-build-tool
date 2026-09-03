package com.app.base.view;

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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public class LineAnimView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12051Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f12052Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12053Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public double f12054Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f12055OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Paint f12056OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f12057OoooO0O;

    public LineAnimView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        objectAnimatorOfFloat.setDuration((int) (((double) this.f12053Oooo0oO) * this.f12054Oooo0oo));
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        objectAnimatorOfFloat2.setDuration((int) ((1.0d - this.f12054Oooo0oo) * ((double) this.f12053Oooo0oO)));
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(this);
        animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
        setAlpha(1.0f);
        animatorSet.start();
    }

    public int getColor() {
        return this.f12051Oooo;
    }

    public int getDuration() {
        return this.f12053Oooo0oO;
    }

    public float getProgress() {
        return this.f12052Oooo0o;
    }

    public double getRatio() {
        return this.f12054Oooo0oo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12056OoooO00.setColor(this.f12051Oooo);
        if (1 == getLayoutDirection()) {
            this.f12055OoooO0 = getWidth();
            this.f12057OoooO0O = (float) (((double) getWidth()) - ((((double) this.f12052Oooo0o) / this.f12054Oooo0oo) * ((double) getWidth())));
        } else {
            this.f12055OoooO0 = 0;
            this.f12057OoooO0O = (float) ((((double) this.f12052Oooo0o) / this.f12054Oooo0oo) * ((double) getWidth()));
        }
        canvas.drawRect(this.f12055OoooO0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f12057OoooO0O, getHeight(), this.f12056OoooO00);
    }

    public void setColor(int i) {
        this.f12051Oooo = i;
    }

    public void setDuration(int i) {
        this.f12053Oooo0oO = i;
    }

    public void setProgress(float f) {
        this.f12052Oooo0o = f;
        invalidate();
    }

    public void setRatio(double d) {
        this.f12054Oooo0oo = d;
    }

    public LineAnimView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineAnimView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12052Oooo0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f12053Oooo0oO = 800;
        this.f12054Oooo0oo = 0.9d;
        this.f12051Oooo = -16777216;
        Paint paint = new Paint(1);
        this.f12056OoooO00 = paint;
        paint.setColor(this.f12051Oooo);
        this.f12056OoooO00.setStrokeWidth(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f12056OoooO00.setStrokeCap(Paint.Cap.ROUND);
        this.f12056OoooO00.setStyle(Paint.Style.FILL);
    }
}
