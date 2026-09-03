package p497o0o00OoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f49830OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49831OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O00O(Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.f49830OooO0Oo = function1;
        this.f49831OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Integer, Unit> function1 = this.f49830OooO0Oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f49831OooO0o0));
        }
        return Unit.INSTANCE;
    }
}
