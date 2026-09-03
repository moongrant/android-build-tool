package p464o0Oooo;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OO f46815OooO0Oo = new o00OO();

    public o00OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
        Pair<? extends Boolean, ? extends Integer> pair2 = pair;
        o00Oo0.OooO00o().OooO0o("vip", pair2.getFirst().booleanValue());
        o00Oo0.OooO00o().OooO0oO(pair2.getSecond().intValue(), "vipLevel");
        return Unit.INSTANCE;
    }
}
