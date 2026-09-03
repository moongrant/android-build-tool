package p490o0o00OOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f48563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48564OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000(Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.f48563OooO0Oo = function1;
        this.f48564OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Integer, Unit> function1 = this.f48563OooO0Oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f48564OooO0o0));
        }
        return Unit.INSTANCE;
    }
}
