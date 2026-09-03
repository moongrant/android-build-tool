package p423o0OoO0OO;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46627OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46628OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46629OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46630OooO0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public o000000O(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2, Function1<? super Animator, Unit> function3, Function1<? super Animator, Unit> function4) {
        this.f46627OooO0Oo = function1;
        this.f46629OooO0o0 = function2;
        this.f46628OooO0o = function3;
        this.f46630OooO0oO = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f46628OooO0o;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f46629OooO0o0;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f46630OooO0oO;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f46627OooO0Oo;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }
}
