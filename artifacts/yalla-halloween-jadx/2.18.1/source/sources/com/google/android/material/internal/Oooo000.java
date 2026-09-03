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
import p101o000oOoo.oO00O0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo000 extends Transition {

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ TextView f17347Oooo0o;

        public OooO00o(TextView textView) {
            this.f17347Oooo0o = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f17347Oooo0o.setScaleX(fFloatValue);
            this.f17347Oooo0o.setScaleY(fFloatValue);
        }
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.HashMap, java.util.Map, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        if (oo00o0o == null || oo00o0o2 == null || !(oo00o0o.f29743OooO0O0 instanceof TextView)) {
            return null;
        }
        View view = oo00o0o2.f29743OooO0O0;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        ?? r6 = oo00o0o.f29742OooO00o;
        ?? r7 = oo00o0o2.f29742OooO00o;
        float fFloatValue = r6.get("android:textscale:scale") != null ? ((Float) r6.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = r7.get("android:textscale:scale") != null ? ((Float) r7.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new OooO00o(textView));
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(@NonNull oO00O0o oo00o0o) {
        View view = oo00o0o.f29743OooO0O0;
        if (view instanceof TextView) {
            oo00o0o.f29742OooO00o.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }
}
