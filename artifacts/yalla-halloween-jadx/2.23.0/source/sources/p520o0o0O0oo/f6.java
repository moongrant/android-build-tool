package p520o0o0O0oo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f6 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f53278OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(n8 n8Var) {
        super(1);
        this.f53278OooO0Oo = n8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Function1<Integer, Unit> function1 = this.f53278OooO0Oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
