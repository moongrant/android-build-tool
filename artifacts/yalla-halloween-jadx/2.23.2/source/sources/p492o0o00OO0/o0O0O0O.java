package p492o0o00OO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f49294OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(o00OOO0 o00ooo1) {
        super(0);
        this.f49294OooO0Oo = o00ooo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OOO0 o00ooo1 = this.f49294OooO0Oo;
        Function1<o00OOO0, Unit> function1 = o00ooo1.f49187OooOO0O;
        if (function1 != null) {
            function1.invoke(o00ooo1);
        }
        return Unit.INSTANCE;
    }
}
