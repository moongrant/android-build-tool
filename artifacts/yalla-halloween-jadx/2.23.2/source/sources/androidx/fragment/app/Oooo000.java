package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOOO f5943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f5944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO.OooO00o f5945OooO0Oo;

    public Oooo000(View view, OooOOO.OooO00o oooO00o, OooOOO oooOOO, SpecialEffectsController.Operation operation) {
        this.f5942OooO00o = operation;
        this.f5943OooO0O0 = oooOOO;
        this.f5944OooO0OO = view;
        this.f5945OooO0Oo = oooO00o;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        final OooOOO oooOOO = this.f5943OooO0O0;
        ViewGroup viewGroup = oooOOO.f5946OooO00o;
        final View view = this.f5944OooO0OO;
        final OooOOO.OooO00o oooO00o = this.f5945OooO0Oo;
        viewGroup.post(new Runnable() { // from class: androidx.fragment.app.OooOo
            @Override // java.lang.Runnable
            public final void run() {
                OooOOO this$0 = oooOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOOO.OooO00o animationInfo = oooO00o;
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$0.f5946OooO00o.endViewTransition(view);
                animationInfo.OooO00o();
            }
        });
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5942OooO00o + " has ended.");
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
            Log.v("FragmentManager", "Animation from operation " + this.f5942OooO00o + " has reached onAnimationStart.");
        }
    }
}
