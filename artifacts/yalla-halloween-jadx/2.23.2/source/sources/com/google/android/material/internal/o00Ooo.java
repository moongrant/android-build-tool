package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Ooo extends Transition {

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TextView f16847OooO0Oo;

        public OooO00o(TextView textView) {
            this.f16847OooO0Oo = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f16847OooO0Oo;
            textView.setScaleX(fFloatValue);
            textView.setScaleY(fFloatValue);
        }
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull oOO00O.o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        if (view instanceof TextView) {
            o00oo0o2.f60157OooO00o.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oOO00O.o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        if (view instanceof TextView) {
            o00oo0o2.f60157OooO00o.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable oOO00O.o00oO0o o00oo0o2, @Nullable oOO00O.o00oO0o o00oo0o3) {
        if (o00oo0o2 == null || o00oo0o3 == null || !(o00oo0o2.f60158OooO0O0 instanceof TextView)) {
            return null;
        }
        View view = o00oo0o3.f60158OooO0O0;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = o00oo0o2.f60157OooO00o;
        HashMap map2 = o00oo0o3.f60157OooO00o;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new OooO00o(textView));
        return valueAnimatorOfFloat;
    }
}
