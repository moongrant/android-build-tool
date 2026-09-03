package com.app.base.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p175o00OooOo.o0O00o00;
import p175o00OooOo.o0O00oO0;

/* JADX INFO: loaded from: classes.dex */
public class BubbleView extends RelativeLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f11934Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<Drawable> f11935Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f11936Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f11937Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f11938OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f11939OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f11940OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f11941OoooO0O;

    public class OooO00o implements TypeEvaluator<float[]> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float[] f11942OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float[] f11943OooO0O0;

        public OooO00o(float[] fArr, float[] fArr2) {
            this.f11942OooO00o = fArr;
            this.f11943OooO0O0 = fArr2;
        }

        @Override // android.animation.TypeEvaluator
        public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
            float[] fArr3 = fArr;
            float[] fArr4 = fArr2;
            float f2 = 1.0f - f;
            float f3 = fArr3[0] * f2 * f2 * f2;
            float[] fArr5 = this.f11942OooO00o;
            float f4 = (fArr5[0] * 3.0f * f * f2 * f2) + f3;
            float[] fArr6 = this.f11943OooO0O0;
            return new float[]{(fArr4[0] * f * f * f) + (fArr6[0] * 3.0f * f2 * f * f) + f4, (fArr4[1] * f * f * f) + (fArr6[1] * 3.0f * f2 * f * f) + (fArr5[1] * 3.0f * f * f2 * f2) + (fArr3[1] * f2 * f2 * f2)};
        }
    }

    public BubbleView(Context context) {
        super(context);
        this.f11935Oooo0o = new ArrayList();
        this.f11936Oooo0oO = OooO0O0();
        int iOooO0O0 = OooO0O0();
        this.f11937Oooo0oo = iOooO0O0;
        this.f11934Oooo = 2600;
        this.f11940OoooO00 = iOooO0O0 / 2;
        this.f11938OoooO = 80;
        OooO0OO(context);
    }

    public final void OooO00o() {
        int i = this.f11939OoooO0 - this.f11938OoooO;
        int i2 = this.f11941OoooO0O - this.f11940OoooO00;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f11936Oooo0oO, this.f11937Oooo0oo);
        int iRandom = (int) (Math.random() * ((double) this.f11935Oooo0o.size()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f11935Oooo0o.get(iRandom));
        addView(imageView, layoutParams);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        objectAnimatorOfFloat.setDuration(this.f11934Oooo);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.6f);
        objectAnimatorOfFloat2.setDuration(1000L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleY", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.6f);
        objectAnimatorOfFloat3.setDuration(1000L);
        float f = i2;
        float[] fArr = {i / 2, f};
        double d = i;
        double d2 = i2;
        float[] fArr2 = {((float) (d * 0.1d)) + ((float) (Math.random() * d * 0.5d)), (float) (d2 - ((Math.random() * d2) * 0.5d))};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new OooO00o(fArr2, new float[]{(float) (Math.random() * d), (float) (((double) (f - fArr2[1])) * Math.random())}), fArr, new float[]{(float) (Math.random() * d), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE});
        valueAnimatorOfObject.setDuration(this.f11934Oooo);
        valueAnimatorOfObject.addUpdateListener(new o0O00o00(imageView));
        valueAnimatorOfObject.addListener(new o0O00oO0(this, imageView));
        valueAnimatorOfObject.setDuration(this.f11934Oooo);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfObject).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.start();
    }

    public final int OooO0O0() {
        return (int) ((40 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void OooO0OO(Context context) {
        ArrayList arrayList = new ArrayList();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        Drawable drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, R.drawable.icon_room_love_1);
        Drawable drawableOooO0O1 = o000O000.OooO00o.OooO0OO.OooO0O0(context, R.drawable.icon_room_love_2);
        Drawable drawableOooO0O2 = o000O000.OooO00o.OooO0OO.OooO0O0(context, R.drawable.icon_room_love_3);
        Drawable drawableOooO0O3 = o000O000.OooO00o.OooO0OO.OooO0O0(context, R.drawable.icon_room_love_4);
        Drawable drawableOooO0O4 = o000O000.OooO00o.OooO0OO.OooO0O0(context, R.drawable.icon_room_love_5);
        Drawable drawableOooO0O5 = o000O000.OooO00o.OooO0OO.OooO0O0(context, R.drawable.icon_room_love_6);
        arrayList.add(drawableOooO0O0);
        arrayList.add(drawableOooO0O1);
        arrayList.add(drawableOooO0O2);
        arrayList.add(drawableOooO0O3);
        arrayList.add(drawableOooO0O4);
        arrayList.add(drawableOooO0O5);
        this.f11935Oooo0o = arrayList;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f11939OoooO0 = getMeasuredWidth();
        this.f11941OoooO0O = getMeasuredHeight();
    }

    public void setMaxHeartNum(int i) {
    }

    public void setMinHeartNum(int i) {
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11935Oooo0o = new ArrayList();
        this.f11936Oooo0oO = OooO0O0();
        int iOooO0O0 = OooO0O0();
        this.f11937Oooo0oo = iOooO0O0;
        this.f11934Oooo = 2600;
        this.f11940OoooO00 = iOooO0O0 / 2;
        this.f11938OoooO = 80;
        OooO0OO(context);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11935Oooo0o = new ArrayList();
        this.f11936Oooo0oO = OooO0O0();
        int iOooO0O0 = OooO0O0();
        this.f11937Oooo0oo = iOooO0O0;
        this.f11934Oooo = 2600;
        this.f11940OoooO00 = iOooO0O0 / 2;
        this.f11938OoooO = 80;
        OooO0OO(context);
    }
}
