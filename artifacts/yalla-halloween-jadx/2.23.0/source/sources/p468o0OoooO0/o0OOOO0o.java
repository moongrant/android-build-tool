package p468o0OoooO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OOo000.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o extends Lambda implements Function1<OooOO0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<OooOO0O, Unit> f46937OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OOOO0o(Function1<? super OooOO0O, Unit> function1) {
        super(1);
        this.f46937OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOO0O oooOO0O) {
        OooOO0O state = oooOO0O;
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<OooOO0O, Unit> function1 = this.f46937OooO0Oo;
        if (function1 != null) {
            function1.invoke(state);
        }
        return Unit.INSTANCE;
    }
}
