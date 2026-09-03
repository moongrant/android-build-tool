package p449o0Ooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p351o0OOOo0O.OooO;
import p351o0OOOo0O.OooOO0;
import p528o0o0OOOo.oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46418OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o000OO00 o000oo01) {
        super(1);
        this.f46418OooO0Oo = o000oo01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            oOO0.OooO0o(null, 3);
            OooOO0 oooOO0OooO00o = OooO.OooO0O0().OooO00o();
            o000OO00 o000oo01 = this.f46418OooO0Oo;
            oooOO0OooO00o.OooOOOo(o000oo01.f46408OooOO0O.f58492OooOOO0.getProgress());
            o000oo01.OooOO0();
        }
        return Unit.INSTANCE;
    }
}
