package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import oOO00O.OooOo;
import oOO00O.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {

    public static class OooO00o extends AnimatorListenerAdapter implements Transition.OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f11273OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f11274OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f11275OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f11276OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f11277OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int[] f11278OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f11279OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final float f11280OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final float f11281OooOO0o;

        public OooO00o(View view, View view2, int i, int i2, float f, float f2) {
            this.f11276OooO0o0 = view;
            this.f11274OooO0Oo = view2;
            this.f11275OooO0o = i - Math.round(view.getTranslationX());
            this.f11277OooO0oO = i2 - Math.round(view.getTranslationY());
            this.f11280OooOO0O = f;
            this.f11281OooOO0o = f2;
            int i3 = OooOo.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f11278OooO0oo = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO00o() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0O0() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            View view = this.f11276OooO0o0;
            view.setTranslationX(this.f11280OooOO0O);
            view.setTranslationY(this.f11281OooOO0o);
            transition.OooOo(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.f11278OooO0oo == null) {
                this.f11278OooO0oo = new int[2];
            }
            int[] iArr = this.f11278OooO0oo;
            float f = this.f11275OooO0o;
            View view = this.f11276OooO0o0;
            iArr[0] = Math.round(view.getTranslationX() + f);
            this.f11278OooO0oo[1] = Math.round(view.getTranslationY() + this.f11277OooO0oO);
            this.f11274OooO0Oo.setTag(OooOo.transition_position, this.f11278OooO0oo);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            View view = this.f11276OooO0o0;
            this.f11273OooO = view.getTranslationX();
            this.f11279OooOO0 = view.getTranslationY();
            view.setTranslationX(this.f11280OooOO0O);
            view.setTranslationY(this.f11281OooOO0o);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            float f = this.f11273OooO;
            View view = this.f11276OooO0o0;
            view.setTranslationX(f);
            view.setTranslationY(this.f11279OooOO0);
        }
    }

    @Nullable
    public static ObjectAnimator OooO00o(@NonNull View view, @NonNull o00oO0o o00oo0o2, int i, int i2, float f, float f2, float f3, float f4, @Nullable BaseInterpolator baseInterpolator, @NonNull Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o00oo0o2.f60158OooO0O0.getTag(OooOo.transition_position);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int iRound = Math.round(f5 - translationX) + i;
        int iRound2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        OooO00o oooO00o = new OooO00o(view, o00oo0o2.f60158OooO0O0, iRound, iRound2, translationX, translationY);
        transition.OooO0O0(oooO00o);
        objectAnimatorOfPropertyValuesHolder.addListener(oooO00o);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(oooO00o);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
