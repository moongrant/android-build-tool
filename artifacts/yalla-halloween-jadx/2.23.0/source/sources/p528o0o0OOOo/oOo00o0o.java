package p528o0o0OOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f54383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f54384OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOo00o0o(int i, Function1<? super Integer, Unit> function1) {
        super(0);
        this.f54383OooO0Oo = i;
        this.f54384OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f54383OooO0Oo != 0) {
            this.f54384OooO0o0.invoke(0);
        }
        return Unit.INSTANCE;
    }
}
