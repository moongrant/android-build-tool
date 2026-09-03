package p519o0o0O0OO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f52683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52684OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oOo0O0(Function1<? super Integer, Unit> function1, MutableState<Boolean> mutableState) {
        super(0);
        this.f52683OooO0Oo = function1;
        this.f52684OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f52684OooO0o0.setValue(Boolean.FALSE);
        Function1<Integer, Unit> function1 = this.f52683OooO0Oo;
        if (function1 != null) {
            function1.invoke(0);
        }
        return Unit.INSTANCE;
    }
}
