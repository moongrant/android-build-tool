package p528o0o0OOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f53754OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53755OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OO0O0(Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.f53754OooO0Oo = function1;
        this.f53755OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Integer, Unit> function1 = this.f53754OooO0Oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f53755OooO0o0));
        }
        return Unit.INSTANCE;
    }
}
