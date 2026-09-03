package p475o0Ooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOo000o0 f48120OooO0Oo = new oOo000o0();

    public oOo000o0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        Intrinsics.checkNotNull(num2);
        oo000o0OooO00o.OooO0oO(num2.intValue(), "visitorNum");
        return Unit.INSTANCE;
    }
}
