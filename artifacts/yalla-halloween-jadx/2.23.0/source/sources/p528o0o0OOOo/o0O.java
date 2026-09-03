package p528o0o0OOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f53702OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O(Function1<? super Integer, Unit> function1) {
        super(1);
        this.f53702OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Function1<Integer, Unit> function1 = this.f53702OooO0Oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
