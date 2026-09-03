package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5923OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f5924OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f5925OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O.OooO00o f5926OooO0Oo;

    public OooOo00(View view, OooOO0O.OooO00o oooO00o, OooOO0O oooOO0O, SpecialEffectsController.Operation operation) {
        this.f5923OooO00o = operation;
        this.f5924OooO0O0 = oooOO0O;
        this.f5925OooO0OO = view;
        this.f5926OooO0Oo = oooO00o;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        final OooOO0O oooOO0O = this.f5924OooO0O0;
        ViewGroup viewGroup = oooOO0O.f5928OooO00o;
        final View view = this.f5925OooO0OO;
        final OooOO0O.OooO00o oooO00o = this.f5926OooO0Oo;
        viewGroup.post(new Runnable() { // from class: androidx.fragment.app.OooOOOO
            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O this$0 = oooOO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOO0O.OooO00o animationInfo = oooO00o;
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$0.f5928OooO00o.endViewTransition(view);
                animationInfo.OooO00o();
            }
        });
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5923OooO00o + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5923OooO00o + " has reached onAnimationStart.");
        }
    }
}
