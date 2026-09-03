package p417o0OoO0;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45441OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45442OooO0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2, Function1<? super Animator, Unit> function3, Function1<? super Animator, Unit> function4) {
        this.f45439OooO0Oo = function1;
        this.f45441OooO0o0 = function2;
        this.f45440OooO0o = function3;
        this.f45442OooO0oO = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45440OooO0o;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45441OooO0o0;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45442OooO0oO;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45439OooO0Oo;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }
}
