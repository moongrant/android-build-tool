package p460o0Ooo0o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p363o0OOo00O.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function1<OooOOO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<OooOOO, Unit> f47786OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OO(Function1<? super OooOOO, Unit> function1) {
        super(1);
        this.f47786OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOOO oooOOO) {
        OooOOO state = oooOOO;
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<OooOOO, Unit> function1 = this.f47786OooO0Oo;
        if (function1 != null) {
            function1.invoke(state);
        }
        return Unit.INSTANCE;
    }
}
