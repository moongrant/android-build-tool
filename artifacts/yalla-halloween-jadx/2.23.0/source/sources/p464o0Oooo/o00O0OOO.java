package p464o0Oooo;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0OOO f46814OooO0Oo = new o00O0OOO();

    public o00O0OOO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        o00Oo0.OooO00o().OooO0oO(pair2.getFirst().intValue(), "kaVipState");
        o00Oo0.OooO00o().OooO0oO(pair2.getSecond().intValue(), "kaVipLevel");
        return Unit.INSTANCE;
    }
}
