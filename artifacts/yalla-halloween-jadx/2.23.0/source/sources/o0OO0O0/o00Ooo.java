package o0OO0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f43114OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(oo000o oo000oVar) {
        super(0);
        this.f43114OooO0Oo = oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.f43114OooO0Oo.f43128OooOOO;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallback");
            function0 = null;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
