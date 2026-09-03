package p457o0Ooo0O;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47706OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f47707OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0Oo(MutableState<Boolean> mutableState, Function1<? super Integer, Unit> function1) {
        super(0);
        this.f47706OooO0Oo = mutableState;
        this.f47707OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47706OooO0Oo.setValue(Boolean.FALSE);
        Function1<Integer, Unit> function1 = this.f47707OooO0o0;
        if (function1 != null) {
            function1.invoke(1);
        }
        return Unit.INSTANCE;
    }
}
