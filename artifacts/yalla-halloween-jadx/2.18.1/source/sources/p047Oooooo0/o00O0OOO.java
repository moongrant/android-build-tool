package p047Oooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OOO extends Lambda implements Function1<o00O0O0, oo00o> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<o00O0O0, oo00o> f4098Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0OOO(Function1<? super o00O0O0, oo00o> function1) {
        super(1);
        this.f4098Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final oo00o invoke(o00O0O0 o00o0o0) {
        o00O0O0 invalid = o00o0o0;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        oo00o oo00oVarInvoke = this.f4098Oooo0o.invoke(invalid);
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0oO(oo00oVarInvoke.OooO0Oo());
            Unit unit = Unit.INSTANCE;
        }
        return oo00oVarInvoke;
    }
}
