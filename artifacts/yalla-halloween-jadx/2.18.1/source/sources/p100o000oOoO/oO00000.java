package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oO00000 extends Lambda implements Function2<Object, Unit, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f29687Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(Function1<Object, Unit> function1) {
        super(2);
        this.f29687Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f29687Oooo0o.invoke(obj);
        return Unit.INSTANCE;
    }
}
