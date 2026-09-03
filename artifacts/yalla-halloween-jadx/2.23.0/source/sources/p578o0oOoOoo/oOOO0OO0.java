package p578o0oOoOoo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56472OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f56473OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOOO0OO0(MutableState<Boolean> mutableState, Function1<? super Integer, Unit> function1) {
        super(0);
        this.f56472OooO0Oo = mutableState;
        this.f56473OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f56472OooO0Oo.setValue(Boolean.FALSE);
        Function1<Integer, Unit> function1 = this.f56473OooO0o0;
        if (function1 != null) {
            function1.invoke(1);
        }
        return Unit.INSTANCE;
    }
}
