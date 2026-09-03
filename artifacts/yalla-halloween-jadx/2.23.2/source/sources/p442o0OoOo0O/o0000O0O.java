package p442o0OoOo0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p139o00OOOo0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f47245OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o000OO o000oo2) {
        super(1);
        this.f47245OooO0Oo = o000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            o000OO o000oo2 = this.f47245OooO0Oo;
            OooOO0O.OooO0O0(o000oo2.f47270OooO00o, new o0000O0(o000oo2));
        }
        return Unit.INSTANCE;
    }
}
