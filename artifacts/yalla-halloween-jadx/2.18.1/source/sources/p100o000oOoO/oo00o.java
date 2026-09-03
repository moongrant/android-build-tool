package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o extends Lambda implements Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f29690Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f29691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f29692Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(Object obj, int i, int i2) {
        super(3);
        this.f29690Oooo0o = obj;
        this.f29691Oooo0oO = i;
        this.f29692Oooo0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O000<?> o00o001, o0OO0o00 o0oo0o01, o0OO000o o0oo000o) {
        o0OO0o00 o0oo0o02 = o0oo0o01;
        o0OO000o o0oo000o2 = o0oo000o;
        OooO00o.OooO0O0(o00o001, "<anonymous parameter 0>", o0oo0o02, "slots", o0oo000o2, "rememberManager");
        if (!Intrinsics.areEqual(this.f29690Oooo0o, o0oo0o02.Oooo0OO(this.f29691Oooo0oO, this.f29692Oooo0oo))) {
            oo0o0O0.OooO0Oo("Slot table is out of sync".toString());
            throw null;
        }
        o0oo000o2.OooO0OO((oo0oO0) this.f29690Oooo0o);
        o0oo0o02.Oooo00o(this.f29692Oooo0oo, oOO00O.OooO00o.f29689OooO0O0);
        return Unit.INSTANCE;
    }
}
