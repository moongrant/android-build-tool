package o0OOOO0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f38204Oooo0o;

    public OooO00o(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f38204Oooo0o = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38204Oooo0o.f18091OooO0O0 = null;
    }
}
