package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0O extends Lambda implements Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO0O0 f29483Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f29484Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(o0OO0O0 o0oo0o1, o00oOoo o00oooo2) {
        super(3);
        this.f29483Oooo0o = o0oo0o1;
        this.f29484Oooo0oO = o00oooo2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O000<?> o00o001, o0OO0o00 o0oo0o01, o0OO000o o0oo000o) {
        o0OO0o00 slots = o0oo0o01;
        Intrinsics.checkNotNullParameter(o00o001, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(o0oo000o, "<anonymous parameter 2>");
        slots.OooO0o0();
        o0OO0O0 o0oo0o1 = this.f29483Oooo0o;
        slots.OooOo0o(o0oo0o1, this.f29484Oooo0oO.OooO0O0(o0oo0o1));
        slots.OooOO0O();
        return Unit.INSTANCE;
    }
}
