package p558o0oOOooo;

import android.view.animation.Animation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O00 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0O0 f56220OooO00o;

    public oO0O0O00(oO0O0 oo0o0) {
        this.f56220OooO00o = oo0o0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        oO0O0 oo0o0 = this.f56220OooO00o;
        if (oo0o0.f56187OooO0O0.getBgAnimationUiIs()) {
            return;
        }
        oO0O0.OooO00o(oo0o0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<? super Boolean, Unit> function1 = this.f56220OooO00o.f56188OooO0OO;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }
}
