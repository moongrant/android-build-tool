package p475o0Ooooo0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0 extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO000O0 f48080OooO0Oo = new oO000O0();

    public oO000O0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        o00Ooo.OooO00o().OooO0oO(pair2.getFirst().intValue(), "kaVipState");
        o00Ooo.OooO00o().OooO0oO(pair2.getSecond().intValue(), "kaVipLevel");
        return Unit.INSTANCE;
    }
}
