package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O extends Lambda implements Function1<p191o00o0O.o0Oo0oo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow<Unit> f641Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(MutableSharedFlow<Unit> mutableSharedFlow) {
        super(1);
        this.f641Oooo0o = mutableSharedFlow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p191o00o0O.o0Oo0oo o0oo0oo2) {
        p191o00o0O.o0Oo0oo drawBehind = o0oo0oo2;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        MutableSharedFlow<Unit> mutableSharedFlow = this.f641Oooo0o;
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        return unit;
    }
}
