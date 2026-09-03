package p047Oooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f4095Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f4096Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        super(1);
        this.f4095Oooo0o = function1;
        this.f4096Oooo0oO = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f4095Oooo0o.invoke(state);
        this.f4096Oooo0oO.invoke(state);
        return Unit.INSTANCE;
    }
}
