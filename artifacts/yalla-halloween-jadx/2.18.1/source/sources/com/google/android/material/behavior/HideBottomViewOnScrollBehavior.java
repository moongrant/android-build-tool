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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p338o0OO0o0O.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f16515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f16516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ViewPropertyAnimator f16518OooO0Oo;

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16518OooO0Oo = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f16515OooO00o = 0;
        this.f16516OooO0O0 = 2;
        this.f16517OooO0OO = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f16515OooO00o = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void OooOOO0(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i2 > 0) {
            if (this.f16516OooO0O0 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f16518OooO0Oo;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f16516OooO0O0 = 1;
            OooOo00(v, this.f16515OooO00o + this.f16517OooO0OO, 175L, OooO0o.f37974OooO0OO);
            return;
        }
        if (i2 < 0) {
            if (this.f16516OooO0O0 == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f16518OooO0Oo;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f16516OooO0O0 = 2;
            OooOo00(v, 0, 225L, OooO0o.f37975OooO0Oo);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean OooOOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public final void OooOo00(@NonNull V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f16518OooO0Oo = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new OooO00o());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16515OooO00o = 0;
        this.f16516OooO0O0 = 2;
        this.f16517OooO0OO = 0;
    }
}
