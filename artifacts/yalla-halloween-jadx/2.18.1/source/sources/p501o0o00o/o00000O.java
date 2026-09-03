package p501o0o00o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f41447Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000O(Function1<? super Integer, Unit> function1) {
        super(1);
        this.f41447Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Function1<Integer, Unit> function1 = this.f41447Oooo0o;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
