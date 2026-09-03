package p552o0oOOoOo;

import android.view.animation.Animation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO0o implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f55968OooO00o;

    public o0OO0o(o0OO0o00 o0oo0o01) {
        this.f55968OooO00o = o0oo0o01;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        o0OO0o00 o0oo0o01 = this.f55968OooO00o;
        if (o0oo0o01.f55971OooO0O0.getBgAnimationUiIs()) {
            return;
        }
        o0OO0o00.OooO00o(o0oo0o01);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<? super Boolean, Unit> function1 = this.f55968OooO00o.f55972OooO0OO;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }
}
