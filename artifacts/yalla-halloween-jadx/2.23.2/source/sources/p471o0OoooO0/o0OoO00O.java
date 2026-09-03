package p471o0OoooO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p355o0OOOo0o.OooO;
import p355o0OOOo0o.OooO0o;
import p535o0o0Oo0.oO0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f47892OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(o0O000Oo o0o000oo2) {
        super(1);
        this.f47892OooO0Oo = o0o000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            oO0O00.OooO0o(null, 3);
            OooO oooOOooO00o = OooO0o.OooO0O0().OooO00o();
            o0O000Oo o0o000oo2 = this.f47892OooO0Oo;
            oooOOooO00o.OooOOo0(o0o000oo2.f47877OooOO0O.f44427OooOOO0.getProgress());
            o0o000oo2.OooOO0();
        }
        return Unit.INSTANCE;
    }
}
