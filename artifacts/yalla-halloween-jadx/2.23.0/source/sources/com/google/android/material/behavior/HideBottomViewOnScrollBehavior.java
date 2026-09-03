package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p064o0000oO0.OooOO0O;
import p270o0O0000o.o00000;

/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int f16336OooOO0 = o00000.motionDurationLong2;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int f16337OooOO0O = o00000.motionDurationMedium4;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int f16338OooOO0o = o00000.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public ViewPropertyAnimator f16339OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OooO0O0> f16340OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f16341OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16342OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TimeInterpolator f16343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16344OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TimeInterpolator f16345OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @ScrollState
    public int f16346OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f16347OooO0oo;

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16339OooO = null;
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f16340OooO00o = new LinkedHashSet<>();
        this.f16344OooO0o = 0;
        this.f16346OooO0oO = 2;
        this.f16347OooO0oo = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f16344OooO0o = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f16341OooO0O0 = o0O00OO.OooO00o.OooO0OO(f16336OooOO0, v.getContext(), 225);
        this.f16342OooO0OO = o0O00OO.OooO00o.OooO0OO(f16337OooOO0O, v.getContext(), 175);
        Context context = v.getContext();
        OooOO0O oooOO0O = o0O000.OooO0O0.f41574OooO0Oo;
        int i2 = f16338OooOO0o;
        this.f16343OooO0Oo = o0O00OO.OooO00o.OooO0Oo(context, i2, oooOO0O);
        this.f16345OooO0o0 = o0O00OO.OooO00o.OooO0Oo(v.getContext(), i2, o0O000.OooO0O0.f41573OooO0OO);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOO0(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        LinkedHashSet<OooO0O0> linkedHashSet = this.f16340OooO00o;
        if (i2 > 0) {
            if (this.f16346OooO0oO == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f16339OooO;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f16346OooO0oO = 1;
            Iterator<OooO0O0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
            OooOo00(v, this.f16344OooO0o + this.f16347OooO0oo, this.f16342OooO0OO, this.f16345OooO0o0);
            return;
        }
        if (i2 < 0) {
            if (this.f16346OooO0oO == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f16339OooO;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f16346OooO0oO = 2;
            Iterator<OooO0O0> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().OooO00o();
            }
            OooOo00(v, 0, this.f16341OooO0O0, this.f16343OooO0Oo);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public final void OooOo00(@NonNull V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f16339OooO = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new OooO00o());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16340OooO00o = new LinkedHashSet<>();
        this.f16344OooO0o = 0;
        this.f16346OooO0oO = 2;
        this.f16347OooO0oo = 0;
    }
}
