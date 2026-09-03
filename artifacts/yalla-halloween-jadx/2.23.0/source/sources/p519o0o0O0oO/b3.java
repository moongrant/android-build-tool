package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52177OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f52178OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(0);
        this.f52177OooO0Oo = mutableState;
        this.f52178OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00Oo0.OooO().OooOOO0(this.f52177OooO0Oo.getValue().booleanValue());
        this.f52178OooO0o0.invoke();
        return Unit.INSTANCE;
    }
}
