package p322o0O0oo0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f42038OooO0Oo;

    public o00000OO(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f42038OooO0Oo = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f42038OooO0Oo.f17736OooO0O0 = null;
    }
}
