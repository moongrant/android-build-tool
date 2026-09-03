package p031OoooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f2690Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f2691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f2692Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0(Function2<? super oOO00O, ? super Integer, Unit> function2, Function2<? super oOO00O, ? super Integer, Unit> function3, int i) {
        super(2);
        this.f2690Oooo0o = function2;
        this.f2691Oooo0oO = function3;
        this.f2692Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o000O00.OooO0Oo(this.f2690Oooo0o, this.f2691Oooo0oO, ooo00o, this.f2692Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
