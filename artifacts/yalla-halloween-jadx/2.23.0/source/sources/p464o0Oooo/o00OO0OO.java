package p464o0Oooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OO0OO f46819OooO0Oo = new o00OO0OO();

    public o00OO0OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long it = l;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o00oooOooO00o.OooO0oo(it.longValue(), "nextWealthLevelExperience");
        return Unit.INSTANCE;
    }
}
