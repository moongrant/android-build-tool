package p511o0o0O;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51001OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(o00000OO o00000oo2) {
        super(1);
        this.f51001OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        o00000OO o00000oo2 = this.f51001OooO0Oo;
        o00000oo2.f50983Oooo000 = false;
        o00000oo2.OooO0o(true);
        return Unit.INSTANCE;
    }
}
