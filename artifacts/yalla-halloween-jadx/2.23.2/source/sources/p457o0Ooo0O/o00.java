package p457o0Ooo0O;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f47646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f47647OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00(Function1<? super Long, Unit> function1, MutableState<Float> mutableState) {
        super(0);
        this.f47646OooO0Oo = function1;
        this.f47647OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Long, Unit> function1 = this.f47646OooO0Oo;
        if (function1 != null) {
            function1.invoke(Long.valueOf(((long) this.f47647OooO0o0.getValue().floatValue()) * ((long) 1000)));
        }
        return Unit.INSTANCE;
    }
}
