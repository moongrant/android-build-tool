package p201o00o0Ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p101o000oo.o0000O0;
import p101o000oo.o0000O0O;
import p101o000oo.oo0oOO0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<?> f39320OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(OooOOOO<?> oooOOOO) {
        super(0);
        this.f39320OooO0Oo = oooOOOO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        Oooo0 oooo0 = this.f39320OooO0Oo.f35805OooO0O0;
        oooo0.getClass();
        o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
        if (o0000o1 != null) {
            z = o0000o1.OooO0O0(3);
        }
        if (z) {
            o0000o1.OooO00o(3, "Retry signal received");
        }
        oo0oOO0 oo0ooo0 = oooo0.f10468OooO0Oo;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o();
        }
        return Unit.INSTANCE;
    }
}
