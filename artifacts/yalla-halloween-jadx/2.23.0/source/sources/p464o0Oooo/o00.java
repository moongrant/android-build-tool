package p464o0Oooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00 f46668OooO0Oo = new o00();

    public o00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer it = num;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o00oooOooO00o.OooO0oO(it.intValue(), "followingNum");
        return Unit.INSTANCE;
    }
}
