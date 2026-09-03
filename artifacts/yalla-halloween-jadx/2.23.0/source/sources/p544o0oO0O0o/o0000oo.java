package p544o0oO0O0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f55808OooO0Oo;

    public o0000oo(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f55808OooO0Oo = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f55808OooO0Oo.f18212OooO0O0 = null;
    }
}
