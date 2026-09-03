package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f5908OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f5909OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f5910OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5911OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.OooO00o f5912OooO0oo;

    public OooOOO(OooOO0O oooOO0O, View view, boolean z, SpecialEffectsController.Operation operation, OooOO0O.OooO00o oooO00o) {
        this.f5908OooO0Oo = oooOO0O;
        this.f5910OooO0o0 = view;
        this.f5909OooO0o = z;
        this.f5911OooO0oO = operation;
        this.f5912OooO0oo = oooO00o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f5908OooO0Oo.f5928OooO00o;
        View viewToAnimate = this.f5910OooO0o0;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z = this.f5909OooO0o;
        SpecialEffectsController.Operation operation = this.f5911OooO0oO;
        if (z) {
            SpecialEffectsController.Operation.State state = operation.f5934OooO00o;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            state.OooO00o(viewToAnimate);
        }
        this.f5912OooO0oo.OooO00o();
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has ended.");
        }
    }
}
