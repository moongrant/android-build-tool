package p423o0OoO0OO;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p511o0o0O.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46621OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(o0000O00 o0000o00) {
        super(1);
        this.f46621OooO0Oo = o0000o00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        Animator animator2 = animator;
        Function1<Animator, Unit> function1 = this.f46621OooO0Oo;
        if (function1 != null) {
            function1.invoke(animator2);
        }
        return Unit.INSTANCE;
    }
}
