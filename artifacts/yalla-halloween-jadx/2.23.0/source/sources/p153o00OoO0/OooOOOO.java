package p153o00OoO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;
import o000O0.OooOO0;
import o000O00O.o00O00;
import o000O00O.o0OO00O;
import o000O00O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<?> f38139OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooO0O0<?> oooO0O0) {
        super(0);
        this.f38139OooO0Oo = oooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        OooOO0 oooOO1 = this.f38139OooO0Oo.f34329OooO0O0;
        oooOO1.getClass();
        o0OO00O o0oo00o2 = oo0o0Oo.f34666OooO00o;
        if (o0oo00o2 != null) {
            z = o0oo00o2.OooO0O0(3);
        }
        if (z) {
            o0oo00o2.OooO00o(3, "Retry signal received");
        }
        o00O00 o00o01 = oooOO1.f7374OooO0Oo;
        if (o00o01 != null) {
            o00o01.OooO00o();
        }
        return Unit.INSTANCE;
    }
}
