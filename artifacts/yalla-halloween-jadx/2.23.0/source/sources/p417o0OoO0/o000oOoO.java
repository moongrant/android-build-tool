package p417o0OoO0;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p520o0o0O0oo.b7;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45519OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(b7 b7Var) {
        super(1);
        this.f45519OooO0Oo = b7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        Animator animator2 = animator;
        Function1<Animator, Unit> function1 = this.f45519OooO0Oo;
        if (function1 != null) {
            function1.invoke(animator2);
        }
        return Unit.INSTANCE;
    }
}
