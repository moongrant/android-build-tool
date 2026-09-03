package p650o0ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OO0 f58645OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(o0O0OO0 o0o0oo0) {
        super(1);
        this.f58645OooO0Oo = o0o0oo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            Intrinsics.checkNotNull(str2);
            this.f58645OooO0Oo.OooOO0().f43869OooO0Oo.loadUrl(c1.OooO0OO(c1.OooO00o(str2), null));
        }
        return Unit.INSTANCE;
    }
}
