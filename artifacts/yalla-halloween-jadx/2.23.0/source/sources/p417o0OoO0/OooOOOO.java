package p417o0OoO0;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45443OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(Function1<? super Animator, Unit> function1) {
        super(1);
        this.f45443OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        Animator animator2 = animator;
        Function1<Animator, Unit> function1 = this.f45443OooO0Oo;
        if (function1 != null) {
            function1.invoke(animator2);
        }
        return Unit.INSTANCE;
    }
}
