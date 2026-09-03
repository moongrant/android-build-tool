package p031OoooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o0O00O0o;
import p028Oooo0o0.o0O0O0O;
import p043OooooO0.o00O0000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00O0o f2554Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function3<o0O0O0O, oOO00O, Integer, Unit> f2555Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f2556Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0(o0O00O0o o0o00o0o, Function3<? super o0O0O0O, ? super oOO00O, ? super Integer, Unit> function3, int i) {
        super(2);
        this.f2554Oooo0o = o0o00o0o;
        this.f2555Oooo0oO = function3;
        this.f2556Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            o000O0O0.OooO00o(((o00) ooo00o2.OooOO0o(o00O0000.f2862OooO00o)).f2606OooOO0O, o00O0000.OooO00o(ooo00o2, -630330208, new OooO(this.f2554Oooo0o, this.f2555Oooo0oO, this.f2556Oooo0oo)), ooo00o2, 48);
        }
        return Unit.INSTANCE;
    }
}
