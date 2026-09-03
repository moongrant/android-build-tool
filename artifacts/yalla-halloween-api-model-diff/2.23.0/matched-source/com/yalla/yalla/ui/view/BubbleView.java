package com.yalla.yalla.ui.view;

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
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p427o0OoOO00.OooOo;
import p539o0o0OoOO.j0;
import p539o0o0OoOO.k0;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public class BubbleView extends RelativeLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f30363OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f30364OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30365OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f30366OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30367OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f30368OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f30369OooOO0;

    public class OooO00o implements TypeEvaluator<float[]> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float[] f30370OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f30371OooO0O0;

        public OooO00o(float[] fArr, float[] fArr2) {
            this.f30370OooO00o = new float[2];
            this.f30371OooO0O0 = new float[2];
            this.f30370OooO00o = fArr;
            this.f30371OooO0O0 = fArr2;
        }

        @Override // android.animation.TypeEvaluator
        public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
            float[] fArr3 = fArr;
            float[] fArr4 = fArr2;
            float f2 = 1.0f - f;
            float f3 = fArr3[0] * f2 * f2 * f2;
            float[] fArr5 = this.f30370OooO00o;
            float f4 = (fArr5[0] * 3.0f * f * f2 * f2) + f3;
            float[] fArr6 = this.f30371OooO0O0;
            return new float[]{(fArr4[0] * f * f * f) + (fArr6[0] * 3.0f * f2 * f * f) + f4, (fArr4[1] * f * f * f) + (fArr6[1] * 3.0f * f2 * f * f) + (fArr5[1] * 3.0f * f * f2 * f2) + (fArr3[1] * f2 * f2 * f2)};
        }
    }

    public BubbleView(Context context) {
        super(context);
        this.f30364OooO0Oo = OooO0O0();
        int iOooO0O0 = OooO0O0();
        this.f30366OooO0o0 = iOooO0O0;
        this.f30365OooO0o = 2600;
        this.f30367OooO0oO = iOooO0O0 / 2;
        this.f30369OooOO0 = 80;
    }

    public final void OooO00o() {
        int i = this.f30368OooO0oo - this.f30369OooOO0;
        int i2 = this.f30363OooO;
        oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
        Context context = getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = oOOOOo0O.f56684OooO0O0;
        if (arrayList.isEmpty()) {
            int i3 = oOOOOo0O.OooO0O0.$EnumSwitchMapping$0[OooOo.OooO00o(OooOo.f45669OooO00o.getValue()).ordinal()];
            if (i3 == 1) {
                int i4 = oOo00OO0.icon_room_love_1;
                Object obj = ContextCompat.f5271OooO00o;
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, i4));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oOo00OO0.icon_room_love_2));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oOo00OO0.icon_room_love_3));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oOo00OO0.icon_room_love_4));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oOo00OO0.icon_room_love_5));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oOo00OO0.icon_room_love_6));
            } else if (i3 == 2) {
                int i5 = oO00OOO.icon_room_love_1_ramdan;
                Object obj2 = ContextCompat.f5271OooO00o;
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, i5));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_2_ramdan));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_3_ramdan));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_4_ramdan));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_5_ramdan));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_6_ramdan));
            } else if (i3 == 3) {
                int i6 = oO00OOO.icon_room_love_1_seven_year;
                Object obj3 = ContextCompat.f5271OooO00o;
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, i6));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_2_seven_year));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_3_seven_year));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_4_seven_year));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_5_seven_year));
                arrayList.add(ContextCompat.OooO0OO.OooO0O0(context, oO00OOO.icon_room_love_6_seven_year));
            }
        }
        int i7 = i2 - this.f30367OooO0oO;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f30364OooO0Oo, this.f30366OooO0o0);
        int iRandom = (int) (Math.random() * ((double) arrayList.size()));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable((Drawable) arrayList.get(iRandom));
        addView(imageView, layoutParams);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        long j = this.f30365OooO0o;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.0f, 0.6f);
        objectAnimatorOfFloat2.setDuration(1000L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.0f, 0.6f);
        objectAnimatorOfFloat3.setDuration(1000L);
        float f = i7;
        double d = i;
        double d2 = i7;
        float[] fArr = {((float) (d * 0.1d)) + ((float) (Math.random() * d * 0.5d)), (float) (d2 - ((Math.random() * d2) * 0.5d))};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new OooO00o(fArr, new float[]{(float) (Math.random() * d), (float) (((double) (f - fArr[1])) * Math.random())}), new float[]{i / 2, f}, new float[]{(float) (d * Math.random()), 0.0f});
        valueAnimatorOfObject.setDuration(j);
        valueAnimatorOfObject.addUpdateListener(new j0(imageView));
        valueAnimatorOfObject.addListener(new k0(this, imageView));
        valueAnimatorOfObject.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfObject).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.start();
    }

    public final int OooO0O0() {
        return (int) ((40 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30368OooO0oo = getMeasuredWidth();
        this.f30363OooO = getMeasuredHeight();
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30364OooO0Oo = OooO0O0();
        int iOooO0O0 = OooO0O0();
        this.f30366OooO0o0 = iOooO0O0;
        this.f30365OooO0o = 2600;
        this.f30367OooO0oO = iOooO0O0 / 2;
        this.f30369OooOO0 = 80;
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30364OooO0Oo = OooO0O0();
        int iOooO0O0 = OooO0O0();
        this.f30366OooO0o0 = iOooO0O0;
        this.f30365OooO0o = 2600;
        this.f30367OooO0oO = iOooO0O0 / 2;
        this.f30369OooOO0 = 80;
    }
}
