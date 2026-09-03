package p618o0oo0o0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends Lambda implements Function1<List<? extends String>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f48589Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OOo(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.f48589Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends String> list) {
        List<? extends String> onGranted = list;
        Intrinsics.checkNotNullParameter(onGranted, "$this$onGranted");
        Function1<Boolean, Unit> function1 = this.f48589Oooo0o;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
