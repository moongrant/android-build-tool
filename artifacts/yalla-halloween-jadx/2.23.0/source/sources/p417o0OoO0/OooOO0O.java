package p417o0OoO0;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45435OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45436OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45437OooO0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2, Function1<? super Animator, Unit> function3, Function1<? super Animator, Unit> function4) {
        this.f45434OooO0Oo = function1;
        this.f45436OooO0o0 = function2;
        this.f45435OooO0o = function3;
        this.f45437OooO0oO = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45435OooO0o;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45436OooO0o0;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45437OooO0oO;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Function1<Animator, Unit> function1 = this.f45434OooO0Oo;
        if (function1 != null) {
            function1.invoke(animation);
        }
    }
}
