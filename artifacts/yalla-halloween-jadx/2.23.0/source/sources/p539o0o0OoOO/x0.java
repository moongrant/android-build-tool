package p539o0o0OoOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ y0 f55743OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var) {
        super(1);
        this.f55743OooO0Oo = y0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Function1<? super Integer, Unit> function1 = this.f55743OooO0Oo.f55750OooO0OO;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
