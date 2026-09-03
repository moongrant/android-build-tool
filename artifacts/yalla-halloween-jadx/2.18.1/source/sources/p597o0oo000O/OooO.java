package p597o0oo000O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import p042Ooooo0o.o000O0O0;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Lambda implements Function1<oo0oOO0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<oo0oOO0> f47634Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(o0O00OO<oo0oOO0> o0o00oo2) {
        super(1);
        this.f47634Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oo0oOO0 oo0ooo0) {
        oo0oOO0 it = oo0ooo0;
        Intrinsics.checkNotNullParameter(it, "it");
        String strValueOf = String.valueOf(RangesKt.coerceIn(o000Oo0.OooO0OO(it.f27236OooO00o.f26756Oooo0o, 0), 0, 500));
        o0O00OO<oo0oOO0> o0o00oo2 = this.f47634Oooo0o;
        int length = strValueOf.length();
        o0o00oo2.setValue(new oo0oOO0(strValueOf, o000O0O0.OooO00o(length, length), 4));
        return Unit.INSTANCE;
    }
}
