package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;
import p607o0oo0O0.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00ooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOOoOOO0 f46732Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo000o f46733Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46734Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(oOOoOOO0 ooooooo0, oo000o oo000oVar, int i) {
        super(2);
        this.f46732Oooo0o = ooooooo0;
        this.f46733Oooo0oO = oo000oVar;
        this.f46734Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOOoOOO0.OooO0oO(this.f46732Oooo0o, this.f46733Oooo0oO, ooo00o, this.f46734Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
