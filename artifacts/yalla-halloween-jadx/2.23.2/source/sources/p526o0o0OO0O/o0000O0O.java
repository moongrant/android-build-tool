package p526o0o0OO0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0.OooO00o f53288OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o0000O0.OooO00o oooO00o) {
        super(1);
        this.f53288OooO0Oo = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it1 = str;
        Intrinsics.checkNotNullParameter(it1, "it1");
        Function1<? super String, Unit> function1 = this.f53288OooO0Oo.f53282OooOOOo;
        if (function1 != null) {
            function1.invoke(it1);
        }
        return Unit.INSTANCE;
    }
}
