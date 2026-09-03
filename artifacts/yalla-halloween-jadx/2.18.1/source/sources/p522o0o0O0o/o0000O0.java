package p522o0o0O0o;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42968Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42969Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42970Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42971Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0(Function1<? super Animator, Unit> function1, Function1<? super Animator, Unit> function2, Function1<? super Animator, Unit> function3, Function1<? super Animator, Unit> function4) {
        this.f42969Oooo0o = function1;
        this.f42970Oooo0oO = function2;
        this.f42971Oooo0oo = function3;
        this.f42968Oooo = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Nullable Animator animator) {
        Function1<Animator, Unit> function1 = this.f42971Oooo0oo;
        if (function1 != null) {
            function1.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Nullable Animator animator) {
        Function1<Animator, Unit> function1 = this.f42970Oooo0oO;
        if (function1 != null) {
            function1.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@Nullable Animator animator) {
        Function1<Animator, Unit> function1 = this.f42968Oooo;
        if (function1 != null) {
            function1.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Nullable Animator animator) {
        Function1<Animator, Unit> function1 = this.f42969Oooo0o;
        if (function1 != null) {
            function1.invoke(animator);
        }
    }
}
