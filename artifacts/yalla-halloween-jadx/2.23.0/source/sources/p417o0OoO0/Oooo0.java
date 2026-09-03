package p417o0OoO0;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p520o0o0O0oo.a7;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45446OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(a7 a7Var) {
        super(1);
        this.f45446OooO0Oo = a7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        Animator animator2 = animator;
        Function1<Animator, Unit> function1 = this.f45446OooO0Oo;
        if (function1 != null) {
            function1.invoke(animator2);
        }
        return Unit.INSTANCE;
    }
}
