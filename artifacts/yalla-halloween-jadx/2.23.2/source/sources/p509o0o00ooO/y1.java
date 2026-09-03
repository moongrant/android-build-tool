package p509o0o00ooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f50886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f50887OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(int i, w1 w1Var) {
        super(0);
        this.f50886OooO0Oo = w1Var;
        this.f50887OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<? super Integer, Unit> function1 = this.f50886OooO0Oo.f50858OooOO0O;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f50887OooO0o0));
        }
        return Unit.INSTANCE;
    }
}
