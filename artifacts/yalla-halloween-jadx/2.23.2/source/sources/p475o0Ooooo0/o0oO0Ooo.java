package p475o0Ooooo0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0oO0Ooo f48070OooO0Oo = new o0oO0Ooo();

    public o0oO0Ooo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
        Pair<? extends Boolean, ? extends Integer> pair2 = pair;
        o00Ooo.OooO00o().OooO0o("coinIsFrozen", pair2.getFirst().booleanValue());
        o00Ooo.OooO00o().OooO0oO(pair2.getSecond().intValue(), "debtAmount");
        return Unit.INSTANCE;
    }
}
