package p087o000Oooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p045OooooOo.o00O0O00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f28572Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f28573Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f28574Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0O0(o00O0O00 o00o0o01, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
        super(2);
        this.f28572Oooo0o = o00o0o01;
        this.f28573Oooo0oO = function2;
        this.f28574Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o000O0.OooO0O0(this.f28572Oooo0o, this.f28573Oooo0oO, ooo00o, this.f28574Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
