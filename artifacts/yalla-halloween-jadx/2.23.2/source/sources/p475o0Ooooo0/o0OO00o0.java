package p475o0Ooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OO00o0 f48056OooO0Oo = new o0OO00o0();

    public o0OO00o0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        Intrinsics.checkNotNull(num2);
        oo000o0OooO00o.OooO0oO(num2.intValue(), "currWealthLevel");
        return Unit.INSTANCE;
    }
}
