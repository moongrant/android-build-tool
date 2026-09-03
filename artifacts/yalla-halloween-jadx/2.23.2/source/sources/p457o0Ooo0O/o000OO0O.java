package p457o0Ooo0O;

import androidx.compose.runtime.MutableFloatState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f47715OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f47716OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f47717OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO0O(Function1<? super Long, Unit> function1, MutableFloatState mutableFloatState, Function1<? super Integer, Unit> function2) {
        super(0);
        this.f47715OooO0Oo = function1;
        this.f47717OooO0o0 = mutableFloatState;
        this.f47716OooO0o = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Long, Unit> function1 = this.f47715OooO0Oo;
        if (function1 != null) {
            function1.invoke(Long.valueOf((long) (this.f47717OooO0o0.getValue().floatValue() * 1000)));
        }
        Function1<Integer, Unit> function2 = this.f47716OooO0o;
        if (function2 != null) {
            function2.invoke(2);
        }
        return Unit.INSTANCE;
    }
}
