package p485o0o00O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f47972OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(o00OOOOo o00ooooo2) {
        super(0);
        this.f47972OooO0Oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OOOOo o00ooooo2 = this.f47972OooO0Oo;
        Function1<o00OOOOo, Unit> function1 = o00ooooo2.f47870OooOO0O;
        if (function1 != null) {
            function1.invoke(o00ooooo2);
        }
        return Unit.INSTANCE;
    }
}
