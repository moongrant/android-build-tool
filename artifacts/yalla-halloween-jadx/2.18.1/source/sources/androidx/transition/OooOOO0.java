package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p101o000oOoo.oO000OOo;
import p101o000oOoo.oO00O0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    public static class OooO00o extends AnimatorListenerAdapter implements Transition.OooO0o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int f9535Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final View f9536Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final View f9537Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f9538Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final float f9539OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public float f9540OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int[] f9541OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public float f9542OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final float f9543OoooOO0;

        public OooO00o(View view, View view2, int i, int i2, float f, float f2) {
            this.f9537Oooo0oO = view;
            this.f9536Oooo0o = view2;
            this.f9538Oooo0oo = i - Math.round(view.getTranslationX());
            this.f9535Oooo = i2 - Math.round(view.getTranslationY());
            this.f9539OoooO = f;
            this.f9543OoooOO0 = f2;
            int i3 = oO000OOo.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f9541OoooO00 = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO00o() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0O0(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            this.f9537Oooo0oO.setTranslationX(this.f9539OoooO);
            this.f9537Oooo0oO.setTranslationY(this.f9543OoooOO0);
            transition.OooOoO(this);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.f9541OoooO00 == null) {
                this.f9541OoooO00 = new int[2];
            }
            this.f9541OoooO00[0] = Math.round(this.f9537Oooo0oO.getTranslationX() + this.f9538Oooo0oo);
            this.f9541OoooO00[1] = Math.round(this.f9537Oooo0oO.getTranslationY() + this.f9535Oooo);
            this.f9536Oooo0o.setTag(oO000OOo.transition_position, this.f9541OoooO00);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f9540OoooO0 = this.f9537Oooo0oO.getTranslationX();
            this.f9542OoooO0O = this.f9537Oooo0oO.getTranslationY();
            this.f9537Oooo0oO.setTranslationX(this.f9539OoooO);
            this.f9537Oooo0oO.setTranslationY(this.f9543OoooOO0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            this.f9537Oooo0oO.setTranslationX(this.f9540OoooO0);
            this.f9537Oooo0oO.setTranslationY(this.f9542OoooO0O);
        }
    }

    @Nullable
    public static Animator OooO00o(@NonNull View view, @NonNull oO00O0o oo00o0o, int i, int i2, float f, float f2, float f3, float f4, @Nullable TimeInterpolator timeInterpolator, @NonNull Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) oo00o0o.f29743OooO0O0.getTag(oO000OOo.transition_position);
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
        OooO00o oooO00o = new OooO00o(view, oo00o0o.f29743OooO0O0, iRound, iRound2, translationX, translationY);
        transition.OooO0OO(oooO00o);
        objectAnimatorOfPropertyValuesHolder.addListener(oooO00o);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(oooO00o);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
